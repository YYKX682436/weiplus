package ax4;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f15123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ax4.e f15125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f15126i;

    public d(java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, ax4.e eVar, nw4.y2 y2Var) {
        this.f15121d = str;
        this.f15122e = str2;
        this.f15123f = map;
        this.f15124g = str3;
        this.f15125h = eVar;
        this.f15126i = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean equals = this.f15121d.toUpperCase().equals("POST");
        java.lang.String str = this.f15124g;
        java.util.Map map = this.f15123f;
        java.lang.String str2 = this.f15122e;
        hy4.e f17 = equals ? hy4.f.f(str2, map, str) : hy4.f.e(str2, map, str);
        ax4.e eVar = this.f15125h;
        nw4.y2 y2Var = this.f15126i;
        if (f17 == null) {
            ax4.a.a(72);
            com.tencent.mars.xlog.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse is null, return");
            ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.ya) eVar).f186683a.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(f17.f286097a);
        java.util.Map map2 = f17.f286098b;
        objArr[1] = java.lang.Integer.valueOf(map2 != null ? ((java.util.HashMap) map2).size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse stats:%d, header.size:%d", objArr);
        ax4.a.a(71);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("statusCode", java.lang.Integer.valueOf(f17.f286097a));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, f17.f286099c);
        if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
            ax4.f.a(map2);
            hashMap.put("header", new org.json.JSONObject(map2).toString());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]values success");
        ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.ya) eVar).f186683a.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
    }
}
