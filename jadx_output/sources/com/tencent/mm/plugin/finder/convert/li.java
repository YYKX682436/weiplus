package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103930d;

    public li(com.tencent.mm.plugin.finder.convert.oj ojVar) {
        this.f103930d = ojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103930d;
        yz5.l lVar = ojVar.f104183e;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(ojVar.f104196u));
        }
        ojVar.C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
