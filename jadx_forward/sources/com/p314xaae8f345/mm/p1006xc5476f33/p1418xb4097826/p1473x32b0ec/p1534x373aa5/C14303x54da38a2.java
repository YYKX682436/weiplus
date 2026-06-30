package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\r¢\u0006\u0004\b&\u0010'R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR*\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010 \u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;", "Landroid/widget/RelativeLayout;", "Los5/p;", "Lkotlin/Function1;", "", "Ljz5/f0;", "d", "Lyz5/l;", "getOnModeSwitch", "()Lyz5/l;", "setOnModeSwitch", "(Lyz5/l;)V", "onModeSwitch", "", "e", "getOnSuitSwitch", "setOnSuitSwitch", "onSuitSwitch", "value", "g", "I", "getSuit", "()I", "setSuit", "(I)V", "suit", "h", "Z", "getSuitMode", "()Z", "setSuitMode", "(Z)V", "suitMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView */
/* loaded from: classes3.dex */
public final class C14303x54da38a2 extends android.widget.RelativeLayout implements os5.p {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l onModeSwitch;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSuitSwitch;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.Animator f197355f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int suit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean suitMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14303x54da38a2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, int i17, int i18, int i19, float f17) {
        int b17;
        int b18;
        if (c14303x54da38a2.suitMode) {
            b17 = a06.d.b(i17 * f17);
            b18 = a06.d.b(i18 * f17);
        } else {
            float f18 = 1 - f17;
            b17 = a06.d.b(i17 * f18);
            b18 = a06.d.b(i18 * f18);
        }
        int i27 = b18 + i19;
        android.view.ViewGroup.LayoutParams layoutParams = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.f566116es5).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = b17;
        layoutParams2.rightMargin = i27;
        c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.f566116es5).setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es6).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = b17;
        c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es6).setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es7).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.topMargin = b17;
        layoutParams6.leftMargin = i27;
        c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es7).setLayoutParams(layoutParams6);
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, float f17) {
        android.view.View findViewById = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.erz);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$2$execute$1", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$2$execute$1", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, int i17, int i18, float f17) {
        float f18 = ((i18 - i17) * f17) + i17;
        ((android.widget.TextView) c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.f566116es5)).setTextSize(0, f18);
        ((android.widget.TextView) c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es6)).setTextSize(0, f18);
        ((android.widget.TextView) c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.es7)).setTextSize(0, f18);
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, float f17) {
        android.view.View findViewById = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.esb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View findViewById2 = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.ern);
        float f18 = 1 - f17;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View findViewById3 = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.erp);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View findViewById4 = c14303x54da38a2.findViewById(com.p314xaae8f345.mm.R.id.err);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "_set_suitMode_$lambda$6$execute$5", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2) {
        boolean z17 = !c14303x54da38a2.getSuitMode();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchModeByUser mode=" + z17);
        c14303x54da38a2.mo57267x7a708d2(z17);
        yz5.l onModeSwitch = c14303x54da38a2.getOnModeSwitch();
        if (onModeSwitch != null) {
            onModeSwitch.mo146xb9724478(java.lang.Boolean.valueOf(c14303x54da38a2.getSuitMode()));
        }
    }

    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2 c14303x54da38a2, int i17) {
        c14303x54da38a2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", "#switchSuitByUser suitSelect=" + i17);
        if (c14303x54da38a2.getSuit() == i17 && c14303x54da38a2.getSuitMode()) {
            int i18 = qs5.f.f447964a;
            i17 = -1;
        }
        c14303x54da38a2.mo57266x76503a8f(i17);
        yz5.l onSuitSwitch = c14303x54da38a2.getOnSuitSwitch();
        if (onSuitSwitch != null) {
            onSuitSwitch.mo146xb9724478(java.lang.Integer.valueOf(c14303x54da38a2.getSuit()));
        }
    }

    public final void g() {
        int color = getContext().getResources().getColor(getSuitMode() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560783u2);
        int color2 = getContext().getResources().getColor(getSuitMode() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560577o8 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560788u7);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566116es5);
        int suit = getSuit();
        int i17 = qs5.f.f447964a;
        textView.setTextColor(suit == 0 ? color2 : color);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.es6)).setTextColor(getSuit() == 1 ? color2 : color);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.es7);
        if (getSuit() == 2) {
            color = color2;
        }
        textView2.setTextColor(color);
        if (getSuitMode()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566116es5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.ui.fk.c((android.widget.TextView) findViewById);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.es6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            com.p314xaae8f345.mm.ui.fk.c((android.widget.TextView) findViewById2);
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.es7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            com.p314xaae8f345.mm.ui.fk.c((android.widget.TextView) findViewById3);
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566116es5);
            if (textView3 != null) {
                textView3.setTypeface(textView3.getTypeface(), getSuit() == 0 ? 1 : 0);
            }
            android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.es6);
            if (textView4 != null) {
                textView4.setTypeface(textView4.getTypeface(), getSuit() == 1 ? 1 : 0);
            }
            android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.es7);
            if (textView5 != null) {
                textView5.setTypeface(textView5.getTypeface(), getSuit() != 2 ? 0 : 1);
            }
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f566116es5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById4);
    }

    public yz5.l getOnModeSwitch() {
        return this.onModeSwitch;
    }

    public yz5.l getOnSuitSwitch() {
        return this.onSuitSwitch;
    }

    @Override // os5.p
    public int getSuit() {
        return this.suit;
    }

    public boolean getSuitMode() {
        return this.suitMode;
    }

    public final void h(android.widget.TextView textView, float f17) {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.Animator animator = this.f197355f;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // os5.p
    /* renamed from: setOnModeSwitch */
    public void mo57264xb275c378(yz5.l lVar) {
        this.onModeSwitch = lVar;
    }

    @Override // os5.p
    /* renamed from: setOnSuitSwitch */
    public void mo57265x6ac5d62(yz5.l lVar) {
        this.onSuitSwitch = lVar;
    }

    @Override // os5.p
    /* renamed from: setSuit */
    public void mo57266x76503a8f(int i17) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#suit set value=");
        sb6.append(i17);
        sb6.append(" field=");
        sb6.append(this.suit);
        sb6.append(" isAnimatorRunning=");
        android.animation.Animator animator = this.f197355f;
        sb6.append(animator != null ? java.lang.Boolean.valueOf(animator.isRunning()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulSuitView", sb6.toString());
        if (i17 != this.suit) {
            android.animation.Animator animator2 = this.f197355f;
            if (animator2 != null && animator2.isRunning()) {
                return;
            }
            this.suit = i17;
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566115es4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ero);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.erq);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ers);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById(com.p314xaae8f345.mm.R.id.f566112es1).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayw);
            findViewById(com.p314xaae8f345.mm.R.id.f566113es2).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayw);
            findViewById(com.p314xaae8f345.mm.R.id.f566114es3).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayw);
            android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ert);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(4);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.erv);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(4);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.erx);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(4);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i18 = this.suit;
            int i19 = qs5.f.f447964a;
            if (i18 == 0) {
                view3 = findViewById(com.p314xaae8f345.mm.R.id.ero);
                view = findViewById(com.p314xaae8f345.mm.R.id.f566112es1);
                view2 = findViewById(com.p314xaae8f345.mm.R.id.ert);
            } else if (i18 == 1) {
                view3 = findViewById(com.p314xaae8f345.mm.R.id.erq);
                view = findViewById(com.p314xaae8f345.mm.R.id.f566113es2);
                view2 = findViewById(com.p314xaae8f345.mm.R.id.erv);
            } else if (i18 == 2) {
                view3 = findViewById(com.p314xaae8f345.mm.R.id.ers);
                view = findViewById(com.p314xaae8f345.mm.R.id.f566114es3);
                view2 = findViewById(com.p314xaae8f345.mm.R.id.erx);
            } else {
                view = null;
                view2 = null;
                view3 = null;
            }
            if (this.suit == -1) {
                android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.f566115es4);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                if (view3 != null) {
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view3, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null) {
                    view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayx);
                }
                if (view2 != null) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(0);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view2, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCameraOptBeautyPowerfulSuitView", "setSuit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r0.isRunning() == true) goto L14;
     */
    @Override // os5.p
    /* renamed from: setSuitMode */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo57267x7a708d2(boolean r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14303x54da38a2.mo57267x7a708d2(boolean):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14303x54da38a2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i18 = qs5.f.f447964a;
        this.suit = -1000;
        this.suitMode = true;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.aog, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ert);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.w2(this));
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.erv);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x2(this));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.erx);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.y2(this));
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f566112es1);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.z2(this));
        }
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f566113es2);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a3(this));
        }
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f566114es3);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b3(this));
        }
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.ern);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c3(this));
        }
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.erp);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.d3(this));
        }
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.err);
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.e3(this));
        }
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.eru);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        h((android.widget.TextView) findViewById10, 14.0f);
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.erw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        h((android.widget.TextView) findViewById11, 14.0f);
        android.view.View findViewById12 = findViewById(com.p314xaae8f345.mm.R.id.ery);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        h((android.widget.TextView) findViewById12, 14.0f);
        android.view.View findViewById13 = findViewById(com.p314xaae8f345.mm.R.id.f566116es5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        h((android.widget.TextView) findViewById13, 24.0f);
        android.view.View findViewById14 = findViewById(com.p314xaae8f345.mm.R.id.es6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        h((android.widget.TextView) findViewById14, 24.0f);
        android.view.View findViewById15 = findViewById(com.p314xaae8f345.mm.R.id.es7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        h((android.widget.TextView) findViewById15, 24.0f);
    }
}
