package ax4;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f96656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ax4.e f96658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f96659i;

    public d(java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, ax4.e eVar, nw4.y2 y2Var) {
        this.f96654d = str;
        this.f96655e = str2;
        this.f96656f = map;
        this.f96657g = str3;
        this.f96658h = eVar;
        this.f96659i = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean equals = this.f96654d.toUpperCase().equals("POST");
        java.lang.String str = this.f96657g;
        java.util.Map map = this.f96656f;
        java.lang.String str2 = this.f96655e;
        hy4.e f17 = equals ? hy4.f.f(str2, map, str) : hy4.f.e(str2, map, str);
        ax4.e eVar = this.f96658h;
        nw4.y2 y2Var = this.f96659i;
        if (f17 == null) {
            ax4.a.a(72);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse is null, return");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ya) eVar).f268216a.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(f17.f367630a);
        java.util.Map map2 = f17.f367631b;
        objArr[1] = java.lang.Integer.valueOf(map2 != null ? ((java.util.HashMap) map2).size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse stats:%d, header.size:%d", objArr);
        ax4.a.a(71);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("statusCode", java.lang.Integer.valueOf(f17.f367630a));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, f17.f367632c);
        if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
            ax4.f.a(map2);
            hashMap.put("header", new org.json.JSONObject(map2).toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]values success");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ya) eVar).f268216a.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
