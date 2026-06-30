package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class u implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v f240025d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar) {
        this.f240025d = vVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "onPause, loss audio focus");
        this.f240025d.O6();
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "onResume, gain audio focus");
        this.f240025d.P6();
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "onStop, loss audio focus");
        this.f240025d.O6();
    }
}
