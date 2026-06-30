package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w f252083d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w wVar) {
        this.f252083d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.w wVar = this.f252083d;
        wVar.f252260d = vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.v vVar2 = wVar.f252260d;
        wVar.a(vVar2.f252139b, vVar2.f252138a);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$SnsEventListeners$3");
    }
}
