package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class cc {
    public cc(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(gk2.e buContext, int i17, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        org.json.JSONObject jSONObject = new org.json.JSONObject(map == null ? kz5.q0.f395534d : map);
        jSONObject.put("type", i17);
        jSONObject.put("hscreen_switch_status", ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.j2) buContext.a(mm2.j2.class)).f410698m).mo144003x754a37bb()).booleanValue() ? 1 : 0);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.V1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
