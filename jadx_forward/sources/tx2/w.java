package tx2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f504200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f504202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.h32 h32Var, tx2.i0 i0Var, r45.ov2 ov2Var) {
        super(3);
        this.f504200d = h32Var;
        this.f504201e = i0Var;
        this.f504202f = ov2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yz5.l lVar;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeBigCardWidget", sb6.toString());
        r45.h32 h32Var = this.f504200d;
        tx2.i0 i0Var = this.f504201e;
        if (q62Var != null) {
            zl2.t.c(h32Var, q62Var, booleanValue);
            i0Var.y();
        }
        if (booleanValue) {
            if (i0Var.f504115h != -1) {
                zl2.g gVar = zl2.g.f555303a;
                java.lang.String m75945x2fec8307 = this.f504202f.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                gVar.b(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : "", i0Var.f504115h);
            }
            r45.ov2 a17 = zl2.t.a(h32Var);
            if (a17 != null && (lVar = i0Var.F) != null) {
                lVar.mo146xb9724478(a17);
            }
        }
        return jz5.f0.f384359a;
    }
}
