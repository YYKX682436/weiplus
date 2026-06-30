package cm4;

/* loaded from: classes11.dex */
public final class a extends sl4.g {
    public boolean A;

    public a() {
        super(bw5.eq0.TingMusic);
    }

    public final boolean A0(boolean z17) {
        if (!this.A) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball, not isBackground");
            return false;
        }
        if (C0()) {
            if (u()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall has ball and ignore");
                return true;
            }
            zk4.f.f473531a = true;
            return e0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball");
        if (!com.tencent.mm.plugin.ting.TingFlutterActivity.A || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball and STOP!");
            y0();
        }
        this.f409263r = false;
        this.f409260o = null;
        this.f409268w = null;
        return false;
    }

    public final bw5.lp0 B0() {
        b66.n a17;
        b66.g a18 = b66.i.f18167d.a(bw5.eq0.TingMusic);
        bw5.lp0 g17 = (a18 == null || (a17 = ((b66.i) a18).a()) == null) ? null : ((b66.q) a17).g();
        if (!(g17 == null)) {
            return g17;
        }
        bw5.fr0 fr0Var = new bw5.fr0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        android.os.Bundle bundle = ballInfo != null ? ballInfo.G : null;
        if (bundle != null && bundle.containsKey("key_state_float_ball_context_data")) {
            fr0Var.parseFrom(this.f93132d.G.getByteArray("key_state_float_ball_context_data"));
        }
        boolean[] zArr = fr0Var.f27499n;
        if (zArr[3] || zArr[1]) {
            return fr0Var.b();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicFloatBallHelper", "tingTaskSnapshot do not has PlayingItem and TapeItem");
        return g17;
    }

    public boolean C0() {
        b66.n j07 = j0();
        if (j07 == null) {
            return false;
        }
        int i17 = j07.i();
        if (!(i17 == 2)) {
            if (!(i17 == 1)) {
                if (!(i17 == 3)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // sl4.a
    public void a() {
        bw5.lp0 B0 = B0();
        boolean z17 = false;
        if (B0 != null && rk4.j5.h(B0)) {
            z17 = true;
        }
        if (!z17) {
            wl4.w.f447104a.a(bw5.eq0.TingMusic, null).a();
            return;
        }
        bw5.nc0 l17 = B0.d().l();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
        java.lang.String appId = l17.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        int i17 = l17.f30619m;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1131;
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMusicFloatBallHelper", "not find appLauncher");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicFloatBallHelper", "openAppBrand, launch:%s#%s", appId, java.lang.Integer.valueOf(i17));
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, null, appId, i17, -1, null, appBrandStatObject);
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView(context);
    }

    @Override // sl4.g
    public java.lang.String g0() {
        return "TingMusicFloatBall";
    }

    @Override // sl4.g, sl4.a
    public void h() {
        super.h();
        this.A = false;
    }

    @Override // sl4.g
    public int h0() {
        return 64;
    }

    @Override // sl4.g, sl4.a
    public void i(boolean z17) {
        if (this.A) {
            return;
        }
        this.A = true;
        A0(z17);
    }

    @Override // sl4.g
    public void s0() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            android.os.Bundle extra = ballInfo.G;
            kotlin.jvm.internal.o.f(extra, "extra");
            extra.putBoolean("key_state_float_ball_need_persist", true);
            if (C0()) {
                android.os.Bundle bundle = this.f93132d.G;
                com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
                b66.g gVar = weakPtr != null ? (b66.g) weakPtr.lock() : null;
                jm4.n2 n2Var = gVar instanceof jm4.n2 ? (jm4.n2) gVar : null;
                jm4.g3 f17 = n2Var != null ? ((jm4.p2) n2Var).f() : null;
                bundle.putByteArray("key_state_float_ball_context_data", f17 != null ? urgen.ur_0025.UR_C8FE.UR_9ACE(((jm4.h3) f17).getCppPointer()) : null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sl4.g
    public void t0() {
        rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
        if (z8Var.fj() || z8Var.ij()) {
            super.t0();
            return;
        }
        il4.e eVar = new il4.e(null, 0, z8Var.Ni(), false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        if (eVar.f292106c == 0) {
            eVar.f292106c = 1002;
        }
        if (z8Var.uj() != null) {
            jm4.g3 g3Var = zk4.l.f473540c;
            bw5.lp0 uj6 = z8Var.uj();
            java.lang.String b17 = uj6 != null ? uj6.b() : null;
            if (b17 == null) {
                b17 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TingServicesImpl", "playCurrentTask clientId: ".concat(b17));
            if (g3Var != null) {
                urgen.ur_2BA9.UR_C8FE.UR_9146(((b66.q) g3Var).getCppPointer(), b17);
                return;
            }
            return;
        }
        bw5.fr0 fr0Var = new bw5.fr0();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        android.os.Bundle bundle = ballInfo != null ? ballInfo.G : null;
        if (bundle != null && bundle.containsKey("key_state_float_ball_context_data")) {
            fr0Var.parseFrom(this.f93132d.G.getByteArray("key_state_float_ball_context_data"));
        }
        boolean[] zArr = fr0Var.f27499n;
        if (!zArr[3] && !zArr[1]) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMusicFloatBallHelper", "tingTaskSnapshot do not has PlayingItem and TapeItem");
        } else {
            this.f409263r = true;
            z8Var.tj(fr0Var, eVar);
        }
    }
}
