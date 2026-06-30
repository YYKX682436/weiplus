package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f234120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f234121e;

    public b1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, android.app.Activity activity) {
        this.f234120d = z2Var;
        this.f234121e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion$setupFaqBelowButtons$faqText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f234120d.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234018q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234019r = null;
        yo3.b.b("offlinePayShortcutFallbackFaqClick", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f234121e, "https://kf.qq.com/touch/sappfaq/260310VvqYbi260310e6rqEF.html", false);
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$Companion$setupFaqBelowButtons$faqText$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
