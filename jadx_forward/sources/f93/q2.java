package f93;

/* loaded from: classes11.dex */
public final class q2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc f341971a;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc) {
        this.f341971a = activityC16170x2911e4dc;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc activityC16170x2911e4dc = this.f341971a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16170x2911e4dc.U6(activityC16170x2911e4dc);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onCancelClick(): changed but do not save");
            activityC16170x2911e4dc.finish();
        }
    }
}
