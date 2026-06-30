package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes5.dex */
public final class a6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14331x602b1603 f197710d;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14331x602b1603 c14331x602b1603) {
        this.f197710d = c14331x602b1603;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l tabOnclickListener = this.f197710d.getTabOnclickListener();
        if (tabOnclickListener != null) {
            tabOnclickListener.mo146xb9724478(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
