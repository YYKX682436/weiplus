package no0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final no0.h f420253a = new no0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f420254b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f420255c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f420256d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f420257e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f420258f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f420259g = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public final void a() {
        java.util.Map liveMessageCallbacks = f420255c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveMessageCallbacks, "liveMessageCallbacks");
        synchronized (liveMessageCallbacks) {
            java.util.Iterator it = liveMessageCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                ((yz5.a) ((java.util.Map.Entry) it.next()).getValue()).mo152xb9724478();
            }
        }
    }

    public final void b() {
        java.util.Map liveSlowMessageCallbacks = f420259g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveSlowMessageCallbacks, "liveSlowMessageCallbacks");
        synchronized (liveSlowMessageCallbacks) {
            java.util.Iterator it = liveSlowMessageCallbacks.entrySet().iterator();
            while (it.hasNext()) {
                ((yz5.a) ((java.util.Map.Entry) it.next()).getValue()).mo152xb9724478();
            }
        }
    }

    public final void c(java.lang.String key, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Map liveMessageCallbacks = f420255c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveMessageCallbacks, "liveMessageCallbacks");
        liveMessageCallbacks.put(key, callback);
    }

    public final void d(java.lang.String key, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.Map liveSlowMessageCallbacks = f420259g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveSlowMessageCallbacks, "liveSlowMessageCallbacks");
        liveSlowMessageCallbacks.put(key, callback);
    }

    public final void e() {
        f420255c.clear();
        f420259g.clear();
        f420256d.clear();
        f420257e.clear();
        f420254b.clear();
        f420258f.clear();
    }
}
