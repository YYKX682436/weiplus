package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class uf implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104704e;

    public uf(com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var) {
        this.f104703d = zfVar;
        this.f104704e = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f104704e;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        this.f104703d.u0(s0Var, itemView, (so2.h1) obj, null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshMask$1$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
