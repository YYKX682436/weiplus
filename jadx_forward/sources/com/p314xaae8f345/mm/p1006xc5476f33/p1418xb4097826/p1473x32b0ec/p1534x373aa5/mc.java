package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f198016a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.ar f198017b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f198018c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f198019d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f198020e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f198021f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f198022g;

    public mc(android.view.ViewGroup root, df2.ar controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f198016a = root;
        this.f198017b = controller;
        this.f198018c = "LiveProductGiftCardWidget";
        this.f198019d = root.findViewById(com.p314xaae8f345.mm.R.id.uuo);
        this.f198020e = root.findViewById(com.p314xaae8f345.mm.R.id.uun);
        this.f198021f = root.findViewById(com.p314xaae8f345.mm.R.id.uup);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.mc mcVar, r45.lv1 lv1Var) {
        r45.ce0 ce0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mcVar.f198018c, "jumpProductDetail");
        r45.y23 y23Var = new r45.y23();
        r45.uv1 uv1Var = (r45.uv1) lv1Var.m75936x14adae67(1);
        byte[] g17 = (uv1Var == null || (m75934xbce7f2f = uv1Var.m75934xbce7f2f(3)) == null) ? null : m75934xbce7f2f.g();
        if (g17 != null) {
            try {
                y23Var.mo11468x92b714fd(g17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            if (y23Var != null || (ce0Var = (r45.ce0) y23Var.m75936x14adae67(8)) == null) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mcVar.f198018c, "jumpProductDetail jumpInfo.appid:" + ce0Var.m75945x2fec8307(0) + ", jumpInfo.path:" + ce0Var.m75945x2fec8307(1));
            l81.b1 b1Var = new l81.b1();
            java.lang.String m75945x2fec8307 = ce0Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            b1Var.f398547b = m75945x2fec8307;
            java.lang.String m75945x2fec83072 = ce0Var.m75945x2fec8307(1);
            b1Var.f398555f = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            b1Var.f398565k = 1205;
            float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
                f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
            }
            b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, (int) ((ae2.in.f85221a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f387301f, true, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, true, false, false, null, null, null, false, null, null, false, -1073746308, 2045, null);
            dk2.ah ahVar = new dk2.ah();
            ahVar.f314751n = false;
            ahVar.f314756s = true;
            b1Var.f398561i = ahVar;
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = mcVar.f198019d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            gk2.e liveRoomData = mcVar.f198017b.getStore().getLiveRoomData();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = mcVar.f198017b.f372632e;
            q4Var.n(context, liveRoomData, b1Var, ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null);
            return;
        }
        y23Var = null;
        if (y23Var != null) {
        }
    }

    public final void b(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f198016a.setVisibility(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f198022g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198018c, "dismiss for ".concat(source));
    }
}
