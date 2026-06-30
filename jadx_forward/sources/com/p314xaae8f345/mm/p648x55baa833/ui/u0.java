package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f146093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146094e;

    public u0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5, long j17) {
        this.f146094e = activityC10332x8a1129f5;
        this.f146093d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6395x66c11df3 c6395x66c11df3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6395x66c11df3();
        long j17 = this.f146093d;
        c6395x66c11df3.f137394e = j17;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146094e;
        c6395x66c11df3.f137393d = c6395x66c11df3.b("roomUsername", activityC10332x8a1129f5.A, true);
        c6395x66c11df3.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomInfoUI", "24182 action = " + j17 + ",UserRole = 0,mRoomId = " + activityC10332x8a1129f5.A);
    }
}
