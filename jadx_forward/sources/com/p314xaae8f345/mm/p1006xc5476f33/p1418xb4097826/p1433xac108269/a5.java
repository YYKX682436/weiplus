package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f183536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f183537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f183538c;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, long j17, long j18) {
        this.f183536a = abstractC14490x69736cb5;
        this.f183537b = j17;
        this.f183538c = j18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f183536a;
            if (c19792x256d2725 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5.f183591a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ObjectStatusRefresher", "lxl CgiGetFinderFeedComment change objectStatus, from:" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76804x14884687() + ", to:" + c19792x256d2725.m76804x14884687() + ", waitTime:" + ((r45.h51) fVar.f152151d).m75939xb282bd08(7));
                abstractC14490x69736cb5.getFeedObject().getFeedObject().m76897x4ad14193(c19792x256d2725.m76804x14884687());
            }
            if (abstractC14490x69736cb5.getFeedObject().m59327xb219fc91()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5 c5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5.f183591a;
                long m75939xb282bd08 = ((r45.h51) fVar.f152151d).m75939xb282bd08(7);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshInterval] feedId=");
                long j17 = this.f183537b;
                sb6.append(j17);
                sb6.append(" lastReqTime=");
                long j18 = this.f183538c;
                sb6.append(j18);
                sb6.append(" waitTime=");
                sb6.append(m75939xb282bd08);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ObjectStatusRefresher", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c5.f183592b.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z4(j18, m75939xb282bd08));
            }
        }
        return jz5.f0.f384359a;
    }
}
