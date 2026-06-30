package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class g1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 f226833c;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var) {
        this.f226831a = str;
        this.f226832b = str2;
        this.f226833c = v2Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load finish url: %s, %s, %s", str, java.lang.Integer.valueOf(bVar.f441064a), java.lang.Integer.valueOf(bVar.f441065b));
        int i17 = bVar.f441064a;
        java.lang.String str2 = this.f226831a;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.A(991, 6);
            g0Var.d(18888, 1, str2, str);
            byte[] bArr = bVar.f441066c;
            if (bArr != null) {
                java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(bArr);
                java.lang.String str3 = this.f226832b;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !b17.equals(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "md5 not match: %s, %s", b17, str3);
                    g0Var.A(991, 8);
                    g0Var.d(16543, str, str3, b17);
                }
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.A(991, 7);
            g0Var2.d(18888, 2, str2, str);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.A(991, 8);
            g0Var3.d(18888, 2, str2, str);
        } else {
            android.graphics.Bitmap bitmap = bVar.f441067d;
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var4.A(991, 9);
                g0Var4.d(18888, 2, str2, str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var = this.f226833c;
        if (v2Var != null) {
            v2Var.a(bVar.f441067d, bVar.f441065b, str);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
