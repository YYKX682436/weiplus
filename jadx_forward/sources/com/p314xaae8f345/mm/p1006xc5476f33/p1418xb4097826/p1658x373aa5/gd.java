package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class gd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f213687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f213688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd f213689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd f213690g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(cm2.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd kdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd ddVar) {
        super(3);
        this.f213687d = k0Var;
        this.f213688e = c15317x5870b165;
        this.f213689f = kdVar;
        this.f213690g = ddVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errString = (java.lang.String) obj2;
        r45.q62 q62Var = (r45.q62) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errString, "errString");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#runCgiFinderLiveReceiveCoupon isSuccess=");
        sb6.append(booleanValue);
        sb6.append(" errString=");
        sb6.append(errString);
        sb6.append(" wording=");
        sb6.append(q62Var != null ? q62Var.m75945x2fec8307(2) : null);
        sb6.append(" coupon_status=");
        sb6.append(q62Var != null ? java.lang.Integer.valueOf(q62Var.m75939xb282bd08(3)) : null);
        sb6.append(" style=");
        sb6.append(q62Var != null ? java.lang.Integer.valueOf(q62Var.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeSuccessView", sb6.toString());
        if (booleanValue) {
            java.lang.String m75945x2fec8307 = q62Var != null ? q62Var.m75945x2fec8307(2) : null;
            int m75939xb282bd08 = q62Var != null ? q62Var.m75939xb282bd08(3) : 0;
            java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.m75939xb282bd08(4)) : null;
            int m75939xb282bd082 = q62Var != null ? q62Var.m75939xb282bd08(5) : 0;
            cm2.k0 k0Var = this.f213687d;
            k0Var.j(m75945x2fec8307, m75939xb282bd08, valueOf, m75939xb282bd082);
            this.f213688e.c(k0Var, false, false);
            yz5.l lVar = this.f213689f.f214030s;
            if (lVar != null) {
                lVar.mo146xb9724478(this.f213690g);
            }
        }
        return jz5.f0.f384359a;
    }
}
