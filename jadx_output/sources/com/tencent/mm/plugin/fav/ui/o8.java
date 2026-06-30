package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class o8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101323e;

    public o8(com.tencent.mm.plugin.fav.ui.y8 y8Var, java.lang.String str) {
        this.f101322d = y8Var;
        this.f101323e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.e8 e8Var = this.f101322d.f101629h;
        if (e8Var != null) {
            java.lang.String type = this.f101323e;
            kotlin.jvm.internal.o.g(type, "type");
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "click type content, content = ".concat(type));
            com.tencent.mm.plugin.fav.ui.z7 z7Var = ((com.tencent.mm.plugin.fav.ui.h7) e8Var).f101135a;
            z7Var.getClass();
            ym5.a1.f(new com.tencent.mm.plugin.fav.ui.z6(z7Var, type, 1, true));
            com.tencent.mm.plugin.fav.ui.z7.c(z7Var, "fav_total_filter", type, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
