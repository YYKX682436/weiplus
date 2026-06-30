package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class r1 {
    public r1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.app.Activity ui6, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40086x22b94f35(ui6)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(ui6, ui6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
            r45.gn4 gn4Var = r45.gn4.kMobileType_Mask;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q1 q1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q1(f17, ui6, intent);
            u61.o oVar = u61.o.f506457a;
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.f515113a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new u61.m(q1Var, ui6, gn4Var, null), 2, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GateWayMobileUI", "tryStartGateWayActivity isMobileEnabled false! skip");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(ui6, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion", "tryStartGateWayActivity", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ui6.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(ui6, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion", "tryStartGateWayActivity", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
