package mk1;

/* loaded from: classes7.dex */
public final class y {
    public y(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final mk1.w a(java.lang.String src, boolean z17) {
        mk1.w wVar;
        mk1.x xVar = new mk1.x(src);
        if (z17) {
            wVar = (mk1.w) xVar.mo152xb9724478();
        } else {
            int i17 = nk1.d.f419482e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
            android.net.Uri parse = android.net.Uri.parse(src);
            nk1.a aVar = new nk1.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, af1.z.f86049a, nk1.c.f419481r.mo10288xb8a7ce81(), null, 8, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(parse);
            nk1.d dVar = new nk1.d(aVar, new ze1.a(aVar, parse, null, 4, null), null);
            try {
                try {
                    boolean a17 = ye1.b.f542712a.a(dVar);
                    java.lang.String b17 = dVar.b();
                    wVar = new mk1.w(src, b17 == null ? src : b17, a17, dVar.a(), dVar.f(), dVar.c());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.VideoDataSource", e17, "create, judge isHls fail", new java.lang.Object[0]);
                    wVar = (mk1.w) xVar.mo152xb9724478();
                }
                vz5.b.a(dVar, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(dVar, th6);
                    throw th7;
                }
            }
        }
        java.util.Objects.toString(wVar);
        return wVar;
    }

    public final mk1.a0 b(java.lang.String srcUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        mk1.w a17 = a(srcUrl, false);
        return new mk1.a0(a17.f408655a, a17.f408656b, a17.f408658d, a17.f408659e, a17.f408660f, a17.f408657c);
    }
}
