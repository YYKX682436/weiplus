package com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b;

/* renamed from: com.tencent.liteapp.storage.WxaLiteAppBaselibInfo */
/* loaded from: classes13.dex */
public class C3710x879b31ef implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef> f14318x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef>() { // from class: com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef createFromParcel(android.os.Parcel parcel) {
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef();
            c3710x879b31ef.f14328xdbd3ccdf = parcel.readString();
            c3710x879b31ef.url = parcel.readString();
            c3710x879b31ef.f127550md5 = parcel.readString();
            c3710x879b31ef.f14331xa8503287 = parcel.readString();
            c3710x879b31ef.f14330x346425 = parcel.readString();
            c3710x879b31ef.f14332x368f3a = parcel.readString();
            c3710x879b31ef.f14329xd0d13783 = parcel.readString();
            c3710x879b31ef.f14334x14f51cd8 = parcel.readString();
            c3710x879b31ef.f14326x26947355 = parcel.readInt();
            c3710x879b31ef.f14333xee5c7336 = parcel.readLong();
            c3710x879b31ef.f14327x677b817e = parcel.readLong();
            return c3710x879b31ef;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef[] newArray(int i17) {
            return new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef[i17];
        }
    };

    /* renamed from: KEY_LITE_APP_BASE_LIB */
    public static final java.lang.String f14319x56424e66 = "LiteAppBaselib";

    /* renamed from: KEY_LITE_APP_BASE_LIB_LIST */
    public static final java.lang.String f14320x106b22d7 = "LiteAppBaselibList";

    /* renamed from: KEY_MAJOR_VERSION */
    public static final java.lang.String f14321xe52ffe12 = "majorVersion";

    /* renamed from: TYPE_BUNDLE */
    public static final java.lang.String f14322x3488e527 = "bundle";

    /* renamed from: TYPE_DEBUG */
    public static final java.lang.String f14323x124ab4ee = "debug";

    /* renamed from: TYPE_RELEASE */
    public static final java.lang.String f14324x8f8e07e2 = "release";

    /* renamed from: TYPE_TEST */
    public static final java.lang.String f14325xc6cfe277 = "test";

    /* renamed from: iLinkVersion */
    public int f14326x26947355;

    /* renamed from: lastUseTime */
    public long f14327x677b817e;

    /* renamed from: majorVersion */
    public java.lang.String f14328xdbd3ccdf;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f127550md5;

    /* renamed from: patchId */
    public java.lang.String f14329xd0d13783;

    /* renamed from: path */
    public java.lang.String f14330x346425;

    /* renamed from: signatureKey */
    public java.lang.String f14331xa8503287;

    /* renamed from: type */
    public java.lang.String f14332x368f3a;

    /* renamed from: updateTime */
    public long f14333xee5c7336;
    public java.lang.String url;

    /* renamed from: version */
    public java.lang.String f14334x14f51cd8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: isDebug */
    public boolean m28992x7a994349() {
        return "debug".equalsIgnoreCase(this.f14332x368f3a);
    }

    /* renamed from: toString */
    public java.lang.String m28993x9616526c() {
        return "WxaLiteAppBaseLibInfo{majorVersion='" + this.f14328xdbd3ccdf + "', url='" + this.url + "', md5='" + this.f127550md5 + "', signatureKey='" + this.f14331xa8503287 + "', path='" + this.f14330x346425 + "', type='" + this.f14332x368f3a + "', patchId='" + this.f14329xd0d13783 + "', version='" + this.f14334x14f51cd8 + "', iLinkVersion='" + this.f14326x26947355 + "', updateTime=" + this.f14333xee5c7336 + ", lastUseTime=" + this.f14327x677b817e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f14328xdbd3ccdf);
        parcel.writeString(this.url);
        parcel.writeString(this.f127550md5);
        parcel.writeString(this.f14331xa8503287);
        parcel.writeString(this.f14330x346425);
        parcel.writeString(this.f14332x368f3a);
        parcel.writeString(this.f14329xd0d13783);
        parcel.writeString(this.f14334x14f51cd8);
        parcel.writeInt(this.f14326x26947355);
        parcel.writeLong(this.f14333xee5c7336);
        parcel.writeLong(this.f14327x677b817e);
    }
}
