package st2;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f493742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f493744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f493745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(az2.f fVar, st2.h1 h1Var, boolean z17, cm2.k0 k0Var) {
        super(5);
        this.f493742d = fVar;
        this.f493743e = h1Var;
        this.f493744f = z17;
        this.f493745g = k0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        mm2.h5 h5Var;
        mm2.i7 i7Var;
        r45.nt2 nt2Var;
        r45.nt2 nt2Var2;
        r45.ie ieVar;
        r45.du5 du5Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        int intValue = ((java.lang.Number) obj3).intValue();
        r45.sw1 sw1Var = (r45.sw1) obj5;
        this.f493742d.b();
        java.lang.String str = null;
        if (booleanValue || intValue == -200187) {
            if (this.f493744f) {
                gk2.e eVar = gk2.e.f354004n;
                if ((eVar == null || (nt2Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).E) == null || nt2Var2.m75939xb282bd08(0) != 1) ? false : true) {
                    dk2.ef efVar = dk2.ef.f314905a;
                    mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
                    if (((f6Var == null || (nt2Var = f6Var.E) == null || nt2Var.m75939xb282bd08(1) != 0) ? false : true) && (h5Var = (mm2.h5) efVar.i(mm2.h5.class)) != null && (i7Var = h5Var.f410645g) != null) {
                        st2.h1 h1Var = this.f493743e;
                        mm2.h5 h5Var2 = (mm2.h5) efVar.i(mm2.h5.class);
                        if (h5Var2 != null) {
                            h5Var2.N6(null);
                        }
                        r45.hd5 hd5Var = i7Var.f410681e;
                        if (hd5Var != null) {
                            hd5Var.set(5, 0);
                        }
                        h1Var.P.m8146xced61ae5();
                    }
                }
            }
            this.f493745g.G = this.f493744f;
            this.f493743e.G();
            qm0.a aVar = ((mm2.f6) this.f493743e.f493868f.a(mm2.f6.class)).f410572o;
            boolean z17 = this.f493744f;
            st2.h1 h1Var2 = this.f493743e;
            if (z17) {
                aVar.getClass();
                java.util.List<so2.j5> list = aVar.f446213a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
                synchronized (list) {
                    for (so2.j5 it : list) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
                        if (it instanceof cm2.m0) {
                            ((cm2.m0) it).G = 0;
                        }
                    }
                }
            }
            h1Var2.P.c0(aVar);
            if (this.f493744f) {
                this.f493743e.A();
            }
            this.f493743e.getClass();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "issue coupon failed");
            android.content.Context context = this.f493743e.f493866d.getContext();
            if (sw1Var != null && (ieVar = (r45.ie) sw1Var.m75936x14adae67(0)) != null && (du5Var = ieVar.f458493e) != null) {
                str = du5Var.f454289d;
            }
            if (str == null) {
                str = this.f493743e.f493866d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edx, java.lang.Integer.valueOf(intValue));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            db5.t7.g(context, str);
        }
        return jz5.f0.f384359a;
    }
}
