package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class c3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17391x3253e9bd f242430d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17391x3253e9bd activityC17391x3253e9bd) {
        this.f242430d = activityC17391x3253e9bd;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17391x3253e9bd activityC17391x3253e9bd = this.f242430d;
        activityC17391x3253e9bd.mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17391x3253e9bd activityC17391x3253e9bd2 = this.f242430d;
        android.content.Intent intent = new android.content.Intent(activityC17391x3253e9bd, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17392x4d0d73c6.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17391x3253e9bd2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17391x3253e9bd2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17391x3253e9bd2, "com/tencent/mm/plugin/setting/ui/setting/SettingDeleteAccountInputPassUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
