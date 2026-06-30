package ni2;

/* loaded from: classes10.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final zh2.c H;
    public final yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public fg2.b1 f419034J;
    public bj2.c K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, zh2.c pluginAbility, yz5.l notifyViewClick) {
        super(context, false, null, 0.6f, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyViewClick, "notifyViewClick");
        this.H = pluginAbility;
        this.I = notifyViewClick;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.df7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ezb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.f_r;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f_r);
        if (c22645x24069159 != null) {
            i17 = com.p314xaae8f345.mm.R.id.fam;
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = (com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.fam);
            if (c22840x82866af5 != null) {
                i17 = com.p314xaae8f345.mm.R.id.rfv;
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rfv);
                if (c1073x7e08a787 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.rfw;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rfw);
                    if (c22699x3dcdb352 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.rfx;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rfx);
                        if (textView != null) {
                            i17 = com.p314xaae8f345.mm.R.id.rkl;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rkl);
                            if (textView2 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.rkm;
                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rkm);
                                if (c1073x7e08a7872 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.rqo;
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rqo);
                                    if (c22699x3dcdb3522 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.rqp;
                                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rqp);
                                        if (textView3 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.f567449rr3;
                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567449rr3);
                                            if (textView4 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.rrj;
                                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rrj);
                                                if (linearLayout != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.mce;
                                                    p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mce);
                                                    if (c1095x65355f89 != null) {
                                                        this.f419034J = new fg2.b1((android.widget.LinearLayout) rootView, c22645x24069159, c22840x82866af5, c1073x7e08a787, c22699x3dcdb352, textView, textView2, c1073x7e08a7872, c22699x3dcdb3522, textView3, textView4, linearLayout, c1095x65355f89);
                                                        c1073x7e08a787.setOnClickListener(this);
                                                        fg2.b1 b1Var = this.f419034J;
                                                        if (b1Var == null) {
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var.f343483e.setOnClickListener(this);
                                                        zh2.c cVar = this.H;
                                                        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 j17 = cVar.j();
                                                        android.content.Context context = this.f199716e;
                                                        bj2.c cVar2 = new bj2.c(context, cVar, j17);
                                                        this.K = cVar2;
                                                        fg2.b1 b1Var2 = this.f419034J;
                                                        if (b1Var2 == null) {
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var2.f343480b.m82883x6cab2c8d(cVar2);
                                                        fg2.b1 b1Var3 = this.f419034J;
                                                        if (b1Var3 == null) {
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                            throw null;
                                                        }
                                                        b1Var3.f343480b.m82887x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.a());
                                                        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        fg2.b1 b1Var = this.f419034J;
        if (b1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int childCount = b1Var.f343480b.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            fg2.b1 b1Var2 = this.f419034J;
            if (b1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.view.View childAt = b1Var2.f343480b.getChildAt(i17);
            if (childAt != null && (childAt instanceof cj2.h)) {
                ((cj2.h) childAt).c();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        super.U();
        this.I.mo146xb9724478(java.lang.Integer.valueOf(this.L));
    }

    public final void e0() {
        fg2.b1 b1Var = this.f419034J;
        if (b1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        b1Var.f343482d.setVisibility(0);
        fg2.b1 b1Var2 = this.f419034J;
        if (b1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        b1Var2.f343484f.setVisibility(8);
        this.L = 0;
        fg2.b1 b1Var3 = this.f419034J;
        if (b1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = b1Var3.f343480b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i65.a.b(this.f199716e, 96);
        }
        fg2.b1 b1Var4 = this.f419034J;
        if (b1Var4 != null) {
            b1Var4.f343480b.requestLayout();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void f0() {
        fg2.b1 b1Var = this.f419034J;
        if (b1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        b1Var.f343482d.setVisibility(8);
        fg2.b1 b1Var2 = this.f419034J;
        if (b1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        b1Var2.f343484f.setVisibility(0);
        this.L = 1;
        fg2.b1 b1Var3 = this.f419034J;
        if (b1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = b1Var3.f343480b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        fg2.b1 b1Var4 = this.f419034J;
        if (b1Var4 != null) {
            b1Var4.f343480b.requestLayout();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void g0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
        if (i17 == 1) {
            f0();
        } else {
            e0();
        }
        zh2.c cVar = this.H;
        xh2.c cVar2 = (xh2.c) ((mm2.o4) cVar.g().a(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar2 != null) {
            bj2.c cVar3 = this.K;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ratioAdapter");
                throw null;
            }
            cVar3.f102688h = cVar.c();
            bj2.c cVar4 = this.K;
            if (cVar4 != null) {
                cVar4.h(cVar2.f536066c, cVar2.f536064a);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ratioAdapter");
                throw null;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLayoutSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.b1 b1Var = this.f419034J;
        if (b1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = b1Var.f343481c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            e0();
        } else {
            fg2.b1 b1Var2 = this.f419034J;
            if (b1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = b1Var2.f343483e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                f0();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLayoutSelectWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        android.widget.TextView x17 = x();
        x17.setEnabled(true);
        return x17;
    }
}
