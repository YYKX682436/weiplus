package mi2;

/* loaded from: classes10.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.view.View P;
    public android.view.ViewGroup Q;
    public y.f2 R;
    public int S;
    public int T;
    public long U;
    public boolean V;
    public android.view.View W;
    public android.view.View X;
    public android.view.View Y;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 Z;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f408286h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f408287i;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.ArrayList f408288l1;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f408289m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f408290n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f408291o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f408292p;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f408293p0;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f408294p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f408295q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f408296r;

    /* renamed from: s, reason: collision with root package name */
    public long f408297s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f408298t;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f408299x0;

    /* renamed from: y0, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f408300y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, zh2.c pluginAbility, yz5.p dismiss) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismiss, "dismiss");
        this.f408286h = pluginAbility;
        this.f408287i = dismiss;
        this.f408289m = z();
        boolean z17 = true;
        this.f408298t = true;
        this.T = 1;
        this.f408288l1 = new java.util.ArrayList();
        this.f408294p1 = jz5.h.b(new y.i2(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f199917g.f526370d.getLayoutParams();
        if (layoutParams != null) {
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                z17 = false;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                i18 = i18 >= i17 ? i18 : i17;
            }
            layoutParams.height = i18 / 2;
        }
        this.f199917g.f526370d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0m);
    }

    public void F() {
        android.view.ViewPropertyAnimator animate;
        r45.il4 il4Var = ((mm2.o4) this.f408286h.g().a(mm2.o4.class)).U;
        long j17 = il4Var != null ? il4Var.f458662d : 0L;
        w();
        W(j17);
        V(j17);
        this.f408298t = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = this.L;
        if (c14327xf6cdefc6 != null) {
            android.view.ViewPropertyAnimator animate2 = c14327xf6cdefc6.animate();
            if (animate2 != null) {
                animate2.cancel();
            }
            android.view.View view = this.M;
            if (view != null && (animate = view.animate()) != null) {
                animate.cancel();
            }
            X(false);
            c14327xf6cdefc6.setVisibility(8);
            c14327xf6cdefc6.setTranslationX(0.0f);
            L();
        }
        this.f408297s = j17;
    }

    public final void L() {
        android.view.View view = this.M;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        android.view.ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f408293p0 = null;
        this.f408300y0 = null;
        this.f408288l1.clear();
        this.R = null;
        this.V = false;
    }

    public void M() {
        android.view.View view;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = this.L;
        if (c14327xf6cdefc6 == null || (view = this.M) == null || c14327xf6cdefc6.getVisibility() != 0) {
            return;
        }
        float width = c14327xf6cdefc6.getWidth();
        X(true);
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationX = animate.translationX(width)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new y.h2(this, c14327xf6cdefc6))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void N() {
        y.f2 f2Var = this.R;
        int i17 = f2Var == null ? -1 : y.g2.f539887a[f2Var.ordinal()];
        zh2.c cVar = this.f408286h;
        if (i17 == 1) {
            int i18 = this.S;
            long j17 = i18;
            if (((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d != j17) {
                ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d = j17;
            }
            cVar.e(i18);
            dk2.xf k17 = cVar.k();
            if (k17 != null) {
                ((dk2.r4) k17).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f410516m, j17, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458664f, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458665g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458666h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458667i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458668m, new mi2.g(this));
                return;
            }
            return;
        }
        if (i17 == 2 && this.V) {
            int i19 = (int) this.U;
            cVar.e(i19);
            pm0.v.X(new mi2.e(this, i19));
            dk2.xf k18 = cVar.k();
            if (k18 != null) {
                ((dk2.r4) k18).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f410516m, i19, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458664f, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458665g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458666h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458667i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458668m, new mi2.f(this));
            }
        }
    }

    public void O() {
        N();
    }

    public long P() {
        return ((mm2.o4) this.f408286h.g().a(mm2.o4.class)).U.f458662d;
    }

    public void Q(int i17) {
    }

    public void R(long j17) {
    }

    public void S() {
        N();
        M();
    }

    public void T(y.f2 type) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = this.L;
        android.content.Context context = this.f199914d;
        if (c14327xf6cdefc6 == null) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
            wd2.g gVar = this.f199917g;
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571192gb, (android.view.ViewGroup) gVar.f526372f, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc62 = inflate instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6) inflate : null;
            if (c14327xf6cdefc62 != null) {
                this.L = c14327xf6cdefc62;
                this.M = c14327xf6cdefc62.findViewById(com.p314xaae8f345.mm.R.id.a4v);
                android.widget.TextView textView = (android.widget.TextView) c14327xf6cdefc62.findViewById(com.p314xaae8f345.mm.R.id.a4y);
                this.N = textView;
                if (textView != null) {
                    com.p314xaae8f345.mm.ui.fk.b(textView);
                }
                this.P = c14327xf6cdefc62.findViewById(com.p314xaae8f345.mm.R.id.f569333zs);
                this.Q = (android.view.ViewGroup) c14327xf6cdefc62.findViewById(com.p314xaae8f345.mm.R.id.f569334zu);
                android.view.View view2 = this.P;
                if (view2 != null) {
                    view2.setOnClickListener(new y.j2(this));
                }
                gVar.f526372f.addView(c14327xf6cdefc62, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc63 = this.L;
        if (c14327xf6cdefc63 == null || (view = this.M) == null || (viewGroup = this.Q) == null) {
            return;
        }
        this.R = type;
        android.widget.TextView textView2 = this.N;
        if (textView2 != null) {
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvv);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dut);
            }
            textView2.setText(string);
        }
        viewGroup.removeAllViews();
        long P = P();
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571189fa, viewGroup, false);
            viewGroup.addView(inflate2);
            this.W = inflate2;
            this.X = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564517tk);
            this.Y = inflate2.findViewById(com.p314xaae8f345.mm.R.id.a99);
            this.Z = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564307nm);
            this.f408293p0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate2.findViewById(com.p314xaae8f345.mm.R.id.a98);
            int i17 = (int) P;
            this.S = i17;
            this.T = pm0.v.z(i17, 16) ? 2 : 1;
            U();
            android.view.View view3 = this.X;
            if (view3 != null) {
                view3.setOnClickListener(new y.p2(this));
            }
            android.view.View view4 = this.Y;
            if (view4 != null) {
                view4.setOnClickListener(new y.q2(this));
            }
        } else if (ordinal2 == 1) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571190g9, viewGroup, false);
            viewGroup.addView(inflate3);
            this.f408299x0 = inflate3;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate3.findViewById(com.p314xaae8f345.mm.R.id.f_m);
            this.f408300y0 = c1163xf1deaba4;
            jz5.g gVar2 = this.f408294p1;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7960x6cab2c8d((y.c2) ((jz5.n) gVar2).mo141623x754a37bb());
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f408300y0;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
            }
            this.U = P;
            this.V = false;
            zh2.c cVar = this.f408286h;
            long j17 = ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458663e;
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i18 = (int) j17;
            boolean z17 = !pm0.v.z(i18, 4);
            r45.eq1 eq1Var = ((mm2.n2) cVar.g().a(mm2.n2.class)).f410812g;
            boolean z18 = eq1Var != null && eq1Var.m75933x41a8a7f2(10);
            boolean z19 = !pm0.v.z(i18, 16);
            int i19 = (z19 && z18) ? 1 : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408289m, "prepareConditionData isSuperFansClub:" + z18 + " superFansFlag:" + z19 + " buyProductSwitchEnable:" + z17);
            java.lang.String a17 = ei2.f.a(P);
            java.util.ArrayList arrayList = this.f408288l1;
            arrayList.clear();
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            y.d2 d2Var = new y.d2(string2, false, 2, null);
            d2Var.f539862b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var.f539861a, a17);
            arrayList.add(d2Var);
            java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            y.d2 d2Var2 = new y.d2(string3, false, 2, null);
            d2Var2.f539862b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var2.f539861a, a17);
            arrayList.add(d2Var2);
            java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dur);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            y.d2 d2Var3 = new y.d2(string4, false, 2, null);
            d2Var3.f539862b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var3.f539861a, a17);
            arrayList.add(d2Var3);
            if (z17) {
                java.lang.String string5 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dup);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                y.d2 d2Var4 = new y.d2(string5, false, 2, null);
                d2Var4.f539862b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var4.f539861a, a17);
                arrayList.add(d2Var4);
            }
            if (i19 != 0) {
                java.lang.String string6 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                y.d2 d2Var5 = new y.d2(string6, false, 2, null);
                d2Var5.f539862b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d2Var5.f539861a, a17);
                arrayList.add(d2Var5);
            }
            ((y.c2) ((jz5.n) gVar2).mo141623x754a37bb()).m8146xced61ae5();
        }
        c14327xf6cdefc63.setVisibility(0);
        c14327xf6cdefc63.setTranslationX(0.0f);
        y.o2 o2Var = new y.o2(view, c14327xf6cdefc63, this);
        if (c14327xf6cdefc63.getWidth() != 0) {
            o2Var.mo152xb9724478();
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = c14327xf6cdefc63.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new y.m2(c14327xf6cdefc63, o2Var));
        }
    }

    public final void U() {
        if (this.T == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f408293p0;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.Z;
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f408293p0;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.Z;
        if (c22699x3dcdb3524 == null) {
            return;
        }
        c22699x3dcdb3524.setVisibility(0);
    }

    public final void V(long j17) {
        android.widget.TextView textView = this.f408296r;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micWayText");
            throw null;
        }
        boolean z17 = pm0.v.z((int) j17, 16);
        android.content.Context context = this.f199914d;
        textView.setText(z17 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duk) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dui));
    }

    public final void W(long j17) {
        zl2.r4 r4Var = zl2.r4.f555483a;
        boolean x27 = r4Var.x2(j17);
        android.content.Context context = this.f199914d;
        if (x27) {
            android.widget.TextView textView = this.f408295q;
            if (textView != null) {
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dur));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.y2(j17)) {
            android.widget.TextView textView2 = this.f408295q;
            if (textView2 != null) {
                textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duu));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.w2(j17)) {
            android.widget.TextView textView3 = this.f408295q;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dup));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.z2(j17)) {
            android.widget.TextView textView4 = this.f408295q;
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz6));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micConditionText");
                throw null;
            }
        }
        android.widget.TextView textView5 = this.f408295q;
        if (textView5 != null) {
            textView5.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duo));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micConditionText");
            throw null;
        }
    }

    public final void X(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = this.L;
        if (c14327xf6cdefc6 == null) {
            return;
        }
        c14327xf6cdefc6.m57357x5755edc5(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571191ga;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.View view2 = this.f408291o;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveAnchorLinkWayLayout");
            throw null;
        }
        int id6 = view2.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            this.f408298t = false;
            T(y.f2.f539878d);
        } else {
            android.view.View view3 = this.f408292p;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveAnchorLinkConditionLayout");
                throw null;
            }
            int id7 = view3.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                this.f408298t = false;
                fj2.s.c(fj2.s.f344716a, ml2.q2.f409376z, null, null, 0, 0, 30, null);
                T(y.f2.f539879e);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f408290n = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566081el5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f408291o = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566072ek0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f408292p = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jiv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f408295q = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.jjq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f408296r = (android.widget.TextView) findViewById4;
        android.view.View view = this.f408291o;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveAnchorLinkWayLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f408292p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveAnchorLinkConditionLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f569332zr);
        if (textView != null) {
            textView.setText(o());
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.b(textView);
        }
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569330zp);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new y.k2(this));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.f569331zq);
        android.view.View view3 = this.f199916f;
        if (view3 != null) {
            android.view.ViewParent parent = view3.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view3);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388629);
            if (viewGroup != null) {
                viewGroup.addView(view3, layoutParams);
            }
            view3.setOnClickListener(new y.l2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
        O();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        this.f408287i.mo149xb9724478(java.lang.Boolean.valueOf(this.f408298t), java.lang.Boolean.valueOf(this.f408297s != ((mm2.o4) this.f408286h.g().a(mm2.o4.class)).U.f458662d));
    }

    public java.lang.String z() {
        return "FinderLiveMicMoreActionWidget";
    }
}
