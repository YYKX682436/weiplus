package com.tencent.liteapp.storage;

/* loaded from: classes15.dex */
public class LiteAppReferrerInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.liteapp.storage.LiteAppReferrerInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.liteapp.storage.LiteAppReferrerInfo>() { // from class: com.tencent.liteapp.storage.LiteAppReferrerInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.LiteAppReferrerInfo createFromParcel(android.os.Parcel parcel) {
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.values()[parcel.readInt()];
            liteAppReferrerInfo.sceneId = parcel.readString();
            liteAppReferrerInfo.scenePath = parcel.readString();
            java.lang.String readString = parcel.readString();
            if (readString != null && !readString.isEmpty()) {
                try {
                    liteAppReferrerInfo.extraData = new org.json.JSONObject(readString);
                } catch (org.json.JSONException e17) {
                    kd.c.b(com.tencent.liteapp.storage.LiteAppReferrerInfo.TAG, "json parse error: ", e17.toString());
                }
            }
            java.lang.String readString2 = parcel.readString();
            if (readString2 != null && !readString2.isEmpty()) {
                try {
                    liteAppReferrerInfo.innerData = new org.json.JSONObject(readString2);
                } catch (org.json.JSONException e18) {
                    kd.c.b(com.tencent.liteapp.storage.LiteAppReferrerInfo.TAG, "json parse error: ", e18.toString());
                }
            }
            java.lang.String readString3 = parcel.readString();
            liteAppReferrerInfo.snapshotInitData = readString3;
            if (readString3 == null) {
                readString3 = "";
            }
            liteAppReferrerInfo.snapshotInitData = readString3;
            return liteAppReferrerInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.tencent.liteapp.storage.LiteAppReferrerInfo[] newArray(int i17) {
            return new com.tencent.liteapp.storage.LiteAppReferrerInfo[i17];
        }
    };
    public static final java.lang.String KEY_LITE_APP_REFERRER_EXTRA_DATA = "LiteAppReferrerExtraData";
    public static final java.lang.String KEY_LITE_APP_REFERRER_SCENE = "LiteAppReferrerScene";
    public static final java.lang.String KEY_LITE_APP_REFERRER_SCENE_ID = "LiteAppReferrerSceneId";
    private static final java.lang.String TAG = "WxaLiteApp.LiteAppReferrerInfo";
    public org.json.JSONObject extraData;
    public org.json.JSONObject innerData;
    public com.tencent.liteapp.gen.LiteAppOpenScene scene = com.tencent.liteapp.gen.LiteAppOpenScene.APP;
    public java.lang.String sceneId = "";
    public java.lang.String scenePath = "";
    public java.lang.String snapshotInitData = "";

    public static com.tencent.liteapp.storage.LiteAppReferrerInfo fromJsonString(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.fromValue(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, com.tencent.liteapp.gen.LiteAppOpenScene.APP.getValue()));
            liteAppReferrerInfo.sceneId = jSONObject.optString("sceneId", "");
            liteAppReferrerInfo.scenePath = jSONObject.optString("scenePath", "");
            if (jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
                liteAppReferrerInfo.extraData = jSONObject.getJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            }
            if (jSONObject.has("innerData")) {
                liteAppReferrerInfo.innerData = jSONObject.getJSONObject("innerData");
            }
            return liteAppReferrerInfo;
        } catch (java.lang.Exception e17) {
            kd.c.b(TAG, "fromJsonString error: ", e17.toString());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toJsonString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.scene.getValue());
        jSONObject.put("sceneId", this.sceneId);
        jSONObject.put("scenePath", this.scenePath);
        org.json.JSONObject jSONObject2 = this.extraData;
        if (jSONObject2 != null) {
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jSONObject2);
        }
        org.json.JSONObject jSONObject3 = this.innerData;
        if (jSONObject3 != null) {
            jSONObject.put("innerData", jSONObject3);
        }
        return jSONObject.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiteAppReferrerInfo{scene=");
        sb6.append(this.scene);
        sb6.append(", sceneId='");
        sb6.append(this.sceneId);
        sb6.append("', scenePath='");
        sb6.append(this.scenePath);
        sb6.append("', extraData='");
        org.json.JSONObject jSONObject = this.extraData;
        sb6.append(jSONObject == null ? "{}" : jSONObject.toString());
        sb6.append("', innerData='");
        org.json.JSONObject jSONObject2 = this.innerData;
        sb6.append(jSONObject2 != null ? jSONObject2.toString() : "{}");
        sb6.append("'}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.scene.ordinal());
        parcel.writeString(this.sceneId);
        parcel.writeString(this.scenePath);
        org.json.JSONObject jSONObject = this.extraData;
        parcel.writeString(jSONObject == null ? "{}" : jSONObject.toString());
        org.json.JSONObject jSONObject2 = this.innerData;
        parcel.writeString(jSONObject2 != null ? jSONObject2.toString() : "{}");
        parcel.writeString(this.snapshotInitData);
    }
}
