package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ed0.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final ox3.l f239940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f239940d = new ox3.l();
    }

    public final void O6() {
        ox3.l lVar = this.f239940d;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataViewModel", "noMoreDataLoad");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) lVar.f431297d).e(new ed0.s0(null, 4));
    }

    public final void P6(java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ox3.l lVar = this.f239940d;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataViewModel", "bindDataSource " + data.size());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) lVar.f431297d).e(new ed0.s0(data, 3));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ox3.l lVar = this.f239940d;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) lVar.f431297d).e(new ed0.s0(null, 1));
    }
}
