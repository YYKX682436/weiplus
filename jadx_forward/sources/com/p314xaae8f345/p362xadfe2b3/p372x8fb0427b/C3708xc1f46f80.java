package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.LiteAppReferrerInfo */
/* loaded from: classes15.dex */
public class C3708xc1f46f80 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80> f14305x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80>() { // from class: com.tencent.liteapp.storage.LiteAppReferrerInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.m28832xcee59d22()[parcel.readInt()];
            c3708xc1f46f80.f14312x721f2ec7 = parcel.readString();
            c3708xc1f46f80.f14313x6711cad1 = parcel.readString();
            java.lang.String readString = parcel.readString();
            if (readString != null && !readString.isEmpty()) {
                try {
                    c3708xc1f46f80.f14309xf0df6fda = new org.json.JSONObject(readString);
                } catch (org.json.JSONException e17) {
                    kd.c.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80.TAG, "json parse error: ", e17.toString());
                }
            }
            java.lang.String readString2 = parcel.readString();
            if (readString2 != null && !readString2.isEmpty()) {
                try {
                    c3708xc1f46f80.f14310xe0809720 = new org.json.JSONObject(readString2);
                } catch (org.json.JSONException e18) {
                    kd.c.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80.TAG, "json parse error: ", e18.toString());
                }
            }
            java.lang.String readString3 = parcel.readString();
            c3708xc1f46f80.f14314xff8df6be = readString3;
            if (readString3 == null) {
                readString3 = "";
            }
            c3708xc1f46f80.f14314xff8df6be = readString3;
            return c3708xc1f46f80;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80[i17];
        }
    };

    /* renamed from: KEY_LITE_APP_REFERRER_EXTRA_DATA */
    public static final java.lang.String f14306x9a2a14ea = "LiteAppReferrerExtraData";

    /* renamed from: KEY_LITE_APP_REFERRER_SCENE */
    public static final java.lang.String f14307x31fb177b = "LiteAppReferrerScene";

    /* renamed from: KEY_LITE_APP_REFERRER_SCENE_ID */
    public static final java.lang.String f14308x52d2e05f = "LiteAppReferrerSceneId";
    private static final java.lang.String TAG = "WxaLiteApp.LiteAppReferrerInfo";

    /* renamed from: extraData */
    public org.json.JSONObject f14309xf0df6fda;

    /* renamed from: innerData */
    public org.json.JSONObject f14310xe0809720;

    /* renamed from: scene */
    public com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP;

    /* renamed from: sceneId */
    public java.lang.String f14312x721f2ec7 = "";

    /* renamed from: scenePath */
    public java.lang.String f14313x6711cad1 = "";

    /* renamed from: snapshotInitData */
    public java.lang.String f14314xff8df6be = "";

    /* renamed from: fromJsonString */
    public static com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 m28986x81e0d263(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.m28830x447c3e7(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP.m28833x754a37bb()));
            c3708xc1f46f80.f14312x721f2ec7 = jSONObject.optString("sceneId", "");
            c3708xc1f46f80.f14313x6711cad1 = jSONObject.optString("scenePath", "");
            if (jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
                c3708xc1f46f80.f14309xf0df6fda = jSONObject.getJSONObject(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
            }
            if (jSONObject.has("innerData")) {
                c3708xc1f46f80.f14310xe0809720 = jSONObject.getJSONObject("innerData");
            }
            return c3708xc1f46f80;
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, "fromJsonString error: ", e17.toString());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toJsonString */
    public java.lang.String m28987x9d6b37f4() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f14311x683188c.m28833x754a37bb());
        jSONObject.put("sceneId", this.f14312x721f2ec7);
        jSONObject.put("scenePath", this.f14313x6711cad1);
        org.json.JSONObject jSONObject2 = this.f14309xf0df6fda;
        if (jSONObject2 != null) {
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, jSONObject2);
        }
        org.json.JSONObject jSONObject3 = this.f14310xe0809720;
        if (jSONObject3 != null) {
            jSONObject.put("innerData", jSONObject3);
        }
        return jSONObject.toString();
    }

    /* renamed from: toString */
    public java.lang.String m28988x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiteAppReferrerInfo{scene=");
        sb6.append(this.f14311x683188c);
        sb6.append(", sceneId='");
        sb6.append(this.f14312x721f2ec7);
        sb6.append("', scenePath='");
        sb6.append(this.f14313x6711cad1);
        sb6.append("', extraData='");
        org.json.JSONObject jSONObject = this.f14309xf0df6fda;
        sb6.append(jSONObject == null ? "{}" : jSONObject.toString());
        sb6.append("', innerData='");
        org.json.JSONObject jSONObject2 = this.f14310xe0809720;
        sb6.append(jSONObject2 != null ? jSONObject2.toString() : "{}");
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f14311x683188c.ordinal());
        parcel.writeString(this.f14312x721f2ec7);
        parcel.writeString(this.f14313x6711cad1);
        org.json.JSONObject jSONObject = this.f14309xf0df6fda;
        parcel.writeString(jSONObject == null ? "{}" : jSONObject.toString());
        org.json.JSONObject jSONObject2 = this.f14310xe0809720;
        parcel.writeString(jSONObject2 != null ? jSONObject2.toString() : "{}");
        parcel.writeString(this.f14314xff8df6be);
    }
}
