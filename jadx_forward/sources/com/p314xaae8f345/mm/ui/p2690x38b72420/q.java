package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288657d;

    public q(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288657d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288657d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressUI", "rcontact db init select count: %d", java.lang.Integer.valueOf(addressUIFragment.f287842q.getCount()));
        addressUIFragment.f287840o.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.p(this));
        addressUIFragment.f287843r.y(false);
    }
}
