package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f93809a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f93810b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f93811c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f93812d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f93813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 f93814f;

    public x3(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1, int i17) {
        this.f93814f = c1164x587b7ff1;
        this.f93813e = i17;
    }

    public void a(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) view.getLayoutParams();
        layoutParams.f93473h = this;
        java.util.ArrayList arrayList = this.f93809a;
        arrayList.add(view);
        this.f93811c = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f93810b = Integer.MIN_VALUE;
        }
        if (layoutParams.d() || layoutParams.c()) {
            this.f93812d += this.f93814f.f93455f.c(view);
        }
    }

    public void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25 e17;
        java.util.ArrayList arrayList = this.f93809a;
        android.view.View view = (android.view.View) arrayList.get(arrayList.size() - 1);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams k17 = k(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = this.f93814f;
        this.f93811c = c1164x587b7ff1.f93455f.b(view);
        if (k17.f93474i && (e17 = c1164x587b7ff1.f93465s.e(k17.b())) != null && e17.f93476e == 1) {
            int i17 = this.f93811c;
            int[] iArr = e17.f93477f;
            this.f93811c = i17 + (iArr == null ? 0 : iArr[this.f93813e]);
        }
    }

    public void c() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25 e17;
        android.view.View view = (android.view.View) this.f93809a.get(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams k17 = k(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = this.f93814f;
        this.f93810b = c1164x587b7ff1.f93455f.e(view);
        if (k17.f93474i && (e17 = c1164x587b7ff1.f93465s.e(k17.b())) != null && e17.f93476e == -1) {
            int i17 = this.f93810b;
            int[] iArr = e17.f93477f;
            this.f93810b = i17 - (iArr != null ? iArr[this.f93813e] : 0);
        }
    }

    public void d() {
        this.f93809a.clear();
        this.f93810b = Integer.MIN_VALUE;
        this.f93811c = Integer.MIN_VALUE;
        this.f93812d = 0;
    }

    public int e() {
        return this.f93814f.f93460n ? g(r1.size() - 1, -1, false, false, true) : g(0, this.f93809a.size(), false, false, true);
    }

    public int f() {
        return this.f93814f.f93460n ? g(0, this.f93809a.size(), false, false, true) : g(r1.size() - 1, -1, false, false, true);
    }

    public int g(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = this.f93814f;
        int k17 = c1164x587b7ff1.f93455f.k();
        int g17 = c1164x587b7ff1.f93455f.g();
        int i19 = i17;
        int i27 = i18 > i19 ? 1 : -1;
        while (i19 != i18) {
            android.view.View view = (android.view.View) this.f93809a.get(i19);
            int e17 = c1164x587b7ff1.f93455f.e(view);
            int b17 = c1164x587b7ff1.f93455f.b(view);
            boolean z27 = false;
            boolean z28 = !z19 ? e17 >= g17 : e17 > g17;
            if (!z19 ? b17 > k17 : b17 >= k17) {
                z27 = true;
            }
            if (z28 && z27) {
                if (z17 && z18) {
                    if (e17 >= k17 && b17 <= g17) {
                        return c1164x587b7ff1.m8032xa86cd69f(view);
                    }
                } else {
                    if (z18) {
                        return c1164x587b7ff1.m8032xa86cd69f(view);
                    }
                    if (e17 < k17 || b17 > g17) {
                        return c1164x587b7ff1.m8032xa86cd69f(view);
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
        int i18 = this.f93811c;
        if (i18 != Integer.MIN_VALUE) {
            return i18;
        }
        if (this.f93809a.size() == 0) {
            return i17;
        }
        b();
        return this.f93811c;
    }

    public android.view.View j(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = this.f93814f;
        java.util.ArrayList arrayList = this.f93809a;
        android.view.View view = null;
        if (i18 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                android.view.View view2 = (android.view.View) arrayList.get(size);
                if ((c1164x587b7ff1.f93460n && c1164x587b7ff1.m8032xa86cd69f(view2) >= i17) || ((!c1164x587b7ff1.f93460n && c1164x587b7ff1.m8032xa86cd69f(view2) <= i17) || !view2.hasFocusable())) {
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
                if ((c1164x587b7ff1.f93460n && c1164x587b7ff1.m8032xa86cd69f(view3) <= i17) || ((!c1164x587b7ff1.f93460n && c1164x587b7ff1.m8032xa86cd69f(view3) >= i17) || !view3.hasFocusable())) {
                    break;
                }
                i19++;
                view = view3;
            }
        }
        return view;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams k(android.view.View view) {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) view.getLayoutParams();
    }

    public int l(int i17) {
        int i18 = this.f93810b;
        if (i18 != Integer.MIN_VALUE) {
            return i18;
        }
        if (this.f93809a.size() == 0) {
            return i17;
        }
        c();
        return this.f93810b;
    }

    public void m() {
        java.util.ArrayList arrayList = this.f93809a;
        int size = arrayList.size();
        android.view.View view = (android.view.View) arrayList.remove(size - 1);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams k17 = k(view);
        k17.f93473h = null;
        if (k17.d() || k17.c()) {
            this.f93812d -= this.f93814f.f93455f.c(view);
        }
        if (size == 1) {
            this.f93810b = Integer.MIN_VALUE;
        }
        this.f93811c = Integer.MIN_VALUE;
    }

    public void n() {
        java.util.ArrayList arrayList = this.f93809a;
        android.view.View view = (android.view.View) arrayList.remove(0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams k17 = k(view);
        k17.f93473h = null;
        if (arrayList.size() == 0) {
            this.f93811c = Integer.MIN_VALUE;
        }
        if (k17.d() || k17.c()) {
            this.f93812d -= this.f93814f.f93455f.c(view);
        }
        this.f93810b = Integer.MIN_VALUE;
    }

    public void o(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) view.getLayoutParams();
        layoutParams.f93473h = this;
        java.util.ArrayList arrayList = this.f93809a;
        arrayList.add(0, view);
        this.f93810b = Integer.MIN_VALUE;
        if (arrayList.size() == 1) {
            this.f93811c = Integer.MIN_VALUE;
        }
        if (layoutParams.d() || layoutParams.c()) {
            this.f93812d += this.f93814f.f93455f.c(view);
        }
    }
}
