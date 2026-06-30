package qz2;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f449373d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f449374e = true;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess start,forward to WalletCheckPwdUI");
        this.f449374e = bundle.getBoolean("key_show_succ_toast");
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        f(activity, new android.os.Bundle());
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "FingerprintAuth";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthProcess", "FingerPrintAuthProcess end");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f449373d)) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putString("token", this.f449373d);
        }
        if (this.f295334c.getInt("open_scene", 0) == 1) {
            k(activity, "wallet", ".pwd.ui.WalletBiometricPaySettingsUI", 0, intent, true);
        } else {
            l(activity, 0, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362)) {
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000) {
                f(activity, bundle);
                return;
            } else {
                if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d) {
                    f(activity, bundle);
                    return;
                }
                return;
            }
        }
        if (bundle != null) {
            this.f449373d = bundle.getString("key_bind_card_user_token", "");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthProcess", "forward to FingerPrintAuthUI");
        if (this.f295334c.getInt("key_open_biometric_type") != 1) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("key_scene", 0);
            bundle2.putBoolean("key_show_succ_toast", this.f449374e);
            C(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d.class, bundle, bundle2);
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_soter_adopt_to_android12_by_device, 0) == 1 || bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthProcess", "use biometric prompt: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15527x50898ce0.class, bundle);
            return;
        }
        if (bundle != null) {
            bundle.putBoolean("key_show_succ_toast", this.f449374e);
        }
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15524xc77ba000.class, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new qz2.a(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
