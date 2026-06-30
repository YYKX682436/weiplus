package xe2;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f535396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(xe2.h0 h0Var) {
        super(1);
        this.f535396d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        r45.ch1 it = (r45.ch1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        xe2.h0 h0Var = this.f535396d;
        h0Var.getClass();
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.xn1 xn1Var = (r45.xn1) it.m75936x14adae67(13);
        java.lang.String str = null;
        boolean c27 = r4Var.c2((xn1Var == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76197x6c03c64c());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterGiftMsg isMySelfMsg:");
        sb6.append(c27);
        sb6.append(", fromUserName:");
        r45.xn1 xn1Var2 = (r45.xn1) it.m75936x14adae67(13);
        sb6.append((xn1Var2 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76197x6c03c64c());
        sb6.append(", client_msg_id:");
        sb6.append(it.m75945x2fec8307(2));
        sb6.append(", type:");
        sb6.append(it.m75939xb282bd08(1));
        sb6.append(", fromNickName:");
        r45.xn1 xn1Var3 = (r45.xn1) it.m75936x14adae67(13);
        sb6.append((xn1Var3 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76184x8010e5e4());
        sb6.append(",toNickName:");
        r45.xn1 xn1Var4 = (r45.xn1) it.m75936x14adae67(0);
        if (xn1Var4 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76184x8010e5e4();
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f535399c, sb6.toString());
        return java.lang.Boolean.valueOf(!c27);
    }
}
