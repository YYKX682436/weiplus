package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17150x1fda240 f239287d;

    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17150x1fda240 activityC17150x1fda240) {
        this.f239287d = activityC17150x1fda240;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17150x1fda240 activityC17150x1fda240 = this.f239287d;
        int i17 = activityC17150x1fda240.f239124f;
        if (i17 == 33 || i17 == 32) {
            activityC17150x1fda240.finish();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17150x1fda240.f239125g) || activityC17150x1fda240.f239126h) {
            activityC17150x1fda240.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", activityC17150x1fda240.f239125g);
        intent.putExtra("finish_direct", false);
        j45.l.u(activityC17150x1fda240, ".ui.chatting.ChattingUI", intent, null);
    }
}
