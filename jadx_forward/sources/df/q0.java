package df;

/* loaded from: classes15.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.r0 f311072d;

    public q0(df.r0 r0Var) {
        this.f311072d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            df.r0 r0Var = this.f311072d;
            com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95763xf0c9f339(r0Var.f311076b, r0Var.f311075a);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "attachFlutterEngine retry also failed", e17);
        }
    }
}
