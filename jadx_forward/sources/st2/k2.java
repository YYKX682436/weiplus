package st2;

/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.k2 f493921a = new st2.k2();

    public final void a(gk2.e liveData, l81.b1 bundle, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        if (((zy2.qa) i95.n0.c(zy2.qa.class)) != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            st2.f2 f2Var = st2.f2.f493820a;
            boolean z17 = st2.f2.f493821b;
            boolean z18 = st2.f2.f493822c;
            java.lang.String liveid = java.lang.String.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.String finderid = xy2.c.e(context2);
            java.lang.String sessionid = java.lang.String.valueOf(((mm2.c1) liveData.a(mm2.c1.class)).f410394p2);
            java.lang.String str = bundle.f398547b;
            if (str == null) {
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveid, "liveid");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderid, "finderid");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionid, "sessionid");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6531xf7523aae c6531xf7523aae = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6531xf7523aae();
            c6531xf7523aae.f138836d = c6531xf7523aae.b("appuin", str, true);
            c6531xf7523aae.f138838f = 10;
            c6531xf7523aae.f138837e = c6531xf7523aae.b("appversion", "", true);
            c6531xf7523aae.f138845m = z17 ? 1 : 0;
            c6531xf7523aae.f138846n = z18 ? 1 : 0;
            c6531xf7523aae.f138840h = c6531xf7523aae.b("liveid", liveid, true);
            c6531xf7523aae.f138841i = c6531xf7523aae.b("finderid", finderid, true);
            c6531xf7523aae.f138842j = c6531xf7523aae.b("shopwindowid", "", true);
            c6531xf7523aae.f138843k = c6531xf7523aae.b("sessionid", sessionid, true);
            c6531xf7523aae.f138844l = 0L;
            c6531xf7523aae.f138839g = c6531xf7523aae.b("networktype", java.lang.String.valueOf(by5.y.a(context)), true);
            c6531xf7523aae.f138847o = j17;
            c6531xf7523aae.f138848p = j18;
            c6531xf7523aae.k();
        }
    }
}
