package dw3;

/* loaded from: classes8.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.on0 f325825d;

    public x(r45.on0 on0Var) {
        this.f325825d = on0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.on0 on0Var = this.f325825d;
        if (!on0Var.f463902i) {
            dw3.c0.f325715a.j(on0Var.f463904n);
        }
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
            boolean z17 = on0Var.f463900g;
            if (z17 || (!z17 && on0Var.f463903m && on0Var.f463901h)) {
                java.lang.String h17 = ai3.d.h("mp4");
                if (!on0Var.f463900g) {
                    h17 = q75.c.b("mp4");
                }
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, on0Var.f463905o, h17);
                q75.c.f(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
    }
}
