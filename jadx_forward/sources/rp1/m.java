package rp1;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 f480007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f480008e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7, boolean z17) {
        super(0);
        this.f480007d = c12917x19ac03e7;
        this.f480008e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pp1.z m54106x66a80248;
        rp1.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.T;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = this.f480007d;
        c12917x19ac03e7.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFloatBallViewDockLeft targetDockLeft: ");
        boolean z17 = this.f480008e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewV2", sb6.toString());
        c12917x19ac03e7.A = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = c12917x19ac03e7.f174965t;
        if (c12916x4253bec6 != null) {
            c12916x4253bec6.m54097xa953835c(z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewV2", "handleSwitchEdge animationEnd dockLeft: " + c12917x19ac03e7.A);
        c12917x19ac03e7.B(true, true);
        m54106x66a80248 = c12917x19ac03e7.m54106x66a80248();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "onEdgeSwitchEnd " + m54106x66a80248.f438987o);
        m54106x66a80248.f().S(true ^ m54106x66a80248.f438987o);
        m54106x66a80248.l();
        m54106x66a80248.u();
        return jz5.f0.f384359a;
    }
}
