package wl1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f528574a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f528575b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f528576c;

    public h(android.content.Context context, wl1.a invoker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
        this.f528574a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f528575b = new java.util.ArrayList();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 a17 = al5.l2.a(context);
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999 = a17.mo120153xd15cf999();
        mo120153xd15cf999.z(true);
        mo120153xd15cf999.E(true);
        mo120153xd15cf999.J(0);
        a17.mo120519x347eaca1(false);
        a17.mo120520x57c53c73(false);
        mo120153xd15cf999.M(false);
        mo120153xd15cf999.C(false);
        mo120153xd15cf999.D(false);
        mo120153xd15cf999.k(true);
        a17.mo74800x23d27c02(new wl1.g(this));
        mo120153xd15cf999.h(false);
        a17.mo120128x74041feb(new wl1.i(invoker), "WeixinJSCore");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RichTextWebView", a17 + " init");
        this.f528576c = a17;
    }

    public static final void a(wl1.h hVar, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        if (hVar.f528574a.getAndSet(true)) {
            return;
        }
        c27816xac2547f9.mo14660x738236e6(ik1.f.e("skyline-richtext-wxjs.js"), wl1.e.f528571a);
        c27816xac2547f9.mo14660x738236e6("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('sys:init', {})", wl1.f.f528572a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hVar.f528575b);
        hVar.f528575b.clear();
        synchronized (hVar) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" destroy:");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f528576c;
        sb6.append(c22633x83752a59.f292909y);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RichTextWebView", sb6.toString());
        if (c22633x83752a59.f292909y) {
            return;
        }
        c22633x83752a59.mo52095x5cd39ffa();
    }

    public final void c(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RichTextWebView", "load data");
        this.f528574a.set(false);
        this.f528576c.mo64581x9b341568(null, data, "text/html", com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, null);
    }
}
