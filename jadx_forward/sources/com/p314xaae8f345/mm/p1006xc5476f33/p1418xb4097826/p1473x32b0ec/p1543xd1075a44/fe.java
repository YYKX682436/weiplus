package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class fe {

    /* renamed from: i, reason: collision with root package name */
    public static final r45.h84 f199875i;

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f199876a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f199877b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199878c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yd f199879d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f199880e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de f199881f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ce f199882g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f199883h;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ud(null);
        r45.h84 h84Var = new r45.h84();
        h84Var.set(0, "-1");
        f199875i = h84Var;
    }

    public fe(android.widget.RelativeLayout panelRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelRoot, "panelRoot");
        this.f199876a = panelRoot;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) panelRoot.findViewById(com.p314xaae8f345.mm.R.id.ese);
        this.f199878c = c1163xf1deaba4;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) panelRoot.findViewById(com.p314xaae8f345.mm.R.id.esh);
        this.f199879d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yd(this);
        this.f199880e = new java.util.ArrayList();
        this.f199881f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de(f199875i, "");
        panelRoot.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sd(this));
        panelRoot.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(panelRoot.getContext()).y);
        relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.td(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(panelRoot.getContext(), 0, false));
    }

    public static /* synthetic */ void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fe feVar, int i17, java.lang.String str, java.lang.String str2, long j17, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        if ((i18 & 8) != 0) {
            j17 = 0;
        }
        feVar.a(i17, str3, str4, j17);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, long j17) {
        boolean z17 = false;
        if (i17 == 6 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f199875i.m75945x2fec8307(0))) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", i17);
            if (i17 != 1 && i17 != 2) {
                jSONObject.put("accessories_id", str);
                jSONObject.put("accessories_name", str2);
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
                zy2.zb.y6((zy2.zb) c17, ml2.z4.H1, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.c1 c1Var2 = ml2.c1.f408858e;
                zy2.zb.j5((zy2.zb) c18, 40L, jSONObject.toString(), null, 4, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#reportAnchorElement living=");
            mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
            sb6.append(c1Var3 != null ? java.lang.Boolean.valueOf(c1Var3.a8()) : null);
            sb6.append(' ');
            sb6.append(jSONObject);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveElementWidget", sb6.toString());
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de deVar) {
        hn0.f fVar;
        hn0.f fVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.de deVar2 = this.f199881f;
        if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(deVar2.f199633a.m75945x2fec8307(0), deVar.f199633a.m75945x2fec8307(0)))) {
            deVar2 = null;
        }
        r45.h84 h84Var = deVar.f199633a;
        if (deVar2 != null) {
            r45.h84 h84Var2 = deVar2.f199633a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var2.m75945x2fec8307(0), f199875i.m75945x2fec8307(0))) {
                a(7, h84Var2.m75945x2fec8307(0), h84Var2.m75945x2fec8307(1), java.lang.System.currentTimeMillis() - dk2.ef.f314941w);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var.m75945x2fec8307(0), "-1")) {
                    b(this, 6, h84Var2.m75945x2fec8307(0), h84Var2.m75945x2fec8307(1), 0L, 8, null);
                }
            }
        }
        this.f199881f = deVar;
        dk2.ef efVar = dk2.ef.f314905a;
        efVar.e0(deVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#curSelectedFilter set ");
        sb6.append(h84Var != null ? h84Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveElementWidget", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h84Var.m75945x2fec8307(0), "-1")) {
            in0.q e17 = efVar.e();
            if (e17 == null || (fVar2 = e17.f502306t) == null) {
                return;
            }
            ((hn0.p) fVar2).d(kz5.p0.f395529d);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String m75945x2fec8307 = h84Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        arrayList.add(new jz5.l(m75945x2fec8307, deVar.f199634b));
        in0.q e18 = efVar.e();
        if (e18 == null || (fVar = e18.f502306t) == null) {
            return;
        }
        ((hn0.p) fVar).d(arrayList);
    }
}
