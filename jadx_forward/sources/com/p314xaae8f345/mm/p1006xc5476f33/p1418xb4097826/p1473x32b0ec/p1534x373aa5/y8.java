package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f198364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f198365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f198366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f198367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 f198368h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f198369i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(p3325xe03a0797.p3326xc267989b.r2 r2Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.p pVar, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3, int i17) {
        super(3);
        this.f198364d = r2Var;
        this.f198365e = h0Var;
        this.f198366f = pVar;
        this.f198367g = j17;
        this.f198368h = c14340xe0508cb3;
        this.f198369i = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.o12) obj3, "<anonymous parameter 2>");
        p3325xe03a0797.p3326xc267989b.p2.a(this.f198364d, null, 1, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f198365e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f198366f.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), java.lang.Long.valueOf(this.f198367g));
        if (!booleanValue) {
            if (!(errMsg.length() > 0)) {
                errMsg = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3 = this.f198368h;
            if (errMsg == null) {
                int i17 = this.f198369i;
                switch (i17) {
                    case 105:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.e(c14340xe0508cb3, com.p314xaae8f345.mm.R.C30867xcad56011.e6t);
                        break;
                    case 106:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.e(c14340xe0508cb3, com.p314xaae8f345.mm.R.C30867xcad56011.e6u);
                        break;
                    case 107:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.e(c14340xe0508cb3, com.p314xaae8f345.mm.R.C30867xcad56011.e6r);
                        break;
                    default:
                        db5.t7.m123883x26a183b(c14340xe0508cb3.getContext(), "cmdId:" + i17 + " failed", 0);
                        break;
                }
            } else {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3.f197605s;
                android.widget.Toast m123883x26a183b = db5.t7.m123883x26a183b(c14340xe0508cb3.getContext(), errMsg, 0);
                m123883x26a183b.setGravity(17, 0, 0);
                m123883x26a183b.show();
            }
        }
        return jz5.f0.f384359a;
    }
}
