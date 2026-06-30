package com.tencent.liteapp.storage;

/* loaded from: classes15.dex */
public class WxaLiteAppAuthInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppAuthInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppAuthInfo>() { // from class: com.tencent.liteapp.storage.WxaLiteAppAuthInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppAuthInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.WxaLiteAppAuthInfo wxaLiteAppAuthInfo = new com.tencent.liteapp.storage.WxaLiteAppAuthInfo();
            wxaLiteAppAuthInfo.host = parcel.readString();
            wxaLiteAppAuthInfo.url = parcel.readString();
            wxaLiteAppAuthInfo.authInfo = parcel.readString();
            return wxaLiteAppAuthInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppAuthInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.WxaLiteAppAuthInfo[i17];
        }
    };
    public java.lang.String authInfo;
    public java.lang.String host;
    public java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "WxaLiteAppAuthInfo{host='" + this.host + "', url='" + this.url + "', authInfo='" + this.authInfo + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.host);
        parcel.writeString(this.url);
        parcel.writeString(this.authInfo);
    }
}
