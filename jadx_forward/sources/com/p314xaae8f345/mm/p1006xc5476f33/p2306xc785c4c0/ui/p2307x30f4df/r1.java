package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 f256609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f256610e;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d9084, yz5.a aVar) {
        this.f256609d = c18766xb71d9084;
        this.f256610e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryTabBubbleUIC$doShowTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f256609d.dismiss();
        this.f256610e.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryTabBubbleUIC$doShowTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
