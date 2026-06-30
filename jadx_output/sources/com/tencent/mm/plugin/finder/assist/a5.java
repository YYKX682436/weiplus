package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f102004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f102005c;

    public a5(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, long j18) {
        this.f102003a = baseFinderFeed;
        this.f102004b = j17;
        this.f102005c = j18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102003a;
            if (finderObject != null) {
                com.tencent.mm.plugin.finder.assist.c5 c5Var = com.tencent.mm.plugin.finder.assist.c5.f102058a;
                com.tencent.mars.xlog.Log.i("Finder.ObjectStatusRefresher", "lxl CgiGetFinderFeedComment change objectStatus, from:" + baseFinderFeed.getFeedObject().getFeedObject().getObjectStatus() + ", to:" + finderObject.getObjectStatus() + ", waitTime:" + ((r45.h51) fVar.f70618d).getInteger(7));
                baseFinderFeed.getFeedObject().getFeedObject().setObjectStatus(finderObject.getObjectStatus());
            }
            if (baseFinderFeed.getFeedObject().isOnlySelfSee()) {
                com.tencent.mm.plugin.finder.assist.c5 c5Var2 = com.tencent.mm.plugin.finder.assist.c5.f102058a;
                long integer = ((r45.h51) fVar.f70618d).getInteger(7);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshInterval] feedId=");
                long j17 = this.f102004b;
                sb6.append(j17);
                sb6.append(" lastReqTime=");
                long j18 = this.f102005c;
                sb6.append(j18);
                sb6.append(" waitTime=");
                sb6.append(integer);
                com.tencent.mars.xlog.Log.i("Finder.ObjectStatusRefresher", sb6.toString());
                com.tencent.mm.plugin.finder.assist.c5.f102059b.put(java.lang.Long.valueOf(j17), new com.tencent.mm.plugin.finder.assist.z4(j18, integer));
            }
        }
        return jz5.f0.f302826a;
    }
}
