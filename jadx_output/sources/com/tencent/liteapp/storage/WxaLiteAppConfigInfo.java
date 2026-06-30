package com.tencent.liteapp.storage;

/* loaded from: classes16.dex */
public class WxaLiteAppConfigInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppConfigInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppConfigInfo>() { // from class: com.tencent.liteapp.storage.WxaLiteAppConfigInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppConfigInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.WxaLiteAppConfigInfo wxaLiteAppConfigInfo = new com.tencent.liteapp.storage.WxaLiteAppConfigInfo();
            wxaLiteAppConfigInfo.appId = parcel.readString();
            wxaLiteAppConfigInfo.signatureKey = parcel.readString();
            wxaLiteAppConfigInfo.packageConfigPath = parcel.readString();
            wxaLiteAppConfigInfo.updateTime = parcel.readLong();
            wxaLiteAppConfigInfo.f46018md5 = parcel.readString();
            wxaLiteAppConfigInfo.dynamicConfigPath = parcel.readString();
            wxaLiteAppConfigInfo.iLinkVersion = parcel.readInt();
            wxaLiteAppConfigInfo.configJson = parcel.readString();
            return wxaLiteAppConfigInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppConfigInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.WxaLiteAppConfigInfo[i17];
        }
    };
    public java.lang.String appId;
    public java.lang.String configJson;
    public java.lang.String dynamicConfigPath;
    public int iLinkVersion;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f46018md5;
    public java.lang.String packageConfigPath;
    public java.lang.String signatureKey;
    public long updateTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaLiteAppConfigInfo{appId='" + this.appId + "', signatureKey='" + this.signatureKey + "', packageConfigPath='" + this.packageConfigPath + "', updateTime=" + this.updateTime + ", md5='" + this.f46018md5 + "', dynamicConfigPath='" + this.dynamicConfigPath + "', iLinkVersion=" + this.iLinkVersion + ", configJson='" + this.configJson + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.appId);
        parcel.writeString(this.signatureKey);
        parcel.writeString(this.packageConfigPath);
        parcel.writeLong(this.updateTime);
        parcel.writeString(this.f46018md5);
        parcel.writeString(this.dynamicConfigPath);
        parcel.writeInt(this.iLinkVersion);
        parcel.writeString(this.configJson);
    }
}
