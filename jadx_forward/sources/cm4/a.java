package cm4;

/* loaded from: classes11.dex */
public final class a extends sl4.g {
    public boolean A;

    public a() {
        super(bw5.eq0.TingMusic);
    }

    public final boolean A0(boolean z17) {
        if (!this.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball, not isBackground");
            return false;
        }
        if (C0()) {
            if (u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall has ball and ignore");
                return true;
            }
            zk4.f.f555064a = true;
            return e0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d.A || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallHelper", "checkAndAddFloatBall can not add floatball and STOP!");
            y0();
        }
        this.f490796r = false;
        this.f490793o = null;
        this.f490801w = null;
        return false;
    }

    public final bw5.lp0 B0() {
        b66.n a17;
        b66.g a18 = b66.i.f99700d.a(bw5.eq0.TingMusic);
        bw5.lp0 g17 = (a18 == null || (a17 = ((b66.i) a18).a()) == null) ? null : ((b66.q) a17).g();
        if (!(g17 == null)) {
            return g17;
        }
        bw5.fr0 fr0Var = new bw5.fr0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        android.os.Bundle bundle = c12886x91aa2b6d != null ? c12886x91aa2b6d.G : null;
        if (bundle != null && bundle.containsKey("key_state_float_ball_context_data")) {
            fr0Var.mo11468x92b714fd(this.f174665d.G.getByteArray("key_state_float_ball_context_data"));
        }
        boolean[] zArr = fr0Var.f109032n;
        if (zArr[3] || zArr[1]) {
            return fr0Var.b();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicFloatBallHelper", "tingTaskSnapshot do not has PlayingItem and TapeItem");
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
            wl4.w.f528637a.a(bw5.eq0.TingMusic, null).a();
            return;
        }
        bw5.nc0 l17 = B0.d().l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
        java.lang.String m12571x74292566 = l17.m12571x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12571x74292566, "getAppId(...)");
        int i17 = l17.f112152m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1131;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m12571x74292566)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingMusicFloatBallHelper", "not find appLauncher");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicFloatBallHelper", "openAppBrand, launch:%s#%s", m12571x74292566, java.lang.Integer.valueOf(i17));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, m12571x74292566, i17, -1, null, c12559xbdae8559);
    }

    @Override // sl4.g
    public bl4.a f0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e(context);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            android.os.Bundle extra = c12886x91aa2b6d.G;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extra, "extra");
            extra.putBoolean("key_state_float_ball_need_persist", true);
            if (C0()) {
                android.os.Bundle bundle = this.f174665d.G;
                com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
                b66.g gVar = c26845xac206036 != null ? (b66.g) c26845xac206036.m106052x32c52b() : null;
                jm4.n2 n2Var = gVar instanceof jm4.n2 ? (jm4.n2) gVar : null;
                jm4.g3 f17 = n2Var != null ? ((jm4.p2) n2Var).f() : null;
                bundle.putByteArray("key_state_float_ball_context_data", f17 != null ? p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169372x21b4adec(((jm4.h3) f17).m105978x2737f10()) : null);
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
        if (eVar.f373639c == 0) {
            eVar.f373639c = 1002;
        }
        if (z8Var.uj() != null) {
            jm4.g3 g3Var = zk4.l.f555073c;
            bw5.lp0 uj6 = z8Var.uj();
            java.lang.String b17 = uj6 != null ? uj6.b() : null;
            if (b17 == null) {
                b17 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingServicesImpl", "playCurrentTask clientId: ".concat(b17));
            if (g3Var != null) {
                p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169698x21b46ffc(((b66.q) g3Var).m105978x2737f10(), b17);
                return;
            }
            return;
        }
        bw5.fr0 fr0Var = new bw5.fr0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        android.os.Bundle bundle = c12886x91aa2b6d != null ? c12886x91aa2b6d.G : null;
        if (bundle != null && bundle.containsKey("key_state_float_ball_context_data")) {
            fr0Var.mo11468x92b714fd(this.f174665d.G.getByteArray("key_state_float_ball_context_data"));
        }
        boolean[] zArr = fr0Var.f109032n;
        if (!zArr[3] && !zArr[1]) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMusicFloatBallHelper", "tingTaskSnapshot do not has PlayingItem and TapeItem");
        } else {
            this.f490796r = true;
            z8Var.tj(fr0Var, eVar);
        }
    }
}
