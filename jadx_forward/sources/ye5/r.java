package ye5;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f542813d;

    public r(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f542813d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f341552a;
        java.lang.String z07 = this.f542813d.z0();
        if (z07 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.r0(z07), "MicroMsg.VideoSendReporter");
    }
}
