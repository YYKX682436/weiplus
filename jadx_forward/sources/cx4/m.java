package cx4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final cx4.c f306165e = new cx4.c(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f306166f = jz5.h.b(cx4.b.f306117d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f306167a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f306168b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f306169c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f306170d;

    public m() {
        java.util.Iterator it = kz5.c0.i(0, 1, 2, 3, 5).iterator();
        while (it.hasNext()) {
            java.lang.String b17 = b(((java.lang.Number) it.next()).intValue());
            cx4.c cVar = f306165e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f c19298x237af51f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f) cx4.c.a(cVar).r(b17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f.class);
            if (c19298x237af51f != null) {
                long c17 = (c01.id.c() - c19298x237af51f.f264998d) / 1000;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306167a, "checkClear, saveTime: " + java.lang.Long.valueOf(c19298x237af51f.f264998d) + " value: " + java.lang.Integer.valueOf(c19298x237af51f.f264999e) + " offest: " + c17);
                if (c17 > 86400) {
                    cx4.c.a(cVar).W(b17);
                }
            }
        }
        this.f306167a = "MicroMsg.WebViewKeyWordAuditReport";
    }

    public final void a(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d a8Key, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a8Key, "a8Key");
        if (str == null) {
            return;
        }
        if (!this.f306168b || z17) {
            this.f306168b = true;
            int i18 = a8Key.E.f469522i;
            if (i18 <= 0 || i18 > 30) {
                return;
            }
            int i19 = a8Key.f264923j;
            d(i17);
            ku5.u0 u0Var = ku5.t0.f394148d;
            cx4.g gVar = new cx4.g(webView, this, str, i17, i18, str2, i19);
            long j17 = z17 ? 0L : i18 * 1000;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(gVar, j17, false);
        }
    }

    public final java.lang.String b(int i17) {
        return "webview_keyword_audit_report_scene_" + i17;
    }

    public final boolean c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f c19298x237af51f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f) cx4.c.a(f306165e).r(b(i17), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hasReachedLimit key: ");
        sb6.append(b(i17));
        sb6.append(" count: ");
        sb6.append(c19298x237af51f != null ? c19298x237af51f.f264999e : 0);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306167a, sb6.toString());
        return (c19298x237af51f != null ? c19298x237af51f.f264999e : 0) >= 10;
    }

    public final void d(int i17) {
        cx4.c cVar = f306165e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f c19298x237af51f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f) cx4.c.a(cVar).r(b(i17), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f.class);
        if (c19298x237af51f == null) {
            c19298x237af51f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2415xe68be4e1.C19298x237af51f();
            c19298x237af51f.f264998d = c01.id.c();
        }
        c19298x237af51f.f264999e++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306167a, "save result: " + cx4.c.a(cVar).C(b(i17), c19298x237af51f) + " scene: " + i17 + " count: " + c19298x237af51f.f264999e);
    }
}
