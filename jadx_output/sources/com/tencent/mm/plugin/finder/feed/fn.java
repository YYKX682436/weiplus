package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class fn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hn f106767d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.tencent.mm.plugin.finder.feed.hn hnVar) {
        super(2);
        this.f106767d = hnVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj2;
        kotlin.jvm.internal.o.g((r45.dw0) obj, "<anonymous parameter 0>");
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f106767d;
        if (hnVar.f106941p) {
            boolean z17 = linkedList != null ? !linkedList.isEmpty() : false;
            java.util.ArrayList arrayList = hnVar.f106937i;
            boolean isEmpty = arrayList.isEmpty();
            java.util.ArrayList arrayList2 = hnVar.f106936h;
            if (isEmpty) {
                if (z17) {
                    arrayList.add(com.tencent.mm.plugin.finder.feed.hn.c(hnVar, 1, 1));
                    arrayList.addAll(com.tencent.mm.plugin.finder.feed.hn.f(hnVar, linkedList, 1));
                    arrayList2.addAll(0, arrayList);
                    com.tencent.mm.plugin.finder.feed.rn rnVar = hnVar.f106934f;
                    if (rnVar == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    rnVar.g(false, 0, arrayList.size());
                }
            } else if (z17) {
                java.util.ArrayList f17 = com.tencent.mm.plugin.finder.feed.hn.f(hnVar, linkedList, 1);
                arrayList2.addAll(1, f17);
                com.tencent.mm.plugin.finder.feed.rn rnVar2 = hnVar.f106934f;
                if (rnVar2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                rnVar2.g(false, 1, f17.size());
            }
        }
        return jz5.f0.f302826a;
    }
}
