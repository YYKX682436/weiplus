package ub3;

/* loaded from: classes9.dex */
public class a0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f507620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507621e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f507621e = activityC16331x46dfff95;
        this.f507620d = gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95 = this.f507621e;
        long j17 = activityC16331x46dfff95.f226643y;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (longValue != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuckyMoneyF2FReceiveUI", "unexpected halfpage callback");
        } else {
            activityC16331x46dfff95.f226643y = 0L;
            if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262533f) {
                activityC16331x46dfff95.m66165x5406100e(new tb3.c(activityC16331x46dfff95.f226632n, this.f507620d), true);
            } else {
                activityC16331x46dfff95.finish();
            }
        }
        return f0Var;
    }
}
