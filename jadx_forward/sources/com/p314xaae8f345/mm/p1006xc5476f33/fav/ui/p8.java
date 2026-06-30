package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f182872e;

    public p8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, t72.a aVar) {
        this.f182871d = y8Var;
        this.f182872e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d8 d8Var = this.f182871d.f183163i;
        if (d8Var != null) {
            t72.a tagInfo = this.f182872e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "click tag content, content = " + tagInfo.f68044x225f1eb0 + ", id = " + tagInfo.f68043xc8a07680);
            java.lang.String field_name = tagInfo.f68044x225f1eb0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m7) d8Var).f182807a;
            z7Var.getClass();
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z6(z7Var, field_name, 2, true));
            java.lang.String field_name2 = tagInfo.f68044x225f1eb0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name2, "field_name");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.c(z7Var, "fav_total_filter", field_name2, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
