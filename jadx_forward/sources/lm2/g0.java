package lm2;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qn f400922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(r45.qn qnVar) {
        super(1);
        this.f400922d = qnVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap safeSetValue = (java.util.concurrent.ConcurrentHashMap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeSetValue, "$this$safeSetValue");
        r45.qn qnVar = this.f400922d;
        r45.qm1 qm1Var = qnVar.f465634d;
        if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
            if (!(xVar.g(str) || xVar.h(str))) {
                safeSetValue.put(str, lm2.p.a(lm2.h0.f400925i, qnVar, null, 1, null));
            }
        }
        return jz5.f0.f384359a;
    }
}
