package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem */
/* loaded from: classes8.dex */
public class C19285xc6d09416 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19285xc6d09416> f38725x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n4();

    /* renamed from: w, reason: collision with root package name */
    public boolean f264284w;

    public C19285xc6d09416() {
        this.f264275n = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("isGif", this.f264284w);
        } catch (org.json.JSONException unused) {
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String b() {
        return "jpeg";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String c() {
        return "image";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public void d(org.json.JSONObject jSONObject) {
        super.d(jSONObject);
        if (jSONObject != null) {
            this.f264284w = jSONObject.optBoolean("isGif");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f264271g);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
            return;
        }
        java.lang.String str2 = this.f264270f;
        if (str2 == null) {
            zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
            java.lang.String str3 = java.lang.System.currentTimeMillis() + "";
            ((yg0.u4) r3Var).getClass();
            this.f264270f = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.c(str3);
        } else if (str2.equals(this.f264271g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewJSSDkImageItem", "Thumb file is original file");
            return;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(this.f264271g, 640, 640, false);
        if (T != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(this.f264271g));
            if (w07 != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 100, android.graphics.Bitmap.CompressFormat.JPEG, this.f264270f, true);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", e17.getMessage());
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", this.f264270f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f264284w ? 1 : 0);
    }

    public C19285xc6d09416(android.os.Parcel parcel) {
        super(parcel);
        this.f264284w = parcel.readInt() == 1;
    }
}
