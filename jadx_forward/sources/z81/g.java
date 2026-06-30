package z81;

/* loaded from: classes13.dex */
public class g implements h91.b {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f552230d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f552231e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1043xd1075a44.C11803x74c53cda f552232f;

    /* renamed from: g, reason: collision with root package name */
    public final z81.i f552233g;

    /* renamed from: i, reason: collision with root package name */
    public final h91.b f552235i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.String f552236m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f552237n;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f552240q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f552242s;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f552238o = new z81.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f552239p = new z81.c(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f552241r = true;

    /* renamed from: h, reason: collision with root package name */
    public final z81.h f552234h = new z81.h();

    public g(h91.b bVar) {
        this.f552235i = bVar;
        this.f552233g = new z81.i(new z81.f(bVar));
    }

    @Override // h91.b
    public void a() {
    }

    @Override // h91.b
    public void b(java.lang.Runnable runnable) {
        if (equals(this.f552235i)) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
    }

    @Override // h91.b
    public void c(org.json.JSONArray jSONArray, h91.a aVar) {
        this.f552235i.b(new z81.d(this, jSONArray, aVar));
    }

    @Override // h91.b
    public boolean d(android.graphics.Canvas canvas) {
        if (this.f552241r) {
            this.f552233g.f552252i = false;
            return f(canvas, this.f552231e);
        }
        this.f552233g.f552252i = true;
        if (this.f552232f == null) {
            this.f552230d = false;
            return false;
        }
        if (this.f552232f.f158702h) {
            this.f552232f.getClass();
            this.f552232f.getClass();
            return f(canvas, null);
        }
        this.f552230d = false;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11754xcbc74679> list = this.f552232f != null ? this.f552232f.f158700f : null;
        if (list == null || list.size() == 0) {
            return false;
        }
        java.lang.System.nanoTime();
        this.f552233g.a();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11754xcbc74679 c11754xcbc74679 : list) {
            try {
                if (c11754xcbc74679 != null) {
                    try {
                        int i17 = c11754xcbc74679.f158579d;
                        if (i17 == 1) {
                            this.f552234h.b(this.f552233g, canvas, c11754xcbc74679.f158581f);
                            throw new java.lang.IllegalStateException("please use draw obj " + c11754xcbc74679.f158581f.toString());
                            break;
                        }
                        if (i17 != 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DrawActionDelegateImpl", "unknown arg type %d", java.lang.Integer.valueOf(i17));
                        } else {
                            z81.h hVar = this.f552234h;
                            z81.i iVar = this.f552233g;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb abstractC11750x219b3eb = c11754xcbc74679.f158580e;
                            a91.d dVar = (a91.d) ((java.util.HashMap) hVar.f552243a).get(abstractC11750x219b3eb.f158574d);
                            if (dVar != null) {
                                dVar.b(iVar, canvas, abstractC11750x219b3eb);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DrawActionDelegateImpl", e18, "", new java.lang.Object[0]);
            }
        }
        java.lang.System.nanoTime();
        java.lang.System.currentTimeMillis();
        return true;
    }

    @Override // h91.b
    public void e(org.json.JSONArray jSONArray, h91.a aVar) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.f552235i.b(new z81.e(this, jSONArray, aVar));
    }

    public final boolean f(android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        this.f552230d = false;
        if (jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        java.lang.System.nanoTime();
        this.f552233g.a();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                try {
                    this.f552234h.b(this.f552233g, canvas, optJSONObject);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawActionDelegateImpl", "drawAction error with method[%s], exception : %s", optJSONObject.optString(ya.b.f77491x8758c4e1), e17);
                }
            }
        }
        java.lang.System.nanoTime();
        java.lang.System.currentTimeMillis();
        return true;
    }
}
