package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes3.dex */
public final class go extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f216074d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fo f216075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 act) {
        super(act);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
        this.f216074d = act;
        this.f216075e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fo(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationUIC", "onCreate: ");
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f216075e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationUIC", "onDestroy: ");
        com.p314xaae8f345.mm.app.w.INSTANCE.p(this.f216075e);
    }
}
