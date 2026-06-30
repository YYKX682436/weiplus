package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class c1 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.ui.tools.c5 {
    public static final com.tencent.mm.plugin.finder.activity.uic.i0 N = new com.tencent.mm.plugin.finder.activity.uic.i0(null);
    public static final jz5.g P = jz5.h.b(com.tencent.mm.plugin.finder.activity.uic.h0.f101877d);
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public int F;
    public java.lang.String G;
    public java.lang.String H;
    public com.tencent.mm.ui.tools.f5 I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f101841J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f101842d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f101843e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f101844f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f101845g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f101846h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f101847i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f101848m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f101849n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f101850o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f101851p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f101852q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.CheckBox f101853r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f101854s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f101855t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f101856u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f101857v;

    /* renamed from: w, reason: collision with root package name */
    public long f101858w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f101859x;

    /* renamed from: y, reason: collision with root package name */
    public int f101860y;

    /* renamed from: z, reason: collision with root package name */
    public int f101861z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101859x = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.G = "";
        this.H = "";
        this.f101841J = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.y0(this));
        this.K = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.z0(this));
        this.L = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.n0(this));
        this.M = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.o0(this));
    }

    public static final void O6(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var, boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101844f;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        int paddingBottom = mMEditText.getPaddingBottom();
        if (z17 && paddingBottom == c1Var.F) {
            com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "animateDesc isBig:" + paddingBottom + " paddingBottom:" + paddingBottom + " return");
            return;
        }
        if (!z17 && paddingBottom == c1Var.E) {
            com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "animateDesc isBig:" + paddingBottom + " paddingBottom:" + paddingBottom + " return");
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        int paddingStart = mMEditText2.getPaddingStart();
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = c1Var.f101844f;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        int paddingTop = mMEditText3.getPaddingTop();
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = c1Var.f101844f;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        int paddingEnd = mMEditText4.getPaddingEnd();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(paddingBottom, z17 ? c1Var.F : c1Var.E);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.activity.uic.j0(c1Var, paddingStart, paddingTop, paddingEnd));
        ofInt.start();
    }

    public static final void P6(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = ((com.tencent.mm.plugin.finder.activity.uic.h1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.h1.class)).f101878d;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        u3Var.dismiss();
    }

    public static final void Q6(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var, int i17, int i18) {
        android.widget.CheckBox checkBox = c1Var.f101853r;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        if (checkBox.isChecked()) {
            boolean z17 = false;
            if (1 <= i17 && i17 < 11) {
                if (1 <= i18 && i18 <= com.tencent.mm.plugin.finder.activity.uic.i0.a(N)) {
                    z17 = true;
                }
                if (z17) {
                    android.widget.Button button = c1Var.f101848m;
                    if (button == null) {
                        kotlin.jvm.internal.o.o("postBtn");
                        throw null;
                    }
                    button.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
                    android.widget.Button button2 = c1Var.f101848m;
                    if (button2 != null) {
                        button2.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478763gj));
                        return;
                    } else {
                        kotlin.jvm.internal.o.o("postBtn");
                        throw null;
                    }
                }
            }
        }
        android.widget.Button button3 = c1Var.f101848m;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("postBtn");
            throw null;
        }
        button3.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
        android.widget.Button button4 = c1Var.f101848m;
        if (button4 != null) {
            button4.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478760gg));
        } else {
            kotlin.jvm.internal.o.o("postBtn");
            throw null;
        }
    }

    public final void R6(fp0.d dVar) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        java.lang.String obj = mMEditText.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        java.lang.String obj2 = mMEditText2.getText().toString();
        this.G = dVar instanceof mv2.i0 ? ((mv2.i0) dVar).f331577g : "";
        android.widget.CheckBox checkBox = this.f101853r;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        checkBox.setEnabled(false);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.m((cq.k) c17, this.B, obj, obj2, this.G, this.f101858w, 0, new com.tencent.mm.plugin.finder.activity.uic.l0(this), new com.tencent.mm.plugin.finder.activity.uic.m0(this), 32, null);
    }

    public final void S6(boolean z17) {
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.ci_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.cj6, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string2, getResources().getColor(com.tencent.mm.R.color.f479263uf), getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.activity.uic.a1(this)), string2.length() - string.length(), string2.length(), 17);
        if (z17) {
            android.widget.TextView textView = this.f101852q;
            if (textView != null) {
                textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            }
        } else {
            android.widget.TextView textView2 = this.f101852q;
            if (textView2 != null) {
                textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
        }
        if (z17) {
            android.widget.CheckBox checkBox = this.f101853r;
            if (checkBox == null) {
                kotlin.jvm.internal.o.o("announceCheckBox");
                throw null;
            }
            checkBox.setBackgroundResource(com.tencent.mm.R.drawable.aoh);
        } else {
            android.widget.CheckBox checkBox2 = this.f101853r;
            if (checkBox2 == null) {
                kotlin.jvm.internal.o.o("announceCheckBox");
                throw null;
            }
            checkBox2.setBackgroundResource(com.tencent.mm.R.drawable.aoe);
        }
        android.widget.TextView textView3 = this.f101852q;
        if (textView3 != null) {
            textView3.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
        }
        android.widget.TextView textView4 = this.f101852q;
        if (textView4 == null) {
            return;
        }
        textView4.setText(spannableString);
    }

    public final void T6(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText.setTextColor(i17);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText2.setTextColor(i17);
        android.widget.TextView textView = this.f101842d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleText");
            throw null;
        }
        textView.setTextColor(i17);
        android.widget.TextView textView2 = this.f101855t;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        textView2.setTextColor(i17);
        android.widget.TextView textView3 = this.f101849n;
        if (textView3 != null) {
            textView3.setTextColor(i17);
        } else {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
    }

    public final void U6(boolean z17, int i17) {
        jz5.g gVar = this.L;
        if (!z17) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC", "showErrorTips", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar2 = this.M;
        if (i17 == -4066) {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(com.tencent.mm.R.string.cie);
        } else if (i17 != -4055) {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(com.tencent.mm.R.string.cig);
        } else {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(com.tencent.mm.R.string.cif);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String valueOf;
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.e9b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f101847i = (android.widget.ScrollView) findViewById;
        java.lang.String stringExtra = getIntent().getStringExtra("key_nick_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_user_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.B = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_activity_name");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.C = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_activity_desc");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.D = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("key_activity_local_cover_url");
        this.H = stringExtra5 != null ? stringExtra5 : "";
        getIntent().getIntExtra("key_activity_type", 101);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.E = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.F = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479720dd);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.lang.String str = this.A;
        ((ke0.e) xVar).getClass();
        java.lang.String spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(activity, str).toString();
        kotlin.jvm.internal.o.f(spannableString, "toString(...)");
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.f484430e95);
        ((android.widget.TextView) findViewById2).setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.q0(this));
        kotlin.jvm.internal.o.f(findViewById2, "apply(...)");
        this.f101855t = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.e9c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f101842d = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        android.view.View findViewById4 = activity2.findViewById(com.tencent.mm.R.id.e98);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f101843e = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        if (!android.text.TextUtils.isEmpty(this.C)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f101843e;
            if (mMEditText == null) {
                kotlin.jvm.internal.o.o("nameEdit");
                throw null;
            }
            mMEditText.setText(this.C);
        }
        android.view.View findViewById5 = activity2.findViewById(com.tencent.mm.R.id.e96);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f101844f = (com.tencent.mm.ui.widget.MMEditText) findViewById5;
        if (!android.text.TextUtils.isEmpty(this.D)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f101844f;
            if (mMEditText2 == null) {
                kotlin.jvm.internal.o.o("descEdit");
                throw null;
            }
            mMEditText2.setText(this.D);
        }
        android.view.View findViewById6 = activity2.findViewById(com.tencent.mm.R.id.f482597iw);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f101845g = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = activity2.findViewById(com.tencent.mm.R.id.f482592ip);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f101846h = (android.widget.ImageView) findViewById7;
        android.widget.TextView textView2 = this.f101845g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("nickNameText");
            throw null;
        }
        textView2.setText(spannableString);
        java.lang.String stringExtra6 = getIntent().getStringExtra("key_avatar_url");
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(stringExtra6, null, 2, null);
        android.widget.ImageView imageView = this.f101846h;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("avatarImage");
            throw null;
        }
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nameEdit size ");
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f101843e;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        sb6.append(mMEditText3.getTextSize());
        sb6.append("  descEdit size ");
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f101844f;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        sb6.append(mMEditText4.getTextSize());
        com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", sb6.toString());
        com.tencent.mm.plugin.finder.activity.uic.p0 p0Var = new com.tencent.mm.plugin.finder.activity.uic.p0(this);
        com.tencent.mm.ui.widget.MMEditText mMEditText5 = this.f101843e;
        if (mMEditText5 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText5.setOnTouchListener(p0Var);
        com.tencent.mm.ui.widget.MMEditText mMEditText6 = this.f101844f;
        if (mMEditText6 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText6.setOnTouchListener(p0Var);
        android.view.View findViewById8 = getActivity().findViewById(com.tencent.mm.R.id.f482613jc);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f101850o = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = getActivity().findViewById(com.tencent.mm.R.id.f482567hz);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f101851p = (android.widget.RelativeLayout) findViewById9;
        android.view.View findViewById10 = getActivity().findViewById(com.tencent.mm.R.id.f484429e94);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById10;
        this.f101848m = button;
        button.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.r0(this));
        this.f101852q = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f482568i0);
        android.view.View findViewById11 = getActivity().findViewById(com.tencent.mm.R.id.f482569i1);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f101853r = (android.widget.CheckBox) findViewById11;
        android.view.View findViewById12 = getActivity().findViewById(com.tencent.mm.R.id.f482570i2);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f101854s = (android.view.ViewGroup) findViewById12;
        android.widget.CheckBox checkBox = this.f101853r;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        checkBox.setChecked(((java.lang.Boolean) m17).booleanValue());
        android.view.ViewGroup viewGroup = this.f101854s;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("announceCheckBoxContainer");
            throw null;
        }
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.s0(this));
        android.widget.CheckBox checkBox2 = this.f101853r;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        checkBox2.setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.activity.uic.t0(this));
        S6(false);
        com.tencent.mm.ui.widget.MMEditText mMEditText7 = this.f101843e;
        if (mMEditText7 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText7.addTextChangedListener(new com.tencent.mm.plugin.finder.activity.uic.u0(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText8 = this.f101843e;
        if (mMEditText8 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(mMEditText8.getPaint(), 0.8f);
        this.f101856u = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.e99);
        this.f101857v = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.e97);
        com.tencent.mm.ui.widget.MMEditText mMEditText9 = this.f101844f;
        if (mMEditText9 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText9.addTextChangedListener(new com.tencent.mm.plugin.finder.activity.uic.v0(this));
        android.view.View findViewById13 = getActivity().findViewById(com.tencent.mm.R.id.e9i);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById13;
        this.f101849n = textView3;
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.w0(this));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        calendar.setTimeInMillis(r4Var.M0());
        calendar.set(12, 0);
        calendar.set(13, 0);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        calendar2.setTimeInMillis(r4Var.M0());
        calendar2.add(2, 1);
        calendar2.add(11, 1);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        calendar3.setTimeInMillis(r4Var.M0());
        calendar3.set(2, 11);
        calendar3.set(5, 31);
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        int i17 = calendar3.get(6);
        int i18 = calendar2.get(6) - calendar.get(6);
        if (i18 < 0) {
            i18 += i17;
        }
        this.f101860y = i18;
        com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "selectedDateIndex :" + this.f101860y + " yearCount:" + i17);
        int i19 = calendar2.get(11);
        this.f101861z = i19;
        if (i19 > 23) {
            this.f101861z = 23;
        }
        com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "initSelectTime time:" + calendar2.getTime() + ",timeInMills:" + calendar2.getTimeInMillis());
        this.f101858w = calendar2.getTimeInMillis() / ((long) 1000);
        int i27 = calendar2.get(7);
        int i28 = i27 + (-2) >= 0 ? i27 - 1 : 7;
        int i29 = calendar2.get(5);
        java.lang.String str2 = getContext().getResources().getString(com.tencent.mm.R.string.e0g, java.lang.Integer.valueOf(calendar2.get(2) + 1), java.lang.Integer.valueOf(i29)) + ' ' + com.tencent.mm.plugin.finder.assist.w2.q(getContext(), i28, ya.b.CAMPAIGN);
        int i37 = calendar2.get(11);
        if (i37 < 10) {
            valueOf = "0" + i37;
        } else {
            valueOf = java.lang.String.valueOf(i37);
        }
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.cmx, valueOf);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str3 = str2 + ' ' + string;
        this.f101859x = str3;
        android.widget.TextView textView4 = this.f101849n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
        textView4.setText(str3);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(getActivity());
        this.I = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.I;
        if (f5Var != null) {
            f5Var.d();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.widget.Button button = this.f101848m;
        if (button != null) {
            button.post(new com.tencent.mm.plugin.finder.activity.uic.x0(this));
        } else {
            kotlin.jvm.internal.o.o("postBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        int intValue = ((java.lang.Number) ((jz5.n) this.K).getValue()).intValue() - i17;
        jz5.g gVar = this.f101841J;
        if (intValue < ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) {
            intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        }
        android.widget.LinearLayout linearLayout = this.f101850o;
        if (linearLayout != null) {
            linearLayout.setMinimumHeight(intValue);
        } else {
            kotlin.jvm.internal.o.o("profileLayout");
            throw null;
        }
    }
}
