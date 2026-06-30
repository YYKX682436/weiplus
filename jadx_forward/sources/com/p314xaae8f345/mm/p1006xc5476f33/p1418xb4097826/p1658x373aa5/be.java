package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class be implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f213253a;

    public be(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165) {
        this.f213253a = c15317x5870b165;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.widget.ImageView m62169x4cca5d71;
        android.widget.ImageView m62169x4cca5d712;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = this.f213253a;
        if (bitmap == null) {
            m62169x4cca5d71 = c15317x5870b165.m62169x4cca5d71();
            m62169x4cca5d71.setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCouponView", "on load coupon background, width = " + bitmap.getWidth() + ", height = " + bitmap.getHeight());
        m62169x4cca5d712 = c15317x5870b165.m62169x4cca5d71();
        m62169x4cca5d712.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ae(bitmap, c15317x5870b165));
    }
}
