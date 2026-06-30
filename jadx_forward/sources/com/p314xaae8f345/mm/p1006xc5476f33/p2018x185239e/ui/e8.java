package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379 f239226d;

    public e8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379 activityC17149x1eca379) {
        this.f239226d = activityC17149x1eca379;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17149x1eca379 activityC17149x1eca379 = this.f239226d;
        int i17 = activityC17149x1eca379.f239103f;
        if (i17 == 33 || i17 == 32 || i17 == 48) {
            activityC17149x1eca379.finish();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17149x1eca379.f239104g) || activityC17149x1eca379.f239105h) {
            activityC17149x1eca379.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", activityC17149x1eca379.f239104g);
        intent.putExtra("finish_direct", false);
        j45.l.u(activityC17149x1eca379, ".ui.chatting.ChattingUI", intent, null);
    }
}
