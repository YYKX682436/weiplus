package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView;", "Landroid/widget/LinearLayout;", "", "Landroid/view/View;", "successMark", "Ljz5/f0;", "setAnchorView", "getInfoLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView */
/* loaded from: classes3.dex */
public final class C17328xd29825bc extends android.widget.LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f241232z = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f241233d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f241234e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f241235f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f241236g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f241237h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f241238i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f241239m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f241240n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.animation.Animation f241241o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241242p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f241243q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f241244r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241245s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f241246t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f241247u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f241248v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f241249w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f241250x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f241251y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17328xd29825bc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(boolean z17) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator updateListener;
        this.f241246t = false;
        this.f241247u = true;
        setVisibility(0);
        android.view.View view = this.f241237h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f241235f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f241234e;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            setVisibility(0);
            android.view.View view4 = this.f241237h;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewInternal", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view5 = this.f241234e;
        if (view5 == null) {
            return;
        }
        float translationX = view5.getTranslationX();
        int[] iArr = this.f241244r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f241234e);
        float paddingLeft = (translationX - iArr[0]) + r7.getPaddingLeft();
        android.view.View view6 = this.f241234e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view6);
        float translationY = view6.getTranslationY() - iArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f241234e);
        float paddingTop = translationY + r8.getPaddingTop();
        android.widget.ImageView imageView = this.f241238i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
            throw null;
        }
        imageView.setTranslationX(paddingLeft);
        android.widget.ImageView imageView2 = this.f241238i;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
            throw null;
        }
        imageView2.setTranslationY(paddingTop);
        android.view.View view7 = this.f241237h;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.f241234e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view8);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showInfoViewWithAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setScaleX(1.0f);
        view8.setScaleY(1.0f);
        android.view.View view9 = this.f241234e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view9);
        android.view.ViewPropertyAnimator animate = view9.animate();
        if (animate == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        float f17 = iArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f241234e);
        android.view.ViewPropertyAnimator translationY2 = alpha.translationY(f17 - r4.getPaddingTop());
        if (translationY2 != null) {
            float f18 = iArr[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f241234e);
            android.view.ViewPropertyAnimator translationX2 = translationY2.translationX(f18 - r3.getPaddingLeft());
            if (translationX2 == null || (duration = translationX2.setDuration(300L)) == null || (listener = duration.setListener(null)) == null || (updateListener = listener.setUpdateListener(new d04.z0(this, paddingLeft, paddingTop))) == null) {
                return;
            }
            updateListener.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r32) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc.b(boolean):void");
    }

    /* renamed from: getInfoLayout */
    public final android.view.View m68786xb093496e() {
        android.view.View view = this.f241237h;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        boolean z17 = this.f241245s;
        int[] iArr = this.f241244r;
        if (!z17) {
            android.widget.ImageView imageView = this.f241238i;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoIcon");
                throw null;
            }
            imageView.getLocationInWindow(iArr);
        }
        boolean z18 = this.f241242p;
        int[] iArr2 = this.f241240n;
        if (!z18) {
            android.view.View view = this.f241236g;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                throw null;
            }
            view.getLocationInWindow(iArr2);
        }
        int i19 = iArr[0];
        int i27 = iArr[1];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        if (iArr[0] != 0 || iArr[1] != 0) {
            this.f241245s = true;
            if (this.f241246t) {
                a(true);
            } else if (!this.f241247u) {
                android.view.View view2 = this.f241237h;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (iArr2[0] == 0 && iArr2[1] == 0) {
            return;
        }
        this.f241242p = true;
        if (this.f241248v) {
            b(this.f241249w);
            return;
        }
        if (this.f241250x) {
            return;
        }
        android.view.View view3 = this.f241235f;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setAnchorView */
    public final void m68787xcf1614fc(android.view.View view) {
        this.f241234e = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17328xd29825bc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f241240n = new int[2];
        this.f241244r = new int[2];
        this.f241251y = true;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.box, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241233d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f241235f = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f241236g = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241237h = findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f241238i = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.m_y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f241239m = (android.widget.TextView) findViewById6;
        android.view.View view = this.f241233d;
        if (view != null) {
            view.setOnTouchListener(d04.x0.f307080d);
            android.view.View view2 = this.f241237h;
            if (view2 != null) {
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f568263ma0);
                if (textView != null) {
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                }
                android.widget.TextView textView2 = this.f241239m;
                if (textView2 != null) {
                    com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("opButton");
                    throw null;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("infoLayout");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }
}
