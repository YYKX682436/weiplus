package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f259982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z2 f259983f;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z2 z2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f259983f = z2Var;
        this.f259981d = str;
        this.f259982e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.z2 z2Var = this.f259983f;
        java.lang.String str = z2Var.f259998d;
        java.lang.String str2 = this.f259981d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtPlanAddUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (z2Var.f260000f.f259637e.f259524p0.containsKey(str2)) {
            int intValue = ((java.lang.Integer) z2Var.f260000f.f259637e.f259524p0.get(str2)).intValue();
            if (z2Var.f259999e.getItem(intValue) != null) {
                z2Var.f259999e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f259982e, z2Var.f260000f.f259637e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), z2Var.f260000f.f259637e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
                z2Var.f260000f.f259637e.Z.b();
            }
        }
    }
}
