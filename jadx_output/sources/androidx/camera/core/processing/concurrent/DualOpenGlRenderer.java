package androidx.camera.core.processing.concurrent;

/* loaded from: classes14.dex */
public final class DualOpenGlRenderer extends androidx.camera.core.processing.OpenGlRenderer {
    private static final java.lang.String TAG = "DualOpenGlRenderer";
    private final androidx.camera.core.LayoutSettings mPrimaryLayoutSettings;
    private final androidx.camera.core.LayoutSettings mSecondaryLayoutSettings;
    private int mPrimaryExternalTextureId = -1;
    private int mSecondaryExternalTextureId = -1;

    public DualOpenGlRenderer(androidx.camera.core.LayoutSettings layoutSettings, androidx.camera.core.LayoutSettings layoutSettings2) {
        this.mPrimaryLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
    }

    private static float[] getTransformMatrix(android.util.Size size, android.util.Size size2, androidx.camera.core.LayoutSettings layoutSettings) {
        float[] create4x4IdentityMatrix = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        float[] create4x4IdentityMatrix2 = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        float[] create4x4IdentityMatrix3 = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        android.opengl.Matrix.scaleM(create4x4IdentityMatrix, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        android.opengl.Matrix.translateM(create4x4IdentityMatrix2, 0, layoutSettings.getOffsetX() / layoutSettings.getWidth(), layoutSettings.getOffsetY() / layoutSettings.getHeight(), 0.0f);
        android.opengl.Matrix.multiplyMM(create4x4IdentityMatrix3, 0, create4x4IdentityMatrix, 0, create4x4IdentityMatrix2, 0);
        return create4x4IdentityMatrix3;
    }

    private void renderInternal(androidx.camera.core.processing.util.OutputSurface outputSurface, androidx.camera.core.SurfaceOutput surfaceOutput, android.graphics.SurfaceTexture surfaceTexture, androidx.camera.core.LayoutSettings layoutSettings, int i17, boolean z17) {
        useAndConfigureProgramWithTexture(i17);
        android.opengl.GLES20.glViewport(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        android.opengl.GLES20.glScissor(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.updateTransformMatrix(fArr2, fArr, z17);
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr2);
        }
        program2D.updateTransformMatrix(getTransformMatrix(new android.util.Size((int) (outputSurface.getWidth() * layoutSettings.getWidth()), (int) (outputSurface.getHeight() * layoutSettings.getHeight())), new android.util.Size(outputSurface.getWidth(), outputSurface.getHeight()), layoutSettings));
        program2D.updateAlpha(layoutSettings.getAlpha());
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.GLES20.glDisable(3042);
    }

    public int getTextureName(boolean z17) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return z17 ? this.mPrimaryExternalTextureId : this.mSecondaryExternalTextureId;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        androidx.camera.core.processing.util.GraphicDeviceInfo init = super.init(dynamicRange, map);
        this.mPrimaryExternalTextureId = androidx.camera.core.processing.util.GLUtils.createTexture();
        this.mSecondaryExternalTextureId = androidx.camera.core.processing.util.GLUtils.createTexture();
        return init;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public void release() {
        super.release();
        this.mPrimaryExternalTextureId = -1;
        this.mSecondaryExternalTextureId = -1;
    }

    public void render(long j17, android.view.Surface surface, androidx.camera.core.SurfaceOutput surfaceOutput, android.graphics.SurfaceTexture surfaceTexture, android.graphics.SurfaceTexture surfaceTexture2) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        androidx.camera.core.processing.util.OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        if (surface != this.mCurrentSurface) {
            makeCurrent(outSurfaceOrThrow.getEglSurface());
            this.mCurrentSurface = surface;
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        androidx.camera.core.processing.util.OutputSurface outputSurface = outSurfaceOrThrow;
        renderInternal(outputSurface, surfaceOutput, surfaceTexture, this.mPrimaryLayoutSettings, this.mPrimaryExternalTextureId, true);
        renderInternal(outputSurface, surfaceOutput, surfaceTexture2, this.mSecondaryLayoutSettings, this.mSecondaryExternalTextureId, true);
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j17);
        if (android.opengl.EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        androidx.camera.core.Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }
}
