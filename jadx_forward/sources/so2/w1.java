package so2;

/* loaded from: classes3.dex */
public final class w1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f492221a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f492221a = abstractC14490x69736cb5;
    }

    @Override // r35.n3
    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowLogic", "follow biz result = " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long mo2128x1ed62e84 = this.f492221a.mo2128x1ed62e84();
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = mo2128x1ed62e84;
        iaVar.f88452b = i17 == -1 ? 1 : 22;
        c5445x963cab3.e();
    }
}
