package vi1;

/* loaded from: classes7.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final vi1.l2 f518934a = new vi1.l2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f518935b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f518936c = jz5.h.b(vi1.k2.f518916d);

    public final synchronized vi1.j2 a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return (vi1.j2) f518935b.get(appId);
    }

    public final synchronized void b(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.Object mo141623x754a37bb = ((jz5.n) f518936c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).getString(appId, "");
        if (string == null) {
            string = "{}";
        }
        if (string.length() > 0) {
            f518935b.put(appId, new vi1.j2(string));
        }
    }

    public final synchronized void c(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        vi1.j2 a17 = a(appId);
        if (a17 != null) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) f518936c).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).putString(appId, a17.m172207x9616526c());
        }
    }

    public final synchronized void d(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        vi1.j2 a17 = a(appId);
        if (a17 != null) {
            a17.m172207x9616526c();
        }
        f518935b.remove(appId);
        java.lang.Object mo141623x754a37bb = ((jz5.n) f518936c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).remove(appId);
    }
}
