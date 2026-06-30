package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f101339e;

    public p8(com.tencent.mm.plugin.fav.ui.y8 y8Var, t72.a aVar) {
        this.f101338d = y8Var;
        this.f101339e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.d8 d8Var = this.f101338d.f101630i;
        if (d8Var != null) {
            t72.a tagInfo = this.f101339e;
            kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "click tag content, content = " + tagInfo.field_name + ", id = " + tagInfo.field_id);
            java.lang.String field_name = tagInfo.field_name;
            kotlin.jvm.internal.o.f(field_name, "field_name");
            com.tencent.mm.plugin.fav.ui.z7 z7Var = ((com.tencent.mm.plugin.fav.ui.m7) d8Var).f101274a;
            z7Var.getClass();
            ym5.a1.f(new com.tencent.mm.plugin.fav.ui.z6(z7Var, field_name, 2, true));
            java.lang.String field_name2 = tagInfo.field_name;
            kotlin.jvm.internal.o.f(field_name2, "field_name");
            com.tencent.mm.plugin.fav.ui.z7.c(z7Var, "fav_total_filter", field_name2, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
