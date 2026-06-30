package com.tencent.liteapp.storage;

/* loaded from: classes16.dex */
public class WxaLiteAppSamplingConfigInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo>() { // from class: com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo wxaLiteAppSamplingConfigInfo = new com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo();
            wxaLiteAppSamplingConfigInfo.appId = parcel.readString();
            wxaLiteAppSamplingConfigInfo.signatureKey = parcel.readString();
            wxaLiteAppSamplingConfigInfo.updateTime = parcel.readLong();
            wxaLiteAppSamplingConfigInfo.f46020md5 = parcel.readString();
            wxaLiteAppSamplingConfigInfo.dynamicConfigPath = parcel.readString();
            wxaLiteAppSamplingConfigInfo.iLinkVersion = parcel.readInt();
            wxaLiteAppSamplingConfigInfo.configJson = parcel.readString();
            return wxaLiteAppSamplingConfigInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.WxaLiteAppSamplingConfigInfo[i17];
        }
    };
    public java.lang.String appId;
    public java.lang.String configJson;
    public java.lang.String dynamicConfigPath;
    public int iLinkVersion;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f46020md5;
    public java.lang.String signatureKey;
    public long updateTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaLiteAppSamplingConfigInfo{appId='" + this.appId + "', signatureKey='" + this.signatureKey + "', updateTime=" + this.updateTime + ", md5='" + this.f46020md5 + "', dynamicConfigPath='" + this.dynamicConfigPath + "', iLinkVersion=" + this.iLinkVersion + ", configJson='" + this.configJson + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.appId);
        parcel.writeString(this.signatureKey);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.f46020md5);
        parcel.writeString(this.dynamicConfigPath);
        parcel.writeInt(this.iLinkVersion);
        parcel.writeString(this.configJson);
    }
}
