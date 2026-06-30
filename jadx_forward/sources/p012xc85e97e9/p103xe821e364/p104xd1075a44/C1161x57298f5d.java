package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* renamed from: androidx.recyclerview.widget.GridLayoutManager */
/* loaded from: classes15.dex */
public class C1161x57298f5d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {
    public final android.util.SparseIntArray A;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 B;
    public final android.graphics.Rect C;

    /* renamed from: v, reason: collision with root package name */
    public boolean f93393v;

    /* renamed from: w, reason: collision with root package name */
    public int f93394w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f93395x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View[] f93396y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.SparseIntArray f93397z;

    public C1161x57298f5d(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f93393v = false;
        this.f93394w = -1;
        this.f93397z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new p012xc85e97e9.p103xe821e364.p104xd1075a44.s0();
        this.C = new android.graphics.Rect();
        c0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7983xb70e4529(context, attributeSet, i17, i18).f93761b);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
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
            if (m8032xa86cd69f >= 0 && m8032xa86cd69f < i19 && Z(z2Var, h3Var, m8032xa86cd69f) == 0) {
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

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.l1 l1Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        int i49;
        int i57;
        int i58;
        int i59;
        int m7980xa05842f3;
        int i66;
        android.view.View b17;
        int j17 = this.f93402f.j();
        boolean z17 = j17 != 1073741824;
        int i67 = m8008x3d79f549() > 0 ? this.f93395x[this.f93394w] : 0;
        if (z17) {
            d0();
        }
        boolean z18 = m1Var.f93665e == 1;
        int i68 = this.f93394w;
        if (!z18) {
            i68 = Z(z2Var, h3Var, m1Var.f93664d) + a0(z2Var, h3Var, m1Var.f93664d);
        }
        int i69 = 0;
        while (i69 < this.f93394w) {
            int i76 = m1Var.f93664d;
            if (!(i76 >= 0 && i76 < h3Var.b()) || i68 <= 0) {
                break;
            }
            int i77 = m1Var.f93664d;
            int a07 = a0(z2Var, h3Var, i77);
            if (a07 > this.f93394w) {
                throw new java.lang.IllegalArgumentException("Item at position " + i77 + " requires " + a07 + " spans but GridLayoutManager has only " + this.f93394w + " spans.");
            }
            i68 -= a07;
            if (i68 < 0 || (b17 = m1Var.b(z2Var)) == null) {
                break;
            }
            this.f93396y[i69] = b17;
            i69++;
        }
        if (i69 == 0) {
            l1Var.f93654b = true;
            return;
        }
        if (z18) {
            i17 = 0;
            i18 = 0;
            i27 = 1;
            i19 = i69;
        } else {
            i17 = i69 - 1;
            i18 = 0;
            i19 = -1;
            i27 = -1;
        }
        while (i17 != i19) {
            android.view.View view = this.f93396y[i17];
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view.getLayoutParams();
            int a08 = a0(z2Var, h3Var, m8032xa86cd69f(view));
            layoutParams.f93399i = a08;
            layoutParams.f93398h = i18;
            i18 += a08;
            i17 += i27;
        }
        float f17 = 0.0f;
        int i78 = 0;
        for (int i79 = 0; i79 < i69; i79++) {
            android.view.View view2 = this.f93396y[i79];
            if (m1Var.f93670j == null) {
                if (z18) {
                    mo7989xbb8aeee6(view2);
                } else {
                    m7990xbb8aeee6(view2, 0);
                }
            } else if (z18) {
                mo7987x9bd66365(view2);
            } else {
                m7988x9bd66365(view2, 0);
            }
            m7995x142d145d(view2, this.C);
            b0(view2, j17, false);
            int c17 = this.f93402f.c(view2);
            if (c17 > i78) {
                i78 = c17;
            }
            float d17 = (this.f93402f.d(view2) * 1.0f) / ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view2.getLayoutParams()).f93399i;
            if (d17 > f17) {
                f17 = d17;
            }
        }
        if (z17) {
            W(java.lang.Math.max(java.lang.Math.round(f17 * this.f93394w), i67));
            i78 = 0;
            for (int i86 = 0; i86 < i69; i86++) {
                android.view.View view3 = this.f93396y[i86];
                b0(view3, 1073741824, true);
                int c18 = this.f93402f.c(view3);
                if (c18 > i78) {
                    i78 = c18;
                }
            }
        }
        for (int i87 = 0; i87 < i69; i87++) {
            android.view.View view4 = this.f93396y[i87];
            if (this.f93402f.c(view4) != i78) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view4.getLayoutParams();
                android.graphics.Rect rect = layoutParams2.f93449e;
                int i88 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i89 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int X = X(layoutParams2.f93398h, layoutParams2.f93399i);
                if (this.f93400d == 1) {
                    i66 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(X, 1073741824, i89, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    m7980xa05842f3 = android.view.View.MeasureSpec.makeMeasureSpec(i78 - i88, 1073741824);
                } else {
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i78 - i89, 1073741824);
                    m7980xa05842f3 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(X, 1073741824, i88, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    i66 = makeMeasureSpec;
                }
                if (m8098x5baf24c4(view4, i66, m7980xa05842f3, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i66, m7980xa05842f3);
                }
            }
        }
        l1Var.f93653a = i78;
        if (this.f93400d == 1) {
            if (m1Var.f93666f == -1) {
                i47 = m1Var.f93662b;
                i59 = i47 - i78;
            } else {
                i59 = m1Var.f93662b;
                i47 = i59 + i78;
            }
            i38 = i59;
            i39 = 0;
            i37 = 0;
        } else {
            if (m1Var.f93666f == -1) {
                i29 = m1Var.f93662b;
                i28 = i29 - i78;
            } else {
                i28 = m1Var.f93662b;
                i29 = i28 + i78;
            }
            i37 = i28;
            i38 = 0;
            i39 = i29;
            i47 = 0;
        }
        int i96 = 0;
        while (i96 < i69) {
            android.view.View view5 = this.f93396y[i96];
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view5.getLayoutParams();
            if (this.f93400d != 1) {
                i38 = this.f93395x[layoutParams3.f93398h] + m8031xf39fff7a();
                i47 = this.f93402f.d(view5) + i38;
            } else if (I()) {
                i39 = m8028x805c2682() + this.f93395x[this.f93394w - layoutParams3.f93398h];
                i37 = i39 - this.f93402f.d(view5);
            } else {
                int m8028x805c2682 = m8028x805c2682() + this.f93395x[layoutParams3.f93398h];
                i58 = i47;
                i48 = m8028x805c2682;
                i49 = i38;
                i57 = this.f93402f.d(view5) + m8028x805c2682;
                m8050xb62e03b2(view5, i48, i49, i57, i58);
                if (!layoutParams3.d() || layoutParams3.c()) {
                    l1Var.f93655c = true;
                }
                l1Var.f93656d |= view5.hasFocusable();
                i96++;
                i47 = i58;
                i39 = i57;
                i38 = i49;
                i37 = i48;
            }
            i58 = i47;
            i57 = i39;
            i49 = i38;
            i48 = i37;
            m8050xb62e03b2(view5, i48, i49, i57, i58);
            if (!layoutParams3.d()) {
            }
            l1Var.f93655c = true;
            l1Var.f93656d |= view5.hasFocusable();
            i96++;
            i47 = i58;
            i39 = i57;
            i38 = i49;
            i37 = i48;
        }
        java.util.Arrays.fill(this.f93396y, (java.lang.Object) null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k1 k1Var, int i17) {
        d0();
        if (h3Var.b() > 0 && !h3Var.f93598g) {
            boolean z17 = i17 == 1;
            int Z = Z(z2Var, h3Var, k1Var.f93642b);
            if (z17) {
                while (Z > 0) {
                    int i18 = k1Var.f93642b;
                    if (i18 <= 0) {
                        break;
                    }
                    int i19 = i18 - 1;
                    k1Var.f93642b = i19;
                    Z = Z(z2Var, h3Var, i19);
                }
            } else {
                int b17 = h3Var.b() - 1;
                int i27 = k1Var.f93642b;
                while (i27 < b17) {
                    int i28 = i27 + 1;
                    int Z2 = Z(z2Var, h3Var, i28);
                    if (Z2 <= Z) {
                        break;
                    }
                    i27 = i28;
                    Z = Z2;
                }
                k1Var.f93642b = i27;
            }
        }
        android.view.View[] viewArr = this.f93396y;
        if (viewArr == null || viewArr.length != this.f93394w) {
            this.f93396y = new android.view.View[this.f93394w];
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void S(boolean z17) {
        if (z17) {
            throw new java.lang.UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.S(false);
    }

    public final void W(int i17) {
        int i18;
        int[] iArr = this.f93395x;
        int i19 = this.f93394w;
        if (iArr == null || iArr.length != i19 + 1 || iArr[iArr.length - 1] != i17) {
            iArr = new int[i19 + 1];
        }
        int i27 = 0;
        iArr[0] = 0;
        int i28 = i17 / i19;
        int i29 = i17 % i19;
        int i37 = 0;
        for (int i38 = 1; i38 <= i19; i38++) {
            i27 += i29;
            if (i27 <= 0 || i19 - i27 >= i29) {
                i18 = i28;
            } else {
                i18 = i28 + 1;
                i27 -= i19;
            }
            i37 += i18;
            iArr[i38] = i37;
        }
        this.f93395x = iArr;
    }

    public int X(int i17, int i18) {
        if (this.f93400d != 1 || !I()) {
            int[] iArr = this.f93395x;
            return iArr[i18 + i17] - iArr[i17];
        }
        int[] iArr2 = this.f93395x;
        int i19 = this.f93394w;
        return iArr2[i19 - i17] - iArr2[(i19 - i17) - i18];
    }

    public final int Y(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (!h3Var.f93598g) {
            return this.B.a(i17, this.f93394w);
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 0;
        }
        return this.B.a(d17, this.f93394w);
    }

    public final int Z(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (!h3Var.f93598g) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 t0Var = this.B;
            int i18 = this.f93394w;
            if (!t0Var.f93758b) {
                return t0Var.b(i17, i18);
            }
            android.util.SparseIntArray sparseIntArray = t0Var.f93757a;
            int i19 = sparseIntArray.get(i17, -1);
            if (i19 != -1) {
                return i19;
            }
            int b17 = t0Var.b(i17, i18);
            sparseIntArray.put(i17, b17);
            return b17;
        }
        int i27 = this.A.get(i17, -1);
        if (i27 != -1) {
            return i27;
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 t0Var2 = this.B;
        int i28 = this.f93394w;
        if (!t0Var2.f93758b) {
            return t0Var2.b(d17, i28);
        }
        android.util.SparseIntArray sparseIntArray2 = t0Var2.f93757a;
        int i29 = sparseIntArray2.get(d17, -1);
        if (i29 != -1) {
            return i29;
        }
        int b18 = t0Var2.b(d17, i28);
        sparseIntArray2.put(d17, b18);
        return b18;
    }

    public final int a0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (!h3Var.f93598g) {
            return this.B.c(i17);
        }
        int i18 = this.f93397z.get(i17, -1);
        if (i18 != -1) {
            return i18;
        }
        int d17 = z2Var.d(i17);
        if (d17 == -1) {
            return 1;
        }
        return this.B.c(d17);
    }

    public final void b0(android.view.View view, int i17, boolean z17) {
        int i18;
        int i19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) view.getLayoutParams();
        android.graphics.Rect rect = layoutParams.f93449e;
        int i27 = rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i28 = rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int X = X(layoutParams.f93398h, layoutParams.f93399i);
        if (this.f93400d == 1) {
            i19 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(X, i17, i28, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i18 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(this.f93402f.l(), m8019x47130b60(), i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int m7980xa05842f3 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(X, i17, i27, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int m7980xa05842f32 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7980xa05842f3(this.f93402f.l(), m8038xfc57f9d3(), i28, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i18 = m7980xa05842f3;
            i19 = m7980xa05842f32;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) view.getLayoutParams();
        if (z17 ? m8098x5baf24c4(view, i19, i18, layoutParams2) : m8097x58b67fb1(view, i19, i18, layoutParams2)) {
            view.measure(i19, i18);
        }
    }

    public void c0(int i17) {
        if (i17 == this.f93394w) {
            return;
        }
        this.f93393v = true;
        if (i17 < 1) {
            throw new java.lang.IllegalArgumentException("Span count should be at least 1. Provided " + i17);
        }
        this.f93394w = i17;
        this.B.d();
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: checkLayoutParams */
    public boolean mo7909xc6204678(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams;
    }

    public final void d0() {
        int m8018x1c4fb41d;
        int m8031xf39fff7a;
        if (this.f93400d == 1) {
            m8018x1c4fb41d = m8037x755bd410() - m8029x8b7f0b01();
            m8031xf39fff7a = m8028x805c2682();
        } else {
            m8018x1c4fb41d = m8018x1c4fb41d() - m8026xc96f6de6();
            m8031xf39fff7a = m8031xf39fff7a();
        }
        W(m8018x1c4fb41d - m8031xf39fff7a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return this.f93400d == 0 ? new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams(-2, -1) : new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams(-1, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7910x5663b65(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams(context, attributeSet);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: getColumnCountForAccessibility */
    public int mo7912xed424b48(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93400d == 1) {
            return this.f93394w;
        }
        if (h3Var.b() < 1) {
            return 0;
        }
        return Y(z2Var, h3Var, h3Var.b() - 1) + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: getRowCountForAccessibility */
    public int mo7913x35d87df0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93400d == 0) {
            return this.f93394w;
        }
        if (h3Var.b() < 1) {
            return 0;
        }
        return Y(z2Var, h3Var, h3Var.b() - 1) + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void m(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.m1 m1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        int i17 = this.f93394w;
        for (int i18 = 0; i18 < this.f93394w; i18++) {
            int i19 = m1Var.f93664d;
            if (!(i19 >= 0 && i19 < h3Var.b()) || i17 <= 0) {
                return;
            }
            int i27 = m1Var.f93664d;
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p0) s2Var).a(i27, java.lang.Math.max(0, m1Var.f93667g));
            i17 -= this.B.c(i27);
            m1Var.f93664d += m1Var.f93665e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onFocusSearchFailed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo7914x990cf8de(android.view.View r24, int r25, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r26, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.mo7914x990cf8de(android.view.View, int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):android.view.View");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onInitializeAccessibilityNodeInfoForItem */
    public void mo7915x96481acd(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.View view, o3.l lVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams)) {
            super.m8063x96481acd(view, lVar);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams;
        int Y = Y(z2Var, h3Var, layoutParams2.b());
        if (this.f93400d == 0) {
            int i17 = layoutParams2.f93398h;
            int i18 = layoutParams2.f93399i;
            int i19 = this.f93394w;
            lVar.o(o3.k.a(i17, i18, Y, 1, i19 > 1 && i18 == i19, false));
            return;
        }
        int i27 = layoutParams2.f93398h;
        int i28 = layoutParams2.f93399i;
        int i29 = this.f93394w;
        lVar.o(o3.k.a(Y, 1, i27, i28, i29 > 1 && i28 == i29, false));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        this.B.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsChanged */
    public void mo7917xd0486653(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.B.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsMoved */
    public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        this.B.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        this.B.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo7920x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.Object obj) {
        this.B.d();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        boolean z17 = h3Var.f93598g;
        android.util.SparseIntArray sparseIntArray = this.A;
        android.util.SparseIntArray sparseIntArray2 = this.f93397z;
        if (z17) {
            int m8008x3d79f549 = m8008x3d79f549();
            for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) m8007x6a486239(i17).getLayoutParams();
                int b17 = layoutParams.b();
                sparseIntArray2.put(b17, layoutParams.f93399i);
                sparseIntArray.put(b17, layoutParams.f93398h);
            }
        }
        super.mo2418x457c9b08(z2Var, h3Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        this.f93393v = false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        d0();
        android.view.View[] viewArr = this.f93396y;
        if (viewArr == null || viewArr.length != this.f93394w) {
            this.f93396y = new android.view.View[this.f93394w];
        }
        return super.mo2419x96d40915(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        d0();
        android.view.View[] viewArr = this.f93396y;
        if (viewArr == null || viewArr.length != this.f93394w) {
            this.f93396y = new android.view.View[this.f93394w];
        }
        return super.mo7922xd8d712a7(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: setMeasuredDimension */
    public void mo7923xd88558fe(android.graphics.Rect rect, int i17, int i18) {
        int m7978x789de6b8;
        int m7978x789de6b82;
        if (this.f93395x == null) {
            super.mo7923xd88558fe(rect, i17, i18);
        }
        int m8028x805c2682 = m8028x805c2682() + m8029x8b7f0b01();
        int m8031xf39fff7a = m8031xf39fff7a() + m8026xc96f6de6();
        if (this.f93400d == 1) {
            m7978x789de6b82 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i18, rect.height() + m8031xf39fff7a, m8024x411c071f());
            int[] iArr = this.f93395x;
            m7978x789de6b8 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i17, iArr[iArr.length - 1] + m8028x805c2682, m8025xa81818ce());
        } else {
            m7978x789de6b8 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i17, rect.width() + m8028x805c2682, m8025xa81818ce());
            int[] iArr2 = this.f93395x;
            m7978x789de6b82 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i18, iArr2[iArr2.length - 1] + m8031xf39fff7a, m8024x411c071f());
        }
        mo8093xd88558fe(m7978x789de6b8, m7978x789de6b82);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: supportsPredictiveItemAnimations */
    public boolean mo7924x9f0306c5() {
        return this.f93411r == null && !this.f93393v;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7911x5663b65(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams(layoutParams);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public int f93398h;

        /* renamed from: i, reason: collision with root package name */
        public int f93399i;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f93398h = -1;
            this.f93399i = 0;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f93398h = -1;
            this.f93399i = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f93398h = -1;
            this.f93399i = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f93398h = -1;
            this.f93399i = 0;
        }
    }

    public C1161x57298f5d(android.content.Context context, int i17) {
        super(context);
        this.f93393v = false;
        this.f93394w = -1;
        this.f93397z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new p012xc85e97e9.p103xe821e364.p104xd1075a44.s0();
        this.C = new android.graphics.Rect();
        c0(i17);
    }

    public C1161x57298f5d(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i18, z17);
        this.f93393v = false;
        this.f93394w = -1;
        this.f93397z = new android.util.SparseIntArray();
        this.A = new android.util.SparseIntArray();
        this.B = new p012xc85e97e9.p103xe821e364.p104xd1075a44.s0();
        this.C = new android.graphics.Rect();
        c0(i17);
    }
}
