package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes3.dex */
public final class b8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f f242395d;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f) {
        this.f242395d = activityC17414x34d8ac5f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = this.f242395d;
        android.content.Intent intent = new android.content.Intent(activityC17414x34d8ac5f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17458xf546b9e7.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f2 = this.f242395d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17414x34d8ac5f2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17414x34d8ac5f2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17414x34d8ac5f2, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$updateOptionMenu$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.i(activityC17414x34d8ac5f);
        return true;
    }
}
