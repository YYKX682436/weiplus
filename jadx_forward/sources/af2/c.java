package af2;

/* loaded from: classes3.dex */
public final class c extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f86053a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86054b;

    public c(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f86053a = liveContext;
        this.f86054b = "LiveMsgQosReportIntercetor";
    }

    @Override // we2.x
    public boolean b(we2.b resp) {
        gk2.e eVar;
        tn0.w0 w0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314917g && (eVar = this.f86053a) != null && ((mm2.c1) eVar.a(mm2.c1.class)).J3) {
            vn0.c cVar = vn0.b.f519707a;
            java.lang.String a17 = cVar.d().a();
            r45.qz1 qz1Var = (r45.qz1) ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75936x14adae67(8);
            efVar.P(qz1Var != null ? (r45.oa4) qz1Var.m75936x14adae67(1) : null);
            java.lang.String a18 = cVar.d().a();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a17, a18) && (w0Var = dk2.ef.f314911d) != null) {
                w0Var.Q0();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f86054b, "check update sdk param while heartbeating, beforeKey:" + a17 + " afterKey:" + a18);
        }
        return true;
    }
}
