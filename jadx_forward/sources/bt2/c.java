package bt2;

/* loaded from: classes3.dex */
public final class c extends ws2.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f105713d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f105714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f105713d = "FinderLiveShoppingReplayDecorateUIC";
    }

    public void e(boolean z17, boolean z18) {
        ((mm2.c1) c(mm2.c1.class)).l9(2);
        ya2.g gVar = ya2.h.f542017a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) c(mm2.c1.class)).f410379n;
        ya2.b2 b17 = gVar.b(c19792x256d2725 != null ? c19792x256d2725.m76836x6c03c64c() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f530626c;
        android.widget.TextView textView = k0Var != null ? (android.widget.TextView) k0Var.findViewById(com.p314xaae8f345.mm.R.id.kbb) : null;
        if (b17 != null && textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String z07 = b17.z0();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f530625b, z07, textSize));
        }
        so2.j5 j5Var = ((mm2.f6) c(mm2.f6.class)).f410582w;
        if (j5Var instanceof cm2.m0 ? true : j5Var instanceof cm2.k0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f105714e;
            if (ea0Var != null) {
                ea0Var.K0(0);
            }
            so2.j5 j5Var2 = ((mm2.f6) c(mm2.f6.class)).f410582w;
            if (j5Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var2 = this.f105714e;
                if (ea0Var2 != null) {
                    so2.t2 t2Var = new so2.t2();
                    t2Var.f492139a = false;
                    ea0Var2.y1().m175944x84a840e0(t2Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var3 = this.f105714e;
                if (ea0Var3 != null) {
                    ea0Var3.l(j5Var2);
                }
            }
        } else if (j5Var instanceof cm2.k0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = this.f530626c;
            if (k0Var2 != null) {
                qo0.c.a(k0Var2, qo0.b.f446910l2, null, 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var4 = this.f105714e;
            if (ea0Var4 != null) {
                ea0Var4.K0(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var5 = this.f105714e;
            if (ea0Var5 != null) {
                ea0Var5.K0(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var3 = this.f530626c;
        if (k0Var3 != null) {
            k0Var3.m57645xc03d2e6f(((mm2.c1) c(mm2.c1.class)).f410385o, true);
        }
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 baseRouter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRouter, "baseRouter");
        gk2.e m57654xd7793f26 = baseRouter.m57654xd7793f26();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m57654xd7793f26, "<set-?>");
        this.f101142a = m57654xd7793f26;
        this.f530626c = baseRouter;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) baseRouter.findViewById(com.p314xaae8f345.mm.R.id.f568869oc0);
        if (viewGroup != null) {
            viewGroup.post(new bt2.a(viewGroup));
            viewGroup.setOnClickListener(new bt2.b(this, baseRouter));
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) baseRouter.findViewById(com.p314xaae8f345.mm.R.id.b1o);
        if (viewGroup2 != null) {
            this.f105714e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0(new android.widget.FrameLayout(this.f530625b), viewGroup2, baseRouter, null, null);
        }
    }
}
