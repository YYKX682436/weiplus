package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f226920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb3.i f226923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f226924h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f226925i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 f226926m;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str, gb3.i iVar, android.widget.ImageView imageView, long j17) {
        this.f226926m = w2Var;
        this.f226920d = bitmap;
        this.f226921e = i17;
        this.f226922f = str;
        this.f226923g = iVar;
        this.f226924h = imageView;
        this.f226925i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gb3.i iVar = this.f226923g;
        int i17 = this.f226921e;
        android.graphics.Bitmap bitmap = this.f226920d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), this.f226922f);
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
                return;
            }
            return;
        }
        android.widget.ImageView imageView = this.f226924h;
        int intValue = ((java.lang.Integer) imageView.getTag(com.p314xaae8f345.mm.R.id.j19)).intValue();
        if (intValue <= 0 || intValue != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subType: %s, %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
        } else {
            imageView.setImageBitmap(bitmap);
        }
        if (iVar != null) {
            iVar.mo66107x815f5438(true);
        }
        if (imageView.getId() == com.p314xaae8f345.mm.R.id.nni) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.wi(this.f226926m, this.f226924h, this.f226922f, 3, this.f226921e, this.f226925i);
        }
    }
}
