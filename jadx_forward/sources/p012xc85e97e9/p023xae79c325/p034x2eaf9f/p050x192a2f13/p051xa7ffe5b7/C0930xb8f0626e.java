package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7;

/* renamed from: androidx.camera.core.processing.concurrent.DualOpenGlRenderer */
/* loaded from: classes14.dex */
public final class C0930xb8f0626e extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0901x43b7f6d2 {
    private static final java.lang.String TAG = "DualOpenGlRenderer";

    /* renamed from: mPrimaryLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2228xb36345a2;

    /* renamed from: mSecondaryLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2230x2d9ba0d4;

    /* renamed from: mPrimaryExternalTextureId */
    private int f2227x677977b6 = -1;

    /* renamed from: mSecondaryExternalTextureId */
    private int f2229x4bb5f744 = -1;

    public C0930xb8f0626e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2) {
        this.f2228xb36345a2 = c0543xcd8e1d8d;
        this.f2230x2d9ba0d4 = c0543xcd8e1d8d2;
    }

    /* renamed from: getTransformMatrix */
    private static float[] m6398xb1778017(android.util.Size size, android.util.Size size2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d) {
        float[] m6465x27895eb3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6465x27895eb3();
        float[] m6465x27895eb32 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6465x27895eb3();
        float[] m6465x27895eb33 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6465x27895eb3();
        android.opengl.Matrix.scaleM(m6465x27895eb3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        android.opengl.Matrix.translateM(m6465x27895eb32, 0, c0543xcd8e1d8d.m4662xe18269ef() / c0543xcd8e1d8d.m4664x755bd410(), c0543xcd8e1d8d.m4663xe18269f0() / c0543xcd8e1d8d.m4661x1c4fb41d(), 0.0f);
        android.opengl.Matrix.multiplyMM(m6465x27895eb33, 0, m6465x27895eb3, 0, m6465x27895eb32, 0);
        return m6465x27895eb33;
    }

    /* renamed from: renderInternal */
    private void m6399xb36d7673(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c abstractC0952x4073a84c, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee, android.graphics.SurfaceTexture surfaceTexture, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, int i17, boolean z17) {
        m6317x52f41ce7(i17);
        android.opengl.GLES20.glViewport(0, 0, abstractC0952x4073a84c.mo6450x755bd410(), abstractC0952x4073a84c.mo6449x1c4fb41d());
        android.opengl.GLES20.glScissor(0, 0, abstractC0952x4073a84c.mo6450x755bd410(), abstractC0952x4073a84c.mo6449x1c4fb41d());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        interfaceC0567x42142bee.mo4773x7b86244(fArr2, fArr, z17);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D program2D = this.f2164x957e9898;
        program2D.getClass();
        if (program2D instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) program2D).m6491x3221e73(fArr2);
        }
        program2D.m6488x7b86244(m6398xb1778017(new android.util.Size((int) (abstractC0952x4073a84c.mo6450x755bd410() * c0543xcd8e1d8d.m4664x755bd410()), (int) (abstractC0952x4073a84c.mo6449x1c4fb41d() * c0543xcd8e1d8d.m4661x1c4fb41d())), new android.util.Size(abstractC0952x4073a84c.mo6450x755bd410(), abstractC0952x4073a84c.mo6449x1c4fb41d()), c0543xcd8e1d8d));
        program2D.m6487xdc279e15(c0543xcd8e1d8d.m4660x742757a8());
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glDrawArrays");
        android.opengl.GLES20.glDisable(3042);
    }

    /* renamed from: getTextureName */
    public int m6400x3a030510(boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        return z17 ? this.f2227x677977b6 : this.f2229x4bb5f744;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0901x43b7f6d2
    /* renamed from: init */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c mo6308x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c mo6308x316510 = super.mo6308x316510(c0491x2bb48c5e, map);
        this.f2227x677977b6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6469x3164f87f();
        this.f2229x4bb5f744 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6469x3164f87f();
        return mo6308x316510;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0901x43b7f6d2
    /* renamed from: release */
    public void mo6311x41012807() {
        super.mo6311x41012807();
        this.f2227x677977b6 = -1;
        this.f2229x4bb5f744 = -1;
    }

    /* renamed from: render */
    public void m6401xc84b4196(long j17, android.view.Surface surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee, android.graphics.SurfaceTexture surfaceTexture, android.graphics.SurfaceTexture surfaceTexture2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c m6305x157e7f8e = m6305x157e7f8e(surface);
        if (m6305x157e7f8e == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2276x86a2258d) {
            m6305x157e7f8e = m6304x8278dbad(surface);
            if (m6305x157e7f8e == null) {
                return;
            } else {
                this.f2172xab8297dd.put(surface, m6305x157e7f8e);
            }
        }
        if (surface != this.f2165x397966c1) {
            m6309x900967ab(m6305x157e7f8e.mo6448xbe847539());
            this.f2165x397966c1 = surface;
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c abstractC0952x4073a84c = m6305x157e7f8e;
        m6399xb36d7673(abstractC0952x4073a84c, interfaceC0567x42142bee, surfaceTexture, this.f2228xb36345a2, this.f2227x677977b6, true);
        m6399xb36d7673(abstractC0952x4073a84c, interfaceC0567x42142bee, surfaceTexture2, this.f2230x2d9ba0d4, this.f2229x4bb5f744, true);
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.f2168x7e90e1a5, m6305x157e7f8e.mo6448xbe847539(), j17);
        if (android.opengl.EGL14.eglSwapBuffers(this.f2168x7e90e1a5, m6305x157e7f8e.mo6448xbe847539())) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to swap buffers with EGL error: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        m6312x442b0925(surface, false);
    }
}
