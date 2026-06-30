package ky0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ky0.b f394985a = new ky0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f394986b = kz5.c1.l(new jz5.l(ky0.a.f394982d, new java.util.ArrayList()), new jz5.l(ky0.a.f394983e, new java.util.ArrayList()));

    public final void a(ky0.a scene, yz5.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (this) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f394986b).get(scene);
            if (list != null) {
                list.add(listener);
            }
        }
    }

    public final void b(yz5.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        synchronized (this) {
            for (ky0.a aVar : ky0.a.m144597xcee59d22()) {
                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f394986b).get(aVar);
                if (list != null) {
                    list.remove(listener);
                }
            }
        }
    }
}
