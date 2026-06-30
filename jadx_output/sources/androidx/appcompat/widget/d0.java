package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f9542a;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9545d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9546e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9547f;

    /* renamed from: c, reason: collision with root package name */
    public int f9544c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.h0 f9543b = androidx.appcompat.widget.h0.f();

    public d0(android.view.View view) {
        this.f9542a = view;
    }

    public void a() {
        android.view.View view = this.f9542a;
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            boolean z17 = false;
            if (this.f9545d != null) {
                if (this.f9547f == null) {
                    this.f9547f = new androidx.appcompat.widget.o2();
                }
                androidx.appcompat.widget.o2 o2Var = this.f9547f;
                o2Var.f9666a = null;
                o2Var.f9669d = false;
                o2Var.f9667b = null;
                o2Var.f9668c = false;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                android.content.res.ColorStateList g17 = n3.a1.g(view);
                if (g17 != null) {
                    o2Var.f9669d = true;
                    o2Var.f9666a = g17;
                }
                android.graphics.PorterDuff.Mode h17 = n3.a1.h(view);
                if (h17 != null) {
                    o2Var.f9668c = true;
                    o2Var.f9667b = h17;
                }
                if (o2Var.f9669d || o2Var.f9668c) {
                    androidx.appcompat.widget.h0.m(background, o2Var, view.getDrawableState());
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
            androidx.appcompat.widget.o2 o2Var2 = this.f9546e;
            if (o2Var2 != null) {
                androidx.appcompat.widget.h0.m(background, o2Var2, view.getDrawableState());
                return;
            }
            androidx.appcompat.widget.o2 o2Var3 = this.f9545d;
            if (o2Var3 != null) {
                androidx.appcompat.widget.h0.m(background, o2Var3, view.getDrawableState());
            }
        }
    }

    public android.content.res.ColorStateList b() {
        androidx.appcompat.widget.o2 o2Var = this.f9546e;
        if (o2Var != null) {
            return o2Var.f9666a;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode c() {
        androidx.appcompat.widget.o2 o2Var = this.f9546e;
        if (o2Var != null) {
            return o2Var.f9667b;
        }
        return null;
    }

    public void d(android.util.AttributeSet attributeSet, int i17) {
        android.view.View view = this.f9542a;
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(view.getContext(), attributeSet, j.a.B, i17, 0);
        try {
            if (l17.k(0)) {
                this.f9544c = l17.i(0, -1);
                android.content.res.ColorStateList k17 = this.f9543b.k(view.getContext(), this.f9544c);
                if (k17 != null) {
                    g(k17);
                }
            }
            if (l17.k(1)) {
                android.content.res.ColorStateList b17 = l17.b(1);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.q(view, b17);
            }
            if (l17.k(2)) {
                android.graphics.PorterDuff.Mode c17 = androidx.appcompat.widget.y0.c(l17.h(2, -1), null);
                java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                n3.a1.r(view, c17);
            }
        } finally {
            l17.m();
        }
    }

    public void e(android.graphics.drawable.Drawable drawable) {
        this.f9544c = -1;
        g(null);
        a();
    }

    public void f(int i17) {
        this.f9544c = i17;
        androidx.appcompat.widget.h0 h0Var = this.f9543b;
        g(h0Var != null ? h0Var.k(this.f9542a.getContext(), i17) : null);
        a();
    }

    public void g(android.content.res.ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9545d == null) {
                this.f9545d = new androidx.appcompat.widget.o2();
            }
            androidx.appcompat.widget.o2 o2Var = this.f9545d;
            o2Var.f9666a = colorStateList;
            o2Var.f9669d = true;
        } else {
            this.f9545d = null;
        }
        a();
    }

    public void h(android.content.res.ColorStateList colorStateList) {
        if (this.f9546e == null) {
            this.f9546e = new androidx.appcompat.widget.o2();
        }
        androidx.appcompat.widget.o2 o2Var = this.f9546e;
        o2Var.f9666a = colorStateList;
        o2Var.f9669d = true;
        a();
    }

    public void i(android.graphics.PorterDuff.Mode mode) {
        if (this.f9546e == null) {
            this.f9546e = new androidx.appcompat.widget.o2();
        }
        androidx.appcompat.widget.o2 o2Var = this.f9546e;
        o2Var.f9667b = mode;
        o2Var.f9668c = true;
        a();
    }
}
