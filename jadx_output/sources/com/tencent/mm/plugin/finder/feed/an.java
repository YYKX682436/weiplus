package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class an extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hn f106316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f106317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f106318f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(com.tencent.mm.plugin.finder.feed.hn hnVar, java.util.ArrayList arrayList, boolean z17) {
        super(0);
        this.f106316d = hnVar;
        this.f106317e = arrayList;
        this.f106318f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f106316d;
        java.util.ArrayList arrayList = hnVar.f106936h;
        boolean z17 = this.f106318f;
        int size = z17 ? arrayList.size() : hnVar.f106937i.size() + 1;
        java.util.ArrayList arrayList2 = this.f106317e;
        int size2 = arrayList2.size();
        if (hnVar.f106940o) {
            hnVar.f106940o = false;
            size = -1;
            size2 = -1;
        }
        arrayList.addAll(arrayList2);
        com.tencent.mm.plugin.finder.feed.rn rnVar = hnVar.f106934f;
        if (rnVar != null) {
            rnVar.g(z17, size, size2);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
