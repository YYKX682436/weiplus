package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes11.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279490d;

    public b(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279490d = bizChatConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279490d;
        android.content.Intent intent = new android.content.Intent(bizChatConversationFmUI.mo7438x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47.class);
        intent.putExtra("enterprise_biz_name", bizChatConversationFmUI.f279436m);
        intent.putExtra("biz_chat_search_scene", 1);
        intent.putExtra("biz_chat_search_text", "");
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI2 = this.f279490d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bizChatConversationFmUI2, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizChatConversationFmUI2.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(bizChatConversationFmUI2, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
