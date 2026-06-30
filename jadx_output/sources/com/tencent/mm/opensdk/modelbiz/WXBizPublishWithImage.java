package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes8.dex */
public class WXBizPublishWithImage {

    /* loaded from: classes8.dex */
    public static class ImgInfo {
        public java.lang.String path;

        public ImgInfo(java.lang.String str) {
            this.path = str;
        }
    }

    /* loaded from: classes8.dex */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXBizPublishWithImage.Req";
        public java.util.HashMap<java.lang.String, java.lang.Object> extraData;
        public java.util.ArrayList<com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.ImgInfo> imgInfoList;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 44;
        }

        public java.lang.String toJson() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (this.imgInfoList != null) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.ImgInfo> it = this.imgInfoList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.ImgInfo next = it.next();
                        if (next != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            java.lang.String str = next.path;
                            if (str != null) {
                                jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("img_info_list", jSONArray);
                }
                jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_EXTRA_DATA, new org.json.JSONObject(this.extraData));
                return jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "convert json error, " + e17.getMessage());
                return null;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 44;
        }
    }
}
