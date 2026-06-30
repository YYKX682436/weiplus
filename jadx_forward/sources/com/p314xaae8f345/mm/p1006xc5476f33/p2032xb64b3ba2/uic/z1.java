package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class z1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ed0.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final qx3.o f240093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f240093d = new qx3.o(mo144225x95f74600());
    }

    public void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "onPauseRingtone");
        this.f240093d.Q6();
    }

    public final void P6(vx3.i item, long j17, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "on play ringtone " + item.n() + ",and id is " + j17 + " with action is play " + z17);
        this.f240093d.P6(item, j17, z17, z18, z19);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f240093d;
        oVar.Q6();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448910g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f448916p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f240093d;
        oVar.Q6();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448910g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f448916p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f240093d;
        oVar.Q6();
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448910g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = oVar.f448916p;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        qx3.o oVar = this.f240093d;
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(oVar.f448907d, null, null, new qx3.n(oVar, null), 3, null);
        oVar.f448916p = d17;
        ((p3325xe03a0797.p3326xc267989b.c3) d17).mo143976x68ac462();
    }
}
