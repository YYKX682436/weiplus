package fu4;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void c(android.app.Activity activity, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("action", "action.verify_paypwd");
        intent.putExtra("next_action", "next_action.switch_on_pattern");
        intent.putExtra("key_wallet_lock_type", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockImpl", "enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", java.lang.Integer.valueOf(i17));
        j45.l.n(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
        am.n10 n10Var = c6244x161a780f.f136493g;
        n10Var.f88925a = 1;
        n10Var.f88926b = activity;
        c6244x161a780f.e();
        int intValue = ((java.lang.Integer) c6244x161a780f.f136494h.f89038a).intValue();
        if (intValue != 17) {
            if (intValue == 18 && eVar != null) {
                eVar.a();
                return;
            }
            return;
        }
        if (fVar == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i) fVar).a(activity)) {
            if (eVar != null) {
                eVar.b();
            }
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.class);
            intent.addFlags(131072);
            intent.putExtra("action", "action.verify_pattern");
            intent.putExtra("next_action", "next_action.goto_protected_page");
            intent.putExtra("page_intent", activity.getIntent());
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, m(activity));
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnResume", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GestureGuardCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void g(android.app.Activity activity) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public void h(android.app.Activity activity, int i17) {
        if (i17 != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("action", "action.verify_paypwd");
        intent.putExtra("next_action", "next_action.switch_on_pattern");
        intent.putExtra("key_wallet_lock_type", 2);
        j45.l.j(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public cu4.f i() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i.f262898a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    /* renamed from: init */
    public void mo74014x316510() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        lVar.l(true);
        lVar.m(2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.a, cu4.g
    public boolean k(android.app.Activity activity, cu4.f fVar) {
        if (fVar != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i) fVar).a(activity)) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f c6244x161a780f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6244x161a780f();
        am.n10 n10Var = c6244x161a780f.f136493g;
        n10Var.f88925a = 0;
        n10Var.f88926b = activity;
        c6244x161a780f.e();
        if (((java.lang.Integer) c6244x161a780f.f136494h.f89038a).intValue() != 17) {
            return false;
        }
        if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).Ai()) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24834x6e6d756f(activity.getIntent(), true, new h45.i() { // from class: fu4.b$$a
                @Override // h45.i
                /* renamed from: onKindaBusinessCallback */
                public final void mo24858x44dbb8f3(android.content.Intent intent) {
                    fu4.b bVar = fu4.b.this;
                    bVar.getClass();
                    ((ku5.t0) ku5.t0.f394148d).B(new fu4.c(bVar, intent));
                }
            });
            if (!((h45.q) i95.n0.c(h45.q.class)).mo24774x8fe94872(activity)) {
                activity.finish();
            }
        } else {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.class);
            intent.addFlags(131072);
            intent.putExtra("action", "action.verify_pattern");
            intent.putExtra("next_action", "next_action.goto_protected_page");
            intent.putExtra("page_intent", activity.getIntent());
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, m(activity));
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/fingerprint/model/FingerprintLockImpl", "protectMeOnCreate", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/walletlock/api/IWalletLock$GuardFilter;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.finish();
        }
        return true;
    }
}
