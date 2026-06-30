package xo0;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ep0.h f537277a = new ap0.a();

    public java.lang.String a(ip0.a url, yo0.i opts, vo0.h reaper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opts, "opts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        java.lang.String str = opts.f545631c;
        if (str != null) {
            str.length();
        }
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(np0.b.f420323b);
            sb6.append('/');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f537277a);
            sb6.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url.m139674x9616526c()) ? kk.k.g(url.m139674x9616526c().getBytes()) : null);
            str = sb6.toString();
        }
        return (str == null || str.length() == 0) ? "" : str;
    }

    public abstract boolean b(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    public abstract jp0.f c(ip0.a aVar, yo0.i iVar, vo0.h hVar);

    public abstract boolean d(ip0.a aVar, hp0.g gVar, yo0.i iVar, vo0.h hVar);

    public abstract boolean e(ip0.a aVar, hp0.i iVar, hp0.g gVar, yo0.i iVar2, vo0.h hVar);

    public abstract boolean f(ip0.a aVar, hp0.i iVar, hp0.g gVar, hp0.g gVar2, yo0.i iVar2, vo0.h hVar);
}
