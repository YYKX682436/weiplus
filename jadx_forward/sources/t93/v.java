package t93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt93/v;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String liteAppId, org.json.JSONObject jSONObject, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        try {
            java.lang.String optString = jSONObject.optString("items");
            int optInt = jSONObject.optInt("batchLoadScene");
            cl0.e eVar = new cl0.e(optString);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            if (mo15056xbe0e3ae6 > 20) {
                mo15056xbe0e3ae6 = 20;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteJsApiPreloadFinderFeed", "preload %s", java.lang.Integer.valueOf(eVar.mo15056xbe0e3ae6()));
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                r45.rv0 rv0Var = new r45.rv0();
                java.lang.Object obj = eVar.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.json.InnerJSONObject");
                cl0.c cVar = (cl0.c) obj;
                rv0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(cVar.mo15074x2fec8307("feedId"))));
                rv0Var.set(1, cVar.mo15074x2fec8307("encryptId"));
                rv0Var.set(2, cVar.mo15074x2fec8307("nonceId"));
                linkedList.add(rv0Var);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, optInt);
            this.f224976f.d(false);
        } catch (org.json.JSONException unused) {
            this.f224976f.a("fail");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
