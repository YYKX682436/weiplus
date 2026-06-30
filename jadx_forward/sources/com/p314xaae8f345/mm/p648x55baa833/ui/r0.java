package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 f146002d;

    public r0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5) {
        this.f146002d = activityC10332x8a1129f5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = this.f146002d;
        if (activityC10332x8a1129f5.f145226h != null) {
            activityC10332x8a1129f5.W = activityC10332x8a1129f5.m79335xcc101dd9().getTranscriptMode();
            activityC10332x8a1129f5.m79335xcc101dd9().setTranscriptMode(2);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC10332x8a1129f5.f145226h).notifyDataSetChanged();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC10332x8a1129f5.V;
            if (b4Var != null) {
                b4Var.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p648x55baa833.ui.s0(activityC10332x8a1129f5, "room_notify_new_msg"), true);
            activityC10332x8a1129f5.V = b4Var2;
            b4Var2.c(5L, 5L);
        }
        activityC10332x8a1129f5.f145221J = true;
    }
}
