package ni3;

/* loaded from: classes10.dex */
public final class b1 {
    public final void a(long j17, ni3.p0 p0Var, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6604x1a62a334 c6604x1a62a334) {
        c6604x1a62a334.f139527d = 2L;
        c6604x1a62a334.f139528e = c6604x1a62a334.b("contextId", p0Var.f419204b.f419180a, true);
        ni3.o0 o0Var = p0Var.f419204b;
        c6604x1a62a334.f139529f = o0Var.f419181b;
        c6604x1a62a334.f139530g = o0Var.f419182c;
        c6604x1a62a334.f139531h = o0Var.f419183d;
        c6604x1a62a334.f139532i = c6604x1a62a334.b("feedId", pm0.v.u(p0Var.f419203a.mo2128x1ed62e84()), true);
        c6604x1a62a334.f139533j = c6604x1a62a334.b("mediaId", p0Var.f419205c.f419252a, true);
        c6604x1a62a334.f139534k = j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFirstPlay", p0Var.f419205c.f419254c);
        jSONObject.put("exposeTime", p0Var.f419205c.f419255d);
        jSONObject.put("playTime", p0Var.f419205c.f419256e);
        jSONObject.put("firstLoadTime", p0Var.f419205c.f419257f);
        jSONObject.put("firstFrameTime", p0Var.f419205c.f419258g);
        jSONObject.put("userFirstFrameTime", p0Var.f419205c.f419259h);
        jSONObject.put("bufferCount", p0Var.f419205c.f419260i);
        jSONObject.put("bufferTotalTime", p0Var.f419205c.f419261j);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6604x1a62a334.f139535l = c6604x1a62a334.b("VideoPlayInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
    }
}
