package qi2;

/* loaded from: classes10.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {
    public final yi2.b A;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f445110h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f445111i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f445112m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f445113n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f445114o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f445115p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f445116q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f445117r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f445118s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f445119t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f445120u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f445121v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f445122w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f445123x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f445124y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f445125z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f445110h = pluginAbility;
        this.f445124y = jz5.h.b(new qi2.d(context, this));
        this.f445125z = jz5.h.b(new qi2.m(this, context));
        android.view.ViewGroup.LayoutParams layoutParams = this.f199917g.f526370d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.p314xaae8f345.mm.ui.bl.b(y().getContext()).y * 3) / 4;
        }
        this.A = new yi2.b(y(), pluginAbility.g(), new ii2.c(new ii2.a(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560847vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f373154d, null, 8, null)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dnv;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f555550a;
        zl2.u4 u4Var = zl2.u4.f555523f;
        android.content.Context context = this.f199914d;
        return w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnv, root, false, u4Var, context, com.p314xaae8f345.mm.ui.id.b(context));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f445123x;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, c22699x3dcdb352 != null ? java.lang.Integer.valueOf(c22699x3dcdb352.getId()) : null);
        zh2.c cVar = this.f445110h;
        if (b17) {
            dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (u4Var != null) {
                ((ni2.x) ((jz5.n) this.f445124y).mo141623x754a37bb()).g0(u4Var.f315701o);
            }
        } else {
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hrl) {
                fj2.s.f344716a.a(ml2.k1.f409175i);
                ((qi2.v) ((jz5.n) this.f445125z).mo141623x754a37bb()).I(((mm2.y2) cVar.g().a(mm2.y2.class)).f411096p, true);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568623qx4) {
                dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                if (u4Var2 != null && u4Var2.g()) {
                    dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                    if (u4Var3 != null && u4Var3.i()) {
                        qf2.y1 y1Var = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
                        if (y1Var != null) {
                            qi2.e eVar = new qi2.e(this);
                            dk2.m mVar = ((mm2.y2) y1Var.m56788xbba4bfc0(mm2.y2.class)).f411101u;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorReplayCrossRoomBattleAgain , curBattle: " + ((mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class)).Z + " setting: " + mVar);
                            if (mVar != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(y1Var, null, null, new qf2.h1(y1Var, mVar, mVar, eVar, null), 3, null);
                            }
                        }
                    } else {
                        qf2.y1 y1Var2 = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
                        if (y1Var2 != null) {
                            qi2.f fVar = new qi2.f(this);
                            dk2.u4 u4Var4 = ((mm2.o4) y1Var2.m56788xbba4bfc0(mm2.o4.class)).Z;
                            dk2.m mVar2 = ((mm2.y2) y1Var2.m56788xbba4bfc0(mm2.y2.class)).f411101u;
                            if (u4Var4 != null && mVar2 != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(y1Var2, null, null, new qf2.j1(y1Var2, mVar2, fVar, null), 3, null);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorStartCrossRoomBattle , curBattle: " + ((mm2.o4) y1Var2.m56788xbba4bfc0(mm2.o4.class)).Z + " setting: " + ((mm2.y2) y1Var2.m56788xbba4bfc0(mm2.y2.class)).f411101u);
                        }
                    }
                } else {
                    dk2.u4 u4Var5 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                    if (u4Var5 != null) {
                        int i17 = u4Var5.f315693g;
                        int i18 = u4Var5.f315694h;
                        java.lang.String str = u4Var5.f315695i;
                        if (str == null) {
                            str = "";
                        }
                        dk2.m mVar3 = new dk2.m(i17, i18, str, u4Var5.f315700n, u4Var5.f315699m, u4Var5.f315696j, u4Var5.f315701o);
                        qf2.y1 y1Var3 = (qf2.y1) cVar.mo57008x143f1b92(qf2.y1.class);
                        if (y1Var3 != null) {
                            y1Var3.e7(mVar3, new qi2.g(this));
                        }
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f6c) {
                a();
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.fkk) {
                v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f445111i = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.hrl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f445112m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568623qx4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f445113n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.hqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f445115p = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.hqp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f445116q = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f6c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f445117r = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.fkk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f445118s = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qvb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f445119t = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568624qx5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f445120u = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f568622qx3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f445122w = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.p314xaae8f345.mm.R.id.efe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f445121v = findViewById10;
        this.f445123x = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.ook);
        android.view.View view = this.f445112m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("changeModeLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f445113n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startPkLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f445117r;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("leftLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.widget.TextView textView = this.f445118s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightTextView");
            throw null;
        }
        textView.setOnClickListener(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f445123x;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f445115p;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f445118s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightTextView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        android.widget.TextView textView4 = this.f445116q;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleStatusText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.f6b)).m82040x7541828(this.f199914d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560639q5));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        fj2.s sVar = fj2.s.f344716a;
        sVar.a(ml2.k1.f409176m);
        fj2.s.c(sVar, ml2.q2.D, null, null, 0, 0, 30, null);
        fj2.j jVar = fj2.j.f344707a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f445114o;
        android.content.Context context = this.f199914d;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f445114o = jVar.b(k0Var, context, string, new qi2.i(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        jz5.f0 f0Var;
        super.w();
        android.widget.TextView textView = this.f445118s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightTextView");
            throw null;
        }
        android.content.Context context = this.f199914d;
        textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdz));
        android.widget.TextView textView2 = this.f445118s;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightTextView");
            throw null;
        }
        textView2.setVisibility(0);
        android.view.View view = this.f445119t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playOptionLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zh2.c cVar = this.f445110h;
        dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (u4Var.h()) {
                android.view.View view2 = this.f445119t;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("playOptionLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkPanelWidget", "showRightTextView", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBattleData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (u4Var.i()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f445122w;
                if (c22699x3dcdb352 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startPkIcon");
                    throw null;
                }
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3);
                android.widget.TextView textView3 = this.f445120u;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startPkTextView");
                    throw null;
                }
                textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6v));
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f445122w;
                if (c22699x3dcdb3522 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startPkIcon");
                    throw null;
                }
                c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79865xc8527e4c);
                android.widget.TextView textView4 = this.f445120u;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startPkTextView");
                    throw null;
                }
                textView4.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzs));
            }
            java.lang.String string = u4Var.f315693g == 1 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573205dw1) : u4Var.f315699m == 3 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8r) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573207dw4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            java.lang.String string2 = u4Var.f315694h == 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljg) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lje);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            android.widget.TextView textView5 = this.f445115p;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleText");
                throw null;
            }
            textView5.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzr, string, string2));
            java.lang.String string3 = u4Var.f315691e == 2 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqp) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
            android.widget.TextView textView6 = this.f445116q;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("battleStatusText");
                throw null;
            }
            textView6.setText(string3);
            android.view.View view3 = this.f445121v;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("anchorAcceptHeaderLayout");
                throw null;
            }
            view3.getVisibility();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f445123x;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setVisibility((u4Var.f() && u4Var.f315693g == 1 && ((mm2.c1) cVar.g().a(mm2.c1.class)).M) ? 0 : 8);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VisitorPkPanelWidget", "curBattle is null", null);
        }
        this.A.a();
    }

    public final android.view.View y() {
        android.view.View view = this.f445111i;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    public void z() {
        this.A.a();
    }
}
