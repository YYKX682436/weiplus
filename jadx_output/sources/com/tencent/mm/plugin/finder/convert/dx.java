package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class dx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ex f103206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n6 f103207e;

    public dx(com.tencent.mm.plugin.finder.convert.ex exVar, so2.n6 n6Var) {
        this.f103206d = exVar;
        this.f103207e = n6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderTextModConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f103206d.f103310e.invoke(this.f103207e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderTextModConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
