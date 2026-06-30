package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public final class nc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 f242890d;

    public nc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592) {
        this.f242890d = activityC17424x53509592;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x53509592 = this.f242890d;
        android.content.Intent intent = new android.content.Intent(activityC17424x53509592, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17426xe0b6118f.class);
        intent.putExtra("result_code", 0);
        intent.putExtra("audio_test_abandon", true);
        intent.addFlags(603979776);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17424x53509592 activityC17424x535095922 = this.f242890d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17424x535095922, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17424x535095922.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17424x535095922, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI$onCreate$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17424x53509592.finish();
        return false;
    }
}
