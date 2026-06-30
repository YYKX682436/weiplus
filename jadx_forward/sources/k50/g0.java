package k50;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k50.g0 f385747a = new k50.g0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f385748b = jz5.h.b(k50.d0.f385734d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f385749c = kz5.c1.k(new jz5.l(k50.o0.f385776d, 1), new jz5.l(k50.o0.f385778f, 2), new jz5.l(k50.o0.f385777e, 3));

    public final long a(k50.o0 o0Var) {
        java.lang.String str = "forward_other_apps_last_used_" + o0Var.name();
        java.lang.Object mo141623x754a37bb = ((jz5.n) f385748b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).q(str, 0L);
    }

    public final void b(k50.o0 app) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app, "app");
        java.lang.String str = "forward_other_apps_last_used_" + app.name();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object mo141623x754a37bb = ((jz5.n) f385748b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).B(str, currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Forward.OtherAppsOrder", "recordUsage: " + app.name() + ", time=" + currentTimeMillis);
    }

    public final void c(java.util.List list, yz5.l appSelector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appSelector, "appSelector");
        java.util.Collection collection = k50.o0.f385781i;
        boolean z17 = false;
        if (!(collection instanceof java.util.Collection) || !((kz5.b) collection).isEmpty()) {
            java.util.Iterator it = ((kz5.h) collection).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (f385747a.a((k50.o0) it.next()) > 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            kz5.g0.t(list, new k50.f0(appSelector));
        } else if (list.size() > 1) {
            kz5.g0.t(list, new k50.e0(appSelector));
        }
    }
}
