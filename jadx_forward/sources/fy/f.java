package fy;

/* loaded from: classes.dex */
public final class f implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f348700d;

    public f(yz5.l lVar) {
        this.f348700d = lVar;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchResult ");
        sb6.append(vVar.f432691c == 0);
        sb6.append(" count ");
        sb6.append(vVar.f432693e.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", sb6.toString());
        java.util.List resultList = vVar.f432693e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultList, "resultList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
        java.util.Iterator it = resultList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.y) it.next()).f432720e, true));
        }
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.z3> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj;
            if (z3Var.r2() && !fy.i.c(fy.i.f348703b, z3Var)) {
                arrayList2.add(obj);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77504xbb80cbe3, true);
        jSONObject.put("total_count", arrayList2.size());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 : arrayList2) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("chat_id", z3Var2.d1());
            jSONObject2.put("nickname", z3Var2.P0());
            jSONObject2.put("remark", z3Var2.w0());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("chat_list", jSONArray);
        this.f348700d.mo146xb9724478(jSONObject);
    }
}
