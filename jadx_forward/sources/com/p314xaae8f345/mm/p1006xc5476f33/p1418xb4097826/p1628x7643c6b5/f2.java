package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f207583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(int i17, java.util.LinkedList linkedList) {
        super(1);
        this.f207582d = i17;
        this.f207583e = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f it = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error commentScene:");
        sb6.append(this.f207582d);
        sb6.append(' ');
        java.util.LinkedList<r45.rv0> linkedList = this.f207583e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (r45.rv0 rv0Var : linkedList) {
            arrayList.add("objectId:" + rv0Var.m75942xfb822ef2(0) + " exportId:" + rv0Var.m75945x2fec8307(1));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedDetailService", sb6.toString());
        return jz5.f0.f384359a;
    }
}
