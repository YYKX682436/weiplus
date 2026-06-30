package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes11.dex */
public final class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13306x6efad547 f179632d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13306x6efad547 c13306x6efad547) {
        this.f179632d = c13306x6efad547;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.f179372f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13306x6efad547 c13306x6efad547 = this.f179632d;
        android.content.Context m7550xf0c4608a = c13306x6efad547.m7550xf0c4608a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7550xf0c4608a, "requireContext(...)");
        java.lang.String str = c13306x6efad547.f179322e;
        if (str == null) {
            return true;
        }
        android.content.Intent intent = new android.content.Intent(m7550xf0c4608a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.class);
        intent.putExtra("type", "type_sort_ip_set");
        intent.putExtra("ip_set_key", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m7550xf0c4608a, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m7550xf0c4608a.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m7550xf0c4608a, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpSort", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
