package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class sv {

    /* renamed from: i, reason: collision with root package name */
    public static final r45.h84 f201372i;

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f201373a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f201374b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f201375c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lv f201376d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f201377e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv f201378f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pv f201379g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f201380h;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hv(null);
        r45.h84 h84Var = new r45.h84();
        h84Var.set(0, "-1");
        f201372i = h84Var;
    }

    public sv(android.widget.RelativeLayout panelRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelRoot, "panelRoot");
        this.f201373a = panelRoot;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) panelRoot.findViewById(com.p314xaae8f345.mm.R.id.oiv);
        this.f201375c = c1163xf1deaba4;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) panelRoot.findViewById(com.p314xaae8f345.mm.R.id.esh);
        this.f201376d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lv(this);
        this.f201377e = new java.util.ArrayList();
        this.f201378f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv(f201372i, "");
        panelRoot.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fv(this));
        panelRoot.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(panelRoot.getContext()).y);
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gv(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(panelRoot.getContext(), 0, false));
    }

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sv svVar, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        if ((i18 & 8) != 0) {
            j17 = 0;
        }
        svVar.a(i17, str3, str4, j17);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, long j17) {
        boolean z17 = false;
        if (i17 == 6 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f201372i.m75945x2fec8307(0))) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            if (i17 != 1 && i17 != 2) {
                jSONObject.put("effects_id", str);
                jSONObject.put("effects_name", str2);
            }
            if (i17 == 7) {
                jSONObject.put("use_time", j17);
            }
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                z17 = true;
            }
            if (z17) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.J1, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.c1 c1Var2 = ml2.c1.f408858e;
                zy2.zb.j5((zy2.zb) c18, 46L, jSONObject.toString(), null, 4, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#reportAnchorElement living=");
            mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
            sb6.append(c1Var3 != null ? java.lang.Boolean.valueOf(c1Var3.a8()) : null);
            sb6.append(' ');
            sb6.append(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveScreenEffectWidget", sb6.toString());
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv qvVar) {
        hn0.f fVar;
        hn0.f fVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qv qvVar2 = this.f201378f;
        if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qvVar2.f201088a.m75945x2fec8307(0), qvVar.f201088a.m75945x2fec8307(0)))) {
            qvVar2 = null;
        }
        r45.h84 h84Var = qvVar.f201088a;
        if (qvVar2 != null) {
            r45.h84 h84Var2 = qvVar2.f201088a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var2.m75945x2fec8307(0), f201372i.m75945x2fec8307(0))) {
                a(7, h84Var2.m75945x2fec8307(0), h84Var2.m75945x2fec8307(1), java.lang.System.currentTimeMillis() - dk2.ef.f314942x);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var.m75945x2fec8307(0), "-1")) {
                    b(this, 6, h84Var2.m75945x2fec8307(0), h84Var2.m75945x2fec8307(1), 0L, 8, null);
                }
            }
        }
        this.f201378f = qvVar;
        dk2.ef efVar = dk2.ef.f314905a;
        efVar.h0(qvVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveScreenEffectWidget", "#curSelectedFilter set " + h84Var.m75945x2fec8307(0));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var.m75945x2fec8307(0), "-1")) {
            in0.q e17 = efVar.e();
            if (e17 != null && (fVar2 = e17.f502306t) != null) {
                ((hn0.p) fVar2).g(kz5.p0.f395529d);
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String m75945x2fec8307 = h84Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            arrayList.add(new jz5.l(m75945x2fec8307, qvVar.f201089b));
            in0.q e18 = efVar.e();
            if (e18 != null && (fVar = e18.f502306t) != null) {
                ((hn0.p) fVar).g(arrayList);
            }
        }
        java.lang.String m75945x2fec83072 = this.f201378f.f201088a.m75945x2fec8307(0);
        java.lang.String str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.j0.f409116i.a("effects_id_list", str);
    }
}
