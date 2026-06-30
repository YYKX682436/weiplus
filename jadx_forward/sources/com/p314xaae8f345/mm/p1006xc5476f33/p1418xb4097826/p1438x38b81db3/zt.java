package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class zt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bu f186658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186659f;

    public zt(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bu buVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f186657d = s0Var;
        this.f186658e = buVar;
        this.f186659f = c1163xf1deaba4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.rz6 rz6Var;
        r45.rz6 rz6Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileTemplateConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f186657d;
        so2.d5 d5Var = (so2.d5) s0Var.f374658i;
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String m75945x2fec8307 = d5Var.f491847d.m75945x2fec8307(0);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        r45.r03 r03Var = d5Var.f491847d;
        long m75942xfb822ef2 = r03Var.m75942xfb822ef2(1);
        r45.r23 r23Var = (r45.r23) r03Var.m75936x14adae67(23);
        java.lang.String str2 = null;
        java.lang.String str3 = (r23Var == null || (rz6Var2 = (r45.rz6) r23Var.m75936x14adae67(1)) == null) ? null : rz6Var2.f466853d;
        java.lang.String str4 = str3 == null ? "" : str3;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f186658e.f184531e, java.lang.Boolean.TRUE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        y2Var.Y(context, 1, str, m75942xfb822ef2, 0L, str4, null, b17, xy2.c.e(context));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            jz5.g b18 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yt(s0Var));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("page_type", "profile_mj_template");
                r45.r23 r23Var2 = (r45.r23) r03Var.m75936x14adae67(23);
                if (r23Var2 != null && (rz6Var = (r45.rz6) r23Var2.m75936x14adae67(1)) != null) {
                    str2 = rz6Var.f466853d;
                }
                jSONObject.put("templateid", str2 == null ? "" : str2);
                jSONObject.put("finderusername", (java.lang.String) ((jz5.n) b18).mo141623x754a37bb());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ProfileTemplateConvert", e17.getMessage());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f186659f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449 c6497x6ec53449 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6497x6ec53449();
            c6497x6ec53449.f138378d = V6.m75939xb282bd08(5);
            c6497x6ec53449.f138379e = c6497x6ec53449.b("SessionId", V6.m75945x2fec8307(0), true);
            c6497x6ec53449.f138380f = c6497x6ec53449.b("ContextId", V6.m75945x2fec8307(1), true);
            c6497x6ec53449.f138381g = c6497x6ec53449.b("ClickTabContextId", V6.m75945x2fec8307(2), true);
            c6497x6ec53449.f138385k = c01.id.c();
            java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(9);
            c6497x6ec53449.f138386l = c6497x6ec53449.b("PageTag", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", ";", false) : "", true);
            java.lang.String gVar = o3Var.kk().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            c6497x6ec53449.f138389o = c6497x6ec53449.b("ScreenInfo", r26.i0.t(gVar, ",", ";", false), true);
            java.lang.String jSONArray = o3Var.ck(recyclerView).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "toString(...)");
            c6497x6ec53449.f138383i = c6497x6ec53449.b("AllFeedInfo", r26.i0.t(jSONArray, ",", ";", false), true);
            c6497x6ec53449.f138384j = az2.j.f97666r.b(V6.m75939xb282bd08(5));
            c6497x6ec53449.f138397w = c6497x6ec53449.b("jump_id", V6.m75945x2fec8307(16), true);
            c6497x6ec53449.f138398x = c6497x6ec53449.b("udf_kv", r26.i0.t(t17, ",", ";", false), true);
            c6497x6ec53449.f138399y = 0L;
            c6497x6ec53449.k();
            o3Var.Zk(c6497x6ec53449);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileTemplateConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
