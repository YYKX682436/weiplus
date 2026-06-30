package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 f250872e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5, android.view.View view) {
        this.f250872e = abstractC18285x291d0ca5;
        this.f250871d = view;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int[] iArr = new int[2];
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5 = this.f250872e;
        rl5.r d17 = abstractC18285x291d0ca5.f250784h.d();
        android.view.View view2 = this.f250871d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = abstractC18285x291d0ca5.f250784h.f249572e;
        d17.h(view2, iVar.f251355y, iVar.f251342l, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$9");
        return true;
    }
}
