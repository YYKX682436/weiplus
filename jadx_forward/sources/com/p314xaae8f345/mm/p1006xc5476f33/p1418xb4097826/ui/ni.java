package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ni extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c f211090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15075xf41a1c3c activityC15075xf41a1c3c) {
        super(2);
        this.f211090d = activityC15075xf41a1c3c;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tl tlVar = this.f211090d.f210294v;
        if (tlVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        so2.j5 Q = tlVar.Q();
        if (Q == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(Q);
        return linkedList;
    }
}
