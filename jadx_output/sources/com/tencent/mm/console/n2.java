package com.tencent.mm.console;

/* loaded from: classes.dex */
public class n2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#RECOVERY_LAUNCH_UI");
        android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.recovery.ui.RecoveryUI");
        className.addFlags(268435456);
        className.putExtra("extra_crash_count", 3);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/console/Shell$37", "exec", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/console/Shell$37", "exec", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
