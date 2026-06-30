package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class vn implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm f229117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co f229118e;

    public vn(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar) {
        this.f229118e = coVar;
        this.f229117d = zmVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = this.f229117d;
        if (zmVar.f229326b != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = this.f229118e;
            int m8186xceeefb69 = coVar.m8186xceeefb69();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d.V6(coVar.M, m8186xceeefb69);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "longclick normalVh realPos : %s ，mSelectPos：%s", java.lang.Integer.valueOf(m8186xceeefb69), java.lang.Integer.valueOf(coVar.M.f228067v));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co.o(coVar, view, 1, zmVar.f229326b.f471033f);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
