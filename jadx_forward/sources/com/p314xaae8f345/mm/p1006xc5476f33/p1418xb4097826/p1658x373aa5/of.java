package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class of implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf f214320d;

    public of(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf rfVar) {
        this.f214320d = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderMusicTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf rfVar = this.f214320d;
        android.view.View.OnClickListener onClickListener = rfVar.f214487c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        rfVar.dismiss();
        android.view.View contentView = rfVar.getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qf(rfVar.f214491g));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderMusicTipsBubbleWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
