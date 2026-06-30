package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView */
/* loaded from: classes8.dex */
public class C12766x2cdb734f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 implements cl1.m0 {
    public java.util.List G;
    public cl1.k0 H;
    public cl1.l0 I;

    /* renamed from: J, reason: collision with root package name */
    public int f172612J;
    public boolean K;
    public boolean L;
    public final android.graphics.Rect M;

    public C12766x2cdb734f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.I = null;
        this.f172612J = 0;
        this.K = true;
        this.L = false;
        this.M = new android.graphics.Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetX */
    public float m53358xe18269ef() {
        return (-this.f172612J) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetY */
    public float m53359xe18269f0() {
        return ((-0.0f) - i65.a.b(getContext(), 40)) - (((cl1.j.a(getContext()) * 1.5f) + (i65.a.b(getContext(), 8) * 2)) / 2.0f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7
    public dl1.c a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        dl1.f fVar = new dl1.f(this, this.G, new cl1.g(this));
        m53367x10fff61d();
        fVar.f316713d = new cl1.h(this);
        return fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7
    public boolean b(android.view.MotionEvent motionEvent) {
        if (this.f172641i.m8185xcdaf1228() == 1) {
            return false;
        }
        return super.b(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 g(float f17, float f18, boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa = m53368x4905e9fa();
        android.graphics.Rect rect = this.C;
        m53368x4905e9fa.getGlobalVisibleRect(rect);
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (!rect.contains(i17, i18)) {
            return null;
        }
        boolean z18 = false;
        int i19 = 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = null;
        while (true) {
            if (i19 >= m53368x4905e9fa().getChildCount()) {
                k3Var = null;
                break;
            }
            k3Var = m53368x4905e9fa().w0(m53368x4905e9fa().getChildAt(i19));
            if (k3Var.m8185xcdaf1228() != 5 && k3Var.m8185xcdaf1228() != 3) {
                k3Var.f3639x46306858.getGlobalVisibleRect(rect);
                if (rect.contains(i17, i18)) {
                    z18 = true;
                    k3Var2 = k3Var;
                    break;
                }
                k3Var2 = k3Var;
            }
            i19++;
        }
        if (z18) {
            return k3Var;
        }
        if (z17 || ((f17 <= rect.right || f18 <= rect.top) && f18 <= rect.bottom)) {
            return null;
        }
        return k3Var2;
    }

    public android.view.View o(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, cl1.z zVar) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bno, (android.view.ViewGroup) null, false);
        inflate.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2));
        cl1.z zVar2 = new cl1.z(inflate);
        android.view.View view = zVar2.f3639x46306858;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int[] iArr = new int[2];
        zVar.f124437f.getLocationOnScreen(iArr);
        android.widget.ImageView imageView = zVar.f124437f;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        android.widget.ImageView imageView2 = zVar2.f124437f;
        imageView2.setImageDrawable(drawable);
        imageView2.setBackground(imageView.getBackground());
        android.widget.TextView textView = zVar.f124441m;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = zVar2.f124441m;
        textView2.setText(text);
        textView2.setVisibility(textView.getVisibility());
        android.widget.ImageView imageView3 = zVar2.f124442n;
        imageView3.setVisibility(4);
        float a17 = cl1.j.a(getContext());
        float b17 = (a17 * 1.5f) + (i65.a.b(getContext(), 8) * 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopDragView", "fillFloatView iconLayout: %f", java.lang.Float.valueOf(b17));
        int i17 = (int) b17;
        view.findViewById(com.p314xaae8f345.mm.R.id.h7g).getLayoutParams().height = i17;
        android.view.ViewGroup viewGroup = zVar2.f124439h;
        viewGroup.getLayoutParams().height = i17;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int i18 = (int) a17;
        layoutParams.width = ((int) (i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3) * 2 * cl1.k.a(getContext()))) + i18;
        imageView2.getLayoutParams().width = i18;
        imageView2.getLayoutParams().height = i18;
        android.widget.ImageView imageView4 = zVar2.f124438g;
        imageView4.getLayoutParams().width = i18;
        imageView4.getLayoutParams().height = i18;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
        if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).topMargin = i65.a.b(getContext(), 6) + ((int) ((a17 * 0.5f) / 2.0f));
            layoutParams2.width = (int) (getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * cl1.k.a(getContext()));
            layoutParams2.height = (int) (getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * cl1.k.a(getContext()));
        }
        float f17 = a17 / 2.0f;
        int i19 = (int) (iArr[0] + f17);
        iArr[0] = i19;
        iArr[1] = (int) (iArr[1] + f17);
        float m53358xe18269ef = i19 + m53358xe18269ef();
        float m53359xe18269f0 = iArr[1] + m53359xe18269f0();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.a0k);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopDragView", "fillFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;Lcom/tencent/mm/plugin/appbrand/widget/desktop/AppBrandItemHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.findViewById(com.p314xaae8f345.mm.R.id.f566831h75).animate().alpha(0.5f).setDuration(300L).setListener(null).start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "enableScroll %b", java.lang.Boolean.FALSE);
        this.f172655z = false;
        view.findViewById(com.p314xaae8f345.mm.R.id.f566831h75).animate().scaleX(1.5f).scaleY(1.5f).setDuration(300L).setListener(new cl1.i(this)).start();
        android.widget.ImageView imageView5 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhu);
        imageView5.getLayoutParams().height = (int) (i65.a.b(getContext(), 24) * cl1.k.a(getContext()));
        imageView5.getLayoutParams().width = (int) (i65.a.b(getContext(), 24) * cl1.k.a(getContext()));
        imageView5.setTranslationY(((-a17) * 0.5f) / 2.0f);
        imageView5.setTranslationX((a17 * 0.5f) / 2.0f);
        view.setTranslationX(m53358xe18269ef);
        view.setTranslationY(m53359xe18269f0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopDragView", "fillFloatView offsetX: %f, transX: %f, transY: %f", java.lang.Float.valueOf(m53358xe18269ef()), java.lang.Float.valueOf(m53358xe18269ef), java.lang.Float.valueOf(m53359xe18269f0));
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.graphics.Rect rect = this.f172645p;
        getGlobalVisibleRect(rect);
        int i28 = rect.left;
        int i29 = rect.bottom;
        int i37 = this.f172636d;
        rect.set(i28, ((i29 - i37) - ((int) (getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a2a) * 1.0f))) - 40, rect.right, rect.bottom - i37);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopDragView", "bottomRect: %s", rect);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa = m53368x4905e9fa();
        android.graphics.Rect rect2 = this.f172646q;
        m53368x4905e9fa.getGlobalVisibleRect(rect2);
        rect2.set(rect2.left, 0, rect2.right, rect2.top + i37);
    }

    @Override // cl1.m0
    /* renamed from: setAppBrandDragCallback */
    public void mo15087xf427e221(cl1.k0 k0Var) {
        this.H = k0Var;
    }

    @Override // cl1.m0
    /* renamed from: setCanMyWeAppMove */
    public void mo15088x8fc925aa(boolean z17) {
        this.K = z17;
    }

    @Override // cl1.m0
    /* renamed from: setList */
    public void mo15089x764ce020(java.util.List list) {
        this.G = list;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7
    /* renamed from: setRubbishViewVisible */
    public void mo53360x389f1734(int i17) {
        super.mo53360x389f1734(i17);
    }

    @Override // cl1.m0
    /* renamed from: setSectionCallback */
    public void mo15091xfb17b988(cl1.l0 l0Var) {
        this.I = l0Var;
    }

    @Override // cl1.m0
    /* renamed from: setShouldDoDeleteAnimation */
    public void mo15092x322ebdd9(boolean z17) {
        this.L = z17;
    }

    @Override // cl1.m0
    /* renamed from: setViewWidth */
    public void mo15093xfd8913df(int i17) {
        this.f172612J = i17;
    }

    public C12766x2cdb734f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = null;
        this.I = null;
        this.f172612J = 0;
        this.K = true;
        this.L = false;
        this.M = new android.graphics.Rect();
    }
}
