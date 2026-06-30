package p012xc85e97e9.p083x1317bb5b.p084xd1075a44;

/* loaded from: classes14.dex */
public class b extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f92704a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f92705b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f92706c = new t3.e(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b f92707d;

    public b(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b, int i17) {
        this.f92707d = c1097xe647fb9b;
        this.f92704a = i17;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View view, int i17, int i18) {
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        if (c1097xe647fb9b.a(view, 3)) {
            return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i17, 0));
        }
        int width = c1097xe647fb9b.getWidth();
        return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i17, width));
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View view, int i17, int i18) {
        return view.getTop();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int c(android.view.View view) {
        if (this.f92707d.j(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void e(int i17, int i18) {
        int i19 = i17 & 1;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        android.view.View d17 = i19 == 1 ? c1097xe647fb9b.d(3) : c1097xe647fb9b.d(5);
        if (d17 == null || c1097xe647fb9b.g(d17) != 0) {
            return;
        }
        this.f92705b.c(d17, i18);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void f(int i17, int i18) {
        this.f92707d.postDelayed(this.f92706c, 160L);
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void g(android.view.View view, int i17) {
        ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92697c = false;
        int i18 = this.f92704a == 3 ? 5 : 3;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        android.view.View d17 = c1097xe647fb9b.d(i18);
        if (d17 != null) {
            c1097xe647fb9b.b(d17);
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void h(int i17) {
        int i18;
        int size;
        int size2;
        android.view.View rootView;
        int size3;
        android.view.View view = this.f92705b.f92671s;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        int i19 = c1097xe647fb9b.f92680i.f92653a;
        int i27 = c1097xe647fb9b.f92681m.f92653a;
        if (i19 == 1 || i27 == 1) {
            i18 = 1;
        } else {
            i18 = 2;
            if (i19 != 2 && i27 != 2) {
                i18 = 0;
            }
        }
        if (view != null && i17 == 0) {
            float f17 = ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92696b;
            if (f17 == 0.0f) {
                p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams();
                if ((layoutParams.f92698d & 1) == 1) {
                    layoutParams.f92698d = 0;
                    java.util.List list = c1097xe647fb9b.f92692x;
                    if (list != null && (size3 = ((java.util.ArrayList) list).size() - 1) >= 0) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.ArrayList) c1097xe647fb9b.f92692x).get(size3));
                        throw null;
                    }
                    c1097xe647fb9b.n(view, false);
                    if (c1097xe647fb9b.hasWindowFocus() && (rootView = c1097xe647fb9b.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f17 == 1.0f) {
                p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams2 = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f92698d & 1) == 0) {
                    layoutParams2.f92698d = 1;
                    java.util.List list2 = c1097xe647fb9b.f92692x;
                    if (list2 != null && (size2 = ((java.util.ArrayList) list2).size() - 1) >= 0) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.ArrayList) c1097xe647fb9b.f92692x).get(size2));
                        throw null;
                    }
                    c1097xe647fb9b.n(view, true);
                    if (c1097xe647fb9b.hasWindowFocus()) {
                        c1097xe647fb9b.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i18 != c1097xe647fb9b.f92684p) {
            c1097xe647fb9b.f92684p = i18;
            java.util.List list3 = c1097xe647fb9b.f92692x;
            if (list3 == null || (size = ((java.util.ArrayList) list3).size() - 1) < 0) {
                return;
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.ArrayList) c1097xe647fb9b.f92692x).get(size));
            throw null;
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        int width = view.getWidth();
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        float width2 = (c1097xe647fb9b.a(view, 3) ? i17 + width : c1097xe647fb9b.getWidth() - i17) / width;
        c1097xe647fb9b.m(view, width2);
        int i28 = width2 == 0.0f ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i28));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1097xe647fb9b.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        c1097xe647fb9b.getClass();
        float f19 = ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92696b;
        int width = view.getWidth();
        if (c1097xe647fb9b.a(view, 3)) {
            i17 = (f17 > 0.0f || (f17 == 0.0f && f19 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = c1097xe647fb9b.getWidth();
            if (f17 < 0.0f || (f17 == 0.0f && f19 > 0.5f)) {
                width2 -= width;
            }
            i17 = width2;
        }
        this.f92705b.s(i17, view.getTop());
        c1097xe647fb9b.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View view, int i17) {
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b c1097xe647fb9b = this.f92707d;
        return c1097xe647fb9b.j(view) && c1097xe647fb9b.a(view, this.f92704a) && c1097xe647fb9b.g(view) == 0;
    }
}
