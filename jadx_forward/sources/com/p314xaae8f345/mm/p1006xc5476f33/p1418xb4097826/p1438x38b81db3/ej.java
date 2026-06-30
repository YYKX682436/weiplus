package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ej implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184799e;

    public ej(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, int i17) {
        this.f184798d = ojVar;
        this.f184799e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsSwipeUpContainer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f184798d.f185716e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f184799e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsSwipeUpContainer$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
