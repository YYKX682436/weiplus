package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24;

/* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager */
/* loaded from: classes15.dex */
public abstract class AbstractC16339x902601c5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {
    public int A;
    public float B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public int f227272J;
    public int K;
    public int L;
    public int M;
    public android.view.View N;

    /* renamed from: v, reason: collision with root package name */
    public final android.util.SparseArray f227273v;

    /* renamed from: w, reason: collision with root package name */
    public int f227274w;

    /* renamed from: x, reason: collision with root package name */
    public int f227275x;

    /* renamed from: y, reason: collision with root package name */
    public int f227276y;

    /* renamed from: z, reason: collision with root package name */
    public int f227277z;

    public AbstractC16339x902601c5(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f227273v = new android.util.SparseArray();
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = -1;
        this.H = null;
        this.L = -1;
        this.M = Integer.MAX_VALUE;
        Q(i17);
        R(z17);
        mo8089xb148c794(true);
        m8091xc21abdf5(false);
    }

    private int O(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0 || i17 == 0) {
            return 0;
        }
        r();
        float f17 = i17;
        float Z = f17 / Z();
        if (java.lang.Math.abs(Z) < 1.0E-8f) {
            return 0;
        }
        float f18 = this.B + Z;
        if (f18 < (!this.E ? 0.0f : (-(m8020x7e414b06() - 1)) * this.I)) {
            i17 = (int) (f17 - ((f18 - (this.E ? (-(m8020x7e414b06() - 1)) * this.I : 0.0f)) * Z()));
        } else {
            if (f18 > (!this.E ? (m8020x7e414b06() - 1) * this.I : 0.0f)) {
                i17 = (int) (((this.E ? 0.0f : (m8020x7e414b06() - 1) * this.I) - this.B) * Z());
            }
        }
        this.B += i17 / Z();
        c0(z2Var);
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public int H() {
        return this.f227276y;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void Q(int i17) {
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i17);
        }
        mo7925x48ffb02c(null);
        if (i17 == this.f227276y) {
            return;
        }
        this.f227276y = i17;
        this.C = null;
        this.M = Integer.MAX_VALUE;
        m8076xba225f1();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void R(boolean z17) {
        mo7925x48ffb02c(null);
        if (z17 == this.D) {
            return;
        }
        this.D = z17;
        m8076xba225f1();
    }

    public final int W() {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        if (!this.F) {
            return !this.E ? X() : (m8020x7e414b06() - X()) - 1;
        }
        boolean z17 = this.E;
        float f17 = z17 ? this.B : this.B;
        return !z17 ? (int) f17 : (int) (((m8020x7e414b06() - 1) * this.I) + f17);
    }

    public int X() {
        if (m8020x7e414b06() == 0) {
            return 0;
        }
        return java.lang.Math.abs(Y());
    }

    public int Y() {
        float f17 = this.I;
        if (f17 == 0.0f) {
            return 0;
        }
        return java.lang.Math.round(this.B / f17);
    }

    public float Z() {
        return 1.0f;
    }

    public final android.view.View a0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        if (i17 >= h3Var.b() || i17 < 0) {
            return null;
        }
        try {
            return z2Var.f(i17);
        } catch (java.lang.Exception unused) {
            return a0(z2Var, h3Var, i17 + 1);
        }
    }

    public int b0(int i17) {
        return (int) (((i17 * (!this.E ? this.I : -this.I)) - this.B) * Z());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.c0(androidx.recyclerview.widget.z2):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean mo2416xc6ea780e() {
        return this.f227276y == 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF204840r() {
        return this.f227276y == 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollExtent */
    public int mo7929x8e0c6fb2(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        if (this.F) {
            return (int) this.I;
        }
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollOffset */
    public int mo7930x9e19151b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return W();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeHorizontalScrollRange */
    public int mo7931x57d657b5(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        return !this.F ? m8020x7e414b06() : (int) (m8020x7e414b06() * this.I);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollExtent */
    public int mo7932xa00e39c4(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        if (this.F) {
            return (int) this.I;
        }
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollOffset */
    public int mo7933xb01adf2d(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return W();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: computeVerticalScrollRange */
    public int mo7934xd44a0363(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (m8008x3d79f549() == 0) {
            return 0;
        }
        return !this.F ? m8020x7e414b06() : (int) (m8020x7e414b06() * this.I);
    }

    public abstract float d0();

    public abstract void e0(android.view.View view, float f17);

    public void f0() {
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: findViewByPosition */
    public android.view.View mo7935xa188593e(int i17) {
        int m8020x7e414b06 = m8020x7e414b06();
        if (m8020x7e414b06 == 0) {
            return null;
        }
        int i18 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f227273v;
            if (i18 >= sparseArray.size()) {
                return null;
            }
            int keyAt = sparseArray.keyAt(i18);
            if (keyAt < 0) {
                int i19 = keyAt % m8020x7e414b06;
                if (i19 == 0) {
                    i19 = -m8020x7e414b06;
                }
                if (i19 + m8020x7e414b06 == i17) {
                    return (android.view.View) sparseArray.valueAt(i18);
                }
            } else if (i17 == keyAt % m8020x7e414b06) {
                return (android.view.View) sparseArray.valueAt(i18);
            }
            i18++;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-2, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAdapterChanged */
    public void mo8056xff347824(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2) {
        m8076xba225f1();
        this.B = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onAddFocusables */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo8057xf63fac63(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.X()
            android.view.View r1 = r4.mo7935xa188593e(r0)
            r2 = 1
            if (r1 != 0) goto Lc
            return r2
        Lc:
            boolean r3 = r5.hasFocus()
            if (r3 == 0) goto L4d
            int r6 = r4.f227276y
            r8 = -1
            if (r6 != r2) goto L25
            r6 = 33
            if (r7 != r6) goto L1e
            boolean r6 = r4.E
            goto L2b
        L1e:
            r6 = 130(0x82, float:1.82E-43)
            if (r7 != r6) goto L34
            boolean r6 = r4.E
            goto L35
        L25:
            r6 = 17
            if (r7 != r6) goto L2d
            boolean r6 = r4.E
        L2b:
            r6 = r6 ^ r2
            goto L35
        L2d:
            r6 = 66
            if (r7 != r6) goto L34
            boolean r6 = r4.E
            goto L35
        L34:
            r6 = r8
        L35:
            if (r6 == r8) goto L50
            if (r6 != r2) goto L3b
            int r0 = r0 - r2
            goto L3c
        L3b:
            int r0 = r0 + r2
        L3c:
            int r6 = r4.b0(r0)
            int r7 = r4.f227276y
            r8 = 0
            if (r7 != r2) goto L49
            r5.mo7976xc291bbd2(r8, r6)
            goto L50
        L49:
            r5.mo7976xc291bbd2(r6, r8)
            goto L50
        L4d:
            r1.addFocusables(r6, r7, r8)
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.mo8057xf63fac63(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onDetachedFromWindow */
    public void mo7937x8876e98b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        super.mo7937x8876e98b(c1163xf1deaba4, z2Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onFocusSearchFailed */
    public android.view.View mo7914x990cf8de(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        float f17;
        float f18;
        if (h3Var.b() == 0) {
            m8077x28b7b1cd(z2Var);
            this.B = 0.0f;
            return;
        }
        r();
        if (this.f227276y == 1 || !I()) {
            this.E = this.D;
        } else {
            this.E = !this.D;
        }
        android.view.View a07 = a0(z2Var, h3Var, 0);
        if (a07 == null) {
            m8077x28b7b1cd(z2Var);
            this.B = 0.0f;
            return;
        }
        mo8052x6ae7e3a1(a07, 0, 0);
        this.f227274w = this.C.a(a07);
        this.f227275x = this.C.b(a07);
        this.f227277z = (this.C.d() - this.f227274w) / 2;
        if (this.M == Integer.MAX_VALUE) {
            this.A = (this.C.e() - this.f227275x) / 2;
        } else {
            this.A = (this.C.e() - this.f227275x) - this.M;
        }
        this.I = d0();
        f0();
        if (this.I == 0.0f) {
            this.f227272J = 1;
            this.K = 1;
        } else {
            this.f227272J = ((int) java.lang.Math.abs((((-this.f227274w) - this.C.c()) - this.f227277z) / this.I)) + 1;
            this.K = ((int) java.lang.Math.abs((this.C.d() - this.f227277z) / this.I)) + 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState savedState = this.H;
        if (savedState != null) {
            this.E = savedState.f227280f;
            this.G = savedState.f227278d;
            this.B = savedState.f227279e;
        }
        int i17 = this.G;
        if (i17 != -1) {
            if (this.E) {
                f17 = i17;
                f18 = -this.I;
            } else {
                f17 = i17;
                f18 = this.I;
            }
            this.B = f17 * f18;
        }
        c0(z2Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        this.H = null;
        this.G = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onRestoreInstanceState */
    public void mo7939xb949e58d(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState) {
            this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState) parcelable);
            m8087x46ac7299();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onSaveInstanceState */
    public android.os.Parcelable mo7940xa71a2260() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState savedState = this.H;
        if (savedState != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState(savedState);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState savedState2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState();
        savedState2.f227278d = this.G;
        savedState2.f227279e = this.B;
        savedState2.f227280f = this.E;
        return savedState2;
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.e cVar;
        if (this.C == null) {
            int i17 = this.f227276y;
            if (i17 == 0) {
                cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.c(this);
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalArgumentException("invalid orientation");
                }
                cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.d(this);
            }
            this.C = cVar;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f227276y == 1) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        if (i17 < 0 || i17 >= m8020x7e414b06()) {
            return;
        }
        this.G = i17;
        this.B = i17 * (this.E ? -this.I : this.I);
        m8087x46ac7299();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f227276y == 0) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        int b07 = b0(i17);
        if (this.f227276y == 1) {
            c1163xf1deaba4.b1(0, b07, null);
        } else {
            c1163xf1deaba4.b1(b07, 0, null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState> f37470x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.f();

        /* renamed from: d, reason: collision with root package name */
        public int f227278d;

        /* renamed from: e, reason: collision with root package name */
        public float f227279e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f227280f;

        public SavedState(android.os.Parcel parcel) {
            this.f227278d = parcel.readInt();
            this.f227279e = parcel.readFloat();
            this.f227280f = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f227278d);
            parcel.writeFloat(this.f227279e);
            parcel.writeInt(this.f227280f ? 1 : 0);
        }

        public SavedState(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.AbstractC16339x902601c5.SavedState savedState) {
            this.f227278d = savedState.f227278d;
            this.f227279e = savedState.f227279e;
            this.f227280f = savedState.f227280f;
        }
    }
}
