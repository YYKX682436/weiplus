package it3;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f376109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376111f;

    public q(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2, java.lang.String str) {
        this.f376109d = z17;
        this.f376110e = activityC16983x775783e2;
        this.f376111f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f376109d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376110e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.U6(activityC16983x775783e2, this.f376111f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.U6(activityC16983x775783e2, "");
        }
    }
}
