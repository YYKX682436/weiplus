package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233365d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233365d = c16693xf5eb90b6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.z2 eventListener = this.f233365d.getEventListener();
        if (eventListener != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1) eventListener).f232747a.S6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
