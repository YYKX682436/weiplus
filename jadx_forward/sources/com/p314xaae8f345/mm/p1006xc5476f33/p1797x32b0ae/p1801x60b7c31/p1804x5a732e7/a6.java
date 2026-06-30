package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class a6 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f225036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 f225038e;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, java.lang.String str3) {
        this.f225038e = o6Var;
        this.f225034a = str;
        this.f225035b = str2;
        this.f225036c = jSONObject;
        this.f225037d = str3;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f225034a;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.a(this.f225037d, str, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.z5(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSaveToPhotosAlbum", "downloadCdnImage result success. path:%s", str);
            this.f225038e.F(this.f225034a, this.f225035b, bitmap, this.f225036c, bArr);
        }
    }
}
