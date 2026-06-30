package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f151489d = v2Var;
        this.f151490e = v2Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a2.k1 textLayoutResult = (a2.k1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textLayoutResult, "textLayoutResult");
        a2.g gVar = textLayoutResult.f82299b;
        if (gVar.f82249c || ((float) p2.q.b(textLayoutResult.f82300c)) < gVar.f82251e) {
            n0.v2 v2Var = this.f151489d;
            v2Var.mo148714x53d8522f(java.lang.Double.valueOf(((java.lang.Number) v2Var.mo128745x754a37bb()).doubleValue() * 0.9d));
        } else {
            this.f151490e.mo148714x53d8522f(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
