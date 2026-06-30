package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f183426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f183427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o f183428f;

    public j(android.widget.ImageView imageView, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar) {
        this.f183426d = imageView;
        this.f183427e = c19782x23db1cfa;
        this.f183428f = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$4$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f183426d.getContext();
        java.lang.String m76197x6c03c64c = this.f183427e.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        java.lang.String str = m76197x6c03c64c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77502x92235c1b, 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        r45.r03 r03Var = (r45.r03) this.f183428f.f534252d;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.m75936x14adae67(16) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.o oVar = this.f183428f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
        oVar.Y6(context, (r20 & 2) != 0 ? null : e21Var, str, (r20 & 8) != 0 ? "" : jSONObject2, (r20 & 16) != 0 ? "" : "link_editnote_avatar_profile", (r20 & 32) != 0 ? 0 : 1, (r20 & 64) != 0 ? 0 : 1, (r20 & 128) != 0 ? 59 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$4$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
