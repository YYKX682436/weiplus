package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f224905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224906e;

    public k(long j17, java.lang.String str) {
        this.f224905d = j17;
        this.f224906e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6756x82ae0060 c6756x82ae0060 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6756x82ae0060();
        c6756x82ae0060.f140830d = this.f224905d;
        c6756x82ae0060.f140831e = c6756x82ae0060.b("actionInfo", this.f224906e, true);
        c6756x82ae0060.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "24832 ,action = " + c6756x82ae0060.f140830d + ",actionInfo = " + c6756x82ae0060.f140831e);
    }
}
