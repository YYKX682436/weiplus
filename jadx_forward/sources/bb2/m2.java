package bb2;

/* loaded from: classes10.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 f100453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27) {
        super(0);
        this.f100453d = c13683xee96bb27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 m55604xe9000c39;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = this.f100453d;
        m55604xe9000c39 = c13683xee96bb27.m55604xe9000c39();
        m55604xe9000c39.e();
        c13683xee96bb27.g();
        cq.k1.a();
        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209461s6).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MegaVideoBulletNativeView", "scheduleRowExtendAutoHide: will hide row extend after " + intValue + "ms");
        bb2.h2 h2Var = new bb2.h2(c13683xee96bb27);
        c13683xee96bb27.f184342q = h2Var;
        c13683xee96bb27.postDelayed(h2Var, intValue);
        return jz5.f0.f384359a;
    }
}
