package su4;

/* loaded from: classes8.dex */
public class v2 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile su4.v2 f494652b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f494653a = new java.util.HashMap();

    public static su4.v2 a() {
        if (f494652b == null) {
            synchronized (su4.v2.class) {
                if (f494652b == null) {
                    f494652b = new su4.v2();
                }
            }
        }
        return f494652b;
    }

    public void b(java.lang.String str, boolean z17, int i17) {
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "disable tools and mp");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preload webSearch webView in MM preloadScene:%d", java.lang.Integer.valueOf(i17));
                ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
                ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).getClass();
                qx4.l0.f448955a.e(str, z17, i17);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "preloadWebView %s %s %s %s", bm5.f1.a(), str, 4, java.lang.Boolean.valueOf(z17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                ((ku5.t0) ku5.t0.f394148d).g(new su4.u2(this, str, 4, z17));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "current preload mgr size %s", java.lang.Integer.valueOf(this.f494653a.size()));
        if (z17) {
            this.f494653a.remove(4);
        }
        if (this.f494653a.containsKey(4)) {
            ((su4.d3) this.f494653a.get(4)).a(str);
            return;
        }
        su4.d3 d3Var = new su4.d3(4);
        d3Var.a(str);
        this.f494653a.put(4, d3Var);
    }
}
