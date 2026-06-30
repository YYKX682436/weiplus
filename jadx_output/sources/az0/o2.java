package az0;

/* loaded from: classes14.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f15765f;

    public o2(int i17, int i18, android.view.Surface surface) {
        this.f15763d = i17;
        this.f15764e = i18;
        this.f15765f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f15991d;
        az0.w2.f16007w = this.f15763d;
        az0.w2.f16006v = this.f15764e;
        if (az0.w2.f15994g != null && az0.w2.f15998n == null) {
            int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
            int[] iArr2 = new int[1];
            rs0.h hVar = az0.w2.f15994g;
            if (!android.opengl.EGL14.eglChooseConfig(hVar != null ? hVar.f399292a : null, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaasMJCaptureSessionPreload", "eglChooseConfig failed");
            }
            az0.w2.f15998n = android.opengl.EGL14.eglCreateWindowSurface(hVar != null ? hVar.f399292a : null, eGLConfigArr[0], this.f15765f, new int[]{12344}, 0);
            az0.w2.f16002r = true;
            az0.w2.f16003s = az0.m2.f15686e;
        }
    }
}
