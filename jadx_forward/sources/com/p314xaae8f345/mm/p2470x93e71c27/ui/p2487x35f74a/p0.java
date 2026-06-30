package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272807d;

    public p0(android.content.Context context) {
        this.f272807d = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + menuItem.getTitle().toString().replace(" ", "").replace("(", "").replace(")", "").replace("-", "")));
        intent.addFlags(268435456);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(this.f272807d, intent, true, false)) {
            try {
                android.content.Context context = this.f272807d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper$5", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
