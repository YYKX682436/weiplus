package xo0;

/* loaded from: classes10.dex */
public final class b extends xo0.d {
    @Override // xo0.d
    public boolean b(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(a(url, opts, reaper));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        return m17.a() && m17.f294799a.d(m17.f294800b);
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        ip0.b bVar;
        ip0.b bVar2;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        try {
            bVar = url.f375107b;
            bVar2 = ip0.b.ASSET_DATA;
            obj = url.f375106a;
        } catch (java.lang.Exception unused) {
        }
        if (bVar == bVar2) {
            java.lang.String obj2 = obj.toString();
            return new jp0.f(new jp0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open(obj2)), new jp0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open(obj2)), null);
        }
        if (bVar == ip0.b.LOCAL_PATH) {
            return jp0.f.c(obj.toString(), nm5.j.b(obj.toString()));
        }
        try {
            java.lang.String a17 = a(url, opts, reaper);
            if (a17.length() == 0) {
                return null;
            }
            return new jp0.f(new jp0.e(new com.p314xaae8f345.mm.vfs.u6(a17)), new jp0.c(new com.p314xaae8f345.mm.vfs.u6(a17)), null);
        } catch (java.io.FileNotFoundException unused2) {
            return null;
        }
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

    @Override // xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        boolean z17;
        hp0.g gVar2 = gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(httpResponse, "httpResponse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        e(url, httpResponse, gVar, opts, reaper);
        java.lang.String a17 = a(url, opts, reaper);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.imageloader.DefaultImageDiskCache", "save " + url + " filePath " + a17);
        xo0.c cVar = xo0.c.f537276a;
        java.io.OutputStream b17 = cVar.b(a17);
        if (b17 != null) {
            if (gVar2 != null) {
                try {
                    java.lang.Object obj = gVar2.f364446a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "value(...)");
                    xo0.c.a(cVar, (android.graphics.Bitmap) obj, null, 0, b17, 6, null);
                    z17 = true;
                } finally {
                }
            } else {
                z17 = false;
                gVar2 = source;
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
        return true;
    }
}
