package st2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f493774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f493775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(st2.h1 h1Var, cm2.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165) {
        super(2);
        this.f493773d = h1Var;
        this.f493774e = k0Var;
        this.f493775f = c15317x5870b165;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        zl2.r4 r4Var = zl2.r4.f555483a;
        st2.h1 h1Var = this.f493773d;
        android.content.Context context = h1Var.f493866d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r4Var.h3(context, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.D, this.f493774e, booleanValue ? "0" : "1", null, 8, null);
        java.lang.String m75945x2fec8307 = q62Var != null ? q62Var.m75945x2fec8307(2) : null;
        int m75939xb282bd08 = q62Var != null ? q62Var.m75939xb282bd08(3) : 0;
        java.lang.Integer valueOf = q62Var != null ? java.lang.Integer.valueOf(q62Var.m75939xb282bd08(4)) : null;
        int m75939xb282bd082 = q62Var != null ? q62Var.m75939xb282bd08(5) : 0;
        cm2.k0 k0Var = this.f493774e;
        k0Var.j(m75945x2fec8307, m75939xb282bd08, valueOf, m75939xb282bd082);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "receive coupon success: " + k0Var);
        this.f493775f.c(k0Var, false, false);
        h1Var.S();
        if (booleanValue) {
            java.lang.String m75945x2fec83072 = q62Var != null ? q62Var.m75945x2fec8307(6) : null;
            boolean z17 = m75945x2fec83072 == null || m75945x2fec83072.length() == 0;
            android.view.ViewGroup viewGroup = h1Var.f493866d;
            if (z17) {
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                k0Var.i(context2);
            } else {
                db5.t7.h(viewGroup.getContext(), m75945x2fec83072);
            }
            h1Var.G();
            h1Var.P.c0(((mm2.f6) h1Var.f493868f.a(mm2.f6.class)).f410572o);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "receive coupon failed");
        }
        return jz5.f0.f384359a;
    }
}
