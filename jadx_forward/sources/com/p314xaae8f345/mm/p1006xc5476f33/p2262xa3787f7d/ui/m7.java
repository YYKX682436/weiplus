package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b f254609e;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b, int i17) {
        this.f254609e = activityC18591xe20dd59b;
        this.f254608d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b activityC18591xe20dd59b = this.f254609e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC18591xe20dd59b.f254450m.getHeight());
        int i17 = this.f254608d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (activityC18591xe20dd59b.f254450m.getHeight() > i17) {
            activityC18591xe20dd59b.f254449i.scrollBy(0, activityC18591xe20dd59b.f254450m.getHeight() - i17);
        }
    }
}
