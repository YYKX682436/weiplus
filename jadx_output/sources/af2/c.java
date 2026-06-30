package af2;

/* loaded from: classes3.dex */
public final class c extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4521b;

    public c(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4520a = liveContext;
        this.f4521b = "LiveMsgQosReportIntercetor";
    }

    @Override // we2.x
    public boolean b(we2.b resp) {
        gk2.e eVar;
        tn0.w0 w0Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233384g && (eVar = this.f4520a) != null && ((mm2.c1) eVar.a(mm2.c1.class)).J3) {
            vn0.c cVar = vn0.b.f438174a;
            java.lang.String a17 = cVar.d().a();
            r45.qz1 qz1Var = (r45.qz1) ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getCustom(8);
            efVar.P(qz1Var != null ? (r45.oa4) qz1Var.getCustom(1) : null);
            java.lang.String a18 = cVar.d().a();
            if (!com.tencent.mm.sdk.platformtools.t8.D0(a17, a18) && (w0Var = dk2.ef.f233378d) != null) {
                w0Var.Q0();
            }
            com.tencent.mars.xlog.Log.i(this.f4521b, "check update sdk param while heartbeating, beforeKey:" + a17 + " afterKey:" + a18);
        }
        return true;
    }
}
