package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class OpenGlRenderer {
    private static final java.lang.String TAG = "OpenGlRenderer";
    private byte _hellAccFlag_;
    protected android.view.Surface mCurrentSurface;
    protected android.opengl.EGLConfig mEglConfig;
    protected java.lang.Thread mGlThread;
    protected final java.util.concurrent.atomic.AtomicBoolean mInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final java.util.Map<android.view.Surface, androidx.camera.core.processing.util.OutputSurface> mOutputSurfaceMap = new java.util.HashMap();
    protected android.opengl.EGLDisplay mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
    protected android.opengl.EGLContext mEglContext = android.opengl.EGL14.EGL_NO_CONTEXT;
    protected int[] mSurfaceAttrib = androidx.camera.core.processing.util.GLUtils.EMPTY_ATTRIBS;
    protected android.opengl.EGLSurface mTempSurface = android.opengl.EGL14.EGL_NO_SURFACE;
    protected java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.util.GLUtils.Program2D> mProgramHandles = java.util.Collections.emptyMap();
    protected androidx.camera.core.processing.util.GLUtils.Program2D mCurrentProgram = null;
    protected androidx.camera.core.processing.util.GLUtils.InputFormat mCurrentInputformat = androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN;
    private int mExternalTextureId = -1;

    private void activateExternalTexture(int i17) {
        android.opengl.GLES20.glActiveTexture(33984);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, i17);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
    }

    private void createEglContext(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder) {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.mEglDisplay = eglGetDisplay;
        if (java.util.Objects.equals(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            throw new java.lang.IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            throw new java.lang.IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.setEglVersion(iArr[0] + "." + iArr[1]);
        }
        int i17 = dynamicRange.is10BitHdr() ? 10 : 8;
        int[] iArr2 = {12324, i17, 12323, i17, 12322, i17, 12321, dynamicRange.is10BitHdr() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.is10BitHdr() ? 64 : 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, dynamicRange.is10BitHdr() ? -1 : 1, 12339, 5, 12344};
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.mEglDisplay, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.IllegalStateException("Unable to find a suitable EGLConfig");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = dynamicRange.is10BitHdr() ? 3 : 2;
        iArr3[2] = 12344;
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, iArr3, 0);
        androidx.camera.core.processing.util.GLUtils.checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eglCreateContext;
        android.opengl.EGL14.eglQueryContext(this.mEglDisplay, eglCreateContext, 12440, new int[1], 0);
    }

    private void createTempSurface() {
        android.opengl.EGLDisplay eGLDisplay = this.mEglDisplay;
        android.opengl.EGLConfig eGLConfig = this.mEglConfig;
        java.util.Objects.requireNonNull(eGLConfig);
        this.mTempSurface = androidx.camera.core.processing.util.GLUtils.createPBufferSurface(eGLDisplay, eGLConfig, 1, 1);
    }

    private m3.d getExtensionsBeforeInitialized(androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        try {
            createEglContext(dynamicRange, null);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
            java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(this.mEglDisplay, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new m3.d(glGetString, eglQueryString);
        } catch (java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.w(TAG, "Failed to get GL or EGL extensions: " + e17.getMessage(), e17);
            return new m3.d("", "");
        } finally {
            releaseInternal();
        }
    }

    private void releaseInternal() {
        java.util.Iterator<androidx.camera.core.processing.util.GLUtils.Program2D> it = this.mProgramHandles.values().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.mProgramHandles = java.util.Collections.emptyMap();
        this.mCurrentProgram = null;
        if (!java.util.Objects.equals(this.mEglDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            android.opengl.EGLDisplay eGLDisplay = this.mEglDisplay;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            for (androidx.camera.core.processing.util.OutputSurface outputSurface : this.mOutputSurfaceMap.values()) {
                if (!java.util.Objects.equals(outputSurface.getEglSurface(), android.opengl.EGL14.EGL_NO_SURFACE) && !android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, outputSurface.getEglSurface())) {
                    androidx.camera.core.processing.util.GLUtils.checkEglErrorOrLog("eglDestroySurface");
                }
            }
            this.mOutputSurfaceMap.clear();
            if (!java.util.Objects.equals(this.mTempSurface, android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
                this.mTempSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (!java.util.Objects.equals(this.mEglContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                android.opengl.EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.mExternalTextureId = -1;
        this.mCurrentInputformat = androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN;
        this.mCurrentSurface = null;
        this.mGlThread = null;
    }

    public androidx.camera.core.processing.util.OutputSurface createOutputSurfaceInternal(android.view.Surface surface) {
        try {
            android.opengl.EGLDisplay eGLDisplay = this.mEglDisplay;
            android.opengl.EGLConfig eGLConfig = this.mEglConfig;
            java.util.Objects.requireNonNull(eGLConfig);
            android.opengl.EGLSurface createWindowSurface = androidx.camera.core.processing.util.GLUtils.createWindowSurface(eGLDisplay, eGLConfig, surface, this.mSurfaceAttrib);
            android.util.Size surfaceSize = androidx.camera.core.processing.util.GLUtils.getSurfaceSize(this.mEglDisplay, createWindowSurface);
            return androidx.camera.core.processing.util.OutputSurface.of(createWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight());
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            androidx.camera.core.Logger.w(TAG, "Failed to create EGL surface: " + e17.getMessage(), e17);
            return null;
        }
    }

    public androidx.camera.core.processing.util.OutputSurface getOutSurfaceOrThrow(android.view.Surface surface) {
        m3.h.e(this.mOutputSurfaceMap.containsKey(surface), "The surface is not registered.");
        androidx.camera.core.processing.util.OutputSurface outputSurface = this.mOutputSurfaceMap.get(surface);
        java.util.Objects.requireNonNull(outputSurface);
        return outputSurface;
    }

    public int getTextureName() {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return this.mExternalTextureId;
    }

    public androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange) {
        return init(dynamicRange, java.util.Collections.emptyMap());
    }

    public void makeCurrent(android.opengl.EGLSurface eGLSurface) {
        this.mEglDisplay.getClass();
        this.mEglContext.getClass();
        if (!android.opengl.EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new java.lang.IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void registerOutputSurface(android.view.Surface surface) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mOutputSurfaceMap.containsKey(surface)) {
            return;
        }
        this.mOutputSurfaceMap.put(surface, androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE);
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
            releaseInternal();
        }
    }

    public void removeOutputSurfaceInternal(android.view.Surface surface, boolean z17) {
        if (this.mCurrentSurface == surface) {
            this.mCurrentSurface = null;
            makeCurrent(this.mTempSurface);
        }
        androidx.camera.core.processing.util.OutputSurface remove = z17 ? this.mOutputSurfaceMap.remove(surface) : this.mOutputSurfaceMap.put(surface, androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE);
        if (remove == null || remove == androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE) {
            return;
        }
        try {
            android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, remove.getEglSurface());
        } catch (java.lang.RuntimeException e17) {
            androidx.camera.core.Logger.w(TAG, "Failed to destroy EGL surface: " + e17.getMessage(), e17);
        }
    }

    public void render(long j17, float[] fArr, android.view.Surface surface) {
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
            android.opengl.GLES20.glViewport(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
            android.opengl.GLES20.glScissor(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
        }
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j17);
        if (android.opengl.EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        androidx.camera.core.Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }

    public void setInputFormat(androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mCurrentInputformat != inputFormat) {
            this.mCurrentInputformat = inputFormat;
            useAndConfigureProgramWithTexture(this.mExternalTextureId);
        }
    }

    public android.graphics.Bitmap snapshot(android.util.Size size, float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        snapshot(allocateDirect, size, fArr);
        int width = size.getWidth();
        int height = size.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/processing/OpenGlRenderer", com.tencent.mm.plugin.appbrand.j0.f78445f, "(Landroid/util/Size;[F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/processing/OpenGlRenderer", com.tencent.mm.plugin.appbrand.j0.f78445f, "(Landroid/util/Size;[F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public void unregisterOutputSurface(android.view.Surface surface) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        removeOutputSurfaceInternal(surface, true);
    }

    public void useAndConfigureProgramWithTexture(int i17) {
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = this.mProgramHandles.get(this.mCurrentInputformat);
        if (program2D == null) {
            throw new java.lang.IllegalStateException("Unable to configure program for input format: " + this.mCurrentInputformat);
        }
        if (this.mCurrentProgram != program2D) {
            this.mCurrentProgram = program2D;
            program2D.use();
            java.util.Objects.toString(this.mCurrentInputformat);
            java.util.Objects.toString(this.mCurrentProgram);
        }
        activateExternalTexture(i17);
    }

    public androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder = androidx.camera.core.processing.util.GraphicDeviceInfo.builder();
        try {
            if (dynamicRange.is10BitHdr()) {
                m3.d extensionsBeforeInitialized = getExtensionsBeforeInitialized(dynamicRange);
                java.lang.String str = (java.lang.String) extensionsBeforeInitialized.f323092a;
                str.getClass();
                java.lang.String str2 = (java.lang.String) extensionsBeforeInitialized.f323093b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    androidx.camera.core.Logger.w(TAG, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = androidx.camera.core.DynamicRange.SDR;
                }
                this.mSurfaceAttrib = androidx.camera.core.processing.util.GLUtils.chooseSurfaceAttrib(str2, dynamicRange);
                builder.setGlExtensions(str);
                builder.setEglExtensions(str2);
            }
            createEglContext(dynamicRange, builder);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            builder.setGlVersion(androidx.camera.core.processing.util.GLUtils.getGlVersionNumber());
            this.mProgramHandles = androidx.camera.core.processing.util.GLUtils.createPrograms(dynamicRange, map);
            int createTexture = androidx.camera.core.processing.util.GLUtils.createTexture();
            this.mExternalTextureId = createTexture;
            useAndConfigureProgramWithTexture(createTexture);
            this.mGlThread = java.lang.Thread.currentThread();
            this.mInitialized.set(true);
            return builder.build();
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            releaseInternal();
            throw e17;
        }
    }

    private void snapshot(java.nio.ByteBuffer byteBuffer, android.util.Size size, float[] fArr) {
        m3.h.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        m3.h.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int generateTexture = androidx.camera.core.processing.util.GLUtils.generateTexture();
        android.opengl.GLES20.glActiveTexture(33985);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(3553, generateTexture);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, size.getWidth(), size.getHeight(), 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glTexImage2D");
        android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        int generateFbo = androidx.camera.core.processing.util.GLUtils.generateFbo();
        android.opengl.GLES20.glBindFramebuffer(36160, generateFbo);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindFramebuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, generateTexture, 0);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glFramebufferTexture2D");
        android.opengl.GLES20.glActiveTexture(33984);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, this.mExternalTextureId);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
        this.mCurrentSurface = null;
        android.opengl.GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        android.opengl.GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = this.mCurrentProgram;
        program2D.getClass();
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, byteBuffer);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glReadPixels");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        androidx.camera.core.processing.util.GLUtils.deleteTexture(generateTexture);
        androidx.camera.core.processing.util.GLUtils.deleteFbo(generateFbo);
        activateExternalTexture(this.mExternalTextureId);
    }
}
