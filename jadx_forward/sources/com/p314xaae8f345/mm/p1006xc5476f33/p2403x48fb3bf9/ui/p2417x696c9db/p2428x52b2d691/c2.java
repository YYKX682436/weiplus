package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f267528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f267529f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267530g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267531h;

    public c2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, float f17, nw4.k kVar, nw4.y2 y2Var, long j17) {
        this.f267527d = h0Var;
        this.f267528e = h0Var2;
        this.f267529f = f17;
        this.f267530g = kVar;
        this.f267531h = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.y2 y2Var = this.f267531h;
        nw4.k kVar = this.f267530g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f267528e;
        try {
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a((java.lang.String) this.f267527d.f391656d);
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0((android.graphics.Bitmap) h0Var.f391656d, a17);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            float f17 = this.f267529f;
            int i17 = (int) (100 * f17);
            if (i17 < 10) {
                i17 = 10;
            }
            if (i17 > 99) {
                i17 = 99;
            }
            ((android.graphics.Bitmap) h0Var.f391656d).compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            java.lang.String encodeToString = android.util.Base64.encodeToString(byteArray, 2);
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
            hashMap.put("localData", encodeToString);
            kVar.f422396d.e(y2Var.f422546c, "getLocalImgData:ok", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetLocalImgData", "getLocalImgData rawData size = " + byteArray.length + ", base64 size = " + encodeToString.length() + ", compressionRatio=" + f17 + ", quality=" + i17 + ", degree=" + a17 + ", width=" + ((android.graphics.Bitmap) h0Var.f391656d).getWidth() + ", height=" + ((android.graphics.Bitmap) h0Var.f391656d).getHeight());
            java.lang.System.currentTimeMillis();
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Exception unused) {
            }
            ((android.graphics.Bitmap) h0Var.f391656d).recycle();
        } catch (java.lang.Exception e17) {
            kVar.f422396d.e(y2Var.f422546c, "getLocalImgData:fail", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetLocalImgData", "getLocalImgData fail %s", e17.getMessage());
        }
    }
}
