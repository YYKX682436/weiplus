package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes14.dex */
public final class w2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 f225350a;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 x2Var) {
        this.f225350a = x2Var;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getWidth() : 0);
        objArr[1] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getHeight() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "loadImage done size:%d,%d", objArr);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.f225356g.length() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 x2Var = this.f225350a;
        if (z17) {
            x2Var.C(bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.f225356g);
            return;
        }
        java.lang.String B = x2Var.B(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "color:%s", B);
        x2Var.f224976f.b(kz5.b1.e(new jz5.l("color", B)));
    }
}
