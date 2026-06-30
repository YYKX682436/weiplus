package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class d0 implements l75.q0, su4.v0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.util.HashMap f263013d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.HashMap f263014e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.HashMap f263015f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.HashMap f263016g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.HashMap f263017h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.util.HashMap f263018i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263019m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263020n;

    public d0() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372>(a0Var) { // from class: com.tencent.mm.plugin.websearch.FTSWebViewImageLogic$1
            {
                this.f39173x3fe91575 = 1327212386;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb0026372) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5417xb0026372 c5417xb00263722 = c5417xb0026372;
                am.n9 n9Var = c5417xb00263722.f135764g;
                if (n9Var.f88939a == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "Emoji Download callback %s", n9Var.f88945g);
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263015f.containsKey(c5417xb00263722.f135764g.f88945g)) {
                        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263015f) {
                            int intValue = ((java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263018i.get(c5417xb00263722.f135764g.f88945g)).intValue();
                            java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263015f.get(c5417xb00263722.f135764g.f88945g);
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            java.util.Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                java.lang.String str = (java.lang.String) it.next();
                                java.lang.String str2 = "weixin://fts/emoji?path=" + c5417xb00263722.f135765h.f89051a;
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                try {
                                    jSONObject.put(dm.i4.f66865x76d1ec5a, str);
                                    jSONObject.put("src", str2);
                                } catch (org.json.JSONException unused) {
                                }
                                jSONArray.put(jSONObject);
                            }
                            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263015f.remove(c5417xb00263722.f135764g.f88945g);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263018i.remove(c5417xb00263722.f135764g.f88945g);
                        }
                    }
                }
                return false;
            }
        };
        this.f263019m = abstractC20980x9b9ad01d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50>(a0Var) { // from class: com.tencent.mm.plugin.websearch.FTSWebViewImageLogic$2
            {
                this.f39173x3fe91575 = -1231290816;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50 c6066x1782ba50) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50 c6066x1782ba502 = c6066x1782ba50;
                if (c6066x1782ba502 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6066x1782ba50) {
                    am.yv yvVar = c6066x1782ba502.f136349g;
                    if (yvVar.f90014a == 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "[%s][media:%s]Download callback", "[image-flow]", yvVar.f90016c);
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263014e.containsKey(c6066x1782ba502.f136349g.f90016c)) {
                            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263014e) {
                                int intValue = ((java.lang.Integer) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263017h.get(c6066x1782ba502.f136349g.f90016c)).intValue();
                                java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263014e.get(c6066x1782ba502.f136349g.f90016c);
                                org.json.JSONArray jSONArray = new org.json.JSONArray();
                                java.util.Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    java.lang.String str = (java.lang.String) it.next();
                                    java.lang.String str2 = "weixin://fts/sns?path=" + com.p314xaae8f345.mm.vfs.w6.i(c6066x1782ba502.f136349g.f90017d, false);
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    try {
                                        jSONObject.put(dm.i4.f66865x76d1ec5a, str);
                                        jSONObject.put("src", str2);
                                    } catch (org.json.JSONException unused) {
                                    }
                                    jSONArray.put(jSONObject);
                                }
                                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263014e.remove(c6066x1782ba502.f136349g.f90016c);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d0.this.f263017h.remove(c6066x1782ba502.f136349g.f90016c);
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f263020n = abstractC20980x9b9ad01d2;
        this.f263013d = new java.util.HashMap();
        this.f263014e = new java.util.HashMap();
        this.f263016g = new java.util.HashMap();
        this.f263017h = new java.util.HashMap();
        this.f263015f = new java.util.HashMap();
        this.f263018i = new java.util.HashMap();
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().add(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null || w0Var.f398509d == null) {
            return;
        }
        synchronized (this.f263013d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "event %s，eventData %s", str, w0Var.m145266x9616526c());
            java.lang.String obj = w0Var.f398509d.toString();
            if (this.f263013d.containsKey(obj) && this.f263016g.containsKey(obj)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewImageLogic", "notify avatar changed %s", obj);
                int intValue = ((java.lang.Integer) this.f263016g.get(obj)).intValue();
                java.util.HashSet hashSet = new java.util.HashSet((java.util.HashSet) this.f263013d.get(obj));
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    java.lang.String str3 = "weixin://fts/avatar?path=" + com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(obj, false, false);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put(dm.i4.f66865x76d1ec5a, str2);
                        jSONObject.put("src", str3);
                    } catch (org.json.JSONException unused) {
                    }
                    jSONArray.put(jSONObject);
                }
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ui(intValue, 0, jSONArray.toString());
                this.f263013d.remove(obj);
                this.f263016g.remove(obj);
            }
        }
    }
}
