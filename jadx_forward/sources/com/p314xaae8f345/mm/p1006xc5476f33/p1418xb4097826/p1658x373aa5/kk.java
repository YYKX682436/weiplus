package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class kk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f214039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(java.util.ArrayList arrayList, int i17) {
        super(0);
        this.f214039d = arrayList;
        this.f214040e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f214040e;
        java.util.ArrayList arrayList = this.f214039d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4 w4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w4.f206955a;
            if (!hasNext) {
                r45.qt2 qt2Var = new r45.qt2();
                qt2Var.set(5, java.lang.Integer.valueOf(this.f214040e));
                w4Var.b(arrayList2, qt2Var, 0);
                return jz5.f0.f384359a;
            }
            so2.j1 j1Var = (so2.j1) it.next();
            long mo2128x1ed62e84 = j1Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = j1Var.f491972d;
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            arrayList2.add(w4Var.a(mo2128x1ed62e84, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null, 2004, c19792x256d2725.m76829x97edf6c0(), i17));
        }
    }
}
