package uw;

/* loaded from: classes.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f513031d;

    public m(android.content.Context context) {
        this.f513031d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f513031d;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandecs/util/BrsNotificationPushUtils", "gotoSystemAppSettingsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/brandecs/util/BrsNotificationPushUtils", "gotoSystemAppSettingsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrsNotificationPushUtils", "gotoSystemAppSettingsPage error: " + e17.getMessage());
        }
        uw.p.a(uw.p.f513034a, 1);
        dialogInterface.dismiss();
    }
}
