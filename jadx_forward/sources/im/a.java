package im;

/* loaded from: classes12.dex */
public final class a extends im.g {
    @Override // im.g
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        java.lang.String j17 = msg.j();
        r05.k kVar = new r05.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        kVar.m126731xdc93280d(j17, true);
        struct.f136612f = kVar.m75939xb282bd08(kVar.f449898d + 6);
        struct.f136611e = 49L;
        bu.b bVar = (bu.b) ((java.util.LinkedHashMap) bu.a.f106006a).get(java.lang.Long.valueOf(msg.m124847x74d37ac6()));
        if (bVar == null) {
            bVar = new bu.b();
        }
        struct.f136615i = bVar.f106007a;
        struct.f136616j = struct.b("ErrMsg", r26.i0.v(bVar.f106008b, ",", ";", false, 4, null), true);
    }

    @Override // im.g
    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return msg.k2();
    }
}
