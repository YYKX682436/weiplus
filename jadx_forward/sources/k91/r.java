package k91;

/* loaded from: classes7.dex */
public class r implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g0 {
    public k91.m A;
    public java.util.Set B;
    public org.json.JSONObject D;
    public org.json.JSONObject E;
    public org.json.JSONObject F;
    public org.json.JSONObject G;
    public org.json.JSONObject H;
    public org.json.JSONObject I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f387269J;
    public java.lang.String L;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f387270d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f387271e;

    /* renamed from: f, reason: collision with root package name */
    public k91.d f387272f;

    /* renamed from: g, reason: collision with root package name */
    public k91.d f387273g;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f387275i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Map f387276m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f387277n;

    /* renamed from: o, reason: collision with root package name */
    public k91.n f387278o;

    /* renamed from: p, reason: collision with root package name */
    public k91.n f387279p;

    /* renamed from: q, reason: collision with root package name */
    public k91.e f387280q;

    /* renamed from: r, reason: collision with root package name */
    public k91.c f387281r;

    /* renamed from: t, reason: collision with root package name */
    public java.util.Set f387283t;

    /* renamed from: u, reason: collision with root package name */
    public org.json.JSONArray f387284u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f387285v;

    /* renamed from: y, reason: collision with root package name */
    public k91.h f387288y;

    /* renamed from: z, reason: collision with root package name */
    public k91.j f387289z;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f387274h = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Boolean f387282s = java.lang.Boolean.FALSE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f387286w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f387287x = false;
    public boolean C = false;
    public boolean K = false;

    public r(boolean z17) {
        this.f387270d = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k91.r h(java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.r.h(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):k91.r");
    }

    public static java.util.Map i(org.json.JSONObject jSONObject, k91.d dVar, k91.j jVar) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, new k91.f(jSONObject.optJSONObject(next), dVar, jVar));
        }
        return hashMap;
    }

    public k91.d a() {
        k91.d dVar;
        return (!this.f387270d || (dVar = this.f387273g) == null) ? this.f387272f : dVar;
    }

    public java.lang.String b() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f387269J) ? this.f387269J : "index.html";
    }

    public k91.f c(java.lang.String str) {
        java.util.Map map;
        if (!android.text.TextUtils.isEmpty(str)) {
            synchronized (this.f387274h) {
                if (!((java.util.HashMap) this.f387275i).containsKey(str)) {
                    str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str);
                }
                if (((java.util.HashMap) this.f387275i).containsKey(str)) {
                    return (this.f387270d && (map = this.f387276m) != null && map.containsKey(str)) ? (k91.f) this.f387276m.get(str) : (k91.f) ((java.util.HashMap) this.f387275i).get(str);
                }
            }
        }
        return new k91.f(null, this.f387272f, this.f387289z);
    }

    public k91.l d(java.lang.String str) {
        k91.m mVar = this.A;
        if (mVar == null || mVar.f387204a == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        if (str.endsWith(".html")) {
            str = str.substring(0, str.indexOf(".html"));
        }
        return (k91.l) this.A.f387204a.get(str);
    }

    public k91.n e() {
        k91.n nVar;
        return (!this.f387270d || (nVar = this.f387279p) == null) ? this.f387278o : nVar;
    }

    public final boolean f() {
        org.json.JSONObject jSONObject = this.E;
        return jSONObject != null && jSONObject.length() > 0;
    }

    public final boolean g() {
        return f() && this.f387270d;
    }
}
