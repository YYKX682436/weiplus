package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* renamed from: com.tencent.mm.plugin.webview.model.SendDataToH5Event */
/* loaded from: classes7.dex */
public final class C19281x39681380 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380> f38723x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o3();

    /* renamed from: g, reason: collision with root package name */
    public final int f264261g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f264262h;

    /* renamed from: i, reason: collision with root package name */
    public final org.json.JSONObject f264263i;

    /* renamed from: com.tencent.mm.plugin.webview.model.SendDataToH5Event$a */
    /* loaded from: classes7.dex */
    public static final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380 c19281x39681380 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380) obj;
            if (c19281x39681380 != null) {
                c19281x39681380.e();
            }
        }
    }

    public C19281x39681380(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f264261g = i17;
        this.f264262h = str;
        this.f264263i = jSONObject;
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380 c19281x39681380) {
        java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.a() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        if (str.equals(bm5.f1.a())) {
            c19281x39681380.e();
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, c19281x39681380, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380.a.class, null);
        }
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380 c19281x39681380) {
        java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        if (str.equals(bm5.f1.a())) {
            c19281x39681380.e();
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, c19281x39681380, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19281x39681380.a.class, null);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f264261g);
        parcel.writeString(this.f264262h);
        parcel.writeString(this.f264263i.toString());
    }

    public C19281x39681380(android.os.Parcel parcel) {
        org.json.JSONObject jSONObject;
        this.f264261g = parcel.readInt();
        this.f264262h = parcel.readString();
        java.lang.String readString = parcel.readString();
        try {
            jSONObject = new org.json.JSONObject(readString);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendDataToH5Event", "json exception %s", readString);
            jSONObject = new org.json.JSONObject();
        }
        this.f264263i = jSONObject;
    }
}
