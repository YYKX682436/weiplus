package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c;

/* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView */
/* loaded from: classes15.dex */
public class C22722xd3be5395 extends android.widget.ListView {
    public static final /* synthetic */ int I1 = 0;
    public final int A;
    public boolean A1;
    public int B;
    public boolean B1;
    public int C;
    public final vl5.q C1;
    public int D;
    public final vl5.r D1;
    public android.view.View[] E;
    public final vl5.n E1;
    public final vl5.k F;
    public boolean F1;
    public float G;
    public float G1;
    public float H;
    public boolean H1;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f294021J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float P;
    public vl5.j Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f294022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f294023e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Point f294024f;

    /* renamed from: g, reason: collision with root package name */
    public int f294025g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f294026h;

    /* renamed from: i, reason: collision with root package name */
    public final android.database.DataSetObserver f294027i;

    /* renamed from: l1, reason: collision with root package name */
    public final float f294028l1;

    /* renamed from: m, reason: collision with root package name */
    public final float f294029m;

    /* renamed from: n, reason: collision with root package name */
    public float f294030n;

    /* renamed from: o, reason: collision with root package name */
    public int f294031o;

    /* renamed from: p, reason: collision with root package name */
    public int f294032p;

    /* renamed from: p0, reason: collision with root package name */
    public vl5.p f294033p0;

    /* renamed from: p1, reason: collision with root package name */
    public float f294034p1;

    /* renamed from: q, reason: collision with root package name */
    public int f294035q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f294036r;

    /* renamed from: s, reason: collision with root package name */
    public int f294037s;

    /* renamed from: t, reason: collision with root package name */
    public int f294038t;

    /* renamed from: u, reason: collision with root package name */
    public int f294039u;

    /* renamed from: v, reason: collision with root package name */
    public vl5.i f294040v;

    /* renamed from: w, reason: collision with root package name */
    public vl5.o f294041w;

    /* renamed from: x, reason: collision with root package name */
    public vl5.s f294042x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.MotionEvent f294043x0;

    /* renamed from: x1, reason: collision with root package name */
    public vl5.h f294044x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f294045y;

    /* renamed from: y0, reason: collision with root package name */
    public int f294046y0;

    /* renamed from: y1, reason: collision with root package name */
    public final boolean f294047y1;

    /* renamed from: z, reason: collision with root package name */
    public int f294048z;

    /* renamed from: z1, reason: collision with root package name */
    public final vl5.m f294049z1;

    public C22722xd3be5395(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        float f17;
        this.f294023e = new android.graphics.Point();
        this.f294024f = new android.graphics.Point();
        this.f294026h = false;
        this.f294029m = 1.0f;
        this.f294030n = 1.0f;
        this.f294036r = false;
        this.f294045y = true;
        this.f294048z = 0;
        this.A = 1;
        this.D = 0;
        this.E = new android.view.View[1];
        this.G = 0.33333334f;
        this.H = 0.33333334f;
        this.P = 0.5f;
        this.Q = new vl5.e(this);
        this.U = 0;
        this.V = false;
        this.W = false;
        this.f294033p0 = null;
        this.f294046y0 = 0;
        this.f294028l1 = 0.25f;
        this.f294034p1 = 0.0f;
        this.f294047y1 = false;
        this.A1 = false;
        this.B1 = false;
        this.C1 = new vl5.q(this, 3, null);
        this.G1 = 0.0f;
        this.H1 = false;
        int i18 = 150;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yl5.a.f544633g, 0, 0);
            this.A = java.lang.Math.max(1, obtainStyledAttributes.getDimensionPixelSize(1, 1));
            boolean z17 = obtainStyledAttributes.getBoolean(16, false);
            this.f294047y1 = z17;
            if (z17) {
                this.f294049z1 = new vl5.m(this);
            }
            float f18 = obtainStyledAttributes.getFloat(8, 1.0f);
            this.f294029m = f18;
            this.f294030n = f18;
            this.f294045y = obtainStyledAttributes.getBoolean(2, this.f294045y);
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, 1.0f - obtainStyledAttributes.getFloat(14, 0.75f)));
            this.f294028l1 = max;
            this.f294036r = max > 0.0f;
            m82183x1fad82ff(obtainStyledAttributes.getFloat(4, this.G));
            this.P = obtainStyledAttributes.getFloat(10, this.P);
            int i19 = obtainStyledAttributes.getInt(11, 150);
            i17 = obtainStyledAttributes.getInt(6, 150);
            if (obtainStyledAttributes.getBoolean(17, true)) {
                boolean z18 = obtainStyledAttributes.getBoolean(12, false);
                int i27 = obtainStyledAttributes.getInt(13, 1);
                boolean z19 = obtainStyledAttributes.getBoolean(15, true);
                int i28 = obtainStyledAttributes.getInt(5, 0);
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                int color = obtainStyledAttributes.getColor(9, -16777216);
                vl5.b bVar = new vl5.b(this, resourceId, i28, i27, resourceId3, resourceId2);
                bVar.f519442n = z18;
                bVar.f519440i = z19;
                bVar.f519502f = color;
                this.f294033p0 = bVar;
                setOnTouchListener(bVar);
            }
            obtainStyledAttributes.recycle();
            i18 = i19;
        } else {
            i17 = 150;
        }
        this.F = new vl5.k(this);
        if (i18 > 0) {
            f17 = 0.5f;
            this.D1 = new vl5.r(this, 0.5f, i18, null);
        } else {
            f17 = 0.5f;
        }
        if (i17 > 0) {
            this.E1 = new vl5.n(this, f17, i17, null);
        }
        this.f294043x0 = android.view.MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.f294027i = new vl5.f(this);
    }

    public final void b() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int min = java.lang.Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int max = java.lang.Math.max(0, getHeaderViewsCount() - firstVisiblePosition); max <= min; max++) {
            android.view.View childAt = getChildAt(max);
            if (childAt != null) {
                c(firstVisiblePosition + max, childAt, false);
            }
        }
    }

    public final void c(int i17, android.view.View view, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int f17 = (i17 == this.f294037s || i17 == this.f294032p || i17 == this.f294035q) ? f(i17, p(i17, view, z17)) : -2;
        if (f17 != layoutParams.height) {
            layoutParams.height = f17;
            view.setLayoutParams(layoutParams);
        }
        if (i17 == this.f294032p || i17 == this.f294035q) {
            int i18 = this.f294037s;
            if (i17 < i18) {
                ((vl5.c) view).m172300xc1f6fb8c(80);
            } else if (i17 > i18) {
                ((vl5.c) view).m172300xc1f6fb8c(48);
            }
        }
        int visibility = view.getVisibility();
        int i19 = (i17 != this.f294037s || this.f294022d == null) ? 0 : 4;
        if (i19 != visibility) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.f294037s < firstVisiblePosition) {
            android.view.View childAt = getChildAt(0);
            setSelectionFromTop(firstVisiblePosition - 1, (childAt != null ? childAt.getTop() : 0) - getPaddingTop());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        float f17;
        super.dispatchDraw(canvas);
        if (this.f294048z != 0) {
            int i17 = this.f294032p;
            if (i17 != this.f294037s) {
                m(i17, canvas);
            }
            int i18 = this.f294035q;
            if (i18 != this.f294032p && i18 != this.f294037s) {
                m(i18, canvas);
            }
        }
        android.view.View view = this.f294022d;
        if (view != null) {
            int width = view.getWidth();
            int height = this.f294022d.getHeight();
            int i19 = this.f294023e.x;
            int width2 = getWidth();
            if (i19 < 0) {
                i19 = -i19;
            }
            if (i19 < width2) {
                float f18 = (width2 - i19) / width2;
                f17 = f18 * f18;
            } else {
                f17 = 0.0f;
            }
            int i27 = (int) (this.f294030n * 255.0f * f17);
            canvas.save();
            canvas.translate(r2.x, r2.y);
            canvas.clipRect(0, 0, width, height);
            canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i27, 31);
            this.f294022d.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public final int f(int i17, int i18) {
        boolean z17 = this.f294036r && this.f294032p != this.f294035q;
        int i19 = this.B;
        int i27 = this.A;
        int i28 = i19 - i27;
        int i29 = (int) (this.f294034p1 * i28);
        int i37 = this.f294037s;
        return i17 == i37 ? i37 == this.f294032p ? z17 ? i29 + i27 : i19 : i37 == this.f294035q ? i19 - i29 : i27 : i17 == this.f294032p ? z17 ? i18 + i29 : i18 + i28 : i17 == this.f294035q ? (i18 + i28) - i29 : i18;
    }

    public void g() {
        if (this.f294048z == 4) {
            this.F.b(true);
            h();
            this.f294037s = -1;
            this.f294032p = -1;
            this.f294035q = -1;
            this.f294031o = -1;
            b();
            if (this.W) {
                this.f294048z = 3;
            } else {
                this.f294048z = 0;
            }
        }
    }

    /* renamed from: getFloatAlpha */
    public float m82178xaffa7058() {
        return this.f294030n;
    }

    /* renamed from: getInputAdapter */
    public android.widget.ListAdapter m82179x5729fe9b() {
        vl5.h hVar = this.f294044x1;
        if (hVar == null) {
            return null;
        }
        return hVar.f519459d;
    }

    public final void h() {
        android.view.View view = this.f294022d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            vl5.p pVar = this.f294033p0;
            if (pVar != null) {
                android.view.View view2 = this.f294022d;
                vl5.u uVar = (vl5.u) pVar;
                uVar.getClass();
                if (view2 instanceof android.widget.ImageView) {
                    ((android.widget.ImageView) view2).setImageDrawable(null);
                }
                com.p314xaae8f345.mm.ui.yk.c("MicroMsg.SimpleFloatViewManager", "bitmap recycle %s", uVar.f519500d.toString());
                uVar.f519500d.recycle();
                uVar.f519500d = null;
            }
            this.f294022d = null;
            invalidate();
        }
    }

    public final void i() {
        this.f294046y0 = 0;
        this.W = false;
        if (this.f294048z == 3) {
            this.f294048z = 0;
        }
        this.f294030n = this.f294029m;
        this.H1 = false;
        vl5.q qVar = this.C1;
        qVar.f519480a.clear();
        qVar.f519481b.clear();
    }

    public final void j(int i17, android.view.View view, boolean z17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        boolean z18;
        int i37;
        int i38;
        this.A1 = true;
        vl5.p pVar = this.f294033p0;
        android.graphics.Point point = this.f294023e;
        if (pVar != null) {
            this.f294024f.set(this.R, this.S);
            vl5.b bVar = (vl5.b) this.f294033p0;
            if (bVar.f519442n && bVar.f519443o) {
                bVar.G = point.x;
            }
        }
        int i39 = point.x;
        int i47 = point.y;
        int paddingLeft = getPaddingLeft();
        int i48 = this.U;
        if ((i48 & 1) == 0 && i39 > paddingLeft) {
            point.x = paddingLeft;
        } else if ((i48 & 2) == 0 && i39 < paddingLeft) {
            point.x = paddingLeft;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int paddingTop = getPaddingTop();
        if (firstVisiblePosition < headerViewsCount) {
            paddingTop = getChildAt((headerViewsCount - firstVisiblePosition) - 1).getBottom();
        }
        if ((this.U & 8) == 0 && firstVisiblePosition <= (i38 = this.f294037s)) {
            paddingTop = java.lang.Math.max(getChildAt(i38 - firstVisiblePosition).getTop(), paddingTop);
        }
        int height = getHeight() - getPaddingBottom();
        if (lastVisiblePosition >= (getCount() - footerViewsCount) - 1) {
            height = getChildAt(((getCount() - footerViewsCount) - 1) - firstVisiblePosition).getBottom();
        }
        if ((this.U & 4) == 0 && lastVisiblePosition >= (i37 = this.f294037s)) {
            height = java.lang.Math.min(getChildAt(i37 - firstVisiblePosition).getBottom(), height);
        }
        if (i47 < paddingTop) {
            point.y = paddingTop;
        } else {
            int i49 = this.B;
            if (i47 + i49 > height) {
                point.y = height - i49;
            }
        }
        this.f294025g = point.y + this.C;
        int i57 = this.f294032p;
        int i58 = this.f294035q;
        int firstVisiblePosition2 = getFirstVisiblePosition();
        int i59 = this.f294032p;
        android.view.View childAt = getChildAt(i59 - firstVisiblePosition2);
        if (childAt == null) {
            i59 = (getChildCount() / 2) + firstVisiblePosition2;
            childAt = getChildAt(i59 - firstVisiblePosition2);
        }
        int top = childAt.getTop();
        int height2 = childAt.getHeight();
        int r17 = r(i59, top);
        int dividerHeight = getDividerHeight();
        if (this.f294025g < r17) {
            while (i59 >= 0) {
                i59--;
                int q17 = q(i59);
                if (i59 == 0) {
                    i18 = (top - dividerHeight) - q17;
                    i19 = i18;
                    break;
                } else {
                    top -= q17 + dividerHeight;
                    i19 = r(i59, top);
                    if (this.f294025g >= i19) {
                        break;
                    } else {
                        r17 = i19;
                    }
                }
            }
            i19 = r17;
        } else {
            int count = getCount();
            while (i59 < count) {
                if (i59 == count - 1) {
                    i18 = top + dividerHeight + height2;
                    i19 = i18;
                    break;
                }
                top += height2 + dividerHeight;
                int i66 = i59 + 1;
                int q18 = q(i66);
                int r18 = r(i66, top);
                if (this.f294025g < r18) {
                    i19 = r18;
                    break;
                } else {
                    i59 = i66;
                    height2 = q18;
                    r17 = r18;
                }
            }
            i19 = r17;
        }
        int headerViewsCount2 = getHeaderViewsCount();
        int footerViewsCount2 = getFooterViewsCount();
        int i67 = this.f294032p;
        int i68 = this.f294035q;
        float f17 = this.f294034p1;
        if (this.f294036r) {
            int abs = java.lang.Math.abs(i19 - r17);
            int i69 = this.f294025g;
            if (i69 < i19) {
                int i76 = r17;
                r17 = i19;
                i19 = i76;
            }
            int i77 = (int) (this.f294028l1 * 0.5f * abs);
            float f18 = i77;
            int i78 = i19 + i77;
            int i79 = r17 - i77;
            if (i69 < i78) {
                this.f294032p = i59 - 1;
                this.f294035q = i59;
                this.f294034p1 = ((i78 - i69) * 0.5f) / f18;
            } else if (i69 < i79) {
                this.f294032p = i59;
                this.f294035q = i59;
            } else {
                this.f294032p = i59;
                this.f294035q = i59 + 1;
                this.f294034p1 = (((r17 - i69) / f18) + 1.0f) * 0.5f;
            }
        } else {
            this.f294032p = i59;
            this.f294035q = i59;
        }
        if (this.f294032p < headerViewsCount2) {
            this.f294032p = headerViewsCount2;
            this.f294035q = headerViewsCount2;
            i59 = headerViewsCount2;
        } else if (this.f294035q >= getCount() - footerViewsCount2) {
            i59 = (getCount() - footerViewsCount2) - 1;
            this.f294032p = i59;
            this.f294035q = i59;
        }
        boolean z19 = (this.f294032p == i67 && this.f294035q == i68 && java.lang.Math.abs(this.f294034p1 - f17) <= 0.0f) ? false : true;
        int i86 = this.f294031o;
        if (i59 != i86) {
            vl5.i iVar = this.f294040v;
            if (iVar != null) {
                int i87 = i86 - headerViewsCount2;
                int i88 = i59 - headerViewsCount2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13317xbf909954 c13317xbf909954 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h3) iVar).f179584a;
                c13317xbf909954.f179366h.vibrate(50L);
                la5.c cVar = la5.b.f399133a;
                if (cVar.g(true)) {
                    if (c13317xbf909954.f179367i == -1) {
                        c13317xbf909954.f179367i = i87;
                    }
                    m22.i iVar2 = (m22.i) c13317xbf909954.f179362d.getItem(i88);
                    if (i87 > i88) {
                        if (i88 >= c13317xbf909954.f179367i) {
                            i12.k kVar = c13317xbf909954.f179362d;
                            iVar2 = (m22.i) kVar.getItem(java.lang.Math.min(i88 + 1, kVar.getCount() - 1));
                        }
                        cVar.i(c13317xbf909954.f179363e, c13317xbf909954.m7460x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfa, iVar2.c()));
                    } else {
                        if (i88 <= c13317xbf909954.f179367i) {
                            z18 = true;
                            iVar2 = (m22.i) c13317xbf909954.f179362d.getItem(java.lang.Math.max(i88 - 1, 0));
                        } else {
                            z18 = true;
                        }
                        cVar.i(c13317xbf909954.f179363e, c13317xbf909954.m7460x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nf_, iVar2.c()));
                        this.f294031o = i59;
                        z19 = z18;
                    }
                }
            }
            z18 = true;
            this.f294031o = i59;
            z19 = z18;
        }
        if (z19) {
            b();
            int o17 = o(i17);
            int height3 = view.getHeight();
            int f19 = f(i17, o17);
            int i89 = this.f294037s;
            if (i17 != i89) {
                i27 = height3 - o17;
                i28 = f19 - o17;
            } else {
                i27 = height3;
                i28 = f19;
            }
            int i96 = this.B;
            int i97 = this.f294032p;
            if (i89 != i97 && i89 != this.f294035q) {
                i96 -= this.A;
            }
            if (i17 <= i57) {
                if (i17 > i97) {
                    i29 = (i96 - i28) + 0;
                    setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                    layoutChildren();
                }
                i29 = 0;
                setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                layoutChildren();
            } else {
                if (i17 == i58) {
                    if (i17 <= i97) {
                        i27 -= i96;
                    } else if (i17 == this.f294035q) {
                        i29 = (height3 - f19) + 0;
                    }
                    i29 = 0 + i27;
                } else if (i17 <= i97) {
                    i29 = 0 - i96;
                } else {
                    if (i17 == this.f294035q) {
                        i29 = 0 - i28;
                    }
                    i29 = 0;
                }
                setSelectionFromTop(i17, (view.getTop() + i29) - getPaddingTop());
                layoutChildren();
            }
        }
        if (z19 || z17) {
            invalidate();
        }
        this.A1 = false;
    }

    public final void k(boolean z17) {
        int firstVisiblePosition = getFirstVisiblePosition() + (getChildCount() / 2);
        android.view.View childAt = getChildAt(getChildCount() / 2);
        if (childAt == null) {
            return;
        }
        j(firstVisiblePosition, childAt, z17);
    }

    public final void l(int i17) {
        this.f294048z = 1;
        vl5.s sVar = this.f294042x;
        if (sVar != null) {
            sVar.mo54813xc84af884(i17);
        }
        h();
        d();
        this.f294037s = -1;
        this.f294032p = -1;
        this.f294035q = -1;
        this.f294031o = -1;
        if (this.W) {
            this.f294048z = 3;
        } else {
            this.f294048z = 0;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        super.layoutChildren();
        android.view.View view = this.f294022d;
        if (view != null) {
            if (view.isLayoutRequested() && !this.f294026h) {
                s();
            }
            android.view.View view2 = this.f294022d;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.f294022d.getMeasuredHeight());
            this.f294026h = false;
        }
    }

    public final void m(int i17, android.graphics.Canvas canvas) {
        android.view.ViewGroup viewGroup;
        int i18;
        int i19;
        android.graphics.drawable.Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider == null || dividerHeight == 0 || (viewGroup = (android.view.ViewGroup) getChildAt(i17 - getFirstVisiblePosition())) == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = viewGroup.getChildAt(0).getHeight();
        if (i17 > this.f294037s) {
            i19 = viewGroup.getTop() + height;
            i18 = dividerHeight + i19;
        } else {
            int bottom = viewGroup.getBottom() - height;
            int i27 = bottom - dividerHeight;
            i18 = bottom;
            i19 = i27;
        }
        canvas.save();
        canvas.clipRect(paddingLeft, i19, width, i18);
        divider.setBounds(paddingLeft, i19, width, i18);
        divider.draw(canvas);
        canvas.restore();
    }

    public final void n() {
        int i17;
        this.f294048z = 2;
        if (this.f294041w != null && (i17 = this.f294031o) >= 0 && i17 < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.f294041w.a(this.f294037s - headerViewsCount, this.f294031o - headerViewsCount);
        }
        h();
        d();
        this.f294037s = -1;
        this.f294032p = -1;
        this.f294035q = -1;
        this.f294031o = -1;
        b();
        if (this.W) {
            this.f294048z = 3;
        } else {
            this.f294048z = 0;
        }
    }

    public final int o(int i17) {
        android.view.View view;
        if (i17 == this.f294037s) {
            return 0;
        }
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        if (childAt != null) {
            return p(i17, childAt, false);
        }
        vl5.q qVar = this.C1;
        int i18 = qVar.f519480a.get(i17, -1);
        if (i18 != -1) {
            return i18;
        }
        android.widget.ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i17);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.E.length) {
            this.E = new android.view.View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            android.view.View view2 = this.E[itemViewType];
            if (view2 == null) {
                view = adapter.getView(i17, null, this);
                this.E[itemViewType] = view;
            } else {
                view = adapter.getView(i17, view2, this);
            }
        } else {
            view = adapter.getView(i17, null, this);
        }
        int p17 = p(i17, view, true);
        android.util.SparseIntArray sparseIntArray = qVar.f519480a;
        int i19 = sparseIntArray.get(i17, -1);
        if (i19 != p17) {
            java.util.ArrayList arrayList = qVar.f519481b;
            if (i19 != -1) {
                arrayList.remove(java.lang.Integer.valueOf(i17));
            } else if (sparseIntArray.size() == qVar.f519482c) {
                sparseIntArray.delete(((java.lang.Integer) arrayList.remove(0)).intValue());
            }
            sparseIntArray.put(i17, p17);
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return p17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f294047y1) {
            vl5.m mVar = this.f294049z1;
            if (mVar.f519473e) {
                java.lang.StringBuilder sb6 = mVar.f519469a;
                sb6.append("<DSLVState>\n");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = mVar.f519474f;
                int childCount = c22722xd3be5395.getChildCount();
                int firstVisiblePosition = c22722xd3be5395.getFirstVisiblePosition();
                sb6.append("    <Positions>");
                for (int i17 = 0; i17 < childCount; i17++) {
                    sb6.append(firstVisiblePosition + i17);
                    sb6.append(",");
                }
                sb6.append("</Positions>\n");
                sb6.append("    <Tops>");
                for (int i18 = 0; i18 < childCount; i18++) {
                    sb6.append(c22722xd3be5395.getChildAt(i18).getTop());
                    sb6.append(",");
                }
                sb6.append("</Tops>\n");
                sb6.append("    <Bottoms>");
                for (int i19 = 0; i19 < childCount; i19++) {
                    sb6.append(c22722xd3be5395.getChildAt(i19).getBottom());
                    sb6.append(",");
                }
                sb6.append("</Bottoms>\n");
                sb6.append("    <FirstExpPos>");
                sb6.append(c22722xd3be5395.f294032p);
                sb6.append("</FirstExpPos>\n");
                sb6.append("    <FirstExpBlankHeight>");
                sb6.append(c22722xd3be5395.q(c22722xd3be5395.f294032p) - c22722xd3be5395.o(c22722xd3be5395.f294032p));
                sb6.append("</FirstExpBlankHeight>\n");
                sb6.append("    <SecondExpPos>");
                sb6.append(c22722xd3be5395.f294035q);
                sb6.append("</SecondExpPos>\n");
                sb6.append("    <SecondExpBlankHeight>");
                sb6.append(c22722xd3be5395.q(c22722xd3be5395.f294035q) - c22722xd3be5395.o(c22722xd3be5395.f294035q));
                sb6.append("</SecondExpBlankHeight>\n");
                sb6.append("    <SrcPos>");
                sb6.append(c22722xd3be5395.f294037s);
                sb6.append("</SrcPos>\n");
                sb6.append("    <SrcHeight>");
                sb6.append(c22722xd3be5395.B + c22722xd3be5395.getDividerHeight());
                sb6.append("</SrcHeight>\n");
                sb6.append("    <ViewHeight>");
                sb6.append(c22722xd3be5395.getHeight());
                sb6.append("</ViewHeight>\n");
                sb6.append("    <LastY>");
                sb6.append(c22722xd3be5395.T);
                sb6.append("</LastY>\n");
                sb6.append("    <FloatY>");
                sb6.append(c22722xd3be5395.f294025g);
                sb6.append("</FloatY>\n");
                sb6.append("    <ShuffleEdges>");
                for (int i27 = 0; i27 < childCount; i27++) {
                    sb6.append(c22722xd3be5395.r(firstVisiblePosition + i27, c22722xd3be5395.getChildAt(i27).getTop()));
                    sb6.append(",");
                }
                sb6.append("</ShuffleEdges>\n");
                sb6.append("</DSLVState>\n");
                int i28 = mVar.f519471c + 1;
                mVar.f519471c = i28;
                if (i28 > 1000) {
                    mVar.a();
                    mVar.f519471c = 0;
                }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (!this.f294045y) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        this.V = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f294048z != 0) {
                this.B1 = true;
                return true;
            }
            this.W = true;
        }
        if (this.f294022d != null) {
            z17 = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.H1 = true;
                z17 = true;
            } else {
                z17 = false;
            }
            if (action == 1 || action == 3) {
                i();
            } else if (z17) {
                this.f294046y0 = 1;
            } else {
                this.f294046y0 = 2;
            }
        }
        if (action == 1 || action == 3) {
            this.W = false;
        }
        return z17;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.view.View view = this.f294022d;
        if (view != null) {
            if (view.isLayoutRequested()) {
                s();
            }
            this.f294026h = true;
        }
        this.D = i17;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        y();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (this.B1) {
            this.B1 = false;
            return false;
        }
        if (!this.f294045y) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z18 = this.V;
        this.V = false;
        if (!z18) {
            v(motionEvent);
        }
        int i17 = this.f294048z;
        if (i17 != 4) {
            if (i17 == 0 && super.onTouchEvent(motionEvent)) {
                z17 = true;
            }
            int action = motionEvent.getAction() & 255;
            if (action == 1 || action == 3) {
                i();
            } else if (z17) {
                this.f294046y0 = 1;
            }
            return z17;
        }
        int action2 = motionEvent.getAction() & 255;
        if (action2 == 1) {
            if (this.f294048z == 4) {
                this.F1 = false;
                x(false, 0.0f);
            }
            i();
            return true;
        }
        if (action2 != 2) {
            if (action2 != 3) {
                return true;
            }
            if (this.f294048z == 4) {
                g();
            }
            i();
            return true;
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        android.graphics.Point point = this.f294023e;
        point.x = x17 - this.f294038t;
        point.y = y17 - this.f294039u;
        k(true);
        int min = java.lang.Math.min(y17, this.f294025g + this.C);
        int max = java.lang.Math.max(y17, this.f294025g - this.C);
        vl5.k kVar = this.F;
        boolean z19 = kVar.f519467m;
        int i18 = z19 ? kVar.f519465h : -1;
        int i19 = this.T;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = kVar.f519468n;
        if (min > i19 && min > this.f294021J && i18 != 1) {
            if (i18 != -1) {
                kVar.b(true);
            }
            if (kVar.f519467m) {
                return true;
            }
            kVar.f519461d = false;
            kVar.f519467m = true;
            kVar.f519462e = android.os.SystemClock.uptimeMillis();
            kVar.f519465h = 1;
            c22722xd3be5395.post(kVar);
            return true;
        }
        if (max >= i19 || max >= this.I || i18 == 0) {
            if (max < this.I || min > this.f294021J || !z19) {
                return true;
            }
            kVar.b(true);
            return true;
        }
        if (i18 != -1) {
            kVar.b(true);
        }
        if (kVar.f519467m) {
            return true;
        }
        kVar.f519461d = false;
        kVar.f519467m = true;
        kVar.f519462e = android.os.SystemClock.uptimeMillis();
        kVar.f519465h = 0;
        c22722xd3be5395.post(kVar);
        return true;
    }

    public final int p(int i17, android.view.View view, boolean z17) {
        int i18;
        if (i17 == this.f294037s) {
            return 0;
        }
        if (i17 >= getHeaderViewsCount() && i17 < getCount() - getFooterViewsCount()) {
            view = ((android.view.ViewGroup) view).getChildAt(0);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i18 = layoutParams.height) > 0) {
            return i18;
        }
        int height = view.getHeight();
        if (height != 0 && !z17) {
            return height;
        }
        t(view);
        return view.getMeasuredHeight();
    }

    public final int q(int i17) {
        android.view.View childAt = getChildAt(i17 - getFirstVisiblePosition());
        return childAt != null ? childAt.getHeight() : f(i17, o(i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r8 <= r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.getHeaderViewsCount()
            int r1 = r7.getFooterViewsCount()
            if (r8 <= r0) goto L65
            int r0 = r7.getCount()
            int r0 = r0 - r1
            if (r8 < r0) goto L12
            goto L65
        L12:
            int r0 = r7.getDividerHeight()
            int r1 = r7.B
            int r2 = r7.A
            int r1 = r1 - r2
            int r2 = r7.o(r8)
            int r3 = r7.q(r8)
            int r4 = r7.f294035q
            int r5 = r7.f294037s
            if (r4 > r5) goto L3e
            if (r8 != r4) goto L38
            int r6 = r7.f294032p
            if (r6 == r4) goto L38
            if (r8 != r5) goto L35
            int r9 = r9 + r3
            int r1 = r7.B
            goto L3c
        L35:
            int r3 = r3 - r2
            int r9 = r9 + r3
            goto L3c
        L38:
            if (r8 <= r4) goto L4e
            if (r8 > r5) goto L4e
        L3c:
            int r9 = r9 - r1
            goto L4e
        L3e:
            if (r8 <= r5) goto L46
            int r6 = r7.f294032p
            if (r8 > r6) goto L46
            int r9 = r9 + r1
            goto L4e
        L46:
            if (r8 != r4) goto L4e
            int r1 = r7.f294032p
            if (r1 == r4) goto L4e
            int r3 = r3 - r2
            int r9 = r9 + r3
        L4e:
            if (r8 > r5) goto L5e
            int r1 = r7.B
            int r1 = r1 - r0
            int r8 = r8 + (-1)
            int r8 = r7.o(r8)
            int r1 = r1 - r8
            int r1 = r1 / 2
            int r9 = r9 + r1
            goto L65
        L5e:
            int r2 = r2 - r0
            int r8 = r7.B
            int r2 = r2 - r8
            int r2 = r2 / 2
            int r9 = r9 + r2
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395.r(int, int):int");
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.A1) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        android.view.View view = this.f294022d;
        if (view != null) {
            t(view);
            int measuredHeight = this.f294022d.getMeasuredHeight();
            this.B = measuredHeight;
            this.C = measuredHeight / 2;
        }
    }

    /* renamed from: setDragEnabled */
    public void m82180x5f152dab(boolean z17) {
        this.f294045y = z17;
    }

    /* renamed from: setDragListener */
    public void m82181x71eb6f8a(vl5.i iVar) {
        this.f294040v = iVar;
    }

    /* renamed from: setDragScrollProfile */
    public void m82182x48fc1506(vl5.j jVar) {
        if (jVar != null) {
            this.Q = jVar;
        }
    }

    /* renamed from: setDragScrollStart */
    public void m82183x1fad82ff(float f17) {
        if (f17 > 0.5f) {
            this.H = 0.5f;
        } else {
            this.H = f17;
        }
        if (f17 > 0.5f) {
            this.G = 0.5f;
        } else {
            this.G = f17;
        }
        if (getHeight() != 0) {
            y();
        }
    }

    /* renamed from: setDragSortListener */
    public void m82184x51d5f048(vl5.l lVar) {
        m82185x4578645(lVar);
        m82181x71eb6f8a(lVar);
        m82189xa7c1925a(lVar);
    }

    /* renamed from: setDropListener */
    public void m82185x4578645(vl5.o oVar) {
        this.f294041w = oVar;
    }

    /* renamed from: setFloatAlpha */
    public void m82186xde1ebe64(float f17) {
        this.f294030n = f17;
    }

    /* renamed from: setFloatViewManager */
    public void m82187x7473c9ce(vl5.p pVar) {
        this.f294033p0 = pVar;
    }

    /* renamed from: setMaxScrollSpeed */
    public void m82188xbac31278(float f17) {
        this.P = f17;
    }

    /* renamed from: setRemoveListener */
    public void m82189xa7c1925a(vl5.s sVar) {
        this.f294042x = sVar;
    }

    public final void t(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.D, getListPaddingLeft() + getListPaddingRight(), layoutParams.width);
        int i17 = layoutParams.height;
        view.measure(childMeasureSpec, i17 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void u(int i17, float f17) {
        int i18 = this.f294048z;
        if (i18 == 0 || i18 == 4) {
            if (i18 == 0) {
                int headerViewsCount = getHeaderViewsCount() + i17;
                this.f294037s = headerViewsCount;
                this.f294032p = headerViewsCount;
                this.f294035q = headerViewsCount;
                this.f294031o = headerViewsCount;
                android.view.View childAt = getChildAt(headerViewsCount - getFirstVisiblePosition());
                if (childAt != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f294048z = 1;
            this.G1 = f17;
            if (this.W) {
                int i19 = this.f294046y0;
                android.view.MotionEvent motionEvent = this.f294043x0;
                if (i19 == 1) {
                    super.onTouchEvent(motionEvent);
                } else if (i19 == 2) {
                    super.onInterceptTouchEvent(motionEvent);
                }
            }
            vl5.r rVar = this.D1;
            if (rVar == null) {
                l(i17);
                return;
            }
            rVar.f519491d = android.os.SystemClock.uptimeMillis();
            rVar.f519498n = false;
            rVar.c();
            rVar.f519499o.post(rVar);
        }
    }

    public final void v(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.T = this.S;
        }
        this.R = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        this.S = y17;
        if (action == 0) {
            this.T = y17;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
    }

    public boolean w(int i17, int i18, int i19, int i27) {
        vl5.p pVar;
        android.widget.ImageView imageView;
        if (!this.W || (pVar = this.f294033p0) == null) {
            return false;
        }
        vl5.u uVar = (vl5.u) pVar;
        android.widget.ListView listView = uVar.f519503g;
        android.view.View childAt = listView.getChildAt((i17 + listView.getHeaderViewsCount()) - listView.getFirstVisiblePosition());
        if (childAt == null) {
            imageView = null;
        } else {
            childAt.setPressed(false);
            childAt.setDrawingCacheEnabled(true);
            android.graphics.Bitmap drawingCache = childAt.getDrawingCache();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(drawingCache);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/sortlist/SimpleFloatViewManager", "onCreateFloatView", "(I)Landroid/view/View;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/sortlist/SimpleFloatViewManager", "onCreateFloatView", "(I)Landroid/view/View;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;");
            uVar.f519500d = createBitmap;
            childAt.setDrawingCacheEnabled(false);
            if (uVar.f519501e == null) {
                uVar.f519501e = new android.widget.ImageView(listView.getContext());
            }
            uVar.f519501e.setBackgroundColor(uVar.f519502f);
            uVar.f519501e.setPadding(0, 0, 0, 0);
            uVar.f519501e.setImageBitmap(uVar.f519500d);
            uVar.f519501e.setLayoutParams(new android.view.ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
            imageView = uVar.f519501e;
        }
        if (imageView == null || this.f294048z != 0 || !this.W || this.f294022d != null || !this.f294045y) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int headerViewsCount = i17 + getHeaderViewsCount();
        this.f294032p = headerViewsCount;
        this.f294035q = headerViewsCount;
        this.f294037s = headerViewsCount;
        this.f294031o = headerViewsCount;
        this.f294048z = 4;
        this.U = 0 | i18;
        this.f294022d = imageView;
        s();
        this.f294038t = i19;
        this.f294039u = i27;
        int i28 = this.S;
        android.graphics.Point point = this.f294023e;
        point.x = this.R - i19;
        point.y = i28 - i27;
        android.view.View childAt2 = getChildAt(this.f294037s - getFirstVisiblePosition());
        if (childAt2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(childAt2, arrayList2.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(childAt2, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f294047y1) {
            vl5.m mVar = this.f294049z1;
            mVar.f519469a.append("<DSLVStates>\n");
            mVar.f519472d = 0;
            mVar.f519473e = true;
        }
        int i29 = this.f294046y0;
        android.view.MotionEvent motionEvent = this.f294043x0;
        if (i29 == 1) {
            super.onTouchEvent(motionEvent);
        } else if (i29 == 2) {
            super.onInterceptTouchEvent(motionEvent);
        }
        requestLayout();
        return true;
    }

    public boolean x(boolean z17, float f17) {
        if (this.f294022d == null) {
            return false;
        }
        this.F.b(true);
        if (z17) {
            u(this.f294037s - getHeaderViewsCount(), f17);
        } else {
            vl5.n nVar = this.E1;
            if (nVar != null) {
                nVar.f519491d = android.os.SystemClock.uptimeMillis();
                nVar.f519498n = false;
                nVar.d();
                nVar.f519499o.post(nVar);
            } else {
                n();
            }
        }
        if (this.f294047y1) {
            vl5.m mVar = this.f294049z1;
            if (mVar.f519473e) {
                mVar.f519469a.append("</DSLVStates>\n");
                mVar.a();
                mVar.f519473e = false;
            }
        }
        return true;
    }

    public final void y() {
        int paddingTop = getPaddingTop();
        float height = (getHeight() - paddingTop) - getPaddingBottom();
        float f17 = paddingTop;
        float f18 = (this.G * height) + f17;
        this.L = f18;
        float f19 = ((1.0f - this.H) * height) + f17;
        this.K = f19;
        this.I = (int) f18;
        this.f294021J = (int) f19;
        this.M = f18 - f17;
        this.N = (paddingTop + r1) - f19;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.f294044x1 = new vl5.h(this, listAdapter, null);
            listAdapter.registerDataSetObserver(this.f294027i);
            if (listAdapter instanceof vl5.o) {
                m82185x4578645((vl5.o) listAdapter);
            }
            if (listAdapter instanceof vl5.i) {
                m82181x71eb6f8a((vl5.i) listAdapter);
            }
            if (listAdapter instanceof vl5.s) {
                m82189xa7c1925a((vl5.s) listAdapter);
            }
        } else {
            this.f294044x1 = null;
        }
        super.setAdapter((android.widget.ListAdapter) this.f294044x1);
    }
}
