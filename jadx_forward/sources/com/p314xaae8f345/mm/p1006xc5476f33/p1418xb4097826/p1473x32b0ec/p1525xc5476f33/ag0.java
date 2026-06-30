package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ag0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d20 D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e40 F;
    public final el2.c2 G;
    public final el2.i1 H;
    public final el2.r2 I;

    /* renamed from: J, reason: collision with root package name */
    public final el2.u2 f193412J;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o6 K;
    public final jy2.b L;
    public final java.util.List M;
    public boolean N;
    public final java.util.HashMap P;

    /* renamed from: v, reason: collision with root package name */
    public final qo0.c f193413v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f193414w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f193415x;

    /* renamed from: y, reason: collision with root package name */
    public xt2.p6 f193416y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 f193417z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup rootParent) {
        super(root, statusMonitor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootParent, "rootParent");
        this.f193413v = statusMonitor;
        this.f193414w = "Finder.FinderLiveVisitorBottomOptionPlugin";
        this.f193415x = ((mm2.c1) P0(mm2.c1.class)).E3.f411003c;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.muu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f193416y = new xt2.e6((android.view.ViewGroup) findViewById, statusMonitor, this);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.i2v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30((android.view.ViewGroup) findViewById2, statusMonitor, this);
        this.f193417z = q30Var;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.u8b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm((android.view.ViewGroup) findViewById3, statusMonitor, this);
        this.A = wmVar;
        android.view.View findViewById4 = rootParent.findViewById(com.p314xaae8f345.mm.R.id.fpi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30((android.view.ViewGroup) findViewById4, statusMonitor, this);
        this.B = e30Var;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f567548jv3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp xpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp((android.view.ViewGroup) findViewById5, statusMonitor, this);
        this.C = xpVar;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.gri);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d20 d20Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d20((android.view.ViewGroup) findViewById6, statusMonitor, this);
        this.D = d20Var;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.tpx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f30 f30Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f30((android.view.ViewGroup) findViewById7, statusMonitor, this);
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.eyy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy((android.view.ViewGroup) findViewById8, statusMonitor, this);
        this.E = qyVar;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.p_k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e40 e40Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e40((android.view.ViewGroup) findViewById9, statusMonitor, this);
        this.F = e40Var;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.lc8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        el2.c2 c2Var = new el2.c2((android.view.ViewGroup) findViewById10, statusMonitor, this);
        this.G = c2Var;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.q8x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        el2.i1 i1Var = new el2.i1((android.view.ViewGroup) findViewById11, statusMonitor, this);
        this.H = i1Var;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.s5m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        el2.r2 r2Var = new el2.r2((android.view.ViewGroup) findViewById12, statusMonitor, this);
        this.I = r2Var;
        android.view.View findViewById13 = root.findViewById(com.p314xaae8f345.mm.R.id.rpt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        el2.u2 u2Var = new el2.u2((android.view.ViewGroup) findViewById13, statusMonitor, this);
        this.f193412J = u2Var;
        android.view.View findViewById14 = root.findViewById(com.p314xaae8f345.mm.R.id.j0u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o6((android.view.ViewGroup) findViewById14, statusMonitor, this);
        this.K = o6Var;
        android.view.View findViewById15 = root.findViewById(com.p314xaae8f345.mm.R.id.p96);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        jy2.b bVar = new jy2.b((android.view.ViewGroup) findViewById15, statusMonitor, this);
        this.L = bVar;
        android.view.View findViewById16 = root.findViewById(com.p314xaae8f345.mm.R.id.f567963l63);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.M = kz5.c0.i(this.f193416y, q30Var, wmVar, e30Var, xpVar, d20Var, f30Var, qyVar, e40Var, c2Var, i1Var, r2Var, o6Var, bVar, new el2.l0((android.view.ViewGroup) findViewById16, statusMonitor, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kf0 kf0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kf0.f194761a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(root, kf0Var);
        e30Var.y1(this.f193415x, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lf0(this));
        M1(((mm2.l0) P0(mm2.l0.class)).f410748q);
        android.content.Context context = this.f194857f.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.getIntent().getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 13) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorBottomOptionPlugin", "checkLinkMicIntent: need show link mic after join live");
            this.N = true;
            activity.getIntent().removeExtra("KEY_PARAMS_DO_ACTION");
        }
        zl2.r4.o3(zl2.r4.f555483a, root, "Finder.FinderLiveVisitorBottomOptionPlugin", false, false, 12, null);
        java.lang.Object obj = this.f193416y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.IFinderLiveChangeableButtonEntranceWidget");
        this.P = kz5.c1.i(new jz5.l(16, (xt2.m6) obj), new jz5.l(10, q30Var), new jz5.l(12, xpVar), new jz5.l(11, qyVar), new jz5.l(17, e40Var), new jz5.l(2, bVar), new jz5.l(15, d20Var), new jz5.l(19, c2Var), new jz5.l(20, r2Var), new jz5.l(23, u2Var), new jz5.l(27, wmVar), new jz5.l(14, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a(e30Var)));
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        D1();
    }

    public final void C1(boolean z17) {
        java.lang.String str = ((mm2.c1) P0(mm2.c1.class)).E3.f411003c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "checkCheerIcon, new:" + str + " old:" + this.f193415x);
        int i17 = ((mm2.c1) P0(mm2.c1.class)).E3.f411004d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.B;
        if (i17 == 0) {
            e30Var.y1("", null);
            this.f193415x = null;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f193415x, str) || z17) {
            this.f193415x = str;
            e30Var.y1(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf0(this));
        }
    }

    public final void D1() {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sf0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(boolean r9) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.E1(boolean):void");
    }

    @Override // qo0.a
    public void F0(int i17, int i18, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i18 != hashCode()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var = this.f193417z;
        q30Var.getClass();
        java.lang.String str = q30Var.f201003g;
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRequestPermissionsResult camera granted");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30.m(q30Var, q30Var.f201012s, 0, q30Var.f201013t, 2, null);
                return;
            }
            return;
        }
        if (i17 != 80) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRequestPermissionsResult microphone granted");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30.m(q30Var, q30Var.f201012s, 0, q30Var.f201013t, 2, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderLive request permission " + i17 + " failed");
        android.view.ViewGroup viewGroup = q30Var.f201000d;
        db5.e1.C(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o30(q30Var), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p30.f200885d);
    }

    public final void F1(int i17, int i18, hi2.b bVar) {
        this.f193417z.l(i17, i18, bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final android.view.ViewGroup G1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar = this.E;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(qyVar)) {
            z17 = true;
        }
        return z17 ? this.f193412J.f335454d : qyVar.f201091d;
    }

    public final int[] H1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        return pm0.v.t(k0Var != null ? k0Var.f7(16) : false ? this.f193412J.f335454d : this.f193416y.h());
    }

    @Override // qo0.a
    public void I0() {
    }

    public final int I1(android.view.View withoutView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(withoutView, "withoutView");
        android.view.ViewGroup viewGroup = this.f446856d;
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(withoutView, childAt) && childAt.getVisibility() == 0) {
                i17++;
            }
        }
        return i17 + (this.B.w0() == 0 ? 1 : 0);
    }

    public final android.view.ViewGroup J1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d20 d20Var = this.D;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(d20Var)) {
            z17 = true;
        }
        return z17 ? this.f193412J.f335454d : d20Var.f199575o;
    }

    public final android.view.ViewGroup K1() {
        jf2.k0 k0Var = (jf2.k0) U0(jf2.k0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xp xpVar = this.C;
        boolean z17 = false;
        if (k0Var != null && k0Var.g7(xpVar)) {
            z17 = true;
        }
        return z17 ? this.f193412J.f335454d : xpVar.f201895d;
    }

    public final void L1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("animate close def ");
        r45.ym1 ym1Var = ((mm2.c1) P0(mm2.c1.class)).f410364k4;
        sb6.append(ym1Var != null ? java.lang.Integer.valueOf(ym1Var.m75939xb282bd08(3)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", sb6.toString());
        r45.ym1 ym1Var2 = ((mm2.c1) P0(mm2.c1.class)).f410364k4;
        if ((ym1Var2 != null ? ym1Var2.m75939xb282bd08(3) : 0) > 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zf0(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            n1();
            return;
        }
        if (ordinal == 123) {
            boolean z17 = !((mm2.c1) P0(mm2.c1.class)).e8();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var = this.f193417z;
            q30Var.f201014u = z17;
            this.D.a(!((mm2.c1) P0(mm2.c1.class)).e8());
            this.C.f201900i = ((mm2.g0) P0(mm2.g0.class)).U6();
            el2.i1 i1Var = this.H;
            if (i1Var.f335345d.getVisibility() == 0) {
                pm0.v.w(new el2.b1(i1Var));
            }
            if ((q30Var.f201000d.getVisibility() == 0) && this.N) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "statusChange: FINDER_LIVE_UPDATE_LIVE_MSG, request link mic");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30.m(this.f193417z, 0, 0, null, 7, null);
                this.N = false;
                return;
            }
            return;
        }
        if (ordinal == 245) {
            E1(true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = this.B;
        switch (ordinal) {
            case 150:
                android.view.ViewGroup viewGroup = e30Var.f446856d;
                viewGroup.startAnimation(android.view.animation.AnimationUtils.loadAnimation(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559267v));
                return;
            case 151:
                e30Var.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m20(e30Var, true));
                return;
            case 152:
                if (e30Var.i()) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t20(e30Var));
                    return;
                }
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 /* 153 */:
                if (e30Var.i()) {
                    el2.r2 r2Var = this.I;
                    r2Var.getClass();
                    pm0.v.X(new el2.q2(r2Var));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void M1(mm2.i0 i0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "updateCheerInfos " + i0Var);
        if (i0Var != null) {
            ((mm2.c1) P0(mm2.c1.class)).P9(i0Var.f410664a, i0Var.f410665b, i0Var.f410666c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.class);
            if (owVar != null) {
                owVar.I1(((mm2.c1) P0(mm2.c1.class)).E3.f411002b);
            }
            C1(false);
        }
    }

    @Override // qo0.a
    public void N0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442;
        super.O0();
        this.f193415x = null;
        xt2.p6 p6Var = this.f193416y;
        if (p6Var instanceof xt2.e6) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p6Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveVisitorShoppingEntranceWidget");
            xt2.e6 e6Var = (xt2.e6) p6Var;
            ((android.widget.ImageView) ((jz5.n) e6Var.f538262q).mo141623x754a37bb()).animate().cancel();
            e6Var.m().n();
            e6Var.t(8);
        } else if (p6Var instanceof xt2.d) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p6Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.shopping.view.FinderLiveAnchorShoppingEntranceWidget");
            ((xt2.d) p6Var).m().n();
        }
        this.C.f201897f = true;
        this.B.O0();
        this.G.getClass();
        this.H.o(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.A;
        wmVar.f201748p = false;
        zi2.w wVar = wmVar.f201750r;
        if (wVar != null && (c14227x4262fb442 = ((je2.t) wVar.P0(je2.t.class)).f380801n) != null) {
            zi2.w wVar2 = wmVar.f201750r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar2);
            c14227x4262fb442.m7809x1ff8439(wVar2);
        }
        zi2.w wVar3 = wmVar.f201750r;
        if (wVar3 != null && (c14227x4262fb44 = ((mm2.c1) wVar3.P0(mm2.c1.class)).f410419t3) != null) {
            zi2.w wVar4 = wmVar.f201750r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar4);
            c14227x4262fb44.m7809x1ff8439(wVar4);
        }
        wmVar.f201751s = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = wmVar.f201753u;
        if (k0Var != null) {
            k0Var.u();
        }
        wmVar.f201753u = null;
        vg2.y1 y1Var = wmVar.f201754v;
        if (y1Var != null) {
            y1Var.f518159e.dismiss();
        }
        wmVar.f201754v = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wmVar.f201741f, "unMount");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        java.lang.String str = string != null ? string : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "onPortraitAction action: ".concat(str));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "PORTRAIT_ACTION_PROMOTE_CLICK")) {
            qo0.c.a(this.f193413v, qo0.b.I2, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void n1() {
        android.view.View findViewById;
        jf2.k0 k0Var;
        if (((mm2.c1) P0(mm2.c1.class)).T) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "init anchor shop entrance");
            jf2.k0 k0Var2 = (jf2.k0) U0(jf2.k0.class);
            if (k0Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", "unRegisterEntrance = 16");
                pm0.v.d0(k0Var2.f380913o, new jf2.j0(16));
            }
            android.view.View findViewById2 = this.f446856d.findViewById(com.p314xaae8f345.mm.R.id.muu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            xt2.d dVar = new xt2.d((android.view.ViewGroup) findViewById2, this.f193413v, this);
            this.f193416y = dVar;
            xt2.d dVar2 = dVar instanceof jf2.o ? dVar : null;
            if (dVar2 != null && (k0Var = (jf2.k0) U0(jf2.k0.class)) != null) {
                k0Var.h7(dVar2);
            }
        }
        if (((((mm2.n0) P0(mm2.n0.class)).f410806r) || ((mm2.c1) P0(mm2.c1.class)).T) && (findViewById = this.f446856d.findViewById(com.p314xaae8f345.mm.R.id.rpt)) != null && findViewById.getParent() == this.f446856d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193414w, "onStartLive: invitee/assistant, move fold_entrance_container to last");
            this.f446856d.removeView(findViewById);
            this.f446856d.addView(findViewById);
        }
        ((mm2.l0) P0(mm2.l0.class)).f410746o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wf0(this));
        ((mm2.w) P0(mm2.w.class)).f411036o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yf0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g
    public java.util.HashMap v1() {
        return this.P;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d172;
        super.z0();
        xt2.p6 p6Var = this.f193416y;
        xt2.e6 e6Var = p6Var instanceof xt2.e6 ? (xt2.e6) p6Var : null;
        if (e6Var != null) {
            ((android.widget.ImageView) ((jz5.n) e6Var.f538262q).mo141623x754a37bb()).setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar = this.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = qyVar.f201093f;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f410338f6.mo7806x9d92d11c(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.py(qyVar));
        ((mm2.s2) P0(mm2.s2.class)).f410943o.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uf0(this));
        el2.c2 c2Var = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = c2Var.f335295e;
        el2.n1 n1Var = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var != null && (c14226x69ca5d172 = n1Var.f335408q) != null) {
            c14226x69ca5d172.mo7806x9d92d11c(lVar2, new el2.s1(c2Var));
        }
        el2.n1 n1Var2 = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var2 != null && (c14226x69ca5d17 = n1Var2.f335408q) != null) {
            c14226x69ca5d17.mo7808x76db6cb1(null);
        }
        el2.n1 n1Var3 = (el2.n1) lVar2.U0(el2.n1.class);
        if (n1Var3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) n1Var3.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class);
            if (!(r60Var != null && r60Var.w0() == 0)) {
                n1Var3.f335408q.mo7808x76db6cb1(n1Var3.f335407p);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[mount] liveName = ");
        el2.i1 i1Var = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar3 = i1Var.f335347f;
        sb6.append(((mm2.e1) lVar3.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        sb6.append(", isActive = ");
        sb6.append(p3325xe03a0797.p3326xc267989b.z0.h(lVar3.R0().m57691xa0fa63f9()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, sb6.toString());
        ((je2.t) lVar3.P0(je2.t.class)).f380801n.mo7806x9d92d11c(lVar3, new el2.v0(i1Var));
        ((je2.t) lVar3.P0(je2.t.class)).f380807t.mo7806x9d92d11c(lVar3, new el2.w0(i1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442 = ((je2.t) lVar3.P0(je2.t.class)).f380802o;
        c14227x4262fb442.f193193d = true;
        c14227x4262fb442.mo7806x9d92d11c(lVar3, new el2.x0(i1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb443 = ((mm2.c1) lVar3.P0(mm2.c1.class)).f410419t3;
        c14227x4262fb443.f193193d = true;
        c14227x4262fb443.mo7806x9d92d11c(lVar3, new el2.y0(i1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb444 = ((je2.t) lVar3.P0(je2.t.class)).f380804q;
        c14227x4262fb444.f193193d = true;
        c14227x4262fb444.mo7806x9d92d11c(lVar3, new el2.z0(i1Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb445 = ((je2.t) lVar3.P0(je2.t.class)).f380803p;
        c14227x4262fb445.f193193d = true;
        c14227x4262fb445.mo7806x9d92d11c(lVar3, new el2.a1(i1Var));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[mount] liveId = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar4 = wmVar.f201740e;
        sb7.append(((mm2.e1) lVar4.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        java.lang.String sb8 = sb7.toString();
        java.lang.String str = wmVar.f201741f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8);
        zi2.w wVar = (zi2.w) lVar4.X0(zi2.w.class);
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "mount failed: micCoverPlugin is null");
        } else {
            wmVar.f201750r = wVar;
            r45.tp1 tp1Var = (r45.tp1) ((je2.t) wVar.P0(je2.t.class)).f380801n.mo3195x754a37bb();
            if (tp1Var != null) {
                wmVar.o(tp1Var);
            }
            wmVar.f201751s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jm(wmVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb446 = ((je2.t) wVar.P0(je2.t.class)).f380801n;
            p012xc85e97e9.p093xedfae76a.k0 k0Var = wmVar.f201751s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
            c14227x4262fb446.mo7806x9d92d11c(wVar, k0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lm(wVar, wmVar, null), 3, null);
            wmVar.p((om2.d0) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.g) wVar.P0(om2.g.class)).f427836g).mo144003x754a37bb());
        }
        el2.r2 r2Var = this.I;
        r2Var.getClass();
        r2Var.f335432d.setOnClickListener(new el2.m2(r2Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar5 = r2Var.f335433e;
        ((mm2.c1) lVar5.P0(mm2.c1.class)).K1.mo7806x9d92d11c(lVar5, new el2.n2(r2Var));
        el2.u2 u2Var = this.f193412J;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar6 = u2Var.f335455e;
        jf2.k0 k0Var2 = (jf2.k0) lVar6.U0(jf2.k0.class);
        if (k0Var2 == null || (c14227x4262fb44 = k0Var2.f380918t) == null) {
            return;
        }
        c14227x4262fb44.f193193d = true;
        c14227x4262fb44.mo7806x9d92d11c(lVar6, new el2.t2(u2Var));
    }
}
