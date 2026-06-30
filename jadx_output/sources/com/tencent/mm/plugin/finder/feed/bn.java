package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class bn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hn f106400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.tencent.mm.plugin.finder.feed.hn hnVar, boolean z17) {
        super(2);
        this.f106400d = hnVar;
        this.f106401e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bq.g1 cgi = (bq.g1) obj2;
        kotlin.jvm.internal.o.g((r45.wf3) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(cgi, "cgi");
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f106400d;
        if (hnVar.f106941p) {
            com.tencent.mm.protobuf.f fVar = cgi.f70646f.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListRequest");
            if (kotlin.jvm.internal.o.b(hnVar.f106935g, ((r45.vf3) fVar).getByteString(3))) {
                com.tencent.mm.protobuf.f fVar2 = cgi.f70646f.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                hnVar.f106939n = ((r45.wf3) fVar2).getInteger(3) != 0;
                com.tencent.mm.protobuf.f fVar3 = cgi.f70646f.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                hnVar.f106935g = ((r45.wf3) fVar3).getByteString(2);
                com.tencent.mm.protobuf.f fVar4 = cgi.f70646f.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderPoiListResponse");
                java.util.LinkedList list = ((r45.wf3) fVar4).getList(1);
                int i17 = cgi.f23487o;
                java.util.ArrayList f17 = com.tencent.mm.plugin.finder.feed.hn.f(hnVar, list, i17);
                com.tencent.mars.xlog.Log.i("Finder.FinderPoiManageUIContract", "newData： " + i17 + ", " + f17 + ", " + f17.size());
                java.util.ArrayList arrayList = hnVar.f106936h;
                if (i17 == 1) {
                    java.util.ArrayList arrayList2 = hnVar.f106937i;
                    if (arrayList2.isEmpty() && (!f17.isEmpty())) {
                        arrayList2.add(com.tencent.mm.plugin.finder.feed.hn.c(hnVar, i17, 1));
                    }
                    arrayList2.addAll(f17);
                    if (hnVar.f106939n) {
                        hnVar.g(true, 1);
                    } else {
                        com.tencent.mars.xlog.Log.i("Finder.FinderPoiManageUIContract", "init audit data done, " + arrayList2.size());
                        arrayList.addAll(arrayList2);
                        hnVar.g(false, 2);
                    }
                } else {
                    if (i17 == 2 && hnVar.f106940o && (!f17.isEmpty())) {
                        arrayList.add(com.tencent.mm.plugin.finder.feed.hn.c(hnVar, i17, 2));
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() - hnVar.f106938m;
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    long longValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.F2().r()).longValue();
                    boolean z17 = this.f106401e;
                    pm0.v.V((z17 || uptimeMillis >= longValue) ? 0L : longValue - uptimeMillis, new com.tencent.mm.plugin.finder.feed.an(hnVar, f17, z17));
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderPoiManageUIContract", "not my buf, ignore!");
            }
        }
        return jz5.f0.f302826a;
    }
}
