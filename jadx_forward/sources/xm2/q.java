package xm2;

/* loaded from: classes14.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f536782d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536783e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536784f;

    /* renamed from: g, reason: collision with root package name */
    public final int f536785g;

    /* renamed from: h, reason: collision with root package name */
    public final int f536786h;

    /* renamed from: i, reason: collision with root package name */
    public int f536787i;

    /* renamed from: m, reason: collision with root package name */
    public int f536788m;

    public q(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536782d = i65.a.b(context, 68);
        this.f536783e = i65.a.b(context, 98);
        this.f536784f = i65.a.b(context, 20);
        this.f536785g = i65.a.b(context, 12);
        this.f536786h = i65.a.b(context, 24);
        this.f536788m = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        if (m8020x7e414b06() == 0) {
            return false;
        }
        int m8020x7e414b06 = m8020x7e414b06();
        int i17 = this.f536782d;
        int i18 = this.f536784f;
        return m8020x7e414b06 == 1 ? m8037x755bd410() < i17 + (i18 * 2) : ((m8037x755bd410() - (i18 * 2)) - (m8020x7e414b06() * i17)) / (m8020x7e414b06() - 1) <= this.f536786h;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(this.f536782d, this.f536783e);
    }

    public final void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17, int i18) {
        m7996x5201473d(z2Var);
        int m8020x7e414b06 = m8020x7e414b06();
        for (int i19 = 0; i19 < m8020x7e414b06; i19++) {
            int i27 = this.f536782d;
            int i28 = i17 + i27;
            int i29 = this.f536787i;
            if (i28 >= i29) {
                if (i17 > i29 + m8037x755bd410()) {
                    break;
                }
                android.view.View f17 = z2Var.f(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
                mo7989xbb8aeee6(f17);
                mo8051xe81a0a5e(f17, 0, 0);
                int i37 = i17 - this.f536787i;
                m8049xe4474aed(f17, i37, 0, i37 + i27, this.f536783e);
            }
            i17 += i27 + i18;
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
        int m8037x755bd410 = m8037x755bd410();
        int i17 = this.f536784f;
        int m8020x7e414b06 = m8020x7e414b06();
        int i18 = this.f536782d;
        int f17 = m8020x7e414b06() > 1 ? e06.p.f(((m8037x755bd410 - (i17 * 2)) - (m8020x7e414b06 * i18)) / (m8020x7e414b06() - 1), this.f536785g, this.f536786h) : 0;
        int max = java.lang.Math.max(i17, ((m8037x755bd410() - (m8020x7e414b06() * i18)) - ((m8020x7e414b06() - 1) * f17)) / 2);
        int i19 = this.f536788m;
        if (i19 >= 0) {
            int m8037x755bd4102 = (((i18 + f17) * i19) + max) - ((m8037x755bd410() - i18) / 2);
            int m8020x7e414b062 = (((i18 * m8020x7e414b06()) + ((m8020x7e414b06() - 1) * f17)) + (max * 2)) - m8037x755bd410();
            if (m8037x755bd4102 > m8020x7e414b062) {
                m8037x755bd4102 = m8020x7e414b062;
            }
            this.f536787i = m8037x755bd4102 >= 0 ? m8037x755bd4102 : 0;
            this.f536788m = -1;
        }
        m(recycler, max, f17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int m8037x755bd410 = m8037x755bd410();
        int i18 = this.f536784f;
        int m8020x7e414b06 = m8020x7e414b06();
        int i19 = this.f536782d;
        int f17 = m8020x7e414b06() > 1 ? e06.p.f(((m8037x755bd410 - (i18 * 2)) - (m8020x7e414b06 * i19)) / (m8020x7e414b06() - 1), this.f536785g, this.f536786h) : 0;
        int max = java.lang.Math.max(i18, ((m8037x755bd410() - (m8020x7e414b06() * i19)) - ((m8020x7e414b06() - 1) * f17)) / 2);
        int m8020x7e414b062 = (i19 * m8020x7e414b06()) + ((m8020x7e414b06() - 1) * f17) + (max * 2);
        int i27 = this.f536787i + i17;
        int m8037x755bd4102 = m8020x7e414b062 - m8037x755bd410();
        if (i27 > m8037x755bd4102) {
            i27 = m8037x755bd4102;
        }
        int i28 = i27 >= 0 ? i27 : 0;
        int i29 = i28 - this.f536787i;
        this.f536787i = i28;
        m(recycler, max, f17);
        return i29;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f536788m = i17;
        m8087x46ac7299();
    }
}
