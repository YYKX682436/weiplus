package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo */
/* loaded from: classes16.dex */
public class C3713xdb8f24aa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa> f14376x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa>() { // from class: com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa c3713xdb8f24aa = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa();
            c3713xdb8f24aa.f14377x58b7f1c = parcel.readString();
            c3713xdb8f24aa.f14381xa8503287 = parcel.readString();
            c3713xdb8f24aa.f14382xee5c7336 = parcel.readLong();
            c3713xdb8f24aa.f127553md5 = parcel.readString();
            c3713xdb8f24aa.f14379x44152426 = parcel.readString();
            c3713xdb8f24aa.f14380x26947355 = parcel.readInt();
            c3713xdb8f24aa.f14378x318b734a = parcel.readString();
            return c3713xdb8f24aa;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3713xdb8f24aa[i17];
        }
    };

    /* renamed from: appId */
    public java.lang.String f14377x58b7f1c;

    /* renamed from: configJson */
    public java.lang.String f14378x318b734a;

    /* renamed from: dynamicConfigPath */
    public java.lang.String f14379x44152426;

    /* renamed from: iLinkVersion */
    public int f14380x26947355;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f127553md5;

    /* renamed from: signatureKey */
    public java.lang.String f14381xa8503287;

    /* renamed from: updateTime */
    public long f14382xee5c7336;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m29000x9616526c() {
        return "WxaLiteAppSamplingConfigInfo{appId='" + this.f14377x58b7f1c + "', signatureKey='" + this.f14381xa8503287 + "', updateTime=" + this.f14382xee5c7336 + ", md5='" + this.f127553md5 + "', dynamicConfigPath='" + this.f14379x44152426 + "', iLinkVersion=" + this.f14380x26947355 + ", configJson='" + this.f14378x318b734a + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f14377x58b7f1c);
        parcel.writeString(this.f14381xa8503287);
        parcel.writeLong(this.f14382xee5c7336);
        parcel.writeString(this.f127553md5);
        parcel.writeString(this.f14379x44152426);
        parcel.writeInt(this.f14380x26947355);
        parcel.writeString(this.f14378x318b734a);
    }
}
