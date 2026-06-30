package pj5;

/* loaded from: classes9.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f436935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(in5.s0 s0Var, pj5.l lVar) {
        super(4);
        this.f436934d = s0Var;
        this.f436935e = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduleMsgDetailUI", "SetMsgRemindCgi delete, errType: " + ((java.lang.Number) obj).intValue() + ", errCode: " + ((java.lang.Number) obj2).intValue() + ", errMsg: " + ((java.lang.String) obj3) + ", remindId: " + ((java.lang.String) obj4));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f436934d.o().mo7946xf939df19();
        xm3.t0 t0Var = mo7946xf939df19 instanceof xm3.t0 ? (xm3.t0) mo7946xf939df19 : null;
        if (t0Var != null && (c16718x7059cefe = t0Var.I) != null) {
            c16718x7059cefe.s(this.f436935e.v());
        }
        return jz5.f0.f384359a;
    }
}
