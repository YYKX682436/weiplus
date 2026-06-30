package xo0;

/* loaded from: classes10.dex */
public abstract class a extends xo0.d {
    @Override // xo0.d
    public abstract java.lang.String a(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    @Override // xo0.d
    public boolean b(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        return com.p314xaae8f345.mm.vfs.w6.h(a(url, opts, reaper));
    }

    @Override // xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        android.graphics.Bitmap bitmap;
        boolean z17;
        hp0.g gVar2 = gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(httpResponse, "httpResponse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        if (e(url, httpResponse, gVar, opts, reaper)) {
            java.lang.String a17 = a(url, opts, reaper);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.IDiskCache", "save " + url + " filePath " + a17);
            xo0.c cVar = xo0.c.f537276a;
            java.io.OutputStream b17 = cVar.b(a17);
            if (b17 != null) {
                if (gVar2 != null) {
                    try {
                        bitmap = (android.graphics.Bitmap) gVar2.f364446a;
                    } finally {
                    }
                } else {
                    bitmap = null;
                }
                if (gVar2 == null || bitmap == null) {
                    z17 = false;
                    gVar2 = source;
                } else {
                    xo0.c.a(cVar, bitmap, null, 0, b17, 6, null);
                    z17 = true;
                }
                if (!z17) {
                    httpResponse.b(b17);
                    z17 = true;
                }
                if (z17) {
                    d(url, gVar2, opts, reaper);
                }
                vz5.b.a(b17, null);
            }
        }
        return true;
    }
}
