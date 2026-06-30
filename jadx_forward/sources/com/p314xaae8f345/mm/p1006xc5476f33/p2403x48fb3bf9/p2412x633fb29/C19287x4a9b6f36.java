package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem */
/* loaded from: classes8.dex */
public class C19287x4a9b6f36 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36> f38727x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p4();

    /* renamed from: w, reason: collision with root package name */
    public int f264287w;

    public C19287x4a9b6f36() {
        this.f264275n = 4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public org.json.JSONObject a() {
        org.json.JSONObject a17 = super.a();
        try {
            a17.put("duration", this.f264287w);
        } catch (org.json.JSONException unused) {
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String b() {
        return "mp4";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public java.lang.String c() {
        return "video";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7
    public void d(org.json.JSONObject jSONObject) {
        super.d(jSONObject);
        if (jSONObject != null) {
            this.f264287w = jSONObject.optInt("duration");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f264287w);
    }

    public C19287x4a9b6f36(android.os.Parcel parcel) {
        super(parcel);
        this.f264287w = parcel.readInt();
    }
}
