package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class cb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 f213303d;

    public cb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1) {
        this.f213303d = c15298x95ee76f1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lx2.d dVar = this.f213303d.f212676d;
        if (dVar != null) {
            dVar.h();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
