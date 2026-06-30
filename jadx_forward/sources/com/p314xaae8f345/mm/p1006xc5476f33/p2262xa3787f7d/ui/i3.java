package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 f254564d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 activityC18578x68ca6165) {
        this.f254564d = activityC18578x68ca6165;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165.f254365s;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 activityC18578x68ca6165 = this.f254564d;
        activityC18578x68ca6165.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(activityC18578x68ca6165, "com.tencent.mm.ui.LauncherUI", intent, null);
        activityC18578x68ca6165.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsSysTeenModeIntro$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
