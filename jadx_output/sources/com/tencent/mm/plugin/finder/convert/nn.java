package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104114e;

    public nn(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var) {
        this.f104113d = ynVar;
        this.f104114e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f104114e;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        kotlin.jvm.internal.o.d(view);
        this.f104113d.n0(s0Var, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, view, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
