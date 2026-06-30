package zb3;

/* loaded from: classes9.dex */
public class w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552828d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b) {
        this.f552828d = activityC16343x55c0d8b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        double d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552828d;
        if (activityC16343x55c0d8b.f227290h.c() == 3 || activityC16343x55c0d8b.f227289g.c() == 3) {
            d17 = 0.0d;
        } else {
            int m66199x7498fe14 = activityC16343x55c0d8b.f227289g.m66199x7498fe14();
            d17 = activityC16343x55c0d8b.f227290h.m66174x7498fe14();
            if (activityC16343x55c0d8b.f227305z == 0) {
                d17 *= m66199x7498fe14;
            }
        }
        if (d17 == 0.0d || d17 > activityC16343x55c0d8b.E.f226716e || activityC16343x55c0d8b.f227304y.c()) {
            activityC16343x55c0d8b.f227293n.setClickable(false);
            activityC16343x55c0d8b.f227293n.setEnabled(false);
        } else {
            activityC16343x55c0d8b.f227293n.setClickable(true);
            activityC16343x55c0d8b.f227293n.setEnabled(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d17 + ", hasErr=" + activityC16343x55c0d8b.f227304y.c());
        activityC16343x55c0d8b.H.e();
        return false;
    }
}
