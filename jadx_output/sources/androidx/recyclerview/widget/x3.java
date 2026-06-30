package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f12276a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f12277b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f12278c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f12279d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f12280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f12281f;

    public x3(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i17) {
        this.f12281f = staggeredGridLayoutManager;
        this.f12280e = i17;
    }

    public void a(android.view.View view) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f11940h = this;
        java.util.ArrayList arrayList = this.f12276a;
        arrayList.add(view);
        this.f12278c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f12277b = Integer.MIN_VALUE;
        }
        if (layoutParams.d() || layoutParams.c()) {
            this.f12279d += this.f12281f.f11922f.c(view);
        }
    }

    public void b() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e17;
        java.util.ArrayList arrayList = this.f12276a;
        android.view.View view = (android.view.View) arrayList.get(arrayList.size() - 1);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams k17 = k(view);
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12281f;
        this.f12278c = staggeredGridLayoutManager.f11922f.b(view);
        if (k17.f11941i && (e17 = staggeredGridLayoutManager.f11932s.e(k17.b())) != null && e17.f11943e == 1) {
            int i17 = this.f12278c;
            int[] iArr = e17.f11944f;
            this.f12278c = i17 + (iArr == null ? 0 : iArr[this.f12280e]);
        }
    }

    public void c() {
        androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e17;
        android.view.View view = (android.view.View) this.f12276a.get(0);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams k17 = k(view);
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12281f;
        this.f12277b = staggeredGridLayoutManager.f11922f.e(view);
        if (k17.f11941i && (e17 = staggeredGridLayoutManager.f11932s.e(k17.b())) != null && e17.f11943e == -1) {
            int i17 = this.f12277b;
            int[] iArr = e17.f11944f;
            this.f12277b = i17 - (iArr != null ? iArr[this.f12280e] : 0);
        }
    }

    public void d() {
        this.f12276a.clear();
        this.f12277b = Integer.MIN_VALUE;
        this.f12278c = Integer.MIN_VALUE;
        this.f12279d = 0;
    }

    public int e() {
        return this.f12281f.f11927n ? g(r1.size() - 1, -1, false, false, true) : g(0, this.f12276a.size(), false, false, true);
    }

    public int f() {
        return this.f12281f.f11927n ? g(0, this.f12276a.size(), false, false, true) : g(r1.size() - 1, -1, false, false, true);
    }

    public int g(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12281f;
        int k17 = staggeredGridLayoutManager.f11922f.k();
        int g17 = staggeredGridLayoutManager.f11922f.g();
        int i19 = i17;
        int i27 = i18 > i19 ? 1 : -1;
        while (i19 != i18) {
            android.view.View view = (android.view.View) this.f12276a.get(i19);
            int e17 = staggeredGridLayoutManager.f11922f.e(view);
            int b17 = staggeredGridLayoutManager.f11922f.b(view);
            boolean z27 = false;
            boolean z28 = !z19 ? e17 >= g17 : e17 > g17;
            if (!z19 ? b17 > k17 : b17 >= k17) {
                z27 = true;
            }
            if (z28 && z27) {
                if (z17 && z18) {
                    if (e17 >= k17 && b17 <= g17) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                } else {
                    if (z18) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (e17 < k17 || b17 > g17) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
            }
            i19 += i27;
        }
        return -1;
    }

    public int h(int i17, int i18, boolean z17) {
        return g(i17, i18, z17, true, false);
    }

    public int i(int i17) {
        int i18 = this.f12278c;
        if (i18 != Integer.MIN_VALUE) {
            return i18;
        }
        if (this.f12276a.size() == 0) {
            return i17;
        }
        b();
        return this.f12278c;
    }

    public android.view.View j(int i17, int i18) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12281f;
        java.util.ArrayList arrayList = this.f12276a;
        android.view.View view = null;
        if (i18 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                android.view.View view2 = (android.view.View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f11927n && staggeredGridLayoutManager.getPosition(view2) >= i17) || ((!staggeredGridLayoutManager.f11927n && staggeredGridLayoutManager.getPosition(view2) <= i17) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                android.view.View view3 = (android.view.View) arrayList.get(i19);
                if ((staggeredGridLayoutManager.f11927n && staggeredGridLayoutManager.getPosition(view3) <= i17) || ((!staggeredGridLayoutManager.f11927n && staggeredGridLayoutManager.getPosition(view3) >= i17) || !view3.hasFocusable())) {
                    break;
                }
                i19++;
                view = view3;
            }
        }
        return view;
    }

    public androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams k(android.view.View view) {
        return (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
    }

    public int l(int i17) {
        int i18 = this.f12277b;
        if (i18 != Integer.MIN_VALUE) {
            return i18;
        }
        if (this.f12276a.size() == 0) {
            return i17;
        }
        c();
        return this.f12277b;
    }

    public void m() {
        java.util.ArrayList arrayList = this.f12276a;
        int size = arrayList.size();
        android.view.View view = (android.view.View) arrayList.remove(size - 1);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams k17 = k(view);
        k17.f11940h = null;
        if (k17.d() || k17.c()) {
            this.f12279d -= this.f12281f.f11922f.c(view);
        }
        if (size == 1) {
            this.f12277b = Integer.MIN_VALUE;
        }
        this.f12278c = Integer.MIN_VALUE;
    }

    public void n() {
        java.util.ArrayList arrayList = this.f12276a;
        android.view.View view = (android.view.View) arrayList.remove(0);
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams k17 = k(view);
        k17.f11940h = null;
        if (arrayList.size() == 0) {
            this.f12278c = Integer.MIN_VALUE;
        }
        if (k17.d() || k17.c()) {
            this.f12279d -= this.f12281f.f11922f.c(view);
        }
        this.f12277b = Integer.MIN_VALUE;
    }

    public void o(android.view.View view) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
        layoutParams.f11940h = this;
        java.util.ArrayList arrayList = this.f12276a;
        arrayList.add(0, view);
        this.f12277b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f12278c = Integer.MIN_VALUE;
        }
        if (layoutParams.d() || layoutParams.c()) {
            this.f12279d += this.f12281f.f11922f.c(view);
        }
    }
}
