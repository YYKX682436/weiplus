package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bj implements oe0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj f193574a;

    public bj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar) {
        this.f193574a = cjVar;
    }

    @Override // oe0.w
    public void a(java.lang.String action, org.json.JSONObject params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cj cjVar = this.f193574a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cjVar.f193693h, "finderLiveCallback action:".concat(action));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(action, "dynamicCardServerLost")) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.aj(cjVar));
        }
    }
}
