package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f91075a;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91078d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91079e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91080f;

    /* renamed from: c, reason: collision with root package name */
    public int f91077c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 f91076b = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f();

    public d0(android.view.View view) {
        this.f91075a = view;
    }

    public void a() {
        android.view.View view = this.f91075a;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            boolean z17 = false;
            if (this.f91078d != null) {
                if (this.f91080f == null) {
                    this.f91080f = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
                }
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91080f;
                o2Var.f91199a = null;
                o2Var.f91202d = false;
                o2Var.f91200b = null;
                o2Var.f91201c = false;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                android.content.res.ColorStateList g17 = n3.a1.g(view);
                if (g17 != null) {
                    o2Var.f91202d = true;
                    o2Var.f91199a = g17;
                }
                android.graphics.PorterDuff.Mode h17 = n3.a1.h(view);
                if (h17 != null) {
                    o2Var.f91201c = true;
                    o2Var.f91200b = h17;
                }
                if (o2Var.f91202d || o2Var.f91201c) {
                    p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.m(background, o2Var, view.getDrawableState());
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var2 = this.f91079e;
            if (o2Var2 != null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.m(background, o2Var2, view.getDrawableState());
                return;
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var3 = this.f91078d;
            if (o2Var3 != null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.m(background, o2Var3, view.getDrawableState());
            }
        }
    }

    public android.content.res.ColorStateList b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91079e;
        if (o2Var != null) {
            return o2Var.f91199a;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode c() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91079e;
        if (o2Var != null) {
            return o2Var.f91200b;
        }
        return null;
    }

    public void d(android.util.AttributeSet attributeSet, int i17) {
        android.view.View view = this.f91075a;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(view.getContext(), attributeSet, j.a.B, i17, 0);
        try {
            if (l17.k(0)) {
                this.f91077c = l17.i(0, -1);
                android.content.res.ColorStateList k17 = this.f91076b.k(view.getContext(), this.f91077c);
                if (k17 != null) {
                    g(k17);
                }
            }
            if (l17.k(1)) {
                android.content.res.ColorStateList b17 = l17.b(1);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.q(view, b17);
            }
            if (l17.k(2)) {
                android.graphics.PorterDuff.Mode c17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.c(l17.h(2, -1), null);
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                n3.a1.r(view, c17);
            }
        } finally {
            l17.m();
        }
    }

    public void e(android.graphics.drawable.Drawable drawable) {
        this.f91077c = -1;
        g(null);
        a();
    }

    public void f(int i17) {
        this.f91077c = i17;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 h0Var = this.f91076b;
        g(h0Var != null ? h0Var.k(this.f91075a.getContext(), i17) : null);
        a();
    }

    public void g(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f91078d == null) {
                this.f91078d = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91078d;
            o2Var.f91199a = colorStateList;
            o2Var.f91202d = true;
        } else {
            this.f91078d = null;
        }
        a();
    }

    public void h(android.content.res.ColorStateList colorStateList) {
        if (this.f91079e == null) {
            this.f91079e = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91079e;
        o2Var.f91199a = colorStateList;
        o2Var.f91202d = true;
        a();
    }

    public void i(android.graphics.PorterDuff.Mode mode) {
        if (this.f91079e == null) {
            this.f91079e = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91079e;
        o2Var.f91200b = mode;
        o2Var.f91201c = true;
        a();
    }
}
