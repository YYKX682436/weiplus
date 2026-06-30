package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/FinderLiveRelatedLoader;", "Lcom/tencent/mm/plugin/finder/live/model/FinderLiveRelatedBaseLoader;", "<init>", "()V", "vd2/y2", "vd2/z2", "vd2/a3", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader */
/* loaded from: classes2.dex */
public final class C14166x338f3aec extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d {

    /* renamed from: o, reason: collision with root package name */
    public final vd2.a3 f193012o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f193013p;

    public C14166x338f3aec() {
        super(null);
        this.f193012o = new vd2.a3(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
    /* renamed from: createDataFetch */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0 mo55585x919c3b94() {
        return this.f193012o;
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
