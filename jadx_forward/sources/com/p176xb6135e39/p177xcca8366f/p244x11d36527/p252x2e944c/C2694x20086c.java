package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c;

/* renamed from: com.google.android.material.chip.Chip */
/* loaded from: classes15.dex */
public class C2694x20086c extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0081x8bc951a6 implements ba.e {

    /* renamed from: u, reason: collision with root package name */
    public static final android.graphics.Rect f125997u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f125998v = {android.R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public ba.f f125999e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.RippleDrawable f126000f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f126001g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f126002h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126003i;

    /* renamed from: m, reason: collision with root package name */
    public int f126004m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f126005n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f126006o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f126007p;

    /* renamed from: q, reason: collision with root package name */
    public final ba.c f126008q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f126009r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f126010s;

    /* renamed from: t, reason: collision with root package name */
    public final d3.p f126011t;

    public C2694x20086c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559693c9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCloseIconTouchBounds */
    public android.graphics.RectF m20135xd79313f9() {
        android.graphics.RectF rectF = this.f126010s;
        rectF.setEmpty();
        if (c()) {
            ba.f fVar = this.f125999e;
            android.graphics.Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.D()) {
                float f17 = fVar.L + fVar.K + fVar.f100195x + fVar.f100174J + fVar.I;
                if (f3.c.a(fVar) == 0) {
                    float f18 = bounds.right;
                    rectF.right = f18;
                    rectF.left = f18 - f17;
                } else {
                    float f19 = bounds.left;
                    rectF.left = f19;
                    rectF.right = f19 + f17;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCloseIconTouchBoundsInt */
    public android.graphics.Rect m20136xa4a25d36() {
        android.graphics.RectF m20135xd79313f9 = m20135xd79313f9();
        int i17 = (int) m20135xd79313f9.left;
        int i18 = (int) m20135xd79313f9.top;
        int i19 = (int) m20135xd79313f9.right;
        int i27 = (int) m20135xd79313f9.bottom;
        android.graphics.Rect rect = this.f126009r;
        rect.set(i17, i18, i19, i27);
        return rect;
    }

    /* renamed from: getTextAppearance */
    private ia.c m20137x5598d667() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100184o;
        }
        return null;
    }

    /* renamed from: setCloseIconFocused */
    private void m20138xa0fe7828(boolean z17) {
        if (this.f126007p != z17) {
            this.f126007p = z17;
            refreshDrawableState();
        }
    }

    /* renamed from: setCloseIconHovered */
    private void m20139xbcf638c(boolean z17) {
        if (this.f126006o != z17) {
            this.f126006o = z17;
            refreshDrawableState();
        }
    }

    /* renamed from: setCloseIconPressed */
    private void m20140xb73698d3(boolean z17) {
        if (this.f126005n != z17) {
            this.f126005n = z17;
            refreshDrawableState();
        }
    }

    /* renamed from: setFocusedVirtualView */
    private void m20141xfd06505b(int i17) {
        int i18 = this.f126004m;
        if (i18 != i17) {
            if (i18 == 0) {
                m20138xa0fe7828(false);
            }
            this.f126004m = i17;
            if (i17 == 0) {
                m20138xa0fe7828(true);
            }
        }
    }

    public final boolean c() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            java.lang.Object obj = fVar.f100193v;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof f3.k) {
                ((f3.l) ((f3.k) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(boolean z17) {
        if (this.f126004m == Integer.MIN_VALUE) {
            m20141xfd06505b(-1);
        }
        if (z17) {
            if (this.f126004m == -1) {
                m20141xfd06505b(0);
                return true;
            }
        } else if (this.f126004m == 0) {
            m20141xfd06505b(-1);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        java.lang.reflect.Field declaredField;
        boolean z17;
        int action = motionEvent.getAction();
        ba.c cVar = this.f126008q;
        if (action == 10) {
            try {
                declaredField = p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            if (((java.lang.Integer) declaredField.get(cVar)).intValue() != Integer.MIN_VALUE) {
                java.lang.reflect.Method declaredMethod = p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d.class.getDeclaredMethod("d", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cVar, Integer.MIN_VALUE);
                z17 = true;
                return !z17 ? true : true;
            }
        }
        z17 = false;
        return !z17 ? true : true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f126008q.m7245xfe5d9615(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i17;
        super.drawableStateChanged();
        ba.f fVar = this.f125999e;
        boolean z17 = false;
        if (fVar != null && ba.f.f(fVar.f100193v)) {
            ba.f fVar2 = this.f125999e;
            ?? isEnabled = isEnabled();
            int i18 = isEnabled;
            if (this.f126007p) {
                i18 = isEnabled + 1;
            }
            int i19 = i18;
            if (this.f126006o) {
                i19 = i18 + 1;
            }
            int i27 = i19;
            if (this.f126005n) {
                i27 = i19 + 1;
            }
            int i28 = i27;
            if (isChecked()) {
                i28 = i27 + 1;
            }
            int[] iArr = new int[i28];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i17 = 1;
            } else {
                i17 = 0;
            }
            if (this.f126007p) {
                iArr[i17] = 16842908;
                i17++;
            }
            if (this.f126006o) {
                iArr[i17] = 16843623;
                i17++;
            }
            if (this.f126005n) {
                iArr[i17] = 16842919;
                i17++;
            }
            if (isChecked()) {
                iArr[i17] = 16842913;
            }
            if (!java.util.Arrays.equals(fVar2.f100187p1, iArr)) {
                fVar2.f100187p1 = iArr;
                if (fVar2.D()) {
                    z17 = fVar2.h(fVar2.getState(), iArr);
                }
            }
        }
        if (z17) {
            invalidate();
        }
    }

    public boolean e() {
        boolean z17;
        playSoundEffect(0);
        android.view.View.OnClickListener onClickListener = this.f126001g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z17 = true;
        } else {
            z17 = false;
        }
        this.f126008q.m7264x9023e859(0, 1);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = r5.f125999e;
        r1 = r1 + ((r0.F + r0.G) + r0.f100191t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
    
        if (isChecked() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r5 = this;
            java.lang.CharSequence r0 = r5.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L8c
            ba.f r0 = r5.f125999e
            if (r0 != 0) goto L10
            goto L8c
        L10:
            float r1 = r0.E
            float r2 = r0.L
            float r1 = r1 + r2
            float r2 = r0.H
            float r1 = r1 + r2
            float r2 = r0.I
            float r1 = r1 + r2
            boolean r2 = r0.f100188q
            r3 = 0
            if (r2 == 0) goto L35
            android.graphics.drawable.Drawable r2 = r0.f100189r
            if (r2 == 0) goto L32
            boolean r4 = r2 instanceof f3.k
            if (r4 == 0) goto L33
            f3.k r2 = (f3.k) r2
            f3.l r2 = (f3.l) r2
            r4 = 0
            r2.getClass()
            r2 = r4
            goto L33
        L32:
            r2 = r3
        L33:
            if (r2 != 0) goto L43
        L35:
            android.graphics.drawable.Drawable r2 = r0.B
            if (r2 == 0) goto L4e
            boolean r0 = r0.A
            if (r0 == 0) goto L4e
            boolean r0 = r5.isChecked()
            if (r0 == 0) goto L4e
        L43:
            ba.f r0 = r5.f125999e
            float r2 = r0.F
            float r4 = r0.G
            float r2 = r2 + r4
            float r0 = r0.f100191t
            float r2 = r2 + r0
            float r1 = r1 + r2
        L4e:
            ba.f r0 = r5.f125999e
            boolean r2 = r0.f100192u
            if (r2 == 0) goto L71
            android.graphics.drawable.Drawable r2 = r0.f100193v
            if (r2 == 0) goto L66
            boolean r3 = r2 instanceof f3.k
            if (r3 == 0) goto L65
            f3.k r2 = (f3.k) r2
            f3.l r2 = (f3.l) r2
            r3 = 0
            r2.getClass()
            goto L66
        L65:
            r3 = r2
        L66:
            if (r3 == 0) goto L71
            float r2 = r0.f100174J
            float r3 = r0.K
            float r2 = r2 + r3
            float r0 = r0.f100195x
            float r2 = r2 + r0
            float r1 = r1 + r2
        L71:
            java.util.WeakHashMap r0 = n3.l1.f415895a
            int r0 = n3.v0.e(r5)
            float r0 = (float) r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = n3.v0.f(r5)
            int r2 = r5.getPaddingTop()
            int r1 = (int) r1
            int r3 = r5.getPaddingBottom()
            n3.v0.k(r5, r0, r2, r1, r3)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.f():void");
    }

    public final void g(ia.c cVar) {
        android.text.TextPaint paint = getPaint();
        paint.drawableState = this.f125999e.getState();
        cVar.b(getContext(), paint, this.f126011t);
    }

    /* renamed from: getCheckedIcon */
    public android.graphics.drawable.Drawable m20142x25699b8a() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.B;
        }
        return null;
    }

    /* renamed from: getChipBackgroundColor */
    public android.content.res.ColorStateList m20143x931f55b3() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100175d;
        }
        return null;
    }

    /* renamed from: getChipCornerRadius */
    public float m20144x8e433529() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100177f;
        }
        return 0.0f;
    }

    /* renamed from: getChipDrawable */
    public android.graphics.drawable.Drawable m20145xba34ff80() {
        return this.f125999e;
    }

    /* renamed from: getChipEndPadding */
    public float m20146xccd3fd18() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.L;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getChipIcon */
    public android.graphics.drawable.Drawable m20147xdef07c5b() {
        android.graphics.drawable.Drawable drawable;
        ba.f fVar = this.f125999e;
        if (fVar == null || (drawable = fVar.f100189r) == 0) {
            return null;
        }
        if (!(drawable instanceof f3.k)) {
            return drawable;
        }
        ((f3.l) ((f3.k) drawable)).getClass();
        return null;
    }

    /* renamed from: getChipIconSize */
    public float m20148xbf7c2afc() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100191t;
        }
        return 0.0f;
    }

    /* renamed from: getChipIconTint */
    public android.content.res.ColorStateList m20149xbf7c9df6() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100190s;
        }
        return null;
    }

    /* renamed from: getChipMinHeight */
    public float m20150x7ba0fb77() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100176e;
        }
        return 0.0f;
    }

    /* renamed from: getChipStartPadding */
    public float m20151x3366fb31() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.E;
        }
        return 0.0f;
    }

    /* renamed from: getChipStrokeColor */
    public android.content.res.ColorStateList m20152x6ccd69e9() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100178g;
        }
        return null;
    }

    /* renamed from: getChipStrokeWidth */
    public float m20153x6de4684c() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100179h;
        }
        return 0.0f;
    }

    @java.lang.Deprecated
    /* renamed from: getChipText */
    public java.lang.CharSequence m20154xdef5850f() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCloseIcon */
    public android.graphics.drawable.Drawable m20155xe2a643db() {
        android.graphics.drawable.Drawable drawable;
        ba.f fVar = this.f125999e;
        if (fVar == null || (drawable = fVar.f100193v) == 0) {
            return null;
        }
        if (!(drawable instanceof f3.k)) {
            return drawable;
        }
        ((f3.l) ((f3.k) drawable)).getClass();
        return null;
    }

    /* renamed from: getCloseIconContentDescription */
    public java.lang.CharSequence m20156x6f5780fe() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100198y;
        }
        return null;
    }

    /* renamed from: getCloseIconEndPadding */
    public float m20157xd9e4f8f1() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.K;
        }
        return 0.0f;
    }

    /* renamed from: getCloseIconSize */
    public float m20158xdc02327c() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100195x;
        }
        return 0.0f;
    }

    /* renamed from: getCloseIconStartPadding */
    public float m20159x402864ca() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100174J;
        }
        return 0.0f;
    }

    /* renamed from: getCloseIconTint */
    public android.content.res.ColorStateList m20160xdc02a576() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100194w;
        }
        return null;
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.C1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f126004m == 0) {
            rect.set(m20136xa4a25d36());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* renamed from: getHideMotionSpec */
    public w9.h m20161x8fe7bc69() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.D;
        }
        return null;
    }

    /* renamed from: getIconEndPadding */
    public float m20162x73d81105() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.G;
        }
        return 0.0f;
    }

    /* renamed from: getIconStartPadding */
    public float m20163x29b5c7de() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.F;
        }
        return 0.0f;
    }

    /* renamed from: getRippleColor */
    public android.content.res.ColorStateList m20164xaba02ddd() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.f100180i;
        }
        return null;
    }

    /* renamed from: getShowMotionSpec */
    public w9.h m20165x22a30c64() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.C;
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        ba.f fVar = this.f125999e;
        return fVar != null ? fVar.f100182m : "";
    }

    /* renamed from: getTextEndPadding */
    public float m20166xc800c8b9() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.I;
        }
        return 0.0f;
    }

    /* renamed from: getTextStartPadding */
    public float m20167x168f6292() {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            return fVar.H;
        }
        return 0.0f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f125998v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        ba.f fVar;
        if (android.text.TextUtils.isEmpty(getText()) || (fVar = this.f125999e) == null || fVar.D1) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        float m20151x3366fb31 = m20151x3366fb31() + this.f125999e.c() + m20167x168f6292();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.v0.d(this) != 0) {
            m20151x3366fb31 = -m20151x3366fb31;
        }
        canvas.translate(m20151x3366fb31, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            m20141xfd06505b(-1);
        } else {
            m20141xfd06505b(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z17, i17, rect);
        this.f126008q.m7255x8a4c8e3b(z17, i17, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            m20139xbcf638c(m20135xd79313f9().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            m20139xbcf638c(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasNoModifiers()) {
                            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                            r3 = d(n3.v0.d(this) == 1);
                            break;
                        }
                        break;
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                            r3 = d(!(n3.v0.d(this) == 1));
                            break;
                        }
                        break;
                }
            }
            int i18 = this.f126004m;
            if (i18 == -1) {
                performClick();
                return true;
            }
            if (i18 == 0) {
                e();
                return true;
            }
        } else {
            int i19 = keyEvent.hasNoModifiers() ? 2 : keyEvent.hasModifiers(1) ? 1 : 0;
            if (i19 != 0) {
                android.view.ViewParent parent = getParent();
                android.view.View view = this;
                do {
                    view = view.focusSearch(i19);
                    if (view == null || view == this) {
                        break;
                    }
                } while (view.getParent() == parent);
                if (view != null) {
                    view.requestFocus();
                    return true;
                }
            }
        }
        if (!r3) {
            return super.onKeyDown(i17, keyEvent);
        }
        invalidate();
        return true;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i17) {
        if (m20135xd79313f9().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return android.view.PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.m20135xd79313f9()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f126005n
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.m20140xb73698d3(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f126005n
            if (r0 == 0) goto L34
            r5.e()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.m20140xb73698d3(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.m20140xb73698d3(r2)
        L3e:
            r0 = r2
            goto L41
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.f125999e && drawable != this.f126000f) {
            throw new java.lang.UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        throw new java.lang.UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.f125999e && drawable != this.f126000f) {
            throw new java.lang.UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        throw new java.lang.UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        throw new java.lang.UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        throw new java.lang.UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    /* renamed from: setCheckable */
    public void m20168x7388e820(boolean z17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.i(z17);
        }
    }

    /* renamed from: setCheckableResource */
    public void m20169xe834f04e(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.i(fVar.M.getResources().getBoolean(i17));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ba.f fVar = this.f125999e;
        if (fVar == null) {
            this.f126003i = z17;
            return;
        }
        if (fVar.f100201z) {
            boolean isChecked = isChecked();
            super.setChecked(z17);
            if (isChecked == z17 || (onCheckedChangeListener = this.f126002h) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z17);
        }
    }

    /* renamed from: setCheckedIcon */
    public void m20170xbbcf0efe(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.j(drawable);
        }
    }

    @java.lang.Deprecated
    /* renamed from: setCheckedIconEnabled */
    public void m20171x9277da63(boolean z17) {
        m20175xe3a3f94(z17);
    }

    @java.lang.Deprecated
    /* renamed from: setCheckedIconEnabledResource */
    public void m20172xb7faef91(int i17) {
        m20174xe3a3f94(i17);
    }

    /* renamed from: setCheckedIconResource */
    public void m20173x464d592c(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.j(k.a.a(fVar.M, i17));
        }
    }

    /* renamed from: setCheckedIconVisible */
    public void m20174xe3a3f94(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.k(fVar.M.getResources().getBoolean(i17));
        }
    }

    /* renamed from: setChipBackgroundColor */
    public void m20176xe1641527(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.f100175d == colorStateList) {
            return;
        }
        fVar.f100175d = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    /* renamed from: setChipBackgroundColorResource */
    public void m20177x60722655(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            java.lang.Object obj = k.a.f384389a;
            android.content.res.ColorStateList colorStateList = fVar.M.getColorStateList(i17);
            if (fVar.f100175d != colorStateList) {
                fVar.f100175d = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
    }

    /* renamed from: setChipCornerRadius */
    public void m20178x323fca35(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.f100177f == f17) {
            return;
        }
        fVar.f100177f = f17;
        fVar.invalidateSelf();
    }

    /* renamed from: setChipCornerRadiusResource */
    public void m20179x2486ed63(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.f100177f != dimension) {
                fVar.f100177f = dimension;
                fVar.invalidateSelf();
            }
        }
    }

    /* renamed from: setChipDrawable */
    public void m20180xf07dfa8c(ba.f fVar) {
        ba.f fVar2 = this.f125999e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f100202z1 = new java.lang.ref.WeakReference(null);
            }
            this.f125999e = fVar;
            fVar.getClass();
            fVar.f100202z1 = new java.lang.ref.WeakReference(this);
            this.f126000f = new android.graphics.drawable.RippleDrawable(ja.a.a(this.f125999e.f100180i), this.f125999e, null);
            ba.f fVar3 = this.f125999e;
            if (fVar3.f100197x1) {
                fVar3.f100197x1 = false;
                fVar3.f100200y1 = null;
                fVar3.onStateChange(fVar3.getState());
            }
            android.graphics.drawable.RippleDrawable rippleDrawable = this.f126000f;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.q(this, rippleDrawable);
        }
    }

    /* renamed from: setChipEndPadding */
    public void m20181x94ca6524(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.L == f17) {
            return;
        }
        fVar.L = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    /* renamed from: setChipEndPaddingResource */
    public void m20182xf3bb2952(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.L != dimension) {
                fVar.L = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    /* renamed from: setChipIcon */
    public void m20183xd9a8dd67(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.l(drawable);
        }
    }

    @java.lang.Deprecated
    /* renamed from: setChipIconEnabled */
    public void m20184xabf5b3da(boolean z17) {
        m20192x27b8190b(z17);
    }

    @java.lang.Deprecated
    /* renamed from: setChipIconEnabledResource */
    public void m20185xf25f6208(int i17) {
        m20191x27b8190b(i17);
    }

    /* renamed from: setChipIconResource */
    public void m20186x5c8aae95(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.l(k.a.a(fVar.M, i17));
        }
    }

    /* renamed from: setChipIconSize */
    public void m20187xf5c52608(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.m(f17);
        }
    }

    /* renamed from: setChipIconSizeResource */
    public void m20188x1ae8c636(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.m(fVar.M.getResources().getDimension(i17));
        }
    }

    /* renamed from: setChipIconTint */
    public void m20189xf5c59902(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.n(colorStateList);
        }
    }

    /* renamed from: setChipIconTintResource */
    public void m20190x5f2b9f30(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f384389a;
            fVar.n(fVar.M.getColorStateList(i17));
        }
    }

    /* renamed from: setChipIconVisible */
    public void m20191x27b8190b(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.o(fVar.M.getResources().getBoolean(i17));
        }
    }

    /* renamed from: setChipMinHeight */
    public void m20193xe7761eb(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.f100176e == f17) {
            return;
        }
        fVar.f100176e = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    /* renamed from: setChipMinHeightResource */
    public void m20194x9fde6f19(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.f100176e != dimension) {
                fVar.f100176e = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    /* renamed from: setChipStartPadding */
    public void m20195xd763903d(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.E == f17) {
            return;
        }
        fVar.E = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    /* renamed from: setChipStartPaddingResource */
    public void m20196x86a82b6b(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.E != dimension) {
                fVar.E = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    /* renamed from: setChipStrokeColor */
    public void m20197xa3a4035d(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.f100178g == colorStateList) {
            return;
        }
        fVar.f100178g = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    /* renamed from: setChipStrokeColorResource */
    public void m20198x59537e8b(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            java.lang.Object obj = k.a.f384389a;
            android.content.res.ColorStateList colorStateList = fVar.M.getColorStateList(i17);
            if (fVar.f100178g != colorStateList) {
                fVar.f100178g = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
    }

    /* renamed from: setChipStrokeWidth */
    public void m20199xa4bb01c0(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.p(f17);
        }
    }

    /* renamed from: setChipStrokeWidthResource */
    public void m20200x210369ee(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.p(fVar.M.getResources().getDimension(i17));
        }
    }

    @java.lang.Deprecated
    /* renamed from: setChipText */
    public void m20201xd9ade61b(java.lang.CharSequence charSequence) {
        setText(charSequence);
    }

    @java.lang.Deprecated
    /* renamed from: setChipTextResource */
    public void m20202xeb25c349(int i17) {
        setText(getResources().getString(i17));
    }

    /* renamed from: setCloseIcon */
    public void m20203x3efa044f(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.q(drawable);
        }
    }

    /* renamed from: setCloseIconContentDescription */
    public void m20204x776f8c72(java.lang.CharSequence charSequence) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.f100198y == charSequence) {
            return;
        }
        fVar.f100198y = l3.b.c().d(charSequence);
        fVar.invalidateSelf();
    }

    @java.lang.Deprecated
    /* renamed from: setCloseIconEnabled */
    public void m20205x6a3e77f2(boolean z17) {
        m20217xe600dd23(z17);
    }

    @java.lang.Deprecated
    /* renamed from: setCloseIconEnabledResource */
    public void m20206x340e8e20(int i17) {
        m20216xe600dd23(i17);
    }

    /* renamed from: setCloseIconEndPadding */
    public void m20207x2829b865(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.r(f17);
        }
    }

    /* renamed from: setCloseIconEndPaddingResource */
    public void m20208x8d77ab93(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.r(fVar.M.getResources().getDimension(i17));
        }
    }

    /* renamed from: setCloseIconResource */
    public void m20209x675a6d7d(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.q(k.a.a(fVar.M, i17));
        }
    }

    /* renamed from: setCloseIconSize */
    public void m20210x6ed898f0(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.s(f17);
        }
    }

    /* renamed from: setCloseIconSizeResource */
    public void m20211xa86ed11e(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.s(fVar.M.getResources().getDimension(i17));
        }
    }

    /* renamed from: setCloseIconStartPadding */
    public void m20212x103b173e(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.t(f17);
        }
    }

    /* renamed from: setCloseIconStartPaddingResource */
    public void m20213xa34d216c(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.t(fVar.M.getResources().getDimension(i17));
        }
    }

    /* renamed from: setCloseIconTint */
    public void m20214x6ed90bea(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.u(colorStateList);
        }
    }

    /* renamed from: setCloseIconTintResource */
    public void m20215xecb1aa18(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f384389a;
            fVar.u(fVar.M.getColorStateList(i17));
        }
    }

    /* renamed from: setCloseIconVisible */
    public void m20216xe600dd23(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.v(fVar.M.getResources().getBoolean(i17));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i17, int i18, int i19, int i27) {
        if (i17 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i19 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i17, i18, i19, i27);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i17, int i18, int i19, int i27) {
        if (i17 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i19 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i17, i18, i19, i27);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.f125999e == null) {
            return;
        }
        if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
            throw new java.lang.UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.C1 = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i17) {
        if (i17 != 8388627) {
            return;
        }
        super.setGravity(i17);
    }

    /* renamed from: setHideMotionSpec */
    public void m20218x57de2475(w9.h hVar) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.D = hVar;
        }
    }

    /* renamed from: setHideMotionSpecResource */
    public void m20219xec4707a3(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.D = w9.h.b(fVar.M, i17);
        }
    }

    /* renamed from: setIconEndPadding */
    public void m20220x3bce7911(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.w(f17);
        }
    }

    /* renamed from: setIconEndPaddingResource */
    public void m20221xae57003f(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.w(fVar.M.getResources().getDimension(i17));
        }
    }

    /* renamed from: setIconStartPadding */
    public void m20222xcdb25cea(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.x(f17);
        }
    }

    /* renamed from: setIconStartPaddingResource */
    public void m20223x9a9fb18(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.x(fVar.M.getResources().getDimension(i17));
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i17) {
        if (i17 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i17);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        if (i17 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i17);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i17) {
        super.setMaxWidth(i17);
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.E1 = i17;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i17) {
        if (i17 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i17);
    }

    /* renamed from: setOnCheckedChangeListenerInternal */
    public void m20224x7da65987(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f126002h = onCheckedChangeListener;
    }

    /* renamed from: setOnCloseIconClickListener */
    public void m20225xad0c8a8c(android.view.View.OnClickListener onClickListener) {
        this.f126001g = onClickListener;
    }

    /* renamed from: setRippleColor */
    public void m20226x4205a151(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    /* renamed from: setRippleColorResource */
    public void m20227x5001e87f(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f384389a;
            fVar.y(fVar.M.getColorStateList(i17));
        }
    }

    /* renamed from: setShowMotionSpec */
    public void m20228xea997470(w9.h hVar) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.C = hVar;
        }
    }

    /* renamed from: setShowMotionSpecResource */
    public void m20229x115c2c9e(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.C = w9.h.b(fVar.M, i17);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z17) {
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z17);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (this.f125999e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.CharSequence d17 = l3.b.c().d(charSequence);
        if (this.f125999e.D1) {
            d17 = null;
        }
        super.setText(d17, bufferType);
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.z(charSequence);
        }
    }

    /* renamed from: setTextAppearance */
    public void m20230x1d8f3e73(ia.c cVar) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.A(cVar);
        }
        if (m20137x5598d667() != null) {
            m20137x5598d667().c(getContext(), getPaint(), this.f126011t);
            g(cVar);
        }
    }

    /* renamed from: setTextAppearanceResource */
    public void m20231x3bb543a1(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        setTextAppearance(getContext(), i17);
    }

    /* renamed from: setTextEndPadding */
    public void m20232x8ff730c5(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.I == f17) {
            return;
        }
        fVar.I = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    /* renamed from: setTextEndPaddingResource */
    public void m20233x85f6c3f3(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.I != dimension) {
                fVar.I = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    /* renamed from: setTextStartPadding */
    public void m20234xba8bf79e(float f17) {
        ba.f fVar = this.f125999e;
        if (fVar == null || fVar.H == f17) {
            return;
        }
        fVar.H = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    /* renamed from: setTextStartPaddingResource */
    public void m20235x7867a1cc(int i17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.H != dimension) {
                fVar.H = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public C2694x20086c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int resourceId;
        this.f126004m = Integer.MIN_VALUE;
        this.f126009r = new android.graphics.Rect();
        this.f126010s = new android.graphics.RectF();
        this.f126011t = new ba.a(this);
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                                if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                    attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                                } else {
                                    throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
                                }
                            } else {
                                throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                            }
                        } else {
                            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                    }
                } else {
                    throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
                }
            } else {
                throw new java.lang.UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            }
        }
        ba.f fVar = new ba.f(context);
        android.content.res.TypedArray d17 = fa.d0.d(fVar.M, attributeSet, v9.a.f515649f, i17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576287vc, new int[0]);
        android.content.Context context2 = fVar.M;
        android.content.res.ColorStateList a17 = ia.a.a(context2, d17, 8);
        if (fVar.f100175d != a17) {
            fVar.f100175d = a17;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = d17.getDimension(16, 0.0f);
        if (fVar.f100176e != dimension) {
            fVar.f100176e = dimension;
            fVar.invalidateSelf();
            fVar.g();
        }
        float dimension2 = d17.getDimension(9, 0.0f);
        if (fVar.f100177f != dimension2) {
            fVar.f100177f = dimension2;
            fVar.invalidateSelf();
        }
        android.content.res.ColorStateList a18 = ia.a.a(context2, d17, 18);
        if (fVar.f100178g != a18) {
            fVar.f100178g = a18;
            fVar.onStateChange(fVar.getState());
        }
        fVar.p(d17.getDimension(19, 0.0f));
        fVar.y(ia.a.a(context2, d17, 30));
        fVar.z(d17.getText(3));
        fVar.A((!d17.hasValue(0) || (resourceId = d17.getResourceId(0, 0)) == 0) ? null : new ia.c(context2, resourceId));
        int i18 = d17.getInt(1, 0);
        if (i18 == 1) {
            fVar.C1 = android.text.TextUtils.TruncateAt.START;
        } else if (i18 == 2) {
            fVar.C1 = android.text.TextUtils.TruncateAt.MIDDLE;
        } else if (i18 == 3) {
            fVar.C1 = android.text.TextUtils.TruncateAt.END;
        }
        fVar.o(d17.getBoolean(15, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.o(d17.getBoolean(12, false));
        }
        fVar.l(ia.a.b(context2, d17, 11));
        fVar.n(ia.a.a(context2, d17, 14));
        fVar.m(d17.getDimension(13, 0.0f));
        fVar.v(d17.getBoolean(26, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.v(d17.getBoolean(21, false));
        }
        fVar.q(ia.a.b(context2, d17, 20));
        fVar.u(ia.a.a(context2, d17, 25));
        fVar.s(d17.getDimension(23, 0.0f));
        fVar.i(d17.getBoolean(4, false));
        fVar.k(d17.getBoolean(7, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.k(d17.getBoolean(6, false));
        }
        fVar.j(ia.a.b(context2, d17, 5));
        fVar.C = w9.h.a(context2, d17, 31);
        fVar.D = w9.h.a(context2, d17, 27);
        float dimension3 = d17.getDimension(17, 0.0f);
        if (fVar.E != dimension3) {
            fVar.E = dimension3;
            fVar.invalidateSelf();
            fVar.g();
        }
        fVar.x(d17.getDimension(29, 0.0f));
        fVar.w(d17.getDimension(28, 0.0f));
        float dimension4 = d17.getDimension(33, 0.0f);
        if (fVar.H != dimension4) {
            fVar.H = dimension4;
            fVar.invalidateSelf();
            fVar.g();
        }
        float dimension5 = d17.getDimension(32, 0.0f);
        if (fVar.I != dimension5) {
            fVar.I = dimension5;
            fVar.invalidateSelf();
            fVar.g();
        }
        fVar.t(d17.getDimension(24, 0.0f));
        fVar.r(d17.getDimension(22, 0.0f));
        float dimension6 = d17.getDimension(10, 0.0f);
        if (fVar.L != dimension6) {
            fVar.L = dimension6;
            fVar.invalidateSelf();
            fVar.g();
        }
        fVar.E1 = d17.getDimensionPixelSize(2, Integer.MAX_VALUE);
        d17.recycle();
        m20180xf07dfa8c(fVar);
        ba.c cVar = new ba.c(this, this);
        this.f126008q = cVar;
        n3.l1.l(this, cVar);
        setOutlineProvider(new ba.b(this));
        setChecked(this.f126003i);
        fVar.D1 = false;
        setText(fVar.f100182m);
        setEllipsize(fVar.C1);
        setIncludeFontPadding(false);
        if (m20137x5598d667() != null) {
            g(m20137x5598d667());
        }
        setSingleLine();
        setGravity(8388627);
        f();
    }

    /* renamed from: setCheckedIconVisible */
    public void m20175xe3a3f94(boolean z17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.k(z17);
        }
    }

    /* renamed from: setChipIconVisible */
    public void m20192x27b8190b(boolean z17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.o(z17);
        }
    }

    /* renamed from: setCloseIconVisible */
    public void m20217xe600dd23(boolean z17) {
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.v(z17);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i17) {
        super.setTextAppearance(context, i17);
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        if (m20137x5598d667() != null) {
            m20137x5598d667().c(context, getPaint(), this.f126011t);
            g(m20137x5598d667());
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i17) {
        super.setTextAppearance(i17);
        ba.f fVar = this.f125999e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        if (m20137x5598d667() != null) {
            m20137x5598d667().c(getContext(), getPaint(), this.f126011t);
            g(m20137x5598d667());
        }
    }
}
