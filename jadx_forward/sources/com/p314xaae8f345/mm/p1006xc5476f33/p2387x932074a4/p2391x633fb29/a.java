package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public class a implements cu4.g {
    @Override // cu4.g
    public void a(android.app.Activity activity, android.content.Intent intent, int i17) {
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // cu4.g
    public boolean b() {
        return false;
    }

    @Override // cu4.g
    public void c(android.app.Activity activity, int i17) {
    }

    @Override // cu4.g
    public void d(android.app.Activity activity, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWalletLockImpl", "enterNewWalletLockProcessForResult walletLockType: %d, requestCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("next_action", "next_action.switch_on_pattern");
            intent.putExtra("key_wallet_lock_type", 1);
            j45.l.n(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, i18);
            return;
        }
        if (i17 == 2 && i17 == 2) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("action", "action.verify_paypwd");
            intent2.putExtra("next_action", "next_action.switch_on_pattern");
            intent2.putExtra("key_wallet_lock_type", 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockImpl", "enterNewWalletLockProcessForResult start check pwd ui, wallet lock type: %d", java.lang.Integer.valueOf(i17));
            j45.l.n(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent2, i18);
        }
    }

    @Override // cu4.g
    public void e(android.app.Activity activity, cu4.f fVar, cu4.e eVar) {
    }

    @Override // cu4.g
    public boolean f() {
        return false;
    }

    @Override // cu4.g
    public void g(android.app.Activity activity) {
    }

    @Override // cu4.g
    public void h(android.app.Activity activity, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWalletLockImpl", "enterNewWalletLockProcess walletLockType: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            if (i17 != 1) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("next_action", "next_action.switch_on_pattern");
            intent.putExtra("key_wallet_lock_type", 1);
            j45.l.j(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, null);
            return;
        }
        if (i17 == 2 && i17 == 2) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("action", "action.verify_paypwd");
            intent2.putExtra("next_action", "next_action.switch_on_pattern");
            intent2.putExtra("key_wallet_lock_type", 2);
            j45.l.j(activity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent2, null);
        }
    }

    @Override // cu4.g
    public cu4.f i() {
        return null;
    }

    @Override // cu4.g
    /* renamed from: init */
    public void mo74014x316510() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.m(0);
    }

    @Override // cu4.g
    public void j(int i17) {
    }

    @Override // cu4.g
    public boolean k(android.app.Activity activity, cu4.f fVar) {
        return false;
    }

    @Override // cu4.g
    public void l(android.app.Activity activity, android.content.Intent intent) {
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.ui.ActivityC19204x3c86060.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/walletlock/model/BaseWalletLockImpl", "startWalletLockManagerUI", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int m(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseWalletLockImpl", "activity %s", activity.getClass().getSimpleName());
        if (activity.getClass().getSimpleName().equals("MallIndexUI") || activity.getClass().getSimpleName().equals("MallIndexUIv2")) {
            return 1;
        }
        return activity.getClass().getSimpleName().equals("WalletOfflineCoinPurseUI") ? 2 : -1;
    }
}
