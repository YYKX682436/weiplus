package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f174162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f174163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j17, java.util.Map map) {
        super(1);
        this.f174162d = j17;
        this.f174163e = map;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String message;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 it = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.f141606k = this.f174162d;
        java.util.Map dict = this.f174163e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dict, "dict");
        try {
            java.lang.String jSONObject = new org.json.JSONObject(dict).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            message = r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamReport28098", e17, "json error", new java.lang.Object[0]);
            message = e17.getMessage();
        }
        it.p(message);
        return jz5.f0.f384359a;
    }
}
