package q93;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        q93.g gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppBridgeWebViewJsApi", "invoke " + this.f380556d);
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        synchronized (q93.g.class) {
            if (q93.g.f442451d == null) {
                q93.g.f442451d = new q93.g();
            }
            gVar = q93.g.f442451d;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        gVar.getClass();
        gVar.f442454c.put(java.lang.Integer.valueOf((int) this.f224975e.f380561e), this.f224975e);
        q80.j0 j0Var = gVar.f442453b;
        q93.f fVar = new q93.f(gVar);
        q93.d dVar = (q93.d) j0Var;
        dVar.getClass();
        try {
            if (dVar.f442446a == null) {
                try {
                    dVar.f442446a = dVar.a(dVar, "liteapp", "wxaliteapp", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                } catch (java.lang.ClassNotFoundException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            }
            nw4.y2 c17 = nw4.z2.c(this.f380556d, jSONObject2, java.lang.String.valueOf(this.f224975e.f380561e));
            ((java.util.HashMap) c17.f422323a).put("liteAppId", this.f224975e.f380558b);
            ((java.util.HashMap) c17.f422323a).put("liteAppUuid", java.lang.Long.valueOf(this.f224975e.f380557a));
            ((java.util.HashMap) c17.f422323a).put("liteAppPageId", java.lang.Long.valueOf(this.f224975e.f380559c));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo = this.f224975e.f380564h;
            if (pageInfo != null) {
                ((java.util.HashMap) c17.f422323a).put("liteAppCurrentPage", pageInfo.f37292xd01aac60);
            }
            java.util.Map map = c17.f422323a;
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.String str2 = this.f224975e.f380558b;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
            d85.f0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.b(str2);
            ((java.util.HashMap) map).put("liteAppBusinessScene", b17 != null ? b17.f308709d : "");
            dVar.b(this, c17);
            jd.c cVar = this.f224975e;
            dVar.f442447b = cVar.f380557a;
            dVar.f442448c = cVar.f380559c;
            android.content.Context c18 = c();
            if (!(c18 instanceof android.app.Activity)) {
                android.app.Activity activity = com.p314xaae8f345.mm.app.w.k() != null ? (android.app.Activity) com.p314xaae8f345.mm.app.w.k().get() : null;
                if (activity != null) {
                    c18 = activity;
                }
            }
            nw4.n nVar = dVar.f442446a;
            nVar.f422422c = c18;
            nVar.c(c17, fVar);
            dVar.f442446a.f422422c = null;
        } catch (org.json.JSONException e18) {
            this.f224975e.b("params error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiBridgeWebViewHandler", e18, "", new java.lang.Object[0]);
        }
    }
}
