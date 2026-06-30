package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class o8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182856e;

    public o8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var, java.lang.String str) {
        this.f182855d = y8Var;
        this.f182856e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e8 e8Var = this.f182855d.f183162h;
        if (e8Var != null) {
            java.lang.String type = this.f182856e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "click type content, content = ".concat(type));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h7) e8Var).f182668a;
            z7Var.getClass();
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z6(z7Var, type, 1, true));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.c(z7Var, "fav_total_filter", type, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
