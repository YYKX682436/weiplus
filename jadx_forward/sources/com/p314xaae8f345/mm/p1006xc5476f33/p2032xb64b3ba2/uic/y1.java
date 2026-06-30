package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f240081a;

    /* renamed from: b, reason: collision with root package name */
    public final qx3.o f240082b;

    public y1() {
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);
        this.f240081a = a17;
        qx3.o oVar = new qx3.o(a17);
        this.f240082b = oVar;
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(oVar.f448907d, null, null, new qx3.n(oVar, null), 3, null);
        oVar.f448916p = d17;
        ((p3325xe03a0797.p3326xc267989b.c3) d17).mo143976x68ac462();
    }

    public final void a(vx3.i item, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "on play ringtone " + item.n() + ",and id is " + j17 + " with action is play " + z17);
        qx3.o oVar = this.f240082b;
        dk4.a aVar = item.f522817a;
        oVar.P6(item, j17, z17, true, aVar != null ? aVar.f316008l : false);
    }
}
