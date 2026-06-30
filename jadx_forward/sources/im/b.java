package im;

/* loaded from: classes12.dex */
public final class b extends im.g {
    @Override // im.g
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6303x2a97adbd struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        struct.f136610d = struct.b("LocalId", java.lang.String.valueOf(msg.m124847x74d37ac6()), true);
        struct.f136611e = msg.mo78013xfb85f7b0();
        struct.f136613g = msg.mo78012x3fdd41df();
        struct.f136614h = struct.b("Username", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(msg.Q0()), true);
        struct.f136617k = struct.b("Rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
        t65.f Zi = ((k04.h) ((t65.e) i95.n0.c(t65.e.class))).Zi();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("networkTickRate", java.lang.Float.valueOf(Zi.t()));
        jSONObject.put("fromLastNetworkMin", Zi.n());
        jSONObject.put("status", Zi.u());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        struct.f136618l = struct.b("ProcessStatus", r26.i0.t(jSONObject2, ",", ";", false), true);
    }

    @Override // im.g
    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return true;
    }
}
