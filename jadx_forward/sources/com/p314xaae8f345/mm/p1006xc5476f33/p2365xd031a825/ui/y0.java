package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f262336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z0 f262337f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z0 z0Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f262337f = z0Var;
        this.f262335d = str;
        this.f262336e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardBottomSheetHelper", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f262335d, this.f262337f.f262349d);
        if (this.f262337f.f262351f.f261698f.containsKey(this.f262335d)) {
            int intValue = ((java.lang.Integer) this.f262337f.f262351f.f261698f.get(this.f262335d)).intValue();
            if (this.f262337f.f262350e.getItem(intValue) != null) {
                this.f262337f.f262350e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(this.f262336e, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false)));
                this.f262337f.f262351f.f261699g.j();
            }
        }
    }
}
