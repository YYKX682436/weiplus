package rx;

@j95.b
/* loaded from: classes9.dex */
public final class h extends i95.w implements gk0.k0 {
    public gk0.j Ai() {
        return new gk0.j(kz5.c0.k(gk0.l.class, gk0.r.class, dv1.b.class, gk0.f.class, gk0.w.class, gk0.o.class));
    }

    public java.lang.String wi(gk0.k options, y01.a cdnParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnParams, "cdnParams");
        java.lang.String str = options.f353964b + '_' + options.f353963a + '_' + options.f353965c + '_' + options.f353966d + '_' + cdnParams.f540105a + '_' + cdnParams.f540106b + '_' + cdnParams.f540108d + '_' + cdnParams.f540107c;
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf8");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            return g17;
        } catch (java.lang.Exception unused) {
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultCharset, "defaultCharset(...)");
            byte[] bytes2 = str.getBytes(defaultCharset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            java.lang.String g18 = kk.k.g(bytes2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
            return g18;
        }
    }
}
