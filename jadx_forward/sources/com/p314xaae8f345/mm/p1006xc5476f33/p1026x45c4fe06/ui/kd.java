package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class kd extends android.widget.RelativeLayout implements al1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f171365d;

    /* renamed from: e, reason: collision with root package name */
    public int f171366e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171367f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f171368g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f171369h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f171370i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y f171371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f171366e = -16777216;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        this.f171367f = dimensionPixelSize;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, dimensionPixelSize));
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setPadding(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), 0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), 0);
        imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562264b9);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bu7);
        imageView.setId(com.p314xaae8f345.mm.R.id.f564065gy);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jd(this));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(20);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setMinimumWidth(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561560m0));
        frameLayout.addView(imageView);
        addView(frameLayout);
        this.f171368g = imageView;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(16);
        textView.setId(com.p314xaae8f345.mm.R.id.f564079hc);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        textView.setLayoutParams(layoutParams2);
        addView(textView);
        this.f171369h = textView;
    }

    @Override // al1.k0
    /* renamed from: getActionView */
    public android.view.View mo2206x5ca2d9f1() {
        return this;
    }

    /* renamed from: getBackgroundAlpha */
    public double m53001x30fc4a9a() {
        return 1.0d;
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public int getF87324d() {
        android.graphics.drawable.Drawable background = getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        if (colorDrawable != null) {
            return colorDrawable.getColor();
        }
        return 0;
    }

    /* renamed from: getCapsuleView */
    public android.view.View m53002x716f693c() {
        return null;
    }

    /* renamed from: getForegroundColor */
    public int m53003xbe2bf9aa() {
        return this.f171366e;
    }

    /* renamed from: getMainTitle */
    public java.lang.CharSequence m53004xefd74969() {
        return this.f171369h.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View view = this.f171370i;
        if (view != null) {
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressBar");
                throw null;
            }
            if (view.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f171371m;
                if (yVar != null) {
                    yVar.start();
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f171371m;
        if (yVar != null) {
            if (yVar != null) {
                yVar.stop();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f171367f, 1073741824));
    }

    @Override // al1.k0
    /* renamed from: setBackButtonClickListener */
    public void mo2215x1ae0b121(android.view.View.OnClickListener onClickListener) {
        this.f171365d = onClickListener;
    }

    /* renamed from: setBackgroundAlpha */
    public void m53005x67d2e40e(double d17) {
    }

    @Override // android.view.View, al1.k0
    /* renamed from: setBackgroundColor */
    public void mo134899x67f06213(int i17) {
        super.setBackgroundColor(i17);
        if (i17 != 0) {
            setWillNotDraw(false);
        } else {
            setWillNotDraw(true);
        }
    }

    @Override // al1.k0
    /* renamed from: setCloseButtonClickListener */
    public void mo2218x262881b4(android.view.View.OnClickListener onClickListener) {
        this.f171365d = onClickListener;
    }

    @Override // al1.k0
    /* renamed from: setForegroundColor */
    public void mo2219xf502931e(int i17) {
        this.f171366e = i17;
        this.f171368g.setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f171369h.setTextColor(this.f171366e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f171371m;
        if (yVar != null) {
            yVar.f173656h = this.f171366e;
            yVar.invalidateSelf();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar2 = this.f171371m;
            if (yVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
            android.view.View view = this.f171370i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressBar");
                throw null;
            }
            if (view instanceof android.widget.ProgressBar) {
                ((android.widget.ProgressBar) view).setIndeterminateDrawable(yVar2);
            } else if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562) view).setForeground(yVar2);
            } else {
                view.setBackground(yVar2);
            }
        }
    }

    @Override // al1.k0
    /* renamed from: setForegroundStyle */
    public void mo2220xf5e6816c(java.lang.String style) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        mo2219xf502931e(al1.j0.a(style).f87315d);
    }

    @Override // al1.k0
    /* renamed from: setLoadingIconVisibility */
    public void mo2223x5b5c5185(boolean z17) {
        if (!z17) {
            android.view.View view = this.f171370i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f171371m;
            if (yVar != null) {
                yVar.stop();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
        if (this.f171370i == null) {
            this.f171371m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.t(getContext());
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.view.View c12699x37a66562 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562(context);
            this.f171370i = c12699x37a66562;
            int b17 = i65.a.b(c12699x37a66562.getContext(), 3);
            c12699x37a66562.setPadding(b17, b17, b17, b17);
            c12699x37a66562.setId(com.p314xaae8f345.mm.R.id.f564061gu);
            int b18 = i65.a.b(c12699x37a66562.getContext(), 24);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(b18, b18);
            layoutParams.addRule(15);
            android.widget.TextView textView = this.f171369h;
            layoutParams.addRule(0, textView.getId());
            layoutParams.addRule(16, textView.getId());
            c12699x37a66562.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar2 = this.f171371m;
            if (yVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
            yVar2.f173656h = this.f171366e;
            yVar2.invalidateSelf();
            android.graphics.drawable.Drawable drawable = this.f171371m;
            if (drawable == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
            if (c12699x37a66562 instanceof android.widget.ProgressBar) {
                ((android.widget.ProgressBar) c12699x37a66562).setIndeterminateDrawable(drawable);
            } else {
                c12699x37a66562.setForeground(drawable);
            }
            addView(c12699x37a66562);
        }
        android.view.View view2 = this.f171370i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressBar");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar3 = this.f171371m;
        if (yVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
            throw null;
        }
        yVar3.b();
        if (isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar4 = this.f171371m;
            if (yVar4 != null) {
                yVar4.start();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
    }

    @Override // al1.k0
    /* renamed from: setMainTitle */
    public void mo2224x4c2b09dd(java.lang.CharSequence charSequence) {
        this.f171369h.setText(charSequence);
    }

    @Override // al1.k0
    /* renamed from: setNavHidden */
    public void mo2227x506dbe6b(boolean z17) {
        this.f171368g.setVisibility(!z17 ? 0 : 8);
    }

    /* renamed from: setOptionButtonClickListener */
    public void m53006x9b5ddf53(android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }
}
