package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class r1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f227102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f227103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f227104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f227105d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, gb3.i iVar, int i17, int i18, android.widget.ImageView imageView) {
        this.f227102a = iVar;
        this.f227103b = i17;
        this.f227104c = i18;
        this.f227105d = imageView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q1(this, bitmap, i17, str));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f227102a;
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
            }
        }
    }
}
