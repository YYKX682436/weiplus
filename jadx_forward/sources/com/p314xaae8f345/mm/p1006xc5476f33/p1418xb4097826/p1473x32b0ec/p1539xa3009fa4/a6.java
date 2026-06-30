package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes10.dex */
public final class a6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198432d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f198433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f198434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198432d = "FinderLivePostSecurityUIC";
        this.f198434f = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26301x695ae9c.f51912x8e5c1f1c;
    }

    public final boolean O6(r45.m01 resp, yz5.l afterShowErrPageListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterShowErrPageListener, "afterShowErrPageListener");
        java.lang.String str = "[checkSecurityResp] type = " + resp.m75939xb282bd08(0);
        java.lang.String str2 = this.f198432d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        int m75939xb282bd08 = resp.m75939xb282bd08(0);
        if (m75939xb282bd08 == 0) {
            return true;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (m75939xb282bd08 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(1);
            if (m75934xbce7f2f != null) {
                try {
                    r45.p01 p01Var = new r45.p01();
                    p01Var.mo11468x92b714fd(m75934xbce7f2f.g());
                    Q6(p01Var, afterShowErrPageListener);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseFrom Exception = " + e17.getMessage());
                }
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "page_wording_buff is empty");
            return false;
        }
        if (m75939xb282bd08 == 2 || m75939xb282bd08 == 3 || m75939xb282bd08 == 4) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = resp.m75934xbce7f2f(1);
            if (m75934xbce7f2f2 != null) {
                try {
                    r45.n01 n01Var = new r45.n01();
                    n01Var.mo11468x92b714fd(m75934xbce7f2f2.g());
                    this.f198433e = afterShowErrPageListener;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Ij(m158354x19263085(), null, this.f198434f, n01Var, java.lang.Integer.valueOf(resp.m75939xb282bd08(0)));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseFrom Exception = " + e18.getMessage());
                }
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "page_wording_buff is empty");
            return false;
        }
        if (m75939xb282bd08 != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unknown type");
            return true;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = resp.m75934xbce7f2f(1);
        if (m75934xbce7f2f3 != null) {
            try {
                r45.o01 o01Var = new r45.o01();
                o01Var.mo11468x92b714fd(m75934xbce7f2f3.g());
                P6(o01Var, afterShowErrPageListener);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "parseFrom Exception = " + e19.getMessage());
            }
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "page_wording_buff is empty");
        return false;
    }

    public final void P6(r45.o01 o01Var, yz5.l lVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(m80379x76847179());
        y1Var.i(true);
        y1Var.m(java.lang.Boolean.TRUE);
        android.view.View inflate = android.view.View.inflate(m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.axa, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.icv);
        android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.icw);
        android.widget.TextView textView3 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.icu);
        android.widget.TextView textView4 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.ict);
        java.lang.String m75945x2fec8307 = o01Var.m75945x2fec8307(1);
        textView.setText(m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, "\\n", "\n", false) : null);
        textView4.setText(o01Var.m75945x2fec8307(3));
        textView3.setText(o01Var.m75945x2fec8307(2));
        textView2.setText(o01Var.m75945x2fec8307(0));
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t5(y1Var));
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u5(c0Var, y1Var));
        y1Var.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v5(lVar, c0Var);
        y1Var.k(c22646x1e9ca55);
        y1Var.s();
    }

    public final void Q6(r45.p01 p01Var, yz5.l lVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(m80379x76847179());
        y1Var.i(true);
        y1Var.m(java.lang.Boolean.TRUE);
        android.view.View inflate = android.view.View.inflate(m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.axc, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
        android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.icv);
        android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.icu);
        android.widget.TextView textView3 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.ict);
        android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.ics);
        textView.setText(p01Var.m75945x2fec8307(0));
        textView3.setText(p01Var.m75945x2fec8307(2));
        textView2.setText(p01Var.m75945x2fec8307(1));
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        long c17 = c01.id.c();
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.w5(y1Var));
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x5(this, y1Var));
        textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y5(this, c0Var, y1Var));
        y1Var.f293570s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z5(this, c17, lVar, c0Var);
        y1Var.k(c22646x1e9ca55);
        y1Var.s();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("168", R6(java.lang.Boolean.FALSE, 0L));
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.U1, S6("168"), null, "168", null, null, false, 116, null);
        i95.m c19 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.V1, S6("168"), null, "168", null, null, false, 116, null);
    }

    public final java.lang.String R6(java.lang.Boolean bool, java.lang.Long l17) {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i : 0L;
        try {
            cl0.g gVar = new cl0.g();
            gVar.h("finder_username", xy2.c.e(m80379x76847179()));
            gVar.o("entrance_type", i17);
            gVar.p("entrance_id", j17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                gVar.h("staytime", l17);
            }
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            return gVar2;
        } catch (java.lang.Exception unused) {
            return "{}";
        }
    }

    public final java.util.HashMap S6(java.lang.String str) {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198580h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731) eVar2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1541x2eefaa.p1542xbba4bfc0.C14387x51481731.class)).f198581i : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", xy2.c.e(m80379x76847179()));
        hashMap.put("entrance_type", java.lang.String.valueOf(i17));
        hashMap.put("entrance_id", java.lang.String.valueOf(j17));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f198432d, "requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == this.f198434f) {
            if (i18 == -1) {
                yz5.l lVar = this.f198433e;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            yz5.l lVar2 = this.f198433e;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }
}
