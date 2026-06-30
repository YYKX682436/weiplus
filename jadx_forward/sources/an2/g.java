package an2;

/* loaded from: classes14.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f90383d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90384e;

    /* renamed from: f, reason: collision with root package name */
    public int f90385f;

    /* renamed from: g, reason: collision with root package name */
    public int f90386g;

    public g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f90383d = i65.a.b(context, 34);
        this.f90384e = i65.a.b(context, 24);
        this.f90386g = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF180019n() {
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, this.f90383d);
    }

    public final int m(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17) {
        int i18;
        m7996x5201473d(z2Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int m8020x7e414b06 = m8020x7e414b06();
        int i19 = 0;
        int i27 = 0;
        while (true) {
            i18 = this.f90384e;
            if (i19 >= m8020x7e414b06) {
                break;
            }
            android.view.View f17 = z2Var.f(i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
            arrayList.add(f17);
            mo8051xe81a0a5e(f17, 0, 0);
            i27 += m8014x2ea13bdf(f17) + i18;
            i19++;
        }
        int max = java.lang.Math.max(0, i27 - i18);
        if (max <= m8037x755bd410()) {
            int m8037x755bd410 = (m8037x755bd410() - max) / 2;
            int m8020x7e414b062 = m8020x7e414b06();
            for (int i28 = 0; i28 < m8020x7e414b062; i28++) {
                android.view.View view = (android.view.View) arrayList.get(i28);
                mo7989xbb8aeee6(view);
                int m8014x2ea13bdf = m8014x2ea13bdf(view);
                m8049xe4474aed(view, m8037x755bd410, 0, m8037x755bd410 + m8014x2ea13bdf, this.f90383d);
                m8037x755bd410 += m8014x2ea13bdf + i18;
            }
            return 0;
        }
        int f18 = e06.p.f(this.f90385f + i17, 0, max - m8037x755bd410());
        int m8037x755bd4102 = m8037x755bd410() + f18;
        int m8020x7e414b063 = m8020x7e414b06();
        int i29 = 0;
        for (int i37 = 0; i37 < m8020x7e414b063; i37++) {
            android.view.View view2 = (android.view.View) arrayList.get(i37);
            int m8014x2ea13bdf2 = m8014x2ea13bdf(view2);
            if (i29 + m8014x2ea13bdf2 < f18) {
                i29 += m8014x2ea13bdf2 + i18;
                z2Var.i(view2);
            } else if (i29 > m8037x755bd4102) {
                z2Var.i(view2);
            } else {
                mo7989xbb8aeee6(view2);
                int i38 = i29 - f18;
                m8049xe4474aed(view2, i38, 0, i38 + m8014x2ea13bdf2, this.f90383d);
                i29 += m8014x2ea13bdf2 + i18;
            }
        }
        return f18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int i18 = this.f90386g;
        this.f90386g = -1;
        int i19 = 0;
        if (i18 < 0) {
            m(recycler, 0);
            return;
        }
        m7996x5201473d(recycler);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int m8020x7e414b06 = m8020x7e414b06();
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i17 = this.f90384e;
            if (i27 >= m8020x7e414b06) {
                break;
            }
            android.view.View f17 = recycler.f(i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getViewForPosition(...)");
            arrayList.add(f17);
            mo8051xe81a0a5e(f17, 0, 0);
            int m8014x2ea13bdf = m8014x2ea13bdf(f17);
            if (i27 == i18) {
                i29 = (m8014x2ea13bdf / 2) + i28;
            }
            i28 += m8014x2ea13bdf + i17;
            i27++;
        }
        int max = java.lang.Math.max(0, i28 - i17);
        if (max <= m8037x755bd410()) {
            this.f90385f = 0;
            int m8037x755bd410 = (m8037x755bd410() - max) / 2;
            int m8020x7e414b062 = m8020x7e414b06();
            while (i19 < m8020x7e414b062) {
                android.view.View view = (android.view.View) arrayList.get(i19);
                mo7989xbb8aeee6(view);
                int m8014x2ea13bdf2 = m8014x2ea13bdf(view);
                m8049xe4474aed(view, m8037x755bd410, 0, m8037x755bd410 + m8014x2ea13bdf2, this.f90383d);
                m8037x755bd410 += m8014x2ea13bdf2 + i17;
                i19++;
            }
            return;
        }
        int f18 = e06.p.f(i29 - (m8037x755bd410() / 2), 0, max - m8037x755bd410());
        this.f90385f = f18;
        int m8037x755bd4102 = m8037x755bd410() + f18;
        int m8020x7e414b063 = m8020x7e414b06();
        int i37 = 0;
        while (i19 < m8020x7e414b063) {
            android.view.View view2 = (android.view.View) arrayList.get(i19);
            int m8014x2ea13bdf3 = m8014x2ea13bdf(view2);
            if (i37 + m8014x2ea13bdf3 < f18) {
                i37 += m8014x2ea13bdf3 + i17;
                recycler.i(view2);
            } else if (i37 > m8037x755bd4102) {
                recycler.i(view2);
            } else {
                mo7989xbb8aeee6(view2);
                int i38 = i37 - f18;
                m8049xe4474aed(view2, i38, 0, i38 + m8014x2ea13bdf3, this.f90383d);
                i37 += m8014x2ea13bdf3 + i17;
            }
            i19++;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 recycler, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        int m17 = m(recycler, i17);
        int i18 = m17 - this.f90385f;
        this.f90385f = m17;
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f90386g = i17;
        m8087x46ac7299();
    }
}
