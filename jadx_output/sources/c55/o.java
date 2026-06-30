package c55;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c55.p f38754d;

    public o(c55.p pVar) {
        this.f38754d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/recovery/ui/RecoveryUI$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI2 = this.f38754d.f38755d.f38757e.f38766d;
        java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
        recoveryUI2.getClass();
        d55.u.b("MicroMsg.recovery.ui", "restart WeChat", new java.lang.Object[0]);
        d55.w wVar = new d55.w(recoveryUI2.getApplication(), "recovery_statistic");
        wVar.e();
        int i17 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        boolean z18 = wVar.getBoolean("launch_recovery_real", false);
        wVar.getBoolean("recover_from_crash", false);
        int i18 = wVar.getInt("recovery_status", -1);
        int i19 = wVar.getInt("recovery_from", 0);
        int i27 = wVar.getInt("recover_internal_status", 0);
        int i28 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        wVar.g("crash_count", i17);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", z18);
        wVar.putBoolean("recover_from_crash", true);
        wVar.putInt("recovery_status", i18);
        wVar.putInt("recovery_from", i19);
        wVar.putInt("recover_internal_status", i27);
        wVar.putInt("recover_launch_mode", i28);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", false);
        wVar.putString("recover_app_ver", string);
        wVar.c();
        d55.u.a(recoveryUI2.getApplicationContext());
        android.content.Intent launchIntentForPackage = recoveryUI2.getApplication().getPackageManager().getLaunchIntentForPackage(recoveryUI2.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(launchIntentForPackage);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recoveryUI2, arrayList2.toArray(), "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            recoveryUI = recoveryUI2;
            recoveryUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(recoveryUI, "com/tencent/mm/recovery/ui/RecoveryUI", "restart", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            recoveryUI.overridePendingTransition(0, 0);
        } else {
            recoveryUI = recoveryUI2;
        }
        recoveryUI.finish();
        yj0.a.h(this, "com/tencent/mm/recovery/ui/RecoveryUI$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
