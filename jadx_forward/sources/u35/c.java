package u35;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final u35.c f505967a = new u35.c();

    public final void a(int i17, yb5.d dVar) {
        b(i17, dVar, "", "");
    }

    public final void b(int i17, yb5.d dVar, java.lang.String userSessionId, java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userSessionId, "userSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        int i18 = dVar != null && dVar.D() ? 2 : 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6627x3c1bf944 c6627x3c1bf944 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6627x3c1bf944();
        c6627x3c1bf944.f139796d = i17;
        c6627x3c1bf944.f139797e = i18;
        c6627x3c1bf944.f139798f = c6627x3c1bf944.b("sessionid", userSessionId, true);
        c6627x3c1bf944.f139799g = c6627x3c1bf944.b("Wording", wording, true);
        c6627x3c1bf944.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c6627x3c1bf944.g());
        java.lang.String n17 = c6627x3c1bf944.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FSInputReporter", "report%s %s", valueOf, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}
