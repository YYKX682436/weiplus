package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* renamed from: androidx.recyclerview.widget.LinearLayoutManager */
/* loaded from: classes15.dex */
public class C1162x665295de extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager implements p012xc85e97e9.p103xe821e364.p104xd1075a44.f1, p012xc85e97e9.p103xe821e364.p104xd1075a44.f3 {

    /* renamed from: d, reason: collision with root package name */
    public int f93400d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 f93401e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93402f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93403g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93404h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93405i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93406m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f93407n;

    /* renamed from: o, reason: collision with root package name */
    public int f93408o;

    /* renamed from: p, reason: collision with root package name */
    public int f93409p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93410q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState f93411r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k1 f93412s;

    /* renamed from: t, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.l1 f93413t;

    /* renamed from: u, reason: collision with root package name */
    public int f93414u;

    public C1162x665295de(android.content.Context context) {
        this(context, 1, false);
    }

    public android.view.View A(int i17, int i18, boolean z17, boolean z18) {
        r();
        int i19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        int i27 = z17 ? 24579 : 320;
        if (!z18) {
            i19 = 0;
        }
        return this.f93400d == 0 ? this.f3595xc73d417b.a(i17, i18, i27, i19) : this.f3605x5b593d8d.a(i17, i18, i27, i19);
    }

    public android.view.View B(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17, int i18, int i19) {
        r();
        int k17 = this.f93402f.k();
        int g17 = this.f93402f.g();
        int i27 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        android.view.View view2 = null;
        while (i17 != i18) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            int m8032xa86cd69f = m8032xa86cd69f(m8007x6a486239);
            if (m8032xa86cd69f >= 0 && m8032xa86cd69f < i19) {
                if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) m8007x6a486239.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = m8007x6a486239;
                    }
                } else {
                    if (this.f93402f.e(m8007x6a486239) < g17 && this.f93402f.b(m8007x6a486239) >= k17) {
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

    public final int C(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int g17;
        int g18 = this.f93402f.g() - i17;
        if (g18 <= 0) {
            return 0;
        }
        int i18 = -O(-g18, z2Var, h3Var);
        int i19 = i17 + i18;
        if (!z17 || (g17 = this.f93402f.g() - i19) <= 0) {
            return i18;
        }
        this.f93402f.p(g17);
        return g17 + i18;
    }

    public final int D(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int k17;
        int k18 = i17 - this.f93402f.k();
        if (k18 <= 0) {
            return 0;
        }
        int i18 = -O(k18, z2Var, h3Var);
        int i19 = i17 + i18;
        if (!z17 || (k17 = i19 - this.f93402f.k()) <= 0) {
            return i18;
        }
        this.f93402f.p(-k17);
        return i18 - k17;
    }

    public final android.view.View E() {
        return m8007x6a486239(this.f93405i ? 0 : m8008x3d79f549() - 1);
    }

    public final android.view.View F() {
        return m8007x6a486239(this.f93405i ? m8008x3d79f549() - 1 : 0);
    }

    public int G(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (h3Var.f93592a != -1) {
            return this.f93402f.l();
        }
        return 0;
    }

    public int H() {
        return this.f93400d;
    }

    public boolean I() {
        return m8022x6fcfed3f() == 1;
    }

    public void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.l1 l1Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        int d17;
        android.view.View b17 = m1Var.b(z2Var);
        if (b17 == null) {
            l1Var.f93654b = true;
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) b17.getLayoutParams();
        if (m1Var.f93670j == null) {
            if (this.f93405i == (m1Var.f93666f == -1)) {
                mo7989xbb8aeee6(b17);
            } else {
                m7990xbb8aeee6(b17, 0);
            }
        } else {
            if (this.f93405i == (m1Var.f93666f == -1)) {
                mo7987x9bd66365(b17);
            } else {
                m7988x9bd66365(b17, 0);
            }
        }
        mo8052x6ae7e3a1(b17, 0, 0);
        l1Var.f93653a = this.f93402f.c(b17);
        if (this.f93400d == 1) {
            if (I()) {
                d17 = m8037x755bd410() - m8029x8b7f0b01();
                i27 = d17 - this.f93402f.d(b17);
            } else {
                i27 = m8028x805c2682();
                d17 = this.f93402f.d(b17) + i27;
            }
            if (m1Var.f93666f == -1) {
                int i28 = m1Var.f93662b;
                i19 = i28;
                i18 = d17;
                i17 = i28 - l1Var.f93653a;
            } else {
                int i29 = m1Var.f93662b;
                i17 = i29;
                i18 = d17;
                i19 = l1Var.f93653a + i29;
            }
        } else {
            int m8031xf39fff7a = m8031xf39fff7a();
            int d18 = this.f93402f.d(b17) + m8031xf39fff7a;
            if (m1Var.f93666f == -1) {
                int i37 = m1Var.f93662b;
                i18 = i37;
                i17 = m8031xf39fff7a;
                i19 = d18;
                i27 = i37 - l1Var.f93653a;
            } else {
                int i38 = m1Var.f93662b;
                i17 = m8031xf39fff7a;
                i18 = l1Var.f93653a + i38;
                i19 = d18;
                i27 = i38;
            }
        }
        m8050xb62e03b2(b17, i27, i17, i18, i19);
        if (layoutParams.d() || layoutParams.c()) {
            l1Var.f93655c = true;
        }
        l1Var.f93656d = b17.hasFocusable();
    }

    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k1 k1Var, int i17) {
    }

    public final void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var) {
        if (!m1Var.f93661a || m1Var.f93671k) {
            return;
        }
        if (m1Var.f93666f != -1) {
            int i17 = m1Var.f93667g;
            if (i17 < 0) {
                return;
            }
            int m8008x3d79f549 = m8008x3d79f549();
            if (!this.f93405i) {
                for (int i18 = 0; i18 < m8008x3d79f549; i18++) {
                    android.view.View m8007x6a486239 = m8007x6a486239(i18);
                    if (this.f93402f.b(m8007x6a486239) > i17 || this.f93402f.n(m8007x6a486239) > i17) {
                        M(z2Var, 0, i18);
                        return;
                    }
                }
                return;
            }
            int i19 = m8008x3d79f549 - 1;
            for (int i27 = i19; i27 >= 0; i27--) {
                android.view.View m8007x6a4862392 = m8007x6a486239(i27);
                if (this.f93402f.b(m8007x6a4862392) > i17 || this.f93402f.n(m8007x6a4862392) > i17) {
                    M(z2Var, i19, i27);
                    return;
                }
            }
            return;
        }
        int i28 = m1Var.f93667g;
        int m8008x3d79f5492 = m8008x3d79f549();
        if (i28 < 0) {
            return;
        }
        int f17 = this.f93402f.f() - i28;
        if (this.f93405i) {
            for (int i29 = 0; i29 < m8008x3d79f5492; i29++) {
                android.view.View m8007x6a4862393 = m8007x6a486239(i29);
                if (this.f93402f.e(m8007x6a4862393) < f17 || this.f93402f.o(m8007x6a4862393) < f17) {
                    M(z2Var, 0, i29);
                    return;
                }
            }
            return;
        }
        int i37 = m8008x3d79f5492 - 1;
        for (int i38 = i37; i38 >= 0; i38--) {
            android.view.View m8007x6a4862394 = m8007x6a486239(i38);
            if (this.f93402f.e(m8007x6a4862394) < f17 || this.f93402f.o(m8007x6a4862394) < f17) {
                M(z2Var, i37, i38);
                return;
            }
        }
    }

    public final void M(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        if (i18 <= i17) {
            while (i17 > i18) {
                m8080x531e7238(i17, z2Var);
                i17--;
            }
        } else {
            for (int i19 = i18 - 1; i19 >= i17; i19--) {
                m8080x531e7238(i19, z2Var);
            }
        }
    }

    public final void N() {
        if (this.f93400d == 1 || !I()) {
            this.f93405i = this.f93404h;
        } else {
            this.f93405i = !this.f93404h;
        }
    }

    public int O(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return 0;
        }
        this.f93401e.f93661a = true;
        r();
        int i18 = i17 > 0 ? 1 : -1;
        int abs = java.lang.Math.abs(i17);
        T(i18, abs, true, h3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var = this.f93401e;
        int s17 = m1Var.f93667g + s(z2Var, m1Var, h3Var, false);
        if (s17 < 0) {
            return 0;
        }
        if (abs > s17) {
            i17 = i18 * s17;
        }
        this.f93402f.p(-i17);
        this.f93401e.f93669i = i17;
        return i17;
    }

    public void P(int i17, int i18) {
        this.f93408o = i17;
        this.f93409p = i18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState savedState = this.f93411r;
        if (savedState != null) {
            savedState.f93415d = -1;
        }
        m8087x46ac7299();
    }

    public void Q(int i17) {
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i17);
        }
        mo7925x48ffb02c(null);
        if (i17 != this.f93400d || this.f93402f == null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.w1.a(this, i17);
            this.f93402f = a17;
            this.f93412s.f93641a = a17;
            this.f93400d = i17;
            m8087x46ac7299();
        }
    }

    public void R(boolean z17) {
        mo7925x48ffb02c(null);
        if (z17 == this.f93404h) {
            return;
        }
        this.f93404h = z17;
        m8087x46ac7299();
    }

    public void S(boolean z17) {
        mo7925x48ffb02c(null);
        if (this.f93406m == z17) {
            return;
        }
        this.f93406m = z17;
        m8087x46ac7299();
    }

    public final void T(int i17, int i18, boolean z17, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int k17;
        this.f93401e.f93671k = this.f93402f.i() == 0 && this.f93402f.f() == 0;
        this.f93401e.f93668h = G(h3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var = this.f93401e;
        m1Var.f93666f = i17;
        if (i17 == 1) {
            m1Var.f93668h += this.f93402f.h();
            android.view.View E = E();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var2 = this.f93401e;
            m1Var2.f93665e = this.f93405i ? -1 : 1;
            int m8032xa86cd69f = m8032xa86cd69f(E);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var3 = this.f93401e;
            m1Var2.f93664d = m8032xa86cd69f + m1Var3.f93665e;
            m1Var3.f93662b = this.f93402f.b(E);
            k17 = this.f93402f.b(E) - this.f93402f.g();
        } else {
            android.view.View F = F();
            this.f93401e.f93668h += this.f93402f.k();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var4 = this.f93401e;
            m1Var4.f93665e = this.f93405i ? 1 : -1;
            int m8032xa86cd69f2 = m8032xa86cd69f(F);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var5 = this.f93401e;
            m1Var4.f93664d = m8032xa86cd69f2 + m1Var5.f93665e;
            m1Var5.f93662b = this.f93402f.e(F);
            k17 = (-this.f93402f.e(F)) + this.f93402f.k();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var6 = this.f93401e;
        m1Var6.f93663c = i18;
        if (z17) {
            m1Var6.f93663c = i18 - k17;
        }
        m1Var6.f93667g = k17;
    }

    public final void U(int i17, int i18) {
        this.f93401e.f93663c = this.f93402f.g() - i18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var = this.f93401e;
        m1Var.f93665e = this.f93405i ? -1 : 1;
        m1Var.f93664d = i17;
        m1Var.f93666f = 1;
        m1Var.f93662b = i18;
        m1Var.f93667g = Integer.MIN_VALUE;
    }

    public final void V(int i17, int i18) {
        this.f93401e.f93663c = i18 - this.f93402f.k();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var = this.f93401e;
        m1Var.f93664d = i17;
        m1Var.f93665e = this.f93405i ? 1 : -1;
        m1Var.f93666f = -1;
        m1Var.f93662b = i18;
        m1Var.f93667g = Integer.MIN_VALUE;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f3
    public android.graphics.PointF a(int i17) {
        if (m8008x3d79f549() == 0) {
            return null;
        }
        int i18 = (i17 < m8032xa86cd69f(m8007x6a486239(0))) != this.f93405i ? -1 : 1;
        return this.f93400d == 0 ? new android.graphics.PointF(i18, 0.0f) : new android.graphics.PointF(0.0f, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: assertNotInLayoutOrScroll */
    public void mo7925x48ffb02c(java.lang.String str) {
        if (this.f93411r == null) {
            super.mo7925x48ffb02c(str);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return this.f93400d == 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return this.f93400d == 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: collectAdjacentPrefetchPositions */
    public void mo7927x3a789507(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        if (this.f93400d != 0) {
            i17 = i18;
        }
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return;
        }
        r();
        T(i17 > 0 ? 1 : -1, java.lang.Math.abs(i17), true, h3Var);
        m(h3Var, this.f93401e, s2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: collectInitialPrefetchPositions */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7928x7cba7099(int r7, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f93411r
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f93415d
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f93417f
            goto L22
        L13:
            r6.N()
            boolean r0 = r6.f93405i
            int r4 = r6.f93408o
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.f93414u
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.p0 r2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.p0) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.mo7928x7cba7099(int, androidx.recyclerview.widget.s2):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollExtent */
    public int mo7929x8e0c6fb2(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return n(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollOffset */
    public int mo7930x9e19151b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollRange */
    public int mo7931x57d657b5(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return p(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollExtent */
    public int mo7932xa00e39c4(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return n(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollOffset */
    public int mo7933xb01adf2d(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollRange */
    public int mo7934xd44a0363(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return p(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: findViewByPosition */
    public android.view.View mo7935xa188593e(int i17) {
        int m8008x3d79f549 = m8008x3d79f549();
        if (m8008x3d79f549 == 0) {
            return null;
        }
        int m8032xa86cd69f = i17 - m8032xa86cd69f(m8007x6a486239(0));
        if (m8032xa86cd69f >= 0 && m8032xa86cd69f < m8008x3d79f549) {
            android.view.View m8007x6a486239 = m8007x6a486239(m8032xa86cd69f);
            if (m8032xa86cd69f(m8007x6a486239) == i17) {
                return m8007x6a486239;
            }
        }
        return super.mo7935xa188593e(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: isAutoMeasureEnabled */
    public boolean mo7936xd96f765c() {
        return true;
    }

    public void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        int i17 = m1Var.f93664d;
        if (i17 < 0 || i17 >= h3Var.b()) {
            return;
        }
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p0) s2Var).a(i17, java.lang.Math.max(0, m1Var.f93667g));
    }

    public final int n(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        r();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93402f;
        boolean z17 = this.f93407n;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.a(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f93407n);
    }

    public final int o(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        r();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93402f;
        boolean z17 = this.f93407n;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.b(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f93407n, this.f93405i);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        if (this.f93410q) {
            m8077x28b7b1cd(z2Var);
            z2Var.c();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onFocusSearchFailed */
    public android.view.View mo7914x990cf8de(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int q17;
        N();
        if (m8008x3d79f549() == 0 || (q17 = q(i17)) == Integer.MIN_VALUE) {
            return null;
        }
        r();
        r();
        T(q17, (int) (this.f93402f.l() * 0.33333334f), false, h3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var = this.f93401e;
        m1Var.f93667g = Integer.MIN_VALUE;
        m1Var.f93661a = false;
        s(z2Var, m1Var, h3Var, true);
        android.view.View z17 = q17 == -1 ? this.f93405i ? z(m8008x3d79f549() - 1, -1) : z(0, m8008x3d79f549()) : this.f93405i ? z(0, m8008x3d79f549()) : z(m8008x3d79f549() - 1, -1);
        android.view.View F = q17 == -1 ? F() : E();
        if (!F.hasFocusable()) {
            return z17;
        }
        if (z17 == null) {
            return null;
        }
        return F;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7938x9d5dd31b(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7938x9d5dd31b(accessibilityEvent);
        if (m8008x3d79f549() > 0) {
            accessibilityEvent.setFromIndex(w());
            accessibilityEvent.setToIndex(y());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0267  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r19, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r20) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.mo2418x457c9b08(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        this.f93411r = null;
        this.f93408o = -1;
        this.f93409p = Integer.MIN_VALUE;
        this.f93412s.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onRestoreInstanceState */
    public void mo7939xb949e58d(android.os.Parcelable parcelable) {
        if (parcelable instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState) {
            this.f93411r = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState) parcelable;
            m8087x46ac7299();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onSaveInstanceState */
    public android.os.Parcelable mo7940xa71a2260() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState savedState = this.f93411r;
        if (savedState != null) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState(savedState);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState savedState2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState();
        if (m8008x3d79f549() > 0) {
            r();
            boolean z17 = this.f93403g ^ this.f93405i;
            savedState2.f93417f = z17;
            if (z17) {
                android.view.View E = E();
                savedState2.f93416e = this.f93402f.g() - this.f93402f.b(E);
                savedState2.f93415d = m8032xa86cd69f(E);
            } else {
                android.view.View F = F();
                savedState2.f93415d = m8032xa86cd69f(F);
                savedState2.f93416e = this.f93402f.e(F) - this.f93402f.k();
            }
        } else {
            savedState2.f93415d = -1;
        }
        return savedState2;
    }

    public final int p(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        r();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93402f;
        boolean z17 = this.f93407n;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.c(h3Var, w1Var, v(!z17, true), u(!z17, true), this, this.f93407n);
    }

    public int q(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 17 ? i17 != 33 ? i17 != 66 ? (i17 == 130 && this.f93400d == 1) ? 1 : Integer.MIN_VALUE : this.f93400d == 0 ? 1 : Integer.MIN_VALUE : this.f93400d == 1 ? -1 : Integer.MIN_VALUE : this.f93400d == 0 ? -1 : Integer.MIN_VALUE : (this.f93400d != 1 && I()) ? -1 : 1 : (this.f93400d != 1 && I()) ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        if (this.f93401e == null) {
            this.f93401e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m1();
        }
    }

    public int s(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int i17 = m1Var.f93663c;
        int i18 = m1Var.f93667g;
        if (i18 != Integer.MIN_VALUE) {
            if (i17 < 0) {
                m1Var.f93667g = i18 + i17;
            }
            L(z2Var, m1Var);
        }
        int i19 = m1Var.f93663c + m1Var.f93668h;
        while (true) {
            if (!m1Var.f93671k && i19 <= 0) {
                break;
            }
            int i27 = m1Var.f93664d;
            if (!(i27 >= 0 && i27 < h3Var.b())) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.l1 l1Var = this.f93413t;
            l1Var.f93653a = 0;
            l1Var.f93654b = false;
            l1Var.f93655c = false;
            l1Var.f93656d = false;
            J(z2Var, h3Var, m1Var, l1Var);
            if (!l1Var.f93654b) {
                int i28 = m1Var.f93662b;
                int i29 = l1Var.f93653a;
                m1Var.f93662b = i28 + (m1Var.f93666f * i29);
                if (!l1Var.f93655c || this.f93401e.f93670j != null || !h3Var.f93598g) {
                    m1Var.f93663c -= i29;
                    i19 -= i29;
                }
                int i37 = m1Var.f93667g;
                if (i37 != Integer.MIN_VALUE) {
                    int i38 = i37 + i29;
                    m1Var.f93667g = i38;
                    int i39 = m1Var.f93663c;
                    if (i39 < 0) {
                        m1Var.f93667g = i38 + i39;
                    }
                    L(z2Var, m1Var);
                }
                if (z17 && l1Var.f93656d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i17 - m1Var.f93663c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93400d == 1) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        this.f93408o = i17;
        this.f93409p = Integer.MIN_VALUE;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState savedState = this.f93411r;
        if (savedState != null) {
            savedState.f93415d = -1;
        }
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93400d == 0) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: shouldMeasureTwice */
    public boolean mo7941x59acdfbd() {
        return (m8019x47130b60() == 1073741824 || m8038xfc57f9d3() == 1073741824 || !m8039x4ba86600()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 o1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.o1(c1163xf1deaba4.getContext());
        o1Var.f93582a = i17;
        m8099x6305639d(o1Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        return this.f93411r == null && this.f93403g == this.f93406m;
    }

    public int t() {
        android.view.View A = A(0, m8008x3d79f549(), true, false);
        if (A == null) {
            return -1;
        }
        return m8032xa86cd69f(A);
    }

    public final android.view.View u(boolean z17, boolean z18) {
        return this.f93405i ? A(0, m8008x3d79f549(), z17, z18) : A(m8008x3d79f549() - 1, -1, z17, z18);
    }

    public final android.view.View v(boolean z17, boolean z18) {
        return this.f93405i ? A(m8008x3d79f549() - 1, -1, z17, z18) : A(0, m8008x3d79f549(), z17, z18);
    }

    public int w() {
        android.view.View A = A(0, m8008x3d79f549(), false, true);
        if (A == null) {
            return -1;
        }
        return m8032xa86cd69f(A);
    }

    public int x() {
        android.view.View A = A(m8008x3d79f549() - 1, -1, true, false);
        if (A == null) {
            return -1;
        }
        return m8032xa86cd69f(A);
    }

    public int y() {
        android.view.View A = A(m8008x3d79f549() - 1, -1, false, true);
        if (A == null) {
            return -1;
        }
        return m8032xa86cd69f(A);
    }

    public android.view.View z(int i17, int i18) {
        int i19;
        int i27;
        r();
        if ((i18 > i17 ? (char) 1 : i18 < i17 ? (char) 65535 : (char) 0) == 0) {
            return m8007x6a486239(i17);
        }
        if (this.f93402f.e(m8007x6a486239(i17)) < this.f93402f.k()) {
            i19 = 16644;
            i27 = 16388;
        } else {
            i19 = 4161;
            i27 = 4097;
        }
        return this.f93400d == 0 ? this.f3595xc73d417b.a(i17, i18, i19, i27) : this.f3605x5b593d8d.a(i17, i18, i19, i27);
    }

    public C1162x665295de(android.content.Context context, int i17, boolean z17) {
        this.f93400d = 1;
        this.f93404h = false;
        this.f93405i = false;
        this.f93406m = false;
        this.f93407n = true;
        this.f93408o = -1;
        this.f93409p = Integer.MIN_VALUE;
        this.f93411r = null;
        this.f93412s = new p012xc85e97e9.p103xe821e364.p104xd1075a44.k1();
        this.f93413t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.l1();
        this.f93414u = 2;
        Q(i17);
        R(z17);
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState> f3590x681a0c0c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.n1();

        /* renamed from: d, reason: collision with root package name */
        public int f93415d;

        /* renamed from: e, reason: collision with root package name */
        public int f93416e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93417f;

        public SavedState(android.os.Parcel parcel) {
            this.f93415d = parcel.readInt();
            this.f93416e = parcel.readInt();
            this.f93417f = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f93415d);
            parcel.writeInt(this.f93416e);
            parcel.writeInt(this.f93417f ? 1 : 0);
        }

        public SavedState(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de.SavedState savedState) {
            this.f93415d = savedState.f93415d;
            this.f93416e = savedState.f93416e;
            this.f93417f = savedState.f93417f;
        }
    }

    public C1162x665295de(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f93400d = 1;
        this.f93404h = false;
        this.f93405i = false;
        this.f93406m = false;
        this.f93407n = true;
        this.f93408o = -1;
        this.f93409p = Integer.MIN_VALUE;
        this.f93411r = null;
        this.f93412s = new p012xc85e97e9.p103xe821e364.p104xd1075a44.k1();
        this.f93413t = new p012xc85e97e9.p103xe821e364.p104xd1075a44.l1();
        this.f93414u = 2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.t2 m7983xb70e4529 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7983xb70e4529(context, attributeSet, i17, i18);
        Q(m7983xb70e4529.f93760a);
        R(m7983xb70e4529.f93762c);
        S(m7983xb70e4529.f93763d);
    }
}
