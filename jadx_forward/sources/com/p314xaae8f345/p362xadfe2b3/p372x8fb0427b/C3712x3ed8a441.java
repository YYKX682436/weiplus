package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.WxaLiteAppInfo */
/* loaded from: classes13.dex */
public class C3712x3ed8a441 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> f14343x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441>() { // from class: com.tencent.liteapp.storage.WxaLiteAppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441();
            c3712x3ed8a441.f14359x58b7f1c = parcel.readString();
            c3712x3ed8a441.f14361x117d5bfa = parcel.readString();
            c3712x3ed8a441.url = parcel.readString();
            c3712x3ed8a441.f127552md5 = parcel.readString();
            c3712x3ed8a441.f14372xa8503287 = parcel.readString();
            c3712x3ed8a441.f14369x346425 = parcel.readString();
            c3712x3ed8a441.f14371xe26567ad = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.m28832xcee59d22()[parcel.readInt()];
            c3712x3ed8a441.f14370x83282d6d = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80) parcel.readParcelable(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80.class.getClassLoader());
            c3712x3ed8a441.f14373x368f3a = parcel.readString();
            c3712x3ed8a441.f14368xd0d13783 = parcel.readString();
            c3712x3ed8a441.f14375x14f51cd8 = parcel.readString();
            c3712x3ed8a441.f14362x26947355 = parcel.readInt();
            c3712x3ed8a441.f14365xc6b48997 = parcel.readString();
            c3712x3ed8a441.f14366x20dcf231 = parcel.readString();
            c3712x3ed8a441.f14374xee5c7336 = parcel.readLong();
            c3712x3ed8a441.f14363x677b817e = parcel.readLong();
            if (parcel.readInt() >= 0) {
                byte[] bArr = new byte[parcel.readInt()];
                c3712x3ed8a441.f14360x5c79410 = bArr;
                parcel.readByteArray(bArr);
            }
            java.lang.String readString = parcel.readString();
            if (readString != null && !readString.isEmpty()) {
                try {
                    c3712x3ed8a441.f14367xdbc3b5f = new org.json.JSONObject(readString);
                } catch (org.json.JSONException e17) {
                    kd.c.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.TAG, "json parse error: ", e17.toString());
                }
            }
            return c3712x3ed8a441;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441[i17];
        }
    };

    /* renamed from: KEY_DATA_UUID */
    public static final java.lang.String f14344xf03a9130 = "dataUuid";

    /* renamed from: KEY_EXTRA_DATA */
    public static final java.lang.String f14345xae24a099 = "extraData";

    /* renamed from: KEY_LITE_APP */
    public static final java.lang.String f14346xd56cf4f0 = "LiteApp";

    /* renamed from: KEY_LITE_APP_ID */
    public static final java.lang.String f14347x926d12ca = "LiteAppId";

    /* renamed from: KEY_LITE_APP_LIST */
    public static final java.lang.String f14348xab75028d = "LiteAppList";

    /* renamed from: KEY_LITE_APP_REFERRER_INFO */
    public static final java.lang.String f14349xb745c7bf = "LiteAppReferrerInfo";

    /* renamed from: KEY_NEW_TAB */
    public static final java.lang.String f14350x2800fa36 = "openWithNewTab";

    /* renamed from: KEY_PAGE */
    public static final java.lang.String f14351x4e45808f = "page";

    /* renamed from: KEY_PAGE_INFO */
    public static final java.lang.String f14352x3a8c965e = "pageInfo";

    /* renamed from: KEY_QUERY */
    public static final java.lang.String f14353x7a81baa8 = "query";

    /* renamed from: KEY_SESSION_ID */
    public static final java.lang.String f14354xe2e3e984 = "sessionId";
    private static final java.lang.String TAG = "WxaLiteApp.WxaLiteAppInfo";

    /* renamed from: TYPE_BUNDLE */
    public static final java.lang.String f14355x3488e527 = "bundle";

    /* renamed from: TYPE_DEBUG */
    public static final java.lang.String f14356x124ab4ee = "debug";

    /* renamed from: TYPE_RELEASE */
    public static final java.lang.String f14357x8f8e07e2 = "release";

    /* renamed from: TYPE_TEST */
    public static final java.lang.String f14358xc6cfe277 = "test";

    /* renamed from: appId */
    public java.lang.String f14359x58b7f1c;

    /* renamed from: extra */
    public byte[] f14360x5c79410;

    /* renamed from: groupId */
    public java.lang.String f14361x117d5bfa;

    /* renamed from: iLinkVersion */
    public int f14362x26947355;

    /* renamed from: lastUseTime */
    public long f14363x677b817e;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f127552md5;

    /* renamed from: minliteappversion */
    public java.lang.String f14365xc6b48997;

    /* renamed from: patchId */
    public java.lang.String f14368xd0d13783;

    /* renamed from: path */
    public java.lang.String f14369x346425;

    /* renamed from: referrerInfo */
    public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 f14370x83282d6d;

    /* renamed from: referrerScene */
    public com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f f14371xe26567ad;

    /* renamed from: signatureKey */
    public java.lang.String f14372xa8503287;

    /* renamed from: type */
    public java.lang.String f14373x368f3a;

    /* renamed from: updateTime */
    public long f14374xee5c7336;
    public java.lang.String url;

    /* renamed from: version */
    public java.lang.String f14375x14f51cd8;

    /* renamed from: minlvcppversion */
    public java.lang.String f14366x20dcf231 = "";

    /* renamed from: maxliteappversion */
    public java.lang.String f14364x3cb7c129 = "";

    /* renamed from: openOption */
    public org.json.JSONObject f14367xdbc3b5f = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: isDebug */
    public boolean m28997x7a994349() {
        return "debug".equalsIgnoreCase(this.f14373x368f3a);
    }

    /* renamed from: toString */
    public java.lang.String m28998x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaLiteAppInfo{appId='");
        sb6.append(this.f14359x58b7f1c);
        sb6.append("', groupId='");
        sb6.append(this.f14361x117d5bfa);
        sb6.append("', url='");
        sb6.append(this.url);
        sb6.append("', md5='");
        sb6.append(this.f127552md5);
        sb6.append("', signatureKey='");
        sb6.append(this.f14372xa8503287);
        sb6.append("', path='");
        sb6.append(this.f14369x346425);
        sb6.append("', type='");
        sb6.append(this.f14373x368f3a);
        sb6.append("', patchId='");
        sb6.append(this.f14368xd0d13783);
        sb6.append("', version='");
        sb6.append(this.f14375x14f51cd8);
        sb6.append("', iLinkVersion='");
        sb6.append(this.f14362x26947355);
        sb6.append("', minliteappversion='");
        sb6.append(this.f14365xc6b48997);
        sb6.append("', minlvcppversion='");
        sb6.append(this.f14366x20dcf231);
        sb6.append("', updateTime=");
        sb6.append(this.f14374xee5c7336);
        sb6.append(", lastUseTime=");
        sb6.append(this.f14363x677b817e);
        sb6.append(", openOption='");
        org.json.JSONObject jSONObject = this.f14367xdbc3b5f;
        sb6.append(jSONObject == null ? "{}" : jSONObject.toString());
        sb6.append("', referrerInfo=");
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = this.f14370x83282d6d;
        sb6.append(c3708xc1f46f80 == null ? "" : c3708xc1f46f80.m28988x9616526c());
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f14359x58b7f1c);
        parcel.writeString(this.f14361x117d5bfa);
        parcel.writeString(this.url);
        parcel.writeString(this.f127552md5);
        parcel.writeString(this.f14372xa8503287);
        parcel.writeString(this.f14369x346425);
        com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f = this.f14371xe26567ad;
        parcel.writeInt(enumC3698xfb48f2f == null ? 0 : enumC3698xfb48f2f.ordinal());
        parcel.writeParcelable(this.f14370x83282d6d, i17);
        parcel.writeString(this.f14373x368f3a);
        parcel.writeString(this.f14368xd0d13783);
        parcel.writeString(this.f14375x14f51cd8);
        parcel.writeInt(this.f14362x26947355);
        parcel.writeString(this.f14365xc6b48997);
        parcel.writeString(this.f14366x20dcf231);
        parcel.writeLong(this.f14374xee5c7336);
        parcel.writeLong(this.f14363x677b817e);
        parcel.writeByteArray(this.f14360x5c79410);
        org.json.JSONObject jSONObject = this.f14367xdbc3b5f;
        parcel.writeString(jSONObject == null ? "{}" : jSONObject.toString());
    }
}
