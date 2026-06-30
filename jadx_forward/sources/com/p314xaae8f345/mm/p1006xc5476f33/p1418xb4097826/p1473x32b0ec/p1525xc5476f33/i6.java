package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f194452d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f194453e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f194454f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f194455g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f194456h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f194457i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f194458m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f194459n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f194460o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f194461p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f194462q;

    public i6(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f194452d = context;
        this.f194453e = buContext;
        this.f194454f = statusMonitor;
        this.f194455g = basePlugin;
        this.f194456h = tVar;
        this.f194457i = "FinderLiveAnchorInviteMicBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dkj, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f194458m = viewGroup;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563868bp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        this.f194460o = textView2;
        this.f194461p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e6(this));
        d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f194456h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a() {
        this.f194462q = false;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f194459n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((mm2.i5) this.f194453e.a(mm2.i5.class)).f410673f.mo7808x76db6cb1(null);
    }

    public final void b(r45.ih1 ih1Var) {
        java.lang.String str = this.f194457i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "SHEET_MORE_ACTION_AUDIO_LINK");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f194455g;
        if (((mm2.o4) lVar.P0(mm2.o4.class)).f410860v.size() >= 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "skip apply mic, disable mic");
            android.content.Context context = this.f194452d;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m38), 0).show();
            return;
        }
        fj2.j jVar = fj2.j.f344707a;
        java.lang.String str2 = this.f194457i;
        android.content.Context context2 = this.f194458m.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (jVar.d(str2, context2, this.f194454f, this.f194455g, ih1Var.m75939xb282bd08(1), lVar.Z0(), 1, null)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", ih1Var.m75939xb282bd08(1));
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", true);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 4);
            this.f194454f.mo46557x60d69242(qo0.b.F3, bundle);
        }
        a();
    }

    public final void c(cm2.w wVar) {
        d();
        this.f194460o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f6(wVar, this));
        ((android.view.View) ((jz5.n) this.f194461p).mo141623x754a37bb()).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g6(this));
        if (!this.f194462q) {
            this.f194462q = true;
            if (wVar.f124939v.m75939xb282bd08(2) == 3) {
                ml2.n4 n4Var = ml2.n4.f409282p1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 59");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
            } else {
                ml2.n4 n4Var2 = ml2.n4.M;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 36");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            }
        }
        r45.ih1 ih1Var = wVar.f124939v;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f194459n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        long m75942xfb822ef2 = (ih1Var != null ? ih1Var.m75942xfb822ef2(3) : 0L) - (c01.id.c() / 1000);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDismissJob. inviteInfo:");
        sb6.append(ih1Var != null ? java.lang.Integer.valueOf(ih1Var.m75939xb282bd08(0)) : null);
        sb6.append(", invite_seat_id:");
        sb6.append(ih1Var != null ? java.lang.Integer.valueOf(ih1Var.m75939xb282bd08(1)) : null);
        sb6.append(", confirm_expired_time:");
        sb6.append(ih1Var != null ? java.lang.Long.valueOf(ih1Var.m75942xfb822ef2(3)) : null);
        sb6.append(" showTime: ");
        sb6.append(m75942xfb822ef2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194457i, sb6.toString());
        this.f194459n = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(this.f194455g, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d6(m75942xfb822ef2 > 0 ? (int) m75942xfb822ef2 : 15, this, null), 3, null);
    }

    public final void d() {
        android.view.ViewGroup viewGroup = this.f194458m;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o6s);
        gk2.e eVar = this.f194453e;
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7()) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79590x301f7106);
        } else if (((mm2.e1) eVar.a(mm2.e1.class)).g7()) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79176x608e1841);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79653xc84c6d76);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odb);
        if (textView != null) {
            boolean b76 = ((mm2.e1) eVar.a(mm2.e1.class)).b7();
            android.content.Context context = this.f194452d;
            textView.setText(b76 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ota) : ((mm2.e1) eVar.a(mm2.e1.class)).g7() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_3) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyw));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.w) {
            c((cm2.w) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        return this.f194458m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.w) {
            c((cm2.w) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f194459n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.hhj;
    }
}
