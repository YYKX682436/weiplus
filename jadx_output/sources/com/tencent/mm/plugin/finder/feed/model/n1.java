package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public class n1 extends com.tencent.mm.plugin.finder.feed.model.l1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader f108207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader) {
        super(finderFeedRelTimelineLoader);
        this.f108207e = finderFeedRelTimelineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x, com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        ((ey2.e2) pf5.u.f353936a.e(c61.l7.class).a(ey2.e2.class)).N6(true);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.l1, com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.List incrementList;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd = super.dealOnSceneEnd(i17, i18, str, iVar, fVar);
        if ((fVar instanceof r45.aa1) && (iVar instanceof db2.t0)) {
            if (i17 == 0 && i18 == 0) {
                androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.e2.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((ey2.e2) a17).N6(false);
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dealOnSceneEnd] errType=");
            sb6.append(i17);
            sb6.append(" errCode=");
            sb6.append(str);
            sb6.append(" pullType=");
            sb6.append(((db2.t0) iVar).f228162z);
            sb6.append(" lastBuffer=");
            com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108207e;
            sb6.append(finderFeedRelTimelineLoader.getLastBuffer() != null);
            sb6.append(" cardBuffer=");
            sb6.append(finderFeedRelTimelineLoader.f107423n != null);
            sb6.append(" stats=");
            r45.vd6 vd6Var = finderFeedRelTimelineLoader.f107424o;
            sb6.append(pm0.v.u(vd6Var != null ? vd6Var.getLong(0) : 0L));
            sb6.append(" get_column_feed_info=");
            r45.kd3 kd3Var = finderFeedRelTimelineLoader.f107422m;
            sb6.append(pm0.v.u(kd3Var != null ? kd3Var.getLong(0) : 0L));
            sb6.append(" hasMore=");
            java.lang.Integer num = null;
            sb6.append(dealOnSceneEnd != null ? java.lang.Boolean.valueOf(dealOnSceneEnd.getHasMore()) : null);
            sb6.append(" size=");
            if (dealOnSceneEnd != null && (incrementList = dealOnSceneEnd.getIncrementList()) != null) {
                num = java.lang.Integer.valueOf(incrementList.size());
            }
            sb6.append(num);
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        }
        return dealOnSceneEnd;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.l1, com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        ey2.e2 e2Var = (ey2.e2) pf5.u.f353936a.e(c61.l7.class).a(ey2.e2.class);
        e2Var.getClass();
        java.util.LinkedList<r45.ni4> linkedList = new java.util.LinkedList();
        synchronized (e2Var.f257359g) {
            linkedList.addAll(e2Var.f257359g);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (r45.ni4 ni4Var : linkedList) {
            r45.vd6 vd6Var = new r45.vd6();
            vd6Var.set(2, new r45.yw6());
            vd6Var.set(1, new r45.oi());
            vd6Var.set(3, new r45.q25());
            vd6Var.set(0, java.lang.Long.valueOf(ni4Var.getLong(0)));
            vd6Var.set(28, ni4Var.getString(15));
            vd6Var.set(10, java.lang.Integer.valueOf(ni4Var.getInteger(3)));
            vd6Var.set(8, ni4Var.getString(4));
            vd6Var.set(5, xy2.c.f(this.f108207e.getContextObj()));
            vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
            vd6Var.set(13, 11);
            arrayList.add(vd6Var);
        }
        com.tencent.mm.protobuf.g lastBuffer = this.f108207e.getLastBuffer();
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108207e;
        db2.t0 t0Var = new db2.t0(lastBuffer, finderFeedRelTimelineLoader.f107425p, arrayList, finderFeedRelTimelineLoader.f107422m, finderFeedRelTimelineLoader.getContextObj(), null, null, 96, null);
        t0Var.f228162z = 2;
        return t0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.l1, com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader finderFeedRelTimelineLoader = this.f108207e;
        com.tencent.mm.protobuf.g gVar = finderFeedRelTimelineLoader.f107423n;
        int i17 = finderFeedRelTimelineLoader.f107425p;
        r45.vd6 vd6Var = finderFeedRelTimelineLoader.f107424o;
        db2.t0 t0Var = new db2.t0(gVar, i17, vd6Var != null ? kz5.b0.c(vd6Var) : null, finderFeedRelTimelineLoader.f107422m, finderFeedRelTimelineLoader.getContextObj(), null, null, 96, null);
        t0Var.f228162z = 0;
        return t0Var;
    }
}
