package sl4;

/* loaded from: classes11.dex */
public abstract class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d implements sl4.a {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f490792n;

    /* renamed from: o, reason: collision with root package name */
    public bl4.b f490793o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 f490794p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f490795q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f490796r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f490797s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f490798t;

    /* renamed from: u, reason: collision with root package name */
    public final qp1.v f490799u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f490800v;

    /* renamed from: w, reason: collision with root package name */
    public bl4.a f490801w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f490802x;

    /* renamed from: y, reason: collision with root package name */
    public final sl4.b f490803y;

    /* renamed from: z, reason: collision with root package name */
    public final sl4.e f490804z;

    public g(bw5.eq0 appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f490792n = "MicroMsg.TingBaseFloatBallHelper." + appId.name();
        this.f490795q = true;
        this.f490797s = true;
        this.f490799u = new qp1.v();
        this.f490800v = jz5.h.b(sl4.f.f490791d);
        this.f490802x = jz5.h.b(new sl4.d(this));
        this.f490803y = new sl4.b(this);
        this.f490804z = new sl4.e(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).f333758e;
        boolean g17 = activityC18699x6096e65d == null ? false : ep1.m.g(activityC18699x6096e65d.getIntent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f490792n, "onReceivedFinishWhenSwitchBallEvent fromFloatBall: " + g17);
        if (g17) {
            ef0.h3 h3Var = (ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class));
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18699x6096e65d activityC18699x6096e65d2 = h3Var.f333758e;
            if (activityC18699x6096e65d2 != null) {
                activityC18699x6096e65d2.finish();
            }
            h3Var.Bi(null);
        }
    }

    @Override // sl4.a
    public void c(bl4.b info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f490793o = info;
        if (k0()) {
            s0();
        }
        if (this.f490796r) {
            if (k0()) {
                Z(info.f103268d);
                z0(info.f103267c);
                g();
                return;
            }
            if (this.f490801w == null) {
                this.f490801w = f0();
            }
            bl4.a aVar = this.f490801w;
            if (aVar != null) {
                aVar.a(info);
            }
            z0(info.f103267c);
            java.lang.String str = info.f103269e;
            this.f174665d.f174588p.f174601f = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f174665d.f174588p.f174599d, str)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = this.f174665d.f174588p;
            ballBlurInfo.f174599d = str;
            R(ballBlurInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e0() {
        java.lang.String str;
        b66.a e17;
        b66.a e18;
        int i17 = 0;
        if (u() && this.f490796r) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTingFloatBall type: ");
        bl4.b bVar = this.f490793o;
        sb6.append(bVar != null ? bVar.f103265a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f490792n, sb6.toString());
        if (k0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            bl4.b bVar2 = this.f490793o;
            c12886x91aa2b6d.f174596x = bVar2 != null ? bVar2.f103268d : null;
            c12886x91aa2b6d.H = 2;
            Q(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
            bl4.b bVar3 = this.f490793o;
            ballButtonInfo.f174602d = v0(bVar3 != null ? bVar3.f103267c : 0);
            ballButtonInfo.f174603e = this.f490795q;
            ballButtonInfo.f174614s = m0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
            c12886x91aa2b6d2.f174578J = false;
            c12886x91aa2b6d2.I = true;
            c12886x91aa2b6d2.N = l0();
            this.f174665d.f174591s = this.f490797s;
        } else {
            Q(3);
            if (this.f490801w == null) {
                this.f490801w = f0();
            }
            bl4.a aVar = this.f490801w;
            if (aVar != 0) {
                this.f174665d.f174583h = (android.view.View) aVar;
                aVar.a(this.f490793o);
                aVar.mo10729xe6095fa6((android.view.View.OnClickListener) ((jz5.n) this.f490802x).mo141623x754a37bb());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = this.f174665d;
            if (c12886x91aa2b6d3.f174584i == null) {
                c12886x91aa2b6d3.f174584i = new android.graphics.Point();
            }
            this.f174665d.f174584i.x = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f562042zy);
            this.f174665d.f174584i.y = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f562041zx);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d4 = this.f174665d;
            c12886x91aa2b6d4.f174578J = false;
            c12886x91aa2b6d4.I = true;
            c12886x91aa2b6d4.F = true;
            c12886x91aa2b6d4.L = false;
            c12886x91aa2b6d4.f174591s = this.f490797s;
            c12886x91aa2b6d4.H = 2048;
            c12886x91aa2b6d4.f174586n = 2;
            bl4.b bVar4 = this.f490793o;
            boolean v07 = v0(bVar4 != null ? bVar4.f103267c : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo2 = c12886x91aa2b6d4.f174587o;
            ballButtonInfo2.f174602d = v07;
            ballButtonInfo2.f174603e = this.f490795q;
            ballButtonInfo2.f174606h = true;
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            ballButtonInfo2.f174605g = a17;
            ballButtonInfo2.f174608m = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = this.f174665d.f174588p;
            ballBlurInfo.f174601f = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
            bl4.b bVar5 = this.f490793o;
            if (bVar5 == null || (str = bVar5.f103269e) == null) {
                str = "";
            }
            ballBlurInfo.f174599d = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallCollapseInfo ballCollapseInfo = this.f174665d.f174589q;
            ballCollapseInfo.f174615d = ((java.lang.Boolean) ((jz5.n) ((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).f333716d).mo141623x754a37bb()).booleanValue();
            ballCollapseInfo.f174616e = ((java.lang.Number) ((jz5.n) ((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).f333717e).mo141623x754a37bb()).intValue() * 1000;
        }
        j();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = this.f490796r;
        qp1.v vVar = this.f490799u;
        if (z17) {
            vVar.a(gp1.w.f355725m, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f355723h, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f355721f, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f355720e, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            vVar.a(gp1.w.f355719d, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f355720e, java.lang.Long.valueOf(currentTimeMillis));
            bl4.b bVar6 = this.f490793o;
            if (bVar6 != null) {
                qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
                b66.n j07 = j0();
                int d17 = (j07 == null || (e18 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e18).d();
                int i18 = bVar6.f103267c;
                bl4.b bVar7 = this.f490793o;
                bw5.lp0 lp0Var = bVar7 != null ? bVar7.f103270f : null;
                bw5.o50 o50Var = bVar7 != null ? bVar7.f103271g : null;
                ((ef0.e3) r8Var).getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                bm4.a.b(hashMap, null, d17, null, lp0Var, o50Var);
                bm4.a.a(hashMap, i18, lp0Var, o50Var);
                hashMap.toString();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_floating_win_produce", null, hashMap, 5, false);
            }
        }
        bl4.b bVar8 = this.f490793o;
        if (bVar8 != null) {
            qk.r8 r8Var2 = (qk.r8) i95.n0.c(qk.r8.class);
            b66.n j08 = j0();
            if (j08 != null && (e17 = ((b66.q) j08).e()) != null) {
                i17 = ((b66.c) e17).d();
            }
            int i19 = i17;
            int i27 = bVar8.f103267c;
            bl4.b bVar9 = this.f490793o;
            bw5.lp0 lp0Var2 = bVar9 != null ? bVar9.f103270f : null;
            bw5.o50 o50Var2 = bVar9 != null ? bVar9.f103271g : null;
            ((ef0.e3) r8Var2).getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("view_id", "tyt_interior_floating_win");
            bm4.a.b(hashMap2, bw5.ar0.TingScene_Minimization, i19, null, lp0Var2, o50Var2);
            bm4.a.a(hashMap2, i27, lp0Var2, o50Var2);
            hashMap2.toString();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap2, 5, false);
        }
        this.f490796r = true;
        return true;
    }

    @Override // sl4.a
    public void f(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate playAppRef: ");
        sb6.append(c26845xac206036 != null ? c26845xac206036.m106051x8cdac1b() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f490792n, sb6.toString());
        this.f490794p = c26845xac206036;
        b(h0(), g0());
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(h0(), this.f490804z);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().e(h0(), this.f490803y);
    }

    public abstract bl4.a f0();

    public abstract java.lang.String g0();

    public void h() {
        w0(false, qk.z9.f445948g);
    }

    public abstract int h0();

    public void i(boolean z17) {
        if (this.f490793o == null) {
            return;
        }
        e0();
    }

    public final b66.g i0() {
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
        if (c26845xac206036 != null) {
            return (b66.g) c26845xac206036.m106052x32c52b();
        }
        return null;
    }

    public final b66.n j0() {
        b66.g i07 = i0();
        if (i07 != null) {
            return ((b66.i) i07).a();
        }
        return null;
    }

    public final boolean k0() {
        return ((java.lang.Boolean) ((jz5.n) this.f490800v).mo141623x754a37bb()).booleanValue();
    }

    public boolean l0() {
        return true;
    }

    public boolean m0() {
        return false;
    }

    public void n0() {
    }

    public void o0(qp1.j0 permissionCheckResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissionCheckResult, "permissionCheckResult");
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }

    public void s0() {
    }

    public void t0() {
        bl4.b bVar = this.f490793o;
        if (bVar != null) {
            boolean a17 = il4.m.a(bVar.f103267c);
            java.lang.String str = this.f490792n;
            if (a17) {
                x0(qk.y9.f445916f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause ");
                bl4.b bVar2 = this.f490793o;
                sb6.append(bVar2 != null ? bVar2.f103266b : null);
                sb6.append(", playApp: ");
                b66.g i07 = i0();
                sb6.append(i07 != null ? java.lang.Integer.valueOf(i07.hashCode()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                b66.n j07 = j0();
                if (j07 != null) {
                    b66.m.a(j07, null, 1, null);
                    return;
                }
                return;
            }
            if (bVar.f103267c == 3) {
                x0(qk.y9.f445918h);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resume ");
                bl4.b bVar3 = this.f490793o;
                sb7.append(bVar3 != null ? bVar3.f103266b : null);
                sb7.append(", playApp: ");
                b66.g i08 = i0();
                sb7.append(i08 != null ? java.lang.Integer.valueOf(i08.hashCode()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                b66.n j08 = j0();
                if (j08 != null) {
                    b66.m.b(j08, null, 1, null);
                    return;
                }
                return;
            }
            x0(qk.y9.f445918h);
            bl4.b bVar4 = this.f490793o;
            if (bVar4 != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("play id: ");
                sb8.append(bVar4.f103266b);
                sb8.append(", playApp: ");
                b66.g i09 = i0();
                sb8.append(i09 != null ? java.lang.Integer.valueOf(i09.hashCode()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                b66.n j09 = j0();
                if (j09 != null) {
                    java.lang.String clientId = bVar4.f103266b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
                    p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169698x21b46ffc(((b66.q) j09).m105978x2737f10(), clientId);
                }
            }
        }
    }

    public void u0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2) {
    }

    public boolean v0(int i17) {
        return il4.m.a(i17);
    }

    public void w0(boolean z17, qk.z9 closeType) {
        b66.a e17;
        b66.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeType, "closeType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f490792n, "removeTingFloatBall stop: " + z17 + ", closeType: " + closeType);
        d();
        if (z17) {
            y0();
            com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f490794p;
            if (c26845xac206036 != null && (gVar = (b66.g) c26845xac206036.m106052x32c52b()) != null) {
                p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169635x21b0711c(((b66.i) gVar).m105978x2737f10());
            }
            gp1.w wVar = gp1.w.f355726n;
            qp1.v vVar = this.f490799u;
            vVar.a(wVar, null);
            java.util.Objects.toString(closeType);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallTimeCollector", "dump currentAction: " + vVar.f447287i + ", createTime: " + vVar.f447279a + ", userCollapseTime: " + vVar.f447282d + ", autoCollapseTime: " + vVar.f447281c + ", expandTime: " + vVar.f447283e);
            bl4.b bVar = this.f490793o;
            if (bVar != null) {
                qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
                b66.n j07 = j0();
                int d17 = (j07 == null || (e17 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e17).d();
                int i17 = bVar.f103267c;
                java.lang.Integer num = this.f490798t;
                bl4.b bVar2 = this.f490793o;
                bw5.lp0 lp0Var = bVar2 != null ? bVar2.f103270f : null;
                bw5.o50 o50Var = bVar2 != null ? bVar2.f103271g : null;
                ((ef0.e3) r8Var).getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                bm4.a.b(hashMap, bw5.ar0.TingScene_Minimization, d17, java.lang.Integer.valueOf(i17), lp0Var, o50Var);
                int i18 = closeType.f445950d;
                hashMap.put("close_type", java.lang.Integer.valueOf(i18));
                qk.z9 z9Var = qk.z9.f445946e;
                if (i18 == 4) {
                    hashMap.put("preempt_reason", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                }
                hashMap.put("floating_win_stay_time", java.lang.Long.valueOf(vVar.f447279a));
                hashMap.put("voluntarily_welt_stay_time", java.lang.Long.valueOf(vVar.f447281c));
                hashMap.put("manual_welt_stay_time", java.lang.Long.valueOf(vVar.f447282d));
                hashMap.put("unfold_stay_time", java.lang.Long.valueOf(vVar.f447283e));
                hashMap.toString();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_close_floating_window", null, hashMap, 5, false);
            }
            this.f490798t = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallTimeCollector", "reset");
            vVar.f447287i = null;
            vVar.f447279a = 0L;
            vVar.f447280b = 0L;
            vVar.f447281c = 0L;
            vVar.f447282d = 0L;
            vVar.f447283e = 0L;
            vVar.f447284f = 0L;
            vVar.f447285g = 0L;
            vVar.f447286h = 0L;
            this.f490796r = false;
            this.f490793o = null;
            this.f490801w = null;
        }
    }

    public final void x0(qk.y9 clickPosition) {
        b66.a e17;
        java.util.Objects.toString(clickPosition);
        bl4.b bVar = this.f490793o;
        if (bVar != null) {
            qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
            b66.n j07 = j0();
            int d17 = (j07 == null || (e17 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e17).d();
            int i17 = bVar.f103267c;
            bl4.b bVar2 = this.f490793o;
            bw5.lp0 lp0Var = bVar2 != null ? bVar2.f103270f : null;
            bw5.o50 o50Var = bVar2 != null ? bVar2.f103271g : null;
            ((ef0.e3) r8Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickPosition, "clickPosition");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "tyt_interior_floating_win");
            hashMap.put("click_location", java.lang.Integer.valueOf(clickPosition.f445920d));
            bm4.a.b(hashMap, bw5.ar0.TingScene_Minimization, d17, null, lp0Var, o50Var);
            bm4.a.a(hashMap, i17, lp0Var, o50Var);
            hashMap.toString();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        }
    }

    public final void y0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop ");
        bl4.b bVar = this.f490793o;
        sb6.append(bVar != null ? bVar.f103266b : null);
        sb6.append(", playApp: ");
        b66.g i07 = i0();
        sb6.append(i07 != null ? java.lang.Integer.valueOf(i07.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f490792n, sb6.toString());
        b66.n j07 = j0();
        if (j07 != null) {
            ((b66.q) j07).m9898x360802();
        }
    }

    public final void z0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
        ballButtonInfo.f174602d = v0(i17);
        ballButtonInfo.f174603e = this.f490795q;
        ballButtonInfo.f174606h = true;
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        ballButtonInfo.f174605g = a17;
        ballButtonInfo.f174608m = a17;
        S(this.f174665d.f174587o);
    }
}
