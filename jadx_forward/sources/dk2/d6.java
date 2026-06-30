package dk2;

/* loaded from: classes3.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f314853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f314854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(zy2.i5 i5Var, gk2.e eVar) {
        super(4);
        this.f314853d = i5Var;
        this.f314854e = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        zy2.i5 i5Var = this.f314853d;
        if (intValue2 == 0 && intValue == 0) {
            java.util.ArrayList arrayList = ((mm2.f5) ((mm2.c1) this.f314854e.a(mm2.c1.class)).m147920xbba4bfc0(mm2.f5.class)).f410557f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.xn1 xn1Var = (r45.xn1) it.next();
                r45.rz1 rz1Var = new r45.rz1();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
                rz1Var.set(0, c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
                rz1Var.set(1, java.lang.Integer.valueOf((int) xn1Var.m75942xfb822ef2(15)));
                arrayList2.add(rz1Var);
            }
            i5Var.a(arrayList2);
        } else {
            i5Var.a(kz5.p0.f395529d);
        }
        return jz5.f0.f384359a;
    }
}
