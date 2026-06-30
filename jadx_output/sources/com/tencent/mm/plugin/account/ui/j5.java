package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class j5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginHistoryUI f73949d;

    public j5(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        this.f73949d = loginHistoryUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "db dangerous and auto logout");
        int i18 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = this.f73949d;
        loginHistoryUI.getClass();
        com.tencent.mm.sdk.platformtools.c3.b("welcome_page_show");
        gm0.k2.a(loginHistoryUI, true);
        com.tencent.mm.autogen.events.BackupProcessMgrExitEvent backupProcessMgrExitEvent = new com.tencent.mm.autogen.events.BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f53993g.f6990a = false;
        backupProcessMgrExitEvent.e();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).e();
        loginHistoryUI.finish();
        androidx.appcompat.app.AppCompatActivity context = loginHistoryUI.getContext();
        com.tencent.mars.xlog.Log.appenderFlush();
        com.tencent.mm.sdk.platformtools.MMNativeJpeg.Destroy();
        try {
            android.content.Intent intent2 = new android.content.Intent();
            java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
            intent = intent2.setClass(context, com.tencent.mm.ui.LauncherUI.class);
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e17, "", new java.lang.Object[0]);
            intent = null;
        }
        intent.addFlags(67108864);
        intent.putExtra("absolutely_exit_pid", android.os.Process.myPid());
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "exitApplication", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "exitApplication", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
