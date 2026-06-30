package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.i8 f103031d;

    public c8(com.tencent.mm.plugin.finder.convert.i8 i8Var) {
        this.f103031d = i8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f103031d.f103648f;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedEmptyConvert$setNoLbsPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
