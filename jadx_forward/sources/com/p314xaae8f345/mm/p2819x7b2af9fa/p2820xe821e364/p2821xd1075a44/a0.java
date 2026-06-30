package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 f295977a;

    /* renamed from: b, reason: collision with root package name */
    public int f295978b;

    /* renamed from: c, reason: collision with root package name */
    public int f295979c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f295980d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f295981e;

    public a0() {
        d();
    }

    public void a() {
        this.f295979c = this.f295980d ? this.f295977a.f() : this.f295977a.i();
    }

    public void b(android.view.View view, int i17) {
        if (this.f295980d) {
            int a17 = this.f295977a.a(view);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f295977a;
            this.f295979c = a17 + (Integer.MIN_VALUE == k0Var.f296092b ? 0 : k0Var.j() - k0Var.f296092b);
        } else {
            this.f295979c = this.f295977a.d(view);
        }
        this.f295978b = i17;
    }

    public void c(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f295977a;
        int j17 = Integer.MIN_VALUE == k0Var.f296092b ? 0 : k0Var.j() - k0Var.f296092b;
        if (j17 >= 0) {
            b(view, i17);
            return;
        }
        this.f295978b = i17;
        if (!this.f295980d) {
            int d17 = this.f295977a.d(view);
            int i18 = d17 - this.f295977a.i();
            this.f295979c = d17;
            if (i18 > 0) {
                int f17 = (this.f295977a.f() - java.lang.Math.min(0, (this.f295977a.f() - j17) - this.f295977a.a(view))) - (d17 + this.f295977a.b(view));
                if (f17 < 0) {
                    this.f295979c -= java.lang.Math.min(i18, -f17);
                    return;
                }
                return;
            }
            return;
        }
        int f18 = (this.f295977a.f() - j17) - this.f295977a.a(view);
        this.f295979c = this.f295977a.f() - f18;
        if (f18 > 0) {
            int b17 = this.f295979c - this.f295977a.b(view);
            int i19 = this.f295977a.i();
            int min = b17 - (i19 + java.lang.Math.min(this.f295977a.d(view) - i19, 0));
            if (min < 0) {
                this.f295979c += java.lang.Math.min(f18, -min);
            }
        }
    }

    public void d() {
        this.f295978b = -1;
        this.f295979c = Integer.MIN_VALUE;
        this.f295980d = false;
        this.f295981e = false;
    }

    /* renamed from: toString */
    public java.lang.String m83628x9616526c() {
        return "AnchorInfo{mPosition=" + this.f295978b + ", mCoordinate=" + this.f295979c + ", mLayoutFromEnd=" + this.f295980d + ", mValid=" + this.f295981e + '}';
    }
}
