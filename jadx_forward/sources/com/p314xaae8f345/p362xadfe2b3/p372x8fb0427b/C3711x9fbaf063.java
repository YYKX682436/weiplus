package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.WxaLiteAppConfigInfo */
/* loaded from: classes16.dex */
public class C3711x9fbaf063 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063> f14335x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063>() { // from class: com.tencent.liteapp.storage.WxaLiteAppConfigInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063 createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063 c3711x9fbaf063 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063();
            c3711x9fbaf063.f14336x58b7f1c = parcel.readString();
            c3711x9fbaf063.f14341xa8503287 = parcel.readString();
            c3711x9fbaf063.f14340xc8dcdb6d = parcel.readString();
            c3711x9fbaf063.f14342xee5c7336 = parcel.readLong();
            c3711x9fbaf063.f127551md5 = parcel.readString();
            c3711x9fbaf063.f14338x44152426 = parcel.readString();
            c3711x9fbaf063.f14339x26947355 = parcel.readInt();
            c3711x9fbaf063.f14337x318b734a = parcel.readString();
            return c3711x9fbaf063;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3711x9fbaf063[i17];
        }
    };

    /* renamed from: appId */
    public java.lang.String f14336x58b7f1c;

    /* renamed from: configJson */
    public java.lang.String f14337x318b734a;

    /* renamed from: dynamicConfigPath */
    public java.lang.String f14338x44152426;

    /* renamed from: iLinkVersion */
    public int f14339x26947355;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f127551md5;

    /* renamed from: packageConfigPath */
    public java.lang.String f14340xc8dcdb6d;

    /* renamed from: signatureKey */
    public java.lang.String f14341xa8503287;

    /* renamed from: updateTime */
    public long f14342xee5c7336;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m28995x9616526c() {
        return "WxaLiteAppConfigInfo{appId='" + this.f14336x58b7f1c + "', signatureKey='" + this.f14341xa8503287 + "', packageConfigPath='" + this.f14340xc8dcdb6d + "', updateTime=" + this.f14342xee5c7336 + ", md5='" + this.f127551md5 + "', dynamicConfigPath='" + this.f14338x44152426 + "', iLinkVersion=" + this.f14339x26947355 + ", configJson='" + this.f14337x318b734a + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f14336x58b7f1c);
        parcel.writeString(this.f14341xa8503287);
        parcel.writeString(this.f14340xc8dcdb6d);
        parcel.writeLong(this.f14342xee5c7336);
        parcel.writeString(this.f127551md5);
        parcel.writeString(this.f14338x44152426);
        parcel.writeInt(this.f14339x26947355);
        parcel.writeString(this.f14337x318b734a);
    }
}
