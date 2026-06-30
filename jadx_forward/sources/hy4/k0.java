package hy4;

/* loaded from: classes7.dex */
public final class k0 extends o25.k2 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[][] f367655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f367656e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f367657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f367658g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f367660i;

    /* renamed from: j, reason: collision with root package name */
    public long f367661j;

    /* renamed from: p, reason: collision with root package name */
    public boolean f367667p;

    /* renamed from: s, reason: collision with root package name */
    public long f367670s;

    /* renamed from: t, reason: collision with root package name */
    public int f367671t;

    /* renamed from: v, reason: collision with root package name */
    public long f367673v;

    /* renamed from: x, reason: collision with root package name */
    public int f367675x;

    /* renamed from: y, reason: collision with root package name */
    public volatile android.os.MessageQueue.IdleHandler f367676y;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f367659h = "";

    /* renamed from: k, reason: collision with root package name */
    public final boolean f367662k = true;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f367663l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f367664m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f367665n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f367666o = "";

    /* renamed from: q, reason: collision with root package name */
    public cx4.n f367668q = cx4.n.f306171e;

    /* renamed from: r, reason: collision with root package name */
    public cx4.r f367669r = cx4.r.f306182e;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f367672u = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f367674w = "";

    public final void c(java.lang.String titles, java.lang.String data, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, java.util.List list) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titles, "titles");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        if (nw4.w2.a()) {
            java.lang.String x17 = r26.i0.x(r26.i0.w(new java.lang.String(s46.d.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("jsapi/vconsole_performance.js")), r26.c.f450398a), "$WF_DATAS$", data, false), "$WF_TITLES$", titles, false, 4, null);
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jz5.l lVar = (jz5.l) it.next();
                    arrayList.add("{k:'" + ((java.lang.String) lVar.f384366d) + "', v:'" + r26.i0.v((java.lang.String) lVar.f384367e, "'", "\\'", false, 4, null) + "'}");
                }
                str = kz5.n0.g0(arrayList, ",", "[", "]", 0, null, null, 56, null);
            } else {
                str = "[]";
            }
            webview.mo14660x738236e6(r26.i0.x(x17, "$WF_LOG$", str, false, 4, null), null);
        }
    }

    public final void d() {
        android.os.MessageQueue.IdleHandler idleHandler = this.f367676y;
        if (idleHandler != null) {
            try {
                android.os.Looper.myQueue().removeIdleHandler(idleHandler);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewPerformanceHelper", "removePendingIdleHandler error: " + e17.getMessage());
            }
            this.f367676y = null;
        }
    }
}
