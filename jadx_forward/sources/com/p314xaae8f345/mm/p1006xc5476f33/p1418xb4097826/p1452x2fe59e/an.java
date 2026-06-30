package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class an extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn f187849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f187850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f187851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar, java.util.ArrayList arrayList, boolean z17) {
        super(0);
        this.f187849d = hnVar;
        this.f187850e = arrayList;
        this.f187851f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = this.f187849d;
        java.util.ArrayList arrayList = hnVar.f188469h;
        boolean z17 = this.f187851f;
        int size = z17 ? arrayList.size() : hnVar.f188470i.size() + 1;
        java.util.ArrayList arrayList2 = this.f187850e;
        int size2 = arrayList2.size();
        if (hnVar.f188473o) {
            hnVar.f188473o = false;
            size = -1;
            size2 = -1;
        }
        arrayList.addAll(arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = hnVar.f188467f;
        if (rnVar != null) {
            rnVar.g(z17, size, size2);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }
}
