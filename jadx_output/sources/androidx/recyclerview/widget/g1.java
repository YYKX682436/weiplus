package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class g1 extends androidx.recyclerview.widget.p2 implements androidx.recyclerview.widget.RecyclerView.a {
    public java.util.List A;
    public java.util.List B;
    public n3.q D;
    public androidx.recyclerview.widget.b1 E;
    public android.graphics.Rect G;
    public long H;

    /* renamed from: g, reason: collision with root package name */
    public float f12032g;

    /* renamed from: h, reason: collision with root package name */
    public float f12033h;

    /* renamed from: i, reason: collision with root package name */
    public float f12034i;

    /* renamed from: m, reason: collision with root package name */
    public float f12035m;

    /* renamed from: n, reason: collision with root package name */
    public float f12036n;

    /* renamed from: o, reason: collision with root package name */
    public float f12037o;

    /* renamed from: p, reason: collision with root package name */
    public float f12038p;

    /* renamed from: q, reason: collision with root package name */
    public float f12039q;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.a1 f12041s;

    /* renamed from: u, reason: collision with root package name */
    public int f12043u;

    /* renamed from: w, reason: collision with root package name */
    public int f12045w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f12046x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.VelocityTracker f12048z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f12029d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final float[] f12030e = new float[2];

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.k3 f12031f = null;

    /* renamed from: r, reason: collision with root package name */
    public int f12040r = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f12042t = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f12044v = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f12047y = new androidx.recyclerview.widget.u0(this);
    public android.view.View C = null;
    public final androidx.recyclerview.widget.v2 F = new androidx.recyclerview.widget.v0(this);

    public g1(androidx.recyclerview.widget.a1 a1Var) {
        this.f12041s = a1Var;
    }

    public static boolean k(android.view.View view, float f17, float f18, float f19, float f27) {
        return f17 >= f19 && f17 <= f19 + ((float) view.getWidth()) && f18 >= f27 && f18 <= f27 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
    }

    public void d(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f12046x;
        if (recyclerView2 == recyclerView) {
            return;
        }
        androidx.recyclerview.widget.v2 v2Var = this.F;
        if (recyclerView2 != null) {
            recyclerView2.S0(this);
            this.f12046x.U0(v2Var);
            java.util.List list = this.f12046x.H;
            if (list != null) {
                ((java.util.ArrayList) list).remove(this);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f12044v;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.f12041s.clearView(this.f12046x, ((androidx.recyclerview.widget.d1) arrayList.get(0)).f11990h);
            }
            arrayList.clear();
            this.C = null;
            android.view.VelocityTracker velocityTracker = this.f12048z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12048z = null;
            }
            androidx.recyclerview.widget.b1 b1Var = this.E;
            if (b1Var != null) {
                b1Var.f11963d = false;
                this.E = null;
            }
            if (this.D != null) {
                this.D = null;
            }
        }
        this.f12046x = recyclerView;
        if (recyclerView != null) {
            android.content.res.Resources resources = recyclerView.getResources();
            this.f12034i = resources.getDimension(com.tencent.mm.R.dimen.a3d);
            this.f12035m = resources.getDimension(com.tencent.mm.R.dimen.a3c);
            this.f12045w = android.view.ViewConfiguration.get(this.f12046x.getContext()).getScaledTouchSlop();
            this.f12046x.N(this);
            this.f12046x.P(v2Var);
            this.f12046x.O(this);
            this.E = new androidx.recyclerview.widget.b1(this);
            this.D = new n3.q(this.f12046x.getContext(), this.E);
        }
    }

    public final int e(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if ((i17 & 12) == 0) {
            return 0;
        }
        int i18 = this.f12036n > 0.0f ? 8 : 4;
        android.view.VelocityTracker velocityTracker = this.f12048z;
        androidx.recyclerview.widget.a1 a1Var = this.f12041s;
        if (velocityTracker != null && this.f12040r > -1) {
            velocityTracker.computeCurrentVelocity(1000, a1Var.getSwipeVelocityThreshold(this.f12035m));
            float xVelocity = this.f12048z.getXVelocity(this.f12040r);
            float yVelocity = this.f12048z.getYVelocity(this.f12040r);
            int i19 = xVelocity <= 0.0f ? 4 : 8;
            float abs = java.lang.Math.abs(xVelocity);
            if ((i19 & i17) != 0 && i18 == i19 && abs >= a1Var.getSwipeEscapeVelocity(this.f12034i) && abs > java.lang.Math.abs(yVelocity)) {
                return i19;
            }
        }
        float width = this.f12046x.getWidth() * a1Var.getSwipeThreshold(k3Var);
        if ((i17 & i18) == 0 || java.lang.Math.abs(this.f12036n) <= width) {
            return 0;
        }
        return i18;
    }

    public void f(int i17, android.view.MotionEvent motionEvent, int i18) {
        int absoluteMovementFlags;
        android.view.View i19;
        if (this.f12031f == null && i17 == 2 && this.f12042t != 2) {
            androidx.recyclerview.widget.a1 a1Var = this.f12041s;
            if (a1Var.isItemViewSwipeEnabled() && this.f12046x.getScrollState() != 1) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12046x.getLayoutManager();
                int i27 = this.f12040r;
                androidx.recyclerview.widget.k3 k3Var = null;
                if (i27 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i27);
                    float x17 = motionEvent.getX(findPointerIndex) - this.f12032g;
                    float y17 = motionEvent.getY(findPointerIndex) - this.f12033h;
                    float abs = java.lang.Math.abs(x17);
                    float abs2 = java.lang.Math.abs(y17);
                    float f17 = this.f12045w;
                    if ((abs >= f17 || abs2 >= f17) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.getF123307r()) && (i19 = i(motionEvent)) != null))) {
                        k3Var = this.f12046x.w0(i19);
                    }
                }
                if (k3Var == null || (absoluteMovementFlags = (a1Var.getAbsoluteMovementFlags(this.f12046x, k3Var) & 65280) >> 8) == 0) {
                    return;
                }
                float x18 = motionEvent.getX(i18);
                float y18 = motionEvent.getY(i18);
                float f18 = x18 - this.f12032g;
                float f19 = y18 - this.f12033h;
                float abs3 = java.lang.Math.abs(f18);
                float abs4 = java.lang.Math.abs(f19);
                int i28 = this.f12045w;
                if (abs3 >= i28 || abs4 >= i28) {
                    if (abs3 > abs4) {
                        if (f18 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f18 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f19 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f19 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f12037o = 0.0f;
                    this.f12036n = 0.0f;
                    this.f12040r = motionEvent.getPointerId(0);
                    n(k3Var, 1);
                }
            }
        }
    }

    public final int g(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if ((i17 & 3) == 0) {
            return 0;
        }
        int i18 = this.f12037o > 0.0f ? 2 : 1;
        android.view.VelocityTracker velocityTracker = this.f12048z;
        androidx.recyclerview.widget.a1 a1Var = this.f12041s;
        if (velocityTracker != null && this.f12040r > -1) {
            velocityTracker.computeCurrentVelocity(1000, a1Var.getSwipeVelocityThreshold(this.f12035m));
            float xVelocity = this.f12048z.getXVelocity(this.f12040r);
            float yVelocity = this.f12048z.getYVelocity(this.f12040r);
            int i19 = yVelocity <= 0.0f ? 1 : 2;
            float abs = java.lang.Math.abs(yVelocity);
            if ((i19 & i17) != 0 && i19 == i18 && abs >= a1Var.getSwipeEscapeVelocity(this.f12034i) && abs > java.lang.Math.abs(xVelocity)) {
                return i19;
            }
        }
        float height = this.f12046x.getHeight() * a1Var.getSwipeThreshold(k3Var);
        if ((i17 & i18) == 0 || java.lang.Math.abs(this.f12037o) <= height) {
            return 0;
        }
        return i18;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.setEmpty();
    }

    public void h(androidx.recyclerview.widget.k3 k3Var, boolean z17) {
        java.util.List list = this.f12044v;
        for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.d1 d1Var = (androidx.recyclerview.widget.d1) ((java.util.ArrayList) list).get(size);
            if (d1Var.f11990h == k3Var) {
                d1Var.f11996q |= z17;
                if (!d1Var.f11997r) {
                    d1Var.f11992m.cancel();
                }
                ((java.util.ArrayList) list).remove(size);
                return;
            }
        }
    }

    public android.view.View i(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        androidx.recyclerview.widget.k3 k3Var = this.f12031f;
        if (k3Var != null) {
            android.view.View view = k3Var.itemView;
            if (k(view, x17, y17, this.f12038p + this.f12036n, this.f12039q + this.f12037o)) {
                return view;
            }
        }
        java.util.List list = this.f12044v;
        for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.d1 d1Var = (androidx.recyclerview.widget.d1) ((java.util.ArrayList) list).get(size);
            android.view.View view2 = d1Var.f11990h.itemView;
            if (k(view2, x17, y17, d1Var.f11994o, d1Var.f11995p)) {
                return view2;
            }
        }
        return this.f12046x.k0(x17, y17);
    }

    public final void j(float[] fArr) {
        if ((this.f12043u & 12) != 0) {
            fArr[0] = (this.f12038p + this.f12036n) - this.f12031f.itemView.getLeft();
        } else {
            fArr[0] = this.f12031f.itemView.getTranslationX();
        }
        if ((this.f12043u & 3) != 0) {
            fArr[1] = (this.f12039q + this.f12037o) - this.f12031f.itemView.getTop();
        } else {
            fArr[1] = this.f12031f.itemView.getTranslationY();
        }
    }

    public void l(androidx.recyclerview.widget.k3 k3Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        if (!this.f12046x.isLayoutRequested() && this.f12042t == 2) {
            androidx.recyclerview.widget.a1 a1Var = this.f12041s;
            float moveThreshold = a1Var.getMoveThreshold(k3Var);
            int i28 = (int) (this.f12038p + this.f12036n);
            int i29 = (int) (this.f12039q + this.f12037o);
            if (java.lang.Math.abs(i29 - k3Var.itemView.getTop()) >= k3Var.itemView.getHeight() * moveThreshold || java.lang.Math.abs(i28 - k3Var.itemView.getLeft()) >= k3Var.itemView.getWidth() * moveThreshold) {
                java.util.List list = this.A;
                if (list == null) {
                    this.A = new java.util.ArrayList();
                    this.B = new java.util.ArrayList();
                } else {
                    ((java.util.ArrayList) list).clear();
                    ((java.util.ArrayList) this.B).clear();
                }
                int boundingBoxMargin = a1Var.getBoundingBoxMargin();
                int round = java.lang.Math.round(this.f12038p + this.f12036n) - boundingBoxMargin;
                int round2 = java.lang.Math.round(this.f12039q + this.f12037o) - boundingBoxMargin;
                int i37 = boundingBoxMargin * 2;
                int width = k3Var.itemView.getWidth() + round + i37;
                int height = k3Var.itemView.getHeight() + round2 + i37;
                int i38 = (round + width) / 2;
                int i39 = (round2 + height) / 2;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f12046x.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i47 = 0;
                while (i47 < childCount) {
                    android.view.View childAt = layoutManager.getChildAt(i47);
                    if (childAt != k3Var.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        androidx.recyclerview.widget.k3 w07 = this.f12046x.w0(childAt);
                        i18 = round;
                        i19 = round2;
                        if (a1Var.canDropOver(this.f12046x, this.f12031f, w07)) {
                            int abs = java.lang.Math.abs(i38 - ((childAt.getLeft() + childAt.getRight()) / 2));
                            int abs2 = java.lang.Math.abs(i39 - ((childAt.getTop() + childAt.getBottom()) / 2));
                            int i48 = (abs * abs) + (abs2 * abs2);
                            int size = ((java.util.ArrayList) this.A).size();
                            i17 = i38;
                            int i49 = 0;
                            int i57 = 0;
                            while (true) {
                                i27 = width;
                                if (i57 >= size || i48 <= ((java.lang.Integer) ((java.util.ArrayList) this.B).get(i57)).intValue()) {
                                    break;
                                }
                                i49++;
                                i57++;
                                width = i27;
                            }
                            ((java.util.ArrayList) this.A).add(i49, w07);
                            ((java.util.ArrayList) this.B).add(i49, java.lang.Integer.valueOf(i48));
                            i47++;
                            round = i18;
                            round2 = i19;
                            i38 = i17;
                            width = i27;
                        } else {
                            i17 = i38;
                        }
                    } else {
                        i17 = i38;
                        i18 = round;
                        i19 = round2;
                    }
                    i27 = width;
                    i47++;
                    round = i18;
                    round2 = i19;
                    i38 = i17;
                    width = i27;
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) this.A;
                if (arrayList.size() == 0) {
                    return;
                }
                androidx.recyclerview.widget.k3 chooseDropTarget = a1Var.chooseDropTarget(k3Var, arrayList, i28, i29);
                if (chooseDropTarget == null) {
                    ((java.util.ArrayList) this.A).clear();
                    ((java.util.ArrayList) this.B).clear();
                    return;
                }
                int adapterPosition = chooseDropTarget.getAdapterPosition();
                int adapterPosition2 = k3Var.getAdapterPosition();
                if (a1Var.onMove(this.f12046x, k3Var, chooseDropTarget)) {
                    this.f12041s.onMoved(this.f12046x, k3Var, adapterPosition2, chooseDropTarget, adapterPosition, i28, i29);
                }
            }
        }
    }

    public void m(android.view.View view) {
        if (view == this.C) {
            this.C = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (r2 > 0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(androidx.recyclerview.widget.k3 r25, int r26) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g1.n(androidx.recyclerview.widget.k3, int):void");
    }

    public void o(androidx.recyclerview.widget.k3 k3Var) {
        if (this.f12041s.hasDragFlag(this.f12046x, k3Var) && k3Var.itemView.getParent() == this.f12046x) {
            android.view.VelocityTracker velocityTracker = this.f12048z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f12048z = android.view.VelocityTracker.obtain();
            this.f12037o = 0.0f;
            this.f12036n = 0.0f;
            n(k3Var, 2);
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        float f17;
        float f18;
        if (this.f12031f != null) {
            float[] fArr = this.f12030e;
            j(fArr);
            float f19 = fArr[0];
            f18 = fArr[1];
            f17 = f19;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        this.f12041s.onDraw(canvas, recyclerView, this.f12031f, this.f12044v, this.f12042t, f17, f18);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        float f17;
        float f18;
        if (this.f12031f != null) {
            float[] fArr = this.f12030e;
            j(fArr);
            float f19 = fArr[0];
            f18 = fArr[1];
            f17 = f19;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        this.f12041s.onDrawOver(canvas, recyclerView, this.f12031f, this.f12044v, this.f12042t, f17, f18);
    }

    public void p(android.view.MotionEvent motionEvent, int i17, int i18) {
        float x17 = motionEvent.getX(i18);
        float y17 = motionEvent.getY(i18);
        float f17 = x17 - this.f12032g;
        this.f12036n = f17;
        this.f12037o = y17 - this.f12033h;
        if ((i17 & 4) == 0) {
            this.f12036n = java.lang.Math.max(0.0f, f17);
        }
        if ((i17 & 8) == 0) {
            this.f12036n = java.lang.Math.min(0.0f, this.f12036n);
        }
        if ((i17 & 1) == 0) {
            this.f12037o = java.lang.Math.max(0.0f, this.f12037o);
        }
        if ((i17 & 2) == 0) {
            this.f12037o = java.lang.Math.min(0.0f, this.f12037o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        m(view);
        androidx.recyclerview.widget.k3 w07 = this.f12046x.w0(view);
        if (w07 == null) {
            return;
        }
        androidx.recyclerview.widget.k3 k3Var = this.f12031f;
        if (k3Var != null && w07 == k3Var) {
            n(null, 0);
            return;
        }
        h(w07, false);
        if (((java.util.ArrayList) this.f12029d).remove(w07.itemView)) {
            this.f12041s.clearView(this.f12046x, w07);
        }
    }
}
