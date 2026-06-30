package kd2;

/* loaded from: classes8.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final kd2.a0 f388389v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kd2.a0 finderPageAdapter) {
        super(finderPageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderPageAdapter, "finderPageAdapter");
        this.f388389v = finderPageAdapter;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        this.f174779u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderContentFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent");
        this.f174772n.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String floatBallKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatBallKey, "floatBallKey");
        super.b(i17, floatBallKey);
        Q(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void e() {
        t().f174618e = -1;
        t().f174622i = "";
        g();
    }
}
