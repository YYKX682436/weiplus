package xt2;

/* loaded from: classes.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f538620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f538622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f538623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.p pVar, boolean z17) {
        super(3);
        this.f538620d = r2Var;
        this.f538621e = h0Var;
        this.f538622f = pVar;
        this.f538623g = z17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.o12) obj3, "<anonymous parameter 2>");
        p3325xe03a0797.p3326xc267989b.p2.a(this.f538620d, null, 1, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f538621e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f538622f.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(this.f538623g));
        return jz5.f0.f384359a;
    }
}
