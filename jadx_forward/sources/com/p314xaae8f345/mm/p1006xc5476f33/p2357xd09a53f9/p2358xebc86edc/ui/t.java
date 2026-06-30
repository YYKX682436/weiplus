package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f260038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u f260039f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u uVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f260039f = uVar;
        this.f260037d = str;
        this.f260038e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u uVar = this.f260039f;
        java.lang.String str = uVar.f260043d;
        java.lang.String str2 = this.f260037d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (!uVar.f260045f.f260056f.P.a() || !uVar.f260045f.f260056f.U.containsKey(str2) || (intValue = ((java.lang.Integer) uVar.f260045f.f260056f.U.get(str2)).intValue()) >= uVar.f260044e.size() || uVar.f260044e.getItem(intValue) == null) {
            return;
        }
        uVar.f260044e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f260038e, uVar.f260045f.f260056f.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), uVar.f260045f.f260056f.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
        uVar.f260045f.f260056f.P.b();
    }
}
