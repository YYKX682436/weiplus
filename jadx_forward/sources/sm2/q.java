package sm2;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sm2.o4 o4Var) {
        super(1);
        this.f491195d = o4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        r45.yz1 micPkInfo = (r45.yz1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micPkInfo, "micPkInfo");
        sm2.o4 o4Var = this.f491195d;
        mm2.o4 o4Var2 = (mm2.o4) o4Var.c(mm2.o4.class);
        java.lang.String m75945x2fec8307 = micPkInfo.m75945x2fec8307(2);
        r45.xn1 xn1Var = (r45.xn1) micPkInfo.m75936x14adae67(3);
        java.lang.String str = null;
        java.lang.String m76175x6d346f39 = (xn1Var == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa5.m76175x6d346f39();
        r45.xn1 xn1Var2 = (r45.xn1) micPkInfo.m75936x14adae67(3);
        java.lang.String m76197x6c03c64c = (xn1Var2 == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76197x6c03c64c();
        r45.xn1 xn1Var3 = (r45.xn1) micPkInfo.m75936x14adae67(3);
        o4Var2.L7(new km2.q(m75945x2fec8307, m76175x6d346f39, m76197x6c03c64c, (xn1Var3 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76184x8010e5e4(), 2, micPkInfo.m75945x2fec8307(0), null, true, micPkInfo.m75939xb282bd08(6), null, null, 0, 0, false, null, false, 0L, (r45.xn1) micPkInfo.m75936x14adae67(3), false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -131584, 1, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "checkLinkMicStateWhenJoin has unfinished mic pk, will close. curPkUser:" + ((mm2.o4) o4Var.c(mm2.o4.class)).l7());
        r45.xn1 xn1Var4 = (r45.xn1) micPkInfo.m75936x14adae67(3);
        java.lang.String m76197x6c03c64c2 = (xn1Var4 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
        mk2.h hVar = mk2.h.f408666a;
        hVar.d(m76197x6c03c64c2);
        hVar.f();
        sm2.o4 o4Var3 = this.f491195d;
        r45.xn1 xn1Var5 = (r45.xn1) micPkInfo.m75936x14adae67(3);
        if (xn1Var5 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        sm2.o4.o(o4Var3, str, false, false, null, 14, null);
        return jz5.f0.f384359a;
    }
}
