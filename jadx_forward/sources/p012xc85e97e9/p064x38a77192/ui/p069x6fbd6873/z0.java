package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes11.dex */
public final class z0 implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f92361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.e f92362e;

    public z0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, x1.e eVar) {
        this.f92361d = h0Var;
        this.f92362e = eVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f92361d;
        android.content.res.Configuration configuration2 = (android.content.res.Configuration) h0Var.f391656d;
        int updateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        java.util.Iterator it = this.f92362e.f532880a.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "it.next()");
            x1.c cVar = (x1.c) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) next).getValue()).get();
            if (cVar == null || android.content.res.Configuration.needNewResources(updateFrom, cVar.f532877b)) {
                it.remove();
            }
        }
        h0Var.f391656d = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f92362e.f532880a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        this.f92362e.f532880a.clear();
    }
}
