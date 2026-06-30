package sj2;

/* loaded from: classes10.dex */
public final class h extends sj2.i {
    public final fg2.p0 N;
    public boolean P;
    public final wj2.j0 Q;
    public final wj2.j0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.auz, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.f566161ey3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566161ey3);
        if (c14296xe95b9a60 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f566163rm4;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566163rm4);
            if (a17 != null) {
                fg2.t0 a18 = fg2.t0.a(a17);
                int i18 = com.p314xaae8f345.mm.R.id.f8q;
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                if (a19 != null) {
                    fg2.a0 a27 = fg2.a0.a(a19);
                    i18 = com.p314xaae8f345.mm.R.id.f_y;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_y);
                    if (frameLayout != null) {
                        i18 = com.p314xaae8f345.mm.R.id.fa_;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                        if (c14296xe95b9a602 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.fag;
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag);
                            if (frameLayout2 != null) {
                                i18 = com.p314xaae8f345.mm.R.id.fah;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fah);
                                if (c22699x3dcdb352 != null) {
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
                                    int i19 = com.p314xaae8f345.mm.R.id.faj;
                                    android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.faj);
                                    if (a28 != null) {
                                        fg2.h0 a29 = fg2.h0.a(a28);
                                        i19 = com.p314xaae8f345.mm.R.id.rmf;
                                        android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.rmf);
                                        if (a37 != null) {
                                            fg2.t0 a38 = fg2.t0.a(a37);
                                            i19 = com.p314xaae8f345.mm.R.id.g_m;
                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g_m);
                                            if (c1073x7e08a787 != null) {
                                                i19 = com.p314xaae8f345.mm.R.id.g_n;
                                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g_n);
                                                if (imageView != null) {
                                                    i19 = com.p314xaae8f345.mm.R.id.g_o;
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a603 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g_o);
                                                    if (c14296xe95b9a603 != null) {
                                                        i19 = com.p314xaae8f345.mm.R.id.g_r;
                                                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.g_r);
                                                        if (c22789xd23e9a9b != null) {
                                                            i19 = com.p314xaae8f345.mm.R.id.gxq;
                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0 c1076xfbb92cd0 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gxq);
                                                            if (c1076xfbb92cd0 != null) {
                                                                i19 = com.p314xaae8f345.mm.R.id.jis;
                                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5.C14244x5bb442ce c14244x5bb442ce = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5.C14244x5bb442ce) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jis);
                                                                if (c14244x5bb442ce != null) {
                                                                    i19 = com.p314xaae8f345.mm.R.id.f567452jj2;
                                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567452jj2);
                                                                    if (imageView2 != null) {
                                                                        i19 = com.p314xaae8f345.mm.R.id.jj8;
                                                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a604 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jj8);
                                                                        if (c14296xe95b9a604 != null) {
                                                                            i19 = com.p314xaae8f345.mm.R.id.jja;
                                                                            android.view.View a39 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.jja);
                                                                            if (a39 != null) {
                                                                                i19 = com.p314xaae8f345.mm.R.id.m3w;
                                                                                android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.m3w);
                                                                                if (frameLayout3 != null) {
                                                                                    i19 = com.p314xaae8f345.mm.R.id.n0k;
                                                                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.n0k);
                                                                                    if (c1073x7e08a7872 != null) {
                                                                                        i19 = com.p314xaae8f345.mm.R.id.f569220pg3;
                                                                                        view = inflate;
                                                                                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f569220pg3);
                                                                                        if (c22789xd23e9a9b2 != null) {
                                                                                            this.N = new fg2.p0(c22641xff2656ea, c14296xe95b9a60, a18, a27, frameLayout, c14296xe95b9a602, frameLayout2, c22699x3dcdb352, c22641xff2656ea, a29, a38, c1073x7e08a787, imageView, c14296xe95b9a603, c22789xd23e9a9b, c1076xfbb92cd0, c14244x5bb442ce, imageView2, c14296xe95b9a604, a39, frameLayout3, c1073x7e08a7872, c22789xd23e9a9b2);
                                                                                            addView(c22641xff2656ea);
                                                                                            c22641xff2656ea.setOnClickListener(this);
                                                                                            imageView.setOnClickListener(this);
                                                                                            c14296xe95b9a603.setOnClickListener(this);
                                                                                            ym5.l2 l2Var = ym5.l2.f544957a;
                                                                                            ym5.j2[] j2VarArr = ym5.j2.f544925d;
                                                                                            ae2.in inVar = ae2.in.f85221a;
                                                                                            c22789xd23e9a9b.o(inVar.a(ym5.f6.T));
                                                                                            c22789xd23e9a9b2.o(inVar.a(ym5.f6.U));
                                                                                            android.content.res.AssetManager assets = context.getAssets();
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                                                                                            c22789xd23e9a9b.k(assets, "finder_live_link_mic_wave.pag");
                                                                                            c22789xd23e9a9b.m82583xcde73672(-1);
                                                                                            android.content.res.AssetManager assets2 = context.getAssets();
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets2, "getAssets(...)");
                                                                                            c22789xd23e9a9b2.k(assets2, "finder_live_link_mic_wave.pag");
                                                                                            c22789xd23e9a9b2.m82583xcde73672(-1);
                                                                                            frameLayout.setOnClickListener(this);
                                                                                            frameLayout2.setOnClickListener(this);
                                                                                            android.widget.LinearLayout linearLayout = a38.f343848a;
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getRoot(...)");
                                                                                            this.Q = new wj2.j0(linearLayout, pluginAbility, service);
                                                                                            android.widget.LinearLayout linearLayout2 = a18.f343848a;
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout2, "getRoot(...)");
                                                                                            this.R = new wj2.j0(linearLayout2, pluginAbility, service);
                                                                                            linearLayout2.setTranslationX(-i65.a.b(context, 20));
                                                                                            linearLayout2.setTranslationY(-i65.a.b(context, 8));
                                                                                            return;
                                                                                        }
                                                                                        i17 = i19;
                                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
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
                                    }
                                    view = inflate;
                                    i17 = i19;
                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
                                }
                            }
                        }
                    }
                }
                view = inflate;
                i17 = i18;
                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
            }
        }
        view = inflate;
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    /* renamed from: getMicHeartText */
    private final android.widget.TextView m164660xb52f4282() {
        boolean z17 = this.M;
        fg2.p0 p0Var = this.N;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = p0Var.f343737b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14296xe95b9a60);
            return c14296xe95b9a60;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602 = p0Var.f343740e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14296xe95b9a602);
        return c14296xe95b9a602;
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        android.view.ViewTreeObserver viewTreeObserver;
        super.S(textView);
        if (this.M && textView != null && (viewTreeObserver = textView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new sj2.g(textView));
        }
        if (!m174009x3a33aac1().a0().n() || textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    @Override // sj2.i
    public void b0(boolean z17) {
        android.widget.TextView m164660xb52f4282;
        fg2.p0 p0Var = this.N;
        if (!z17) {
            android.content.Context context = p0Var.f343736a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f17 = displayMetrics.density / context.getResources().getDisplayMetrics().density;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "checkFontSizeMode rate: " + f17);
            android.view.ViewGroup.LayoutParams layoutParams = p0Var.f343749n.getLayoutParams();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = p0Var.f343736a;
            if (layoutParams != null) {
                int b17 = (int) (i65.a.b(c22641xff2656ea.getContext(), 36) * f17);
                layoutParams.width = b17;
                layoutParams.height = b17;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = p0Var.f343742g.f343595a.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (i65.a.b(c22641xff2656ea.getContext(), 20) * f17);
            }
        }
        float b18 = i65.a.b(getContext(), 8);
        if (!(D() ? zl2.r4.f555483a.x1() : !Z())) {
            b18 = 0.0f;
        }
        android.graphics.drawable.Drawable background = p0Var.f343751p.getBackground();
        jz5.f0 f0Var = null;
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(b18);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = p0Var.f343747l.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3).f92414b = z17 ? m164662x9dd54f5e() : 0;
        if (z17) {
            p0Var.f343743h.setVisibility(0);
            p0Var.f343752q.setVisibility(8);
            p0Var.f343736a.m81431x205ac394(0.0f);
        } else {
            p0Var.f343736a.m81431x205ac394(b18);
            p0Var.f343743h.setVisibility(8);
            p0Var.f343752q.setVisibility(0);
        }
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            if (z17) {
                wj2.j0 j0Var = this.R;
                if (j0Var != null) {
                    j0Var.b(m145850xf6df7a5e, new lj2.e0(j0Var.f528222a, lj2.f0.f400388d));
                }
            } else {
                wj2.j0 j0Var2 = this.Q;
                if (j0Var2 != null) {
                    j0Var2.b(m145850xf6df7a5e, new lj2.e0(this, lj2.f0.f400389e));
                }
            }
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            q(p0Var.f343748m);
            if (z17) {
                java.util.ArrayList<android.graphics.RectF> m164661x145d661e = m164661x145d661e();
                if (m164661x145d661e != null) {
                    p0Var.f343748m.r(b18, m164661x145d661e);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    p0Var.f343748m.n();
                }
                t(p0Var.f343744i);
                u(p0Var.f343745j);
            } else {
                p0Var.f343748m.n();
                t(p0Var.f343749n);
                u(p0Var.f343750o);
                f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
            }
        }
        S(m164660xb52f4282());
        if (!A() || (m164660xb52f4282 = m164660xb52f4282()) == null) {
            return;
        }
        m174012xaf0594a2(m164660xb52f4282);
        m164660xb52f4282.setOnClickListener(this);
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(m164660xb52f4282());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        boolean B = B();
        fg2.p0 p0Var = this.N;
        if (B || (G() && m174009x3a33aac1().a0().F())) {
            if (p0Var.f343743h.getVisibility() == 0) {
                p0Var.f343739d.setVisibility(0);
            } else {
                p0Var.f343741f.setVisibility(0);
            }
            p0Var.f343746k.n();
            p0Var.f343746k.setVisibility(8);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = p0Var.f343753r;
            c22789xd23e9a9b.n();
            c22789xd23e9a9b.setVisibility(8);
            return;
        }
        p0Var.f343741f.setVisibility(8);
        p0Var.f343739d.setVisibility(8);
        if (this.P != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.P);
            this.P = z17;
            if (z17) {
                p0Var.f343746k.n();
                p0Var.f343746k.setVisibility(8);
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = p0Var.f343753r;
                c22789xd23e9a9b2.n();
                c22789xd23e9a9b2.setVisibility(8);
                return;
            }
            if (p0Var.f343743h.getVisibility() == 0) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = p0Var.f343746k;
                c22789xd23e9a9b3.setVisibility(0);
                c22789xd23e9a9b3.g();
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = p0Var.f343753r;
                c22789xd23e9a9b4.setVisibility(0);
                c22789xd23e9a9b4.g();
            }
        }
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // sj2.i, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        android.widget.RelativeLayout relativeLayout = this.N.f343742g.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        android.widget.RelativeLayout relativeLayout = this.N.f343738c.f343469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // sj2.i
    /* renamed from: getRoundCornerConstraintLayout */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea mo164659xafdbe1d4() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = this.N.f343736a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22641xff2656ea, "getRoot(...)");
        return c22641xff2656ea;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "FocusAudioCoverWidget";
    }

    @Override // sj2.i, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r10
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r11 == 0) goto L27
            int r11 = r11.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L28
        L27:
            r11 = r0
        L28:
            fg2.p0 r1 = r10.N
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout r2 = r1.f343736a
            int r2 = r2.getId()
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "android/view/View$OnClickListener"
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/mic/widget/focus/FinderLiveMicFocusAudioCoverWidget"
            if (r11 != 0) goto L3b
            goto L57
        L3b:
            int r7 = r11.intValue()
            if (r7 != r2) goto L57
            boolean r11 = r10.M
            if (r11 == 0) goto L52
            boolean r11 = r10.E()
            if (r11 != 0) goto L52
            r10.a0()
            yj0.a.h(r10, r6, r5, r4, r3)
            return
        L52:
            r10.J()
            goto Lcf
        L57:
            android.widget.ImageView r2 = r1.f343744i
            int r2 = r2.getId()
            r7 = 0
            r8 = 1
            if (r11 != 0) goto L62
            goto L6a
        L62:
            int r9 = r11.intValue()
            if (r9 != r2) goto L6a
        L68:
            r2 = r8
            goto L7b
        L6a:
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView r2 = r1.f343745j
            int r2 = r2.getId()
            if (r11 != 0) goto L73
            goto L7a
        L73:
            int r9 = r11.intValue()
            if (r9 != r2) goto L7a
            goto L68
        L7a:
            r2 = r7
        L7b:
            if (r2 == 0) goto L7f
        L7d:
            r2 = r8
            goto L90
        L7f:
            android.widget.FrameLayout r2 = r1.f343741f
            int r2 = r2.getId()
            if (r11 != 0) goto L88
            goto L8f
        L88:
            int r9 = r11.intValue()
            if (r9 != r2) goto L8f
            goto L7d
        L8f:
            r2 = r7
        L90:
            if (r2 == 0) goto L94
        L92:
            r1 = r8
            goto La5
        L94:
            android.widget.FrameLayout r1 = r1.f343739d
            int r1 = r1.getId()
            if (r11 != 0) goto L9d
            goto La4
        L9d:
            int r2 = r11.intValue()
            if (r2 != r1) goto La4
            goto L92
        La4:
            r1 = r7
        La5:
            if (r1 == 0) goto Lab
            r10.J()
            goto Lcf
        Lab:
            android.widget.TextView r1 = r10.m164660xb52f4282()
            if (r1 == 0) goto Lb9
            int r0 = r1.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lb9:
            boolean r11 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r0)
            if (r11 == 0) goto Lcf
            android.widget.TextView r11 = r10.m164660xb52f4282()
            int r11 = r11.getVisibility()
            if (r11 != 0) goto Lca
            r7 = r8
        Lca:
            if (r7 == 0) goto Lcf
            r10.H()
        Lcf:
            yj0.a.h(r10, r6, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj2.h.onClick(android.view.View):void");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wj2.j0 j0Var = this.Q;
        if (j0Var != null) {
            j0Var.c();
        }
        wj2.j0 j0Var2 = this.R;
        if (j0Var2 != null) {
            j0Var2.c();
        }
    }
}
