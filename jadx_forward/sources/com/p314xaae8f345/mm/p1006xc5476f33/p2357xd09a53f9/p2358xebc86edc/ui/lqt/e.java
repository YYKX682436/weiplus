package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class e extends qs4.j {
    @Override // qs4.j, qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        return super.A(activity, bundle);
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "BalanceFetchCardProcess";
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
        } else {
            k(activity, "wallet", ".balance.ui.lqt.WalletLqtSaveFetchUI", -1, new android.content.Intent(), true);
        }
    }
}
