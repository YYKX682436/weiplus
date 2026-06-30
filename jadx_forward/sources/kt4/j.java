package kt4;

/* loaded from: classes9.dex */
public class j extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393569c = rVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        this.f393569c.f(this.f420366a, bundle);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        int intValue = ((java.lang.Integer) objArr[0]).intValue();
        kt4.r rVar = this.f393569c;
        np5.b0 b0Var = this.f420367b;
        if (intValue == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "onNext do ecard auth");
            int intValue2 = ((java.lang.Integer) objArr[1]).intValue();
            java.lang.String str = (java.lang.String) objArr[2];
            b0Var.c(1958);
            b0Var.a(new jt4.i(kt4.r.F(rVar), null, intValue2, str), true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "onNext do ecard open");
            int intValue3 = ((java.lang.Integer) objArr[1]).intValue();
            b0Var.c(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
            b0Var.a(new jt4.h(kt4.r.F(rVar), rVar.H(), intValue3), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof jt4.i;
        np5.b0 b0Var = this.f420367b;
        kt4.r rVar = this.f393569c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (z17) {
            b0Var.i(1958);
            jt4.i iVar = (jt4.i) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.oz4 oz4Var = iVar.f383192f;
                if (oz4Var.f464156d == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "req_serial: %s", iVar.f383192f.f464159g);
                    rVar.f295334c.putString("key_req_serial", iVar.f383192f.f464159g);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "authScene.token: %s, is_token_invalid: %s, is_reuse_existing_ecard: %s", null, java.lang.Boolean.valueOf(iVar.f383192f.f464161i), java.lang.Boolean.valueOf(iVar.f383192f.f464162m));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                        bundle.putBoolean("key_is_token_invalid", iVar.f383192f.f464161i);
                    }
                    if (iVar.f383192f.f464162m) {
                        bundle.putBoolean("key_is_reuse_existing_ecard", true);
                    }
                    bundle.putInt("key_ecard_proxy_action", 1);
                    rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
                } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, oz4Var.f464160h)) {
                    int i19 = iVar.f383193g;
                    java.lang.String str2 = iVar.f383194h;
                    r45.oz4 oz4Var2 = iVar.f383192f;
                    if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, iVar, i19, str2, oz4Var2.f464156d, oz4Var2.f464157e)) {
                        db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, iVar.f383192f.f464157e, iVar.f383194h, str), "", false, new kt4.f(this));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", iVar);
                db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false, new kt4.g(this));
            }
            return true;
        }
        if (!(m1Var instanceof jt4.h)) {
            return false;
        }
        b0Var.i(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
        jt4.h hVar = (jt4.h) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.qz4 qz4Var = hVar.f383184f;
            if (qz4Var.f465899d == 0) {
                rVar.f295334c.putInt("key_select_card_action", 1);
                rVar.f295334c.putString("key_bind_card_no", hVar.f383185g);
                rVar.f295334c.putString("key_bind_mobile_no", hVar.f383186h);
                rVar.f295334c.putString("key_bind_bank_type", hVar.f383187i);
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (hVar.f383184f.f465905m != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "no need verify sms");
                    bundle2.putBoolean("key_need_verify_sms", false);
                    try {
                        rVar.f295334c.putByteArray("key_open_card_finish_title", hVar.f383184f.f465905m.mo14344x5f01b1f6());
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "need verfiy sms");
                    bundle2.putBoolean("key_need_verify_sms", true);
                    bundle2.putString("key_open_card_bind_token", hVar.f383184f.f465902g);
                    bundle2.putString("key_open_card_verify_msg_desc", hVar.f383184f.f465903h);
                }
                bundle2.putInt("key_ecard_proxy_action", 2);
                rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle2);
            } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, qz4Var.f465904i)) {
                int i27 = hVar.f383188m;
                java.lang.String str3 = hVar.f383189n;
                r45.qz4 qz4Var2 = hVar.f383184f;
                if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, hVar, i27, str3, qz4Var2.f465899d, qz4Var2.f465900e)) {
                    db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, hVar.f383184f.f465900e, hVar.f383189n, str), "", false, new kt4.h(this));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
            db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false, new kt4.i(this));
        }
        return true;
    }
}
