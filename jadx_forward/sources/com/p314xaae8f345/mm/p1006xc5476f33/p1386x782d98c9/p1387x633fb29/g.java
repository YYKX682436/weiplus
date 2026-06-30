package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public final class g implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k f180438d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar) {
        this.f180438d = kVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        byte[] mo14344x5f01b1f6;
        m1Var.m48017xd0f4c159(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.k kVar = this.f180438d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "cdnMsg, onSceneEnd, errType(%d) errCode(%d) errMsg(%s). release %b", valueOf, valueOf2, str, java.lang.Boolean.valueOf(kVar.f180486j));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.q2) m1Var;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExDeviceSendIotLogic", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (kVar.f180486j) {
                return;
            }
            if (i18 == -125) {
                r45.yf4 yf4Var = q2Var.H().f473790f;
                com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = q2Var.f180580f;
                if (yf4Var == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q2Var.H().f473790f.f472572d, "")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(c10597xb1f0d2.f148119d, "send_data_failed");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.m(c10597xb1f0d2.f148119d, "send_data_failed", q2Var.H().f473790f.mo14344x5f01b1f6());
                }
            } else {
                r45.yf4 yf4Var2 = q2Var.H().f473790f;
                com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d22 = q2Var.f180580f;
                if (yf4Var2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q2Var.H().f473790f.f472572d, "")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(c10597xb1f0d22.f148119d, "send_data_failed");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.m(c10597xb1f0d22.f148119d, "send_data_failed", q2Var.H().f473790f.mo14344x5f01b1f6());
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Zi().y0(kVar.f180477a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "cdn navigate_to_miniprogram: " + q2Var.H().f473788d);
        boolean z17 = q2Var.H().f473788d;
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d23 = q2Var.f180580f;
        if (!z17) {
            r45.yf4 yf4Var3 = q2Var.H().f473790f;
            r45.fu5 fu5Var = q2Var.H().f473791g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "cdn wordingInfo: " + yf4Var3 + ", ssv: " + fu5Var);
            java.lang.String str2 = c10597xb1f0d23.f148119d;
            byte[] mo14344x5f01b1f62 = yf4Var3 != null ? yf4Var3.mo14344x5f01b1f6() : null;
            mo14344x5f01b1f6 = fu5Var != null ? fu5Var.mo14344x5f01b1f6() : null;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597 c5368x6276f597 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597();
            am.z6 z6Var = c5368x6276f597.f135698g;
            z6Var.f90052a = "send_data_sucess";
            z6Var.f90054c = str2;
            z6Var.f90055d = mo14344x5f01b1f62;
            z6Var.f90057f = mo14344x5f01b1f6;
            c5368x6276f597.e();
            return;
        }
        r45.xf4 xf4Var = q2Var.H().f473789e;
        java.lang.String str3 = xf4Var.f471583e;
        java.lang.String str4 = xf4Var.f471584f;
        int i19 = xf4Var.f471585g;
        java.lang.String str5 = xf4Var.f471582d;
        r45.yf4 yf4Var4 = q2Var.H().f473790f;
        r45.fu5 fu5Var2 = q2Var.H().f473791g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExDeviceSendIotLogic", "mfr appid: " + str3 + ", path: " + str4 + ", env: " + i19 + ", args:" + str5);
        java.lang.String str6 = c10597xb1f0d23.f148119d;
        byte[] mo14344x5f01b1f63 = yf4Var4 != null ? yf4Var4.mo14344x5f01b1f6() : null;
        byte[] mo14344x5f01b1f64 = xf4Var.mo14344x5f01b1f6();
        mo14344x5f01b1f6 = fu5Var2 != null ? fu5Var2.mo14344x5f01b1f6() : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597 c5368x6276f5972 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597();
        am.z6 z6Var2 = c5368x6276f5972.f135698g;
        z6Var2.f90052a = "send_data_sucess";
        z6Var2.f90054c = str6;
        z6Var2.f90056e = mo14344x5f01b1f64;
        z6Var2.f90055d = mo14344x5f01b1f63;
        z6Var2.f90057f = mo14344x5f01b1f6;
        c5368x6276f5972.e();
    }
}
