package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage */
/* loaded from: classes8.dex */
public class C11231x5a668f69 {
    private static final java.lang.String TAG = "MicroMsg.AddCardToWXCardPackage";

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Req */
    /* loaded from: classes8.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: cardArrary */
        public java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem> f32878x7f0b397;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2;
            java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem> list = this.f32878x7f0b397;
            if (list == null || list.size() == 0 || this.f32878x7f0b397.size() > 40) {
                return false;
            }
            for (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem wXCardItem : this.f32878x7f0b397) {
                if (wXCardItem == null || (str = wXCardItem.f32881xae7c004b) == null || str.length() > 1024 || ((str2 = wXCardItem.f32880xf1940d0) != null && str2.length() > 1024)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 9;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
                jSONStringer.array();
                for (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem wXCardItem : this.f32878x7f0b397) {
                    jSONStringer.object();
                    jSONStringer.key("card_id");
                    jSONStringer.value(wXCardItem.f32881xae7c004b);
                    jSONStringer.key("card_ext");
                    java.lang.String str = wXCardItem.f32880xf1940d0;
                    if (str == null) {
                        str = "";
                    }
                    jSONStringer.value(str);
                    jSONStringer.endObject();
                }
                jSONStringer.endArray();
                jSONStringer.endObject();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.TAG, "Req.toBundle exception:" + e17.getMessage());
            }
            bundle.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp */
    /* loaded from: classes8.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: cardArrary */
        public java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem> f32879x7f0b397;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public boolean mo48428x17b96605() {
            java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem> list = this.f32879x7f0b397;
            return (list == null || list.size() == 0) ? false : true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            if (this.f32879x7f0b397 == null) {
                this.f32879x7f0b397 = new java.util.LinkedList();
            }
            java.lang.String string = bundle.getString("_wxapi_add_card_to_wx_card_list");
            if (string == null || string.length() <= 0) {
                return;
            }
            try {
                org.json.JSONArray jSONArray = ((org.json.JSONObject) new org.json.JSONTokener(string).nextValue()).getJSONArray("card_list");
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem wXCardItem = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem();
                    wXCardItem.f32881xae7c004b = jSONObject.optString("card_id");
                    wXCardItem.f32880xf1940d0 = jSONObject.optString("card_ext");
                    wXCardItem.f32882xf0bbc361 = jSONObject.optInt("is_succ");
                    this.f32879x7f0b397.add(wXCardItem);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.TAG, "fromBundle exception: " + e17.getMessage());
            }
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 9;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            try {
                jSONStringer.object();
                jSONStringer.key("card_list");
                jSONStringer.array();
                for (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.WXCardItem wXCardItem : this.f32879x7f0b397) {
                    jSONStringer.object();
                    jSONStringer.key("card_id");
                    jSONStringer.value(wXCardItem.f32881xae7c004b);
                    jSONStringer.key("card_ext");
                    java.lang.String str = wXCardItem.f32880xf1940d0;
                    if (str == null) {
                        str = "";
                    }
                    jSONStringer.value(str);
                    jSONStringer.key("is_succ");
                    jSONStringer.value(wXCardItem.f32882xf0bbc361);
                    jSONStringer.endObject();
                }
                jSONStringer.endArray();
                jSONStringer.endObject();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.TAG, "Resp.toBundle exception:" + e17.getMessage());
            }
            bundle.putString("_wxapi_add_card_to_wx_card_list", jSONStringer.toString());
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$WXCardItem */
    /* loaded from: classes8.dex */
    public static final class WXCardItem {

        /* renamed from: cardExtMsg */
        public java.lang.String f32880xf1940d0;

        /* renamed from: cardId */
        public java.lang.String f32881xae7c004b;

        /* renamed from: cardState */
        public int f32882xf0bbc361;
    }
}
