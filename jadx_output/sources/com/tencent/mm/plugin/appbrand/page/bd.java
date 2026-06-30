package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class bd extends android.widget.FrameLayout implements al1.i {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86442d;

    /* renamed from: e, reason: collision with root package name */
    public al1.l f86443e;

    /* renamed from: f, reason: collision with root package name */
    public al1.b f86444f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86445g;

    public bd(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(context);
        this.f86445g = false;
        this.f86442d = v5Var;
        k91.f M1 = v5Var.M1();
        if (M1 == null) {
            return;
        }
        if (M1.a()) {
            al1.l lVar = new al1.l(getContext());
            this.f86443e = lVar;
            lVar.setActuallyVisible(false);
            al1.b bVar = (al1.b) v5Var.A1().a(getContext(), al1.b.class);
            this.f86444f = bVar;
            bVar.setFullscreenMode(false);
            this.f86444f.l(true, al1.h0.PageConfig);
            try {
                mi1.v vVar = v5Var.getRuntime().f74821z;
                com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView capsuleView = this.f86444f.getCapsuleView();
                if (capsuleView != null) {
                    mi1.i iVar = vVar.f326704c;
                    if (iVar == null) {
                        kotlin.jvm.internal.o.o("capsuleBarView");
                        throw null;
                    }
                    capsuleView.setFixedWidth(iVar.getCapsuleContentAreaView().getMeasuredWidth());
                } else {
                    vVar.getClass();
                }
            } catch (java.lang.NullPointerException unused) {
            }
            b();
            this.f86443e.addView(this.f86444f);
            addView(this.f86443e, -1, -2);
        }
        java.lang.String str = M1.f305718g;
        int i17 = v5Var.getRuntime().m0().g() ? -15132391 : -1;
        try {
            i17 = ik1.w.l(str);
        } catch (java.lang.Exception unused2) {
        }
        setBackgroundColor(i17);
    }

    public final void a() {
        if (this.f86444f != null) {
            if (getVisibility() == 0) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.x0.b(this)) {
                    this.f86444f.setLoadingIconVisibility(true);
                    this.f86443e.setActuallyVisible(true);
                    return;
                }
            }
            this.f86444f.setLoadingIconVisibility(false);
            this.f86443e.setActuallyVisible(false);
        }
    }

    public final void b() {
        if (this.f86444f == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86442d;
        if (android.text.TextUtils.isEmpty(v5Var.r1().getMainTitle())) {
            this.f86444f.setMainTitle(getContext().getString(com.tencent.mm.R.string.it));
        } else {
            this.f86444f.setMainTitle(v5Var.r1().getMainTitle());
        }
        this.f86444f.setNavHidden(v5Var.r1().f5745v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        if (i17 == 0) {
            setWillNotDraw(true);
            return;
        }
        int i18 = i17 | (-16777216);
        setWillNotDraw(false);
        super.setBackgroundColor(i18);
        al1.b bVar = this.f86444f;
        if (bVar != null) {
            bVar.setBackgroundAlpha(1.0d);
            this.f86444f.setBackgroundColor(i18);
            boolean z17 = !com.tencent.mm.ui.uk.g(i18);
            this.f86444f.setForegroundStyle(z17);
            al1.l lVar = this.f86443e;
            if (lVar != null) {
                lVar.setStatusBarForegroundStyle(z17);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        a();
    }
}
