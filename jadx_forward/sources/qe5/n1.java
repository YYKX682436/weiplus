package qe5;

/* loaded from: classes12.dex */
public final class n1 extends wm3.a implements bt3.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f443688d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f443689e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443690f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f443691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f443688d = jz5.h.b(new qe5.m1(this));
        jz5.l lVar = new jz5.l(2, com.p314xaae8f345.mm.ui.p2731xc84c5534.m.f291226f);
        jz5.l lVar2 = new jz5.l(5, com.p314xaae8f345.mm.ui.p2731xc84c5534.m.f291225e);
        com.p314xaae8f345.mm.ui.p2731xc84c5534.m mVar = com.p314xaae8f345.mm.ui.p2731xc84c5534.m.f291227g;
        this.f443691g = kz5.c1.k(lVar, lVar2, new jz5.l(0, mVar), new jz5.l(3, mVar), new jz5.l(4, mVar));
    }

    @Override // bt3.q0
    public void D6(bt3.l0 l0Var) {
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final em.d0 U6() {
        return (em.d0) ((jz5.n) this.f443688d).mo141623x754a37bb();
    }

    public final boolean V6() {
        sc5.g gVar = sc5.g.f488105a;
        kd5.e T6 = T6();
        java.lang.String str = T6 != null ? T6.f388426x : null;
        kd5.e T62 = T6();
        java.lang.String str2 = T62 != null ? T62.C : null;
        if (gVar.c(str)) {
            return true ^ (str2 == null || str2.length() == 0) ? sc5.g.f488107c : sc5.g.f488106b;
        }
        return false;
    }

    public final void W6(int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((qe5.z) pf5.z.f435481a.a(activity).a(qe5.z.class)).getClass();
    }

    public final void X6(int i17) {
        if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(3)) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.j(i17));
                return;
            }
            return;
        }
        kd5.e T6 = T6();
        boolean z17 = false;
        if (T6 != null && T6.f388417o) {
            z17 = true;
        }
        if (!z17) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new kd5.j(i17));
                return;
            }
            return;
        }
        android.widget.Button g17 = U6().g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getDownloadOpenBtn(...)");
        com.p314xaae8f345.mm.ui.kk.d(g17, i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
        U6().g().setVisibility(i17);
        U6().m().setVisibility(i17);
    }

    public final void Y6(int i17, boolean z17) {
        int i18 = 8;
        if (i17 == 8 && U6().f().getVisibility() == 8) {
            W6(4);
        } else if (i17 == 0 && U6().f().getVisibility() == 4) {
            W6(8);
        }
        if (i17 != U6().v().getVisibility()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePageLogicUIC", "setRoundProgressBar %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            U6().v().setVisibility(i17);
        }
        if (i17 == 0) {
            U6().v().setVisibility(0);
            U6().v().m82114x7d38f3f4(m80379x76847179().getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5 : com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
            kd5.e T6 = T6();
            U6().v().m82113x3ae760af(T6 != null ? T6.f388421s : 0);
        }
        U6().v().setOnClickListener(new qe5.l1(this, z17));
        android.widget.TextView q17 = U6().q();
        if (z17 && i17 == 0 && V6()) {
            i18 = 0;
        }
        q17.setVisibility(i18);
        b7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v35, types: [j75.f] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v37 */
    public final void Z6(kd5.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        qe5.z0 z0Var = new qe5.z0(this);
        em.d0 U6 = U6();
        qe5.x0 x0Var = z0Var.f443759a;
        x0Var.a(8);
        U6.b().setVisibility(8);
        U6.p().setVisibility(8);
        U6.t().setVisibility(8);
        U6.k().setVisibility(8);
        U6.u().setVisibility(8);
        U6.a().setVisibility(8);
        U6.h().setVisibility(8);
        U6.s().setVisibility(8);
        U6.r().setVisibility(8);
        U6.x().setVisibility(8);
        X6(8);
        Y6(8, true);
        int i17 = action.f388445b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePageLogicUIC", "handleState %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.cfb;
        switch (i17) {
            case 0:
                z0Var.a();
                break;
            case 1:
                em.d0 U62 = U6();
                U62.t().setVisibility(0);
                android.widget.TextView t17 = U62.t();
                kd5.e T6 = T6();
                oi3.g gVar = T6 != null ? T6.f388414i : null;
                if ((gVar != null && gVar.m75939xb282bd08(gVar.f427150d + 9) == 1) == false) {
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.cfa;
                }
                t17.setText(i18);
                U62.u().setVisibility(0);
                break;
            case 2:
                em.d0 U63 = U6();
                U63.t().setVisibility(0);
                U63.t().setText(com.p314xaae8f345.mm.R.C30867xcad56011.nhj);
                Y6(0, true);
                break;
            case 3:
            case 4:
                if (action.f388446c != 105) {
                    if (V6()) {
                        U6().p().setVisibility(0);
                        U6().k().setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nhp));
                    } else {
                        U6().k().setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.nho));
                    }
                    U6().k().setVisibility(0);
                    x0Var.a(0);
                    break;
                } else {
                    U6().x().setVisibility(0);
                    break;
                }
            case 5:
                kd5.e T62 = T6();
                x0Var.b(false, T62 != null ? T62.f388425w : null);
                break;
            case 6:
                kd5.e T63 = T6();
                java.lang.String str = T63 != null ? T63.f388426x : null;
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMimeTypeByExt(...)");
                if ((e17.length() > 0) != false) {
                    kd5.e T64 = T6();
                    java.lang.String str2 = T64 != null ? T64.f388425w : null;
                    if (!(str2 != null ? r26.n0.B(str2, ".apk", false) : false)) {
                        X6(0);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                        ((qe5.z) pf5.z.f435481a.a(activity).a(qe5.z.class)).U6();
                        j75.f Q6 = Q6();
                        if (Q6 != null) {
                            Q6.B3(new kd5.w());
                            break;
                        }
                    } else {
                        em.d0 U64 = U6();
                        U64.s().setVisibility(0);
                        U64.r().setVisibility(0);
                        break;
                    }
                }
                break;
            case 7:
                kd5.e T65 = T6();
                x0Var.b(true, T65 != null ? T65.f388425w : null);
                break;
            case 8:
                em.d0 U65 = U6();
                U65.t().setVisibility(0);
                android.widget.TextView t18 = U65.t();
                kd5.e T66 = T6();
                oi3.g gVar2 = T66 != null ? T66.f388414i : null;
                if ((gVar2 != null && gVar2.m75939xb282bd08(gVar2.f427150d + 9) == 1) == false) {
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.cfa;
                }
                t18.setText(i18);
                Y6(0, false);
                break;
            case 9:
                em.d0 U66 = U6();
                if (U66.x().getVisibility() != 0) {
                    U66.x().setVisibility(0);
                    android.widget.Button x17 = U66.x();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x17, "getUploadContinueBtn(...)");
                    com.p314xaae8f345.mm.ui.kk.d(x17, com.p314xaae8f345.mm.ui.zk.e(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu));
                }
                U66.x().setOnClickListener(new qe5.y0(this));
                break;
            default:
                z0Var.a();
                break;
        }
        a7();
        if (this.f443690f) {
            return;
        }
        this.f443690f = true;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.m mVar = (com.p314xaae8f345.mm.ui.p2731xc84c5534.m) this.f443691g.get(java.lang.Integer.valueOf(i17));
        if (mVar == null) {
            mVar = com.p314xaae8f345.mm.ui.p2731xc84c5534.m.f291228h;
        }
        ?? Q62 = Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291262q);
            nVar.f388441g = mVar;
            Q62.B3(nVar);
        }
    }

    public final void a7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((qe5.z) pf5.z.f435481a.a(activity).a(qe5.z.class)).i7();
    }

    public final void b7() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((qe5.z) pf5.z.f435481a.a(activity).a(qe5.z.class)).m7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e48;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        kd5.e T6 = T6();
        boolean z17 = T6 != null ? T6.f388409J : true;
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((ht.a) vVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(m158354x19263085, i17, i18, intent, z17, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new qe5.k1(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo56583xbf7c1df6("");
            P6.mo64405x4dab7448(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            P6.mo78530x8b45058f();
            P6.mo54448x9c8c0d33(new qe5.a1(this));
            P6.setRequestedOrientation(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}
