package vd2;

/* loaded from: classes2.dex */
public final class a3 extends vd2.y2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec f517184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec) {
        super(c14166x338f3aec);
        this.f517184f = c14166x338f3aec;
    }

    @Override // vd2.y2
    public com.p314xaae8f345.mm.p944x882e457a.m1 b() {
        r45.kd1 kd1Var;
        r45.nw1 nw1Var;
        r45.kv0 a17 = db2.t4.f309704a.a(6479);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14166x338f3aec c14166x338f3aec = this.f517184f;
        a17.set(1, java.lang.Integer.valueOf(c14166x338f3aec.f193266n.f390739k));
        r45.g40 g40Var = new r45.g40();
        g40Var.set(0, c14166x338f3aec.f193266n.f390741m);
        a17.set(4, g40Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(7, java.lang.Integer.valueOf(c14166x338f3aec.f193266n.f390739k));
        qt2Var.set(5, java.lang.Integer.valueOf(c14166x338f3aec.f193266n.f390739k));
        if (c14166x338f3aec.f193261f) {
            km2.r rVar = c14166x338f3aec.f193266n;
            r45.kd1 kd1Var2 = rVar.f390732d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = rVar.f390733e;
            rVar.f390729a = c19792x256d2725 != null ? c19792x256d2725.m76795xb7dd3d98() : null;
            c14166x338f3aec.f193261f = false;
            kd1Var = kd1Var2;
        } else {
            kd1Var = null;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = c14166x338f3aec.f193013p;
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        r45.o72 T = r4Var.T(context, (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0), m56464xb5886c64());
        km2.r rVar2 = c14166x338f3aec.f193266n;
        long j17 = rVar2.f390730b;
        java.lang.String str = rVar2.f390735g;
        java.lang.String str2 = rVar2.f390731c;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = rVar2.f390729a;
        int i17 = rVar2.f390739k;
        float f17 = rVar2.f390737i;
        float f18 = rVar2.f390738j;
        r45.gy0 gy0Var = rVar2.f390742n;
        java.util.LinkedList linkedList = rVar2.f390744p;
        int i18 = rVar2.f390745q;
        int i19 = vd2.a2.f517171i;
        r45.o72 o72Var = vd2.a2.f517174l;
        if (o72Var == null) {
            o72Var = T;
        }
        db2.q5 q5Var = new db2.q5(j17, str, str2, gVar, i17, f17, f18, a17, kd1Var, qt2Var, gy0Var, linkedList, i18, o72Var, rVar2.f390746r, rVar2.f390749u);
        q5Var.O(2);
        q5Var.f309668q = c14166x338f3aec.f193266n.f390743o;
        q5Var.f309665n = c14166x338f3aec.f193263h;
        java.util.Iterator it = c14166x338f3aec.f193266n.f390744p.iterator();
        while (it.hasNext()) {
            ((r45.d72) it.next()).m75942xfb822ef2(0);
        }
        new java.lang.StringBuilder("curIndex:").append(c14166x338f3aec.f193266n.f390745q);
        m56464xb5886c64();
        return q5Var;
    }
}
