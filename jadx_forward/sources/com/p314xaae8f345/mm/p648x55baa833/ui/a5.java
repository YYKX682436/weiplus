package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f145564e;

    public a5(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc, int i17) {
        this.f145564e = activityC10348x266bd9bc;
        this.f145563d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f145564e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC10348x266bd9bc.f145357n.getHeight());
        int i17 = this.f145563d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkRoomNameUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (activityC10348x266bd9bc.f145357n.getHeight() > i17) {
            activityC10348x266bd9bc.f145356m.scrollBy(0, activityC10348x266bd9bc.f145357n.getHeight() - i17);
        }
    }
}
