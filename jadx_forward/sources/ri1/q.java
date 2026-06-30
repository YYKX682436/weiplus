package ri1;

/* loaded from: classes5.dex */
public abstract class q {
    public static final java.lang.String a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str = c() + '/' + appId;
        java.lang.String str2 = b() + '/' + appId;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str) || com.p314xaae8f345.mm.vfs.w6.v(str, str2)) {
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            return str2;
        }
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str;
    }

    public static final java.lang.String b() {
        java.lang.String e17 = lp0.b.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        if (!r26.n0.E(e17, '/', false, 2, null)) {
            e17 = e17.concat("/");
        }
        java.lang.String str = e17 + "appbrand/web_renderingcache";
        com.p314xaae8f345.mm.vfs.w6.u(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    public static final java.lang.String c() {
        java.lang.String h17 = gm0.j1.u().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        if (!r26.n0.E(h17, '/', false, 2, null)) {
            h17 = h17.concat("/");
        }
        java.lang.String str = h17 + "appbrand/web_renderingcache";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }
}
