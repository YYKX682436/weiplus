package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class u1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f227178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f227179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f227180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f227181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f227182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 f227183g;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, int i17, int i18, boolean z17, android.widget.ImageView imageView, long j17, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f227183g = w2Var;
        this.f227177a = i17;
        this.f227178b = i18;
        this.f227179c = z17;
        this.f227180d = imageView;
        this.f227181e = j17;
        this.f227182f = n3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t1(this, bitmap, i17, str));
    }
}
