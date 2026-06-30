package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n1 f226977e;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n1 n1Var, android.graphics.Bitmap bitmap) {
        this.f226977e = n1Var;
        this.f226976d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n1 n1Var = this.f226977e;
        int intValue = ((java.lang.Integer) n1Var.f226991g.f227024e.getTag(com.p314xaae8f345.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f226976d;
        if (intValue <= 0 || intValue != n1Var.f226989e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(n1Var.f226989e));
        } else {
            n1Var.f226991g.f227024e.setImageBitmap(bitmap);
            gb3.i iVar = n1Var.f226991g.f227020a;
            if (iVar != null) {
                iVar.mo66107x815f5438(true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1 o1Var = n1Var.f226991g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(o1Var.f227026g, o1Var.f227024e, n1Var.f226990f, 2, n1Var.f226989e, o1Var.f227025f);
        }
        java.lang.String str = (java.lang.String) n1Var.f226991g.f227024e.getTag(com.p314xaae8f345.mm.R.id.j1c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n1Var.f226990f) || !n1Var.f226990f.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, n1Var.f226990f);
            return;
        }
        n1Var.f226991g.f227024e.setImageBitmap(bitmap);
        gb3.i iVar2 = n1Var.f226991g.f227020a;
        if (iVar2 != null) {
            iVar2.mo66107x815f5438(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1 o1Var2 = n1Var.f226991g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(o1Var2.f227026g, o1Var2.f227024e, n1Var.f226990f, 2, n1Var.f226989e, o1Var2.f227025f);
    }
}
