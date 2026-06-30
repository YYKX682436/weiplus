package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dd2 f198321e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590, r45.dd2 dd2Var) {
        this.f198320d = c14298xca26f590;
        this.f198321e = dd2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590.f197313x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f198320d;
        c14298xca26f590.getClass();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.i4 i4Var = ml2.i4.f409100o;
        y4Var.getClass();
        y4Var.I = i4Var;
        r45.qt2 qt2Var = c14298xca26f590.reportObj;
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "#gotoMoreLiveImpl contextId:".concat(str));
        java.util.HashMap hashMap = new java.util.HashMap();
        r45.dd2 dd2Var = this.f198321e;
        if (dd2Var == null || (str2 = java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)).toString()) == null) {
            str2 = "";
        }
        hashMap.put("tab_id", str2);
        ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
        android.content.Context context = c14298xca26f590.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.content.Intent intent = new android.content.Intent();
        if (dd2Var != null) {
            intent.putExtra("nearby_live_target_square_page_params_key", dd2Var.mo14344x5f01b1f6());
        }
        intent.putExtra("key_context_id", str);
        ws5.j[] jVarArr = ws5.j.f530751d;
        intent.putExtra("nearby_live_enter_source_params_key", 6);
        ((wo2.k) gVar).Bi(context, intent);
        r45.qt2 qt2Var2 = c14298xca26f590.reportObj;
        java.lang.String str3 = (qt2Var2 == null || (m75945x2fec8307 = qt2Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("page_id", "1002");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.O1, hashMap2, str3, null, null, null, false, 120, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndRecommendLiveMoreClicked report23059, page_id = " + ((java.lang.String) hashMap2.get("page_id")) + '}');
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
