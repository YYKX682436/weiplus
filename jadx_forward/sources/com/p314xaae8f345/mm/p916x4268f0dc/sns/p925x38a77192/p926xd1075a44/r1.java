package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k96 f151740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(r45.k96 k96Var) {
        super(0);
        this.f151740d = k96Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.k96 k96Var = this.f151740d;
        java.util.LinkedList linkedList = k96Var.f460055i;
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((r45.l96) obj).f460790d >= k96Var.f460052f) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r45.l96) it.next()).f460791e);
        }
        return arrayList2;
    }
}
