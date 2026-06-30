package ub3;

/* loaded from: classes9.dex */
public class z implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb3.c f507682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507683b;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95, tb3.c cVar) {
        this.f507683b = activityC16331x46dfff95;
        this.f507682a = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0
    public void a(r45.n34 n34Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        int i17 = n34Var.f462582e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95 = this.f507683b;
        if (i17 != 2 || (gVar = this.f507682a.f498535x) == null) {
            activityC16331x46dfff95.finish();
        } else {
            activityC16331x46dfff95.m66165x5406100e(new tb3.c(activityC16331x46dfff95.f226632n, gVar), true);
        }
    }
}
