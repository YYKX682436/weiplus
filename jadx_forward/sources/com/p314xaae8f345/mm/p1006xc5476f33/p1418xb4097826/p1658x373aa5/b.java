package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c f213218d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c cVar) {
        this.f213218d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/AnchorHideNoticeGuideView$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c cVar = this.f213218d;
        yz5.a aVar = cVar.f213274h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        cVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/AnchorHideNoticeGuideView$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
