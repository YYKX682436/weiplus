package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f234255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u2 f234256f;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u2 u2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f234256f = u2Var;
        this.f234254d = str;
        this.f234255e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.u2 u2Var = this.f234256f;
        java.lang.String str = u2Var.f234262d;
        java.lang.String str2 = this.f234254d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (u2Var.f234264f.f234294e.f234072v2.containsKey(str2)) {
            int intValue = ((java.lang.Integer) u2Var.f234264f.f234294e.f234072v2.get(str2)).intValue();
            if (u2Var.f234263e.getItem(intValue) != null) {
                u2Var.f234263e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f234255e, u2Var.f234264f.f234294e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), u2Var.f234264f.f234294e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
                if (u2Var.f234264f.f234294e.isFinishing() || u2Var.f234264f.f234294e.isDestroyed()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineCoinPurseUI.this.isFinishing() || WalletOfflineCoinPurseUI.this.isDestroyed()：%s，%s", java.lang.Boolean.valueOf(u2Var.f234264f.f234294e.isFinishing()), java.lang.Boolean.valueOf(u2Var.f234264f.f234294e.isDestroyed()));
                } else {
                    u2Var.f234264f.f234294e.H1.b();
                }
            }
        }
    }
}
