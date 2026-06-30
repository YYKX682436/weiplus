package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class o1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f227020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f227021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f227022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f227023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f227024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f227025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 f227026g;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, gb3.i iVar, int i17, int i18, int i19, android.widget.ImageView imageView, long j17) {
        this.f227026g = w2Var;
        this.f227020a = iVar;
        this.f227021b = i17;
        this.f227022c = i18;
        this.f227023d = i19;
        this.f227024e = imageView;
        this.f227025f = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n1(this, bitmap, i17, str));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f227020a;
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
            }
        }
    }
}
