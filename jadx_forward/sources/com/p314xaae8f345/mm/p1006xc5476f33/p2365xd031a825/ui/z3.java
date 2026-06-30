package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 f262354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 f262355e;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8) {
        this.f262355e = activityC19112x755f8362;
        this.f262354d = c5820xc13f26f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback");
        am.pn pnVar = this.f262354d.f136129h;
        if (pnVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, result == null");
            return;
        }
        int i17 = pnVar.f89168a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362 = this.f262355e;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "hy: payInfo soterAuthReq: %s", pnVar.f89172e);
            activityC19112x755f8362.f261514f.setVisibility(8);
            java.lang.String str = pnVar.f89172e;
            activityC19112x755f8362.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "do check pwd by fp");
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.put("soter_type", "1");
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.WalletCheckPwdUI", e17, "", new java.lang.Object[0]);
            }
            activityC19112x755f8362.m83099x5406100e(new ss4.y(activityC19112x755f8362.f261521p, 1, str), true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15021, 2);
            re4.n.f(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletCheckPwdUI", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = currentTimeMillis - activityC19112x755f8362.f261525t;
        if (i18 > 1) {
            activityC19112x755f8362.f261525t = currentTimeMillis;
            activityC19112x755f8362.f261524s++;
        }
        boolean z17 = i17 == 2 || i17 == 10308;
        boolean z18 = pnVar.f89173f == 2;
        int i19 = activityC19112x755f8362.f261524s;
        if ((z18 || (activityC19112x755f8362.f261524s < 3 && i18 > 1)) && !z17) {
            if (activityC19112x755f8362.f261530y == null) {
                activityC19112x755f8362.f261530y = na5.e.a(activityC19112x755f8362.mo55332x76847179());
            }
            activityC19112x755f8362.f261514f.setVisibility(0);
            activityC19112x755f8362.f261514f.startAnimation(activityC19112x755f8362.f261530y);
            activityC19112x755f8362.f261530y.setFillAfter(true);
            re4.n.f(1);
            return;
        }
        if (activityC19112x755f8362.f261524s >= 3 || z17) {
            activityC19112x755f8362.U6();
            activityC19112x755f8362.f261523r = 0;
            activityC19112x755f8362.Z6();
            activityC19112x755f8362.f261517i.setVisibility(8);
            re4.n.f(2);
        }
    }
}
