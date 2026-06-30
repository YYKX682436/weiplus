package pi2;

/* loaded from: classes3.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.a f436328J;
    public oi2.a K;
    public final jz5.g L;
    public android.widget.CheckBox M;
    public android.widget.TextView N;
    public android.view.View P;
    public r45.kf5 Q;
    public fg2.u0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, gk2.e buContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, yz5.a back) {
        super(context, false, null, 0.0f, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(back, "back");
        this.H = buContext;
        this.I = basePlugin;
        this.f436328J = back;
        this.L = jz5.h.b(new pi2.l(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drw;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f199716e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drw, (android.view.ViewGroup) z(), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.rc6;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rc6);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.f565315rg0;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f565315rg0);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.f565316rg1;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f565316rg1);
                if (textView2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.c8g;
                    android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.c8g);
                    if (textView3 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f565399ca1;
                        android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f565399ca1);
                        if (textView4 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.ci6;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ci6);
                            if (relativeLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.rjw;
                                android.widget.Button button = (android.widget.Button) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rjw);
                                if (button != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.enc;
                                    android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.enc);
                                    if (checkBox != null) {
                                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.ene);
                                        if (linearLayout2 != null) {
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.enf);
                                            if (textView5 != null) {
                                                int i18 = com.p314xaae8f345.mm.R.id.gyq;
                                                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.gyq);
                                                if (relativeLayout2 != null) {
                                                    i18 = com.p314xaae8f345.mm.R.id.gz9;
                                                    android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.gz9);
                                                    if (textView6 != null) {
                                                        i18 = com.p314xaae8f345.mm.R.id.f567068i05;
                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f567068i05);
                                                        if (c22699x3dcdb352 != null) {
                                                            i18 = com.p314xaae8f345.mm.R.id.imn;
                                                            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.imn);
                                                            if (progressBar != null) {
                                                                i18 = com.p314xaae8f345.mm.R.id.s2_;
                                                                android.widget.Button button2 = (android.widget.Button) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s2_);
                                                                if (button2 != null) {
                                                                    i18 = com.p314xaae8f345.mm.R.id.s2l;
                                                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s2l);
                                                                    if (linearLayout3 != null) {
                                                                        i18 = com.p314xaae8f345.mm.R.id.pkg;
                                                                        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.pkg);
                                                                        if (linearLayout4 != null) {
                                                                            this.R = new fg2.u0((android.widget.FrameLayout) rootView, textView, linearLayout, textView2, textView3, textView4, relativeLayout, button, checkBox, linearLayout2, textView5, relativeLayout2, textView6, c22699x3dcdb352, progressBar, button2, linearLayout3, linearLayout4);
                                                                            button.setOnClickListener(this);
                                                                            fg2.u0 u0Var = this.R;
                                                                            if (u0Var == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var.f343886k.setOnClickListener(this);
                                                                            fg2.u0 u0Var2 = this.R;
                                                                            if (u0Var2 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var2.f343887l.setOnClickListener(this);
                                                                            fg2.u0 u0Var3 = this.R;
                                                                            if (u0Var3 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var3.f343884i.setOnClickListener(this);
                                                                            fg2.u0 u0Var4 = this.R;
                                                                            if (u0Var4 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var4.f343880e.setOnClickListener(this);
                                                                            fg2.u0 u0Var5 = this.R;
                                                                            if (u0Var5 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            u0Var5.f343879d.setOnClickListener(this);
                                                                            fg2.u0 u0Var6 = this.R;
                                                                            if (u0Var6 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                throw null;
                                                                            }
                                                                            android.widget.TextView applyPrice = u0Var6.f343877b;
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applyPrice, "applyPrice");
                                                                            com.p314xaae8f345.mm.ui.fk.a(applyPrice);
                                                                            android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.enc);
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                                                                            this.M = (android.widget.CheckBox) findViewById;
                                                                            android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.enf);
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                                                                            this.N = (android.widget.TextView) findViewById2;
                                                                            android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.ene);
                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                                                                            this.P = findViewById3;
                                                                            android.widget.TextView textView7 = this.N;
                                                                            if (textView7 == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
                                                                                throw null;
                                                                            }
                                                                            com.p314xaae8f345.mm.ui.fk.a(textView7);
                                                                            android.view.View view = this.P;
                                                                            if (view == null) {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceContainer");
                                                                                throw null;
                                                                            }
                                                                            view.setOnClickListener(new pi2.d(this));
                                                                            android.widget.CheckBox checkBox2 = this.M;
                                                                            if (checkBox2 != null) {
                                                                                checkBox2.setOnCheckedChangeListener(new pi2.e(this));
                                                                                return;
                                                                            } else {
                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i17 = i18;
                                            } else {
                                                i17 = com.p314xaae8f345.mm.R.id.enf;
                                            }
                                        } else {
                                            i17 = com.p314xaae8f345.mm.R.id.ene;
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
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        fg2.u0 u0Var = this.R;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u0Var.f343881f.setVisibility(8);
        fg2.u0 u0Var2 = this.R;
        if (u0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u0Var2.f343885j.setVisibility(0);
        dk2.xf W0 = this.I.W0();
        if (W0 != null) {
            ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new pi2.h(this));
        }
        ae2.in inVar = ae2.in.f85221a;
        boolean z18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_KNOW_LICENSE_PAY_VISITOR_MIC_INT_SYNC, 0) != 1;
        android.content.Context context = this.f199716e;
        if (!z18) {
            fg2.u0 u0Var3 = this.R;
            if (u0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = u0Var3.f343876a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i65.a.b(context, 364);
            }
            fg2.u0 u0Var4 = this.R;
            if (u0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var4.f343882g.setEnabled(true);
            android.view.View view = this.P;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.P;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "openPanel", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.CheckBox checkBox = this.M;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(false);
        fg2.u0 u0Var5 = this.R;
        if (u0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u0Var5.f343882g.setEnabled(false);
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkn, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new pi2.m(this), string2.length() - string.length(), string2.length(), 33);
        android.widget.TextView textView = this.N;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
            throw null;
        }
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        android.widget.TextView textView2 = this.N;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
            throw null;
        }
        textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView3 = this.N;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
            throw null;
        }
        textView3.setText(spannableString);
        fg2.u0 u0Var6 = this.R;
        if (u0Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = u0Var6.f343876a.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i65.a.b(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8);
        }
    }

    public final void e0() {
        js4.k kVar;
        dk2.xf W0 = this.I.W0();
        if (W0 != null) {
            android.content.Context context = this.f199716e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            kVar = dk2.xf.a(W0, (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, 1, 0, new pi2.i(this), 4, null);
        } else {
            kVar = null;
        }
        if (kVar != null) {
            ((ns4.s) kVar).f421181m = new pi2.j(this);
        }
    }

    public final void f0() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.H.a(mm2.o4.class)).U;
        if (il4Var == null || (kf5Var = il4Var.f458665g) == null) {
            return;
        }
        this.Q = kf5Var;
        fg2.u0 u0Var = this.R;
        if (u0Var != null) {
            u0Var.f343877b.setText(java.lang.String.valueOf(kf5Var.f460191f));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.u0 u0Var = this.R;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = u0Var.f343880e.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W((pi2.p) ((jz5.n) this.L).mo141623x754a37bb(), null, false, 0, 7, null);
        } else {
            fg2.u0 u0Var2 = this.R;
            if (u0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = u0Var2.f343879d.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", "https://kf.qq.com/touch/product/wechatwallet_app.html?scene_id=kf4");
                j45.l.j(this.f199716e, "webview", ".ui.tools.WebViewUI", intent, null);
            } else {
                fg2.u0 u0Var3 = this.R;
                if (u0Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = u0Var3.f343882g.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    r45.kf5 kf5Var = this.Q;
                    gk2.e eVar = this.H;
                    r45.il4 il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U;
                    r45.kf5 kf5Var2 = il4Var != null ? il4Var.f458665g : null;
                    if (kf5Var != null && kf5Var2 != null && ((mm2.o4) eVar.a(mm2.o4.class)).B7(kf5Var, kf5Var2)) {
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mki), 0).show();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                        this.f436328J.mo152xb9724478();
                        f0();
                        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    pi2.f fVar = new pi2.f(this);
                    android.view.View view2 = this.P;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceContainer");
                        throw null;
                    }
                    if (view2.getVisibility() == 8) {
                        fVar.mo152xb9724478();
                    } else {
                        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new pi2.c(this, fVar, null), 3, null);
                    }
                } else {
                    fg2.u0 u0Var4 = this.R;
                    if (u0Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = u0Var4.f343886k.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                        e0();
                    } else {
                        fg2.u0 u0Var5 = this.R;
                        if (u0Var5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = u0Var5.f343887l.getId();
                        if (valueOf != null && valueOf.intValue() == id10) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                            e0();
                        } else {
                            fg2.u0 u0Var6 = this.R;
                            if (u0Var6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = u0Var6.f343884i.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                            }
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
