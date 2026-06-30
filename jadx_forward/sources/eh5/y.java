package eh5;

/* loaded from: classes10.dex */
public abstract class y extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b f334510f;

    /* renamed from: g, reason: collision with root package name */
    public final double f334511g;

    /* renamed from: h, reason: collision with root package name */
    public final long f334512h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f334513i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f334514m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 f334515n;

    /* renamed from: o, reason: collision with root package name */
    public final eh5.p f334516o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f334517p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f334518q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f334519r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b chromeView) {
        super(chromeView.getContext(), com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chromeView, "chromeView");
        this.f334510f = chromeView;
        jz5.h.b(new eh5.r(this));
        this.f334511g = 0.35d;
        java.lang.Object d17 = bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20472xcc146331());
        java.lang.Long l17 = d17 instanceof java.lang.Long ? (java.lang.Long) d17 : null;
        this.f334512h = l17 != null ? l17.longValue() : 200L;
        this.f334516o = new eh5.p();
        if (chromeView.getImmersiveType() != eh5.a.f334484d) {
            throw new java.lang.IllegalArgumentException("Illegal Chrome Type");
        }
        C(1);
    }

    public final void E() {
        android.view.View view = this.f334514m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view.animate();
        long j17 = this.f334512h;
        animate.setDuration(j17).alpha(0.0f).start();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = this.f334515n;
        if (c22642x62f5b194 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator interpolator = c22642x62f5b194.animate().setDuration(j17).setInterpolator(new y3.b());
        if (this.f334515n != null) {
            interpolator.translationY(r2.getHeight() * (-1.0f)).setUpdateListener(new eh5.m(this)).withStartAction(new eh5.n(this)).withEndAction(new eh5.o(this)).start();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f334515n == null || this.f334514m == null || !isShowing()) {
            this.f334518q = false;
            super.dismiss();
            return;
        }
        if (this.f334517p) {
            this.f334518q = true;
            return;
        }
        this.f334518q = false;
        this.f334517p = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = this.f334515n;
        if (c22642x62f5b194 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        c22642x62f5b194.animate().cancel();
        android.view.View view = this.f334514m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
        view.animate().cancel();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1942 = this.f334515n;
        if (c22642x62f5b1942 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        if (c22642x62f5b1942.getHeight() > 0) {
            E();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1943 = this.f334515n;
        if (c22642x62f5b1943 != null) {
            c22642x62f5b1943.post(new eh5.q(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b abstractC22433x7fa3716b = this.f334510f;
        int height = pm0.v.t(abstractC22433x7fa3716b)[1] + abstractC22433x7fa3716b.getHeight();
        android.view.View view = new android.view.View(getContext());
        view.setBackground(new android.graphics.drawable.ColorDrawable(0));
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, height));
        view.setOnClickListener(new eh5.s(this));
        this.f334513i = view;
        android.view.View view2 = new android.view.View(getContext());
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(-16777216);
        colorDrawable.setAlpha((int) (256 * this.f334511g));
        view2.setBackground(colorDrawable);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = height;
        view2.setLayoutParams(layoutParams);
        view2.setOnClickListener(new eh5.t(this));
        this.f334514m = view2;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194(context);
        float h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        c22642x62f5b194.c(0.0f, 0.0f, h17, h17);
        ed5.w wVar = (ed5.w) this;
        c22642x62f5b194.setBackgroundColor(getContext().getResources().getColor(wVar.f332935v, null));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = height;
        c22642x62f5b194.setLayoutParams(layoutParams2);
        android.content.Context context2 = wVar.f332933t.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        yg5.b[] bVarArr = new yg5.b[1];
        yg5.a aVar = yg5.a.f543866d;
        java.util.List<com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g> a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g.f283284e.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g gVar : a17) {
            java.lang.String name = gVar.getClass().getName();
            java.lang.String string = wVar.getContext().getResources().getString(gVar.b());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            arrayList.add(new yg5.c(name, string, gVar == wVar.f332932s));
        }
        bVarArr[0] = new yg5.b("MsgHistoryGalleryType", null, aVar, arrayList, wVar.f332934u);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        yg5.b bVar = bVarArr[0];
        arrayList2.add(new yg5.d(bVar.f543868a, arrayList2.size(), bVar.f543869b, bVar.f543870c, bVar.f543872e));
        for (yg5.c cVar : bVar.f543871d) {
            arrayList2.add(new yg5.e(cVar.f543873a, bVar.f543868a, arrayList2.size(), cVar.f543874b, cVar.f543875c));
        }
        yg5.l lVar = new yg5.l(context2, null, 0, 0, arrayList2, 14, null);
        lVar.setPadding(wVar.F(16.0f), wVar.F(8.0f), wVar.F(16.0f), wVar.F(12.0f));
        lVar.setClipToPadding(false);
        c22642x62f5b194.addView(lVar);
        c22642x62f5b194.setClipToOutline(true);
        c22642x62f5b194.setOutlineProvider(this.f334516o);
        this.f334515n = c22642x62f5b194;
        android.view.View view3 = this.f334513i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gestureMask");
            throw null;
        }
        frameLayout.addView(view3);
        android.view.View view4 = this.f334514m;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
        frameLayout.addView(view4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1942 = this.f334515n;
        if (c22642x62f5b1942 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        frameLayout.addView(c22642x62f5b1942);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = this.f334510f.getImmersiveType() == eh5.a.f334484d ? 48 : 80;
        attributes.width = -1;
        attributes.height = -1;
        attributes.x = 0;
        attributes.y = 0;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 3;
        }
        window.setAttributes(attributes);
        window.clearFlags(262146);
        window.addFlags(-2147483104);
        n3.h2.a(window, false);
        window.setWindowAnimations(0);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // android.app.Dialog
    public void show() {
        this.f334518q = false;
        super.show();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = this.f334515n;
        if (c22642x62f5b194 == null || this.f334514m == null || this.f334517p) {
            return;
        }
        this.f334517p = true;
        if (c22642x62f5b194 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        c22642x62f5b194.animate().cancel();
        android.view.View view = this.f334514m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentDimMask");
            throw null;
        }
        view.animate().cancel();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b1942 = this.f334515n;
        if (c22642x62f5b1942 != null) {
            c22642x62f5b1942.post(new eh5.x(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
    }
}
