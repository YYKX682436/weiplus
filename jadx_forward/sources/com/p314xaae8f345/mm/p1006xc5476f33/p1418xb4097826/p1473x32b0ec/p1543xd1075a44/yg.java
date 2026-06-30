package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f201978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f201979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar, com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        super(0);
        this.f201978d = bhVar;
        this.f201979e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f201978d;
        bhVar.T = false;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f201979e;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            bhVar.m57975x764f8b52((r45.js1) fVar.f152151d);
            java.util.LinkedList m75941xfb821914 = ((r45.js1) fVar.f152151d).m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            bm2.v2 v2Var = bhVar.Q;
            v2Var.getClass();
            java.util.ArrayList arrayList = v2Var.f103908d;
            int size = arrayList.size();
            if (!m75941xfb821914.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new bm2.t2((r45.fq1) it.next(), 1));
                }
                arrayList.addAll(arrayList2);
                v2Var.m8151xc67946d3(size, m75941xfb821914.size());
            }
        }
        return jz5.f0.f384359a;
    }
}
