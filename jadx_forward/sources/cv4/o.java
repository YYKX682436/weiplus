package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/o;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiQuerySearchWeb", jSONObject != null ? jSONObject.toString() : null);
        su4.s1 s1Var = new su4.s1(jSONObject != null ? jSONObject.optString("requestId", "") : null, jSONObject != null ? jSONObject.optString("commReq", "") : null, hashCode());
        gm0.j1.d().a(2975, this);
        gm0.j1.d().g(s1Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof su4.s1) {
            su4.s1 s1Var = (su4.s1) m1Var;
            if (s1Var.f494625h == hashCode()) {
                gm0.j1.d().q(2975, this);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("retCode", i18);
                if (str == null) {
                    str = "";
                }
                jSONObject.put("errMsg", str);
                jSONObject.put("json", ((r45.e97) s1Var.f494622e.f152244b.f152233a).f454714d);
                jSONObject.put("requestId", s1Var.f494624g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiQuerySearchWeb", "request : " + jSONObject);
                this.f224976f.c(jSONObject, false);
            }
        }
    }
}
