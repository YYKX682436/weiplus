package ch0;

/* loaded from: classes8.dex */
public final class z implements tg0.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ch0.a0 f122794a;

    /* renamed from: b, reason: collision with root package name */
    public int f122795b;

    /* renamed from: c, reason: collision with root package name */
    public int f122796c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f122797d;

    /* renamed from: e, reason: collision with root package name */
    public int f122798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f122799f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f122800g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f122801h;

    /* renamed from: i, reason: collision with root package name */
    public tg0.a2 f122802i;

    /* renamed from: j, reason: collision with root package name */
    public tg0.z1 f122803j;

    /* renamed from: k, reason: collision with root package name */
    public ch0.a f122804k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f122805l;

    /* renamed from: m, reason: collision with root package name */
    public ch0.h f122806m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f122807n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f122808o;

    public z(ch0.a0 sceneManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneManager, "sceneManager");
        this.f122794a = sceneManager;
        this.f122797d = "";
        this.f122805l = new java.util.LinkedList();
        this.f122807n = new java.util.LinkedHashMap();
        this.f122808o = true;
    }

    public final void a(ch0.a aVar) {
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = aVar.f122719b;
            abstractC19224x1fe3df6e.m74099x67c34919(null);
            qx4.d0 d0Var = aVar.f122720c;
            d0Var.f448934j = null;
            d0Var.p(null);
            if (abstractC19224x1fe3df6e.f292909y) {
                return;
            }
            abstractC19224x1fe3df6e.mo120173x7af55728("webSearchJSApi");
            nw4.n nVar = d0Var.f448927c;
            if (nVar != null) {
                nVar.f422422c = null;
            }
            d0Var.f448934j = null;
            d0Var.f448935k = null;
            d0Var.f95859a = null;
            java.lang.Object mo120164x90fc158e = abstractC19224x1fe3df6e.mo120164x90fc158e();
            if (mo120164x90fc158e instanceof zg0.q2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) ((zg0.q2) mo120164x90fc158e)).D0();
            }
            abstractC19224x1fe3df6e.mo52095x5cd39ffa();
        }
    }

    public final java.util.Map b(int i17, tg0.c1 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f500606e;
        java.util.Map map = this.f122807n;
        if (i17 == 1) {
            map.put("isInFlutter", "1");
        } else {
            map.put("isInFlutter", "2");
        }
        map.put("preGetData", tg0.m1.c(result));
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final ch0.a c() {
        ch0.a aVar = (ch0.a) this.f122805l.pollFirst();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cached webview for activity: ");
        sb6.append(this.f122798e);
        sb6.append(", found: ");
        sb6.append(aVar != null);
        java.lang.String content = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        return aVar;
    }
}
