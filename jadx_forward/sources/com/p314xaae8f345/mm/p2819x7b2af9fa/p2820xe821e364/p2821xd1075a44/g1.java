package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f f296054a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296055b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i2 f296056c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i2 f296057d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 f296058e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f296059f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f296060g;

    /* renamed from: h, reason: collision with root package name */
    public int f296061h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f296062i;

    /* renamed from: j, reason: collision with root package name */
    public int f296063j;

    /* renamed from: k, reason: collision with root package name */
    public int f296064k;

    /* renamed from: l, reason: collision with root package name */
    public int f296065l;

    /* renamed from: m, reason: collision with root package name */
    public int f296066m;

    public g1() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e1 e1Var = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e1(this);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f1 f1Var = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f1(this);
        this.f296056c = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i2(e1Var);
        this.f296057d = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i2(f1Var);
        this.f296059f = true;
        this.f296060g = true;
    }

    public static int d(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i18, i19) : size : java.lang.Math.min(size, java.lang.Math.max(i18, i19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int i(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1a:
            if (r7 < 0) goto L1e
        L1c:
            r5 = r3
            goto L31
        L1e:
            if (r7 != r1) goto L22
        L20:
            r7 = r4
            goto L31
        L22:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L29
            goto L2c
        L29:
            r7 = r4
            r5 = r6
            goto L31
        L2c:
            r7 = r4
            r5 = r2
            goto L31
        L2f:
            r5 = r6
            r7 = r5
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1.i(int, int, int, int, boolean):int");
    }

    public static boolean s(int i17, int i18, int i19) {
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

    public void A(int i17, int i18) {
        this.f296065l = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        this.f296063j = mode;
        if (mode == 0 && !com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295923c2) {
            this.f296065l = 0;
        }
        this.f296066m = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        this.f296064k = mode2;
        if (mode2 != 0 || com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295923c2) {
            return;
        }
        this.f296066m = 0;
    }

    public void B(int i17, int i18) {
        int h17 = h();
        if (h17 == 0) {
            this.f296055b.o(i17, i18);
            return;
        }
        int i19 = Integer.MIN_VALUE;
        int i27 = Integer.MAX_VALUE;
        int i28 = 0;
        int i29 = Integer.MIN_VALUE;
        int i37 = Integer.MAX_VALUE;
        while (i28 < h17) {
            android.view.View g17 = g(i28);
            android.graphics.Rect rect = this.f296055b.f295940p;
            boolean z17 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams layoutParams = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) g17.getLayoutParams();
            android.graphics.Rect rect2 = layoutParams.f295959b;
            int i38 = h17;
            rect.set((g17.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (g17.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, g17.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, g17.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            int i39 = rect.left;
            if (i39 < i37) {
                i37 = i39;
            }
            int i47 = rect.right;
            if (i47 > i19) {
                i19 = i47;
            }
            int i48 = rect.top;
            if (i48 < i27) {
                i27 = i48;
            }
            int i49 = rect.bottom;
            if (i49 > i29) {
                i29 = i49;
            }
            i28++;
            h17 = i38;
        }
        this.f296055b.f295940p.set(i37, i27, i19, i29);
        android.graphics.Rect rect3 = this.f296055b.f295940p;
        int width = rect3.width() + l() + m();
        int height = rect3.height() + n() + k();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f(this.f296055b, d(i17, width, n3.u0.e(c22949xf1deaba4)), d(i18, height, n3.u0.d(this.f296055b)));
    }

    public void C(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        if (c22949xf1deaba4 == null) {
            this.f296055b = null;
            this.f296054a = null;
            this.f296065l = 0;
            this.f296066m = 0;
        } else {
            this.f296055b = c22949xf1deaba4;
            this.f296054a = c22949xf1deaba4.f295935i;
            this.f296065l = c22949xf1deaba4.getWidth();
            this.f296066m = c22949xf1deaba4.getHeight();
        }
        this.f296063j = 1073741824;
        this.f296064k = 1073741824;
    }

    public void D(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 t1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 t1Var2 = this.f296058e;
        if (t1Var2 != null && t1Var != t1Var2 && t1Var2.f296173e) {
            t1Var2.c();
        }
        this.f296058e = t1Var;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        t1Var.getClass();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x1 x1Var = c22949xf1deaba4.C1;
        x1Var.f296229m.removeCallbacks(x1Var);
        x1Var.f296225f.abortAnimation();
        t1Var.f296170b = c22949xf1deaba4;
        t1Var.f296171c = this;
        int i17 = t1Var.f296169a;
        if (i17 == -1) {
            throw new java.lang.IllegalArgumentException("Invalid target position");
        }
        c22949xf1deaba4.F1.f296179a = i17;
        t1Var.f296173e = true;
        t1Var.f296172d = true;
        t1Var.f296174f = c22949xf1deaba4.f295946t.e(i17);
        t1Var.f296170b.C1.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1.a(android.view.View, int, boolean):void");
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract android.view.View e(int i17);

    public int f(android.view.View view) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295959b.bottom;
    }

    public android.view.View g(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f fVar = this.f296054a;
        if (fVar != null) {
            return fVar.d(i17);
        }
        return null;
    }

    public int h() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f fVar = this.f296054a;
        if (fVar != null) {
            return fVar.e();
        }
        return 0;
    }

    public int j(android.view.View view) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295959b.left;
    }

    public int k() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        if (c22949xf1deaba4 != null) {
            return c22949xf1deaba4.getPaddingBottom();
        }
        return 0;
    }

    public int l() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        if (c22949xf1deaba4 != null) {
            return c22949xf1deaba4.getPaddingLeft();
        }
        return 0;
    }

    public int m() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        if (c22949xf1deaba4 != null) {
            return c22949xf1deaba4.getPaddingRight();
        }
        return 0;
    }

    public int n() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296055b;
        if (c22949xf1deaba4 != null) {
            return c22949xf1deaba4.getPaddingTop();
        }
        return 0;
    }

    public int o(android.view.View view) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).a();
    }

    public int p(android.view.View view) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295959b.right;
    }

    public int q(android.view.View view) {
        return ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295959b.top;
    }

    public void r(android.view.View view, boolean z17, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        if (z17) {
            android.graphics.Rect rect2 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295959b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.f296055b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.f296055b.f295944r;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract android.view.View t(android.view.View view, int i17, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var);

    public abstract void u(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var);

    public void v(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var) {
        int h17 = h();
        while (true) {
            h17--;
            if (h17 < 0) {
                return;
            }
            if (!com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(g(h17)).y()) {
                android.view.View g17 = g(h17);
                x(h17);
                n1Var.g(g17);
            }
        }
    }

    public void w(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 n1Var) {
        java.util.ArrayList arrayList;
        int size = n1Var.f296121a.size();
        int i17 = size - 1;
        while (true) {
            arrayList = n1Var.f296121a;
            if (i17 < 0) {
                break;
            }
            android.view.View view = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1) arrayList.get(i17)).f296236d;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
            if (!K.y()) {
                K.x(false);
                if (K.s()) {
                    this.f296055b.removeDetachedView(view, false);
                }
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b1 b1Var = this.f296055b.S;
                if (b1Var != null) {
                    b1Var.d(K);
                }
                K.x(true);
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K2 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
                K2.f296249t = null;
                K2.f296250u = false;
                K2.f296245p &= -33;
                n1Var.h(K2);
            }
            i17--;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = n1Var.f296122b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f296055b.invalidate();
        }
    }

    public void x(int i17) {
        if (g(i17) != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f fVar = this.f296054a;
            int f17 = fVar.f(i17);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) fVar.f296040a;
            android.view.View childAt = r0Var.f296156a.getChildAt(f17);
            if (childAt == null) {
                return;
            }
            if (fVar.f296041b.f(f17)) {
                fVar.k(childAt);
            }
            r0Var.b(f17);
        }
    }

    public abstract void y(int i17);

    public void z(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        A(android.view.View.MeasureSpec.makeMeasureSpec(c22949xf1deaba4.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(c22949xf1deaba4.getHeight(), 1073741824));
    }
}
