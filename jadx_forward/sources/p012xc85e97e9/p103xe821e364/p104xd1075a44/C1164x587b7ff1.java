package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager */
/* loaded from: classes15.dex */
public class C1164x587b7ff1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager implements p012xc85e97e9.p103xe821e364.p104xd1075a44.f3 {
    public boolean A;
    public final boolean B;
    public int[] C;
    public final java.lang.Runnable D;

    /* renamed from: d, reason: collision with root package name */
    public int f93453d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.x3[] f93454e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93455f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 f93456g;

    /* renamed from: h, reason: collision with root package name */
    public int f93457h;

    /* renamed from: i, reason: collision with root package name */
    public int f93458i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 f93459m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f93460n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93461o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.BitSet f93462p;

    /* renamed from: q, reason: collision with root package name */
    public int f93463q;

    /* renamed from: r, reason: collision with root package name */
    public int f93464r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.v3 f93465s;

    /* renamed from: t, reason: collision with root package name */
    public final int f93466t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93467u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f93468v;

    /* renamed from: w, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState f93469w;

    /* renamed from: x, reason: collision with root package name */
    public int f93470x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f93471y;

    /* renamed from: z, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.t3 f93472z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 f93473h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f93474i;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var = this.f93473h;
            if (x3Var == null) {
                return -1;
            }
            return x3Var.f93813e;
        }
    }

    public C1164x587b7ff1(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f93453d = -1;
        this.f93460n = false;
        this.f93461o = false;
        this.f93463q = -1;
        this.f93464r = Integer.MIN_VALUE;
        this.f93465s = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v3();
        this.f93466t = 2;
        this.f93471y = new android.graphics.Rect();
        this.f93472z = new p012xc85e97e9.p103xe821e364.p104xd1075a44.t3(this);
        this.A = false;
        this.B = true;
        this.D = new p012xc85e97e9.p103xe821e364.p104xd1075a44.s3(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.t2 m7983xb70e4529 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7983xb70e4529(context, attributeSet, i17, i18);
        int i19 = m7983xb70e4529.f93760a;
        if (i19 != 0 && i19 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation.");
        }
        mo7925x48ffb02c(null);
        if (i19 != this.f93457h) {
            this.f93457h = i19;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93455f;
            this.f93455f = this.f93456g;
            this.f93456g = w1Var;
            m8087x46ac7299();
        }
        Q(m7983xb70e4529.f93761b);
        boolean z17 = m7983xb70e4529.f93762c;
        mo7925x48ffb02c(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState = this.f93469w;
        if (savedState != null && savedState.f93486n != z17) {
            savedState.f93486n = z17;
        }
        this.f93460n = z17;
        m8087x46ac7299();
        this.f93459m = new p012xc85e97e9.p103xe821e364.p104xd1075a44.j1();
        this.f93455f = p012xc85e97e9.p103xe821e364.p104xd1075a44.w1.a(this, this.f93457h);
        this.f93456g = p012xc85e97e9.p103xe821e364.p104xd1075a44.w1.a(this, 1 - this.f93457h);
    }

    public final int A(int i17) {
        int i18 = this.f93454e[0].i(i17);
        for (int i19 = 1; i19 < this.f93453d; i19++) {
            int i27 = this.f93454e[i19].i(i17);
            if (i27 > i18) {
                i18 = i27;
            }
        }
        return i18;
    }

    public final int B(int i17) {
        int l17 = this.f93454e[0].l(i17);
        for (int i18 = 1; i18 < this.f93453d; i18++) {
            int l18 = this.f93454e[i18].l(i17);
            if (l18 < l17) {
                l17 = l18;
            }
        }
        return l17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f93461o
            if (r0 == 0) goto L9
            int r0 = r7.z()
            goto Ld
        L9:
            int r0 = r7.y()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            androidx.recyclerview.widget.v3 r4 = r7.f93465s
            r4.f(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.h(r8, r5)
            r4.g(r9, r5)
            goto L39
        L32:
            r4.h(r8, r9)
            goto L39
        L36:
            r4.g(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f93461o
            if (r8 == 0) goto L45
            int r8 = r7.y()
            goto L49
        L45:
            int r8 = r7.z()
        L49:
            if (r3 > r8) goto L4e
            r7.m8087x46ac7299()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.C(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        if (r11 == r12) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r11 == r12) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View D() {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.D():android.view.View");
    }

    public boolean E() {
        return m8022x6fcfed3f() == 1;
    }

    public final void F(android.view.View view, int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f93471y;
        m7995x142d145d(view, rect);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) view.getLayoutParams();
        int U = U(i17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int U2 = U(i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (z17 ? m8098x5baf24c4(view, U, U2, layoutParams) : m8097x58b67fb1(view, U, U2, layoutParams)) {
            view.measure(U, U2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:269:0x0420, code lost:
    
        if (n() != false) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r17, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.G(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3, boolean):void");
    }

    public final boolean H(int i17) {
        if (this.f93457h == 0) {
            return (i17 == -1) != this.f93461o;
        }
        return ((i17 == -1) == this.f93461o) == E();
    }

    public void I(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int y17;
        int i18;
        if (i17 > 0) {
            y17 = z();
            i18 = 1;
        } else {
            y17 = y();
            i18 = -1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var = this.f93459m;
        j1Var.f93617a = true;
        S(y17, h3Var);
        P(i18);
        j1Var.f93619c = y17 + j1Var.f93620d;
        j1Var.f93618b = java.lang.Math.abs(i17);
    }

    public final void J(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var) {
        if (!j1Var.f93617a || j1Var.f93625i) {
            return;
        }
        if (j1Var.f93618b == 0) {
            if (j1Var.f93621e == -1) {
                K(z2Var, j1Var.f93623g);
                return;
            } else {
                L(z2Var, j1Var.f93622f);
                return;
            }
        }
        int i17 = 1;
        if (j1Var.f93621e == -1) {
            int i18 = j1Var.f93622f;
            int l17 = this.f93454e[0].l(i18);
            while (i17 < this.f93453d) {
                int l18 = this.f93454e[i17].l(i18);
                if (l18 > l17) {
                    l17 = l18;
                }
                i17++;
            }
            int i19 = i18 - l17;
            K(z2Var, i19 < 0 ? j1Var.f93623g : j1Var.f93623g - java.lang.Math.min(i19, j1Var.f93618b));
            return;
        }
        int i27 = j1Var.f93623g;
        int i28 = this.f93454e[0].i(i27);
        while (i17 < this.f93453d) {
            int i29 = this.f93454e[i17].i(i27);
            if (i29 < i28) {
                i28 = i29;
            }
            i17++;
        }
        int i37 = i28 - j1Var.f93623g;
        L(z2Var, i37 < 0 ? j1Var.f93622f : java.lang.Math.min(i37, j1Var.f93618b) + j1Var.f93622f);
    }

    public final void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17) {
        for (int m8008x3d79f549 = m8008x3d79f549() - 1; m8008x3d79f549 >= 0; m8008x3d79f549--) {
            android.view.View m8007x6a486239 = m8007x6a486239(m8008x3d79f549);
            if (this.f93455f.e(m8007x6a486239) < i17 || this.f93455f.o(m8007x6a486239) < i17) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) m8007x6a486239.getLayoutParams();
            if (layoutParams.f93474i) {
                for (int i18 = 0; i18 < this.f93453d; i18++) {
                    if (this.f93454e[i18].f93809a.size() == 1) {
                        return;
                    }
                }
                for (int i19 = 0; i19 < this.f93453d; i19++) {
                    this.f93454e[i19].m();
                }
            } else if (layoutParams.f93473h.f93809a.size() == 1) {
                return;
            } else {
                layoutParams.f93473h.m();
            }
            m8079xef099f25(m8007x6a486239, z2Var);
        }
    }

    public final void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, int i17) {
        while (m8008x3d79f549() > 0) {
            android.view.View m8007x6a486239 = m8007x6a486239(0);
            if (this.f93455f.b(m8007x6a486239) > i17 || this.f93455f.n(m8007x6a486239) > i17) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) m8007x6a486239.getLayoutParams();
            if (layoutParams.f93474i) {
                for (int i18 = 0; i18 < this.f93453d; i18++) {
                    if (this.f93454e[i18].f93809a.size() == 1) {
                        return;
                    }
                }
                for (int i19 = 0; i19 < this.f93453d; i19++) {
                    this.f93454e[i19].n();
                }
            } else if (layoutParams.f93473h.f93809a.size() == 1) {
                return;
            } else {
                layoutParams.f93473h.n();
            }
            m8079xef099f25(m8007x6a486239, z2Var);
        }
    }

    public final void M() {
        if (this.f93457h == 1 || !E()) {
            this.f93461o = this.f93460n;
        } else {
            this.f93461o = !this.f93460n;
        }
    }

    public int N(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return 0;
        }
        I(i17, h3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var = this.f93459m;
        int r17 = r(z2Var, j1Var, h3Var);
        if (j1Var.f93618b >= r17) {
            i17 = i17 < 0 ? -r17 : r17;
        }
        this.f93455f.p(-i17);
        this.f93467u = this.f93461o;
        j1Var.f93618b = 0;
        J(z2Var, j1Var);
        return i17;
    }

    public void O(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState = this.f93469w;
        if (savedState != null) {
            savedState.f93482g = null;
            savedState.f93481f = 0;
            savedState.f93479d = -1;
            savedState.f93480e = -1;
        }
        this.f93463q = i17;
        this.f93464r = i18;
        m8087x46ac7299();
    }

    public final void P(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var = this.f93459m;
        j1Var.f93621e = i17;
        j1Var.f93620d = this.f93461o != (i17 == -1) ? -1 : 1;
    }

    public void Q(int i17) {
        mo7925x48ffb02c(null);
        if (i17 != this.f93453d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.v3 v3Var = this.f93465s;
            int[] iArr = v3Var.f93783a;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            v3Var.f93784b = null;
            m8087x46ac7299();
            this.f93453d = i17;
            this.f93462p = new java.util.BitSet(this.f93453d);
            this.f93454e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.x3[this.f93453d];
            for (int i18 = 0; i18 < this.f93453d; i18++) {
                this.f93454e[i18] = new p012xc85e97e9.p103xe821e364.p104xd1075a44.x3(this, i18);
            }
            m8087x46ac7299();
        }
    }

    public final void R(int i17, int i18) {
        for (int i19 = 0; i19 < this.f93453d; i19++) {
            if (!this.f93454e[i19].f93809a.isEmpty()) {
                T(this.f93454e[i19], i17, i18);
            }
        }
    }

    public final void S(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int i18;
        int i19;
        int i27;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var = this.f93459m;
        boolean z17 = false;
        j1Var.f93618b = 0;
        j1Var.f93619c = i17;
        if (!m8047xbe6bc15d() || (i27 = h3Var.f93592a) == -1) {
            i18 = 0;
            i19 = 0;
        } else {
            if (this.f93461o == (i27 < i17)) {
                i18 = this.f93455f.l();
                i19 = 0;
            } else {
                i19 = this.f93455f.l();
                i18 = 0;
            }
        }
        if (m8009xf2b87f0()) {
            j1Var.f93622f = this.f93455f.k() - i19;
            j1Var.f93623g = this.f93455f.g() + i18;
        } else {
            j1Var.f93623g = this.f93455f.f() + i18;
            j1Var.f93622f = -i19;
        }
        j1Var.f93624h = false;
        j1Var.f93617a = true;
        if (this.f93455f.i() == 0 && this.f93455f.f() == 0) {
            z17 = true;
        }
        j1Var.f93625i = z17;
    }

    public final void T(p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var, int i17, int i18) {
        int i19 = x3Var.f93812d;
        int i27 = x3Var.f93813e;
        if (i17 == -1) {
            int i28 = x3Var.f93810b;
            if (i28 == Integer.MIN_VALUE) {
                x3Var.c();
                i28 = x3Var.f93810b;
            }
            if (i28 + i19 <= i18) {
                this.f93462p.set(i27, false);
                return;
            }
            return;
        }
        int i29 = x3Var.f93811c;
        if (i29 == Integer.MIN_VALUE) {
            x3Var.b();
            i29 = x3Var.f93811c;
        }
        if (i29 - i19 >= i18) {
            this.f93462p.set(i27, false);
        }
    }

    public final int U(int i17, int i18, int i19) {
        if (i18 == 0 && i19 == 0) {
            return i17;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i17) - i18) - i19), mode) : i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f3
    public android.graphics.PointF a(int i17) {
        int m17 = m(i17);
        android.graphics.PointF pointF = new android.graphics.PointF();
        if (m17 == 0) {
            return null;
        }
        if (this.f93457h == 0) {
            pointF.x = m17;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m17;
        }
        return pointF;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: assertNotInLayoutOrScroll */
    public void mo7925x48ffb02c(java.lang.String str) {
        if (this.f93469w == null) {
            super.mo7925x48ffb02c(str);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return this.f93457h == 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return this.f93457h == 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: checkLayoutParams */
    public boolean mo7909xc6204678(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: collectAdjacentPrefetchPositions */
    public void mo7927x3a789507(int i17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.s2 s2Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 j1Var;
        int i19;
        int i27;
        if (this.f93457h != 0) {
            i17 = i18;
        }
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return;
        }
        I(i17, h3Var);
        int[] iArr = this.C;
        if (iArr == null || iArr.length < this.f93453d) {
            this.C = new int[this.f93453d];
        }
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int i37 = this.f93453d;
            j1Var = this.f93459m;
            if (i28 >= i37) {
                break;
            }
            if (j1Var.f93620d == -1) {
                i19 = j1Var.f93622f;
                i27 = this.f93454e[i28].l(i19);
            } else {
                i19 = this.f93454e[i28].i(j1Var.f93623g);
                i27 = j1Var.f93623g;
            }
            int i38 = i19 - i27;
            if (i38 >= 0) {
                this.C[i29] = i38;
                i29++;
            }
            i28++;
        }
        java.util.Arrays.sort(this.C, 0, i29);
        for (int i39 = 0; i39 < i29; i39++) {
            int i47 = j1Var.f93619c;
            if (!(i47 >= 0 && i47 < h3Var.b())) {
                return;
            }
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.p0) s2Var).a(j1Var.f93619c, this.C[i39]);
            j1Var.f93619c += j1Var.f93620d;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollExtent */
    public int mo7929x8e0c6fb2(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollOffset */
    public int mo7930x9e19151b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return p(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollRange */
    public int mo7931x57d657b5(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return q(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollExtent */
    public int mo7932xa00e39c4(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return o(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollOffset */
    public int mo7933xb01adf2d(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return p(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollRange */
    public int mo7934xd44a0363(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return q(h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return this.f93457h == 0 ? new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams(-2, -1) : new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams(-1, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7910x5663b65(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams(context, attributeSet);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: getColumnCountForAccessibility */
    public int mo7912xed424b48(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return this.f93457h == 1 ? this.f93453d : super.mo7912xed424b48(z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: getRowCountForAccessibility */
    public int mo7913x35d87df0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return this.f93457h == 0 ? this.f93453d : super.mo7913x35d87df0(z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: isAutoMeasureEnabled */
    public boolean mo7936xd96f765c() {
        return this.f93466t != 0;
    }

    public final int m(int i17) {
        if (m8008x3d79f549() == 0) {
            return this.f93461o ? 1 : -1;
        }
        return (i17 < y()) != this.f93461o ? -1 : 1;
    }

    public boolean n() {
        int y17;
        int z17;
        if (m8008x3d79f549() == 0 || this.f93466t == 0 || !m8042xf4368959()) {
            return false;
        }
        if (this.f93461o) {
            y17 = z();
            z17 = y();
        } else {
            y17 = y();
            z17 = z();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v3 v3Var = this.f93465s;
        if (y17 == 0 && D() != null) {
            int[] iArr = v3Var.f93783a;
            if (iArr != null) {
                java.util.Arrays.fill(iArr, -1);
            }
            v3Var.f93784b = null;
            mo8088xe9400092();
            m8087x46ac7299();
            return true;
        }
        if (!this.A) {
            return false;
        }
        int i17 = this.f93461o ? -1 : 1;
        int i18 = z17 + 1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25 d17 = v3Var.d(y17, i18, i17, true);
        if (d17 == null) {
            this.A = false;
            v3Var.c(i18);
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25 d18 = v3Var.d(y17, d17.f93475d, i17 * (-1), true);
        if (d18 == null) {
            v3Var.c(d17.f93475d);
        } else {
            v3Var.c(d18.f93475d + 1);
        }
        mo8088xe9400092();
        m8087x46ac7299();
        return true;
    }

    public final int o(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93455f;
        boolean z17 = this.B;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.a(h3Var, w1Var, t(!z17), s(!z17), this, this.B);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: offsetChildrenHorizontal */
    public void mo8054x8cefd576(int i17) {
        super.mo8054x8cefd576(i17);
        for (int i18 = 0; i18 < this.f93453d; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var = this.f93454e[i18];
            int i19 = x3Var.f93810b;
            if (i19 != Integer.MIN_VALUE) {
                x3Var.f93810b = i19 + i17;
            }
            int i27 = x3Var.f93811c;
            if (i27 != Integer.MIN_VALUE) {
                x3Var.f93811c = i27 + i17;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: offsetChildrenVertical */
    public void mo8055xe23cdd48(int i17) {
        super.mo8055xe23cdd48(i17);
        for (int i18 = 0; i18 < this.f93453d; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var = this.f93454e[i18];
            int i19 = x3Var.f93810b;
            if (i19 != Integer.MIN_VALUE) {
                x3Var.f93810b = i19 + i17;
            }
            int i27 = x3Var.f93811c;
            if (i27 != Integer.MIN_VALUE) {
                x3Var.f93811c = i27 + i17;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
        m8081x3fa464aa(this.D);
        for (int i17 = 0; i17 < this.f93453d; i17++) {
            this.f93454e[i17].d();
        }
        c1163xf1deaba4.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x003b, code lost:
    
        if (r9.f93457h == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0041, code lost:
    
        if (r9.f93457h == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x004d, code lost:
    
        if (E() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0059, code lost:
    
        if (E() == false) goto L30;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onFocusSearchFailed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo7914x990cf8de(android.view.View r10, int r11, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r12, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.mo7914x990cf8de(android.view.View, int, androidx.recyclerview.widget.z2, androidx.recyclerview.widget.h3):android.view.View");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onInitializeAccessibilityEvent */
    public void mo7938x9d5dd31b(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo7938x9d5dd31b(accessibilityEvent);
        if (m8008x3d79f549() > 0) {
            android.view.View t17 = t(false);
            android.view.View s17 = s(false);
            if (t17 == null || s17 == null) {
                return;
            }
            int m8032xa86cd69f = m8032xa86cd69f(t17);
            int m8032xa86cd69f2 = m8032xa86cd69f(s17);
            if (m8032xa86cd69f < m8032xa86cd69f2) {
                accessibilityEvent.setFromIndex(m8032xa86cd69f);
                accessibilityEvent.setToIndex(m8032xa86cd69f2);
            } else {
                accessibilityEvent.setFromIndex(m8032xa86cd69f2);
                accessibilityEvent.setToIndex(m8032xa86cd69f);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onInitializeAccessibilityNodeInfoForItem */
    public void mo7915x96481acd(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, android.view.View view, o3.l lVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            super.m8063x96481acd(view, lVar);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams;
        if (this.f93457h == 0) {
            int e17 = layoutParams2.e();
            boolean z17 = layoutParams2.f93474i;
            lVar.o(o3.k.a(e17, z17 ? this.f93453d : 1, -1, -1, z17, false));
        } else {
            int e18 = layoutParams2.e();
            boolean z18 = layoutParams2.f93474i;
            lVar.o(o3.k.a(-1, -1, e18, z18 ? this.f93453d : 1, z18, false));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsAdded */
    public void mo7916x721d405f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        C(i17, i18, 1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsChanged */
    public void mo7917xd0486653(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v3 v3Var = this.f93465s;
        int[] iArr = v3Var.f93783a;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        v3Var.f93784b = null;
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsMoved */
    public void mo7918x72cb9e12(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, int i19) {
        C(i17, i18, 8);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsRemoved */
    public void mo7919xe5511bff(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        C(i17, i18, 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onItemsUpdated */
    public void mo7920x9643e45a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.Object obj) {
        C(i17, i18, 4);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        G(z2Var, h3Var, true);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        this.f93463q = -1;
        this.f93464r = Integer.MIN_VALUE;
        this.f93469w = null;
        this.f93472z.a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onRestoreInstanceState */
    public void mo7939xb949e58d(android.os.Parcelable parcelable) {
        if (parcelable instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState) {
            this.f93469w = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState) parcelable;
            m8087x46ac7299();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onSaveInstanceState */
    public android.os.Parcelable mo7940xa71a2260() {
        int l17;
        int k17;
        int[] iArr;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState = this.f93469w;
        if (savedState != null) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState(savedState);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState();
        savedState2.f93486n = this.f93460n;
        savedState2.f93487o = this.f93467u;
        savedState2.f93488p = this.f93468v;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v3 v3Var = this.f93465s;
        if (v3Var == null || (iArr = v3Var.f93783a) == null) {
            savedState2.f93483h = 0;
        } else {
            savedState2.f93484i = iArr;
            savedState2.f93483h = iArr.length;
            savedState2.f93485m = v3Var.f93784b;
        }
        if (m8008x3d79f549() > 0) {
            savedState2.f93479d = this.f93467u ? z() : y();
            android.view.View s17 = this.f93461o ? s(true) : t(true);
            savedState2.f93480e = s17 != null ? m8032xa86cd69f(s17) : -1;
            int i17 = this.f93453d;
            savedState2.f93481f = i17;
            savedState2.f93482g = new int[i17];
            for (int i18 = 0; i18 < this.f93453d; i18++) {
                if (this.f93467u) {
                    l17 = this.f93454e[i18].i(Integer.MIN_VALUE);
                    if (l17 != Integer.MIN_VALUE) {
                        k17 = this.f93455f.g();
                        l17 -= k17;
                        savedState2.f93482g[i18] = l17;
                    } else {
                        savedState2.f93482g[i18] = l17;
                    }
                } else {
                    l17 = this.f93454e[i18].l(Integer.MIN_VALUE);
                    if (l17 != Integer.MIN_VALUE) {
                        k17 = this.f93455f.k();
                        l17 -= k17;
                        savedState2.f93482g[i18] = l17;
                    } else {
                        savedState2.f93482g[i18] = l17;
                    }
                }
            }
        } else {
            savedState2.f93479d = -1;
            savedState2.f93480e = -1;
            savedState2.f93481f = 0;
        }
        return savedState2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onScrollStateChanged */
    public void mo8069x4d79408f(int i17) {
        if (i17 == 0) {
            n();
        }
    }

    public final int p(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93455f;
        boolean z17 = this.B;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.b(h3Var, w1Var, t(!z17), s(!z17), this, this.B, this.f93461o);
    }

    public final int q(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var = this.f93455f;
        boolean z17 = this.B;
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.n3.c(h3Var, w1Var, t(!z17), s(!z17), this, this.B);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r21, p012xc85e97e9.p103xe821e364.p104xd1075a44.j1 r22, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r23) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.r(androidx.recyclerview.widget.z2, androidx.recyclerview.widget.j1, androidx.recyclerview.widget.h3):int");
    }

    public android.view.View s(boolean z17) {
        int k17 = this.f93455f.k();
        int g17 = this.f93455f.g();
        android.view.View view = null;
        for (int m8008x3d79f549 = m8008x3d79f549() - 1; m8008x3d79f549 >= 0; m8008x3d79f549--) {
            android.view.View m8007x6a486239 = m8007x6a486239(m8008x3d79f549);
            int e17 = this.f93455f.e(m8007x6a486239);
            int b17 = this.f93455f.b(m8007x6a486239);
            if (b17 > k17 && e17 < g17) {
                if (b17 <= g17 || !z17) {
                    return m8007x6a486239;
                }
                if (view == null) {
                    view = m8007x6a486239;
                }
            }
        }
        return view;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return N(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState = this.f93469w;
        if (savedState != null && savedState.f93479d != i17) {
            savedState.f93482g = null;
            savedState.f93481f = 0;
            savedState.f93479d = -1;
            savedState.f93480e = -1;
        }
        this.f93463q = i17;
        this.f93464r = Integer.MIN_VALUE;
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return N(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: setMeasuredDimension */
    public void mo7923xd88558fe(android.graphics.Rect rect, int i17, int i18) {
        int m7978x789de6b8;
        int m7978x789de6b82;
        int m8028x805c2682 = m8028x805c2682() + m8029x8b7f0b01();
        int m8031xf39fff7a = m8031xf39fff7a() + m8026xc96f6de6();
        if (this.f93457h == 1) {
            m7978x789de6b82 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i18, rect.height() + m8031xf39fff7a, m8024x411c071f());
            m7978x789de6b8 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i17, (this.f93458i * this.f93453d) + m8028x805c2682, m8025xa81818ce());
        } else {
            m7978x789de6b8 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i17, rect.width() + m8028x805c2682, m8025xa81818ce());
            m7978x789de6b82 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager.m7978x789de6b8(i18, (this.f93458i * this.f93453d) + m8031xf39fff7a, m8024x411c071f());
        }
        mo8093xd88558fe(m7978x789de6b8, m7978x789de6b82);
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
        return this.f93469w == null;
    }

    public android.view.View t(boolean z17) {
        int k17 = this.f93455f.k();
        int g17 = this.f93455f.g();
        int m8008x3d79f549 = m8008x3d79f549();
        android.view.View view = null;
        for (int i17 = 0; i17 < m8008x3d79f549; i17++) {
            android.view.View m8007x6a486239 = m8007x6a486239(i17);
            int e17 = this.f93455f.e(m8007x6a486239);
            if (this.f93455f.b(m8007x6a486239) > k17 && e17 < g17) {
                if (e17 >= k17 || !z17) {
                    return m8007x6a486239;
                }
                if (view == null) {
                    view = m8007x6a486239;
                }
            }
        }
        return view;
    }

    public int[] u(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f93453d];
        } else if (iArr.length < this.f93453d) {
            throw new java.lang.IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f93453d + ", array size:" + iArr.length);
        }
        for (int i17 = 0; i17 < this.f93453d; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var = this.f93454e[i17];
            iArr[i17] = x3Var.f93814f.f93460n ? x3Var.h(r4.size() - 1, -1, false) : x3Var.h(0, x3Var.f93809a.size(), false);
        }
        return iArr;
    }

    public int[] v(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f93453d];
        } else if (iArr.length < this.f93453d) {
            throw new java.lang.IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f93453d + ", array size:" + iArr.length);
        }
        for (int i17 = 0; i17 < this.f93453d; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.x3 x3Var = this.f93454e[i17];
            iArr[i17] = x3Var.f93814f.f93460n ? x3Var.h(0, x3Var.f93809a.size(), false) : x3Var.h(r4.size() - 1, -1, false);
        }
        return iArr;
    }

    public final void w(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int g17;
        int A = A(Integer.MIN_VALUE);
        if (A != Integer.MIN_VALUE && (g17 = this.f93455f.g() - A) > 0) {
            int i17 = g17 - (-N(-g17, z2Var, h3Var));
            if (!z17 || i17 <= 0) {
                return;
            }
            this.f93455f.p(i17);
        }
    }

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, boolean z17) {
        int k17;
        int B = B(Integer.MAX_VALUE);
        if (B != Integer.MAX_VALUE && (k17 = B - this.f93455f.k()) > 0) {
            int N = k17 - N(k17, z2Var, h3Var);
            if (!z17 || N <= 0) {
                return;
            }
            this.f93455f.p(-N);
        }
    }

    public int y() {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        return m8032xa86cd69f(m8007x6a486239(0));
    }

    public int z() {
        int m8008x3d79f549 = m8008x3d79f549();
        if (m8008x3d79f549 == 0) {
            return 0;
        }
        return m8032xa86cd69f(m8007x6a486239(m8008x3d79f549 - 1));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo7911x5663b65(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams(layoutParams);
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState> f3611x681a0c0c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.w3();

        /* renamed from: d, reason: collision with root package name */
        public int f93479d;

        /* renamed from: e, reason: collision with root package name */
        public int f93480e;

        /* renamed from: f, reason: collision with root package name */
        public int f93481f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f93482g;

        /* renamed from: h, reason: collision with root package name */
        public int f93483h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f93484i;

        /* renamed from: m, reason: collision with root package name */
        public java.util.List f93485m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f93486n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f93487o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f93488p;

        public SavedState(android.os.Parcel parcel) {
            this.f93479d = parcel.readInt();
            this.f93480e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f93481f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f93482g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f93483h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f93484i = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f93486n = parcel.readInt() == 1;
            this.f93487o = parcel.readInt() == 1;
            this.f93488p = parcel.readInt() == 1;
            this.f93485m = parcel.readArrayList(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f93479d);
            parcel.writeInt(this.f93480e);
            parcel.writeInt(this.f93481f);
            if (this.f93481f > 0) {
                parcel.writeIntArray(this.f93482g);
            }
            parcel.writeInt(this.f93483h);
            if (this.f93483h > 0) {
                parcel.writeIntArray(this.f93484i);
            }
            parcel.writeInt(this.f93486n ? 1 : 0);
            parcel.writeInt(this.f93487o ? 1 : 0);
            parcel.writeInt(this.f93488p ? 1 : 0);
            parcel.writeList(this.f93485m);
        }

        public SavedState(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.SavedState savedState) {
            this.f93481f = savedState.f93481f;
            this.f93479d = savedState.f93479d;
            this.f93480e = savedState.f93480e;
            this.f93482g = savedState.f93482g;
            this.f93483h = savedState.f93483h;
            this.f93484i = savedState.f93484i;
            this.f93486n = savedState.f93486n;
            this.f93487o = savedState.f93487o;
            this.f93488p = savedState.f93488p;
            this.f93485m = savedState.f93485m;
        }
    }

    public C1164x587b7ff1(int i17, int i18) {
        this.f93453d = -1;
        this.f93460n = false;
        this.f93461o = false;
        this.f93463q = -1;
        this.f93464r = Integer.MIN_VALUE;
        this.f93465s = new p012xc85e97e9.p103xe821e364.p104xd1075a44.v3();
        this.f93466t = 2;
        this.f93471y = new android.graphics.Rect();
        this.f93472z = new p012xc85e97e9.p103xe821e364.p104xd1075a44.t3(this);
        this.A = false;
        this.B = true;
        this.D = new p012xc85e97e9.p103xe821e364.p104xd1075a44.s3(this);
        this.f93457h = i18;
        Q(i17);
        this.f93459m = new p012xc85e97e9.p103xe821e364.p104xd1075a44.j1();
        this.f93455f = p012xc85e97e9.p103xe821e364.p104xd1075a44.w1.a(this, this.f93457h);
        this.f93456g = p012xc85e97e9.p103xe821e364.p104xd1075a44.w1.a(this, 1 - this.f93457h);
    }
}
