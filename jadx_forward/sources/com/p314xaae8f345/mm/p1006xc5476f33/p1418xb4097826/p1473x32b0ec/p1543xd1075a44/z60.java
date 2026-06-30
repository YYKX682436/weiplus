package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z60 extends android.widget.LinearLayout implements yf2.r {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f202065u = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f202066d;

    /* renamed from: e, reason: collision with root package name */
    public android.animation.ValueAnimator f202067e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f202068f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f202069g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f202070h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f202071i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f202072m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 f202073n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f202074o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w50 f202075p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f202076q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f202077r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f202078s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f202079t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(android.content.Context context, java.lang.ref.WeakReference controllerRef) {
        super(context, null, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controllerRef, "controllerRef");
        boolean z17 = false;
        this.f202066d = controllerRef;
        this.f202068f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w50 w50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w50(context);
        this.f202075p = w50Var;
        this.f202076q = "video";
        this.f202077r = kz5.p0.f395529d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m09);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50("video", string, w50Var.c(m58200x143f1b92()));
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.otv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = w50Var.f201679a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.onn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50("co_live", string2, kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("co_live_normal", string3, null, null, null, 28, null)));
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50("chat_room", string4, w50Var.a());
        java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50("karaoke", string5, w50Var.b());
        java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m08);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        this.f202078s = kz5.c0.i(y50Var, y50Var2, y50Var3, y50Var4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50("game", string6, kz5.b0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50("game_widget", "选择游戏", null, null, null, 28, null))));
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eej, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568736vc1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f202071i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f202072m = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568735vc0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f202074o = findViewById3;
        int color = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: BG_2 color resource ID = 2131099660");
        java.lang.String format = java.lang.String.format("#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(color)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Actual color value = ".concat(format));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color alpha = " + ((color >>> 24) & 255));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color red = " + ((color >>> 16) & 255));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color green = " + ((color >>> 8) & 255));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Color blue = " + (color & 255));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "setDynamicBackground: Current UI mode = ".concat((getContext().getResources().getConfiguration().uiMode & 48) == 32 ? "NIGHT" : "DAY"));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(getContext().getResources().getDisplayMetrics().density * 12.0f);
        setBackground(gradientDrawable);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f202071i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabRecyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s60(this));
        this.f202073n = b60Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f202071i;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabRecyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(b60Var);
        yf2.m1 m1Var = (yf2.m1) controllerRef.get();
        java.util.List i17 = i(m1Var != null ? m1Var.f543282n : null);
        this.f202077r = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var2 = this.f202073n;
        if (b60Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabAdapter");
            throw null;
        }
        b60Var2.f199374e = i17;
        b60Var2.m8146xced61ae5();
        f();
        e();
        p();
        yf2.m1 m58200x143f1b92 = m58200x143f1b92();
        if (m58200x143f1b92 != null) {
            yf2.t tVar = m58200x143f1b92.f543284p;
            tVar.getClass();
            java.util.List list = tVar.f543320a;
            kz5.h0.B(list, yf2.s.f543313d);
            if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.lang.ref.WeakReference) it.next()).get(), this)) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                ((java.util.ArrayList) list).add(new java.lang.ref.WeakReference(this));
            }
        }
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var) {
        yf2.m1 m58200x143f1b92 = z60Var.m58200x143f1b92();
        return m58200x143f1b92 != null && zl2.r4.f555483a.G1((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m58200x143f1b92.m56788xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb());
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var) {
        z60Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r60 r60Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r60(z60Var);
        yf2.m1 m58200x143f1b92 = z60Var.m58200x143f1b92();
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = z60Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!r4Var.Y1(context) || m58200x143f1b92 == null) {
            r60Var.mo152xb9724478();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "openPreparePanelSafely: landscape, defer open via portraitCallback");
            m58200x143f1b92.f372634g = r60Var;
        }
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var) {
        z60Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", "Show game selection dialog");
        yf2.m1 m58200x143f1b92 = z60Var.m58200x143f1b92();
        if (m58200x143f1b92 != null) {
            m58200x143f1b92.c7();
        }
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var, java.lang.String str) {
        r45.q12 b76;
        java.lang.String str2;
        z60Var.getClass();
        switch (str.hashCode()) {
            case -936045084:
                if (!str.equals("karaoke")) {
                    return;
                }
                break;
            case 3165170:
                if (str.equals("game")) {
                    z60Var.s();
                    return;
                }
                return;
            case 112202875:
                if (!str.equals("video")) {
                    return;
                }
                break;
            case 937443551:
                if (!str.equals("co_live")) {
                    return;
                }
                break;
            case 1620049250:
                if (!str.equals("chat_room")) {
                    return;
                }
                break;
            default:
                return;
        }
        yf2.m1 m58200x143f1b92 = z60Var.m58200x143f1b92();
        if (m58200x143f1b92 != null && (b76 = m58200x143f1b92.b7()) != null && (str2 = (java.lang.String) z60Var.f202075p.e(b76).f384367e) != null) {
            z60Var.t(str2);
        }
        z60Var.q();
    }

    /* renamed from: getController */
    private final yf2.m1 m58200x143f1b92() {
        return (yf2.m1) this.f202066d.get();
    }

    /* renamed from: getNextTabToShow */
    private final java.lang.String m58201x97c182a4() {
        java.util.Iterator it = this.f202077r.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) it.next()).f201948a, this.f202076q)) {
                break;
            }
            i17++;
        }
        return i17 >= this.f202077r.size() + (-1) ? i17 > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) this.f202077r.get(i17 - 1)).f201948a : "" : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) this.f202077r.get(i17 + 1)).f201948a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60.e():void");
    }

    public final void f() {
        android.view.View h17 = h("video");
        android.widget.LinearLayout linearLayout = this.f202072m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        linearLayout.addView(h17);
        android.view.View h18 = h("chat_room");
        android.widget.LinearLayout linearLayout2 = this.f202072m;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        linearLayout2.addView(h18);
        android.view.View h19 = h("karaoke");
        android.widget.LinearLayout linearLayout3 = this.f202072m;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        linearLayout3.addView(h19);
        android.view.View h27 = h("game");
        android.widget.LinearLayout linearLayout4 = this.f202072m;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        linearLayout4.addView(h27);
        android.view.View h28 = h("co_live");
        android.widget.LinearLayout linearLayout5 = this.f202072m;
        if (linearLayout5 != null) {
            linearLayout5.addView(h28);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
    }

    public final android.view.View g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var, boolean z17) {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
        android.widget.LinearLayout linearLayout = this.f202072m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eas, (android.view.ViewGroup) linearLayout, false);
        if (inflate != null) {
            inflate.setTag(x50Var.f201827a);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kk9);
        if (textView != null) {
            textView.setText(x50Var.f201828b);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567732kk2);
        yz5.a aVar = x50Var.f201831e;
        boolean booleanValue = aVar != null ? ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue() : false;
        java.lang.Integer num = x50Var.f201829c;
        if (num != null) {
            imageView.setImageResource(num.intValue());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x50Var.f201827a, "landscape")) {
                imageView.setRotation(90.0f);
            } else {
                imageView.setRotation(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50 s50Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50.f201256a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            s50Var.a(inflate, context, false, booleanValue);
        } else {
            imageView.setVisibility(8);
        }
        if (z17) {
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            }
            layoutParams2.setMarginEnd((int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            inflate.setLayoutParams(layoutParams2);
        }
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i60(this, x50Var));
        return inflate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View h(java.lang.String str) {
        android.view.View view;
        java.lang.Object obj;
        android.view.View view2;
        java.util.List list;
        java.lang.Object obj2;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var;
        java.lang.Object obj3;
        java.util.List list2;
        android.util.AttributeSet attributeSet = null;
        switch (str.hashCode()) {
            case -936045084:
                if (str.equals("karaoke")) {
                    view = new android.view.View(getContext());
                    view.setTag(str);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 3165170:
                if (str.equals("game")) {
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
                    android.widget.LinearLayout linearLayout = this.f202072m;
                    if (linearLayout == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                        throw null;
                    }
                    view = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_n, (android.view.ViewGroup) linearLayout, false);
                    view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h60(this));
                    view.setTag(str);
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22 = zj0.c.f554818a;
                    arrayList22.add(8);
                    java.util.Collections.reverse(arrayList22);
                    yj0.a.d(view, arrayList22.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal222 = zj0.c.f554818a;
                arrayList222.add(8);
                java.util.Collections.reverse(arrayList222);
                yj0.a.d(view, arrayList222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 112202875:
                if (str.equals("video")) {
                    java.util.Iterator it = this.f202077r.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj).f201948a, "video")) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj;
                    if (y50Var == null || (list = y50Var.f201950c) == null) {
                        view2 = new android.view.View(getContext());
                    } else {
                        if (list.size() > 1) {
                            android.view.LayoutInflater from2 = android.view.LayoutInflater.from(getContext());
                            android.widget.LinearLayout linearLayout2 = this.f202072m;
                            if (linearLayout2 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                                throw null;
                            }
                            view = from2.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eat, (android.view.ViewGroup) linearLayout2, false);
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.qmy);
                            int i17 = 0;
                            for (java.lang.Object obj4 : list) {
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                linearLayout3.addView(g((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj4, i17 < list.size() - 1));
                                i17 = i18;
                            }
                            view.setTag(str);
                            java.util.ArrayList arrayList2222 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2222 = zj0.c.f554818a;
                            arrayList2222.add(8);
                            java.util.Collections.reverse(arrayList2222);
                            yj0.a.d(view, arrayList2222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList2222.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return view;
                        }
                        view2 = new android.view.View(getContext());
                    }
                    view = view2;
                    view.setTag(str);
                    java.util.ArrayList arrayList22222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal22222 = zj0.c.f554818a;
                    arrayList22222.add(8);
                    java.util.Collections.reverse(arrayList22222);
                    yj0.a.d(view, arrayList22222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList22222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal222222 = zj0.c.f554818a;
                arrayList222222.add(8);
                java.util.Collections.reverse(arrayList222222);
                yj0.a.d(view, arrayList222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 937443551:
                if (str.equals("co_live")) {
                    android.view.LayoutInflater from3 = android.view.LayoutInflater.from(getContext());
                    android.widget.LinearLayout linearLayout4 = this.f202072m;
                    if (linearLayout4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                        throw null;
                    }
                    view = from3.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9q, (android.view.ViewGroup) linearLayout4, false);
                    android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.sus);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                    android.widget.TextView textView = (android.widget.TextView) findViewById;
                    java.util.Iterator it6 = this.f202077r.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj2 = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj2).f201948a, "co_live")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj2;
                    java.util.List list3 = y50Var2 != null ? y50Var2.f201950c : null;
                    if (list3 == null || (x50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) kz5.n0.Z(list3)) == null || (str2 = x50Var.f201828b) == null) {
                        str2 = "";
                    }
                    textView.setText(str2);
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.st_);
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d(context, attributeSet, 2, null == true ? 1 : 0);
                    c14393xabbdae9d.m57881x53aed94a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ac.f199286d);
                    viewGroup.addView(c14393xabbdae9d);
                    this.f202079t = new java.lang.ref.WeakReference(c14393xabbdae9d);
                    r(c14393xabbdae9d);
                    m(c14393xabbdae9d);
                    view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g60(this));
                    view.setTag(str);
                    java.util.ArrayList arrayList2222222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2222222 = zj0.c.f554818a;
                    arrayList2222222.add(8);
                    java.util.Collections.reverse(arrayList2222222);
                    yj0.a.d(view, arrayList2222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2222222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList22222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal22222222 = zj0.c.f554818a;
                arrayList22222222.add(8);
                java.util.Collections.reverse(arrayList22222222);
                yj0.a.d(view, arrayList22222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList22222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            case 1620049250:
                if (str.equals("chat_room")) {
                    java.util.Iterator it7 = this.f202077r.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj3 = it7.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj3).f201948a, "chat_room")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj3;
                    if (y50Var3 == null || (list2 = y50Var3.f201950c) == null) {
                        view = new android.view.View(getContext());
                    } else if (list2.size() > 1) {
                        android.view.LayoutInflater from4 = android.view.LayoutInflater.from(getContext());
                        android.widget.LinearLayout linearLayout5 = this.f202072m;
                        if (linearLayout5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                            throw null;
                        }
                        view = from4.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eat, (android.view.ViewGroup) linearLayout5, false);
                        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.qmy);
                        int i19 = 0;
                        for (java.lang.Object obj5 : list2) {
                            int i27 = i19 + 1;
                            if (i19 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            linearLayout6.addView(g((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj5, i19 < list2.size() - 1));
                            i19 = i27;
                        }
                    } else {
                        view = new android.view.View(getContext());
                    }
                    view.setTag(str);
                    java.util.ArrayList arrayList222222222 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal222222222 = zj0.c.f554818a;
                    arrayList222222222.add(8);
                    java.util.Collections.reverse(arrayList222222222);
                    yj0.a.d(view, arrayList222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList222222222.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return view;
                }
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList2222222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2222222222 = zj0.c.f554818a;
                arrayList2222222222.add(8);
                java.util.Collections.reverse(arrayList2222222222);
                yj0.a.d(view, arrayList2222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2222222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
            default:
                view = new android.view.View(getContext());
                view.setTag(str);
                java.util.ArrayList arrayList22222222222 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal22222222222 = zj0.c.f554818a;
                arrayList22222222222.add(8);
                java.util.Collections.reverse(arrayList22222222222);
                yj0.a.d(view, arrayList22222222222.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList22222222222.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget", "createTabContainer", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return view;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0054. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v29, types: [r45.p12, com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.util.LinkedList r20) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60.i(java.util.LinkedList):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
    
        if (r13 != 16) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60.j(java.lang.String, java.lang.String):void");
    }

    public final void k(java.lang.String str) {
        if (isAttachedToWindow() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "video") && m58200x143f1b92() != null) {
            cl0.g gVar = new cl0.g();
            gVar.o("type", 2);
            gVar.h("game_id", null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
        }
    }

    public final boolean l(r45.p12 p12Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var) {
        if (((x50Var != null ? x50Var.f201830d : null) == null || ((java.lang.Boolean) x50Var.f201830d.mo152xb9724478()).booleanValue()) && p12Var != null) {
            return pm0.v.z(p12Var.m75939xb282bd08(3), i17);
        }
        return false;
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d) {
        try {
            dk2.ef efVar = dk2.ef.f314905a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f202069g;
                if (y0Var == null) {
                    return;
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f202070h;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                this.f202070h = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l60(n0Var, this, c14393xabbdae9d, null), 3, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStartLiveModeTabWidget", "observeCoLiveSlice error", e17);
        }
    }

    public final void n(java.lang.String tabId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t50 t50Var) {
        int i17;
        if (t50Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t50.f201402e) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tabId, this.f202076q)) {
                k(tabId);
            }
            this.f202076q = tabId;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var = this.f202073n;
            if (b60Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabAdapter");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabId, "tabId");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b60Var.f199375f, tabId)) {
                java.util.Iterator it = b60Var.f199374e.iterator();
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    i17 = -1;
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) it.next()).f201948a, b60Var.f199375f)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                java.util.Iterator it6 = b60Var.f199374e.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) it6.next()).f201948a, tabId)) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                b60Var.f199375f = tabId;
                if (i19 >= 0) {
                    b60Var.m8147xed6e4d18(i19);
                }
                if (i17 >= 0) {
                    b60Var.m8147xed6e4d18(i17);
                }
            }
            e();
        }
        if (t50Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t50.f201401d) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tabId, "video")) {
                ll2.e.d(ll2.e.f400666a, "startlive.more.video", false, false, 6, null);
            }
            j(tabId, null);
        }
    }

    public final void o() {
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 5);
        q12Var.set(1, 1);
        yf2.m1 m58200x143f1b92 = m58200x143f1b92();
        if (m58200x143f1b92 != null) {
            m58200x143f1b92.e7(q12Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d;
        super.onAttachedToWindow();
        if (this.f202069g == null) {
            this.f202069g = p3325xe03a0797.p3326xc267989b.z0.b();
            java.lang.ref.WeakReference weakReference = this.f202079t;
            if (weakReference != null && (c14393xabbdae9d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d) weakReference.get()) != null) {
                m(c14393xabbdae9d);
            }
        }
        if ((this.f202076q.length() > 0) && this.f202068f) {
            this.f202068f = false;
            k(this.f202076q);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f202076q, "video")) {
                ll2.e.d(ll2.e.f400666a, "startlive.more.video", false, false, 6, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f202070h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f202070h = null;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f202069g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.f202069g = null;
    }

    public final void p() {
        r45.q12 b76;
        r45.q12 b77;
        yf2.m1 m58200x143f1b92 = m58200x143f1b92();
        if (m58200x143f1b92 == null || (b76 = m58200x143f1b92.b7()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w50 w50Var = this.f202075p;
        jz5.l e17 = w50Var.e(b76);
        java.lang.String str = (java.lang.String) e17.f384366d;
        java.lang.String str2 = (java.lang.String) e17.f384367e;
        n(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t50.f201402e);
        if (str2 != null) {
            t(str2);
        }
        yf2.m1 m58200x143f1b922 = m58200x143f1b92();
        if (m58200x143f1b922 == null || (b77 = m58200x143f1b922.b7()) == null) {
            return;
        }
        jz5.l e18 = w50Var.e(b77);
        java.lang.String str3 = (java.lang.String) e18.f384366d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "game")) {
            s();
        }
    }

    public final void q() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var;
        java.util.List list;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout = this.f202072m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.qmy);
        if (linearLayout2 != null) {
            n3.t1 t1Var = new n3.t1(linearLayout2);
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                java.lang.Object tag = view.getTag();
                java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                java.util.Iterator it = this.f202077r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj).f201948a, this.f202076q)) {
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj;
                if (y50Var == null || (list = y50Var.f201950c) == null) {
                    x50Var = null;
                } else {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj2).f201827a, str)) {
                                break;
                            }
                        }
                    }
                    x50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj2;
                }
                if (x50Var != null) {
                    yz5.a aVar = x50Var.f201831e;
                    boolean booleanValue = aVar != null ? ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue() : false;
                    boolean isSelected = view.isSelected();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50 s50Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50.f201256a;
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    s50Var.a(view, context, isSelected, booleanValue);
                }
            }
        }
    }

    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d c14393xabbdae9d) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        r45.f50 f50Var;
        try {
            gk2.e eVar = dk2.ef.I;
            mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
            if (n0Var != null && (f3Var = n0Var.f410798g) != null && (f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb()) != null) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.util.List a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1.f201552f.a(f50Var, xy2.c.e(context));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1) it.next()).f201555c;
                    if (str == null || !(!r26.n0.N(str))) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                c14393xabbdae9d.m57879x8b63f378(arrayList);
                return;
            }
            c14393xabbdae9d.m57879x8b63f378(kz5.p0.f395529d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderStartLiveModeTabWidget", "updateCoLiveAvatars error", e17);
        }
    }

    public final void s() {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        r45.z53 z53Var;
        yf2.m1 m58200x143f1b92 = m58200x143f1b92();
        if (m58200x143f1b92 != null) {
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m58200x143f1b92.m56788xbba4bfc0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            android.widget.LinearLayout linearLayout = this.f202072m;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                throw null;
            }
            android.view.View findViewWithTag = linearLayout.findViewWithTag("game");
            if (findViewWithTag != null) {
                android.view.View findViewById = findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.gln);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
                android.view.View findViewById2 = findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.gpb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                android.widget.TextView textView = (android.widget.TextView) findViewById2;
                if (n73Var == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null || (str = z53Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                textView.setText(str);
                if (n73Var != null) {
                    i95.m c17 = i95.n0.c(vd2.i5.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    vd2.i5 i5Var = (vd2.i5) c17;
                    r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                    vd2.i5.l8(i5Var, (z53Var2 == null || (m75945x2fec8307 = z53Var2.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307, imageView, null, 4, null);
                }
            }
        }
    }

    public final void t(java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var;
        yz5.a aVar;
        java.util.List list;
        java.lang.Object obj2;
        android.widget.LinearLayout linearLayout = this.f202072m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.qmy);
        if (linearLayout2 != null) {
            n3.t1 t1Var = new n3.t1(linearLayout2);
            while (t1Var.hasNext()) {
                android.view.View view = (android.view.View) t1Var.next();
                java.lang.Object tag = view.getTag();
                java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str);
                view.setSelected(b17);
                java.util.Iterator it = this.f202077r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj).f201948a, this.f202076q)) {
                            break;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50 y50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y50) obj;
                if (y50Var == null || (list = y50Var.f201950c) == null) {
                    x50Var = null;
                } else {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj2).f201827a, str2)) {
                                break;
                            }
                        }
                    }
                    x50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj2;
                }
                boolean booleanValue = (x50Var == null || (aVar = x50Var.f201831e) == null) ? false : ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50 s50Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s50.f201256a;
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                s50Var.a(view, context, b17, booleanValue);
            }
        }
    }
}
