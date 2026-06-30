package z83;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 f552277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f552278e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6, int i17) {
        this.f552277d = activityC16160x425523e6;
        this.f552278e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.f224672t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6 activityC16160x425523e6 = this.f552277d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC16160x425523e6.T6().f525531j.getHeight());
        int i18 = this.f552278e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KidsWatchRegGetInfoUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i18));
        if (activityC16160x425523e6.T6().f525531j.getHeight() > i18) {
            activityC16160x425523e6.T6().f525537p.scrollBy(0, activityC16160x425523e6.T6().f525531j.getHeight() - i18);
        }
    }
}
