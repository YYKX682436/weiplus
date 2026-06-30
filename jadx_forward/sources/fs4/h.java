package fs4;

/* loaded from: classes9.dex */
public class h extends qs4.b {

    /* renamed from: d, reason: collision with root package name */
    public fs4.g f347874d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.s f347875e;

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        this.f295334c.putBoolean("key_is_oversea", !vr4.f1.wi().Ai().t());
        this.f295334c.putInt("key_support_bankcard", vr4.f1.wi().Ai().t() ? 1 : 2);
        this.f295334c.putBoolean("key_is_forgot_process", true);
        boolean z17 = bundle.getBoolean("isFromKinda");
        boolean z18 = bundle.getBoolean("isDomesticUser");
        if (vr4.f1.wi().Ai().t() || (z17 && z18)) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9.class, bundle);
        } else {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.class, bundle);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "ForgotPwdProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (vr4.f1.wi().Ai().t()) {
            i(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9.class, -1, false);
            fs4.g gVar = this.f347874d;
            if (gVar != null) {
                gVar.run(0);
                return;
            }
            return;
        }
        i(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.class, -1, false);
        fs4.g gVar2 = this.f347874d;
        if (gVar2 != null) {
            gVar2.run(-1);
        }
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55) {
            if (bundle.containsKey("key_is_force_bind") && bundle.getBoolean("key_is_force_bind")) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19045x633b9f6.class, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) {
            if (r()) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            f(activity, bundle);
            return;
        }
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986)) {
            a("startActivity2", activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7.class, bundle, "flag: 67108864");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7.class);
            intent.putExtra("process_id", fs4.h.class.hashCode());
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (bundle != null) {
                this.f295334c.putAll(bundle);
            }
            this.f295334c.getInt("key_support_bankcard", 1);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9) {
            if (!bundle.containsKey("key_is_support_face") || bundle.getInt("key_is_support_face") != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "forward not support face");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.class, bundle);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "forward support face");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15774, java.lang.Integer.valueOf(this.f295334c.getInt("key_forgot_scene", 1)), 1);
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19046x61d110b1) {
            if (bundle.containsKey("key_select_bank_card") && bundle.getBoolean("key_select_bank_card")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "forward select bankcard");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55.class, bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "forward after face check");
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19047xd92a1b55) {
            return new fs4.a(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9) {
            return new fs4.b(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7) {
            return new fs4.c(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            return new fs4.d(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            return new fs4.e(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public int q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f575062km1;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950;
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean w(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17, java.lang.String str) {
        if (i17 != 404) {
            return false;
        }
        db5.e1.E(abstractActivityC22902xe37969e, str, null, abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575062km1), false, new fs4.f(this, abstractActivityC22902xe37969e));
        return true;
    }
}
