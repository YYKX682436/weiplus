package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qh extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f195542p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4 f195543q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f195544r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f195542p = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.ifs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f195543q = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15215x9a0c94c4) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.evw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f195544r = (android.widget.ImageView) findViewById3;
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qh qhVar) {
        r45.m70 m70Var = ((mm2.d1) qhVar.P0(mm2.d1.class)).f410484f;
        if (m70Var != null) {
            java.lang.String str = ((mm2.c1) qhVar.P0(mm2.c1.class)).f410385o;
            i95.m c17 = i95.n0.c(s40.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = qhVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            s40.w0.z5((s40.w0) c17, context, m70Var, null, str, "2", 4, null);
            nk2.l.f419554a.b(nk2.a.f419487g);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_TICKET")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nh nhVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nh(this);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(nhVar, j17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lh.f194930a[status.ordinal()] == 1 && ((mm2.d1) P0(mm2.d1.class)).f410485g) {
            u1();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1() {
        java.lang.String str;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) P0(mm2.e1.class)).f410518o);
        long j17 = ((mm2.e1) P0(mm2.e1.class)).f410516m;
        r45.b84 b84Var = (r45.b84) ((mm2.e1) P0(mm2.e1.class)).f410521r.m75936x14adae67(47);
        if (b84Var == null || (str = b84Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long m75942xfb822ef2 = ((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket liveId=" + m75942xfb822ef2);
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314917g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isAnchor, return.");
            K0(8);
        } else if (!((mm2.d1) P0(mm2.d1.class)).f410485g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isHopeShowTicketWindowNow not, return.");
            K0(8);
        } else if (((mm2.d1) P0(mm2.d1.class)).N6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ph(str2, j17, b17, m75942xfb822ef2, this, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isConcertLive not, return.");
            K0(8);
        }
    }
}
