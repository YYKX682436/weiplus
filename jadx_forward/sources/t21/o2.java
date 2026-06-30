package t21;

@j95.b
/* loaded from: classes12.dex */
public class o2 extends i95.w {

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f496382m;

    /* renamed from: d, reason: collision with root package name */
    public volatile t21.w2 f496383d;

    /* renamed from: e, reason: collision with root package name */
    public volatile t21.k3 f496384e;

    /* renamed from: f, reason: collision with root package name */
    public volatile t21.p3 f496385f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p947xba6de98f.l3 f496386g = null;

    /* renamed from: h, reason: collision with root package name */
    public t21.c2 f496387h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.s2 f496388i = new t21.m2(this);

    public static t21.o2 Bi() {
        return (t21.o2) i95.n0.c(t21.o2.class);
    }

    public static com.p314xaae8f345.mm.p947xba6de98f.l3 Di() {
        gm0.j1.b().c();
        if (Bi().f496386g == null) {
            Bi().f496386g = new com.p314xaae8f345.mm.p947xba6de98f.l3();
        }
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        if (com.p314xaae8f345.mm.p947xba6de98f.s1.cj().f152591v == null) {
            sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
            com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = Bi().f496386g;
            ((rx.a) a0Var).getClass();
            com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
            cj6.f152591v = l3Var;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
            objArr[1] = java.lang.Integer.valueOf(l3Var != null ? l3Var.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "set cdn online video callback hash[%d] onlineVideoCallback[%d]", objArr);
        }
        return Bi().f496386g;
    }

    public static t21.c2 Ni() {
        gm0.j1.b().c();
        if (Bi().f496387h == null) {
            Bi().f496387h = new t21.c2();
        }
        return Bi().f496387h;
    }

    public static synchronized t21.w2 Ui() {
        t21.w2 w2Var;
        synchronized (t21.o2.class) {
            if (!gm0.j1.a()) {
                throw new c01.c();
            }
            if (Bi().f496383d == null) {
                Bi().f496383d = new t21.w2(gm0.j1.u().f354686f);
                Bi().f496383d.b(Zi(), android.os.Looper.getMainLooper());
            }
            w2Var = Bi().f496383d;
        }
        return w2Var;
    }

    public static t21.k3 Vi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Bi().f496384e == null) {
            Bi().f496384e = new t21.k3(gm0.j1.u().f354686f);
        }
        return Bi().f496384e;
    }

    public static t21.p3 Zi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Bi().f496385f == null) {
            Bi().f496385f = new t21.p3();
        }
        return Bi().f496385f;
    }

    public static boolean aj(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        wi();
        if (j17 > 0) {
            f496382m.mo50297x7c4d7ca2(runnable, j17);
            return true;
        }
        f496382m.mo50293x3498a0(runnable);
        return true;
    }

    public static boolean bj(java.lang.Runnable runnable) {
        if (runnable == null) {
            return true;
        }
        wi();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f496382m;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideo", "short video decoder handler is null");
            return false;
        }
        n3Var.mo50300x3fa464aa(runnable);
        return true;
    }

    public static void wi() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f496382m;
        if (n3Var == null || n3Var.mo50287xb9a7fe99()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("Short-Video-Decoder-Thread-" + java.lang.System.currentTimeMillis());
            f496382m = n3Var2;
            n3Var2.m77789xc5a5549d(false);
        }
    }

    public java.lang.String Ai() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("video/");
        return com.p314xaae8f345.mm.vfs.w6.i(sb6.toString(), true);
    }

    public java.lang.String Ri() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("subvideo/");
        return com.p314xaae8f345.mm.vfs.w6.i(sb6.toString(), true);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideo", "%d onAccountPostReset ", java.lang.Integer.valueOf(hashCode()));
        this.f496388i.m43071x58998cd();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f496382m;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        gm0.j1.e().j(new t21.n2(this));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreVideo", "%d onAccountRelease ", java.lang.Integer.valueOf(hashCode()));
        this.f496388i.m43072x2efc64();
        try {
            if (Bi().f496385f != null) {
                t21.p3 p3Var = Bi().f496385f;
                p3Var.f496409s = 0;
                if (p3Var.f496411u != null) {
                    gm0.j1.d().d(p3Var.f496411u);
                }
                if (p3Var.f496412v != null) {
                    gm0.j1.d().d(p3Var.f496412v);
                }
                p3Var.f496414x.clear();
            }
            Bi().getClass();
            if (Bi().f496387h != null) {
                t21.c2 c2Var = Bi().f496387h;
                c2Var.g();
                c2Var.f496253a.clear();
            }
            if (Bi().f496386g != null) {
                com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = Bi().f496386g;
                l3Var.getClass();
                gm0.j1.d().q(379, l3Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreVideo", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f496382m;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        try {
            t21.p3 Zi = Zi();
            Zi.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "quitVideoSendThread");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = Zi.f496397d;
            if (n3Var2 != null) {
                try {
                    n3Var2.mo50299x35224f();
                    Zi.f496398e = false;
                    Zi.f496397d = null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoService", "quitVideoSendThread error: %s", e18.getMessage());
                }
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreVideo", "onAccountRelease, quitVideoSendThread error: %s", e19.getMessage());
        }
        ei3.x.f334720d.c();
    }
}
