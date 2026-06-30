package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes13.dex */
public class h implements o91.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.i f162217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a f162220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f162221e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.i iVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a, float f17) {
        this.f162217a = iVar;
        this.f162218b = str;
        this.f162219c = str2;
        this.f162220d = c21524xecd57b9a;
        this.f162221e = f17;
    }

    @Override // o91.c
    public void a(java.io.InputStream inputStream) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = this.f162220d;
        java.lang.String str = this.f162219c;
        java.lang.String str2 = this.f162218b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.i iVar = this.f162217a;
        if (inputStream == null) {
            if (iVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) iVar).e(str2, "null InputStream, finalUrl: " + str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewerUtils", "openRead failed, url=%s", str);
            return;
        }
        java.io.InputStream a17 = ya1.b.a(inputStream);
        "HUAWEI".equals(android.os.Build.MANUFACTURER);
        a17.mark(8388608);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Va(a17, null, options);
        java.lang.String str3 = options.outMimeType;
        str3.getClass();
        if (str3.equals("image/GIF") || str3.equals("image/gif")) {
            if (iVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) iVar).e(str2, "not support gif");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewerUtils", "not support gift image");
            return;
        }
        try {
            a17.reset();
            android.graphics.Bitmap Lh = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Lh(a17);
            s46.d.a(a17);
            if (Lh != null && !Lh.isRecycled()) {
                c21524xecd57b9a.setImageBitmap(Lh);
                int width = Lh.getWidth();
                int height = Lh.getHeight();
                c21524xecd57b9a.f279184o = width;
                c21524xecd57b9a.f279185p = height;
                c21524xecd57b9a.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.g(this), 100L);
            } else if (iVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) iVar).e(str2, "bmp is null or recycled");
            }
        } catch (java.lang.Throwable th6) {
            if (iVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d) iVar).e(str2, "exception found: " + th6.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewerUtils", "setImageBitmap failed, url=%s", str);
        }
    }
}
