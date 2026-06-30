package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class kd extends android.widget.RelativeLayout implements al1.k0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnClickListener f89832d;

    /* renamed from: e, reason: collision with root package name */
    public int f89833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89834f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f89835g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f89836h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f89837i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.y f89838m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f89833e = -16777216;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
        this.f89834f = dimensionPixelSize;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, dimensionPixelSize));
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3), 0);
        imageView.setBackgroundResource(com.tencent.mm.R.drawable.f480731b9);
        imageView.setImageResource(com.tencent.mm.R.drawable.bu7);
        imageView.setId(com.tencent.mm.R.id.f482532gy);
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
        imageView.setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.jd(this));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(20);
        layoutParams.addRule(9);
        layoutParams.addRule(15);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setMinimumWidth(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480027m0));
        frameLayout.addView(imageView);
        addView(frameLayout);
        this.f89835g = imageView;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479559b));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setGravity(16);
        textView.setId(com.tencent.mm.R.id.f482546hc);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        textView.setLayoutParams(layoutParams2);
        addView(textView);
        this.f89836h = textView;
    }

    @Override // al1.k0
    public android.view.View getActionView() {
        return this;
    }

    public double getBackgroundAlpha() {
        return 1.0d;
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public int getF5791d() {
        android.graphics.drawable.Drawable background = getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        if (colorDrawable != null) {
            return colorDrawable.getColor();
        }
        return 0;
    }

    public android.view.View getCapsuleView() {
        return null;
    }

    public int getForegroundColor() {
        return this.f89833e;
    }

    public java.lang.CharSequence getMainTitle() {
        return this.f89836h.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.View view = this.f89837i;
        if (view != null) {
            if (view == null) {
                kotlin.jvm.internal.o.o("mProgressBar");
                throw null;
            }
            if (view.getVisibility() == 0) {
                com.tencent.mm.plugin.appbrand.widget.y yVar = this.f89838m;
                if (yVar != null) {
                    yVar.start();
                } else {
                    kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.appbrand.widget.y yVar = this.f89838m;
        if (yVar != null) {
            if (yVar != null) {
                yVar.stop();
            } else {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f89834f, 1073741824));
    }

    @Override // al1.k0
    public void setBackButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f89832d = onClickListener;
    }

    public void setBackgroundAlpha(double d17) {
    }

    @Override // android.view.View, al1.k0
    public void setBackgroundColor(int i17) {
        super.setBackgroundColor(i17);
        if (i17 != 0) {
            setWillNotDraw(false);
        } else {
            setWillNotDraw(true);
        }
    }

    @Override // al1.k0
    public void setCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.f89832d = onClickListener;
    }

    @Override // al1.k0
    public void setForegroundColor(int i17) {
        this.f89833e = i17;
        this.f89835g.setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f89836h.setTextColor(this.f89833e);
        com.tencent.mm.plugin.appbrand.widget.y yVar = this.f89838m;
        if (yVar != null) {
            yVar.f92123h = this.f89833e;
            yVar.invalidateSelf();
            com.tencent.mm.plugin.appbrand.widget.y yVar2 = this.f89838m;
            if (yVar2 == null) {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
            android.view.View view = this.f89837i;
            if (view == null) {
                kotlin.jvm.internal.o.o("mProgressBar");
                throw null;
            }
            if (view instanceof android.widget.ProgressBar) {
                ((android.widget.ProgressBar) view).setIndeterminateDrawable(yVar2);
            } else if (view instanceof com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar) {
                ((com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar) view).setForeground(yVar2);
            } else {
                view.setBackground(yVar2);
            }
        }
    }

    @Override // al1.k0
    public void setForegroundStyle(java.lang.String style) {
        kotlin.jvm.internal.o.g(style, "style");
        setForegroundColor(al1.j0.a(style).f5782d);
    }

    @Override // al1.k0
    public void setLoadingIconVisibility(boolean z17) {
        if (!z17) {
            android.view.View view = this.f89837i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.appbrand.widget.y yVar = this.f89838m;
            if (yVar != null) {
                yVar.stop();
                return;
            } else {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
        if (this.f89837i == null) {
            this.f89838m = new com.tencent.mm.plugin.appbrand.widget.t(getContext());
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.view.View simplifiedLoadingProgressBar = new com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar(context);
            this.f89837i = simplifiedLoadingProgressBar;
            int b17 = i65.a.b(simplifiedLoadingProgressBar.getContext(), 3);
            simplifiedLoadingProgressBar.setPadding(b17, b17, b17, b17);
            simplifiedLoadingProgressBar.setId(com.tencent.mm.R.id.f482528gu);
            int b18 = i65.a.b(simplifiedLoadingProgressBar.getContext(), 24);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(b18, b18);
            layoutParams.addRule(15);
            android.widget.TextView textView = this.f89836h;
            layoutParams.addRule(0, textView.getId());
            layoutParams.addRule(16, textView.getId());
            simplifiedLoadingProgressBar.setLayoutParams(layoutParams);
            com.tencent.mm.plugin.appbrand.widget.y yVar2 = this.f89838m;
            if (yVar2 == null) {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
            yVar2.f92123h = this.f89833e;
            yVar2.invalidateSelf();
            android.graphics.drawable.Drawable drawable = this.f89838m;
            if (drawable == null) {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
            if (simplifiedLoadingProgressBar instanceof android.widget.ProgressBar) {
                ((android.widget.ProgressBar) simplifiedLoadingProgressBar).setIndeterminateDrawable(drawable);
            } else {
                simplifiedLoadingProgressBar.setForeground(drawable);
            }
            addView(simplifiedLoadingProgressBar);
        }
        android.view.View view2 = this.f89837i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mProgressBar");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/SimplifiedActionBarForPluginSplash", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.widget.y yVar3 = this.f89838m;
        if (yVar3 == null) {
            kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
            throw null;
        }
        yVar3.b();
        if (isAttachedToWindow()) {
            com.tencent.mm.plugin.appbrand.widget.y yVar4 = this.f89838m;
            if (yVar4 != null) {
                yVar4.start();
            } else {
                kotlin.jvm.internal.o.o("mProgressLoadingDrawable");
                throw null;
            }
        }
    }

    @Override // al1.k0
    public void setMainTitle(java.lang.CharSequence charSequence) {
        this.f89836h.setText(charSequence);
    }

    @Override // al1.k0
    public void setNavHidden(boolean z17) {
        this.f89835g.setVisibility(!z17 ? 0 : 8);
    }

    public void setOptionButtonClickListener(android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }
}
