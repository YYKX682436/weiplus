package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class zi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 f155903e;

    public zi(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 activityC11471xee777578, int i17) {
        this.f155903e = activityC11471xee777578;
        this.f155902d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11471xee777578 activityC11471xee777578 = this.f155903e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC11471xee777578.f155214i.getHeight());
        int i17 = this.f155902d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyPwdUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (activityC11471xee777578.f155214i.getHeight() > i17) {
            activityC11471xee777578.f155213h.scrollBy(0, activityC11471xee777578.f155214i.getHeight() - i17);
        }
    }
}
