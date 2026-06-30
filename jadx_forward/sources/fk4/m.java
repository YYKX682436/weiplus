package fk4;

/* loaded from: classes10.dex */
public final class m extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        return ((fk4.n) url.f375106a).f345177e;
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        c06.e eVar = fk4.d.f345130a;
        url.m139674x9616526c();
        com.p314xaae8f345.mm.vfs.w6.j(a17);
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            return jp0.f.c(a17, null);
        }
        return null;
    }

    @Override // xo0.d
    public boolean d(ip0.a url, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.d
    public boolean e(ip0.a url, hp0.i httpResponse, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(httpResponse, "httpResponse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.a, xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(httpResponse, "httpResponse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        c06.e eVar = fk4.d.f345130a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save ");
        sb6.append(url);
        sb6.append(" filePath ");
        sb6.append(a17);
        sb6.append(' ');
        sb6.append(source);
        sb6.append(", ");
        java.lang.Object obj = source.f364446a;
        sb6.append(obj);
        boolean z17 = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CdnImageLoader", sb6.toString(), new java.lang.Object[0]);
        xo0.c cVar = xo0.c.f537276a;
        java.io.OutputStream b17 = cVar.b(a17);
        if (b17 != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageLoader", "open stream save " + url);
                if (obj != null) {
                    xo0.c.a(cVar, (android.graphics.Bitmap) obj, null, 0, b17, 6, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageLoader", "finished compress to local file: " + url);
                    z17 = true;
                }
                if (!z17) {
                    httpResponse.b(b17);
                    z17 = true;
                }
                if (z17) {
                    d(url, source, opts, reaper);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageLoader", "call onCompleted finished: " + url);
                vz5.b.a(b17, null);
            } finally {
            }
        }
        return true;
    }
}
