package uh5;

/* loaded from: classes12.dex */
public final class d implements sf3.d {

    /* renamed from: a, reason: collision with root package name */
    public final sf3.c f509537a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f509538b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f509539c;

    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, sf3.c cacheManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheManager, "cacheManager");
        this.f509537a = cacheManager;
        this.f509538b = new java.util.ArrayList();
        this.f509539c = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ChatImageLoaderImpl", activity, 1);
    }

    @Override // sf3.d
    public android.graphics.Bitmap a(sf3.g loadParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadParam, "loadParam");
        loadParam.c();
        android.graphics.Bitmap a17 = this.f509537a.a(loadParam);
        if (a17 != null) {
            return a17;
        }
        return null;
    }

    @Override // sf3.d
    public void b(sf3.g loadParam, sf3.j callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadParam, "loadParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        loadParam.c();
        ((java.util.ArrayList) this.f509538b).add(v65.i.b(this.f509539c, null, new uh5.c(this, loadParam, callback, null), 1, null));
    }

    @Override // sf3.d
    /* renamed from: recycle */
    public void mo162295x408b7293() {
        java.util.Iterator it = this.f509538b.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) it.next(), null, 1, null);
        }
    }
}
