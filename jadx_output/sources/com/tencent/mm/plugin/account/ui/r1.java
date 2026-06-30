package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class r1 {
    public r1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.app.Activity ui6, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (com.tencent.mars.comm.NetStatusUtil.isMobileEnabled(ui6)) {
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(ui6, ui6.getString(com.tencent.mm.R.string.ggc), false, 0, null);
            r45.gn4 gn4Var = r45.gn4.kMobileType_Mask;
            com.tencent.mm.plugin.account.ui.q1 q1Var = new com.tencent.mm.plugin.account.ui.q1(f17, ui6, intent);
            u61.o oVar = u61.o.f424924a;
            kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new u61.m(q1Var, ui6, gn4Var, null), 2, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GateWayMobileUI", "tryStartGateWayActivity isMobileEnabled false! skip");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(ui6, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion", "tryStartGateWayActivity", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(ui6, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion", "tryStartGateWayActivity", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
