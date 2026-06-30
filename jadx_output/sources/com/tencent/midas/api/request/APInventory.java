package com.tencent.midas.api.request;

/* loaded from: classes5.dex */
public class APInventory {
    public java.util.Map<java.lang.String, com.tencent.midas.api.request.APPurchase> mPurchaseMap = new java.util.HashMap();
    public java.util.ArrayList<com.tencent.midas.api.request.APPurchase> mPurchaseList = new java.util.ArrayList<>();

    public APInventory(java.lang.String str) {
        parsePurchse(str);
    }

    private void parsePurchse(java.lang.String str) {
        new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.tencent.midas.api.request.APPurchase aPPurchase = new com.tencent.midas.api.request.APPurchase((java.lang.String) jSONArray.getJSONObject(i17).get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), (java.lang.String) jSONArray.getJSONObject(i17).get("sign"));
                this.mPurchaseMap.put(aPPurchase.getSku(), aPPurchase);
                this.mPurchaseList.add(aPPurchase);
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public void erasePurchase(java.lang.String str) {
        if (this.mPurchaseMap.containsKey(str)) {
            this.mPurchaseMap.remove(str);
        }
    }

    public java.util.List<java.lang.String> getAllOwnedSkus() {
        return new java.util.ArrayList(this.mPurchaseMap.keySet());
    }

    public java.util.List<com.tencent.midas.api.request.APPurchase> getAllPurchases() {
        return new java.util.ArrayList(this.mPurchaseMap.values());
    }

    public com.tencent.midas.api.request.APPurchase getPurchase(java.lang.String str) {
        return this.mPurchaseMap.get(str);
    }

    public java.util.List<com.tencent.midas.api.request.APPurchase> getPurchaseList() {
        return this.mPurchaseList;
    }

    public boolean hasPurchase(java.lang.String str) {
        return this.mPurchaseMap.containsKey(str);
    }
}
