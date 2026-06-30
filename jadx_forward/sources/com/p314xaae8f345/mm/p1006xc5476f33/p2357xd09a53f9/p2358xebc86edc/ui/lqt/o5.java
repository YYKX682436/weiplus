package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p5 f259840f;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p5 p5Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f259840f = p5Var;
        this.f259838d = str;
        this.f259839e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.p5 p5Var = this.f259840f;
        java.lang.String str = p5Var.f259857d;
        java.lang.String str2 = this.f259838d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (!p5Var.f259859f.f259900d.a() || !p5Var.f259859f.f259901e.K1.containsKey(str2) || (intValue = ((java.lang.Integer) p5Var.f259859f.f259901e.K1.get(str2)).intValue()) >= p5Var.f259858e.size() || p5Var.f259858e.getItem(intValue) == null) {
            return;
        }
        p5Var.f259858e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f259839e, p5Var.f259859f.f259901e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), p5Var.f259859f.f259901e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
        p5Var.f259859f.f259900d.b();
    }
}
