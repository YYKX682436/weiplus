package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public class v extends com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a {
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1 A;
    public int B;
    public yz5.l C;
    public boolean D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public android.widget.LinearLayout H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f219862J;
    public final jz5.g K;
    public final jz5.g L;
    public final jz5.g M;
    public final jz5.g N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public boolean T;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f219863v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f219864w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f219865x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 f219866y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f219867z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(context);
        android.view.ViewGroup.LayoutParams layoutParams;
        z50.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1.f219838e;
        this.B = 1;
        this.C = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.h.f219807d;
        this.I = true;
        this.f219862J = true;
        this.K = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.m(this));
        this.L = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.o(this));
        this.M = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n(this));
        this.N = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.s(this));
        this.P = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.r(this));
        this.Q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.p(this));
        this.R = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.q(this));
        this.S = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u(this));
        this.T = true;
        setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0(context);
        this.f219866y = a0Var;
        org.json.JSONObject wi6 = ((iv4.e) ((su4.s0) i95.n0.c(su4.s0.class))).wi();
        this.I = wi6.optLong("hideAiSearch", 0L) == 0;
        this.f219862J = wi6.optLong("hideYuanbaoAd", 0L) == 0;
        if (getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) context2).mo78514x143f1b92();
            a0Var.f219776b.f550935h = i65.a.c(getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.b(getContext(), true));
            android.view.View r17 = mo78514x143f1b92.r(com.p314xaae8f345.mm.R.id.u8r);
            this.f219863v = r17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r17 : null;
            android.view.View r18 = mo78514x143f1b92.r(com.p314xaae8f345.mm.R.id.f564331sc4);
            this.f219864w = r18 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r18 : null;
            if (a0Var.f219776b.e7()) {
                g23.h hVar = a0Var.f219776b.f550931d.f497228g;
                if (hVar.f349455f) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) hVar.f349453d;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        dVar = z50.e.f551696a;
                        if (i17 >= size) {
                            break;
                        }
                        g23.g gVar = (g23.g) arrayList.get(i17);
                        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dy9, this.f219863v, false);
                        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.tyk);
                        checkBox.setText(gVar.f349448b);
                        z50.h hVar2 = z50.i.f551699a;
                        if (hVar2.c()) {
                            checkBox.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb) * hVar2.b());
                        }
                        checkBox.setChecked(gVar.f349449c);
                        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.l(this, checkBox, gVar));
                        java.lang.String str = gVar.f349447a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "globalSearchAskRealPeople")) {
                            dVar.b(vu4.a.f521772f, vu4.b.f521794h, this.f219866y.f219776b.a7(), this.f219866y.f219776b.f550934g);
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "globalSearchDeepThink")) {
                            dVar.b(vu4.a.f521772f, vu4.b.f521793g, this.f219866y.f219776b.a7(), this.f219866y.f219776b.f550934g);
                        }
                        android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.leftMargin = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                        inflate.setLayoutParams(marginLayoutParams);
                        android.view.ViewGroup viewGroup = this.f219863v;
                        if (viewGroup != null) {
                            viewGroup.addView(inflate);
                        }
                        this.f219865x = true;
                        i17++;
                    }
                    if (this.f219865x) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dy_, this.f219863v, false);
                        android.view.ViewGroup.LayoutParams layoutParams3 = inflate2.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.leftMargin = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
                        inflate2.setLayoutParams(marginLayoutParams2);
                        android.view.ViewGroup viewGroup2 = this.f219863v;
                        if (viewGroup2 != null) {
                            viewGroup2.addView(inflate2);
                        }
                        this.f219865x = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var2 = this.f219866y;
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) a0Var2.f219776b.f550931d.f497228g.f349454e;
                    int size2 = arrayList2.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        g23.f fVar = (g23.f) arrayList2.get(i18);
                        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dya, this.f219863v, false);
                        android.widget.ImageView imageView = (android.widget.ImageView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.tyl);
                        java.lang.String str2 = fVar.f349443c;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "camera_regular")) {
                            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78739x813c9482);
                        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "plus_circle_regular")) {
                            break;
                        } else {
                            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80870xfc086c72);
                        }
                        java.lang.String str3 = fVar.f349442b;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "add")) {
                            dVar.b(vu4.a.f521772f, vu4.b.f521799p, a0Var2.f219776b.a7(), a0Var2.f219776b.f550934g);
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "photo")) {
                            dVar.b(vu4.a.f521772f, vu4.b.f521795i, a0Var2.f219776b.a7(), a0Var2.f219776b.f550934g);
                        }
                        inflate3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.k(this, fVar));
                        inflate3.setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cx8));
                        android.view.ViewGroup.LayoutParams layoutParams4 = inflate3.getLayoutParams();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.leftMargin = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
                        inflate3.setLayoutParams(marginLayoutParams3);
                        android.view.ViewGroup viewGroup3 = this.f219863v;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(inflate3);
                        }
                        this.f219865x = true;
                    }
                }
                t50.e eVar = this.f219866y.f219776b.f550931d;
                if (eVar.f497229h.f349431b || eVar.f497230i.f349429f) {
                    android.view.View inflate4 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ef6, this.f219863v, false);
                    t50.e eVar2 = this.f219866y.f219776b.f550931d;
                    g23.c cVar = eVar2.f497230i;
                    g23.d dVar2 = eVar2.f497229h;
                    this.H = (android.widget.LinearLayout) inflate4.findViewById(com.p314xaae8f345.mm.R.id.f564332sc5);
                    this.E = inflate4.findViewById(com.p314xaae8f345.mm.R.id.vpv);
                    android.widget.TextView textView = (android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.vpw);
                    this.G = inflate4.findViewById(com.p314xaae8f345.mm.R.id.d0v);
                    this.F = inflate4.findViewById(com.p314xaae8f345.mm.R.id.f564329sc2);
                    textView.setText(dVar2.f349430a);
                    android.view.View view = this.E;
                    if (view != null) {
                        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.i(this));
                    }
                    android.view.View view2 = this.F;
                    if (view2 != null) {
                        view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j(this, cVar));
                    }
                    z50.h hVar3 = z50.i.f551699a;
                    if (hVar3.c() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                        android.view.View view3 = this.G;
                        if (view3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "adaptBigFontForYB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "adaptBigFontForYB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.widget.LinearLayout linearLayout = this.H;
                        if (linearLayout != null) {
                            linearLayout.setOrientation(1);
                        }
                        float b17 = hVar3.b();
                        android.view.View view4 = this.E;
                        android.widget.ImageView imageView2 = view4 != null ? (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.f565894ta3) : null;
                        if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
                            int i19 = (int) (18 * b17);
                            layoutParams.width = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i19);
                            layoutParams.height = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i19);
                        }
                        android.view.View view5 = this.F;
                        android.widget.TextView textView2 = view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.f564329sc2) : null;
                        if (textView2 != null) {
                            textView2.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb) * b17);
                        }
                        android.view.ViewGroup.LayoutParams layoutParams5 = textView2 != null ? textView2.getLayoutParams() : null;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                        android.view.View view6 = this.E;
                        android.widget.TextView textView3 = view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.vpw) : null;
                        if (textView3 != null) {
                            textView3.setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb) * b17);
                        }
                    }
                    android.view.ViewGroup viewGroup4 = this.f219864w;
                    if (viewGroup4 != null) {
                        viewGroup4.addView(inflate4);
                    }
                    w();
                } else {
                    eVar.f497227f.getClass();
                }
            }
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mec);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText editText = this.f291495e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(editText, "editText");
        editText.setTextSize(0, i65.a.a(editText.getContext(), 17.0f) * i65.a.m(editText.getContext()));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mdg);
        if (button != null) {
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b(this));
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.v1h);
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.c(this));
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(actionBarEditText);
        actionBarEditText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.g(this));
        actionBarEditText.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.d(this));
        actionBarEditText.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.e(this));
        if (m63643x5d4398e6()) {
            c(java.lang.Boolean.FALSE);
        }
        p(((java.lang.Boolean) ((jz5.n) this.K).mo141623x754a37bb()).booleanValue(), true);
        m63646x2ced40ad().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f(this));
        if (((java.lang.Boolean) ((jz5.n) this.L).mo141623x754a37bb()).booleanValue()) {
            return;
        }
        android.view.View m63646x2ced40ad = m63646x2ced40ad();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(m63646x2ced40ad, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m63646x2ced40ad.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(m63646x2ced40ad, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPullUpKeyboardWhenStartup */
    public final boolean m63643x5d4398e6() {
        k23.x0 x0Var = k23.c1.f385069h;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return ((java.lang.Boolean) ((jz5.n) x0Var.a(context).f385071d.f385064d).mo141623x754a37bb()).booleanValue();
    }

    /* renamed from: getSearchBarContainer */
    private final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m63644x7bffb56c() {
        return (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) this.Q).mo141623x754a37bb();
    }

    /* renamed from: getSearchEditTextContainer */
    private final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m63645xbcfd52ec() {
        return (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) ((jz5.n) this.R).mo141623x754a37bb();
    }

    /* renamed from: getSettingOptionBtn */
    private final android.view.View m63646x2ced40ad() {
        return (android.view.View) ((jz5.n) this.P).mo141623x754a37bb();
    }

    /* renamed from: getTitleTv */
    private final android.view.View m63647xefe232c4() {
        return (android.view.View) ((jz5.n) this.N).mo141623x754a37bb();
    }

    /* renamed from: getVoiceV3Btn */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f m63648x9358e083() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) ((jz5.n) this.S).mo141623x754a37bb();
    }

    public static final boolean o(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        vVar.getClass();
        k23.x0 x0Var = k23.c1.f385069h;
        android.content.Context context = vVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return ((java.lang.Boolean) ((jz5.n) x0Var.a(context).f385071d.f385063c).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    /* renamed from: getLayoutId */
    public int mo63625x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efg;
    }

    /* renamed from: getSwitchModeType */
    public final int m63649x76bd27c7() {
        return this.A.f219842d;
    }

    /* renamed from: getViewMode */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 m63650xc31e4b5e() {
        return this.f219866y;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void i(boolean z17) {
        if (m63643x5d4398e6() || this.f219867z) {
            return;
        }
        p(z17, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void j(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
        if (rVar == com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH) {
            z50.d dVar = z50.e.f551696a;
            vu4.a aVar = vu4.a.D;
            vu4.b bVar = vu4.b.D;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = this.f219866y;
            dVar.b(aVar, bVar, a0Var.f219776b.a7(), a0Var.f219776b.f550934g);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void k(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
        if (rVar == com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH) {
            z50.d dVar = z50.e.f551696a;
            vu4.a aVar = vu4.a.f521772f;
            vu4.b bVar = vu4.b.f521791e;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = this.f219866y;
            dVar.b(aVar, bVar, a0Var.f219776b.a7(), a0Var.f219776b.f550934g);
        }
    }

    public final void p(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        if (!z18) {
            android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
            autoTransition.setDuration(300L);
            autoTransition.setOrdering(0);
            android.content.Context context = getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) context : null;
            android.view.KeyEvent.Callback r17 = (activityC15607x502bbbb2 == null || (mo78514x143f1b92 = activityC15607x502bbbb2.mo78514x143f1b92()) == null) ? null : mo78514x143f1b92.r(android.R.id.content);
            android.view.ViewGroup viewGroup = r17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) r17 : null;
            if (viewGroup != null) {
                android.transition.TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
            }
        }
        if (z17) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar.d(m63644x7bffb56c());
            cVar.c(com.p314xaae8f345.mm.R.id.v1h, 1);
            cVar.f(com.p314xaae8f345.mm.R.id.v1h, 1, com.p314xaae8f345.mm.R.id.mdd, 1, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            cVar.m(com.p314xaae8f345.mm.R.id.v1h, 3, 0);
            cVar.n(com.p314xaae8f345.mm.R.id.odf, 8);
            cVar.n(com.p314xaae8f345.mm.R.id.v3m, 8);
            cVar.a(m63644x7bffb56c());
            android.view.ViewGroup viewGroup2 = this.f219863v;
            if (viewGroup2 != null) {
                com.p314xaae8f345.mm.ui.kk.e(viewGroup2, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            }
            android.view.ViewGroup viewGroup3 = this.f219863v;
            if (viewGroup3 != null) {
                viewGroup3.requestLayout();
                return;
            }
            return;
        }
        android.view.View m63647xefe232c4 = m63647xefe232c4();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m63647xefe232c4, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m63647xefe232c4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m63647xefe232c4, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View m63646x2ced40ad = m63646x2ced40ad();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m63646x2ced40ad, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m63646x2ced40ad.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m63646x2ced40ad, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "animateEditTextFocusInVoiceV3", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar2 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar2.d(m63644x7bffb56c());
        cVar2.c(com.p314xaae8f345.mm.R.id.v1h, 1);
        cVar2.f(com.p314xaae8f345.mm.R.id.v1h, 1, com.p314xaae8f345.mm.R.id.mdd, 1, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        cVar2.m(com.p314xaae8f345.mm.R.id.v1h, 3, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        cVar2.n(com.p314xaae8f345.mm.R.id.odf, 0);
        if (((java.lang.Boolean) ((jz5.n) this.L).mo141623x754a37bb()).booleanValue()) {
            cVar2.n(com.p314xaae8f345.mm.R.id.v3m, 0);
        }
        cVar2.a(m63644x7bffb56c());
        android.view.ViewGroup viewGroup4 = this.f219863v;
        if (viewGroup4 != null) {
            com.p314xaae8f345.mm.ui.kk.e(viewGroup4, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        android.view.ViewGroup viewGroup5 = this.f219863v;
        if (viewGroup5 != null) {
            viewGroup5.requestLayout();
        }
    }

    public final void q() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m63645xbcfd52ec = m63645xbcfd52ec();
        if (m63643x5d4398e6()) {
            android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
            autoTransition.setDuration(300L);
            autoTransition.setOrdering(0);
            android.transition.TransitionManager.beginDelayedTransition(m63645xbcfd52ec, autoTransition);
        } else {
            c(java.lang.Boolean.TRUE);
            p(true, true);
        }
        if (this.f219867z) {
            return;
        }
        this.f219867z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = this.f219866y;
        java.lang.String query = this.f291495e.getText().toString();
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        z13.f fVar = a0Var.f219776b;
        fVar.getClass();
        android.app.Activity m80379x76847179 = fVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) m80379x76847179).Z6(query, 0);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        actionBarEditText.setHorizontallyScrolling(false);
        actionBarEditText.setMinLines(2);
        actionBarEditText.setMaxLines(5);
        actionBarEditText.setGravity(8388659);
        actionBarEditText.setVerticalScrollBarEnabled(true);
        actionBarEditText.setHint(actionBarEditText.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4p));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(m63645xbcfd52ec);
        cVar.n(com.p314xaae8f345.mm.R.id.mdg, 0);
        cVar.n(com.p314xaae8f345.mm.R.id.mec, 8);
        cVar.c(com.p314xaae8f345.mm.R.id.mdg, 3);
        cVar.e(com.p314xaae8f345.mm.R.id.mdg, 4, com.p314xaae8f345.mm.R.id.v1h, 4);
        int selectionStart = this.f291495e.getSelectionStart();
        int selectionEnd = this.f291495e.getSelectionEnd();
        this.f291495e.setScrollX(0);
        this.f291495e.setSelection(selectionStart, selectionEnd);
        cVar.f(com.p314xaae8f345.mm.R.id.d98, 1, 0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        cVar.f(com.p314xaae8f345.mm.R.id.p7j, 1, 0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        if (!v()) {
            android.text.Editable text = this.f291495e.getText();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
            if (text.length() == 0) {
                z(cVar);
            }
        }
        m63645xbcfd52ec.getLayoutParams().height = r();
        cVar.b(m63645xbcfd52ec);
        m63645xbcfd52ec.m7179xd020a803(null);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        android.view.View r17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) context).mo78514x143f1b92().r(com.p314xaae8f345.mm.R.id.u8s);
        if (r17 != null) {
            android.transition.AutoTransition autoTransition2 = new android.transition.AutoTransition();
            autoTransition2.setDuration(300L);
            autoTransition2.setOrdering(0);
            autoTransition2.excludeTarget(com.p314xaae8f345.mm.R.id.f564331sc4, true);
            android.transition.TransitionManager.beginDelayedTransition((android.view.ViewGroup) r17, autoTransition2);
        }
    }

    public final int r() {
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int dimensionPixelSize2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        int dimensionPixelSize3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561193bx);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dimensionPixelSize + dimensionPixelSize2 + this.f291495e.getHeight());
        if (!(valueOf.intValue() > dimensionPixelSize3)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : dimensionPixelSize3;
    }

    public final void s() {
        m63648x9358e083().setVisibility(8);
    }

    /* renamed from: setCursorVisible */
    public final void m63651x26e44afa(boolean z17) {
        this.f291495e.setCursorVisible(z17);
    }

    /* renamed from: setLargeModeSwitchType */
    public final void m63652x82c606ea(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1 largeModeSwitchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(largeModeSwitchType, "largeModeSwitchType");
        this.A = largeModeSwitchType;
    }

    public final void t() {
        android.view.ViewGroup viewGroup = this.f219864w;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            android.view.View view = this.E;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.G;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.F;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "hideYuanbaoNAiSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean u() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return ((z13.f) a17).e7();
    }

    public final boolean v() {
        k23.x0 x0Var = k23.c1.f385069h;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return x0Var.a(context).W6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if ((r5.getVisibility() == 8) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v.w():void");
    }

    public final void x() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSMainUI");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) context;
        android.view.View r17 = activityC15607x502bbbb2.mo78514x143f1b92().r(com.p314xaae8f345.mm.R.id.u8s);
        if (r17 == null || r17.getVisibility() != 8) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(r17, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "showControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView", "showControlBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View r18 = activityC15607x502bbbb2.mo78514x143f1b92().r(com.p314xaae8f345.mm.R.id.u8q);
        if (r18 != null) {
            r18.requestLayout();
        }
    }

    public final void y() {
        if (!u() || this.D) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f219864w;
        boolean z17 = false;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            w();
        }
    }

    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.c z(p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar) {
        cVar.c(com.p314xaae8f345.mm.R.id.nhn, 3);
        cVar.e(com.p314xaae8f345.mm.R.id.nhn, 2, com.p314xaae8f345.mm.R.id.mdg, 1);
        cVar.f(com.p314xaae8f345.mm.R.id.nhn, 4, com.p314xaae8f345.mm.R.id.v1h, 4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca));
        return cVar;
    }
}
