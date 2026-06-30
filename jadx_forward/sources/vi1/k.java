package vi1;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f518912a;

    public k(yz5.r rVar) {
        this.f518912a = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.n24 n24Var = (r45.n24) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.CgiPhoneNumber", "getPhoneNumber success");
        r45.j14 j14Var = n24Var.f462548d;
        int i17 = j14Var.f459024d;
        java.lang.String str = j14Var.f459025e;
        yz5.r rVar = this.f518912a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.CgiPhoneNumber", "jsErrcode:" + i17 + ", jsErrmsg:" + str);
            if (rVar != null) {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (str == null) {
                    str = "";
                }
                rVar.C(bool, str, null, null);
            }
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject(n24Var.f462549e.i());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            vi1.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581.f168931q;
            java.lang.String optString = jSONObject.optString("wx_phone");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 a17 = m0Var.a(optString);
            if (a17 != null) {
                a17.f168939n = true;
                arrayList.add(a17);
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("custom_phone_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    java.lang.String string = optJSONArray.getString(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 a18 = m0Var.a(string);
                    if (a18 != null) {
                        arrayList.add(a18);
                    }
                }
            }
            if (rVar != null) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                r45.jv5 jv5Var = n24Var.f462550f;
                r45.i7 i7Var = n24Var.f462559r;
                java.lang.String str2 = n24Var.f462557p;
                if (str2 == null) {
                    str2 = "";
                }
                rVar.C(bool2, "", arrayList, new cb1.i(jv5Var, i7Var, str2, n24Var.f462560s));
            }
        }
        return jz5.f0.f384359a;
    }
}
