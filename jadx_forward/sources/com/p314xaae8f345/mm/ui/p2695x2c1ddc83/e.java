package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI f289172d;

    public e(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f289172d = appBrandServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f289172d;
        android.content.Intent intent = new android.content.Intent(appBrandServiceConversationFmUI.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21435x7826ced5.class);
        intent.putExtra("mode", 1);
        str = appBrandServiceConversationFmUI.f39530x1037e19a;
        intent.putExtra("scene_id", str);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22355xfc758206.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI2 = this.f289172d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appBrandServiceConversationFmUI2, arrayList.toArray(), "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandServiceConversationFmUI2.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(appBrandServiceConversationFmUI2, "com/tencent/mm/ui/conversation/AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
