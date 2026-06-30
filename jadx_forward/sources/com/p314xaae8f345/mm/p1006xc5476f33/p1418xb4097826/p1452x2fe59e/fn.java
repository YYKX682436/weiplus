package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class fn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn f188300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar) {
        super(2);
        this.f188300d = hnVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.dw0) obj, "<anonymous parameter 0>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = this.f188300d;
        if (hnVar.f188474p) {
            boolean z17 = linkedList != null ? !linkedList.isEmpty() : false;
            java.util.ArrayList arrayList = hnVar.f188470i;
            boolean isEmpty = arrayList.isEmpty();
            java.util.ArrayList arrayList2 = hnVar.f188469h;
            if (isEmpty) {
                if (z17) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.c(hnVar, 1, 1));
                    arrayList.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.f(hnVar, linkedList, 1));
                    arrayList2.addAll(0, arrayList);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = hnVar.f188467f;
                    if (rnVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                        throw null;
                    }
                    rnVar.g(false, 0, arrayList.size());
                }
            } else if (z17) {
                java.util.ArrayList f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn.f(hnVar, linkedList, 1);
                arrayList2.addAll(1, f17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar2 = hnVar.f188467f;
                if (rnVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                rnVar2.g(false, 1, f17.size());
            }
        }
        return jz5.f0.f384359a;
    }
}
