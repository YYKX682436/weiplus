package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0003\t\f\u0005B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0012H\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout;", "Landroid/widget/LinearLayout;", "Lmi1/i2;", "Lmi1/j0;", "", "Lal1/b0;", "onTranslateRectCallback", "Ljz5/f0;", "setOnTranslateRectCallback", "Lal1/z;", "onHideCallback", "setOnHideCallback", "Lal1/a0;", "onTranslateClick", "setOnTranslateClick", "", "color", "setStyleColor", "Lmi1/h2;", "getCurrentState", "Landroid/view/View;", "h", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "setDivider", "(Landroid/view/View;)V", "divider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout */
/* loaded from: classes7.dex */
public final class C12763x195d5f32 extends android.widget.LinearLayout implements mi1.i2 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f172571s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f172572d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f172573e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f172574f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f172575g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.view.View divider;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172577i;

    /* renamed from: m, reason: collision with root package name */
    public final mi1.h2 f172578m;

    /* renamed from: n, reason: collision with root package name */
    public int f172579n;

    /* renamed from: o, reason: collision with root package name */
    public al1.b0 f172580o;

    /* renamed from: p, reason: collision with root package name */
    public al1.z f172581p;

    /* renamed from: q, reason: collision with root package name */
    public al1.a0 f172582q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.AnimatorSet f172583r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12763x195d5f32(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // mi1.i2
    public java.lang.Object a(mi1.h2 h2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17 = h2Var.f408100a;
        android.widget.TextView textView = this.f172572d;
        android.widget.ImageView imageView = this.f172573e;
        android.widget.LinearLayout linearLayout = this.f172575g;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(150L);
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
            android.animation.Animator duration = android.animation.ValueAnimator.ofInt(0, 1).setDuration(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
            ofFloat4.setDuration(150L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            ofFloat5.setDuration(150L);
            android.view.View view2 = this.divider;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
            ofFloat6.setDuration(150L);
            animatorSet3.playTogether(ofFloat4, ofFloat5, ofFloat6);
            android.animation.Animator b18 = b(linearLayout, c17, 0);
            b18.addListener(new al1.e0(this));
            animatorSet.playSequentially(b17, animatorSet2, duration, animatorSet3, b18);
            this.f172583r = animatorSet;
            animatorSet.start();
        } else if (i17 == 1) {
            int i18 = this.f172579n;
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
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
                android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(view3, "alpha", 0.0f, 1.0f);
                ofFloat9.setDuration(150L);
                animatorSet5.playTogether(ofFloat7, ofFloat8, ofFloat9);
                animatorSet4.playSequentially(b19, animatorSet5);
                animatorSet4.start();
                this.f172583r = animatorSet4;
            } else {
                d(false);
                this.f172577i = true;
            }
        } else if (i17 != 2) {
            int i19 = this.f172579n;
            if (i19 != -1 && i19 != 3) {
                e(-1);
            }
        } else {
            e(2);
            this.f172577i = true;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f);
            ofFloat12.setDuration(150L);
            animatorSet7.playTogether(ofFloat10, ofFloat11, ofFloat12);
            android.animation.Animator b27 = b(linearLayout, c18, 0);
            b27.addListener(new al1.c0(this));
            animatorSet6.playSequentially(duration2, animatorSet7, b27);
            animatorSet6.start();
            this.f172583r = animatorSet6;
        }
        return jz5.f0.f384359a;
    }

    public final android.animation.ValueAnimator b(android.view.View view, int i17, int i18) {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.addUpdateListener(new al1.g0(view));
        return ofInt;
    }

    public final int c() {
        int a17 = this.f172573e.getVisibility() == 8 ? 0 : com.p314xaae8f345.mm.ui.zk.a(getContext(), 34);
        android.widget.TextView textView = this.f172572d;
        return (int) (a17 + textView.getPaint().measureText(textView.getText().toString()) + (this.f172574f.getVisibility() != 8 ? com.p314xaae8f345.mm.ui.zk.a(getContext(), 26) : 0) + com.p314xaae8f345.mm.ui.zk.a(getContext(), 22));
    }

    public final void d(boolean z17) {
        android.animation.AnimatorSet animatorSet = this.f172583r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f172583r = null;
        this.f172573e.setAlpha(1.0f);
        this.f172572d.setAlpha(1.0f);
        android.view.View view = this.divider;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "resetAnimation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "resetAnimation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f172575g.getLayoutParams().width = z17 ? 0 : c();
    }

    public final void e(int i17) {
        this.f172579n = i17;
        this.f172578m.f408100a = i17;
        android.widget.ProgressBar progressBar = this.f172574f;
        android.widget.LinearLayout linearLayout = this.f172575g;
        android.widget.TextView textView = this.f172572d;
        android.widget.ImageView imageView = this.f172573e;
        if (i17 == 0) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572155ln5));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78489xa4e92878);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            android.view.View view = this.divider;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 1) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmo));
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(0);
            imageView.setVisibility(8);
            android.view.View view2 = this.divider;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            linearLayout.setVisibility(0);
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lly));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78490xfa9a173c);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            android.view.View view3 = this.divider;
            if (view3 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
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
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandTranslateLayout", "transTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        al1.z zVar = this.f172581p;
        if (zVar != null) {
            tj1.q qVar = (tj1.q) zVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = qVar.f501241a.t3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t37, "getRuntime(...)");
            if (mi1.o0.f408186b) {
                t37.f156354z.f408239e.c(new mi1.j0(2, -1, 3, 0L, -1, 0L, null, 0, 0L, null, 1000, null));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.CapsuleAnimatorEventHelper", "showTranslate: isEnable = false");
            }
            mi1.v vVar = qVar.f501242b;
            if (vVar != null) {
                vVar.l();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiUpdateTranslateEntry", "showTranslate STATE_HIDE");
        }
    }

    @Override // mi1.i2
    /* renamed from: getCurrentState, reason: from getter */
    public mi1.h2 getF172578m() {
        return this.f172578m;
    }

    public final android.view.View getDivider() {
        return this.divider;
    }

    /* renamed from: setDivider */
    public final void m53344x150a9c57(android.view.View view) {
        this.divider = view;
    }

    /* renamed from: setOnHideCallback */
    public final void m53345x430fc028(al1.z onHideCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onHideCallback, "onHideCallback");
        this.f172581p = onHideCallback;
    }

    /* renamed from: setOnTranslateClick */
    public final void m53346x3ccd291b(al1.a0 onTranslateClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslateClick, "onTranslateClick");
        this.f172582q = onTranslateClick;
    }

    /* renamed from: setOnTranslateRectCallback */
    public final void m53347x45f5bb56(al1.b0 onTranslateRectCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTranslateRectCallback, "onTranslateRectCallback");
        this.f172580o = onTranslateRectCallback;
    }

    /* renamed from: setStyleColor */
    public final void m53348x23320e34(int i17) {
        android.graphics.drawable.Drawable drawable = null;
        android.widget.ProgressBar progressBar = this.f172574f;
        android.widget.ImageView imageView = this.f172573e;
        android.widget.TextView textView = this.f172572d;
        if (i17 == -1) {
            android.view.View view = this.divider;
            if (view != null) {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560166cs);
            }
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560174ov));
            imageView.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
            android.graphics.drawable.Drawable m9707x4a96be14 = b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.avr);
            if (m9707x4a96be14 != null) {
                m9707x4a96be14.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(getContext(), 16), com.p314xaae8f345.mm.ui.zk.a(getContext(), 16));
                drawable = m9707x4a96be14;
            }
            progressBar.setIndeterminateDrawable(drawable);
            return;
        }
        android.view.View view2 = this.divider;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560167ct);
        }
        textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.afd));
        imageView.setColorFilter(-16777216, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.graphics.drawable.Drawable m9707x4a96be142 = b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.avm);
        if (m9707x4a96be142 != null) {
            m9707x4a96be142.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(getContext(), 16), com.p314xaae8f345.mm.ui.zk.a(getContext(), 16));
            drawable = m9707x4a96be142;
        }
        progressBar.setIndeterminateDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12763x195d5f32(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f172578m = new mi1.h2(-1, null, 2, null);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b8l, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564053f93);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f172575g = linearLayout;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f564055f95);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f172572d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f564052f92);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f172573e = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f564054f94);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f172574f = (android.widget.ProgressBar) findViewById4;
        linearLayout.setBackground(b3.l.m9707x4a96be14(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562305yj));
        e(-1);
        setOnClickListener(new al1.x(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new al1.y(this));
        this.f172579n = -1;
    }
}
