package df2;

/* loaded from: classes3.dex */
public final class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f313284d;

    public x0(df2.d1 d1Var) {
        this.f313284d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 giftType, java.util.List appendList) {
        r45.qv1 qv1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftType, "giftType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendList, "appendList");
        df2.d1 d1Var = this.f313284d;
        if (pm0.v.z(((mm2.c1) d1Var.m56788xbba4bfc0(mm2.c1.class)).f410340g2, 524288)) {
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : appendList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
            boolean z17 = false;
            if (l1Var.f197135t) {
                r45.kv1 kv1Var = (r45.kv1) l1Var.f197125g.m75936x14adae67(3);
                if (((kv1Var == null || (qv1Var = (r45.qv1) kv1Var.m75936x14adae67(23)) == null) ? 0 : qv1Var.m75939xb282bd08(1)) > 0 && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197134s, xy2.c.e(d1Var.O6())) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197134s, c01.z1.r()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197134s, ((mm2.c1) d1Var.m56788xbba4bfc0(mm2.c1.class)).I7().m75945x2fec8307(3)))) {
                    z17 = true;
                }
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var2 : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d1Var.f311466m, "batchGifts targetusername:" + l1Var2.f197134s);
            arrayList2.add(new df2.w6(df2.x6.f313295e, l1Var2, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d1Var.f311466m, "fallingGifts ".concat(kz5.n0.g0(arrayList2, null, null, null, 0, null, df2.w0.f313181d, 31, null)));
        df2.a7 a7Var = (df2.a7) d1Var.m56789x25fe639c(df2.a7.class);
        if (a7Var != null) {
            a7Var.Z6(d1Var.f311466m, arrayList2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1
    public void y() {
    }
}
