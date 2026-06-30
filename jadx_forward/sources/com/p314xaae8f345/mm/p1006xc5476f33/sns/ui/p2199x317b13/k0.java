package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f250901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f250902e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        this.f250901d = baseViewHolder;
        this.f250902e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f250901d;
        if (baseViewHolder.f38400x3172ed && (c17989x79511098 = baseViewHolder.T) != null && c17989x79511098.g(0) != null && this.f250902e == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.PhotoTimeLineItem", "on ad content click");
            baseViewHolder.T.g(0).performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$3");
    }
}
