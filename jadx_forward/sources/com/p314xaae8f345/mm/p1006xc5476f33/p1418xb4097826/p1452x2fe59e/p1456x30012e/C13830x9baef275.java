package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e;

/* renamed from: com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager */
/* loaded from: classes15.dex */
public class C13830x9baef275 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f188287d;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 f188289f;

    /* renamed from: g, reason: collision with root package name */
    public vc2.e f188290g;

    /* renamed from: h, reason: collision with root package name */
    public final vc2.e f188291h;

    /* renamed from: i, reason: collision with root package name */
    public vc2.g f188292i;

    /* renamed from: m, reason: collision with root package name */
    public wc2.a f188293m;

    /* renamed from: n, reason: collision with root package name */
    public final vc2.j f188294n;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f188297q;

    /* renamed from: e, reason: collision with root package name */
    public int f188288e = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f188295o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f188296p = 0;

    public C13830x9baef275() {
        vc2.e eVar = new vc2.e();
        this.f188290g = eVar;
        this.f188291h = vc2.e.a(eVar);
        mo8089xb148c794(true);
        this.f188294n = new vc2.j(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        if (m8008x3d79f549() == 0) {
            return false;
        }
        android.view.View m8007x6a486239 = m8007x6a486239(0);
        android.view.View m8007x6a4862392 = m8007x6a486239(m8008x3d79f549() - 1);
        return ((q(m8007x6a486239) == 0 && m8016xfbd72d54(m8007x6a486239(r(0))) >= m8031xf39fff7a()) && (q(m8007x6a4862392) == this.f188287d.mo7946xf939df19().mo1894x7e414b06() - 1 && m8010xd6b039cc(m8007x6a486239(r(m8008x3d79f549() - 1))) <= n())) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    public final int m(int i17, android.graphics.Rect rect, vc2.f fVar) {
        return fVar.f516773a.f516771a.ordinal() != 1 ? i17 + rect.width() : i17 - rect.width();
    }

    public final int n() {
        return m8018x1c4fb41d() - m8026xc96f6de6();
    }

    public final boolean o(android.view.View view, int i17, int i18, int i19, vc2.f fVar, android.graphics.Rect rect, vc2.d dVar) {
        mo8052x6ae7e3a1(view, 0, 0);
        int m8014x2ea13bdf = m8014x2ea13bdf(view);
        int m8013x8bb7462e = m8013x8bb7462e(view);
        if (fVar.f516773a.f516771a.ordinal() != 1) {
            int m8028x805c2682 = m8028x805c2682();
            int w17 = w();
            dVar.getClass();
            if (!vc2.g.b(i17, m8014x2ea13bdf, m8028x805c2682, w17, 0, fVar)) {
                rect.left = i17;
                rect.top = i18;
                rect.right = i17 + m8014x2ea13bdf;
                rect.bottom = i18 + m8013x8bb7462e;
                return false;
            }
            int m8028x805c26822 = m8028x805c2682();
            rect.left = m8028x805c26822;
            int i27 = i18 + i19;
            rect.top = i27;
            rect.right = m8028x805c26822 + m8014x2ea13bdf;
            rect.bottom = i27 + m8013x8bb7462e;
        } else {
            int m8028x805c26823 = m8028x805c2682();
            int w18 = w();
            dVar.getClass();
            if (!vc2.g.b(i17, m8014x2ea13bdf, m8028x805c26823, w18, 0, fVar)) {
                rect.left = i17 - m8014x2ea13bdf;
                rect.top = i18;
                rect.right = i17;
                rect.bottom = i18 + m8013x8bb7462e;
                return false;
            }
            rect.left = w() - m8014x2ea13bdf;
            rect.top = i18 + i19;
            rect.right = w();
            rect.bottom = rect.top + m8013x8bb7462e;
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAdapterChanged */
    public void mo8056xff347824(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2) {
        vc2.j jVar = this.f188294n;
        if (f2Var != null && jVar.f516784e) {
            try {
                jVar.f516784e = false;
                f2Var.mo8165x48eac7b3(jVar);
            } catch (java.lang.IllegalStateException unused) {
            }
        }
        if (f2Var2 != null) {
            jVar.f516784e = true;
            f2Var2.mo8163xed962dec(jVar);
        }
        m8076xba225f1();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAttachedToWindow */
    public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.mo8058xfc50800e(c1163xf1deaba4);
        this.f188287d = c1163xf1deaba4;
        vc2.g gVar = new vc2.g(this, c1163xf1deaba4);
        this.f188292i = gVar;
        this.f188293m = new wc2.a(this.f188290g.f516772b, gVar.c());
        if (this.f188292i.c() == 0) {
            if (this.f188297q == null) {
                this.f188297q = new vc2.b(this, c1163xf1deaba4);
            }
            c1163xf1deaba4.getViewTreeObserver().addOnGlobalLayoutListener(this.f188297q);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        if (this.f188297q != null) {
            c1163xf1deaba4.getViewTreeObserver().removeOnGlobalLayoutListener(this.f188297q);
            this.f188297q = null;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        wc2.a aVar = this.f188293m;
        if (aVar.g()) {
            aVar.c(i17);
            android.util.SparseArray sparseArray = aVar.f526032c;
            int size = sparseArray.size();
            while (true) {
                size--;
                if (size < i17) {
                    break;
                } else {
                    sparseArray.put(size + i18, (android.graphics.Point) sparseArray.get(size));
                }
            }
            for (int i19 = i17; i19 < i17 + i18; i19++) {
                sparseArray.remove(i19);
            }
            aVar.e();
        }
        super.mo7916x721d405f(c1163xf1deaba4, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsChanged */
    public void mo7917xd0486653(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f188290g = vc2.e.a(this.f188291h);
        wc2.a aVar = this.f188293m;
        if (aVar != null) {
            aVar.f526032c.clear();
            aVar.f526033d.clear();
        }
        this.f188293m = new wc2.a(this.f188290g.f516772b, this.f188292i.c());
        super.mo7917xd0486653(c1163xf1deaba4);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsMoved */
    public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        int i27;
        android.util.SparseArray sparseArray;
        wc2.a aVar = this.f188293m;
        if (aVar.g()) {
            aVar.c(java.lang.Math.min(i17, i18));
            android.graphics.Point[] pointArr = new android.graphics.Point[i19];
            int i28 = i17;
            while (true) {
                i27 = i17 + i19;
                sparseArray = aVar.f526032c;
                if (i28 >= i27) {
                    break;
                }
                pointArr[i28 - i17] = (android.graphics.Point) sparseArray.get(i28);
                i28++;
            }
            int i29 = i17 - i18;
            int i37 = 0;
            boolean z17 = i29 > 0;
            int abs = java.lang.Math.abs(i29);
            if (!z17) {
                abs -= i19;
            }
            if (z17) {
                i27 = i17 - 1;
            }
            int i38 = z17 ? -1 : 1;
            for (int i39 = 0; i39 < abs; i39++) {
                sparseArray.put(i27 - (i38 * i19), (android.graphics.Point) sparseArray.get(i27));
                i27 += i38;
            }
            int i47 = !z17 ? abs + i17 : i18;
            while (i37 < i19) {
                sparseArray.put(i47, pointArr[i37]);
                i37++;
                i47++;
            }
            aVar.e();
        }
        super.mo7918x72cb9e12(c1163xf1deaba4, i17, i18, i19);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        wc2.a aVar = this.f188293m;
        if (aVar.g()) {
            aVar.c(i17);
            int i19 = i17 + i18;
            android.util.SparseArray sparseArray = aVar.f526032c;
            int size = i19 > sparseArray.size() ? sparseArray.size() - i17 : i18;
            for (int i27 = 0; i27 < size; i27++) {
                sparseArray.remove(i17 + i27);
            }
            for (int i28 = i17 + size; i28 < sparseArray.size() + size; i28++) {
                android.graphics.Point point = (android.graphics.Point) sparseArray.get(i28);
                sparseArray.remove(i28);
                sparseArray.put(i28 - size, point);
            }
            aVar.e();
        }
        super.mo7919xe5511bff(c1163xf1deaba4, i17, i18);
        vc2.j jVar = this.f188294n;
        jVar.getClass();
        jVar.f516780a.m8075x84c2c3a5(new vc2.i(jVar, c1163xf1deaba4));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo8065x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        this.f188293m.b(i17, i18);
        super.mo8065x9643e45a(c1163xf1deaba4, i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r29, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r30) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1456x30012e.C13830x9baef275.mo2418x457c9b08(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    public final int p(int i17) {
        return q(m8007x6a486239(i17));
    }

    public final int q(android.view.View view) {
        if (view == null) {
            return -1;
        }
        return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams()).a();
    }

    public final int r(int i17) {
        android.view.View m8007x6a486239 = m8007x6a486239(i17);
        int m8013x8bb7462e = m8013x8bb7462e(m8007x6a486239);
        int m8013x8bb7462e2 = m8013x8bb7462e(m8007x6a486239);
        int i18 = i17;
        int i19 = i18;
        while (i18 >= 0 && !s(i18, vc2.f.a(this.f188290g))) {
            android.view.View m8007x6a4862392 = m8007x6a486239(i18);
            if (m8013x8bb7462e(m8007x6a4862392) > m8013x8bb7462e) {
                m8013x8bb7462e = m8013x8bb7462e(m8007x6a4862392);
                i19 = i18;
            }
            i18--;
        }
        if (m8013x8bb7462e < m8013x8bb7462e(m8007x6a486239(i18))) {
            m8013x8bb7462e = m8013x8bb7462e(m8007x6a486239(i18));
        } else {
            i18 = i19;
        }
        int i27 = m8013x8bb7462e2;
        int i28 = i17;
        while (i17 < m8008x3d79f549()) {
            vc2.f a17 = vc2.f.a(this.f188290g);
            int i29 = a17.f516773a.f516772b;
            boolean z17 = true;
            if ((!(i29 > 0) || a17.f516774b != i29) && m8008x3d79f549() != 0 && i17 != m8008x3d79f549() - 1) {
                z17 = s(i17 + 1, a17);
            }
            if (z17) {
                break;
            }
            android.view.View m8007x6a4862393 = m8007x6a486239(i17);
            if (m8013x8bb7462e(m8007x6a4862393) > i27) {
                i27 = m8013x8bb7462e(m8007x6a4862393);
                i28 = i17;
            }
            i17++;
        }
        if (i27 < m8013x8bb7462e(m8007x6a486239(i17))) {
            i27 = m8013x8bb7462e(m8007x6a486239(i17));
        } else {
            i17 = i28;
        }
        return m8013x8bb7462e >= i27 ? i18 : i17;
    }

    public final boolean s(int i17, vc2.f fVar) {
        if (i17 == 0) {
            return true;
        }
        return fVar.f516773a.f516771a.ordinal() != 1 ? m8012x7f0ab3e8(m8007x6a486239(i17)) <= m8028x805c2682() : m8015x62a22a5b(m8007x6a486239(i17)) >= w();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f188288e = i17;
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i18;
        int i19;
        int max;
        int d17;
        int i27;
        if (i17 == 0 || m8020x7e414b06() == 0) {
            return 0;
        }
        android.view.View m8007x6a486239 = m8007x6a486239(0);
        int i28 = 1;
        android.view.View m8007x6a4862392 = m8007x6a486239(m8008x3d79f549() - 1);
        android.view.View m8007x6a4862393 = m8007x6a486239(r(0));
        android.view.View m8007x6a4862394 = m8007x6a486239(r(m8008x3d79f549() - 1));
        boolean z17 = q(m8007x6a486239) == 0 && m8016xfbd72d54(m8007x6a4862393) >= m8031xf39fff7a();
        boolean z18 = q(m8007x6a4862392) == this.f188287d.mo7946xf939df19().mo1894x7e414b06() - 1 && m8010xd6b039cc(m8007x6a4862394) <= n();
        if (i17 > 0 && z18) {
            return 0;
        }
        if (i17 < 0 && z17) {
            return 0;
        }
        if (i17 > 0) {
            int m8010xd6b039cc = m8010xd6b039cc(m8007x6a486239(r(m8008x3d79f549() - 1))) - n();
            if (m8010xd6b039cc >= i17) {
                mo8055xe23cdd48(-i17);
                return i17;
            }
            int i29 = m8010xd6b039cc;
            while (p(m8008x3d79f549() - i28) < m8020x7e414b06() - i28) {
                int i37 = t().x;
                int m8010xd6b039cc2 = m8010xd6b039cc(m8007x6a486239(r(m8008x3d79f549() - i28)));
                int p17 = p(m8008x3d79f549() - i28) + i28;
                if (p17 != m8020x7e414b06()) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    vc2.f a17 = vc2.f.a(this.f188290g);
                    vc2.d dVar = new vc2.d(this);
                    int i38 = i37;
                    int i39 = p17;
                    int i47 = i28;
                    while (i39 < m8020x7e414b06()) {
                        android.view.View f17 = z2Var.f(i39);
                        int i48 = i39;
                        int i49 = i38;
                        vc2.d dVar2 = dVar;
                        int i57 = m8010xd6b039cc2;
                        vc2.f fVar = a17;
                        boolean o17 = o(f17, i38, m8010xd6b039cc2, 0, a17, rect, dVar2);
                        this.f188293m.f(i48, new android.graphics.Point(rect.width(), rect.height()));
                        if (o17 && i47 == 0) {
                            z2Var.i(f17);
                            fVar.f516774b = 1;
                            i27 = 1;
                            break;
                        }
                        mo7989xbb8aeee6(f17);
                        m8049xe4474aed(f17, rect.left, rect.top, rect.right, rect.bottom);
                        i38 = m(i49, rect, fVar);
                        i39 = i48 + 1;
                        fVar.f516774b++;
                        i28 = 1;
                        a17 = fVar;
                        dVar = dVar2;
                        m8010xd6b039cc2 = i57;
                        i47 = 0;
                    }
                }
                i27 = i28;
                i29 += m8013x8bb7462e(m8007x6a486239(r(m8008x3d79f549() - i27)));
                if (i29 >= i17) {
                    break;
                }
                i28 = 1;
            }
            if (i29 >= i17) {
                i29 = i17;
            }
            mo8055xe23cdd48(-i29);
            while (!u(0)) {
                v(0, z2Var);
            }
            this.f188288e = p(0);
            return i29;
        }
        int m8031xf39fff7a = m8031xf39fff7a() - m8016xfbd72d54(m8007x6a486239(r(0)));
        if (m8031xf39fff7a > java.lang.Math.abs(i17)) {
            mo8055xe23cdd48(-i17);
            i18 = i17;
        } else {
            int i58 = m8031xf39fff7a;
            for (int i59 = 0; p(i59) > 0; i59 = 0) {
                int i66 = t().x;
                int m8016xfbd72d54 = m8016xfbd72d54(m8007x6a486239(r(i59)));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int i67 = -1;
                int p18 = p(i59) - 1;
                android.graphics.Rect rect2 = new android.graphics.Rect();
                vc2.f a18 = vc2.f.a(this.f188290g);
                int p19 = p(i59);
                wc2.a aVar = this.f188293m;
                if (aVar.g() && (d17 = aVar.d(p19)) != -1 && d17 > 0) {
                    int d18 = this.f188293m.d(p19) - 1;
                    wc2.a aVar2 = this.f188293m;
                    wc2.b bVar = aVar2.g() ? (wc2.b) aVar2.f526033d.get(d18, null) : null;
                    wc2.a aVar3 = this.f188293m;
                    if (aVar3.g()) {
                        i67 = 0;
                        for (int i68 = 0; i68 < d18; i68++) {
                            i67 += ((wc2.b) aVar3.f526033d.get(i68)).f526035a;
                        }
                    }
                    for (int i69 = 0; i69 < bVar.f526035a; i69++) {
                        android.view.View f18 = z2Var.f(i67 + i69);
                        m7990xbb8aeee6(f18, i69);
                        linkedList.add(f18);
                    }
                    i19 = bVar.f526037c;
                } else {
                    vc2.d dVar3 = new vc2.d(this);
                    int i76 = i66;
                    int i77 = 0;
                    int i78 = 0;
                    boolean z19 = true;
                    while (i78 <= p18) {
                        android.view.View f19 = z2Var.f(i78);
                        int i79 = i77;
                        int i86 = i76;
                        int i87 = i78;
                        vc2.d dVar4 = dVar3;
                        int i88 = p18;
                        vc2.f fVar2 = a18;
                        boolean o18 = o(f19, i76, 0, i79, a18, rect2, dVar4);
                        this.f188293m.f(i87, new android.graphics.Point(rect2.width(), rect2.height()));
                        m7990xbb8aeee6(f19, linkedList.size());
                        if (!o18 || z19) {
                            int m17 = m(i86, rect2, fVar2);
                            max = java.lang.Math.max(i79, rect2.height());
                            fVar2.f516774b++;
                            i76 = m17;
                            z19 = false;
                        } else {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                m8079xef099f25((android.view.View) it.next(), z2Var);
                            }
                            linkedList.clear();
                            int m18 = m(t().x, rect2, fVar2);
                            max = rect2.height();
                            fVar2.f516774b = 1;
                            i76 = m18;
                        }
                        linkedList.add(f19);
                        i78 = i87 + 1;
                        i77 = max;
                        a18 = fVar2;
                        dVar3 = dVar4;
                        p18 = i88;
                    }
                    i19 = i77;
                }
                int i89 = t().x;
                int i96 = m8016xfbd72d54 - i19;
                vc2.f a19 = vc2.f.a(this.f188290g);
                vc2.d dVar5 = new vc2.d(this);
                int i97 = i89;
                int i98 = 0;
                boolean z27 = true;
                while (i98 < linkedList.size()) {
                    android.view.View view = (android.view.View) linkedList.get(i98);
                    int i99 = i19;
                    int i100 = i19;
                    int i101 = i97;
                    int i102 = i98;
                    vc2.d dVar6 = dVar5;
                    if (o(view, i97, i96, i99, a19, rect2, dVar5) && z27) {
                        int height = rect2.height();
                        rect2.top -= height;
                        rect2.bottom -= height;
                        z27 = false;
                    }
                    m8049xe4474aed(view, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    i97 = m(i101, rect2, a19);
                    i98 = i102 + 1;
                    i19 = i100;
                    dVar5 = dVar6;
                }
                i58 += m8013x8bb7462e(m8007x6a486239(r(0)));
                if (i58 >= java.lang.Math.abs(i17)) {
                    break;
                }
            }
            i18 = i58 < java.lang.Math.abs(i17) ? -i58 : i17;
            mo8055xe23cdd48(-i18);
            while (!u(m8008x3d79f549() - 1)) {
                v(m8008x3d79f549() - 1, z2Var);
            }
            this.f188288e = p(0);
        }
        return i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: setAutoMeasureEnabled */
    public void mo8089xb148c794(boolean z17) {
        super.mo8089xb148c794(z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: setMeasuredDimension */
    public void mo8093xd88558fe(int i17, int i18) {
        vc2.j jVar = this.f188294n;
        if (jVar.f516781b) {
            jVar.f516782c = java.lang.Math.max(i17, jVar.f516785f.intValue());
            jVar.f516783d = java.lang.Math.max(i18, jVar.f516787h.intValue());
        } else {
            jVar.f516782c = i17;
            jVar.f516783d = i18;
        }
        super.mo8093xd88558fe(jVar.f516782c, jVar.f516783d);
        int i19 = jVar.f516783d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        vc2.c cVar = new vc2.c(this, c1163xf1deaba4.getContext());
        cVar.f93582a = i17;
        m8099x6305639d(cVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        return true;
    }

    public final android.graphics.Point t() {
        return this.f188292i.a(vc2.f.a(this.f188290g));
    }

    public final boolean u(int i17) {
        android.view.View m8007x6a486239 = m8007x6a486239(r(i17));
        return android.graphics.Rect.intersects(new android.graphics.Rect(m8028x805c2682(), m8031xf39fff7a(), w(), n()), new android.graphics.Rect(m8028x805c2682(), m8016xfbd72d54(m8007x6a486239), w(), m8010xd6b039cc(m8007x6a486239)));
    }

    public final void v(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        while (!s(i17, vc2.f.a(this.f188290g))) {
            i17--;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(m8007x6a486239(i17));
        while (true) {
            i17++;
            if (i17 >= m8008x3d79f549() || s(i17, vc2.f.a(this.f188290g))) {
                break;
            } else {
                linkedList.add(m8007x6a486239(i17));
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            m8079xef099f25((android.view.View) it.next(), z2Var);
        }
    }

    public final int w() {
        return m8037x755bd410() - m8029x8b7f0b01();
    }

    public final android.graphics.Point x(android.graphics.Rect rect, vc2.f fVar) {
        return fVar.f516773a.f516771a.ordinal() != 1 ? new android.graphics.Point(m8028x805c2682() + rect.width(), rect.top) : new android.graphics.Point(w() - rect.width(), rect.top);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo7920x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.Object obj) {
        this.f188293m.b(i17, i18);
        super.mo7920x9643e45a(c1163xf1deaba4, i17, i18, obj);
    }
}
