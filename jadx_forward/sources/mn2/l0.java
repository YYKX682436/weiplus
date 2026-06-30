package mn2;

/* loaded from: classes10.dex */
public final class l0 extends xo0.a {
    @Override // xo0.a, xo0.d
    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        return ((mn2.h3) url.f375106a).mo148083xfb83cc9b();
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        java.lang.String a17 = a(url, opts, reaper);
        url.m139674x9616526c();
        com.p314xaae8f345.mm.vfs.w6.j(a17);
        java.lang.Object obj = url.f375106a;
        mn2.h3 h3Var = (mn2.h3) obj;
        java.util.Objects.toString(h3Var.mo148082x7f025288());
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            return jp0.f.c(a17, null);
        }
        if (!(h3Var instanceof mn2.n)) {
            obj = null;
        }
        mn2.h3 h3Var2 = (mn2.h3) obj;
        if (h3Var2 != null) {
            mn2.n nVar = (mn2.n) h3Var2;
            if (!android.text.TextUtils.equals(nVar.f411593e, nVar.f411597i)) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183674j + ((java.lang.String) ((jz5.n) nVar.f411599n).mo141623x754a37bb());
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    return jp0.f.c(str, null);
                }
            }
        }
        if (h3Var.mo148082x7f025288() == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f) {
            if (com.p314xaae8f345.mm.vfs.w6.j(h3Var.l())) {
                return jp0.f.c(h3Var.l(), null);
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.j(h3Var.mo148084xb5887639())) {
            return jp0.f.c(h3Var.mo148084xb5887639(), null);
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
