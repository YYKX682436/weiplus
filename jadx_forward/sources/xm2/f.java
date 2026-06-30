package xm2;

/* loaded from: classes14.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f536741d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f536742e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536743f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536744g;

    /* renamed from: h, reason: collision with root package name */
    public final int f536745h;

    /* renamed from: i, reason: collision with root package name */
    public final int f536746i;

    /* renamed from: m, reason: collision with root package name */
    public final int f536747m;

    /* renamed from: n, reason: collision with root package name */
    public final int f536748n;

    /* renamed from: o, reason: collision with root package name */
    public int f536749o;

    /* renamed from: p, reason: collision with root package name */
    public int f536750p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f536751q;

    public f(android.content.Context context, java.util.List flattenedItems, yz5.l mostRevealedGroupChangeHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flattenedItems, "flattenedItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mostRevealedGroupChangeHandler, "mostRevealedGroupChangeHandler");
        this.f536741d = flattenedItems;
        this.f536742e = mostRevealedGroupChangeHandler;
        this.f536743f = i65.a.b(context, 68);
        this.f536744g = i65.a.b(context, 102);
        this.f536745h = i65.a.b(context, 32);
        this.f536746i = i65.a.b(context, 20);
        int b17 = i65.a.b(context, 16);
        this.f536747m = b17;
        int i17 = -b17;
        int size = flattenedItems.size();
        int i18 = 0;
        boolean z17 = false;
        while (i18 < size) {
            boolean z18 = this.f536741d.get(i18) == null;
            i17 += ((z18 || z17) ? 0 : this.f536747m) + (z18 ? this.f536745h : this.f536743f);
            i18++;
            z17 = z18;
        }
        this.f536748n = java.lang.Math.max(0, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        if (m8020x7e414b06() == 0) {
            return false;
        }
        return this.f536748n + (this.f536746i * 2) > m8037x755bd410();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(this.f536743f, this.f536744g);
    }

    public final int m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        int i17;
        int i18;
        int i19 = this.f536749o;
        int i27 = this.f536746i;
        double d17 = i19 - i27;
        int m8037x755bd410 = m8037x755bd410();
        int i28 = this.f536748n;
        double m8037x755bd4102 = (m8037x755bd410() * e06.p.d(d17 / (i28 - m8037x755bd410), 0.0d, 1.0d)) + this.f536749o;
        m7996x5201473d(z2Var);
        int i29 = this.f536747m;
        int m8020x7e414b06 = m8020x7e414b06();
        int i37 = 0;
        int i38 = i27 - i29;
        int i39 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = -1;
        while (true) {
            if (i48 >= m8020x7e414b06) {
                i17 = i49;
                break;
            }
            int i57 = this.f536741d.get(i48) == null ? 1 : i37;
            if (i57 != 0) {
                i39++;
            }
            int i58 = i39;
            int i59 = i57 != 0 ? this.f536745h : this.f536743f;
            int i66 = (i57 == 0 && i47 == 0) ? i29 : i37;
            int i67 = i38 + i59;
            int i68 = this.f536749o;
            if (i67 < i68) {
                i38 += i66 + i59;
                i18 = i48;
            } else {
                if (i38 > i68 + m8037x755bd410()) {
                    i17 = i49;
                    i39 = i58;
                    break;
                }
                android.view.View f17 = z2Var.f(i48);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                mo7989xbb8aeee6(f17);
                android.view.ViewGroup.LayoutParams layoutParams = f17.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i59;
                f17.setLayoutParams(layoutParams2);
                mo8051xe81a0a5e(f17, i37, i37);
                int i69 = (i38 - this.f536749o) + i66;
                int i76 = i49;
                i18 = i48;
                m8049xe4474aed(f17, i69, 0, i69 + i59, this.f536744g);
                i49 = (((double) i38) > m8037x755bd4102 || m8037x755bd4102 > ((double) ((i38 + i66) + i59))) ? i76 : i58;
                i38 += i66 + i59;
            }
            i48 = i18 + 1;
            i47 = i57;
            i39 = i58;
            i37 = 0;
        }
        if (i17 == -1) {
            i17 = m8037x755bd4102 > ((double) i28) ? i39 : 0;
        }
        int i77 = i17;
        java.util.List list = z2Var.f93845d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getScrapList(...)");
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            z2Var.i(((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next()).f3639x46306858);
        }
        return i77;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int m17 = m(recycler);
        if (this.f536751q) {
            this.f536750p = m17;
            this.f536751q = false;
        } else if (m17 != this.f536750p) {
            this.f536750p = m17;
            this.f536742e.mo146xb9724478(java.lang.Integer.valueOf(m17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int i18 = this.f536748n + (this.f536746i * 2);
        int i19 = this.f536749o + i17;
        int m8037x755bd410 = i18 - m8037x755bd410();
        if (i19 > m8037x755bd410) {
            i19 = m8037x755bd410;
        }
        if (i19 < 0) {
            i19 = 0;
        }
        int i27 = i19 - this.f536749o;
        this.f536749o = i19;
        int m17 = m(recycler);
        if (m17 != this.f536750p) {
            this.f536750p = m17;
            this.f536742e.mo146xb9724478(java.lang.Integer.valueOf(m17));
        }
        return i27;
    }
}
