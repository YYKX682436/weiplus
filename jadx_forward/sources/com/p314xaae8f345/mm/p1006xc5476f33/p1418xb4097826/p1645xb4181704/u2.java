package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f211956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, fp0.r rVar, jv2.i iVar) {
        super(0);
        this.f211956d = linkedList;
        this.f211957e = q3Var;
        this.f211958f = rVar;
        this.f211959g = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList level2Comments = this.f211956d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211957e;
            jv2.i iVar = this.f211959g;
            if (!hasNext) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3.g(q3Var, arrayList, iVar, true);
                this.f211958f.b(fp0.u.f346823f);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next();
            hv2.c cVar = hv2.c.f366820a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            if (q3Var.f211904h == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            arrayList.add(cVar.b(c19781xd1c47b87, r2.f376663f, iVar.mo2128x1ed62e84()));
        }
    }
}
