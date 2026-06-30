package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j2 f226866f;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j2 j2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f226866f = j2Var;
        this.f226864d = str;
        this.f226865e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j2 j2Var = this.f226866f;
        java.lang.String str = (java.lang.String) j2Var.f226882a.getTag(com.p314xaae8f345.mm.R.id.j1c);
        java.lang.String str2 = this.f226864d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, str2);
        } else {
            j2Var.f226882a.setImageBitmap(this.f226865e);
        }
    }
}
