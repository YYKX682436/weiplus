package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zt implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.bu f105125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f105126f;

    public zt(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.bu buVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f105124d = s0Var;
        this.f105125e = buVar;
        this.f105126f = recyclerView;
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
        in5.s0 s0Var = this.f105124d;
        so2.d5 d5Var = (so2.d5) s0Var.f293125i;
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = d5Var.f410314d.getString(0);
        java.lang.String str = string == null ? "" : string;
        r45.r03 r03Var = d5Var.f410314d;
        long j17 = r03Var.getLong(1);
        r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
        java.lang.String str2 = null;
        java.lang.String str3 = (r23Var == null || (rz6Var2 = (r45.rz6) r23Var.getCustom(1)) == null) ? null : rz6Var2.f385320d;
        java.lang.String str4 = str3 == null ? "" : str3;
        boolean b17 = kotlin.jvm.internal.o.b(this.f105125e.f102998e, java.lang.Boolean.TRUE);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y2Var.Y(context, 1, str, j17, 0L, str4, null, b17, xy2.c.e(context));
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            jz5.g b18 = jz5.h.b(new com.tencent.mm.plugin.finder.convert.yt(s0Var));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("page_type", "profile_mj_template");
                r45.r23 r23Var2 = (r45.r23) r03Var.getCustom(23);
                if (r23Var2 != null && (rz6Var = (r45.rz6) r23Var2.getCustom(1)) != null) {
                    str2 = rz6Var.f385320d;
                }
                jSONObject.put("templateid", str2 == null ? "" : str2);
                jSONObject.put("finderusername", (java.lang.String) ((jz5.n) b18).getValue());
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("Finder.ProfileTemplateConvert", e17.getMessage());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f105126f;
            kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
            com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct finderFlowClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderFlowClickStruct();
            finderFlowClickStruct.f56845d = V6.getInteger(5);
            finderFlowClickStruct.f56846e = finderFlowClickStruct.b("SessionId", V6.getString(0), true);
            finderFlowClickStruct.f56847f = finderFlowClickStruct.b("ContextId", V6.getString(1), true);
            finderFlowClickStruct.f56848g = finderFlowClickStruct.b("ClickTabContextId", V6.getString(2), true);
            finderFlowClickStruct.f56852k = c01.id.c();
            java.lang.String string2 = V6.getString(9);
            finderFlowClickStruct.f56853l = finderFlowClickStruct.b("PageTag", string2 != null ? r26.i0.t(string2, ",", ";", false) : "", true);
            java.lang.String gVar = o3Var.kk().toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            finderFlowClickStruct.f56856o = finderFlowClickStruct.b("ScreenInfo", r26.i0.t(gVar, ",", ";", false), true);
            java.lang.String jSONArray = o3Var.ck(recyclerView).toString();
            kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
            finderFlowClickStruct.f56850i = finderFlowClickStruct.b("AllFeedInfo", r26.i0.t(jSONArray, ",", ";", false), true);
            finderFlowClickStruct.f56851j = az2.j.f16133r.b(V6.getInteger(5));
            finderFlowClickStruct.f56864w = finderFlowClickStruct.b("jump_id", V6.getString(16), true);
            finderFlowClickStruct.f56865x = finderFlowClickStruct.b("udf_kv", r26.i0.t(t17, ",", ";", false), true);
            finderFlowClickStruct.f56866y = 0L;
            finderFlowClickStruct.k();
            o3Var.Zk(finderFlowClickStruct);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileTemplateConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
