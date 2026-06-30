package mf3;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f407646a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f407647b;

    public p(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f407646a = context;
        this.f407647b = new java.util.concurrent.ConcurrentHashMap();
    }

    public final mf3.j a(java.lang.Class apiClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClass, "apiClass");
        java.lang.Object obj = this.f407647b.get(apiClass.getName());
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LayerApiCenter", "layerApi not found: ".concat(apiClass.getSimpleName()));
        }
        if (obj instanceof mf3.j) {
            return (mf3.j) obj;
        }
        return null;
    }

    public final pf5.c b(f06.d apiKClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiKClass, "apiKClass");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LayerApiCenter", "pageApi not found: " + apiKClass.g());
        return c(xz5.a.b(apiKClass));
    }

    public final pf5.c c(java.lang.Class apiClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiClass, "apiClass");
        android.content.Context context = this.f407646a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pf5.c d17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).d(apiClass);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LayerApiCenter", "pageApi not found: ".concat(apiClass.getSimpleName()));
        }
        if (d17 == null) {
            return null;
        }
        return d17;
    }

    public final void d(java.lang.Class api, java.lang.Object impl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(impl, "impl");
        this.f407647b.put(api.getName(), impl);
    }
}
