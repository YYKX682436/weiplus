package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class l1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f226937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f226938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f226939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226940d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, gb3.i iVar, int i17, int i18, android.widget.ImageView imageView) {
        this.f226937a = iVar;
        this.f226938b = i17;
        this.f226939c = i18;
        this.f226940d = imageView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k1(this, bitmap, str));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f226937a;
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
            }
        }
    }
}
