package p93;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        p93.d dVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppBridgeLuggageJsApi", "invoke " + this.f380556d);
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        synchronized (p93.d.class) {
            if (p93.d.f434424d == null) {
                p93.d.f434424d = new p93.d();
            }
            dVar = p93.d.f434424d;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        dVar.getClass();
        dVar.f434427c.put(java.lang.Integer.valueOf((int) this.f224975e.f380561e), this.f224975e);
        q80.h0 h0Var = dVar.f434426b;
        p93.c cVar = new p93.c(dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.a) h0Var;
        aVar.getClass();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.c cVar2 = aVar.f221342a;
            if (cVar2 == null || cVar2.f221345d != c()) {
                aVar.f221342a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.c(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.C15894x271c6b95.class, cVar);
            }
            sd.l0 l0Var = aVar.f221342a.f221346e;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.f264000a = new java.util.LinkedList();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.b();
                linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t5.f264000a;
            }
            l0Var.g(linkedList, aVar.f221342a);
            sd.l0 l0Var2 = aVar.f221342a.f221346e;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a.class) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a.f221116a = new java.util.LinkedList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a.b();
                linkedList2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.a.f221116a;
            }
            l0Var2.g(linkedList2, aVar.f221342a);
            java.lang.String str2 = this.f380556d;
            org.json.JSONObject put = new org.json.JSONObject(jSONObject2).put("liteCallbackId", this.f224975e.f380561e);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(ya.b.f77491x8758c4e1, str2);
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, put);
            jSONObject3.put("liteCallbackId", this.f224975e.f380561e);
            jSONObject3.put("liteAppId", this.f224975e.f380558b);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", "INVOKE");
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject3);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.b) aVar.f221342a.f221346e).f221344g.f426050b.a(new org.json.JSONObject(hashMap).toString(), false);
        } catch (org.json.JSONException e17) {
            this.f224975e.b("params error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiBridgeLuggageHandler", e17, "liteApp params error", new java.lang.Object[0]);
        }
    }
}
