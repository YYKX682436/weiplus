package id2;

/* loaded from: classes2.dex */
public final class l5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f372194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(id2.p5 p5Var) {
        super(1);
        this.f372194d = p5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        id2.p5 p5Var = this.f372194d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = p5Var.f372276d;
        if (c15343x638a173f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
            throw null;
        }
        c15343x638a173f.e(booleanValue);
        r45.hu1 hu1Var = p5Var.f372281i;
        int m75939xb282bd08 = hu1Var != null ? hu1Var.m75939xb282bd08(4) : -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSelfLotteryHistoryResultUIC", "continueFlag: " + m75939xb282bd08);
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f2 = p5Var.f372276d;
            if (c15343x638a173f2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c15343x638a173f2.m82937x390c1b4e(false);
        }
        return jz5.f0.f384359a;
    }
}
