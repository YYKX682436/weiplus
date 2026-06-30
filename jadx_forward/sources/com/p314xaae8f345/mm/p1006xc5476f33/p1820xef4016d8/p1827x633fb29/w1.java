package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f227205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x1 f227208g;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x1 x1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f227208g = x1Var;
        this.f227205d = bitmap;
        this.f227206e = i17;
        this.f227207f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x1 x1Var = this.f227208g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var = x1Var.f227222f;
        android.graphics.Bitmap bitmap2 = this.f227205d;
        int i17 = x1Var.f227217a;
        int i18 = x1Var.f227218b;
        boolean z17 = x1Var.f227219c;
        pq5.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.f227209d;
        w2Var.getClass();
        if (z17) {
            i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
        }
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        if (ceil <= 0 || i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingWidgtBubble error，wantedBitmapWidth：%s，targetHeight：%s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17));
            bitmap = null;
        } else {
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v1(this, bitmap);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var = this.f227208g.f227221e;
        if (w1Var != null) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c4) w1Var).a(v1Var);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(v1Var);
        }
    }
}
