package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f184379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d f184380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d dVar) {
        super(0);
        this.f184379d = c5445x963cab3;
        this.f184380e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f184379d;
        sb6.append(pm0.v.u(c5445x963cab3.f135785g.f88451a));
        sb6.append(", currentItemID:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d dVar = this.f184380e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = dVar.f184637e;
        sb6.append((abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null) ? null : pm0.v.u(feedObject2.m59251x5db1b11()));
        sb6.append(", dataType: ");
        am.ia iaVar = c5445x963cab3.f135785g;
        sb6.append(iaVar.f88452b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFinderColumnCardLayoutHelper", sb6.toString());
        if (iaVar.f88452b == 4 && iaVar.f88451a != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = dVar.f184637e;
            if ((abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || feedObject.m59251x5db1b11() != iaVar.f88451a) ? false : true) {
                dVar.b();
            }
        }
        return jz5.f0.f384359a;
    }
}
