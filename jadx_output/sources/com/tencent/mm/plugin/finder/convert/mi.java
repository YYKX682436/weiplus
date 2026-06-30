package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f104005e;

    public mi(com.tencent.mm.plugin.finder.convert.oj ojVar, int i17) {
        this.f104004d = ojVar;
        this.f104005e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindRecommendCardFeed$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f104004d.f104183e;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.f104005e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindRecommendCardFeed$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
