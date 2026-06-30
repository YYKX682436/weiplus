package im;

/* loaded from: classes12.dex */
public final class h extends im.g {
    @Override // im.g
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        long m124847x74d37ac6 = msg.m124847x74d37ac6();
        if (((oi3.d) ((java.util.LinkedHashMap) oi3.c.f427147a).get(java.lang.Long.valueOf(m124847x74d37ac6))) != null) {
            struct.f136615i = 0;
            struct.f136616j = struct.b("ErrMsg", r26.i0.t("", ",", ";", false), true);
        }
    }

    @Override // im.g
    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return msg.mo78013xfb85f7b0() == 3;
    }
}
