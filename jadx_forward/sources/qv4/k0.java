package qv4;

/* loaded from: classes5.dex */
public final class k0 extends kv4.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f448520d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f448521e;

    /* renamed from: f, reason: collision with root package name */
    public final int f448522f;

    /* renamed from: g, reason: collision with root package name */
    public int f448523g;

    /* renamed from: h, reason: collision with root package name */
    public final int f448524h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f448525i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f448526m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f448527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.view.View v17) {
        super(v17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f448520d = v17;
        this.f448521e = jz5.h.b(new qv4.c0(this));
        this.f448522f = pm0.v.S(16);
        this.f448523g = pm0.v.S(16);
        this.f448524h = pm0.v.S(8);
        this.f448525i = jz5.h.b(new qv4.j0(this));
        this.f448527n = jz5.h.b(qv4.h0.f448511d);
    }

    public static final e06.k i(qv4.k0 k0Var) {
        int i17;
        java.util.Iterator it = k0Var.j().iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((android.view.View) it.next()).getRight() - k0Var.n().getScrollX() <= k0Var.n().getWidth()) {
                break;
            }
            i18++;
        }
        java.util.Iterator it6 = k0Var.j().iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            if (((android.view.View) it6.next()).getRight() - k0Var.n().getScrollX() > k0Var.n().getWidth()) {
                i17 = i19;
                break;
            }
            i19++;
        }
        return e06.p.m(i18, i17);
    }

    public final java.util.List j() {
        android.widget.LinearLayout k17 = k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "<get-lineContainer>(...)");
        return q26.h0.y(new n3.r1(k17));
    }

    public final android.widget.LinearLayout k() {
        return (android.widget.LinearLayout) ((jz5.n) this.f448521e).mo141623x754a37bb();
    }

    public final float l() {
        return ((java.lang.Number) ((jz5.n) this.f448527n).mo141623x754a37bb()).floatValue();
    }

    public final android.widget.HorizontalScrollView n() {
        return (android.widget.HorizontalScrollView) ((jz5.n) this.f448525i).mo141623x754a37bb();
    }

    public final void o(boolean z17) {
        java.util.List j17 = j();
        int i17 = 0;
        for (java.lang.Object obj : j17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) obj;
            if (z17) {
                view.setPadding(i17 == 0 ? 0 : pm0.v.S(3), 0, i17 == j17.size() + (-1) ? 0 : pm0.v.S(3), 0);
            } else if (i17 != j17.size() - 1) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = this.f448523g + this.f448524h;
                }
            }
            i17 = i18;
        }
        k().requestLayout();
        k().post(new qv4.i0(this));
    }
}
