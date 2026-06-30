package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f211922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, fp0.r rVar, jv2.d dVar) {
        super(0);
        this.f211922d = linkedList;
        this.f211923e = o0Var;
        this.f211924f = rVar;
        this.f211925g = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList level2Comments = this.f211922d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211923e;
            jv2.d dVar = this.f211925g;
            if (!hasNext) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.b(o0Var, arrayList, dVar, true);
                this.f211924f.b(fp0.u.f346823f);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next();
            hv2.b bVar = hv2.b.f366819a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            if (o0Var.f211861m == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            arrayList.add(bVar.b(c19781xd1c47b87, r2.f376656f, dVar.mo2128x1ed62e84()));
        }
    }
}
