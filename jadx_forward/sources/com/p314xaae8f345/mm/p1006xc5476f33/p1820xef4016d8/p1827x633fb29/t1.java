package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1 f227169g;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1 u1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f227169g = u1Var;
        this.f227166d = bitmap;
        this.f227167e = i17;
        this.f227168f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1 u1Var = this.f227169g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var = u1Var.f227183g;
        android.graphics.Bitmap bitmap2 = this.f227166d;
        int i17 = u1Var.f227177a;
        int i18 = u1Var.f227178b;
        boolean z17 = u1Var.f227179c;
        pq5.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.f227209d;
        w2Var.getClass();
        int b17 = i18 - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, z17 ? 8 : 2);
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        bitmap2.getWidth();
        bitmap2.getHeight();
        if (ceil <= 0 || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingBubble error，wantedBitmapWidth：%s，targetHeight：%s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17));
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
            int i19 = ceil - b17;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.bzs : com.p314xaae8f345.mm.R.C30861xcebc809e.bzy);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s1(this, bitmap);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f227169g.f227182f;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(s1Var);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(s1Var);
        }
    }
}
