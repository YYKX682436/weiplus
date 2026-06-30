package hf4;

/* loaded from: classes4.dex */
public final class b extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        ef4.c0 c0Var = ef4.c0.f333971a;
        java.lang.Object obj = url.f375106a;
        java.lang.String str = ((hf4.e) obj).f362757d.f471554d;
        java.lang.String str2 = ((hf4.e) obj).f362758e;
        if (str == null) {
            e17 = "";
        } else {
            java.lang.String concat = c0Var.a(str2).concat("pic/");
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            e17 = c0Var.e(concat, kk.k.g(bytes));
        }
        c0Var.b(e17, true);
        return e17;
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        java.lang.String concat;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryLoader", "url " + url + " and path " + a17 + " ret " + j17);
        if (j17) {
            return jp0.f.c(a17, null);
        }
        java.lang.String str = ((hf4.e) url.f375106a).f362757d.f471554d;
        if (str == null) {
            concat = "";
        } else {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(ef4.w.f334001t.b() + str + ".p", true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            concat = i17.concat(".u");
        }
        boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(concat);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryLoader", "thumb url " + url + " and path " + a17 + " ret " + j18);
        if (j18) {
            return jp0.f.c(concat, null);
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
}
