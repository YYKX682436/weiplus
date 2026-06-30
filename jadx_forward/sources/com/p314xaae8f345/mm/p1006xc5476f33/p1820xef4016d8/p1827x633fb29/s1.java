package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t1 f227132e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t1 t1Var, android.graphics.Bitmap bitmap) {
        this.f227132e = t1Var;
        this.f227131d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t1 t1Var = this.f227132e;
        int intValue = ((java.lang.Integer) t1Var.f227169g.f227180d.getTag(com.p314xaae8f345.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f227131d;
        if (intValue <= 0 || intValue != t1Var.f227167e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(t1Var.f227167e));
        } else {
            t1Var.f227169g.f227180d.setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1 u1Var = t1Var.f227169g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(u1Var.f227183g, u1Var.f227180d, t1Var.f227168f, 1, t1Var.f227167e, u1Var.f227181e);
        }
        java.lang.String str = (java.lang.String) t1Var.f227169g.f227180d.getTag(com.p314xaae8f345.mm.R.id.j1c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t1Var.f227168f) || !t1Var.f227168f.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, t1Var.f227168f);
            return;
        }
        t1Var.f227169g.f227180d.setImageBitmap(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1 u1Var2 = t1Var.f227169g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(u1Var2.f227183g, u1Var2.f227180d, t1Var.f227168f, 1, t1Var.f227167e, u1Var2.f227181e);
    }
}
