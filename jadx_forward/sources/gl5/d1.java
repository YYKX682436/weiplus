package gl5;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f354457a;

    /* renamed from: b, reason: collision with root package name */
    public final fl5.i f354458b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f354459c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f354460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f354461e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f354462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f354463g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f354464h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f354465i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f354466j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f354467k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f354468l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f354469m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f354470n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f354471o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f354472p;

    public d1(android.app.Activity activity, fl5.i oriEdt, android.view.ViewGroup editLayout, android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriEdt, "oriEdt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editLayout, "editLayout");
        this.f354457a = activity;
        this.f354458b = oriEdt;
        this.f354459c = editLayout;
        this.f354460d = view;
        this.f354461e = z17;
        this.f354464h = jz5.h.b(new gl5.x0(this));
        this.f354465i = jz5.h.b(new gl5.t0(this));
        this.f354466j = jz5.h.b(new gl5.c1(this));
        this.f354467k = jz5.h.b(new gl5.a1(this));
        this.f354468l = jz5.h.b(new gl5.y0(this));
        this.f354469m = jz5.h.b(new gl5.w0(this));
        this.f354470n = jz5.h.b(new gl5.s0(this));
        this.f354471o = jz5.h.b(new gl5.o0(this));
        this.f354472p = jz5.h.b(new gl5.q0(this));
    }

    public static final boolean a(gl5.d1 d1Var) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((jz5.n) d1Var.f354468l).mo141623x754a37bb();
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(d1Var.f354458b.j(), 0)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void b() {
        fl5.i iVar = this.f354458b;
        iVar.mo81353xc6fc1640().a();
        if (this.f354461e) {
            iVar.mo81585x843d819f(4);
            iVar.mo81358x8f2956f(true);
        }
        iVar.mo81586xc17f97e2(131073);
        iVar.mo81588x8dd5167d(7);
        java.lang.Object tag = this.f354459c.getTag(com.p314xaae8f345.mm.R.id.bkw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) tag;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
        layoutParams.width = measuredWidth;
        c().setLayoutParams(layoutParams);
        int[] iArr2 = new int[2];
        iVar.l().getLocationOnScreen(iArr2);
        float translationY = iArr2[1] - d().getTranslationY();
        int left = c().getLeft();
        int top = c().getTop();
        int i17 = measuredHeight + top;
        int i18 = iArr[0] - iArr2[0];
        int intValue = ((java.lang.Number) ((jz5.n) this.f354465i).mo141623x754a37bb()).intValue();
        int h17 = i65.a.h(this.f354457a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        android.view.ViewPropertyAnimator translationY2 = d().animate().translationX(i18).translationY(iArr[1] - translationY);
        translationY2.setInterpolator(ta5.h.f498412a.a());
        translationY2.setDuration(300L);
        translationY2.start();
        translationY2.setUpdateListener(new gl5.i0(this, left, top, measuredWidth + left, i17, h17, intValue, 0.5f, 0.0f));
        translationY2.setListener(new gl5.j0(this, translationY2));
    }

    public final android.widget.LinearLayout c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f354470n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.LinearLayout) mo141623x754a37bb;
    }

    public final android.view.View d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f354469m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public android.view.View e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f354464h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void f() {
        int[] iArr = new int[2];
        android.view.ViewGroup viewGroup = this.f354459c;
        viewGroup.getLocationOnScreen(iArr);
        android.app.Activity activity = this.f354457a;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activity);
        int f17 = i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenEditHelper", "initFullScreenEdtLayoutHeight editLayoutPos[0]=" + iArr[0] + " editLayoutPos[1]=" + iArr[1] + " editLayout.height=" + viewGroup.getHeight() + " bottomPadding=" + f17);
        int height = com.p314xaae8f345.mm.ui.b4.c(activity) ? ((iArr[1] + viewGroup.getHeight()) + f17) - h17 : ((iArr[1] + viewGroup.getHeight()) + f17) - (h17 * 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenEditHelper", "initFullScreenEdtLayoutHeight showHeight=" + height);
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        layoutParams.height = height;
        d().setLayoutParams(layoutParams);
    }

    public final void g(android.view.ViewGroup viewGroup) {
        fl5.i iVar = this.f354458b;
        int mo81569x6f2c472c = iVar.mo81569x6f2c472c();
        android.view.ViewParent g17 = iVar.g();
        android.view.ViewGroup viewGroup2 = g17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) g17 : null;
        if (viewGroup2 != null) {
            iVar.mo81353xc6fc1640().M = true;
            int indexOfChild = viewGroup2.indexOfChild(iVar.l());
            android.view.ViewGroup.LayoutParams layoutParams = iVar.l().getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
            layoutParams2.width = iVar.l().getMeasuredWidth();
            layoutParams2.height = iVar.l().getMeasuredHeight();
            android.view.View view = new android.view.View(this.f354457a);
            viewGroup2.addView(view, indexOfChild, layoutParams2);
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.bkw, view);
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.bkx, java.lang.Integer.valueOf(indexOfChild));
            viewGroup2.removeView(iVar.l());
            iVar.mo81353xc6fc1640().M = false;
        }
        java.lang.Object tag = viewGroup.getTag(com.p314xaae8f345.mm.R.id.bkx);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        viewGroup.addView(iVar.l(), num != null ? num.intValue() : -1);
        java.lang.Object tag2 = viewGroup.getTag(com.p314xaae8f345.mm.R.id.bkw);
        android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        iVar.k();
        iVar.mo81549xf579a34a(mo81569x6f2c472c);
    }

    public final void h(int i17) {
        if (this.f354462f && e().getParent() != null) {
            android.app.Activity activity = this.f354457a;
            if (com.p314xaae8f345.mm.ui.b4.c(activity)) {
                e().post(new gl5.b1(this));
                return;
            }
            int c17 = (((com.p314xaae8f345.mm.ui.bl.b(activity).y - i17) - com.p314xaae8f345.mm.ui.bl.c(activity)) - (com.p314xaae8f345.mm.ui.bl.h(activity) * 2)) + i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenEditHelper", "showHeight:" + c17 + ", height:" + i17 + ", screenHeight:" + com.p314xaae8f345.mm.ui.bl.b(activity).y + ", navigation:" + com.p314xaae8f345.mm.ui.bl.c(activity) + ", status:" + com.p314xaae8f345.mm.ui.bl.h(activity));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFullScreenEdtLayoutHeight:");
            sb6.append(c17);
            sb6.append(", stack:");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenEditHelper", sb6.toString());
            android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
            layoutParams.height = c17;
            d().setLayoutParams(layoutParams);
        }
    }
}
