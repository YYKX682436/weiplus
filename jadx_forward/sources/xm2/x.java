package xm2;

/* loaded from: classes14.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f536809d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536810e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536811f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536812g;

    /* renamed from: h, reason: collision with root package name */
    public int f536813h;

    /* renamed from: i, reason: collision with root package name */
    public int f536814i;

    public x(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536809d = i65.a.b(context, 68);
        this.f536810e = i65.a.b(context, 98);
        this.f536811f = i65.a.b(context, 20);
        this.f536812g = i65.a.b(context, 12);
        this.f536814i = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        if (m8020x7e414b06() == 0) {
            return false;
        }
        int m8020x7e414b06 = m8020x7e414b06();
        int i17 = this.f536811f;
        int i18 = this.f536809d;
        if (m8020x7e414b06 == 1) {
            return m8037x755bd410() < i18 + (i17 * 2);
        }
        return m8037x755bd410() < ((i18 * m8020x7e414b06()) + (this.f536812g * (m8020x7e414b06() - 1))) + (i17 * 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(this.f536809d, this.f536810e);
    }

    public final void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        m7996x5201473d(z2Var);
        int m8020x7e414b06 = m8020x7e414b06();
        int i17 = this.f536811f;
        for (int i18 = 0; i18 < m8020x7e414b06; i18++) {
            int i19 = this.f536809d;
            int i27 = i17 + i19;
            int i28 = this.f536813h;
            int i29 = this.f536812g;
            if (i27 >= i28) {
                if (i17 > i28 + m8037x755bd410()) {
                    break;
                }
                android.view.View f17 = z2Var.f(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                mo7989xbb8aeee6(f17);
                mo8051xe81a0a5e(f17, 0, 0);
                int i37 = i17 - this.f536813h;
                m8049xe4474aed(f17, i37, 0, i37 + i19, this.f536810e);
            }
            i17 += i19 + i29;
        }
        java.util.List list = z2Var.f93845d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getScrapList(...)");
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            z2Var.i(((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next()).f3639x46306858);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int i17 = this.f536814i;
        if (i17 >= 0) {
            int i18 = this.f536809d;
            int i19 = this.f536812g;
            int i27 = (i18 + i19) * i17;
            int i28 = this.f536811f;
            int m8037x755bd410 = (i27 + i28) - ((m8037x755bd410() - i18) / 2);
            int m8020x7e414b06 = (((i18 * m8020x7e414b06()) + (i19 * (m8020x7e414b06() - 1))) + (i28 * 2)) - m8037x755bd410();
            if (m8037x755bd410 > m8020x7e414b06) {
                m8037x755bd410 = m8020x7e414b06;
            }
            if (m8037x755bd410 < 0) {
                m8037x755bd410 = 0;
            }
            this.f536813h = m8037x755bd410;
            this.f536814i = -1;
        }
        m(recycler);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int m8020x7e414b06 = (this.f536809d * m8020x7e414b06()) + (this.f536812g * (m8020x7e414b06() - 1)) + (this.f536811f * 2);
        int i18 = this.f536813h + i17;
        int m8037x755bd410 = m8020x7e414b06 - m8037x755bd410();
        if (i18 > m8037x755bd410) {
            i18 = m8037x755bd410;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = i18 - this.f536813h;
        this.f536813h = i18;
        m(recycler);
        return i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f536814i = i17;
        m8087x46ac7299();
    }
}
