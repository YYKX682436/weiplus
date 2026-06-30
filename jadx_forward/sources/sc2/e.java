package sc2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f487379b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, android.content.Context context) {
        this.f487378a = abstractC14490x69736cb5;
        this.f487379b = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 c5150x445b2cc9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487378a;
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            am.f fVar2 = c5150x445b2cc9.f135499g;
            fVar2.f88152a = m59251x5db1b11;
            fVar2.f88153b = abstractC14490x69736cb5.getFeedObject().m59260x51f8f5b0();
            c5150x445b2cc9.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            long m59251x5db1b112 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88451a = m59251x5db1b112;
            iaVar.f88454d = 1;
            iaVar.f88452b = 12;
            c5445x963cab3.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityFeedHandler", "CgiFinderModEvent onSceneEnd publish ActivityFeedRemoveEvent:" + c5150x445b2cc9);
        } else {
            db5.t7.m123882x26a183b(this.f487379b, com.p314xaae8f345.mm.R.C30867xcad56011.cjg, 0).show();
        }
        return jz5.f0.f384359a;
    }
}
