package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class h0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private h0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("cmd");
        java.lang.String string = bundle.getString("param");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (i17 == 10002) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("webpageCount", 1);
            } catch (org.json.JSONException unused) {
            }
            bundle2.putString("backResult", jSONObject.toString());
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
            am.me meVar = c5571xfff98751.f135892h;
            am.le leVar = c5571xfff98751.f135891g;
            leVar.f88776a = i17;
            leVar.f88777b = string;
            leVar.f88778c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            c5571xfff98751.e();
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(meVar.f88874a)) {
                    bundle2.putString("backResult", "");
                } else {
                    bundle2.putString("backResult", new org.json.JSONObject(meVar.f88874a).toString());
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        rVar.a(bundle2);
    }
}
