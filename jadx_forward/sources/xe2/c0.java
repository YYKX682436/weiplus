package xe2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f535373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xe2.h0 h0Var) {
        super(1);
        this.f535373d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.ch1 it = (r45.ch1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        xe2.h0 h0Var = this.f535373d;
        gk2.e eVar = h0Var.f526800a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).f410454y4) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.xn1 xn1Var = (r45.xn1) it.m75936x14adae67(0);
            if (r4Var.c2((xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c())) {
                ((mm2.c1) eVar.a(mm2.c1.class)).f410454y4 = true;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Pk();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f535399c, "filterGiftMsg: giftShowInfo=" + l1Var.m57187x8cdac1b() + ", " + l1Var + ", client_msg_id=" + it.m75945x2fec8307(2) + ", local_client_msg_id=" + it.m75945x2fec8307(14) + ", quoted_msg_seq=" + it.m75942xfb822ef2(3) + ", seq=" + it.m75942xfb822ef2(12));
        return l1Var;
    }
}
