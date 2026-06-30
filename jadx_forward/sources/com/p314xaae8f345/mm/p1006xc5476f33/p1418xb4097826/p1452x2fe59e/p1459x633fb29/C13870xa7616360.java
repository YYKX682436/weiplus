package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderLiveRelatedFeedColumnLoader;", "Lcom/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader;", "com/tencent/mm/plugin/finder/feed/model/v3", "com/tencent/mm/plugin/finder/feed/model/w3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderLiveRelatedFeedColumnLoader */
/* loaded from: classes2.dex */
public final class C13870xa7616360 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f189023o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Object f189024p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13870xa7616360(android.content.Context context, r45.qt2 qt2Var, java.lang.String feedVMKey) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedVMKey, "feedVMKey");
        this.f189023o = feedVMKey;
        this.f189024p = new java.lang.Object();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF204960d(), "FinderGlobalVMStore getViewModel init:" + feedVMKey);
        ey2.u e17 = e();
        if (e17 != null) {
            e17.f339075x.mo7806x9d92d11c((p012xc85e97e9.p093xedfae76a.y) context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.t3(this));
        }
        mo55585x919c3b94();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d
    public java.lang.String b() {
        r45.dy0 dy0Var;
        ey2.u e17 = e();
        if (e17 == null || (dy0Var = e17.f339066o) == null) {
            return null;
        }
        return dy0Var.m75945x2fec8307(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d
    public boolean c() {
        if (e() != null) {
            return ((java.lang.Boolean) ((lb2.j) ((jz5.n) ae2.in.E).mo141623x754a37bb()).r()).booleanValue();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getF204960d(), "FinderGlobalVMStore getViewModel createDataFetch:" + this.f189023o);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.v3(this, e());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d
    /* renamed from: d */
    public boolean getF193265m() {
        return false;
    }

    public final ey2.u e() {
        return (ey2.u) ey2.l0.f338955a.a(this.f189023o, ey2.u.class, null);
    }

    public final java.util.List f(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof so2.h1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = new km2.m(((so2.h1) it.next()).getFeedObject().getFeedObject());
            mVar.f390669n = true;
            arrayList2.add(mVar);
        }
        return arrayList2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        yz5.l lVar = this.f193259d;
        if (lVar != null) {
            lVar.mo146xb9724478(response);
        }
        if (4 != response.getPullType()) {
            m56376x569eb6fd(false);
        }
    }
}
