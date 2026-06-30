package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l f262112d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar) {
        this.f262112d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar = this.f262112d;
        android.app.Dialog dialog = lVar.f261922i;
        if (dialog != null && dialog.isShowing()) {
            lVar.f261922i.dismiss();
            lVar.f261922i = null;
        }
        if (lVar.f261918e.r2()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "!contact.isContact() close page");
        java.lang.String d17 = lVar.f261918e.d1();
        c01.w9.h(d17, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p(this, d17));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(d17, 15);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.hj().y0(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.nj().D0(d17);
        ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
        r01.q3.oj().z0(d17);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        android.app.Activity activity = (android.app.Activity) lVar.f261917d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$4", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
