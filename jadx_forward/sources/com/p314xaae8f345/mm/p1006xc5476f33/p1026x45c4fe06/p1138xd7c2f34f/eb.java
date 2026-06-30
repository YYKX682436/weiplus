package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class eb {
    public eb(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb a(java.lang.String jsonString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonString, "jsonString");
        try {
            java.lang.Object opt = new org.json.JSONObject(jsonString).opt("auth_item_list");
            if (opt != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(org.json.JSONObject.NULL, opt) && (opt instanceof org.json.JSONArray) && ((org.json.JSONArray) opt).length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.db dbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.db.f166108d;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                cf.f.b((org.json.JSONArray) opt, new cf.e(dbVar, linkedList));
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.fb(linkedList);
            }
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PrefetchGetUserPrivacyAuthInfoResponse", "parse json get exception:" + e17);
        }
        return null;
    }
}
