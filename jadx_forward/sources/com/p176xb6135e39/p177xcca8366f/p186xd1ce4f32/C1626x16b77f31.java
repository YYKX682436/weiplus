package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* renamed from: com.google.android.flexbox.FlexboxLayoutManager */
/* loaded from: classes15.dex */
public class C1626x16b77f31 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager implements com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a, p012xc85e97e9.p103xe821e364.p104xd1075a44.f3 {
    public static final android.graphics.Rect F = new android.graphics.Rect();
    public final android.util.SparseArray A;
    public final android.content.Context B;
    public android.view.View C;
    public int D;
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d E;

    /* renamed from: d, reason: collision with root package name */
    public int f125732d;

    /* renamed from: e, reason: collision with root package name */
    public int f125733e;

    /* renamed from: f, reason: collision with root package name */
    public int f125734f;

    /* renamed from: g, reason: collision with root package name */
    public int f125735g;

    /* renamed from: h, reason: collision with root package name */
    public final int f125736h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125737i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f125738m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f125739n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f f125740o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 f125741p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 f125742q;

    /* renamed from: r, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k f125743r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i f125744s;

    /* renamed from: t, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f125745t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f125746u;

    /* renamed from: v, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState f125747v;

    /* renamed from: w, reason: collision with root package name */
    public int f125748w;

    /* renamed from: x, reason: collision with root package name */
    public int f125749x;

    /* renamed from: y, reason: collision with root package name */
    public int f125750y;

    /* renamed from: z, reason: collision with root package name */
    public int f125751z;

    public C1626x16b77f31(android.content.Context context) {
        this(context, 0, 1);
    }

    /* renamed from: isMeasurementUpToDate */
    public static boolean m17247xaa5ea196(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (i19 > 0 && i17 != i19) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i17;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i17;
        }
        return true;
    }

    /* renamed from: shouldMeasureChild */
    private boolean m17248x58b67fb1(android.view.View view, int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && m8046xbf836eb1() && m17247xaa5ea196(view.getWidth(), i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width) && m17247xaa5ea196(view.getHeight(), i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public final int A(int i17) {
        int i18;
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return 0;
        }
        p();
        boolean l17 = l();
        android.view.View view = this.C;
        int width = l17 ? view.getWidth() : view.getHeight();
        int m8037x755bd410 = l17 ? m8037x755bd410() : m8018x1c4fb41d();
        boolean z17 = m8022x6fcfed3f() == 1;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar = this.f125744s;
        if (z17) {
            int abs = java.lang.Math.abs(i17);
            if (i17 < 0) {
                return -java.lang.Math.min((m8037x755bd410 + iVar.f125793d) - width, abs);
            }
            i18 = iVar.f125793d;
            if (i18 + i17 <= 0) {
                return i17;
            }
        } else {
            if (i17 > 0) {
                return java.lang.Math.min((m8037x755bd410 - iVar.f125793d) - width, i17);
            }
            i18 = iVar.f125793d;
            if (i18 + i17 >= 0) {
                return i17;
            }
        }
        return -i18;
    }

    public final void B(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k kVar) {
        int m8008x3d79f549;
        android.view.View m8007x6a486239;
        int i17;
        int m8008x3d79f5492;
        int i18;
        android.view.View m8007x6a4862392;
        int i19;
        if (kVar.f125807j) {
            int i27 = kVar.f125806i;
            int i28 = -1;
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f fVar = this.f125740o;
            if (i27 == -1) {
                if (kVar.f125803f < 0 || (m8008x3d79f5492 = m8008x3d79f549()) == 0 || (m8007x6a4862392 = m8007x6a486239(m8008x3d79f5492 - 1)) == null || (i19 = fVar.f125787c[m8032xa86cd69f(m8007x6a4862392)]) == -1) {
                    return;
                }
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i19);
                int i29 = i18;
                while (true) {
                    if (i29 < 0) {
                        break;
                    }
                    android.view.View m8007x6a4862393 = m8007x6a486239(i29);
                    if (m8007x6a4862393 != null) {
                        int i37 = kVar.f125803f;
                        if (!(l() || !this.f125737i ? this.f125745t.e(m8007x6a4862393) >= this.f125745t.f() - i37 : this.f125745t.b(m8007x6a4862393) <= i37)) {
                            break;
                        }
                        if (bVar.f125777o != m8032xa86cd69f(m8007x6a4862393)) {
                            continue;
                        } else if (i19 <= 0) {
                            m8008x3d79f5492 = i29;
                            break;
                        } else {
                            i19 += kVar.f125806i;
                            bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i19);
                            m8008x3d79f5492 = i29;
                        }
                    }
                    i29--;
                }
                while (i18 >= m8008x3d79f5492) {
                    m8080x531e7238(i18, z2Var);
                    i18--;
                }
                return;
            }
            if (kVar.f125803f < 0 || (m8008x3d79f549 = m8008x3d79f549()) == 0 || (m8007x6a486239 = m8007x6a486239(0)) == null || (i17 = fVar.f125787c[m8032xa86cd69f(m8007x6a486239)]) == -1) {
                return;
            }
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar2 = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i17);
            int i38 = 0;
            while (true) {
                if (i38 >= m8008x3d79f549) {
                    break;
                }
                android.view.View m8007x6a4862394 = m8007x6a486239(i38);
                if (m8007x6a4862394 != null) {
                    int i39 = kVar.f125803f;
                    if (!(l() || !this.f125737i ? this.f125745t.b(m8007x6a4862394) <= i39 : this.f125745t.f() - this.f125745t.e(m8007x6a4862394) <= i39)) {
                        break;
                    }
                    if (bVar2.f125778p != m8032xa86cd69f(m8007x6a4862394)) {
                        continue;
                    } else if (i17 >= this.f125739n.size() - 1) {
                        i28 = i38;
                        break;
                    } else {
                        i17 += kVar.f125806i;
                        bVar2 = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i17);
                        i28 = i38;
                    }
                }
                i38++;
            }
            while (i28 >= 0) {
                m8080x531e7238(i28, z2Var);
                i28--;
            }
        }
    }

    public final void C() {
        int m8019x47130b60 = l() ? m8019x47130b60() : m8038xfc57f9d3();
        this.f125743r.f125799b = m8019x47130b60 == 0 || m8019x47130b60 == Integer.MIN_VALUE;
    }

    public void D(int i17) {
        int i18 = this.f125735g;
        if (i18 != i17) {
            if (i18 == 4 || i17 == 4) {
                m8076xba225f1();
                this.f125739n.clear();
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar = this.f125744s;
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i.b(iVar);
                iVar.f125793d = 0;
            }
            this.f125735g = i17;
            m8087x46ac7299();
        }
    }

    public void E(int i17) {
        if (this.f125732d != i17) {
            m8076xba225f1();
            this.f125732d = i17;
            this.f125745t = null;
            this.f125746u = null;
            this.f125739n.clear();
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar = this.f125744s;
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i.b(iVar);
            iVar.f125793d = 0;
            m8087x46ac7299();
        }
    }

    public void F(int i17) {
        if (i17 == 2) {
            throw new java.lang.UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i18 = this.f125733e;
        if (i18 != i17) {
            if (i18 == 0 || i17 == 0) {
                m8076xba225f1();
                this.f125739n.clear();
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar = this.f125744s;
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i.b(iVar);
                iVar.f125793d = 0;
            }
            this.f125733e = i17;
            this.f125745t = null;
            this.f125746u = null;
            m8087x46ac7299();
        }
    }

    public final void G(int i17) {
        android.view.View v17 = v(m8008x3d79f549() - 1, -1, false);
        if (i17 >= (v17 != null ? m8032xa86cd69f(v17) : -1)) {
            return;
        }
        int m8008x3d79f549 = m8008x3d79f549();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f fVar = this.f125740o;
        fVar.j(m8008x3d79f549);
        fVar.k(m8008x3d79f549);
        fVar.i(m8008x3d79f549);
        if (i17 >= fVar.f125787c.length) {
            return;
        }
        this.D = i17;
        android.view.View m8007x6a486239 = m8007x6a486239(0);
        if (m8007x6a486239 == null) {
            return;
        }
        this.f125748w = m8032xa86cd69f(m8007x6a486239);
        if (l() || !this.f125737i) {
            this.f125749x = this.f125745t.e(m8007x6a486239) - this.f125745t.k();
        } else {
            this.f125749x = this.f125745t.b(m8007x6a486239) + this.f125745t.h();
        }
    }

    public final void H(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar, boolean z17, boolean z18) {
        int i17;
        if (z18) {
            C();
        } else {
            this.f125743r.f125799b = false;
        }
        if (l() || !this.f125737i) {
            this.f125743r.f125798a = this.f125745t.g() - iVar.f125792c;
        } else {
            this.f125743r.f125798a = iVar.f125792c - m8029x8b7f0b01();
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k kVar = this.f125743r;
        kVar.f125801d = iVar.f125790a;
        kVar.f125805h = 1;
        kVar.f125806i = 1;
        kVar.f125802e = iVar.f125792c;
        kVar.f125803f = Integer.MIN_VALUE;
        kVar.f125800c = iVar.f125791b;
        if (!z17 || this.f125739n.size() <= 1 || (i17 = iVar.f125791b) < 0 || i17 >= this.f125739n.size() - 1) {
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(iVar.f125791b);
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k kVar2 = this.f125743r;
        kVar2.f125800c++;
        kVar2.f125801d += bVar.f125770h;
    }

    public final void I(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i iVar, boolean z17, boolean z18) {
        if (z18) {
            C();
        } else {
            this.f125743r.f125799b = false;
        }
        if (l() || !this.f125737i) {
            this.f125743r.f125798a = iVar.f125792c - this.f125745t.k();
        } else {
            this.f125743r.f125798a = (this.C.getWidth() - iVar.f125792c) - this.f125745t.k();
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k kVar = this.f125743r;
        kVar.f125801d = iVar.f125790a;
        kVar.f125805h = 1;
        kVar.f125806i = -1;
        kVar.f125802e = iVar.f125792c;
        kVar.f125803f = Integer.MIN_VALUE;
        int i17 = iVar.f125791b;
        kVar.f125800c = i17;
        if (!z17 || i17 <= 0) {
            return;
        }
        int size = this.f125739n.size();
        int i18 = iVar.f125791b;
        if (size > i18) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i18);
            r4.f125800c--;
            this.f125743r.f125801d -= bVar.f125770h;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f3
    public android.graphics.PointF a(int i17) {
        android.view.View m8007x6a486239;
        if (m8008x3d79f549() == 0 || (m8007x6a486239 = m8007x6a486239(0)) == null) {
            return null;
        }
        int i18 = i17 < m8032xa86cd69f(m8007x6a486239) ? -1 : 1;
        return l() ? new android.graphics.PointF(0.0f, i18) : new android.graphics.PointF(i18, 0.0f);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void b(android.view.View view, int i17, int i18, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
        m7995x142d145d(view, F);
        if (l()) {
            int m8023xe96e78b9 = m8023xe96e78b9(view) + m8033x269429b0(view);
            bVar.f125767e += m8023xe96e78b9;
            bVar.f125768f += m8023xe96e78b9;
        } else {
            int m8035xd0248a36 = m8035xd0248a36(view) + m8006xda9e9138(view);
            bVar.f125767e += m8035xd0248a36;
            bVar.f125768f += m8035xd0248a36;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public android.view.View c(int i17) {
        android.view.View view = (android.view.View) this.A.get(i17);
        return view != null ? view : this.f125741p.f(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        if (this.f125733e == 0) {
            return l();
        }
        if (l()) {
            int m8037x755bd410 = m8037x755bd410();
            android.view.View view = this.C;
            if (m8037x755bd410 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        if (this.f125733e == 0) {
            return !l();
        }
        if (l()) {
            return true;
        }
        int m8018x1c4fb41d = m8018x1c4fb41d();
        android.view.View view = this.C;
        return m8018x1c4fb41d > (view != null ? view.getHeight() : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: checkLayoutParams */
    public boolean mo7909xc6204678(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
        return layoutParams instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.LayoutParams;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollExtent */
    public int mo7929x8e0c6fb2(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return m(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollOffset */
    public int mo7930x9e19151b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return n(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollRange */
    public int mo7931x57d657b5(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollExtent */
    public int mo7932xa00e39c4(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return m(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollOffset */
    public int mo7933xb01adf2d(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return n(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollRange */
    public int mo7934xd44a0363(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int d(int i17, int i18, int i19) {
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8018x1c4fb41d(), m8019x47130b60(), i18, i19, getF204840r());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int e(android.view.View view) {
        int m8023xe96e78b9;
        int m8033x269429b0;
        if (l()) {
            m8023xe96e78b9 = m8035xd0248a36(view);
            m8033x269429b0 = m8006xda9e9138(view);
        } else {
            m8023xe96e78b9 = m8023xe96e78b9(view);
            m8033x269429b0 = m8033x269429b0(view);
        }
        return m8023xe96e78b9 + m8033x269429b0;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public android.view.View f(int i17) {
        return c(i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int g(android.view.View view, int i17, int i18) {
        int m8035xd0248a36;
        int m8006xda9e9138;
        if (l()) {
            m8035xd0248a36 = m8023xe96e78b9(view);
            m8006xda9e9138 = m8033x269429b0(view);
        } else {
            m8035xd0248a36 = m8035xd0248a36(view);
            m8006xda9e9138 = m8006xda9e9138(view);
        }
        return m8035xd0248a36 + m8006xda9e9138;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.LayoutParams(-2, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7910x5663b65(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.LayoutParams(context, attributeSet);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getAlignContent */
    public int mo17217x3416c82a() {
        return 5;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getAlignItems */
    public int mo17218xaee0b3b1() {
        return this.f125735g;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexDirection */
    public int mo17221x833fcbd0() {
        return this.f125732d;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexItemCount */
    public int mo17222x3b739e0d() {
        return this.f125742q.b();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexLinesInternal */
    public java.util.List mo17224x68d3ead() {
        return this.f125739n;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getFlexWrap */
    public int mo17225xe3d0dd59() {
        return this.f125733e;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getLargestMainSize */
    public int mo17227x5e625620() {
        if (this.f125739n.size() == 0) {
            return 0;
        }
        int size = this.f125739n.size();
        int i17 = Integer.MIN_VALUE;
        for (int i18 = 0; i18 < size; i18++) {
            i17 = java.lang.Math.max(i17, ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i18)).f125767e);
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getMaxLine */
    public int mo17228x7019b342() {
        return this.f125736h;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: getSumOfCrossSize */
    public int mo17231xc050e9f5() {
        int size = this.f125739n.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 += ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i18)).f125769g;
        }
        return i17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public int h(int i17, int i18, int i19) {
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(m8037x755bd410(), m8038xfc57f9d3(), i18, i19, mo2416xc6ea780e());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void i(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: isAutoMeasureEnabled */
    public boolean mo7936xd96f765c() {
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public void j(int i17, android.view.View view) {
        this.A.put(i17, view);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    public boolean l() {
        int i17 = this.f125732d;
        return i17 == 0 || i17 == 1;
    }

    public final int m(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        p();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() == 0 || r17 == null || t17 == null) {
            return 0;
        }
        return java.lang.Math.min(this.f125745t.l(), this.f125745t.b(t17) - this.f125745t.e(r17));
    }

    public final int n(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() != 0 && r17 != null && t17 != null) {
            int m8032xa86cd69f = m8032xa86cd69f(r17);
            int m8032xa86cd69f2 = m8032xa86cd69f(t17);
            int abs = java.lang.Math.abs(this.f125745t.b(t17) - this.f125745t.e(r17));
            int i17 = this.f125740o.f125787c[m8032xa86cd69f];
            if (i17 != 0 && i17 != -1) {
                return java.lang.Math.round((i17 * (abs / ((r4[m8032xa86cd69f2] - i17) + 1))) + (this.f125745t.k() - this.f125745t.e(r17)));
            }
        }
        return 0;
    }

    public final int o(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        int b17 = h3Var.b();
        android.view.View r17 = r(b17);
        android.view.View t17 = t(b17);
        if (h3Var.b() == 0 || r17 == null || t17 == null) {
            return 0;
        }
        android.view.View v17 = v(0, m8008x3d79f549(), false);
        int m8032xa86cd69f = v17 == null ? -1 : m8032xa86cd69f(v17);
        return (int) ((java.lang.Math.abs(this.f125745t.b(t17) - this.f125745t.e(r17)) / (((v(m8008x3d79f549() - 1, -1, false) != null ? m8032xa86cd69f(r1) : -1) - m8032xa86cd69f) + 1)) * h3Var.b());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAdapterChanged */
    public void mo8056xff347824(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2) {
        m8076xba225f1();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAttachedToWindow */
    public void mo8058xfc50800e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.mo8058xfc50800e(c1163xf1deaba4);
        this.C = (android.view.View) c1163xf1deaba4.getParent();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        super.mo7916x721d405f(c1163xf1deaba4, i17, i18);
        G(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsMoved */
    public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        super.mo7918x72cb9e12(c1163xf1deaba4, i17, i18, i19);
        G(java.lang.Math.min(i17, i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        super.mo7919xe5511bff(c1163xf1deaba4, i17, i18);
        G(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo7920x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.Object obj) {
        super.mo7920x9643e45a(c1163xf1deaba4, i17, i18, obj);
        G(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0280  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r22, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r23) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.mo2418x457c9b08(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        this.f125747v = null;
        this.f125748w = -1;
        this.f125749x = Integer.MIN_VALUE;
        this.D = -1;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i.b(this.f125744s);
        this.A.clear();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onRestoreInstanceState */
    public void mo7939xb949e58d(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState) {
            this.f125747v = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState) parcelable;
            m8087x46ac7299();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onSaveInstanceState */
    public android.os.Parcelable mo7940xa71a2260() {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState savedState = this.f125747v;
        if (savedState != null) {
            return new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState(savedState, (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.h) null);
        }
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState savedState2 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState();
        if (m8008x3d79f549() > 0) {
            android.view.View m8007x6a486239 = m8007x6a486239(0);
            savedState2.f125761d = m8032xa86cd69f(m8007x6a486239);
            savedState2.f125762e = this.f125745t.e(m8007x6a486239) - this.f125745t.k();
        } else {
            savedState2.f125761d = -1;
        }
        return savedState2;
    }

    public final void p() {
        if (this.f125745t != null) {
            return;
        }
        if (l()) {
            if (this.f125733e == 0) {
                this.f125745t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(this);
                this.f125746u = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this);
                return;
            } else {
                this.f125745t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this);
                this.f125746u = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(this);
                return;
            }
        }
        if (this.f125733e == 0) {
            this.f125745t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this);
            this.f125746u = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(this);
        } else {
            this.f125745t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u1(this);
            this.f125746u = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v1(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x042d, code lost:
    
        r26 = r3;
        r1 = r34.f125798a - r8;
        r34.f125798a = r1;
        r3 = r34.f125803f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0438, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x043a, code lost:
    
        r3 = r3 + r8;
        r34.f125803f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x043d, code lost:
    
        if (r1 >= 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x043f, code lost:
    
        r34.f125803f = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0442, code lost:
    
        B(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x044b, code lost:
    
        return r26 - r34.f125798a;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r32, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r33, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k r34) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.q(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3, com.google.android.flexbox.k):int");
    }

    public final android.view.View r(int i17) {
        android.view.View w17 = w(0, m8008x3d79f549(), i17);
        if (w17 == null) {
            return null;
        }
        int i18 = this.f125740o.f125787c[m8032xa86cd69f(w17)];
        if (i18 == -1) {
            return null;
        }
        return s(w17, (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(i18));
    }

    public final android.view.View s(android.view.View view, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
        boolean l17 = l();
        int i17 = bVar.f125770h;
        for (int i18 = 1; i18 < i17; i18++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i18);
            if (m8007x6a486239 != null && m8007x6a486239.getVisibility() != 8) {
                if (!this.f125737i || l17) {
                    if (this.f125745t.e(view) <= this.f125745t.e(m8007x6a486239)) {
                    }
                    view = m8007x6a486239;
                } else {
                    if (this.f125745t.b(view) >= this.f125745t.b(m8007x6a486239)) {
                    }
                    view = m8007x6a486239;
                }
            }
        }
        return view;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (!l() || this.f125733e == 0) {
            int z17 = z(i17, z2Var, h3Var);
            this.A.clear();
            return z17;
        }
        int A = A(i17);
        this.f125744s.f125793d += A;
        this.f125746u.p(-A);
        return A;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f125748w = i17;
        this.f125749x = Integer.MIN_VALUE;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState savedState = this.f125747v;
        if (savedState != null) {
            savedState.f125761d = -1;
        }
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (l() || (this.f125733e == 0 && !l())) {
            int z17 = z(i17, z2Var, h3Var);
            this.A.clear();
            return z17;
        }
        int A = A(i17);
        this.f125744s.f125793d += A;
        this.f125746u.p(-A);
        return A;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a
    /* renamed from: setFlexLines */
    public void mo17238xf1ffa444(java.util.List list) {
        this.f125739n = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 o1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.o1(c1163xf1deaba4.getContext());
        o1Var.f93582a = i17;
        m8099x6305639d(o1Var);
    }

    public final android.view.View t(int i17) {
        android.view.View w17 = w(m8008x3d79f549() - 1, -1, i17);
        if (w17 == null) {
            return null;
        }
        return u(w17, (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) this.f125739n.get(this.f125740o.f125787c[m8032xa86cd69f(w17)]));
    }

    public final android.view.View u(android.view.View view, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar) {
        boolean l17 = l();
        int m8008x3d79f549 = (m8008x3d79f549() - bVar.f125770h) - 1;
        for (int m8008x3d79f5492 = m8008x3d79f549() - 2; m8008x3d79f5492 > m8008x3d79f549; m8008x3d79f5492--) {
            android.view.View m8007x6a486239 = m8007x6a486239(m8008x3d79f5492);
            if (m8007x6a486239 != null && m8007x6a486239.getVisibility() != 8) {
                if (!this.f125737i || l17) {
                    if (this.f125745t.b(view) >= this.f125745t.b(m8007x6a486239)) {
                    }
                    view = m8007x6a486239;
                } else {
                    if (this.f125745t.e(view) <= this.f125745t.e(m8007x6a486239)) {
                    }
                    view = m8007x6a486239;
                }
            }
        }
        return view;
    }

    public final android.view.View v(int i17, int i18, boolean z17) {
        int i19 = i17;
        int i27 = i18 > i19 ? 1 : -1;
        while (i19 != i18) {
            android.view.View m8007x6a486239 = m8007x6a486239(i19);
            int m8028x805c2682 = m8028x805c2682();
            int m8031xf39fff7a = m8031xf39fff7a();
            int m8037x755bd410 = m8037x755bd410() - m8029x8b7f0b01();
            int m8018x1c4fb41d = m8018x1c4fb41d() - m8026xc96f6de6();
            int m8012x7f0ab3e8 = m8012x7f0ab3e8(m8007x6a486239) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams())).leftMargin;
            int m8016xfbd72d54 = m8016xfbd72d54(m8007x6a486239) - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams())).topMargin;
            int m8015x62a22a5b = m8015x62a22a5b(m8007x6a486239) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams())).rightMargin;
            int m8010xd6b039cc = m8010xd6b039cc(m8007x6a486239) + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams())).bottomMargin;
            boolean z18 = false;
            boolean z19 = m8028x805c2682 <= m8012x7f0ab3e8 && m8037x755bd410 >= m8015x62a22a5b;
            boolean z27 = m8012x7f0ab3e8 >= m8037x755bd410 || m8015x62a22a5b >= m8028x805c2682;
            boolean z28 = m8031xf39fff7a <= m8016xfbd72d54 && m8018x1c4fb41d >= m8010xd6b039cc;
            boolean z29 = m8016xfbd72d54 >= m8018x1c4fb41d || m8010xd6b039cc >= m8031xf39fff7a;
            if (!z17 ? !(!z27 || !z29) : !(!z19 || !z28)) {
                z18 = true;
            }
            if (z18) {
                return m8007x6a486239;
            }
            i19 += i27;
        }
        return null;
    }

    public final android.view.View w(int i17, int i18, int i19) {
        int m8032xa86cd69f;
        p();
        android.view.View view = null;
        if (this.f125743r == null) {
            this.f125743r = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.k(null);
        }
        int k17 = this.f125745t.k();
        int g17 = this.f125745t.g();
        int i27 = i18 > i17 ? 1 : -1;
        android.view.View view2 = null;
        while (i17 != i18) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            if (m8007x6a486239 != null && (m8032xa86cd69f = m8032xa86cd69f(m8007x6a486239)) >= 0 && m8032xa86cd69f < i19) {
                if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = m8007x6a486239;
                    }
                } else {
                    if (this.f125745t.e(m8007x6a486239) >= k17 && this.f125745t.b(m8007x6a486239) <= g17) {
                        return m8007x6a486239;
                    }
                    if (view == null) {
                        view = m8007x6a486239;
                    }
                }
            }
            i17 += i27;
        }
        return view != null ? view : view2;
    }

    public final int x(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int i18;
        int g17;
        if (!l() && this.f125737i) {
            int k17 = i17 - this.f125745t.k();
            if (k17 <= 0) {
                return 0;
            }
            i18 = z(k17, z2Var, h3Var);
        } else {
            int g18 = this.f125745t.g() - i17;
            if (g18 <= 0) {
                return 0;
            }
            i18 = -z(-g18, z2Var, h3Var);
        }
        int i19 = i17 + i18;
        if (!z17 || (g17 = this.f125745t.g() - i19) <= 0) {
            return i18;
        }
        this.f125745t.p(g17);
        return g17 + i18;
    }

    public final int y(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int i18;
        int k17;
        if (l() || !this.f125737i) {
            int k18 = i17 - this.f125745t.k();
            if (k18 <= 0) {
                return 0;
            }
            i18 = -z(k18, z2Var, h3Var);
        } else {
            int g17 = this.f125745t.g() - i17;
            if (g17 <= 0) {
                return 0;
            }
            i18 = z(-g17, z2Var, h3Var);
        }
        int i19 = i17 + i18;
        if (!z17 || (k17 = i19 - this.f125745t.k()) <= 0) {
            return i18;
        }
        this.f125745t.p(-k17);
        return i18 - k17;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(int r19, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r20, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.z(int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):int");
    }

    public C1626x16b77f31(android.content.Context context, int i17, int i18) {
        this.f125736h = -1;
        this.f125739n = new java.util.ArrayList();
        this.f125740o = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f(this);
        this.f125744s = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i(this, null);
        this.f125748w = -1;
        this.f125749x = Integer.MIN_VALUE;
        this.f125750y = Integer.MIN_VALUE;
        this.f125751z = Integer.MIN_VALUE;
        this.A = new android.util.SparseArray();
        this.D = -1;
        this.E = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d();
        E(i17);
        F(i18);
        D(4);
        this.B = context;
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState> f5327x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.l();

        /* renamed from: d, reason: collision with root package name */
        public int f125761d;

        /* renamed from: e, reason: collision with root package name */
        public int f125762e;

        public SavedState(android.os.Parcel parcel, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.h hVar) {
            this.f125761d = parcel.readInt();
            this.f125762e = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m17251x9616526c() {
            return "SavedState{mAnchorPosition=" + this.f125761d + ", mAnchorOffset=" + this.f125762e + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f125761d);
            parcel.writeInt(this.f125762e);
        }

        public SavedState(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.SavedState savedState, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.h hVar) {
            this.f125761d = savedState.f125761d;
            this.f125762e = savedState.f125762e;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo8065x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        super.mo8065x9643e45a(c1163xf1deaba4, i17, i18);
        G(i17);
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams implements com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1626x16b77f31.LayoutParams> f5326x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.j();

        /* renamed from: h, reason: collision with root package name */
        public final float f125752h;

        /* renamed from: i, reason: collision with root package name */
        public final float f125753i;

        /* renamed from: m, reason: collision with root package name */
        public final int f125754m;

        /* renamed from: n, reason: collision with root package name */
        public final float f125755n;

        /* renamed from: o, reason: collision with root package name */
        public int f125756o;

        /* renamed from: p, reason: collision with root package name */
        public int f125757p;

        /* renamed from: q, reason: collision with root package name */
        public final int f125758q;

        /* renamed from: r, reason: collision with root package name */
        public final int f125759r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f125760s;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f125752h = 0.0f;
            this.f125753i = 1.0f;
            this.f125754m = -1;
            this.f125755n = -1.0f;
            this.f125758q = 16777215;
            this.f125759r = 16777215;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public void A1(int i17) {
            this.f125756o = i17;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public float M0() {
            return this.f125755n;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        public boolean V0() {
            return this.f125760s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getAlignSelf */
        public int mo17202x68c1413b() {
            return this.f125754m;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getFlexGrow */
        public float mo17203xe3c99922() {
            return this.f125752h;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getFlexShrink */
        public float mo17204x2bb64b58() {
            return this.f125753i;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getHeight */
        public int mo17205x1c4fb41d() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginBottom */
        public int mo17206x4fb623ef() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginLeft */
        public int mo17207x63bacacb() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginRight */
        public int mo17208x13f4efd8() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMarginTop */
        public int mo17209xc1272e11() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMaxHeight */
        public int mo17210xc96bf8f5() {
            return this.f125759r;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMaxWidth */
        public int mo17211x93b79438() {
            return this.f125758q;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMinHeight */
        public int mo17212xf7770f63() {
            return this.f125757p;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getMinWidth */
        public int mo17213x29d8f80a() {
            return this.f125756o;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getOrder */
        public int mo17214x74ef2d98() {
            return 1;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: getWidth */
        public int mo17215x755bd410() {
            return ((android.view.ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc
        /* renamed from: setMinHeight */
        public void mo17216x53cacfd7(int i17) {
            this.f125757p = i17;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeFloat(this.f125752h);
            parcel.writeFloat(this.f125753i);
            parcel.writeInt(this.f125754m);
            parcel.writeFloat(this.f125755n);
            parcel.writeInt(this.f125756o);
            parcel.writeInt(this.f125757p);
            parcel.writeInt(this.f125758q);
            parcel.writeInt(this.f125759r);
            parcel.writeByte(this.f125760s ? (byte) 1 : (byte) 0);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((android.view.ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f125752h = 0.0f;
            this.f125753i = 1.0f;
            this.f125754m = -1;
            this.f125755n = -1.0f;
            this.f125758q = 16777215;
            this.f125759r = 16777215;
        }

        public LayoutParams(android.os.Parcel parcel) {
            super(-2, -2);
            this.f125752h = 0.0f;
            this.f125753i = 1.0f;
            this.f125754m = -1;
            this.f125755n = -1.0f;
            this.f125758q = 16777215;
            this.f125759r = 16777215;
            this.f125752h = parcel.readFloat();
            this.f125753i = parcel.readFloat();
            this.f125754m = parcel.readInt();
            this.f125755n = parcel.readFloat();
            this.f125756o = parcel.readInt();
            this.f125757p = parcel.readInt();
            this.f125758q = parcel.readInt();
            this.f125759r = parcel.readInt();
            this.f125760s = parcel.readByte() != 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((android.view.ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public C1626x16b77f31(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f125736h = -1;
        this.f125739n = new java.util.ArrayList();
        this.f125740o = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f(this);
        this.f125744s = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.i(this, null);
        this.f125748w = -1;
        this.f125749x = Integer.MIN_VALUE;
        this.f125750y = Integer.MIN_VALUE;
        this.f125751z = Integer.MIN_VALUE;
        this.A = new android.util.SparseArray();
        this.D = -1;
        this.E = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.t2 m7983xb70e4529 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7983xb70e4529(context, attributeSet, i17, i18);
        int i19 = m7983xb70e4529.f93760a;
        if (i19 != 0) {
            if (i19 == 1) {
                if (m7983xb70e4529.f93762c) {
                    E(3);
                } else {
                    E(2);
                }
            }
        } else if (m7983xb70e4529.f93762c) {
            E(1);
        } else {
            E(0);
        }
        F(1);
        D(4);
        this.B = context;
    }
}
