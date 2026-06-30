package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 f198345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.v2 f198346e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590, so2.v2 v2Var) {
        this.f198345d = c14298xca26f590;
        this.f198346e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590.f197313x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14298xca26f590 c14298xca26f590 = this.f198345d;
        c14298xca26f590.getClass();
        android.content.Intent intent = new android.content.Intent();
        so2.v2 v2Var = this.f198346e;
        intent.putExtra("nearby_live_enter_from_live_end_liveid_key", pm0.v.u(v2Var.f492192n.m75942xfb822ef2(0)));
        ws5.j[] jVarArr = ws5.j.f530751d;
        intent.putExtra("nearby_live_enter_source_params_key", 6);
        intent.putExtra("nearby_live_disable_clean_red_params_key", true);
        intent.putExtra("nearby_live_preload_cache_business_params_key", "liveEndPage");
        intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
        r45.la2 la2Var = v2Var.f492200v;
        if (la2Var != null && (m75934xbce7f2f = la2Var.m75934xbce7f2f(2)) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", m75934xbce7f2f.g());
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Context context = c14298xca26f590.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((v40.s) nVar).wi(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
