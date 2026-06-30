package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class r9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd f214470d;

    public r9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd) {
        this.f214470d = c15287xabbcfcd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd = this.f214470d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd.a(c15287xabbcfcd);
        yz5.a clickCardCall = c15287xabbcfcd.getClickCardCall();
        if (clickCardCall != null) {
            clickCardCall.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
