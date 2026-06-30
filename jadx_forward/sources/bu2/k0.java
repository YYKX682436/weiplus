package bu2;

/* loaded from: classes2.dex */
public final class k0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r45.p21 source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17;
        r45.p21 p21Var = this.f106081a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = null;
        if (p21Var.m75939xb282bd08(5) == 0 && (a17 = bu2.y.f106110a.a(p21Var)) != null) {
            abstractC14490x69736cb5 = cu2.u.f303974a.p(a17);
            if (p21Var.m75933x41a8a7f2(8)) {
                abstractC14490x69736cb5.c2(true);
            }
        }
        return abstractC14490x69736cb5;
    }

    public k0(int i17, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).uk(finderObject);
        r45.p21 p21Var = this.f106081a;
        p21Var.set(1, java.lang.Long.valueOf(j17));
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(2, finderObject);
        p21Var.set(3, java.lang.Integer.valueOf(i18));
        p21Var.set(5, 0);
        p21Var.set(8, java.lang.Boolean.valueOf(z17));
    }

    public /* synthetic */ k0(int i17, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, j17, c19792x256d2725, i18, (i19 & 16) != 0 ? false : z17);
    }
}
