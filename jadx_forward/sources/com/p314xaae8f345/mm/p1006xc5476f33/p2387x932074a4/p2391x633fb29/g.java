package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6122x5ba19f00 c6122x5ba19f00 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6122x5ba19f00) abstractC20979x809547d1;
        if (c6122x5ba19f00 != null) {
            am.rx rxVar = c6122x5ba19f00.f136394g;
            android.content.Intent intent = rxVar.f89384b;
            int intExtra = intent.getIntExtra("key_wallet_lock_type", -1);
            android.app.Activity activity = rxVar.f89383a;
            am.sx sxVar = c6122x5ba19f00.f136395h;
            if (activity != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartWalletLockUIListener", "startWalletLockUI type: %d", java.lang.Integer.valueOf(intExtra));
                if (intExtra == 2) {
                    intent.setClass(rxVar.f89383a, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2388xadfce8e4.ui.ActivityC19200x9865b13c.class);
                } else if (intExtra == 1) {
                    intent.setClass(rxVar.f89383a, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.ViewOnClickListenerC19201x9aa113d6.class);
                }
                android.app.Activity activity2 = rxVar.f89383a;
                int i17 = rxVar.f89385c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/model/StartWalletLockUIListener", "callback", "(Lcom/tencent/mm/autogen/events/StartWalletLockUIEvent;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                sxVar.f89477a = true;
            } else {
                sxVar.f89477a = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartWalletLockUIListener", "isSuccess: %b", java.lang.Boolean.valueOf(sxVar.f89477a));
        }
        return false;
    }
}
