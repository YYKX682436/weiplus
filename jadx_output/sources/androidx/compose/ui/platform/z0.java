package androidx.compose.ui.platform;

/* loaded from: classes11.dex */
public final class z0 implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f10828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.e f10829e;

    public z0(kotlin.jvm.internal.h0 h0Var, x1.e eVar) {
        this.f10828d = h0Var;
        this.f10829e = eVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.o.g(configuration, "configuration");
        kotlin.jvm.internal.h0 h0Var = this.f10828d;
        android.content.res.Configuration configuration2 = (android.content.res.Configuration) h0Var.f310123d;
        int updateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        java.util.Iterator it = this.f10829e.f451347a.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "it.next()");
            x1.c cVar = (x1.c) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) next).getValue()).get();
            if (cVar == null || android.content.res.Configuration.needNewResources(updateFrom, cVar.f451344b)) {
                it.remove();
            }
        }
        h0Var.f310123d = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10829e.f451347a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        this.f10829e.f451347a.clear();
    }
}
