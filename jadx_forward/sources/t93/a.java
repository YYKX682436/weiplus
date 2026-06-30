package t93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String liteAppId, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.util.LinkedList<r45.of1> a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.of1 of1Var : a17) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("nickname", of1Var.m75945x2fec8307(0));
                jSONObject2.put("headURL", of1Var.m75945x2fec8307(1));
                jSONObject2.put("role", of1Var.m75939xb282bd08(2));
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("selectRole", m75939xb282bd08);
            jSONObject.put("roleArray", jSONArray);
            this.f224976f.c(jSONObject, false);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiGetFinderAliasInfos", e17, "", new java.lang.Object[0]);
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
