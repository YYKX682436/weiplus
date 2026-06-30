package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ej0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f193960r;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193961p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f193962q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193961p = statusMonitor;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ihi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.ihh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup, "finder_live_mini_window");
        if (statusMonitor.mo11219xd0598cf8() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewGroup, 8, 25561);
        }
        c22699x3dcdb352.setImageResource(u1() ? com.p314xaae8f345.mm.R.raw.f80200x8bf06823 : com.p314xaae8f345.mm.R.raw.f80184xd8bebcd4);
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yi0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7 || ordinal == 30) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f409621u, null, null, null, null, null, false, 126, null);
            this.f193962q = true;
            return;
        }
        if (ordinal == 27 || ordinal == 28) {
            K0(4);
            this.f193962q = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void l1(android.os.Bundle bundle, java.lang.Object obj) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE") || f193960r) {
            return;
        }
        f193960r = true;
        pm0.v.V(500L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        if (!((mm2.c1) P0(mm2.c1.class)).M7()) {
            android.content.Context context = this.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                v1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorMiniWindowPlugin", "miniWindow click!");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.f409517s, null, null, null, null, null, false, 126, null);
                zl2.r4.f555483a.d(this);
            }
        }
        if (((mm2.c1) P0(mm2.c1.class)).L5) {
            ((mm2.c1) P0(mm2.c1.class)).N5 = 2;
            v1();
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409517s, null, null, null, null, null, false, 126, null);
        } else {
            xu2.u uVar = (xu2.u) X0(xu2.u.class);
            if (uVar != null) {
                uVar.x1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zi0(this));
            }
        }
        zl2.r4.f555483a.d(this);
    }

    public final boolean u1() {
        if (com.p314xaae8f345.mm.ui.bk.v0()) {
            android.view.ViewGroup viewGroup = this.f446856d;
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
            if (!com.p314xaae8f345.mm.ui.bk.N(activity.getTaskId())) {
                android.content.Context context2 = viewGroup.getContext();
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                if (com.p314xaae8f345.mm.ui.bk.O(activity2 != null ? activity2.getContentResolver() : null)) {
                    android.content.Context context3 = viewGroup.getContext();
                    android.app.Activity activity3 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity3);
                    if (!activity3.isInMultiWindowMode()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void v1() {
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveVisitorMiniWindowPlugin", "showVideoTalking, permission denied");
            if (!x0()) {
                x1();
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.q1(this, "PORTRAIT_ACTION_OPEN_PERMISTTION_PAGE", null, 2, null);
                f193960r = false;
                return;
            }
        }
        qo0.c cVar = this.f193961p;
        if (cVar.mo11219xd0598cf8() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.U = true;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f409885g;
            ml2.z1 z1Var = ml2.z1.f409864e;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        } else if (cVar.mo11219xd0598cf8() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f409866g);
        }
        if (cVar.mo11219xd0598cf8() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = Y0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = Y0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) Y0 : null;
            if (c14353xe7c1f419 != null ? c14353xe7c1f419.getIsPresentedInTimeLineUI() : false) {
                dk2.ef efVar = dk2.ef.f314905a;
                if (dk2.ef.f314931n != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoPassive", "onShowMiniWindowFromTimeLineUI.");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y02 = Y0();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = Y02 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) Y02 : null;
                if (c14353xe7c1f4192 != null) {
                    c14353xe7c1f4192.m57465xab8264f();
                }
            }
        }
        android.content.Context context = this.f446856d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class)).f198524q = true;
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd.class)).f198525r = 2;
            activity.finish();
        }
    }

    public final void w1(android.view.View view) {
        if (view == null || !u1()) {
            t1();
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        rl5.r rVar = new rl5.r(viewGroup.getContext(), view);
        rVar.F = true;
        rVar.f478868J = viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k28);
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.aj0(this);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bj0(this);
        rVar.m();
    }

    public final void x1() {
        qo0.c.a(this.f193961p, qo0.b.D, null, 2, null);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = viewGroup.getContext();
        java.lang.String string = viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gff);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dj0 dj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dj0(this);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(context, 21, string, dj0Var, false, false, a17);
    }
}
