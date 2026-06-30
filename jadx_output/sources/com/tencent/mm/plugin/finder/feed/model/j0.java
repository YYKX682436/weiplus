package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f108078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f108079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, fc2.a aVar) {
        super(1);
        this.f108078d = l0Var;
        this.f108079e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qq2 qq2Var;
        r45.qq2 qq2Var2;
        so2.j5 j5Var = (so2.j5) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (baseFinderFeed != null) {
            ec2.f fVar = (ec2.f) this.f108079e;
            com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f108078d;
            int i17 = l0Var.f108130o;
            r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            boolean z17 = (object_extend == null || (qq2Var2 = (r45.qq2) object_extend.getCustom(3)) == null) ? false : qq2Var2.getBoolean(2);
            r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            int integer = (object_extend2 == null || (qq2Var = (r45.qq2) object_extend2.getCustom(3)) == null) ? -1 : qq2Var.getInteger(3);
            r45.mb4 mb4Var = fVar.f250961f;
            com.tencent.mars.xlog.Log.i(l0Var.f108126h, "[handlePreloadOnProgress] pos:" + i17 + " userPageIsPreload:" + z17 + ", commentWaitTime:" + integer + ", offset:" + fVar.f250963h + " duration:" + (mb4Var != null ? mb4Var.getInteger(3) : 0));
            if (z17) {
                boolean z18 = fVar.f250963h >= integer;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = l0Var.f108134s;
                if (!copyOnWriteArrayList.contains(java.lang.Long.valueOf(baseFinderFeed.getItemId())) && z18) {
                    l0Var.O0(baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), baseFinderFeed.getFeedObject().getObjectNonceId(), l0Var.f108129n, baseFinderFeed.getFeedObject().isOldVersion(), baseFinderFeed.getFeedObject().getUserName(), i17, com.tencent.mm.plugin.finder.feed.model.z.f108498f);
                    copyOnWriteArrayList.add(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
