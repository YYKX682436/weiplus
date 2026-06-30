package az0;

/* loaded from: classes14.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f97296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f97298f;

    public o2(int i17, int i18, android.view.Surface surface) {
        this.f97296d = i17;
        this.f97297e = i18;
        this.f97298f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        az0.w2 w2Var = az0.w2.f97524d;
        az0.w2.f97540w = this.f97296d;
        az0.w2.f97539v = this.f97297e;
        if (az0.w2.f97527g != null && az0.w2.f97531n == null) {
            int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
            int[] iArr2 = new int[1];
            rs0.h hVar = az0.w2.f97527g;
            if (!android.opengl.EGL14.eglChooseConfig(hVar != null ? hVar.f480825a : null, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasMJCaptureSessionPreload", "eglChooseConfig failed");
            }
            az0.w2.f97531n = android.opengl.EGL14.eglCreateWindowSurface(hVar != null ? hVar.f480825a : null, eGLConfigArr[0], this.f97298f, new int[]{12344}, 0);
            az0.w2.f97535r = true;
            az0.w2.f97536s = az0.m2.f97219e;
        }
    }
}
