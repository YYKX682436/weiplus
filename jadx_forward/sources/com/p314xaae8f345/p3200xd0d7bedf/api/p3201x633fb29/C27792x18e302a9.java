package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaMiniProgram */
/* loaded from: classes9.dex */
public class C27792x18e302a9 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301701f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301702g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f301703h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f301704i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f301705j;

    /* renamed from: k, reason: collision with root package name */
    public int f301706k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f301707l = false;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Bundle f301708m = new android.os.Bundle();

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        java.lang.String str;
        byte[] bArr;
        return super.b() && (str = this.f301701f) != null && str.length() >= 1 && (bArr = this.f301703h) != null && bArr.length >= 1 && bArr.length <= 134217728;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwwxaobject_userName", this.f301701f);
        java.lang.String str = this.f301702g;
        if (str == null) {
            str = "";
        }
        bundle.putString("_wwwxaobject_path", str);
        java.lang.String str2 = this.f301704i;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("_wwwxaobject_iconUrl", str2);
        java.lang.String str3 = this.f301705j;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("_wwwxaobject_name", str3);
        bundle.putByteArray("_wwwxaobject_hdImageData", this.f301703h);
        bundle.putInt("_wwwxaobject_type", this.f301706k);
        bundle.putString("_wwwxaobject_webpageurl", "");
        bundle.putInt("_wwwxaobject_programtype", 0);
        bundle.putBoolean("_wwwxminiprogram_issecretmsg", this.f301707l);
        bundle.putBundle("_wwwxminiprogram_ext", this.f301708m);
        super.f(bundle);
    }
}
