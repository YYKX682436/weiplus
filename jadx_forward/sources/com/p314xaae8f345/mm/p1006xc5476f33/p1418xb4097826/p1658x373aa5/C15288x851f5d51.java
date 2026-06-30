package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/feed/ui/zn;", "Landroid/view/View;", "getEntryBgView", "Lcom/tencent/mm/view/MMPAGView;", "getClickPAG", "Landroid/content/Context;", "d", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView */
/* loaded from: classes2.dex */
public final class C15288x851f5d51 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zn {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.content.Context mContext;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212628e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f212629f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f212630g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f212631h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f212632i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288x851f5d51(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212632i = new java.util.HashMap();
        a(context);
    }

    public final void a(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", "[init]");
        m62082x4d628704(context);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ahz, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f212628e = inflate;
        setClipChildren(false);
        android.view.View view = this.f212628e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.rjr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        this.f212631h = c22789xd23e9a9b;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544839e2));
        android.view.View view2 = this.f212628e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.efp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212630g = findViewById2;
        android.view.View view3 = this.f212628e;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.p314xaae8f345.mm.R.id.exc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f212629f = (android.widget.TextView) findViewById3;
        android.view.View view4 = this.f212630g;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryBg");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = this.f212629f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.f212629f;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
            throw null;
        }
    }

    public final void b(r45.nw1 nw1Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", "update liveStatus=" + i17);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).qk(nw1Var)) {
            boolean a17 = nw1Var != null ? cm2.a.f124861a.a(nw1Var, "") : false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update live is charge live:");
            sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)) : null);
            sb6.append(",chargeLiveCanPlay:");
            sb6.append(a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", sb6.toString());
            if (a17) {
                android.widget.TextView textView = this.f212629f;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                    throw null;
                }
                textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcn));
            } else {
                android.widget.TextView textView2 = this.f212629f;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                    throw null;
                }
                textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dco));
            }
        } else if (i17 == 1) {
            android.widget.TextView textView3 = this.f212629f;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                throw null;
            }
            textView3.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcm));
        } else {
            android.widget.TextView textView4 = this.f212629f;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                throw null;
            }
            textView4.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcj));
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R7).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", "updateStyle style=" + intValue);
        if (intValue == 1) {
            android.widget.TextView textView5 = this.f212629f;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                throw null;
            }
            textView5.setTextSize(17.0f);
            textView5.setTextColor(textView5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
            textView5.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            android.view.View view = this.f212630g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryBg");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = pm0.v.S(48);
            layoutParams.width = pm0.v.S(184);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d1e);
            return;
        }
        if (intValue == 2) {
            android.widget.TextView textView6 = this.f212629f;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
                throw null;
            }
            textView6.setTextSize(17.0f);
            textView6.setTextColor(textView6.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView6.setShadowLayer(0.25f, 0.0f, 0.0f, android.graphics.Color.parseColor("#80000000"));
            android.view.View view2 = this.f212630g;
            if (view2 != null) {
                view2.setBackground(view2.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b7w));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryBg");
                throw null;
            }
        }
        android.view.View view3 = this.f212630g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryBg");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = pm0.v.S(56);
        layoutParams2.width = pm0.v.S(188);
        view3.setLayoutParams(layoutParams2);
        view3.setBackground(view3.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563156ya));
        android.widget.TextView textView7 = this.f212629f;
        if (textView7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryTextView");
            throw null;
        }
        textView7.setTextSize(20.0f);
        textView7.setTextColor(textView7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        textView7.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zn
    /* renamed from: getClickPAG */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo56652xb1e15f64() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f212631h;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clickPagView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zn
    /* renamed from: getEntryBgView */
    public android.view.View mo56653x782dae66() {
        android.view.View view = this.f212630g;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("entryBg");
        throw null;
    }

    /* renamed from: getMContext */
    public final android.content.Context m62081x52aa25f8() {
        android.content.Context context = this.mContext;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: setMContext */
    public final void m62082x4d628704(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<set-?>");
        this.mContext = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288x851f5d51(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212632i = new java.util.HashMap();
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15288x851f5d51(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212632i = new java.util.HashMap();
        a(context);
    }
}
