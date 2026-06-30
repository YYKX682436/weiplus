package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f186007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th f186008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar) {
        super(0);
        this.f186007d = linkedList;
        this.f186008e = thVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = this.f186007d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4 w4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4.f206955a;
            int i17 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar = this.f186008e;
            if (!hasNext) {
                w4Var.b(arrayList, thVar.f186147f, 0);
                return jz5.f0.f384359a;
            }
            so2.j1 j1Var = (so2.j1) it.next();
            long mo2128x1ed62e84 = j1Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j1Var.f491972d;
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
            java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
            r45.qt2 qt2Var = thVar.f186147f;
            if (qt2Var != null) {
                i17 = qt2Var.m75939xb282bd08(5);
            }
            arrayList.add(w4Var.a(mo2128x1ed62e84, m75945x2fec8307, 2004, m76829x97edf6c0, i17));
        }
    }
}
