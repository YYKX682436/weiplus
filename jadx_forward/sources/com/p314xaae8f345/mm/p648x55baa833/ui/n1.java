package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f145915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f145916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee f145917f;

    public n1(long j17, long j18, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee) {
        this.f145915d = j17;
        this.f145916e = j18;
        this.f145917f = activityC10339x9e5e23ee;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6394x77c98386 c6394x77c98386 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6394x77c98386();
        long j17 = this.f145915d;
        c6394x77c98386.f137391f = j17;
        long j18 = this.f145916e;
        c6394x77c98386.f137392g = j18;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee = this.f145917f;
        c6394x77c98386.f137390e = activityC10339x9e5e23ee.f145269o;
        c6394x77c98386.f137389d = c6394x77c98386.b("roomUsername", activityC10339x9e5e23ee.Z6(), true);
        c6394x77c98386.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomManagerUI", "24180 action = " + j17 + ",code = " + j18 + ",mMembersCount = " + activityC10339x9e5e23ee.f145269o + ",mRoomId = " + activityC10339x9e5e23ee.Z6());
    }
}
