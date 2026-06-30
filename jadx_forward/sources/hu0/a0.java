package hu0;

/* loaded from: classes5.dex */
public final class a0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366541d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a f366542e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f366543f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f366544g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f366545h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f366546i;

    /* renamed from: m, reason: collision with root package name */
    public hu0.p f366547m;

    /* renamed from: n, reason: collision with root package name */
    public int f366548n;

    /* renamed from: o, reason: collision with root package name */
    public float f366549o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f366541d = jz5.h.b(hu0.y.f366597d);
        this.f366547m = hu0.p.f366578d;
    }

    public final void O6(int i17, float f17) {
        android.widget.FrameLayout frameLayout = this.f366543f;
        if (frameLayout == null) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null && frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0 && view.getWidth() > 0 && view.getHeight() > 0) {
            float e17 = e06.p.e(f17, 0.0f, 1.0f);
            this.f366549o = e17;
            float paddingTop = view.getPaddingTop();
            float f18 = paddingTop >= 0.0f ? paddingTop : 0.0f;
            float height = (view.getHeight() - i17) - f18;
            float f19 = (int) (80 * m158354x19263085().getResources().getDisplayMetrics().density);
            if (height < f19) {
                height = f19;
            }
            float e18 = ((e06.p.e(height / frameLayout.getHeight(), 0.1f, 1.0f) - 1.0f) * e17) + 1.0f;
            frameLayout.setPivotX(frameLayout.getWidth() / 2.0f);
            frameLayout.setPivotY(frameLayout.getHeight() / 2.0f);
            frameLayout.setScaleX(e18);
            frameLayout.setScaleY(e18);
            frameLayout.setTranslationX(((view.getWidth() / 2.0f) - (frameLayout.getLeft() + (frameLayout.getWidth() / 2.0f))) * e17);
            frameLayout.setTranslationY(((f18 + (height / 2.0f)) - (frameLayout.getTop() + (frameLayout.getHeight() / 2.0f))) * e17);
            android.view.View view2 = this.f366545h;
            if (view2 != null) {
                if (e17 < 1.0f) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                view2.setTranslationY((-view2.getHeight()) * e17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f - e17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                if (e17 >= 1.0f) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "applyEditPanelProgress", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.widget.FrameLayout frameLayout2 = this.f366544g;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setAlpha(1.0f - e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu0.a0.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Q6() {
        android.animation.ValueAnimator valueAnimator = this.f366546i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f366546i = null;
    }

    public final int R6() {
        int intValue;
        android.view.View rootView;
        android.view.Display defaultDisplay;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = m158354x19263085().getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(displayMetrics.heightPixels);
        java.lang.Integer num = null;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            intValue = valueOf.intValue();
        } else {
            android.widget.FrameLayout frameLayout = this.f366543f;
            if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(rootView.getHeight());
                if (valueOf2.intValue() > 0) {
                    num = valueOf2;
                }
            }
            intValue = num != null ? num.intValue() : m158354x19263085().getResources().getDisplayMetrics().heightPixels;
        }
        return (int) (intValue * 0.65d);
    }

    public final gu0.k2 S6() {
        return (gu0.k2) ((jz5.n) this.f366541d).mo141623x754a37bb();
    }

    public final void T6() {
        android.view.ViewTreeObserver viewTreeObserver;
        eu0.b bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onEditPanelCloseEnd");
        this.f366547m = hu0.p.f366578d;
        Q6();
        this.f366549o = 0.0f;
        this.f366548n = 0;
        android.widget.FrameLayout frameLayout = this.f366543f;
        if (frameLayout != null) {
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
            frameLayout.setTranslationX(0.0f);
            frameLayout.setTranslationY(0.0f);
        }
        android.view.View view = this.f366545h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setTranslationY(0.0f);
            view.setEnabled(true);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationRenderUIC", "restoreEditPanelLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gu0.k2 S6 = S6();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((S6 == null || (bVar = S6.f357258a) == null) ? null : bVar.f338228a, "reedit");
        android.widget.FrameLayout frameLayout2 = this.f366544g;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha(1.0f);
            frameLayout2.setVisibility(b17 ? 8 : 0);
        }
        android.widget.FrameLayout frameLayout3 = this.f366543f;
        if (frameLayout3 == null || (viewTreeObserver = frameLayout3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new hu0.q(frameLayout3));
    }

    public final void U6(boolean z17) {
        android.widget.FrameLayout frameLayout;
        eu0.b bVar;
        gu0.k2 S6 = S6();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((S6 == null || (bVar = S6.f357258a) == null) ? null : bVar.f338228a, "reedit") || (frameLayout = this.f366544g) == null) {
            return;
        }
        frameLayout.setEnabled(z17);
        if (this.f366547m == hu0.p.f366578d) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(z17 ? 1.0f : 0.5f);
        }
    }

    public final void V6(float f17, float f18, int i17) {
        Q6();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(e06.p.e(f17, 0.0f, 1.0f), e06.p.e(f18, 0.0f, 1.0f));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new hu0.z(f18, this, i17));
        ofFloat.start();
        this.f366546i = ofFloat;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onDestroy");
        Q6();
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f366542e;
        if (surfaceHolderCallbackC28529xf54f34a != null) {
            android.view.ViewParent parent = surfaceHolderCallbackC28529xf54f34a.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(surfaceHolderCallbackC28529xf54f34a);
            }
        }
        this.f366542e = null;
        this.f366543f = null;
        this.f366544g = null;
        this.f366545h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        eu0.b bVar;
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f366543f = (android.widget.FrameLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxg);
        this.f366545h = contentView.findViewById(com.p314xaae8f345.mm.R.id.sok);
        android.widget.FrameLayout frameLayout = this.f366543f;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new hu0.q(frameLayout));
        }
        gu0.k2 S6 = S6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = null;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((S6 == null || (bVar = S6.f357258a) == null) ? null : bVar.f338228a, "reedit");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1942 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxd);
        if (c22642x62f5b1942 != null) {
            c22642x62f5b1942.setOnClickListener(new hu0.x(this));
            if (b17) {
                c22642x62f5b1942.setVisibility(8);
            }
            c22642x62f5b194 = c22642x62f5b1942;
        }
        this.f366544g = c22642x62f5b194;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.RenderUIC", "onViewCreated: renderContainer=" + this.f366543f + ", isReedit=" + b17);
    }
}
