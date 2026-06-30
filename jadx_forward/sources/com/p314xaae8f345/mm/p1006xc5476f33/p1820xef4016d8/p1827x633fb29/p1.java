package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q1 f227071e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q1 q1Var, android.graphics.Bitmap bitmap) {
        this.f227071e = q1Var;
        this.f227070d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q1 q1Var = this.f227071e;
        int intValue = ((java.lang.Integer) q1Var.f227092g.f227105d.getTag(com.p314xaae8f345.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f227070d;
        if (intValue <= 0 || intValue != q1Var.f227090e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subtype: %s, %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(q1Var.f227090e));
        } else {
            q1Var.f227092g.f227105d.setImageBitmap(bitmap);
            gb3.i iVar = q1Var.f227092g.f227102a;
            if (iVar != null) {
                iVar.mo66107x815f5438(true);
            }
        }
        java.lang.String str = (java.lang.String) q1Var.f227092g.f227105d.getTag(com.p314xaae8f345.mm.R.id.j1c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q1Var.f227091f) || !q1Var.f227091f.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, q1Var.f227091f);
            return;
        }
        q1Var.f227092g.f227105d.setImageBitmap(bitmap);
        gb3.i iVar2 = q1Var.f227092g.f227102a;
        if (iVar2 != null) {
            iVar2.mo66107x815f5438(true);
        }
    }
}
