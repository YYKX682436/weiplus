package ex4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public boolean f338760c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f338761d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f338762e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f338763f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ScrollView f338764g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f338765h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f338766i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f338767j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f338768k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f338769l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f338770m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f338771n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f338772o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f338773p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f338774q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f338775r;

    /* renamed from: t, reason: collision with root package name */
    public long f338777t;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f338758a = jz5.h.b(ex4.k.f338753d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f338759b = jz5.h.b(ex4.l.f338754d);

    /* renamed from: s, reason: collision with root package name */
    public final ex4.m f338776s = new ex4.m(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.g1 f338778u = new ex4.n(this);

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d a() {
        java.lang.ref.WeakReference weakReference = this.f338774q;
        if (weakReference != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get();
        }
        return null;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f338773p;
        if (e3Var != null) {
            e3Var.L0(this.f338776s);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = this.f338773p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e3Var2);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w(e3Var2));
        }
        if (this.f338765h != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a;
                objArr[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData url list size %d", objArr);
                if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "not system WebView, clear all data.");
                    android.webkit.WebStorage.getInstance().deleteAllData();
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a)) {
                    java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a.iterator();
                    while (it.hasNext()) {
                        android.webkit.WebStorage.getInstance().deleteOrigin(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.i.a((java.lang.String) it.next()));
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a)) {
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies ex %s", e17.getMessage());
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearHostCookies end");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.c0.f264779a.clear();
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebView.SysWebViewDataCleanHelper", "clearWebViewData ex %s", e18.getMessage());
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f338765h;
            if (c22633x83752a59 != null) {
                c22633x83752a59.mo120189xb61559a7(null);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = this.f338765h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a592);
            c22633x83752a592.mo52095x5cd39ffa();
            this.f338765h = null;
        }
    }
}
