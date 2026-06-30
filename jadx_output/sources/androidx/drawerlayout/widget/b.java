package androidx.drawerlayout.widget;

/* loaded from: classes14.dex */
public class b extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f11171a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.customview.widget.l f11172b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f11173c = new t3.e(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout f11174d;

    public b(androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i17) {
        this.f11174d = drawerLayout;
        this.f11171a = i17;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View view, int i17, int i18) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        if (drawerLayout.a(view, 3)) {
            return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i17, 0));
        }
        int width = drawerLayout.getWidth();
        return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i17, width));
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View view, int i17, int i18) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.k
    public int c(android.view.View view) {
        if (this.f11174d.j(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // androidx.customview.widget.k
    public void e(int i17, int i18) {
        int i19 = i17 & 1;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        android.view.View d17 = i19 == 1 ? drawerLayout.d(3) : drawerLayout.d(5);
        if (d17 == null || drawerLayout.g(d17) != 0) {
            return;
        }
        this.f11172b.c(d17, i18);
    }

    @Override // androidx.customview.widget.k
    public void f(int i17, int i18) {
        this.f11174d.postDelayed(this.f11173c, 160L);
    }

    @Override // androidx.customview.widget.k
    public void g(android.view.View view, int i17) {
        ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).f11164c = false;
        int i18 = this.f11171a == 3 ? 5 : 3;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        android.view.View d17 = drawerLayout.d(i18);
        if (d17 != null) {
            drawerLayout.b(d17);
        }
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        int i18;
        int size;
        int size2;
        android.view.View rootView;
        int size3;
        android.view.View view = this.f11172b.f11138s;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        int i19 = drawerLayout.f11147i.f11120a;
        int i27 = drawerLayout.f11148m.f11120a;
        if (i19 == 1 || i27 == 1) {
            i18 = 1;
        } else {
            i18 = 2;
            if (i19 != 2 && i27 != 2) {
                i18 = 0;
            }
        }
        if (view != null && i17 == 0) {
            float f17 = ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).f11163b;
            if (f17 == 0.0f) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
                if ((layoutParams.f11165d & 1) == 1) {
                    layoutParams.f11165d = 0;
                    java.util.List list = drawerLayout.f11159x;
                    if (list != null && (size3 = ((java.util.ArrayList) list).size() - 1) >= 0) {
                        android.support.v4.media.f.a(((java.util.ArrayList) drawerLayout.f11159x).get(size3));
                        throw null;
                    }
                    drawerLayout.n(view, false);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f17 == 1.0f) {
                androidx.drawerlayout.widget.DrawerLayout.LayoutParams layoutParams2 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f11165d & 1) == 0) {
                    layoutParams2.f11165d = 1;
                    java.util.List list2 = drawerLayout.f11159x;
                    if (list2 != null && (size2 = ((java.util.ArrayList) list2).size() - 1) >= 0) {
                        android.support.v4.media.f.a(((java.util.ArrayList) drawerLayout.f11159x).get(size2));
                        throw null;
                    }
                    drawerLayout.n(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i18 != drawerLayout.f11151p) {
            drawerLayout.f11151p = i18;
            java.util.List list3 = drawerLayout.f11159x;
            if (list3 == null || (size = ((java.util.ArrayList) list3).size() - 1) < 0) {
                return;
            }
            android.support.v4.media.f.a(((java.util.ArrayList) drawerLayout.f11159x).get(size));
            throw null;
        }
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        int width = view.getWidth();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        float width2 = (drawerLayout.a(view, 3) ? i17 + width : drawerLayout.getWidth() - i17) / width;
        drawerLayout.m(view, width2);
        int i28 = width2 == 0.0f ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i28));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "androidx/drawerlayout/widget/DrawerLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        drawerLayout.getClass();
        float f19 = ((androidx.drawerlayout.widget.DrawerLayout.LayoutParams) view.getLayoutParams()).f11163b;
        int width = view.getWidth();
        if (drawerLayout.a(view, 3)) {
            i17 = (f17 > 0.0f || (f17 == 0.0f && f19 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f17 < 0.0f || (f17 == 0.0f && f19 > 0.5f)) {
                width2 -= width;
            }
            i17 = width2;
        }
        this.f11172b.s(i17, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View view, int i17) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f11174d;
        return drawerLayout.j(view) && drawerLayout.a(view, this.f11171a) && drawerLayout.g(view) == 0;
    }
}
