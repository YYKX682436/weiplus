package qt2;

/* loaded from: classes2.dex */
public class f0 extends qt2.j {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f448105r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f448106s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f448107t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f448108u;

    /* renamed from: v, reason: collision with root package name */
    public int f448109v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f448110w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f448111x;

    /* renamed from: y, reason: collision with root package name */
    public float f448112y;

    /* renamed from: z, reason: collision with root package name */
    public final int f448113z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f448105r = "FinderShareGuidePopupTipUIC";
        this.f448106s = "";
        this.f448110w = new java.util.LinkedList();
        this.f448111x = true;
        this.f448112y = -1.0f;
        this.f448113z = android.view.ViewConfiguration.getTouchSlop();
    }

    @Override // qt2.j
    public int Q6() {
        return com.p314xaae8f345.mm.R.id.jrp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qt2.j
    public void S6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.S6(recyclerView);
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209203e3).mo141623x754a37bb()).r()).intValue() == 1) != false && (c1163xf1deaba4 = this.f448123g) != null && (p07 = c1163xf1deaba4.p0(0)) != null && (view = p07.f3639x46306858) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.g1y);
            java.util.LinkedList linkedList = this.f448110w;
            if (viewGroup != null) {
                linkedList.add(viewGroup);
            }
            android.view.ViewGroup viewGroup2 = this.f448125i;
            if (viewGroup2 != null) {
                android.view.View findViewById2 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.gbz);
                int childCount = viewGroup2.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup2.getChildAt(i17);
                    if (childAt.getVisibility() == 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, findViewById2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, this.f448121e)) {
                        linkedList.add(childAt);
                    }
                }
            }
        }
        android.view.View view2 = this.f448121e;
        r5 = null;
        r5 = null;
        r5 = null;
        java.lang.String str = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = view2 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.f566499g32) : null;
        android.view.View view3 = this.f448121e;
        android.widget.TextView textView = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.f566500g33) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f448106s)) {
            this.f448106s = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572911cw5);
        }
        if (textView != null) {
            textView.setText(this.f448106s);
        }
        android.view.View view4 = this.f448121e;
        android.widget.TextView textView2 = view4 != null ? (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.f566498g31) : null;
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209203e3).mo141623x754a37bb()).r()).intValue() == 1) == true) {
            android.view.View view5 = this.f448121e;
            if (view5 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view5.findViewById(com.p314xaae8f345.mm.R.id.f566499g32)) != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79316x3fe76b25);
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView2 != null ? textView2.getPaint() : null, 0.8f);
            java.util.List list = this.f448128o;
            so2.j5 j5Var = list != null ? (so2.j5) kz5.n0.a0(list, 1) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (m76802x2dd01666 = feedObject2.m76802x2dd01666()) != null) {
                str = m76802x2dd01666.m76944x730bcac6();
            }
            if ((str == null || str.length() == 0) != true) {
                java.lang.String str2 = "\"" + str + '\"';
                if (textView2 != null) {
                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                    m80379x76847179().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                    int b17 = displayMetrics.widthPixels - i65.a.b(m80379x76847179(), 94);
                    android.text.TextPaint paint = textView2.getPaint();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                    android.text.StaticLayout staticLayout = new android.text.StaticLayout(str2, 0, str2.length(), paint, b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                    if (staticLayout.getLineCount() > 2) {
                        java.lang.String string = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f4l);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        float measureText = textView2.getPaint().measureText(string);
                        android.text.TextPaint paint2 = textView2.getPaint();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint2, "getPaint(...)");
                        java.lang.String substring = str2.substring(0, staticLayout.getLineEnd(1) - new android.text.StaticLayout(string, 0, string.length(), paint2, (int) measureText, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        textView2.setText(new android.text.SpannableString(substring.concat(string)));
                    } else {
                        textView2.setText(str2);
                    }
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        android.view.View view6 = this.f448121e;
        if (view6 != null && (findViewById = view6.findViewById(com.p314xaae8f345.mm.R.id.f566501g34)) != null) {
            findViewById.setOnClickListener(new qt2.c0(this));
        }
        if (Z6()) {
            return;
        }
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(4);
        }
        if (textView != null) {
            textView.setVisibility(4);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // qt2.j
    public void U6() {
        super.U6();
        e7(0);
    }

    @Override // qt2.j
    public void V6(float f17) {
        if (this.f448111x) {
            android.view.View view = this.f448121e;
            if (view != null && view.getVisibility() == 0) {
                android.view.View view2 = this.f448121e;
                if (view2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onScrollDown", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                a7();
                this.f448111x = false;
            }
        }
    }

    @Override // qt2.j
    public boolean X6() {
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W3).mo141623x754a37bb()).r()).intValue() != 1 && !((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f120759d && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209222f3).mo141623x754a37bb()).r()).intValue() == 0 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209165c3).mo141623x754a37bb()).r()).intValue() == 1 && hc2.e.a() && !((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D1().r()).booleanValue();
    }

    @Override // qt2.j
    public void Y6() {
        android.view.View view;
        if (this.f448122f || T6() || (view = this.f448121e) == null) {
            return;
        }
        this.f448108u = new qt2.e0(this, view);
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f448108u);
        }
    }

    public boolean Z6() {
        return true;
    }

    public final void a7() {
        qt2.j.P6(this, c7(), 260L, 0.0f, 4, null);
    }

    public void b7(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.view.View view = this.f448121e;
        boolean z17 = false;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            int action = event.getAction();
            if (action == 0) {
                this.f448112y = event.getY();
                return;
            }
            if (action != 1) {
                return;
            }
            float y17 = event.getY() - this.f448112y;
            if (y17 <= 0.0f || y17 <= this.f448113z) {
                return;
            }
            a7();
        }
    }

    public final int c7() {
        int i17 = this.f448109v;
        return i17 > 0 ? i17 : i65.a.b(m80379x76847179(), 170);
    }

    public void d7() {
        a7();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f448123g;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "onClickGuide", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    public final void e7(int i17) {
        for (android.view.View view : this.f448110w) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/share/FinderShareGuidePopupTipUIC", "setViewListVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // qt2.j
    /* renamed from: getTag */
    public java.lang.String mo160882xb5887064() {
        return this.f448105r;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.View view = this.f448121e;
        if (view != null) {
            view.removeCallbacks(this.f448107t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f448105r = "FinderShareGuidePopupTipUIC";
        this.f448106s = "";
        this.f448110w = new java.util.LinkedList();
        this.f448111x = true;
        this.f448112y = -1.0f;
        this.f448113z = android.view.ViewConfiguration.getTouchSlop();
    }
}
