package com.tencent.liteapp.storage;

/* loaded from: classes13.dex */
public class WxaLiteAppInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.WxaLiteAppInfo>() { // from class: com.tencent.liteapp.storage.WxaLiteAppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = new com.tencent.liteapp.storage.WxaLiteAppInfo();
            wxaLiteAppInfo.appId = parcel.readString();
            wxaLiteAppInfo.groupId = parcel.readString();
            wxaLiteAppInfo.url = parcel.readString();
            wxaLiteAppInfo.f46019md5 = parcel.readString();
            wxaLiteAppInfo.signatureKey = parcel.readString();
            wxaLiteAppInfo.path = parcel.readString();
            wxaLiteAppInfo.referrerScene = com.tencent.liteapp.gen.LiteAppOpenScene.values()[parcel.readInt()];
            wxaLiteAppInfo.referrerInfo = (com.tencent.liteapp.storage.LiteAppReferrerInfo) parcel.readParcelable(com.tencent.liteapp.storage.LiteAppReferrerInfo.class.getClassLoader());
            wxaLiteAppInfo.type = parcel.readString();
            wxaLiteAppInfo.patchId = parcel.readString();
            wxaLiteAppInfo.version = parcel.readString();
            wxaLiteAppInfo.iLinkVersion = parcel.readInt();
            wxaLiteAppInfo.minliteappversion = parcel.readString();
            wxaLiteAppInfo.minlvcppversion = parcel.readString();
            wxaLiteAppInfo.updateTime = parcel.readLong();
            wxaLiteAppInfo.lastUseTime = parcel.readLong();
            if (parcel.readInt() >= 0) {
                byte[] bArr = new byte[parcel.readInt()];
                wxaLiteAppInfo.extra = bArr;
                parcel.readByteArray(bArr);
            }
            java.lang.String readString = parcel.readString();
            if (readString != null && !readString.isEmpty()) {
                try {
                    wxaLiteAppInfo.openOption = new org.json.JSONObject(readString);
                } catch (org.json.JSONException e17) {
                    kd.c.b(com.tencent.liteapp.storage.WxaLiteAppInfo.TAG, "json parse error: ", e17.toString());
                }
            }
            return wxaLiteAppInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.WxaLiteAppInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.WxaLiteAppInfo[i17];
        }
    };
    public static final java.lang.String KEY_DATA_UUID = "dataUuid";
    public static final java.lang.String KEY_EXTRA_DATA = "extraData";
    public static final java.lang.String KEY_LITE_APP = "LiteApp";
    public static final java.lang.String KEY_LITE_APP_ID = "LiteAppId";
    public static final java.lang.String KEY_LITE_APP_LIST = "LiteAppList";
    public static final java.lang.String KEY_LITE_APP_REFERRER_INFO = "LiteAppReferrerInfo";
    public static final java.lang.String KEY_NEW_TAB = "openWithNewTab";
    public static final java.lang.String KEY_PAGE = "page";
    public static final java.lang.String KEY_PAGE_INFO = "pageInfo";
    public static final java.lang.String KEY_QUERY = "query";
    public static final java.lang.String KEY_SESSION_ID = "sessionId";
    private static final java.lang.String TAG = "WxaLiteApp.WxaLiteAppInfo";
    public static final java.lang.String TYPE_BUNDLE = "bundle";
    public static final java.lang.String TYPE_DEBUG = "debug";
    public static final java.lang.String TYPE_RELEASE = "release";
    public static final java.lang.String TYPE_TEST = "test";
    public java.lang.String appId;
    public byte[] extra;
    public java.lang.String groupId;
    public int iLinkVersion;
    public long lastUseTime;

    /* renamed from: md5, reason: collision with root package name */
    public java.lang.String f46019md5;
    public java.lang.String minliteappversion;
    public java.lang.String patchId;
    public java.lang.String path;
    public com.tencent.liteapp.storage.LiteAppReferrerInfo referrerInfo;
    public com.tencent.liteapp.gen.LiteAppOpenScene referrerScene;
    public java.lang.String signatureKey;
    public java.lang.String type;
    public long updateTime;
    public java.lang.String url;
    public java.lang.String version;
    public java.lang.String minlvcppversion = "";
    public java.lang.String maxliteappversion = "";
    public org.json.JSONObject openOption = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isDebug() {
        return "debug".equalsIgnoreCase(this.type);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaLiteAppInfo{appId='");
        sb6.append(this.appId);
        sb6.append("', groupId='");
        sb6.append(this.groupId);
        sb6.append("', url='");
        sb6.append(this.url);
        sb6.append("', md5='");
        sb6.append(this.f46019md5);
        sb6.append("', signatureKey='");
        sb6.append(this.signatureKey);
        sb6.append("', path='");
        sb6.append(this.path);
        sb6.append("', type='");
        sb6.append(this.type);
        sb6.append("', patchId='");
        sb6.append(this.patchId);
        sb6.append("', version='");
        sb6.append(this.version);
        sb6.append("', iLinkVersion='");
        sb6.append(this.iLinkVersion);
        sb6.append("', minliteappversion='");
        sb6.append(this.minliteappversion);
        sb6.append("', minlvcppversion='");
        sb6.append(this.minlvcppversion);
        sb6.append("', updateTime=");
        sb6.append(this.updateTime);
        sb6.append(", lastUseTime=");
        sb6.append(this.lastUseTime);
        sb6.append(", openOption='");
        org.json.JSONObject jSONObject = this.openOption;
        sb6.append(jSONObject == null ? "{}" : jSONObject.toString());
        sb6.append("', referrerInfo=");
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = this.referrerInfo;
        sb6.append(liteAppReferrerInfo == null ? "" : liteAppReferrerInfo.toString());
        sb6.append('}');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.appId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.url);
        parcel.writeString(this.f46019md5);
        parcel.writeString(this.signatureKey);
        parcel.writeString(this.path);
        com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene = this.referrerScene;
        parcel.writeInt(liteAppOpenScene == null ? 0 : liteAppOpenScene.ordinal());
        parcel.writeParcelable(this.referrerInfo, i17);
        parcel.writeString(this.type);
        parcel.writeString(this.patchId);
        parcel.writeString(this.version);
        parcel.writeInt(this.iLinkVersion);
        parcel.writeString(this.minliteappversion);
        parcel.writeString(this.minlvcppversion);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.lastUseTime);
        parcel.writeByteArray(this.extra);
        org.json.JSONObject jSONObject = this.openOption;
        parcel.writeString(jSONObject == null ? "{}" : jSONObject.toString());
    }
}
