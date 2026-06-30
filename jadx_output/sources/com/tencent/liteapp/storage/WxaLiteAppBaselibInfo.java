package com.tencent.liteapp.storage;

/* loaded from: classes13.dex */
public class WxaLiteAppBaselibInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppBaselibInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppBaselibInfo>() { // from class: com.tencent.liteapp.storage.WxaLiteAppBaselibInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new com.tencent.liteapp.storage.WxaLiteAppBaselibInfo();
            wxaLiteAppBaselibInfo.majorVersion = parcel.readString();
            wxaLiteAppBaselibInfo.url = parcel.readString();
            wxaLiteAppBaselibInfo.f46017md5 = parcel.readString();
            wxaLiteAppBaselibInfo.signatureKey = parcel.readString();
            wxaLiteAppBaselibInfo.path = parcel.readString();
            wxaLiteAppBaselibInfo.type = parcel.readString();
            wxaLiteAppBaselibInfo.patchId = parcel.readString();
            wxaLiteAppBaselibInfo.version = parcel.readString();
            wxaLiteAppBaselibInfo.iLinkVersion = parcel.readInt();
            wxaLiteAppBaselibInfo.updateTime = parcel.readLong();
            wxaLiteAppBaselibInfo.lastUseTime = parcel.readLong();
            return wxaLiteAppBaselibInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.WxaLiteAppBaselibInfo[i17];
        }
    };
    public static final java.lang.String KEY_LITE_APP_BASE_LIB = "LiteAppBaselib";
    public static final java.lang.String KEY_LITE_APP_BASE_LIB_LIST = "LiteAppBaselibList";
    public static final java.lang.String KEY_MAJOR_VERSION = "majorVersion";
    public static final java.lang.String TYPE_BUNDLE = "bundle";
    public static final java.lang.String TYPE_DEBUG = "debug";
    public static final java.lang.String TYPE_RELEASE = "release";
    public static final java.lang.String TYPE_TEST = "test";
    public int iLinkVersion;
    public long lastUseTime;
    public java.lang.String majorVersion;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f46017md5;
    public java.lang.String patchId;
    public java.lang.String path;
    public java.lang.String signatureKey;
    public java.lang.String type;
    public long updateTime;
    public java.lang.String url;
    public java.lang.String version;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isDebug() {
        return "debug".equalsIgnoreCase(this.type);
    }

    public java.lang.String toString() {
        return "WxaLiteAppBaseLibInfo{majorVersion='" + this.majorVersion + "', url='" + this.url + "', md5='" + this.f46017md5 + "', signatureKey='" + this.signatureKey + "', path='" + this.path + "', type='" + this.type + "', patchId='" + this.patchId + "', version='" + this.version + "', iLinkVersion='" + this.iLinkVersion + "', updateTime=" + this.updateTime + ", lastUseTime=" + this.lastUseTime + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.majorVersion);
        parcel.writeString(this.url);
        parcel.writeString(this.f46017md5);
        parcel.writeString(this.signatureKey);
        parcel.writeString(this.path);
        parcel.writeString(this.type);
        parcel.writeString(this.patchId);
        parcel.writeString(this.version);
        parcel.writeInt(this.iLinkVersion);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.lastUseTime);
    }
}
