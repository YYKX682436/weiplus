package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f259443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f259444e;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6) {
        this.f259444e = activityC18999x8e4b0cb;
        this.f259443d = c6241x543927b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = this.f259443d;
        am.j10 j10Var = c6241x543927b6.f136489h;
        int i17 = j10Var.f88530d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f259444e;
        if (i17 == 2) {
            activityC18999x8e4b0cb.f259329u.m83148xdedf72f8(j10Var.f88531e);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j10Var.f88527a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
                return;
            }
            android.widget.TextView textView = activityC18999x8e4b0cb.f259323o;
            am.j10 j10Var2 = c6241x543927b6.f136489h;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView, j10Var2.f88527a, j10Var2.f88528b, j10Var2.f88529c);
        }
    }
}
