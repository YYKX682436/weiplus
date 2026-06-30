package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class l2 implements ql1.a {

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Integer f173060j;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 f173062b;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f173067g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2 f173068h;

    /* renamed from: a, reason: collision with root package name */
    public int f173061a = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f173063c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f173064d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f173065e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public boolean f173066f = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedHashSet f173069i = new java.util.LinkedHashSet();

    public static int c(android.content.Context context) {
        if (f173060j == null) {
            f173060j = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(context));
        }
        return f173060j.intValue();
    }

    public static boolean h(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return false;
        }
        if (f173060j == null) {
            f173060j = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(context));
        }
        if (f173060j.intValue() == i17) {
            return false;
        }
        f173060j = java.lang.Integer.valueOf(i17);
        return true;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 k2Var) {
        if (k2Var != null) {
            java.util.LinkedHashSet linkedHashSet = this.f173069i;
            if (linkedHashSet.contains(k2Var)) {
                return;
            }
            linkedHashSet.add(k2Var);
        }
    }

    public final int b() {
        int i17;
        android.view.View view = this.f173067g;
        if ((view == null ? null : view.getRootView()) == null) {
            return 0;
        }
        android.view.View view2 = this.f173067g;
        android.graphics.Rect rect = this.f173065e;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
            android.view.View view3 = this.f173067g;
            int[] iArr = this.f173064d;
            view3.getLocationInWindow(iArr);
            rect.top = iArr[1];
        }
        android.view.View view4 = this.f173067g;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(view4)) {
            i17 = this.f173067g.getMeasuredHeight();
        } else {
            android.view.View view5 = this.f173067g;
            i17 = (view5 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : view5.getContext()).getResources().getDisplayMetrics().heightPixels;
        }
        return i17 - rect.top;
    }

    public final void d(int i17) {
        if (this.f173063c == 0) {
            this.f173063c = i17;
        }
        int b17 = b() - i17;
        if (b17 <= 0) {
            return;
        }
        android.view.View view = this.f173067g;
        boolean h17 = h(view == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : view.getContext(), b17);
        java.util.Iterator it = ((java.util.LinkedHashSet) this.f173069i.clone()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2) it.next();
            if (k2Var.mo53489x1c4fb41d() != b17) {
                k2Var.d(b17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2 j2Var = this.f173068h;
        if (j2Var == null) {
            return;
        }
        if (h17 || j2Var.mo53489x1c4fb41d() != b17) {
            this.f173068h.d(b17);
        }
    }

    public void e(android.view.View view, boolean z17, int i17) {
        this.f173067g = view;
        if (1 != this.f173061a) {
            return;
        }
        if (this.f173063c == 0) {
            this.f173063c = i17;
        }
        d(b() - i17);
        k(z17);
        this.f173063c = i17;
        this.f173067g = null;
    }

    public void f(android.view.View view, boolean z17, int i17, int i18, int i19, int i27) {
        this.f173067g = view;
        if (1 != this.f173061a) {
            return;
        }
        android.graphics.Rect rect = this.f173065e;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
            android.view.View view2 = this.f173067g;
            int[] iArr = this.f173064d;
            view2.getLocationInWindow(iArr);
            rect.top = iArr[1];
        }
        int height = rect.height();
        d(height);
        k(b() > height);
        this.f173063c = height;
        this.f173067g = null;
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2 k2Var) {
        if (k2Var != null) {
            this.f173069i.remove(k2Var);
        }
    }

    public void i(int i17) {
        this.f173061a = i17;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var = this.f173062b;
            if (q5Var != null) {
                q5Var.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var2 = this.f173062b;
                if (q5Var2.f173164g != null) {
                    android.content.ComponentCallbacks2 componentCallbacks2 = q5Var2.f173163f;
                    if (componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y) {
                        ((p012xc85e97e9.p093xedfae76a.y) componentCallbacks2).mo273xed6858b4().c(q5Var2.f173164g);
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
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var3 = this.f173062b;
        if (q5Var3 == null) {
            this.f173061a = 1;
            return;
        }
        android.content.ComponentCallbacks2 componentCallbacks22 = q5Var3.f173163f;
        if (componentCallbacks22 instanceof p012xc85e97e9.p093xedfae76a.y) {
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = ((p012xc85e97e9.p093xedfae76a.y) componentCallbacks22).mo273xed6858b4();
            p012xc85e97e9.p093xedfae76a.x xVar = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.widget.input.KeyboardHeightProvider$3
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
                /* renamed from: onPaused */
                public void m53429x53a16fed() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5.this.b();
                }

                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                /* renamed from: onResumed */
                public void m53430x91113ef8() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5.this.d();
                }
            };
            q5Var3.f173164g = xVar;
            mo273xed6858b4.a(xVar);
        }
        this.f173062b.d();
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i2 i2Var) {
        java.util.Iterator it = ((java.util.LinkedHashSet) this.f173069i.clone()).iterator();
        while (it.hasNext()) {
            i2Var.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2) it.next());
        }
    }

    public final void k(boolean z17) {
        if (this.f173066f != z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2 j2Var = this.f173068h;
            if (j2Var != null) {
                j2Var.a(z17);
            }
            java.util.Iterator it = ((java.util.LinkedHashSet) this.f173069i.clone()).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2) it.next()).a(z17);
            }
        }
        this.f173066f = z17;
    }
}
