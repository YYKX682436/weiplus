package pu4;

/* loaded from: classes12.dex */
public class h extends p13.t {
    public h(pu4.i iVar, p13.u uVar) {
        super(uVar);
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchAIHistoryTask";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        super.p(vVar);
        vVar.f432693e = new java.util.ArrayList();
        qu4.e eVar = (qu4.e) i95.n0.c(qu4.e.class);
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch AIHistoryService not ready");
            vVar.f432691c = -2;
            return;
        }
        p13.u uVar = this.f432668n;
        java.lang.String str = uVar.f432674c;
        if (str == null || str.isEmpty()) {
            vVar.f432691c = 0;
            return;
        }
        java.util.HashMap hashMap = o13.n.f423774a;
        java.lang.String c17 = o13.s.c(str.toLowerCase());
        if (c17 != null && !c17.isEmpty()) {
            p13.r b17 = p13.r.b(c17, true);
            if (!b17.a()) {
                vVar.f432692d = b17;
            }
        }
        int i17 = uVar.f432680i;
        java.lang.String Ni = ((pu4.a) eVar).Ni(str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch query=%s resultJson length=%d", str, java.lang.Integer.valueOf(Ni.length()));
        if (Ni.isEmpty() || "[]".equals(Ni)) {
            vVar.f432691c = 0;
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(Ni);
        for (int i18 = 0; i18 < jSONArray.length(); i18++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
            p13.z zVar = new p13.z();
            zVar.f432717b = 720896;
            zVar.f432720e = jSONObject.optString("searchId", "");
            zVar.f432721f = jSONObject.optLong("timeStamp", 0L);
            zVar.f432723h = jSONObject.optString("query", "");
            zVar.f432726k = jSONObject.optString("boxFTS", "");
            zVar.f432718c = jSONObject.optInt("matchSubtype", 1);
            if (!zVar.f432720e.isEmpty()) {
                vVar.f432693e.add(zVar);
            }
        }
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
        if (vVar.f432693e.size() > i17) {
            vVar.f432693e = new java.util.ArrayList(vVar.f432693e.subList(0, i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchAIHistoryLogic", "execSearch resultSize=%d", java.lang.Integer.valueOf(vVar.f432693e.size()));
        vVar.f432691c = 0;
    }
}
