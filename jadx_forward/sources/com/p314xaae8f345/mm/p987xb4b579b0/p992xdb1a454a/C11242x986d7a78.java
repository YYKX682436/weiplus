package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage */
/* loaded from: classes8.dex */
public class C11242x986d7a78 {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage$ImgInfo */
    /* loaded from: classes8.dex */
    public static class ImgInfo {

        /* renamed from: path */
        public java.lang.String f32928x346425;

        public ImgInfo(java.lang.String str) {
            this.f32928x346425 = str;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage$Req */
    /* loaded from: classes8.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXBizPublishWithImage.Req";

        /* renamed from: extraData */
        public java.util.HashMap<java.lang.String, java.lang.Object> f32929xf0df6fda;

        /* renamed from: imgInfoList */
        public java.util.ArrayList<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.ImgInfo> f32930xcb0d0b4f;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 44;
        }

        /* renamed from: toJson */
        public java.lang.String m48436xcc31ba03() {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (this.f32930xcb0d0b4f != null) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.ImgInfo> it = this.f32930xcb0d0b4f.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.ImgInfo next = it.next();
                        if (next != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            java.lang.String str = next.f32928x346425;
                            if (str != null) {
                                jSONObject2.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str);
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                    jSONObject.put("img_info_list", jSONArray);
                }
                jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, new org.json.JSONObject(this.f32929xf0df6fda));
                return jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "convert json error, " + e17.getMessage());
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage$Resp */
    /* loaded from: classes8.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {
        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public boolean mo48428x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 44;
        }
    }
}
