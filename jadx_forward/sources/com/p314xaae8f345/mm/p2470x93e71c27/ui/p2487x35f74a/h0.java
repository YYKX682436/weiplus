package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f272748f;

    public h0(android.content.Context context, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f272746d = context;
        this.f272747e = str;
        this.f272748f = onDismissListener;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f272746d;
        java.lang.String str = this.f272747e;
        if (itemId != 0) {
            if (itemId == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.a(context, str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10114, "1");
            }
        } else if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.b()) {
            android.content.Context context2 = this.f272746d;
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/pluginsdk/ui/span/MailPhoneMenuHelper", "phoneCreateContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MailPhoneMenuHelper", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10113, "1");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.a(context, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10114, "1");
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f272748f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
