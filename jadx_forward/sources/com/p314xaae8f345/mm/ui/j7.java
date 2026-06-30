package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class j7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f290533d;

    public j7(com.p314xaae8f345.mm.ui.o7 o7Var) {
        this.f290533d = o7Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert onSceneEnd " + i17 + " errCode " + i18 + " errMsg " + str + "  " + m1Var.mo808xfb85f7b0());
        com.p314xaae8f345.mm.ui.o7 o7Var = this.f290533d;
        android.app.ProgressDialog progressDialog = o7Var.f290989g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            o7Var.f290989g = null;
        }
        if (m1Var.mo808xfb85f7b0() == 255) {
            c01.d9.e().q(255, o7Var.f290991i);
            if (i17 == 0 && i18 == 0) {
                o7Var.d(true);
                return;
            } else {
                if (com.p314xaae8f345.mm.ui.pc.a(o7Var.f290983a, i17, i18, str, 4)) {
                    return;
                }
                o7Var.d(false);
                return;
            }
        }
        if (m1Var.mo808xfb85f7b0() == 384) {
            if (i17 != 0 || i18 != 0) {
                o7Var.f290990h = true;
                db5.e1.m(o7Var.f290983a, com.p314xaae8f345.mm.R.C30867xcad56011.iun, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.ui.i7(this));
                return;
            }
            c01.d9.b().p().w(77830, ((com.p314xaae8f345.mm.p957x53236a1b.l1) m1Var).H());
            android.content.Intent intent = new android.content.Intent(o7Var.f290983a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
            intent.putExtra("kintent_hint", o7Var.c(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = o7Var.f290983a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC21401x6ce6f73f, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC21401x6ce6f73f.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC21401x6ce6f73f, "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
