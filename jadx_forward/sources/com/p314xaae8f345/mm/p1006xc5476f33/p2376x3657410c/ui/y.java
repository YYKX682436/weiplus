package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class y implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 f262759a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253) {
        this.f262759a = activityC19169x32646253;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f
    public void a(nt4.f fVar, mt4.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "Pay Purchase finished: " + fVar + ", purchase: " + eVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253 = this.f262759a;
        if (activityC19169x32646253.f262639i instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "Pay Purchase finished mWallet is  GoogleWallet");
            if (eVar != null) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.c(eVar.f412836b, eVar.f412837c, eVar.f412843i, fVar.f421356a, fVar.f421357b);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c) activityC19169x32646253.f262639i;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.c(cVar.f262682j, cVar.f262681i, cVar.f262679g, fVar.f421356a, fVar.f421357b);
            }
        }
        boolean c17 = fVar.c();
        int i17 = fVar.f421356a;
        if (c17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("back to preview UI, reason: purchase finish , errCode: ");
            sb6.append(i17);
            sb6.append(" , errMsg: ");
            java.lang.String str = fVar.f421357b;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", sb6.toString());
            if (i17 == 1) {
                activityC19169x32646253.f262636f = 1001;
            } else {
                activityC19169x32646253.f262636f = 1002;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_err_code", i17);
            intent.putExtra("key_err_msg", str);
            intent.putExtra("key_launch_ts", com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c.f262672m);
            intent.putExtra("key_gw_error_code", 0);
            activityC19169x32646253.setResult(-1, intent);
            activityC19169x32646253.finish();
            return;
        }
        if (i17 == 104 || i17 == 100000002) {
            activityC19169x32646253.f262635e = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "start to restore the purchase!");
            activityC19169x32646253.f262639i.e(activityC19169x32646253, false);
            return;
        }
        if (eVar == null) {
            activityC19169x32646253.f262636f = 1002;
            android.content.Intent intent2 = new android.content.Intent();
            nt4.f a17 = nt4.f.a(6);
            intent2.putExtra("key_err_code", a17.f421356a);
            intent2.putExtra("key_err_msg", a17.f421357b);
            intent2.putExtra("key_launch_ts", com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c.f262672m);
            intent2.putExtra("key_gw_error_code", 0);
            activityC19169x32646253.setResult(-1, intent2);
            activityC19169x32646253.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "verify purchase! productId:" + eVar.f412837c + ",billNo:" + eVar.f412838d);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(activityC19169x32646253.f262640m.a(eVar, false));
        activityC19169x32646253.f262635e = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "showLoadingDialog!");
        activityC19169x32646253.f262641n = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(activityC19169x32646253, activityC19169x32646253.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.a0(activityC19169x32646253));
    }
}
