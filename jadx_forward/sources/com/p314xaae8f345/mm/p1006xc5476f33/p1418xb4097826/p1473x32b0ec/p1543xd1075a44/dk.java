package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class dk extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f199641d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f199642e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f199643f;

    /* renamed from: g, reason: collision with root package name */
    public final int f199644g;

    /* renamed from: h, reason: collision with root package name */
    public final int f199645h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f199646i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f199647m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f199648n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnClickListener f199649o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View.OnClickListener f199650p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f199651q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f199652r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f199653s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f199654t;

    /* renamed from: u, reason: collision with root package name */
    public int f199655u;

    /* renamed from: v, reason: collision with root package name */
    public int f199656v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ObjectAnimator f199657w;

    /* renamed from: x, reason: collision with root package name */
    public android.animation.ObjectAnimator f199658x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(android.content.Context context, android.view.ViewGroup parent, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f199641d = parent;
        this.f199642e = basePlugin;
        this.f199643f = "Finder.FinderLiveGameJoinGuideBubbleWidget";
        this.f199644g = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f199645h = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ar7, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199646i = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bzh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199651q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f199652r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nrk);
        this.f199653s = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kr8);
        this.f199654t = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gro);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yj(this));
        ((android.widget.ImageView) findViewById).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zj(this));
    }

    /* renamed from: getEntranceRoot */
    private final android.view.ViewGroup m58003xe1f3c72e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l X0 = this.f199642e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(X0);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) X0).G1();
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("v，parent visibility:");
        android.view.ViewGroup viewGroup = this.f199641d;
        sb6.append(viewGroup.getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199643f, sb6.toString());
        if (getVisibility() == 0) {
            if (this.f199658x == null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
                this.f199658x = ofFloat;
                if (ofFloat != null) {
                    ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bk(this));
                }
            }
            android.animation.ObjectAnimator objectAnimator = this.f199658x;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            android.animation.ObjectAnimator objectAnimator2 = this.f199658x;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    public final boolean b() {
        android.view.ViewGroup viewGroup = this.f199647m;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            android.view.View view = this.f199648n;
            if (view != null && view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Boolean c() {
        return java.lang.Boolean.valueOf(getVisibility() == 0);
    }

    public final void d(java.lang.String str, java.lang.String str2, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView = this.f199652r;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = this.f199653s;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f199652r;
        if (textView3 != null) {
            textView3.setText(str);
        }
        if (i17 <= 0) {
            android.widget.TextView textView4 = this.f199653s;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        } else {
            android.widget.TextView textView5 = this.f199653s;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572932cz3, java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int L = r26.n0.L(string, java.lang.String.valueOf(i17), 0, false, 6, null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.String substring = string.substring(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String substring2 = string.substring(L, string.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f78868xd4a8b967, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            e17.setBounds(0, 0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
            ((ke0.e) xVar).getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.b(context, substring, substring2, e17, true, false));
            android.widget.TextView textView6 = this.f199653s;
            if (textView6 != null) {
                textView6.setText(spannableStringBuilder);
            }
        }
        android.widget.TextView textView7 = this.f199652r;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                android.widget.TextView textView8 = this.f199652r;
                if (textView8 != null) {
                    textView8.setContentDescription(str2);
                }
                android.widget.TextView textView9 = this.f199653s;
                if (textView9 == null) {
                    return;
                }
                textView9.setContentDescription(" ");
            }
        }
    }

    public final void e(java.lang.String str, boolean z17) {
        android.widget.TextView textView = this.f199651q;
        if (textView != null) {
            textView.setMaxLines(z17 ? 2 : 1);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView2 = this.f199651q;
            if (textView2 == null) {
                return;
            }
            textView2.setText("");
            return;
        }
        android.widget.TextView textView3 = this.f199651q;
        if (textView3 == null) {
            return;
        }
        textView3.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dk.f():boolean");
    }

    public final void g() {
        android.view.View view = this.f199648n;
        android.view.ViewGroup viewGroup = this.f199647m;
        if (view == null || viewGroup == null) {
            return;
        }
        int[] iArr = new int[2];
        m58003xe1f3c72e().getLocationOnScreen(iArr);
        if ((this.f199655u == iArr[0] && this.f199656v == iArr[1]) || m58003xe1f3c72e().getVisibility() == 8) {
            return;
        }
        android.view.ViewParent parent = m58003xe1f3c72e().getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        if (((android.view.ViewGroup) parent).getVisibility() == 8) {
            return;
        }
        this.f199655u = iArr[0];
        this.f199656v = iArr[1];
        int i17 = com.p314xaae8f345.mm.ui.bl.b(getRootView().getContext()).x;
        com.p314xaae8f345.mm.ui.bl.h(getContext());
        boolean z17 = getContext().getResources().getConfiguration().orientation == 2;
        int i18 = this.f199644g;
        int i19 = this.f199645h;
        if (z17) {
            int width = viewGroup.getWidth();
            if (width == 0) {
                width = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561217cj);
            }
            int width2 = (i17 - iArr[0]) - (m58003xe1f3c72e().getWidth() / 2);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            int i27 = width2 - (width / 2);
            if (i27 - i19 > 0) {
                layoutParams2.rightMargin = i27 - i19;
            } else {
                layoutParams2.rightMargin = 0;
            }
            viewGroup.setLayoutParams(layoutParams2);
            int width3 = view.getWidth();
            if (width3 != 0) {
                i18 = width3;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.rightMargin = (width2 - (i18 / 2)) - i19;
            view.setLayoutParams(layoutParams4);
            return;
        }
        int width4 = viewGroup.getWidth();
        if (width4 == 0) {
            width4 = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561970xw);
        }
        int width5 = (i17 - iArr[0]) - (m58003xe1f3c72e().getWidth() / 2);
        android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
        int i28 = width5 - (width4 / 2);
        if (i28 - i19 > 0) {
            layoutParams6.rightMargin = i28 - i19;
        } else {
            layoutParams6.rightMargin = 0;
        }
        viewGroup.setLayoutParams(layoutParams6);
        int width6 = view.getWidth();
        if (width6 != 0) {
            i18 = width6;
        }
        android.view.ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams8 = (android.widget.LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.rightMargin = (width5 - (i18 / 2)) - i19;
        view.setLayoutParams(layoutParams8);
    }

    /* renamed from: getBasePlugin */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58004xb7f4f95a() {
        return this.f199642e;
    }

    /* renamed from: getGiftTitleTV */
    public final android.widget.TextView m58005x2e93b654() {
        return this.f199654t;
    }

    /* renamed from: getMCloseListener */
    public final android.view.View.OnClickListener m58006xe4816455() {
        return this.f199650p;
    }

    /* renamed from: getMListener */
    public final android.view.View.OnClickListener m58007x74a7dd8b() {
        return this.f199649o;
    }

    /* renamed from: getPaySubtitleTV */
    public final android.widget.TextView m58008xce7947ac() {
        return this.f199653s;
    }

    /* renamed from: getSubtitleTV */
    public final android.widget.TextView m58009xe4cd6890() {
        return this.f199652r;
    }

    /* renamed from: getTitleTV */
    public final android.widget.TextView m58010xefe232a4() {
        return this.f199651q;
    }

    /* renamed from: setGiftTitle */
    public final void m58011x7d2438c6(java.lang.String str) {
        android.widget.TextView textView = this.f199654t;
        if (textView != null) {
            textView.setText(str);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.widget.TextView textView2 = this.f199654t;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        android.widget.TextView textView3 = this.f199654t;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(0);
    }

    /* renamed from: setGiftTitleTV */
    public final void m58012xc4f929c8(android.widget.TextView textView) {
        this.f199654t = textView;
    }

    /* renamed from: setMCloseListener */
    public final void m58013xac77cc61(android.view.View.OnClickListener onClickListener) {
        this.f199650p = onClickListener;
    }

    /* renamed from: setMListener */
    public final void m58014xd0fb9dff(android.view.View.OnClickListener onClickListener) {
        this.f199649o = onClickListener;
    }

    /* renamed from: setPaySubtitleTV */
    public final void m58015x614fae20(android.widget.TextView textView) {
        this.f199653s = textView;
    }

    /* renamed from: setSubtitleTV */
    public final void m58016x12f1b69c(android.widget.TextView textView) {
        this.f199652r = textView;
    }

    /* renamed from: setTitleTV */
    public final void m58017x63538018(android.widget.TextView textView) {
        this.f199651q = textView;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        android.view.ViewGroup viewGroup = this.f199647m;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
        }
        android.view.View view = this.f199648n;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameJoinGuideBubbleWidget", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
