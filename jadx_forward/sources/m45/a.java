package m45;

/* loaded from: classes5.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KillProcessHelperActivity", new java.lang.Throwable("killSelf"), "killAllProcessAndStartDstIntent() called with: context = " + context, new java.lang.Object[0]);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0 c5660xf8f060d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5660xf8f060d0();
        c5660xf8f060d0.f135986g.f87891a = 0;
        c5660xf8f060d0.e();
        java.util.List n17 = sh.c.n(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) ((m3.d) it.next()).f404625a;
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (!arrayList.isEmpty()) {
            mm.g0.f410016a.d(arrayList);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2494xed8d1e6f.ActivityC19773xfc12304e.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx);
            e4Var.f293313g = 2;
            e4Var.c();
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }
}
