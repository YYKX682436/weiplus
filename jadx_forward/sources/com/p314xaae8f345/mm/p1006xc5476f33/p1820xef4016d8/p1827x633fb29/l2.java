package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m2 f226944g;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m2 m2Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f226944g = m2Var;
        this.f226941d = bitmap;
        this.f226942e = i17;
        this.f226943f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f226943f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m2 m2Var = this.f226944g;
        android.graphics.Bitmap bitmap = this.f226941d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(this.f226942e), str);
            gb3.i iVar = m2Var.f226978a;
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
                return;
            }
            return;
        }
        java.lang.String str2 = (java.lang.String) m2Var.f226979b.getTag(com.p314xaae8f345.mm.R.id.j1c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str2, str);
        } else {
            m2Var.f226979b.setImageBitmap(bitmap);
        }
        gb3.i iVar2 = m2Var.f226978a;
        if (iVar2 != null) {
            iVar2.mo66107x815f5438(true);
        }
        if (m2Var.f226979b.getId() == com.p314xaae8f345.mm.R.id.nni) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(m2Var.f226981d, m2Var.f226979b, this.f226943f, 3, this.f226942e, m2Var.f226980c);
        }
    }
}
