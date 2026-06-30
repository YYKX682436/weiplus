package hr4;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final hr4.p f365796a = new hr4.p();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f365797b = jz5.h.b(hr4.m.f365794d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f365798c = jz5.h.b(hr4.l.f365793d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f365799d = jz5.h.b(hr4.k.f365792d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f365800e = jz5.h.b(hr4.o.f365795d);

    public final void a(java.lang.String str, hr4.q getContactCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getContactCallback, "getContactCallback");
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            hr4.q.c(getContactCallback, false, null, 2, null);
            return;
        }
        kr4.e b17 = b(str);
        if (b17 != null) {
            getContactCallback.a(true, b17);
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            hr4.q.c(getContactCallback, false, null, 2, null);
            return;
        }
        c().putIfAbsent(str, getContactCallback);
        if (((hr4.s) ((jz5.n) f365797b).mo141623x754a37bb()).a(str, java.lang.Boolean.TRUE)) {
            return;
        }
        c().remove(str);
        hr4.q.c(getContactCallback, false, null, 2, null);
    }

    public final kr4.e b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        jz5.g gVar = f365799d;
        if (((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(str) != null) {
            return (kr4.e) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(str);
        }
        kr4.e y07 = ((fr4.g0) i95.n0.c(fr4.g0.class)).Ai().y0(str);
        if (y07 == null) {
            return null;
        }
        f365796a.d(y07);
        return y07;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f365798c).mo141623x754a37bb();
    }

    public final void d(kr4.e eVar) {
        java.lang.String str = eVar.f68903xdec927b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f365799d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        concurrentHashMap.put(str, eVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().k0(str);
    }
}
