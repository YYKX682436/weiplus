package hx;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getAllDynamicCardInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String instanceName = e().f425864a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicBrandService") ? 2 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s07, "MagicAdBrandService") ? 1 : 0;
        if (data.optBoolean("isRec")) {
            i17 = 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiGetAllDynamicCardInfo", "bizName:".concat(s07));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (r01.l lVar : ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).wi(i17)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("msgId", lVar.f449668a);
            jSONObject.put("frameSetName", lVar.f449669b);
            jSONObject.put("frameSetData", lVar.f449670c);
            jSONObject.put("pos", lVar.f449671d);
            if (i17 == 3) {
                jSONObject.put("cardId", lVar.f449672e);
                jSONObject.put("subPos", lVar.f449673f);
            }
            jSONArray.put(jSONObject);
        }
        yz5.l s17 = s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("dynamicCardInfo", jSONArray);
        m(a0Var);
        s17.mo146xb9724478(a0Var);
    }
}
