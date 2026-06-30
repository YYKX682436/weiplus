package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class l2 implements ql1.a {

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Integer f91527j;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.q5 f91529b;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f91534g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.j2 f91535h;

    /* renamed from: a, reason: collision with root package name */
    public int f91528a = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f91530c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f91531d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f91532e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public boolean f91533f = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedHashSet f91536i = new java.util.LinkedHashSet();

    public static int c(android.content.Context context) {
        if (f91527j == null) {
            f91527j = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.d2.g(context));
        }
        return f91527j.intValue();
    }

    public static boolean h(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return false;
        }
        if (f91527j == null) {
            f91527j = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.d2.g(context));
        }
        if (f91527j.intValue() == i17) {
            return false;
        }
        f91527j = java.lang.Integer.valueOf(i17);
        return true;
    }

    public void a(com.tencent.mm.plugin.appbrand.widget.input.k2 k2Var) {
        if (k2Var != null) {
            java.util.LinkedHashSet linkedHashSet = this.f91536i;
            if (linkedHashSet.contains(k2Var)) {
                return;
            }
            linkedHashSet.add(k2Var);
        }
    }

    public final int b() {
        int i17;
        android.view.View view = this.f91534g;
        if ((view == null ? null : view.getRootView()) == null) {
            return 0;
        }
        android.view.View view2 = this.f91534g;
        android.graphics.Rect rect = this.f91532e;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
            android.view.View view3 = this.f91534g;
            int[] iArr = this.f91531d;
            view3.getLocationInWindow(iArr);
            rect.top = iArr[1];
        }
        android.view.View view4 = this.f91534g;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(view4)) {
            i17 = this.f91534g.getMeasuredHeight();
        } else {
            android.view.View view5 = this.f91534g;
            i17 = (view5 == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : view5.getContext()).getResources().getDisplayMetrics().heightPixels;
        }
        return i17 - rect.top;
    }

    public final void d(int i17) {
        if (this.f91530c == 0) {
            this.f91530c = i17;
        }
        int b17 = b() - i17;
        if (b17 <= 0) {
            return;
        }
        android.view.View view = this.f91534g;
        boolean h17 = h(view == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : view.getContext(), b17);
        java.util.Iterator it = ((java.util.LinkedHashSet) this.f91536i.clone()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.widget.input.k2 k2Var = (com.tencent.mm.plugin.appbrand.widget.input.k2) it.next();
            if (k2Var.getHeight() != b17) {
                k2Var.d(b17);
            }
        }
        com.tencent.mm.plugin.appbrand.widget.input.j2 j2Var = this.f91535h;
        if (j2Var == null) {
            return;
        }
        if (h17 || j2Var.getHeight() != b17) {
            this.f91535h.d(b17);
        }
    }

    public void e(android.view.View view, boolean z17, int i17) {
        this.f91534g = view;
        if (1 != this.f91528a) {
            return;
        }
        if (this.f91530c == 0) {
            this.f91530c = i17;
        }
        d(b() - i17);
        k(z17);
        this.f91530c = i17;
        this.f91534g = null;
    }

    public void f(android.view.View view, boolean z17, int i17, int i18, int i19, int i27) {
        this.f91534g = view;
        if (1 != this.f91528a) {
            return;
        }
        android.graphics.Rect rect = this.f91532e;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
            android.view.View view2 = this.f91534g;
            int[] iArr = this.f91531d;
            view2.getLocationInWindow(iArr);
            rect.top = iArr[1];
        }
        int height = rect.height();
        d(height);
        k(b() > height);
        this.f91530c = height;
        this.f91534g = null;
    }

    public void g(com.tencent.mm.plugin.appbrand.widget.input.k2 k2Var) {
        if (k2Var != null) {
            this.f91536i.remove(k2Var);
        }
    }

    public void i(int i17) {
        this.f91528a = i17;
        if (i17 == 1) {
            com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var = this.f91529b;
            if (q5Var != null) {
                q5Var.b();
                com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var2 = this.f91529b;
                if (q5Var2.f91631g != null) {
                    android.content.ComponentCallbacks2 componentCallbacks2 = q5Var2.f91630f;
                    if (componentCallbacks2 instanceof androidx.lifecycle.y) {
                        ((androidx.lifecycle.y) componentCallbacks2).mo133getLifecycle().c(q5Var2.f91631g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 2) {
            return;
        }
        final com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var3 = this.f91529b;
        if (q5Var3 == null) {
            this.f91528a = 1;
            return;
        }
        android.content.ComponentCallbacks2 componentCallbacks22 = q5Var3.f91630f;
        if (componentCallbacks22 instanceof androidx.lifecycle.y) {
            androidx.lifecycle.o mo133getLifecycle = ((androidx.lifecycle.y) componentCallbacks22).mo133getLifecycle();
            androidx.lifecycle.x xVar = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.appbrand.widget.input.KeyboardHeightProvider$3
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
                public void onPaused() {
                    com.tencent.mm.plugin.appbrand.widget.input.q5.this.b();
                }

                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                public void onResumed() {
                    com.tencent.mm.plugin.appbrand.widget.input.q5.this.d();
                }
            };
            q5Var3.f91631g = xVar;
            mo133getLifecycle.a(xVar);
        }
        this.f91529b.d();
    }

    public final void j(com.tencent.mm.plugin.appbrand.widget.input.i2 i2Var) {
        java.util.Iterator it = ((java.util.LinkedHashSet) this.f91536i.clone()).iterator();
        while (it.hasNext()) {
            i2Var.a((com.tencent.mm.plugin.appbrand.widget.input.k2) it.next());
        }
    }

    public final void k(boolean z17) {
        if (this.f91533f != z17) {
            com.tencent.mm.plugin.appbrand.widget.input.j2 j2Var = this.f91535h;
            if (j2Var != null) {
                j2Var.a(z17);
            }
            java.util.Iterator it = ((java.util.LinkedHashSet) this.f91536i.clone()).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.widget.input.k2) it.next()).a(z17);
            }
        }
        this.f91533f = z17;
    }
}
