package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.ConstraintLayout */
/* loaded from: classes15.dex */
public class C1073x7e08a787 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f92396d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f92397e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f92398f;

    /* renamed from: g, reason: collision with root package name */
    public final v2.j f92399g;

    /* renamed from: h, reason: collision with root package name */
    public int f92400h;

    /* renamed from: i, reason: collision with root package name */
    public int f92401i;

    /* renamed from: m, reason: collision with root package name */
    public int f92402m;

    /* renamed from: n, reason: collision with root package name */
    public int f92403n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92404o;

    /* renamed from: p, reason: collision with root package name */
    public int f92405p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.c f92406q;

    /* renamed from: r, reason: collision with root package name */
    public int f92407r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f92408s;

    /* renamed from: t, reason: collision with root package name */
    public int f92409t;

    /* renamed from: u, reason: collision with root package name */
    public int f92410u;

    public C1073x7e08a787(android.content.Context context) {
        super(context);
        this.f92396d = new android.util.SparseArray();
        this.f92397e = new java.util.ArrayList(4);
        this.f92398f = new java.util.ArrayList(100);
        this.f92399g = new v2.j();
        this.f92400h = 0;
        this.f92401i = 0;
        this.f92402m = Integer.MAX_VALUE;
        this.f92403n = Integer.MAX_VALUE;
        this.f92404o = true;
        this.f92405p = 7;
        this.f92406q = null;
        this.f92407r = -1;
        this.f92408s = new java.util.HashMap();
        this.f92409t = -1;
        this.f92410u = -1;
        w(null);
    }

    private void w(android.util.AttributeSet attributeSet) {
        v2.j jVar = this.f92399g;
        jVar.X = this;
        this.f92396d.put(getId(), this);
        this.f92406q = null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2714xfdac0702);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2718x12a08201) {
                    this.f92400h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92400h);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2717x27a0c44c) {
                    this.f92401i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92401i);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2716x7c7f1e2f) {
                    this.f92402m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92402m);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2715xf995adde) {
                    this.f92403n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92403n);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2774xb19b36df) {
                    this.f92405p = obtainStyledAttributes.getInt(index, this.f92405p);
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2723xa582f2c8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
                        this.f92406q = cVar;
                        cVar.j(getContext(), resourceId);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        this.f92406q = null;
                    }
                    this.f92407r = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        jVar.f514229w0 = this.f92405p;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i17, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams;
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
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getMaxHeight */
    public int m7174xc96bf8f5() {
        return this.f92403n;
    }

    /* renamed from: getMaxWidth */
    public int m7175x93b79438() {
        return this.f92402m;
    }

    /* renamed from: getMinHeight */
    public int m7176xf7770f63() {
        return this.f92401i;
    }

    /* renamed from: getMinWidth */
    public int m7177x29d8f80a() {
        return this.f92400h;
    }

    /* renamed from: getOptimizationLevel */
    public int m7178xccd7d61() {
        return this.f92399g.f514229w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View m7189x76847043;
        int i28;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i29 = 0;
        while (i29 < childCount) {
            android.view.View childAt = getChildAt(i29);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) childAt.getLayoutParams();
            v2.i iVar = layoutParams.f92433k0;
            if ((childAt.getVisibility() != 8 || layoutParams.X || layoutParams.Y || isInEditMode) && !layoutParams.Z) {
                int i37 = iVar.M + iVar.O;
                int i38 = iVar.N + iVar.P;
                int l17 = iVar.l() + i37;
                int h17 = iVar.h() + i38;
                childAt.layout(i37, i38, l17, h17);
                if ((childAt instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1077x87122d53) && (m7189x76847043 = ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1077x87122d53) childAt).m7189x76847043()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    i28 = childCount;
                    yj0.a.d(m7189x76847043, arrayList.toArray(), "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m7189x76847043.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m7189x76847043, "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m7189x76847043.layout(i37, i38, l17, h17);
                    i29++;
                    childCount = i28;
                }
            }
            i28 = childCount;
            i29++;
            childCount = i28;
        }
        java.util.ArrayList arrayList2 = this.f92397e;
        int size = arrayList2.size();
        if (size > 0) {
            for (int i39 = 0; i39 < size; i39++) {
                ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b) arrayList2.get(i39)).c(this);
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        v2.i v17 = v(view);
        if ((view instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1076xfbb92cd0) && !(v17 instanceof v2.l)) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) view.getLayoutParams();
            v2.l lVar = new v2.l();
            layoutParams.f92433k0 = lVar;
            layoutParams.X = true;
            lVar.A(layoutParams.R);
        }
        if (view instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b abstractC1072x7767bc0b = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b) view;
            abstractC1072x7767bc0b.e();
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) view.getLayoutParams()).Y = true;
            java.util.ArrayList arrayList = this.f92397e;
            if (!arrayList.contains(abstractC1072x7767bc0b)) {
                arrayList.add(abstractC1072x7767bc0b);
            }
        }
        this.f92396d.put(view.getId(), view);
        this.f92404o = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f92396d.remove(view.getId());
        v2.i v17 = v(view);
        this.f92399g.f514273i0.remove(v17);
        v17.D = null;
        this.f92397e.remove(view);
        this.f92398f.remove(v17);
        this.f92404o = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.f92404o = true;
        this.f92409t = -1;
        this.f92410u = -1;
    }

    /* renamed from: setConstraintSet */
    public void m7179xd020a803(p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar) {
        this.f92406q = cVar;
    }

    @Override // android.view.View
    public void setId(int i17) {
        int id6 = getId();
        android.util.SparseArray sparseArray = this.f92396d;
        sparseArray.remove(id6);
        super.setId(i17);
        sparseArray.put(getId(), this);
    }

    /* renamed from: setMaxHeight */
    public void m7180x25bfb969(int i17) {
        if (i17 == this.f92403n) {
            return;
        }
        this.f92403n = i17;
        requestLayout();
    }

    /* renamed from: setMaxWidth */
    public void m7181x8e6ff544(int i17) {
        if (i17 == this.f92402m) {
            return;
        }
        this.f92402m = i17;
        requestLayout();
    }

    /* renamed from: setMinHeight */
    public void m7182x53cacfd7(int i17) {
        if (i17 == this.f92401i) {
            return;
        }
        this.f92401i = i17;
        requestLayout();
    }

    /* renamed from: setMinWidth */
    public void m7183x24915916(int i17) {
        if (i17 == this.f92400h) {
            return;
        }
        this.f92400h = i17;
        requestLayout();
    }

    /* renamed from: setOptimizationLevel */
    public void m7184xe86389d5(int i17) {
        this.f92399g.f514229w0 = i17;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final v2.i u(int i17) {
        v2.j jVar = this.f92399g;
        if (i17 == 0) {
            return jVar;
        }
        android.view.View view = (android.view.View) this.f92396d.get(i17);
        if (view == null && (view = findViewById(i17)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return jVar;
        }
        if (view == null) {
            return null;
        }
        return ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) view.getLayoutParams()).f92433k0;
    }

    public final v2.i v(android.view.View view) {
        if (view == this) {
            return this.f92399g;
        }
        if (view == null) {
            return null;
        }
        return ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) view.getLayoutParams()).f92433k0;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.x(int, int):void");
    }

    public void y(int i17, java.lang.Object obj, java.lang.Object obj2) {
        if (i17 == 0 && (obj instanceof java.lang.String) && (obj2 instanceof java.lang.Integer)) {
            if (this.f92408s == null) {
                this.f92408s = new java.util.HashMap();
            }
            java.lang.String str = (java.lang.String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f92408s.put(str, java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(layoutParams);
    }

    public C1073x7e08a787(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92396d = new android.util.SparseArray();
        this.f92397e = new java.util.ArrayList(4);
        this.f92398f = new java.util.ArrayList(100);
        this.f92399g = new v2.j();
        this.f92400h = 0;
        this.f92401i = 0;
        this.f92402m = Integer.MAX_VALUE;
        this.f92403n = Integer.MAX_VALUE;
        this.f92404o = true;
        this.f92405p = 7;
        this.f92406q = null;
        this.f92407r = -1;
        this.f92408s = new java.util.HashMap();
        this.f92409t = -1;
        this.f92410u = -1;
        w(attributeSet);
    }

    public C1073x7e08a787(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f92396d = new android.util.SparseArray();
        this.f92397e = new java.util.ArrayList(4);
        this.f92398f = new java.util.ArrayList(100);
        this.f92399g = new v2.j();
        this.f92400h = 0;
        this.f92401i = 0;
        this.f92402m = Integer.MAX_VALUE;
        this.f92403n = Integer.MAX_VALUE;
        this.f92404o = true;
        this.f92405p = 7;
        this.f92406q = null;
        this.f92407r = -1;
        this.f92408s = new java.util.HashMap();
        this.f92409t = -1;
        this.f92410u = -1;
        w(attributeSet);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams */
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
        public int f92411J;
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
        public int f92412a;

        /* renamed from: a0, reason: collision with root package name */
        public int f92413a0;

        /* renamed from: b, reason: collision with root package name */
        public int f92414b;

        /* renamed from: b0, reason: collision with root package name */
        public int f92415b0;

        /* renamed from: c, reason: collision with root package name */
        public float f92416c;

        /* renamed from: c0, reason: collision with root package name */
        public int f92417c0;

        /* renamed from: d, reason: collision with root package name */
        public int f92418d;

        /* renamed from: d0, reason: collision with root package name */
        public int f92419d0;

        /* renamed from: e, reason: collision with root package name */
        public int f92420e;

        /* renamed from: e0, reason: collision with root package name */
        public int f92421e0;

        /* renamed from: f, reason: collision with root package name */
        public int f92422f;

        /* renamed from: f0, reason: collision with root package name */
        public int f92423f0;

        /* renamed from: g, reason: collision with root package name */
        public int f92424g;

        /* renamed from: g0, reason: collision with root package name */
        public float f92425g0;

        /* renamed from: h, reason: collision with root package name */
        public int f92426h;

        /* renamed from: h0, reason: collision with root package name */
        public int f92427h0;

        /* renamed from: i, reason: collision with root package name */
        public int f92428i;

        /* renamed from: i0, reason: collision with root package name */
        public int f92429i0;

        /* renamed from: j, reason: collision with root package name */
        public int f92430j;

        /* renamed from: j0, reason: collision with root package name */
        public float f92431j0;

        /* renamed from: k, reason: collision with root package name */
        public int f92432k;

        /* renamed from: k0, reason: collision with root package name */
        public v2.i f92433k0;

        /* renamed from: l, reason: collision with root package name */
        public int f92434l;

        /* renamed from: m, reason: collision with root package name */
        public int f92435m;

        /* renamed from: n, reason: collision with root package name */
        public int f92436n;

        /* renamed from: o, reason: collision with root package name */
        public float f92437o;

        /* renamed from: p, reason: collision with root package name */
        public int f92438p;

        /* renamed from: q, reason: collision with root package name */
        public int f92439q;

        /* renamed from: r, reason: collision with root package name */
        public int f92440r;

        /* renamed from: s, reason: collision with root package name */
        public int f92441s;

        /* renamed from: t, reason: collision with root package name */
        public final int f92442t;

        /* renamed from: u, reason: collision with root package name */
        public int f92443u;

        /* renamed from: v, reason: collision with root package name */
        public final int f92444v;

        /* renamed from: w, reason: collision with root package name */
        public int f92445w;

        /* renamed from: x, reason: collision with root package name */
        public int f92446x;

        /* renamed from: y, reason: collision with root package name */
        public int f92447y;

        /* renamed from: z, reason: collision with root package name */
        public float f92448z;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            int i17;
            this.f92412a = -1;
            this.f92414b = -1;
            this.f92416c = -1.0f;
            this.f92418d = -1;
            this.f92420e = -1;
            this.f92422f = -1;
            this.f92424g = -1;
            this.f92426h = -1;
            this.f92428i = -1;
            this.f92430j = -1;
            this.f92432k = -1;
            this.f92434l = -1;
            this.f92435m = -1;
            this.f92436n = 0;
            this.f92437o = 0.0f;
            this.f92438p = -1;
            this.f92439q = -1;
            this.f92440r = -1;
            this.f92441s = -1;
            this.f92442t = -1;
            this.f92443u = -1;
            this.f92444v = -1;
            this.f92445w = -1;
            this.f92446x = -1;
            this.f92447y = -1;
            this.f92448z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f92411J = 0;
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
            this.f92413a0 = -1;
            this.f92415b0 = -1;
            this.f92417c0 = -1;
            this.f92419d0 = -1;
            this.f92421e0 = -1;
            this.f92423f0 = -1;
            this.f92425g0 = 0.5f;
            this.f92433k0 = new v2.i();
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2714xfdac0702);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i18 = 0; i18 < indexCount; i18++) {
                int index = obtainStyledAttributes.getIndex(i18);
                int i19 = p012xc85e97e9.p071xe6df7747.p072xd1075a44.a.f92465a.get(index);
                switch (i19) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f92435m);
                        this.f92435m = resourceId;
                        if (resourceId == -1) {
                            this.f92435m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f92436n = obtainStyledAttributes.getDimensionPixelSize(index, this.f92436n);
                        break;
                    case 4:
                        float f17 = obtainStyledAttributes.getFloat(index, this.f92437o) % 360.0f;
                        this.f92437o = f17;
                        if (f17 < 0.0f) {
                            this.f92437o = (360.0f - f17) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f92412a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92412a);
                        break;
                    case 6:
                        this.f92414b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f92414b);
                        break;
                    case 7:
                        this.f92416c = obtainStyledAttributes.getFloat(index, this.f92416c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f92418d);
                        this.f92418d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f92418d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f92420e);
                        this.f92420e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f92420e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f92422f);
                        this.f92422f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f92422f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f92424g);
                        this.f92424g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f92424g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f92426h);
                        this.f92426h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f92426h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f92428i);
                        this.f92428i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f92428i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f92430j);
                        this.f92430j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f92430j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f92432k);
                        this.f92432k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f92432k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f92434l);
                        this.f92434l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f92434l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f92438p);
                        this.f92438p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f92438p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f92439q);
                        this.f92439q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f92439q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f92440r);
                        this.f92440r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f92440r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f92441s);
                        this.f92441s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f92441s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f92442t = obtainStyledAttributes.getDimensionPixelSize(index, this.f92442t);
                        break;
                    case 22:
                        this.f92443u = obtainStyledAttributes.getDimensionPixelSize(index, this.f92443u);
                        break;
                    case 23:
                        this.f92444v = obtainStyledAttributes.getDimensionPixelSize(index, this.f92444v);
                        break;
                    case 24:
                        this.f92445w = obtainStyledAttributes.getDimensionPixelSize(index, this.f92445w);
                        break;
                    case 25:
                        this.f92446x = obtainStyledAttributes.getDimensionPixelSize(index, this.f92446x);
                        break;
                    case 26:
                        this.f92447y = obtainStyledAttributes.getDimensionPixelSize(index, this.f92447y);
                        break;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.f92448z = obtainStyledAttributes.getFloat(index, this.f92448z);
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
                            this.f92411J = obtainStyledAttributes.getDimensionPixelSize(index, this.f92411J);
                            break;
                        } catch (java.lang.Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f92411J) == -2) {
                                this.f92411J = -2;
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
                                        if (substring.equalsIgnoreCase(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f)) {
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
                            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
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
            if (this.f92416c == -1.0f && this.f92412a == -1 && this.f92414b == -1) {
                return;
            }
            this.X = true;
            this.U = true;
            this.V = true;
            if (!(this.f92433k0 instanceof v2.l)) {
                this.f92433k0 = new v2.l();
            }
            ((v2.l) this.f92433k0).A(this.R);
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
            throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f92412a = -1;
            this.f92414b = -1;
            this.f92416c = -1.0f;
            this.f92418d = -1;
            this.f92420e = -1;
            this.f92422f = -1;
            this.f92424g = -1;
            this.f92426h = -1;
            this.f92428i = -1;
            this.f92430j = -1;
            this.f92432k = -1;
            this.f92434l = -1;
            this.f92435m = -1;
            this.f92436n = 0;
            this.f92437o = 0.0f;
            this.f92438p = -1;
            this.f92439q = -1;
            this.f92440r = -1;
            this.f92441s = -1;
            this.f92442t = -1;
            this.f92443u = -1;
            this.f92444v = -1;
            this.f92445w = -1;
            this.f92446x = -1;
            this.f92447y = -1;
            this.f92448z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f92411J = 0;
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
            this.f92413a0 = -1;
            this.f92415b0 = -1;
            this.f92417c0 = -1;
            this.f92419d0 = -1;
            this.f92421e0 = -1;
            this.f92423f0 = -1;
            this.f92425g0 = 0.5f;
            this.f92433k0 = new v2.i();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f92412a = -1;
            this.f92414b = -1;
            this.f92416c = -1.0f;
            this.f92418d = -1;
            this.f92420e = -1;
            this.f92422f = -1;
            this.f92424g = -1;
            this.f92426h = -1;
            this.f92428i = -1;
            this.f92430j = -1;
            this.f92432k = -1;
            this.f92434l = -1;
            this.f92435m = -1;
            this.f92436n = 0;
            this.f92437o = 0.0f;
            this.f92438p = -1;
            this.f92439q = -1;
            this.f92440r = -1;
            this.f92441s = -1;
            this.f92442t = -1;
            this.f92443u = -1;
            this.f92444v = -1;
            this.f92445w = -1;
            this.f92446x = -1;
            this.f92447y = -1;
            this.f92448z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.f92411J = 0;
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
            this.f92413a0 = -1;
            this.f92415b0 = -1;
            this.f92417c0 = -1;
            this.f92419d0 = -1;
            this.f92421e0 = -1;
            this.f92423f0 = -1;
            this.f92425g0 = 0.5f;
            this.f92433k0 = new v2.i();
        }
    }
}
