package el2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb f335281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(el2.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar) {
        super(2);
        this.f335280d = i0Var;
        this.f335281e = gbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj2;
        el2.i0 i0Var = this.f335280d;
        if (c19786x6a1e2862 != null) {
            i0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            cl0.g gVar = new cl0.g();
            gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "mmfinderlive");
            android.content.Context context = i0Var.f199716e;
            gVar.h("finderUserName", xy2.c.e(context));
            sVar.d(kz5.b1.e(new jz5.l("nativeData", gVar)));
            sVar.f225700d = new el2.e0(i0Var, sVar);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(context, c19786x6a1e2862, sVar);
        } else if (intValue > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar = this.f335281e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka kaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ka) ((jz5.n) i0Var.X).mo141623x754a37bb();
            wt2.a aVar = i0Var.I;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            kaVar.j0(7, intValue, aVar, gbVar, new el2.f0(i0Var));
        } else {
            el2.i0.h0(i0Var, 2, this.f335281e);
        }
        return jz5.f0.f384359a;
    }
}
