package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.l1 f259447f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.l1 l1Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f259447f = l1Var;
        this.f259445d = str;
        this.f259446e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.l1 l1Var = this.f259447f;
        java.lang.String str = l1Var.f259450d;
        java.lang.String str2 = this.f259445d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (l1Var.f259452f.f260016e.f259383z.containsKey(str2)) {
            int intValue = ((java.lang.Integer) l1Var.f259452f.f260016e.f259383z.get(str2)).intValue();
            if (l1Var.f259451e.getItem(intValue) != null) {
                l1Var.f259451e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f259446e, l1Var.f259452f.f260016e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), l1Var.f259452f.f260016e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
                l1Var.f259452f.f260016e.f259377t.b();
            }
        }
    }
}
