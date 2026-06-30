package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f211984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f211985e;

    public x3(yz5.l lVar, int i17) {
        this.f211984d = lVar;
        this.f211985e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f211984d.mo146xb9724478(java.lang.Integer.valueOf(this.f211985e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$initSelectItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
