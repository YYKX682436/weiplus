package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class m4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI f289401d;

    public m4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f289401d = enterpriseConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r01.x cj6 = r01.q3.cj();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f289401d;
        java.lang.String d17 = cj6.d1(enterpriseConversationFmUI.f288884m);
        if (android.text.TextUtils.isEmpty(d17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", enterpriseConversationFmUI.f288884m);
            intent.addFlags(67108864);
            j45.l.j(enterpriseConversationFmUI.mo7438x76847179(), "brandservice", ".ui.EnterpriseBizSearchUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent(enterpriseConversationFmUI.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47.class);
            intent2.putExtra("enterprise_biz_name", d17);
            intent2.putExtra("enterprise_biz_father_name", enterpriseConversationFmUI.f288884m);
            intent2.putExtra("biz_chat_search_scene", 1);
            intent2.putExtra("biz_chat_search_text", "");
            intent2.addFlags(67108864);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI2 = this.f289401d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(enterpriseConversationFmUI2, arrayList.toArray(), "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            enterpriseConversationFmUI2.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
            yj0.a.f(enterpriseConversationFmUI2, "com/tencent/mm/ui/conversation/EnterpriseConversationUI$EnterpriseConversationFmUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
