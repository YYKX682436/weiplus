package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public class ConstraintLayout extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f10863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f10864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f10865f;

    /* renamed from: g, reason: collision with root package name */
    public final v2.j f10866g;

    /* renamed from: h, reason: collision with root package name */
    public int f10867h;

    /* renamed from: i, reason: collision with root package name */
    public int f10868i;

    /* renamed from: m, reason: collision with root package name */
    public int f10869m;

    /* renamed from: n, reason: collision with root package name */
    public int f10870n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10871o;

    /* renamed from: p, reason: collision with root package name */
    public int f10872p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f10873q;

    /* renamed from: r, reason: collision with root package name */
    public int f10874r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f10875s;

    /* renamed from: t, reason: collision with root package name */
    public int f10876t;

    /* renamed from: u, reason: collision with root package name */
    public int f10877u;

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.f10863d = new android.util.SparseArray();
        this.f10864e = new java.util.ArrayList(4);
        this.f10865f = new java.util.ArrayList(100);
        this.f10866g = new v2.j();
        this.f10867h = 0;
        this.f10868i = 0;
        this.f10869m = Integer.MAX_VALUE;
        this.f10870n = Integer.MAX_VALUE;
        this.f10871o = true;
        this.f10872p = 7;
        this.f10873q = null;
        this.f10874r = -1;
        this.f10875s = new java.util.HashMap();
        this.f10876t = -1;
        this.f10877u = -1;
        w(null);
    }

    private void w(android.util.AttributeSet attributeSet) {
        v2.j jVar = this.f10866g;
        jVar.X = this;
        this.f10863d.put(getId(), this);
        this.f10873q = null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f10867h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10867h);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f10868i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10868i);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f10869m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10869m);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f10870n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10870n);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f10872p = obtainStyledAttributes.getInt(index, this.f10872p);
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f10873q = cVar;
                        cVar.j(getContext(), resourceId);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        this.f10873q = null;
                    }
                    this.f10874r = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        jVar.f432696w0 = this.f10872p;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i17, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] split = ((java.lang.String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = java.lang.Integer.parseInt(split[0]);
                        int parseInt2 = java.lang.Integer.parseInt(split[1]);
                        int parseInt3 = java.lang.Integer.parseInt(split[2]);
                        int i18 = (int) ((parseInt / 1080.0f) * width);
                        int i19 = (int) ((parseInt2 / 1920.0f) * height);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(-65536);
                        float f17 = i18;
                        float f18 = i19;
                        float f19 = i18 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f17, f18, f19, f18, paint);
                        float parseInt4 = i19 + ((int) ((java.lang.Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f19, f18, f19, parseInt4, paint);
                        canvas.drawLine(f19, parseInt4, f17, parseInt4, paint);
                        canvas.drawLine(f17, parseInt4, f17, f18, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f17, f18, f19, parseInt4, paint);
                        canvas.drawLine(f17, parseInt4, f19, f18, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f10870n;
    }

    public int getMaxWidth() {
        return this.f10869m;
    }

    public int getMinHeight() {
        return this.f10868i;
    }

    public int getMinWidth() {
        return this.f10867h;
    }

    public int getOptimizationLevel() {
        return this.f10866g.f432696w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View content;
        int i28;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i29 = 0;
        while (i29 < childCount) {
            android.view.View childAt = getChildAt(i29);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            v2.i iVar = layoutParams.f10900k0;
            if ((childAt.getVisibility() != 8 || layoutParams.X || layoutParams.Y || isInEditMode) && !layoutParams.Z) {
                int i37 = iVar.M + iVar.O;
                int i38 = iVar.N + iVar.P;
                int l17 = iVar.l() + i37;
                int h17 = iVar.h() + i38;
                childAt.layout(i37, i38, l17, h17);
                if ((childAt instanceof androidx.constraintlayout.widget.Placeholder) && (content = ((androidx.constraintlayout.widget.Placeholder) childAt).getContent()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    i28 = childCount;
                    yj0.a.d(content, arrayList.toArray(), "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    content.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(content, "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    content.layout(i37, i38, l17, h17);
                    i29++;
                    childCount = i28;
                }
            }
            i28 = childCount;
            i29++;
            childCount = i28;
        }
        java.util.ArrayList arrayList2 = this.f10864e;
        int size = arrayList2.size();
        if (size > 0) {
            for (int i39 = 0; i39 < size; i39++) {
                ((androidx.constraintlayout.widget.ConstraintHelper) arrayList2.get(i39)).c(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:588:0x06b5, code lost:
    
        if (r10.H != 1) goto L341;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0725  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r49, int r50) {
        /*
            Method dump skipped, instructions count: 2945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        v2.i v17 = v(view);
        if ((view instanceof androidx.constraintlayout.widget.Guideline) && !(v17 instanceof v2.l)) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            v2.l lVar = new v2.l();
            layoutParams.f10900k0 = lVar;
            layoutParams.X = true;
            lVar.A(layoutParams.R);
        }
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) view;
            constraintHelper.e();
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).Y = true;
            java.util.ArrayList arrayList = this.f10864e;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f10863d.put(view.getId(), view);
        this.f10871o = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f10863d.remove(view.getId());
        v2.i v17 = v(view);
        this.f10866g.f432740i0.remove(v17);
        v17.D = null;
        this.f10864e.remove(view);
        this.f10865f.remove(v17);
        this.f10871o = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f10871o = true;
        this.f10876t = -1;
        this.f10877u = -1;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f10873q = cVar;
    }

    @Override // android.view.View
    public void setId(int i17) {
        int id6 = getId();
        android.util.SparseArray sparseArray = this.f10863d;
        sparseArray.remove(id6);
        super.setId(i17);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i17) {
        if (i17 == this.f10870n) {
            return;
        }
        this.f10870n = i17;
        requestLayout();
    }

    public void setMaxWidth(int i17) {
        if (i17 == this.f10869m) {
            return;
        }
        this.f10869m = i17;
        requestLayout();
    }

    public void setMinHeight(int i17) {
        if (i17 == this.f10868i) {
            return;
        }
        this.f10868i = i17;
        requestLayout();
    }

    public void setMinWidth(int i17) {
        if (i17 == this.f10867h) {
            return;
        }
        this.f10867h = i17;
        requestLayout();
    }

    public void setOptimizationLevel(int i17) {
        this.f10866g.f432696w0 = i17;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final v2.i u(int i17) {
        v2.j jVar = this.f10866g;
        if (i17 == 0) {
            return jVar;
        }
        android.view.View view = (android.view.View) this.f10863d.get(i17);
        if (view == null && (view = findViewById(i17)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return jVar;
        }
        if (view == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).f10900k0;
    }

    public final v2.i v(android.view.View view) {
        if (view == this) {
            return this.f10866g;
        }
        if (view == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).f10900k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.x(int, int):void");
    }

    public void y(int i17, java.lang.Object obj, java.lang.Object obj2) {
        if (i17 == 0 && (obj instanceof java.lang.String) && (obj2 instanceof java.lang.Integer)) {
            if (this.f10875s == null) {
                this.f10875s = new java.util.HashMap();
            }
            java.lang.String str = (java.lang.String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f10875s.put(str, java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10863d = new android.util.SparseArray();
        this.f10864e = new java.util.ArrayList(4);
        this.f10865f = new java.util.ArrayList(100);
        this.f10866g = new v2.j();
        this.f10867h = 0;
        this.f10868i = 0;
        this.f10869m = Integer.MAX_VALUE;
        this.f10870n = Integer.MAX_VALUE;
        this.f10871o = true;
        this.f10872p = 7;
        this.f10873q = null;
        this.f10874r = -1;
        this.f10875s = new java.util.HashMap();
        this.f10876t = -1;
        this.f10877u = -1;
        w(attributeSet);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f10863d = new android.util.SparseArray();
        this.f10864e = new java.util.ArrayList(4);
        this.f10865f = new java.util.ArrayList(100);
        this.f10866g = new v2.j();
        this.f10867h = 0;
        this.f10868i = 0;
        this.f10869m = Integer.MAX_VALUE;
        this.f10870n = Integer.MAX_VALUE;
        this.f10871o = true;
        this.f10872p = 7;
        this.f10873q = null;
        this.f10874r = -1;
        this.f10875s = new java.util.HashMap();
        this.f10876t = -1;
        this.f10877u = -1;
        w(attributeSet);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public float A;
        public java.lang.String B;
        public final int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;

        /* renamed from: J, reason: collision with root package name */
        public int f10878J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public boolean U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f10879a;

        /* renamed from: a0, reason: collision with root package name */
        public int f10880a0;

        /* renamed from: b, reason: collision with root package name */
        public int f10881b;

        /* renamed from: b0, reason: collision with root package name */
        public int f10882b0;

        /* renamed from: c, reason: collision with root package name */
        public float f10883c;

        /* renamed from: c0, reason: collision with root package name */
        public int f10884c0;

        /* renamed from: d, reason: collision with root package name */
        public int f10885d;

        /* renamed from: d0, reason: collision with root package name */
        public int f10886d0;

        /* renamed from: e, reason: collision with root package name */
        public int f10887e;

        /* renamed from: e0, reason: collision with root package name */
        public int f10888e0;

        /* renamed from: f, reason: collision with root package name */
        public int f10889f;

        /* renamed from: f0, reason: collision with root package name */
        public int f10890f0;

        /* renamed from: g, reason: collision with root package name */
        public int f10891g;

        /* renamed from: g0, reason: collision with root package name */
        public float f10892g0;

        /* renamed from: h, reason: collision with root package name */
        public int f10893h;

        /* renamed from: h0, reason: collision with root package name */
        public int f10894h0;

        /* renamed from: i, reason: collision with root package name */
        public int f10895i;

        /* renamed from: i0, reason: collision with root package name */
        public int f10896i0;

        /* renamed from: j, reason: collision with root package name */
        public int f10897j;

        /* renamed from: j0, reason: collision with root package name */
        public float f10898j0;

        /* renamed from: k, reason: collision with root package name */
        public int f10899k;

        /* renamed from: k0, reason: collision with root package name */
        public v2.i f10900k0;

        /* renamed from: l, reason: collision with root package name */
        public int f10901l;

        /* renamed from: m, reason: collision with root package name */
        public int f10902m;

        /* renamed from: n, reason: collision with root package name */
        public int f10903n;

        /* renamed from: o, reason: collision with root package name */
        public float f10904o;

        /* renamed from: p, reason: collision with root package name */
        public int f10905p;

        /* renamed from: q, reason: collision with root package name */
        public int f10906q;

        /* renamed from: r, reason: collision with root package name */
        public int f10907r;

        /* renamed from: s, reason: collision with root package name */
        public int f10908s;

        /* renamed from: t, reason: collision with root package name */
        public final int f10909t;

        /* renamed from: u, reason: collision with root package name */
        public int f10910u;

        /* renamed from: v, reason: collision with root package name */
        public final int f10911v;

        /* renamed from: w, reason: collision with root package name */
        public int f10912w;

        /* renamed from: x, reason: collision with root package name */
        public int f10913x;

        /* renamed from: y, reason: collision with root package name */
        public int f10914y;

        /* renamed from: z, reason: collision with root package name */
        public float f10915z;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            int i17;
            this.f10879a = -1;
            this.f10881b = -1;
            this.f10883c = -1.0f;
            this.f10885d = -1;
            this.f10887e = -1;
            this.f10889f = -1;
            this.f10891g = -1;
            this.f10893h = -1;
            this.f10895i = -1;
            this.f10897j = -1;
            this.f10899k = -1;
            this.f10901l = -1;
            this.f10902m = -1;
            this.f10903n = 0;
            this.f10904o = 0.0f;
            this.f10905p = -1;
            this.f10906q = -1;
            this.f10907r = -1;
            this.f10908s = -1;
            this.f10909t = -1;
            this.f10910u = -1;
            this.f10911v = -1;
            this.f10912w = -1;
            this.f10913x = -1;
            this.f10914y = -1;
            this.f10915z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f10878J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f10880a0 = -1;
            this.f10882b0 = -1;
            this.f10884c0 = -1;
            this.f10886d0 = -1;
            this.f10888e0 = -1;
            this.f10890f0 = -1;
            this.f10892g0 = 0.5f;
            this.f10900k0 = new v2.i();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i18 = 0; i18 < indexCount; i18++) {
                int index = obtainStyledAttributes.getIndex(i18);
                int i19 = androidx.constraintlayout.widget.a.f10932a.get(index);
                switch (i19) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f10902m);
                        this.f10902m = resourceId;
                        if (resourceId == -1) {
                            this.f10902m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f10903n = obtainStyledAttributes.getDimensionPixelSize(index, this.f10903n);
                        break;
                    case 4:
                        float f17 = obtainStyledAttributes.getFloat(index, this.f10904o) % 360.0f;
                        this.f10904o = f17;
                        if (f17 < 0.0f) {
                            this.f10904o = (360.0f - f17) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f10879a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10879a);
                        break;
                    case 6:
                        this.f10881b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f10881b);
                        break;
                    case 7:
                        this.f10883c = obtainStyledAttributes.getFloat(index, this.f10883c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f10885d);
                        this.f10885d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f10885d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f10887e);
                        this.f10887e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f10887e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f10889f);
                        this.f10889f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f10889f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f10891g);
                        this.f10891g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f10891g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f10893h);
                        this.f10893h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f10893h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f10895i);
                        this.f10895i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f10895i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f10897j);
                        this.f10897j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f10897j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f10899k);
                        this.f10899k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f10899k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f10901l);
                        this.f10901l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f10901l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f10905p);
                        this.f10905p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f10905p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f10906q);
                        this.f10906q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f10906q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f10907r);
                        this.f10907r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f10907r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f10908s);
                        this.f10908s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f10908s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f10909t = obtainStyledAttributes.getDimensionPixelSize(index, this.f10909t);
                        break;
                    case 22:
                        this.f10910u = obtainStyledAttributes.getDimensionPixelSize(index, this.f10910u);
                        break;
                    case 23:
                        this.f10911v = obtainStyledAttributes.getDimensionPixelSize(index, this.f10911v);
                        break;
                    case 24:
                        this.f10912w = obtainStyledAttributes.getDimensionPixelSize(index, this.f10912w);
                        break;
                    case 25:
                        this.f10913x = obtainStyledAttributes.getDimensionPixelSize(index, this.f10913x);
                        break;
                    case 26:
                        this.f10914y = obtainStyledAttributes.getDimensionPixelSize(index, this.f10914y);
                        break;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.f10915z = obtainStyledAttributes.getFloat(index, this.f10915z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f10878J = obtainStyledAttributes.getDimensionPixelSize(index, this.f10878J);
                            break;
                        } catch (java.lang.Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f10878J) == -2) {
                                this.f10878J = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (java.lang.Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.N = java.lang.Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        break;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (java.lang.Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (java.lang.Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.O = java.lang.Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        break;
                    default:
                        switch (i19) {
                            case 44:
                                java.lang.String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i17 = 0;
                                    } else {
                                        java.lang.String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase(androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST)) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i17 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        java.lang.String substring2 = this.B.substring(i17, indexOf2);
                                        java.lang.String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = java.lang.Float.parseFloat(substring2);
                                                float parseFloat2 = java.lang.Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        java.lang.Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        java.lang.Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (java.lang.NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        java.lang.String substring4 = this.B.substring(i17);
                                        if (substring4.length() > 0) {
                                            java.lang.Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.X = false;
            this.U = true;
            this.V = true;
            int i17 = ((android.view.ViewGroup.MarginLayoutParams) this).width;
            if (i17 == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            int i18 = ((android.view.ViewGroup.MarginLayoutParams) this).height;
            if (i18 == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            if (i17 == 0 || i17 == -1) {
                this.U = false;
                if (i17 == 0 && this.H == 1) {
                    ((android.view.ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i18 == 0 || i18 == -1) {
                this.V = false;
                if (i18 == 0 && this.I == 1) {
                    ((android.view.ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f10883c == -1.0f && this.f10879a == -1 && this.f10881b == -1) {
                return;
            }
            this.X = true;
            this.U = true;
            this.V = true;
            if (!(this.f10900k0 instanceof v2.l)) {
                this.f10900k0 = new v2.l();
            }
            ((v2.l) this.f10900k0).A(this.R);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r7) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f10879a = -1;
            this.f10881b = -1;
            this.f10883c = -1.0f;
            this.f10885d = -1;
            this.f10887e = -1;
            this.f10889f = -1;
            this.f10891g = -1;
            this.f10893h = -1;
            this.f10895i = -1;
            this.f10897j = -1;
            this.f10899k = -1;
            this.f10901l = -1;
            this.f10902m = -1;
            this.f10903n = 0;
            this.f10904o = 0.0f;
            this.f10905p = -1;
            this.f10906q = -1;
            this.f10907r = -1;
            this.f10908s = -1;
            this.f10909t = -1;
            this.f10910u = -1;
            this.f10911v = -1;
            this.f10912w = -1;
            this.f10913x = -1;
            this.f10914y = -1;
            this.f10915z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f10878J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f10880a0 = -1;
            this.f10882b0 = -1;
            this.f10884c0 = -1;
            this.f10886d0 = -1;
            this.f10888e0 = -1;
            this.f10890f0 = -1;
            this.f10892g0 = 0.5f;
            this.f10900k0 = new v2.i();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f10879a = -1;
            this.f10881b = -1;
            this.f10883c = -1.0f;
            this.f10885d = -1;
            this.f10887e = -1;
            this.f10889f = -1;
            this.f10891g = -1;
            this.f10893h = -1;
            this.f10895i = -1;
            this.f10897j = -1;
            this.f10899k = -1;
            this.f10901l = -1;
            this.f10902m = -1;
            this.f10903n = 0;
            this.f10904o = 0.0f;
            this.f10905p = -1;
            this.f10906q = -1;
            this.f10907r = -1;
            this.f10908s = -1;
            this.f10909t = -1;
            this.f10910u = -1;
            this.f10911v = -1;
            this.f10912w = -1;
            this.f10913x = -1;
            this.f10914y = -1;
            this.f10915z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f10878J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = true;
            this.V = true;
            this.W = false;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f10880a0 = -1;
            this.f10882b0 = -1;
            this.f10884c0 = -1;
            this.f10886d0 = -1;
            this.f10888e0 = -1;
            this.f10890f0 = -1;
            this.f10892g0 = 0.5f;
            this.f10900k0 = new v2.i();
        }
    }
}
