package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class e0 extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s1 {

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 f296027o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 f296028p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f296029q;

    /* renamed from: n, reason: collision with root package name */
    public int f296026n = 1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f296030r = false;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f296031s = true;

    /* renamed from: t, reason: collision with root package name */
    public int f296032t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f296033u = Integer.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22948xa5af14f0 f296034v = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a0 f296035w = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a0();

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b0 f296036x = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b0();

    /* renamed from: y, reason: collision with root package name */
    public final int f296037y = 2;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f296038z = new int[2];

    public e0(android.content.Context context) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4;
        this.f296029q = false;
        Y(1);
        if (this.f296034v == null && (c22949xf1deaba4 = this.f296055b) != null) {
            c22949xf1deaba4.i(null);
        }
        if (this.f296029q) {
            this.f296029q = false;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = this.f296055b;
            if (c22949xf1deaba42 != null) {
                c22949xf1deaba42.requestLayout();
            }
        }
    }

    public abstract void E(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var, int[] iArr);

    public final int F(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var) {
        if (h() == 0) {
            return 0;
        }
        J();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f296028p;
        boolean z17 = this.f296031s;
        android.view.View M = M(!z17, true);
        android.view.View L = L(!z17, true);
        if (h() == 0 || u1Var.b() == 0 || M == null || L == null) {
            return 0;
        }
        if (!z17) {
            return java.lang.Math.abs(o(M) - o(L)) + 1;
        }
        return java.lang.Math.min(k0Var.j(), k0Var.a(L) - k0Var.d(M));
    }

    public final int G(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var) {
        if (h() == 0) {
            return 0;
        }
        J();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f296028p;
        boolean z17 = this.f296031s;
        android.view.View M = M(!z17, true);
        android.view.View L = L(!z17, true);
        boolean z18 = this.f296030r;
        if (h() == 0 || u1Var.b() == 0 || M == null || L == null) {
            return 0;
        }
        int max = z18 ? java.lang.Math.max(0, (u1Var.b() - java.lang.Math.max(o(M), o(L))) - 1) : java.lang.Math.max(0, java.lang.Math.min(o(M), o(L)));
        if (z17) {
            return java.lang.Math.round((max * (java.lang.Math.abs(k0Var.a(L) - k0Var.d(M)) / (java.lang.Math.abs(o(M) - o(L)) + 1))) + (k0Var.i() - k0Var.d(M)));
        }
        return max;
    }

    public final int H(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var) {
        if (h() == 0) {
            return 0;
        }
        J();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 k0Var = this.f296028p;
        boolean z17 = this.f296031s;
        android.view.View M = M(!z17, true);
        android.view.View L = L(!z17, true);
        if (h() == 0 || u1Var.b() == 0 || M == null || L == null) {
            return 0;
        }
        if (!z17) {
            return u1Var.b();
        }
        return (int) (((k0Var.a(L) - k0Var.d(M)) / (java.lang.Math.abs(o(M) - o(L)) + 1)) * u1Var.b());
    }

    public android.graphics.PointF I(int i17) {
        if (h() == 0) {
            return null;
        }
        int i18 = (i17 < o(g(0))) != this.f296030r ? -1 : 1;
        return this.f296026n == 0 ? new android.graphics.PointF(i18, 0.0f) : new android.graphics.PointF(0.0f, i18);
    }

    public void J() {
        if (this.f296027o == null) {
            this.f296027o = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x024a, code lost:
    
        if (r6 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0270, code lost:
    
        if (r21.f296185g == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        if (r15.j() == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int K(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 r19, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 r20, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0.K(com.tencent.mm.xcompat.recyclerview.widget.n1, com.tencent.mm.xcompat.recyclerview.widget.c0, com.tencent.mm.xcompat.recyclerview.widget.u1, boolean):int");
    }

    public android.view.View L(boolean z17, boolean z18) {
        return this.f296030r ? P(0, h(), z17, z18) : P(h() - 1, -1, z17, z18);
    }

    public android.view.View M(boolean z17, boolean z18) {
        return this.f296030r ? P(h() - 1, -1, z17, z18) : P(0, h(), z17, z18);
    }

    public int N() {
        android.view.View P = P(0, h(), false, true);
        if (P == null) {
            return -1;
        }
        return o(P);
    }

    public android.view.View O(int i17, int i18) {
        int i19;
        int i27;
        J();
        if ((i18 > i17 ? (char) 1 : i18 < i17 ? (char) 65535 : (char) 0) == 0) {
            return g(i17);
        }
        if (this.f296028p.d(g(i17)) < this.f296028p.i()) {
            i19 = 16644;
            i27 = 16388;
        } else {
            i19 = 4161;
            i27 = 4097;
        }
        return this.f296026n == 0 ? this.f296056c.a(i17, i18, i19, i27) : this.f296057d.a(i17, i18, i19, i27);
    }

    public android.view.View P(int i17, int i18, boolean z17, boolean z18) {
        J();
        int i19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        int i27 = z17 ? 24579 : 320;
        if (!z18) {
            i19 = 0;
        }
        return this.f296026n == 0 ? this.f296056c.a(i17, i18, i27, i19) : this.f296057d.a(i17, i18, i27, i19);
    }

    public final int Q(int i17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var, boolean z17) {
        int f17;
        int f18 = this.f296028p.f() - i17;
        if (f18 <= 0) {
            return 0;
        }
        int i18 = -X(-f18, n1Var, u1Var);
        int i19 = i17 + i18;
        if (!z17 || (f17 = this.f296028p.f() - i19) <= 0) {
            return i18;
        }
        this.f296028p.m(f17);
        return f17 + i18;
    }

    public final int R(int i17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var, boolean z17) {
        int i18;
        int i19 = i17 - this.f296028p.i();
        if (i19 <= 0) {
            return 0;
        }
        int i27 = -X(i19, n1Var, u1Var);
        int i28 = i17 + i27;
        if (!z17 || (i18 = i28 - this.f296028p.i()) <= 0) {
            return i27;
        }
        this.f296028p.m(-i18);
        return i27 - i18;
    }

    public final android.view.View S() {
        return g(this.f296030r ? 0 : h() - 1);
    }

    public final android.view.View T() {
        return g(this.f296030r ? h() - 1 : 0);
    }

    public final void U(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var) {
        if (!c0Var.f296007a || c0Var.f296018l) {
            return;
        }
        int i17 = c0Var.f296013g;
        int i18 = c0Var.f296015i;
        if (c0Var.f296012f == -1) {
            int h17 = h();
            if (i17 < 0) {
                return;
            }
            int e17 = (this.f296028p.e() - i17) + i18;
            if (this.f296030r) {
                for (int i19 = 0; i19 < h17; i19++) {
                    android.view.View g17 = g(i19);
                    if (this.f296028p.d(g17) < e17 || this.f296028p.l(g17) < e17) {
                        V(n1Var, 0, i19);
                        return;
                    }
                }
                return;
            }
            int i27 = h17 - 1;
            for (int i28 = i27; i28 >= 0; i28--) {
                android.view.View g18 = g(i28);
                if (this.f296028p.d(g18) < e17 || this.f296028p.l(g18) < e17) {
                    V(n1Var, i27, i28);
                    return;
                }
            }
            return;
        }
        if (i17 < 0) {
            return;
        }
        int i29 = i17 - i18;
        int h18 = h();
        if (!this.f296030r) {
            for (int i37 = 0; i37 < h18; i37++) {
                android.view.View g19 = g(i37);
                if (this.f296028p.a(g19) > i29 || this.f296028p.k(g19) > i29) {
                    V(n1Var, 0, i37);
                    return;
                }
            }
            return;
        }
        int i38 = h18 - 1;
        for (int i39 = i38; i39 >= 0; i39--) {
            android.view.View g27 = g(i39);
            if (this.f296028p.a(g27) > i29 || this.f296028p.k(g27) > i29) {
                V(n1Var, i38, i39);
                return;
            }
        }
    }

    public final void V(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, int i17, int i18) {
        if (i17 == i18) {
            return;
        }
        if (i18 <= i17) {
            while (i17 > i18) {
                android.view.View g17 = g(i17);
                x(i17);
                n1Var.g(g17);
                i17--;
            }
            return;
        }
        while (true) {
            i18--;
            if (i18 < i17) {
                return;
            }
            android.view.View g18 = g(i18);
            x(i18);
            n1Var.g(g18);
        }
    }

    public final void W() {
        if (this.f296026n != 1) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.v0.d(c22949xf1deaba4) == 1) {
                this.f296030r = !this.f296029q;
                return;
            }
        }
        this.f296030r = this.f296029q;
    }

    public int X(int i17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var) {
        if (h() == 0 || i17 == 0) {
            return 0;
        }
        J();
        this.f296027o.f296007a = true;
        int i18 = i17 > 0 ? 1 : -1;
        int abs = java.lang.Math.abs(i17);
        Z(i18, abs, true, u1Var);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var = this.f296027o;
        int K = c0Var.f296013g + K(n1Var, c0Var, u1Var, false);
        if (K < 0) {
            return 0;
        }
        if (abs > K) {
            i17 = i18 * K;
        }
        this.f296028p.m(-i17);
        this.f296027o.f296016j = i17;
        return i17;
    }

    public void Y(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k0 i0Var;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i17);
        }
        if (this.f296034v == null && (c22949xf1deaba4 = this.f296055b) != null) {
            c22949xf1deaba4.i(null);
        }
        if (i17 != this.f296026n || this.f296028p == null) {
            if (i17 == 0) {
                i0Var = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i0(this);
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalArgumentException("invalid orientation");
                }
                i0Var = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j0(this);
            }
            this.f296028p = i0Var;
            this.f296035w.f295977a = i0Var;
            this.f296026n = i17;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42 = this.f296055b;
            if (c22949xf1deaba42 != null) {
                c22949xf1deaba42.requestLayout();
            }
        }
    }

    public final void Z(int i17, int i18, boolean z17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var) {
        int i19;
        this.f296027o.f296018l = this.f296028p.h() == 0 && this.f296028p.e() == 0;
        this.f296027o.f296012f = i17;
        int[] iArr = this.f296038z;
        iArr[0] = 0;
        iArr[1] = 0;
        E(u1Var, iArr);
        int max = java.lang.Math.max(0, iArr[0]);
        int max2 = java.lang.Math.max(0, iArr[1]);
        boolean z18 = i17 == 1;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var = this.f296027o;
        int i27 = z18 ? max2 : max;
        c0Var.f296014h = i27;
        if (!z18) {
            max = max2;
        }
        c0Var.f296015i = max;
        if (z18) {
            c0Var.f296014h = i27 + this.f296028p.g();
            android.view.View S = S();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var2 = this.f296027o;
            c0Var2.f296011e = this.f296030r ? -1 : 1;
            int o17 = o(S);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var3 = this.f296027o;
            c0Var2.f296010d = o17 + c0Var3.f296011e;
            c0Var3.f296008b = this.f296028p.a(S);
            i19 = this.f296028p.a(S) - this.f296028p.f();
        } else {
            android.view.View T = T();
            this.f296027o.f296014h += this.f296028p.i();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var4 = this.f296027o;
            c0Var4.f296011e = this.f296030r ? 1 : -1;
            int o18 = o(T);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var5 = this.f296027o;
            c0Var4.f296010d = o18 + c0Var5.f296011e;
            c0Var5.f296008b = this.f296028p.d(T);
            i19 = (-this.f296028p.d(T)) + this.f296028p.i();
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var6 = this.f296027o;
        c0Var6.f296009c = i18;
        if (z17) {
            c0Var6.f296009c = i18 - i19;
        }
        c0Var6.f296013g = i19;
    }

    public final void a0(int i17, int i18) {
        this.f296027o.f296009c = this.f296028p.f() - i18;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var = this.f296027o;
        c0Var.f296011e = this.f296030r ? -1 : 1;
        c0Var.f296010d = i17;
        c0Var.f296012f = 1;
        c0Var.f296008b = i18;
        c0Var.f296013g = Integer.MIN_VALUE;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    public boolean b() {
        return this.f296026n == 0;
    }

    public final void b0(int i17, int i18) {
        this.f296027o.f296009c = i18 - this.f296028p.i();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c0 c0Var = this.f296027o;
        c0Var.f296010d = i17;
        c0Var.f296011e = this.f296030r ? 1 : -1;
        c0Var.f296012f = -1;
        c0Var.f296008b = i18;
        c0Var.f296013g = Integer.MIN_VALUE;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    public boolean c() {
        return this.f296026n == 1;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    public android.view.View e(int i17) {
        int h17 = h();
        if (h17 == 0) {
            return null;
        }
        int o17 = i17 - o(g(0));
        if (o17 >= 0 && o17 < h17) {
            android.view.View g17 = g(o17);
            if (o(g17) == i17) {
                return g17;
            }
        }
        int h18 = h();
        for (int i18 = 0; i18 < h18; i18++) {
            android.view.View g18 = g(i18);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(g18);
            if (K != null && K.e() == i17 && !K.y() && (this.f296055b.F1.f296185g || !K.m())) {
                return g18;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0032, code lost:
    
        if (r6.f296026n == 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0037, code lost:
    
        if (r6.f296026n == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004e, code lost:
    
        if ((n3.v0.d(r8) == 1) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0063, code lost:
    
        if ((n3.v0.d(r8) == 1) != false) goto L48;
     */
    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View t(android.view.View r7, int r8, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 r9, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0.t(android.view.View, int, com.tencent.mm.xcompat.recyclerview.widget.n1, com.tencent.mm.xcompat.recyclerview.widget.u1):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ad  */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v68 */
    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 r19, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 r20) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0.u(com.tencent.mm.xcompat.recyclerview.widget.n1, com.tencent.mm.xcompat.recyclerview.widget.u1):void");
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1
    public void y(int i17) {
        this.f296032t = i17;
        this.f296033u = Integer.MIN_VALUE;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22948xa5af14f0 c22948xa5af14f0 = this.f296034v;
        if (c22948xa5af14f0 != null) {
            c22948xa5af14f0.f295918d = -1;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        if (c22949xf1deaba4 != null) {
            c22949xf1deaba4.requestLayout();
        }
    }
}
