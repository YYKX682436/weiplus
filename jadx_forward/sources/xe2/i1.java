package xe2;

/* loaded from: classes3.dex */
public final class i1 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535403c = "LivePromoteStatusInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        r45.sj1 sj1Var = new r45.sj1();
        if (ch1Var != null) {
            if (!(ch1Var.m75934xbce7f2f(4) != null)) {
                ch1Var = null;
            }
            if (ch1Var != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                sj1Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535403c, "recive promote msg: " + pm0.b0.g(sj1Var));
        if (zl2.q4.f555466a.E()) {
            db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "收到留资dimiss通知", 0).show();
        }
        ((mm2.f6) this.f526800a.a(mm2.f6.class)).H.mo7808x76db6cb1(sj1Var);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20085};
    }
}
