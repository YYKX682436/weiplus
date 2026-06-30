package cw2;

/* loaded from: classes14.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305577f;

    public u5(cw2.z5 z5Var, int i17, int i18) {
        this.f305575d = z5Var;
        this.f305576e = i17;
        this.f305577f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.SurfaceTexture surfaceTexture;
        cw2.b6 b6Var = this.f305575d.f305668c;
        if (b6Var == null || (surfaceTexture = b6Var.f305129b) == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(this.f305576e, this.f305577f);
    }
}
