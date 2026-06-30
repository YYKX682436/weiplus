package com.tencent.mm.plugin.appbrand.widget.actionbar;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0003\t\f\u0005B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0012H\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout;", "Landroid/widget/LinearLayout;", "Lmi1/i2;", "Lmi1/j0;", "", "Lal1/b0;", "onTranslateRectCallback", "Ljz5/f0;", "setOnTranslateRectCallback", "Lal1/z;", "onHideCallback", "setOnHideCallback", "Lal1/a0;", "onTranslateClick", "setOnTranslateClick", "", "color", "setStyleColor", "Lmi1/h2;", "getCurrentState", "Landroid/view/View;", "h", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "setDivider", "(Landroid/view/View;)V", "divider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandTranslateLayout extends android.widget.LinearLayout implements mi1.i2 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f91038s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f91039d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f91040e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f91041f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f91042g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.view.View divider;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91044i;

    /* renamed from: m, reason: collision with root package name */
    public final mi1.h2 f91045m;

    /* renamed from: n, reason: collision with root package name */
    public int f91046n;

    /* renamed from: o, reason: collision with root package name */
    public al1.b0 f91047o;

    /* renamed from: p, reason: collision with root package name */
    public al1.z f91048p;

    /* renamed from: q, reason: collision with root package name */
    public al1.a0 f91049q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.AnimatorSet f91050r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBrandTranslateLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // mi1.i2
    public java.lang.Object a(mi1.h2 h2Var, kotlin.coroutines.Continuation continuation) {
        int i17 = h2Var.f326567a;
        android.widget.TextView textView = this.f91039d;
        android.widget.ImageView imageView = this.f91040e;
        android.widget.LinearLayout linearLayout = this.f91042g;
        if (i17 == 0) {
            e(0);
            d(true);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            int c17 = c();
            android.animation.Animator b17 = b(linearLayout, 0, c17);
            b17.addListener(new al1.d0(this));
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(150L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(150L);
            android.view.View view = this.divider;
            kotlin.jvm.internal.o.d(view);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(150L);
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
            android.animation.Animator duration = android.animation.ValueAnimator.ofInt(0, 1).setDuration(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
            ofFloat4.setDuration(150L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            ofFloat5.setDuration(150L);
            android.view.View view2 = this.divider;
            kotlin.jvm.internal.o.d(view2);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
            ofFloat6.setDuration(150L);
            animatorSet3.playTogether(ofFloat4, ofFloat5, ofFloat6);
            android.animation.Animator b18 = b(linearLayout, c17, 0);
            b18.addListener(new al1.e0(this));
            animatorSet.playSequentially(b17, animatorSet2, duration, animatorSet3, b18);
            this.f91050r = animatorSet;
            animatorSet.start();
        } else if (i17 == 1) {
            int i18 = this.f91046n;
            e(1);
            if (i18 == -1) {
                d(true);
                android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
                android.animation.Animator b19 = b(linearLayout, 0, c());
                b19.addListener(new al1.f0(this));
                android.animation.AnimatorSet animatorSet5 = new android.animation.AnimatorSet();
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
                ofFloat7.setDuration(150L);
                android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
                ofFloat8.setDuration(150L);
                android.view.View view3 = this.divider;
                kotlin.jvm.internal.o.d(view3);
                android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
                ofFloat9.setDuration(150L);
                animatorSet5.playTogether(ofFloat7, ofFloat8, ofFloat9);
                animatorSet4.playSequentially(b19, animatorSet5);
                animatorSet4.start();
                this.f91050r = animatorSet4;
            } else {
                d(false);
                this.f91044i = true;
            }
        } else if (i17 != 2) {
            int i19 = this.f91046n;
            if (i19 != -1 && i19 != 3) {
                e(-1);
            }
        } else {
            e(2);
            this.f91044i = true;
            d(false);
            android.animation.AnimatorSet animatorSet6 = new android.animation.AnimatorSet();
            android.animation.Animator duration2 = android.animation.ValueAnimator.ofInt(1).setDuration(2000L);
            int c18 = c();
            android.animation.AnimatorSet animatorSet7 = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
            ofFloat10.setDuration(150L);
            android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            ofFloat11.setDuration(150L);
            android.view.View view4 = this.divider;
            kotlin.jvm.internal.o.d(view4);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
            ofFloat12.setDuration(150L);
            animatorSet7.playTogether(ofFloat10, ofFloat11, ofFloat12);
            android.animation.Animator b27 = b(linearLayout, c18, 0);
            b27.addListener(new al1.c0(this));
            animatorSet6.playSequentially(duration2, animatorSet7, b27);
            animatorSet6.start();
            this.f91050r = animatorSet6;
        }
        return jz5.f0.f302826a;
    }

    public final android.animation.ValueAnimator b(android.view.View view, int i17, int i18) {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.addUpdateListener(new al1.g0(view));
        return ofInt;
    }

    public final int c() {
        int a17 = this.f91040e.getVisibility() == 8 ? 0 : com.tencent.mm.ui.zk.a(getContext(), 34);
        android.widget.TextView textView = this.f91039d;
        return (int) (a17 + textView.getPaint().measureText(textView.getText().toString()) + (this.f91041f.getVisibility() != 8 ? com.tencent.mm.ui.zk.a(getContext(), 26) : 0) + com.tencent.mm.ui.zk.a(getContext(), 22));
    }

    public final void d(boolean z17) {
        android.animation.AnimatorSet animatorSet = this.f91050r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f91050r = null;
        this.f91040e.setAlpha(1.0f);
        this.f91039d.setAlpha(1.0f);
        android.view.View view = this.divider;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "resetAnimation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "resetAnimation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f91042g.getLayoutParams().width = z17 ? 0 : c();
    }

    public final void e(int i17) {
        this.f91046n = i17;
        this.f91045m.f326567a = i17;
        android.widget.ProgressBar progressBar = this.f91041f;
        android.widget.LinearLayout linearLayout = this.f91042g;
        android.widget.TextView textView = this.f91039d;
        android.widget.ImageView imageView = this.f91040e;
        if (i17 == 0) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.tencent.mm.R.string.f490622ln5));
            imageView.setImageResource(com.tencent.mm.R.raw.app_brand_translate);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            android.view.View view = this.divider;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 1) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.tencent.mm.R.string.lmo));
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(0);
            imageView.setVisibility(8);
            android.view.View view2 = this.divider;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.tencent.mm.R.string.lly));
            imageView.setImageResource(com.tencent.mm.R.raw.app_brand_translate_success);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            android.view.View view3 = this.divider;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        imageView.setVisibility(8);
        progressBar.setVisibility(8);
        linearLayout.setVisibility(8);
        android.view.View view4 = this.divider;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        al1.z zVar = this.f91048p;
        if (zVar != null) {
            tj1.q qVar = (tj1.q) zVar;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = qVar.f419708a.t3();
            kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
            if (mi1.o0.f326653b) {
                t37.f74821z.f326706e.c(new mi1.j0(2, -1, 3, 0L, -1, 0L, null, 0, 0L, null, 1000, null));
            } else {
                com.tencent.mars.xlog.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTranslate: isEnable = false");
            }
            mi1.v vVar = qVar.f419709b;
            if (vVar != null) {
                vVar.l();
            }
            com.tencent.mars.xlog.Log.i("Luggage.JsApiUpdateTranslateEntry", "showTranslate STATE_HIDE");
        }
    }

    @Override // mi1.i2
    /* renamed from: getCurrentState, reason: from getter */
    public mi1.h2 getF91045m() {
        return this.f91045m;
    }

    public final android.view.View getDivider() {
        return this.divider;
    }

    public final void setDivider(android.view.View view) {
        this.divider = view;
    }

    public final void setOnHideCallback(al1.z onHideCallback) {
        kotlin.jvm.internal.o.g(onHideCallback, "onHideCallback");
        this.f91048p = onHideCallback;
    }

    public final void setOnTranslateClick(al1.a0 onTranslateClick) {
        kotlin.jvm.internal.o.g(onTranslateClick, "onTranslateClick");
        this.f91049q = onTranslateClick;
    }

    public final void setOnTranslateRectCallback(al1.b0 onTranslateRectCallback) {
        kotlin.jvm.internal.o.g(onTranslateRectCallback, "onTranslateRectCallback");
        this.f91047o = onTranslateRectCallback;
    }

    public final void setStyleColor(int i17) {
        android.graphics.drawable.Drawable drawable = null;
        android.widget.ProgressBar progressBar = this.f91041f;
        android.widget.ImageView imageView = this.f91040e;
        android.widget.TextView textView = this.f91039d;
        if (i17 == -1) {
            android.view.View view = this.divider;
            if (view != null) {
                view.setBackgroundResource(com.tencent.mm.R.color.f478633cs);
            }
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478641ov));
            imageView.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            android.graphics.drawable.Drawable drawable2 = b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.avr);
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 16), com.tencent.mm.ui.zk.a(getContext(), 16));
                drawable = drawable2;
            }
            progressBar.setIndeterminateDrawable(drawable);
            return;
        }
        android.view.View view2 = this.divider;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.color.f478634ct);
        }
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.afd));
        imageView.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.graphics.drawable.Drawable drawable3 = b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.avm);
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, com.tencent.mm.ui.zk.a(getContext(), 16), com.tencent.mm.ui.zk.a(getContext(), 16));
            drawable = drawable3;
        }
        progressBar.setIndeterminateDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandTranslateLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f91045m = new mi1.h2(-1, null, 2, null);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b8l, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482520f93);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f91042g = linearLayout;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482522f95);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f91039d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f482519f92);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f91040e = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f482521f94);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f91041f = (android.widget.ProgressBar) findViewById4;
        linearLayout.setBackground(b3.l.getDrawable(context, com.tencent.mm.R.drawable.f480772yj));
        e(-1);
        setOnClickListener(new al1.x(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new al1.y(this));
        this.f91046n = -1;
    }
}
