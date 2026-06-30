package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class bn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn f187933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar, boolean z17) {
        super(2);
        this.f187933d = hnVar;
        this.f187934e = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bq.g1 cgi = (bq.g1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.wf3) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = this.f187933d;
        if (hnVar.f188474p) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgi.f152179f.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListRequest");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hnVar.f188468g, ((r45.vf3) fVar).m75934xbce7f2f(3))) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = cgi.f152179f.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                hnVar.f188472n = ((r45.wf3) fVar2).m75939xb282bd08(3) != 0;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = cgi.f152179f.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                hnVar.f188468g = ((r45.wf3) fVar3).m75934xbce7f2f(2);
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = cgi.f152179f.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                java.util.LinkedList m75941xfb821914 = ((r45.wf3) fVar4).m75941xfb821914(1);
                int i17 = cgi.f105020o;
                java.util.ArrayList f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.f(hnVar, m75941xfb821914, i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiManageUIContract", "newData： " + i17 + ", " + f17 + ", " + f17.size());
                java.util.ArrayList arrayList = hnVar.f188469h;
                if (i17 == 1) {
                    java.util.ArrayList arrayList2 = hnVar.f188470i;
                    if (arrayList2.isEmpty() && (!f17.isEmpty())) {
                        arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.c(hnVar, i17, 1));
                    }
                    arrayList2.addAll(f17);
                    if (hnVar.f188472n) {
                        hnVar.g(true, 1);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiManageUIContract", "init audit data done, " + arrayList2.size());
                        arrayList.addAll(arrayList2);
                        hnVar.g(false, 2);
                    }
                } else {
                    if (i17 == 2 && hnVar.f188473o && (!f17.isEmpty())) {
                        arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.c(hnVar, i17, 2));
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() - hnVar.f188471m;
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    long longValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F2().r()).longValue();
                    boolean z17 = this.f187934e;
                    pm0.v.V((z17 || uptimeMillis >= longValue) ? 0L : longValue - uptimeMillis, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.an(hnVar, f17, z17));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiManageUIContract", "not my buf, ignore!");
            }
        }
        return jz5.f0.f384359a;
    }
}
