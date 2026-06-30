package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w1 f227195e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w1 w1Var, android.graphics.Bitmap bitmap) {
        this.f227195e = w1Var;
        this.f227194d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w1 w1Var = this.f227195e;
        int intValue = ((java.lang.Integer) w1Var.f227208g.f227220d.getTag(com.p314xaae8f345.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f227194d;
        if (intValue <= 0 || intValue != w1Var.f227206e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(w1Var.f227206e));
        } else {
            w1Var.f227208g.f227220d.setImageBitmap(bitmap);
        }
        java.lang.String str = (java.lang.String) w1Var.f227208g.f227220d.getTag(com.p314xaae8f345.mm.R.id.j1c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w1Var.f227207f) || !w1Var.f227207f.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, w1Var.f227207f);
        } else {
            w1Var.f227208g.f227220d.setImageBitmap(bitmap);
        }
    }
}
