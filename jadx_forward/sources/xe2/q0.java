package xe2;

/* loaded from: classes3.dex */
public final class q0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535427c;

    /* renamed from: d, reason: collision with root package name */
    public int f535428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535427c = "LiveHotCommentMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
        java.lang.String str = this.f535427c;
        if (m75934xbce7f2f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "empty msgPayload");
            return;
        }
        java.lang.String m75945x2fec8307 = ch1Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "empty clientMsgId");
            return;
        }
        r45.ai1 ai1Var = new r45.ai1();
        ai1Var.mo11468x92b714fd(m75934xbce7f2f.g());
        if (this.f535428d >= ai1Var.m75939xb282bd08(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "drop outdated app msg");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "receive hot comment msg:" + pm0.b0.g(ai1Var) + ", id:" + m75945x2fec8307);
        this.f535428d = ai1Var.m75939xb282bd08(0);
        ((mm2.x4) this.f526800a.a(mm2.x4.class)).f411078z.mo7808x76db6cb1(new jz5.l(ai1Var, m75945x2fec8307));
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20082};
    }
}
