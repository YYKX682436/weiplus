package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ly extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ct f107334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(com.tencent.mm.plugin.finder.feed.ct ctVar, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(1);
        this.f107334d = ctVar;
        this.f107335e = pzVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 j5Var;
        int intValue = ((java.lang.Number) obj).intValue();
        androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.plugin.finder.feed.v00) this.f107334d).getRecyclerView().getAdapter();
        int a07 = adapter != null ? intValue - ((in5.n0) adapter).a0() : -1;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107335e;
        int size = pzVar.C.getDataListJustForAdapter().size();
        if (size > 0) {
            if ((a07 >= 0 && a07 < size) && (j5Var = (so2.j5) pzVar.C.safeGet(a07)) != null && (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            }
        }
        return null;
    }
}
