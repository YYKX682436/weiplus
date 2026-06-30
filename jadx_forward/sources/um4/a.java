package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum4/a;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiQueryWebCommCgi", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("requestId", "");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiQueryWebCommCgi", e17, "invoke", new java.lang.Object[0]);
                this.f224976f.a("Error");
                return;
            }
        } else {
            optString = null;
        }
        gm0.j1.d().g(new sm4.a(optString, jSONObject != null ? jSONObject.optString("commReq", "") : null));
        gm0.j1.d().a(2582, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("retCode", i18);
            gm0.j1.d().q(2582, this);
            if (i17 == 0 && i18 == 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.topstory.api.netscene.NetSceneSearchWebComm");
                jSONObject.put("commResp", ((r45.e97) ((sm4.a) m1Var).f491456e.f152244b.f152233a).f454714d);
                jSONObject.put("requestId", ((r45.e97) ((sm4.a) m1Var).f491456e.f152244b.f152233a).f454715e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiQueryWebCommCgi", "NetSceneSearchWebComm response, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.topstory.api.netscene.NetSceneSearchWebComm");
                jSONObject.put("requestId", ((sm4.a) m1Var).f491458g);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiQueryWebCommCgi", e17, "onSceneEnd", new java.lang.Object[0]);
            this.f224976f.a("Error");
        }
        this.f224976f.c(jSONObject, false);
    }
}
