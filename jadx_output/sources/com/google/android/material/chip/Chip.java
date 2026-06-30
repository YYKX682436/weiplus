package com.google.android.material.chip;

/* loaded from: classes15.dex */
public class Chip extends androidx.appcompat.widget.AppCompatCheckBox implements ba.e {

    /* renamed from: u, reason: collision with root package name */
    public static final android.graphics.Rect f44464u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f44465v = {android.R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public ba.f f44466e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.RippleDrawable f44467f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f44468g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f44469h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f44470i;

    /* renamed from: m, reason: collision with root package name */
    public int f44471m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44472n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44473o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44474p;

    /* renamed from: q, reason: collision with root package name */
    public final ba.c f44475q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f44476r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f44477s;

    /* renamed from: t, reason: collision with root package name */
    public final d3.p f44478t;

    public Chip(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478160c9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.RectF getCloseIconTouchBounds() {
        android.graphics.RectF rectF = this.f44477s;
        rectF.setEmpty();
        if (c()) {
            ba.f fVar = this.f44466e;
            android.graphics.Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.D()) {
                float f17 = fVar.L + fVar.K + fVar.f18662x + fVar.f18641J + fVar.I;
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
    public android.graphics.Rect getCloseIconTouchBoundsInt() {
        android.graphics.RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i17 = (int) closeIconTouchBounds.left;
        int i18 = (int) closeIconTouchBounds.top;
        int i19 = (int) closeIconTouchBounds.right;
        int i27 = (int) closeIconTouchBounds.bottom;
        android.graphics.Rect rect = this.f44476r;
        rect.set(i17, i18, i19, i27);
        return rect;
    }

    private ia.c getTextAppearance() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18651o;
        }
        return null;
    }

    private void setCloseIconFocused(boolean z17) {
        if (this.f44474p != z17) {
            this.f44474p = z17;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean z17) {
        if (this.f44473o != z17) {
            this.f44473o = z17;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z17) {
        if (this.f44472n != z17) {
            this.f44472n = z17;
            refreshDrawableState();
        }
    }

    private void setFocusedVirtualView(int i17) {
        int i18 = this.f44471m;
        if (i18 != i17) {
            if (i18 == 0) {
                setCloseIconFocused(false);
            }
            this.f44471m = i17;
            if (i17 == 0) {
                setCloseIconFocused(true);
            }
        }
    }

    public final boolean c() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            java.lang.Object obj = fVar.f18660v;
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
        if (this.f44471m == Integer.MIN_VALUE) {
            setFocusedVirtualView(-1);
        }
        if (z17) {
            if (this.f44471m == -1) {
                setFocusedVirtualView(0);
                return true;
            }
        } else if (this.f44471m == 0) {
            setFocusedVirtualView(-1);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        java.lang.reflect.Field declaredField;
        boolean z17;
        int action = motionEvent.getAction();
        ba.c cVar = this.f44475q;
        if (action == 10) {
            try {
                declaredField = androidx.customview.widget.d.class.getDeclaredField("mHoveredVirtualViewId");
                declaredField.setAccessible(true);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            }
            if (((java.lang.Integer) declaredField.get(cVar)).intValue() != Integer.MIN_VALUE) {
                java.lang.reflect.Method declaredMethod = androidx.customview.widget.d.class.getDeclaredMethod("d", java.lang.Integer.TYPE);
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
        return this.f44475q.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        int i17;
        super.drawableStateChanged();
        ba.f fVar = this.f44466e;
        boolean z17 = false;
        if (fVar != null && ba.f.f(fVar.f18660v)) {
            ba.f fVar2 = this.f44466e;
            ?? isEnabled = isEnabled();
            int i18 = isEnabled;
            if (this.f44474p) {
                i18 = isEnabled + 1;
            }
            int i19 = i18;
            if (this.f44473o) {
                i19 = i18 + 1;
            }
            int i27 = i19;
            if (this.f44472n) {
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
            if (this.f44474p) {
                iArr[i17] = 16842908;
                i17++;
            }
            if (this.f44473o) {
                iArr[i17] = 16843623;
                i17++;
            }
            if (this.f44472n) {
                iArr[i17] = 16842919;
                i17++;
            }
            if (isChecked()) {
                iArr[i17] = 16842913;
            }
            if (!java.util.Arrays.equals(fVar2.f18654p1, iArr)) {
                fVar2.f18654p1 = iArr;
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
        android.view.View.OnClickListener onClickListener = this.f44468g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z17 = true;
        } else {
            z17 = false;
        }
        this.f44475q.sendEventForVirtualView(0, 1);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = r5.f44466e;
        r1 = r1 + ((r0.F + r0.G) + r0.f18658t);
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
            ba.f r0 = r5.f44466e
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
            boolean r2 = r0.f18655q
            r3 = 0
            if (r2 == 0) goto L35
            android.graphics.drawable.Drawable r2 = r0.f18656r
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
            ba.f r0 = r5.f44466e
            float r2 = r0.F
            float r4 = r0.G
            float r2 = r2 + r4
            float r0 = r0.f18658t
            float r2 = r2 + r0
            float r1 = r1 + r2
        L4e:
            ba.f r0 = r5.f44466e
            boolean r2 = r0.f18659u
            if (r2 == 0) goto L71
            android.graphics.drawable.Drawable r2 = r0.f18660v
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
            float r2 = r0.f18641J
            float r3 = r0.K
            float r2 = r2 + r3
            float r0 = r0.f18662x
            float r2 = r2 + r0
            float r1 = r1 + r2
        L71:
            java.util.WeakHashMap r0 = n3.l1.f334362a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.f():void");
    }

    public final void g(ia.c cVar) {
        android.text.TextPaint paint = getPaint();
        paint.drawableState = this.f44466e.getState();
        cVar.b(getContext(), paint, this.f44478t);
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.B;
        }
        return null;
    }

    public android.content.res.ColorStateList getChipBackgroundColor() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18642d;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18644f;
        }
        return 0.0f;
    }

    public android.graphics.drawable.Drawable getChipDrawable() {
        return this.f44466e;
    }

    public float getChipEndPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.L;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.graphics.drawable.Drawable getChipIcon() {
        android.graphics.drawable.Drawable drawable;
        ba.f fVar = this.f44466e;
        if (fVar == null || (drawable = fVar.f18656r) == 0) {
            return null;
        }
        if (!(drawable instanceof f3.k)) {
            return drawable;
        }
        ((f3.l) ((f3.k) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18658t;
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getChipIconTint() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18657s;
        }
        return null;
    }

    public float getChipMinHeight() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18643e;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.E;
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getChipStrokeColor() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18645g;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18646h;
        }
        return 0.0f;
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public android.graphics.drawable.Drawable getCloseIcon() {
        android.graphics.drawable.Drawable drawable;
        ba.f fVar = this.f44466e;
        if (fVar == null || (drawable = fVar.f18660v) == 0) {
            return null;
        }
        if (!(drawable instanceof f3.k)) {
            return drawable;
        }
        ((f3.l) ((f3.k) drawable)).getClass();
        return null;
    }

    public java.lang.CharSequence getCloseIconContentDescription() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18665y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.K;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18662x;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18641J;
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getCloseIconTint() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18661w;
        }
        return null;
    }

    @Override // android.widget.TextView
    public android.text.TextUtils.TruncateAt getEllipsize() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.C1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.f44471m == 0) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public w9.h getHideMotionSpec() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.D;
        }
        return null;
    }

    public float getIconEndPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.G;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.F;
        }
        return 0.0f;
    }

    public android.content.res.ColorStateList getRippleColor() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.f18647i;
        }
        return null;
    }

    public w9.h getShowMotionSpec() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.C;
        }
        return null;
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        ba.f fVar = this.f44466e;
        return fVar != null ? fVar.f18649m : "";
    }

    public float getTextEndPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.I;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            return fVar.H;
        }
        return 0.0f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f44465v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        ba.f fVar;
        if (android.text.TextUtils.isEmpty(getText()) || (fVar = this.f44466e) == null || fVar.D1) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        float chipStartPadding = getChipStartPadding() + this.f44466e.c() + getTextStartPadding();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.v0.d(this) != 0) {
            chipStartPadding = -chipStartPadding;
        }
        canvas.translate(chipStartPadding, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        if (z17) {
            setFocusedVirtualView(-1);
        } else {
            setFocusedVirtualView(Integer.MIN_VALUE);
        }
        invalidate();
        super.onFocusChanged(z17, i17, rect);
        this.f44475q.onFocusChanged(z17, i17, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
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
                            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                            r3 = d(n3.v0.d(this) == 1);
                            break;
                        }
                        break;
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                            r3 = d(!(n3.v0.d(this) == 1));
                            break;
                        }
                        break;
                }
            }
            int i18 = this.f44471m;
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
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
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
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
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
            boolean r0 = r5.f44472n
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f44472n
            if (r0 == 0) goto L34
            r5.e()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        if (drawable != this.f44466e && drawable != this.f44467f) {
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
        if (drawable != this.f44466e && drawable != this.f44467f) {
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

    public void setCheckable(boolean z17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.i(z17);
        }
    }

    public void setCheckableResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.i(fVar.M.getResources().getBoolean(i17));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        ba.f fVar = this.f44466e;
        if (fVar == null) {
            this.f44470i = z17;
            return;
        }
        if (fVar.f18668z) {
            boolean isChecked = isChecked();
            super.setChecked(z17);
            if (isChecked == z17 || (onCheckedChangeListener = this.f44469h) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z17);
        }
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.j(drawable);
        }
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabled(boolean z17) {
        setCheckedIconVisible(z17);
    }

    @java.lang.Deprecated
    public void setCheckedIconEnabledResource(int i17) {
        setCheckedIconVisible(i17);
    }

    public void setCheckedIconResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.j(k.a.a(fVar.M, i17));
        }
    }

    public void setCheckedIconVisible(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.k(fVar.M.getResources().getBoolean(i17));
        }
    }

    public void setChipBackgroundColor(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.f18642d == colorStateList) {
            return;
        }
        fVar.f18642d = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            java.lang.Object obj = k.a.f302856a;
            android.content.res.ColorStateList colorStateList = fVar.M.getColorStateList(i17);
            if (fVar.f18642d != colorStateList) {
                fVar.f18642d = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
    }

    public void setChipCornerRadius(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.f18644f == f17) {
            return;
        }
        fVar.f18644f = f17;
        fVar.invalidateSelf();
    }

    public void setChipCornerRadiusResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.f18644f != dimension) {
                fVar.f18644f = dimension;
                fVar.invalidateSelf();
            }
        }
    }

    public void setChipDrawable(ba.f fVar) {
        ba.f fVar2 = this.f44466e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f18669z1 = new java.lang.ref.WeakReference(null);
            }
            this.f44466e = fVar;
            fVar.getClass();
            fVar.f18669z1 = new java.lang.ref.WeakReference(this);
            this.f44467f = new android.graphics.drawable.RippleDrawable(ja.a.a(this.f44466e.f18647i), this.f44466e, null);
            ba.f fVar3 = this.f44466e;
            if (fVar3.f18664x1) {
                fVar3.f18664x1 = false;
                fVar3.f18667y1 = null;
                fVar3.onStateChange(fVar3.getState());
            }
            android.graphics.drawable.RippleDrawable rippleDrawable = this.f44467f;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(this, rippleDrawable);
        }
    }

    public void setChipEndPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.L == f17) {
            return;
        }
        fVar.L = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    public void setChipEndPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.L != dimension) {
                fVar.L = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public void setChipIcon(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.l(drawable);
        }
    }

    @java.lang.Deprecated
    public void setChipIconEnabled(boolean z17) {
        setChipIconVisible(z17);
    }

    @java.lang.Deprecated
    public void setChipIconEnabledResource(int i17) {
        setChipIconVisible(i17);
    }

    public void setChipIconResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.l(k.a.a(fVar.M, i17));
        }
    }

    public void setChipIconSize(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.m(f17);
        }
    }

    public void setChipIconSizeResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.m(fVar.M.getResources().getDimension(i17));
        }
    }

    public void setChipIconTint(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.n(colorStateList);
        }
    }

    public void setChipIconTintResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f302856a;
            fVar.n(fVar.M.getColorStateList(i17));
        }
    }

    public void setChipIconVisible(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.o(fVar.M.getResources().getBoolean(i17));
        }
    }

    public void setChipMinHeight(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.f18643e == f17) {
            return;
        }
        fVar.f18643e = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    public void setChipMinHeightResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.f18643e != dimension) {
                fVar.f18643e = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public void setChipStartPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.E == f17) {
            return;
        }
        fVar.E = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    public void setChipStartPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.E != dimension) {
                fVar.E = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public void setChipStrokeColor(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.f18645g == colorStateList) {
            return;
        }
        fVar.f18645g = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipStrokeColorResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            java.lang.Object obj = k.a.f302856a;
            android.content.res.ColorStateList colorStateList = fVar.M.getColorStateList(i17);
            if (fVar.f18645g != colorStateList) {
                fVar.f18645g = colorStateList;
                fVar.onStateChange(fVar.getState());
            }
        }
    }

    public void setChipStrokeWidth(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.p(f17);
        }
    }

    public void setChipStrokeWidthResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.p(fVar.M.getResources().getDimension(i17));
        }
    }

    @java.lang.Deprecated
    public void setChipText(java.lang.CharSequence charSequence) {
        setText(charSequence);
    }

    @java.lang.Deprecated
    public void setChipTextResource(int i17) {
        setText(getResources().getString(i17));
    }

    public void setCloseIcon(android.graphics.drawable.Drawable drawable) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.q(drawable);
        }
    }

    public void setCloseIconContentDescription(java.lang.CharSequence charSequence) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.f18665y == charSequence) {
            return;
        }
        fVar.f18665y = l3.b.c().d(charSequence);
        fVar.invalidateSelf();
    }

    @java.lang.Deprecated
    public void setCloseIconEnabled(boolean z17) {
        setCloseIconVisible(z17);
    }

    @java.lang.Deprecated
    public void setCloseIconEnabledResource(int i17) {
        setCloseIconVisible(i17);
    }

    public void setCloseIconEndPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.r(f17);
        }
    }

    public void setCloseIconEndPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.r(fVar.M.getResources().getDimension(i17));
        }
    }

    public void setCloseIconResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.q(k.a.a(fVar.M, i17));
        }
    }

    public void setCloseIconSize(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.s(f17);
        }
    }

    public void setCloseIconSizeResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.s(fVar.M.getResources().getDimension(i17));
        }
    }

    public void setCloseIconStartPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.t(f17);
        }
    }

    public void setCloseIconStartPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.t(fVar.M.getResources().getDimension(i17));
        }
    }

    public void setCloseIconTint(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.u(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f302856a;
            fVar.u(fVar.M.getColorStateList(i17));
        }
    }

    public void setCloseIconVisible(int i17) {
        ba.f fVar = this.f44466e;
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
        if (this.f44466e == null) {
            return;
        }
        if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
            throw new java.lang.UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        ba.f fVar = this.f44466e;
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

    public void setHideMotionSpec(w9.h hVar) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.D = hVar;
        }
    }

    public void setHideMotionSpecResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.D = w9.h.b(fVar.M, i17);
        }
    }

    public void setIconEndPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.w(f17);
        }
    }

    public void setIconEndPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.w(fVar.M.getResources().getDimension(i17));
        }
    }

    public void setIconStartPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.x(f17);
        }
    }

    public void setIconStartPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
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
        ba.f fVar = this.f44466e;
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

    public void setOnCheckedChangeListenerInternal(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f44469h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(android.view.View.OnClickListener onClickListener) {
        this.f44468g = onClickListener;
    }

    public void setRippleColor(android.content.res.ColorStateList colorStateList) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.getClass();
            java.lang.Object obj = k.a.f302856a;
            fVar.y(fVar.M.getColorStateList(i17));
        }
    }

    public void setShowMotionSpec(w9.h hVar) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.C = hVar;
        }
    }

    public void setShowMotionSpecResource(int i17) {
        ba.f fVar = this.f44466e;
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
        if (this.f44466e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        java.lang.CharSequence d17 = l3.b.c().d(charSequence);
        if (this.f44466e.D1) {
            d17 = null;
        }
        super.setText(d17, bufferType);
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.z(charSequence);
        }
    }

    public void setTextAppearance(ia.c cVar) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.A(cVar);
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(getContext(), getPaint(), this.f44478t);
            g(cVar);
        }
    }

    public void setTextAppearanceResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        setTextAppearance(getContext(), i17);
    }

    public void setTextEndPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.I == f17) {
            return;
        }
        fVar.I = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    public void setTextEndPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.I != dimension) {
                fVar.I = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public void setTextStartPadding(float f17) {
        ba.f fVar = this.f44466e;
        if (fVar == null || fVar.H == f17) {
            return;
        }
        fVar.H = f17;
        fVar.invalidateSelf();
        fVar.g();
    }

    public void setTextStartPaddingResource(int i17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            float dimension = fVar.M.getResources().getDimension(i17);
            if (fVar.H != dimension) {
                fVar.H = dimension;
                fVar.invalidateSelf();
                fVar.g();
            }
        }
    }

    public Chip(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int resourceId;
        this.f44471m = Integer.MIN_VALUE;
        this.f44476r = new android.graphics.Rect();
        this.f44477s = new android.graphics.RectF();
        this.f44478t = new ba.a(this);
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
        android.content.res.TypedArray d17 = fa.d0.d(fVar.M, attributeSet, v9.a.f434116f, i17, com.tencent.mm.R.style.f494754vc, new int[0]);
        android.content.Context context2 = fVar.M;
        android.content.res.ColorStateList a17 = ia.a.a(context2, d17, 8);
        if (fVar.f18642d != a17) {
            fVar.f18642d = a17;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = d17.getDimension(16, 0.0f);
        if (fVar.f18643e != dimension) {
            fVar.f18643e = dimension;
            fVar.invalidateSelf();
            fVar.g();
        }
        float dimension2 = d17.getDimension(9, 0.0f);
        if (fVar.f18644f != dimension2) {
            fVar.f18644f = dimension2;
            fVar.invalidateSelf();
        }
        android.content.res.ColorStateList a18 = ia.a.a(context2, d17, 18);
        if (fVar.f18645g != a18) {
            fVar.f18645g = a18;
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
        setChipDrawable(fVar);
        ba.c cVar = new ba.c(this, this);
        this.f44475q = cVar;
        n3.l1.l(this, cVar);
        setOutlineProvider(new ba.b(this));
        setChecked(this.f44470i);
        fVar.D1 = false;
        setText(fVar.f18649m);
        setEllipsize(fVar.C1);
        setIncludeFontPadding(false);
        if (getTextAppearance() != null) {
            g(getTextAppearance());
        }
        setSingleLine();
        setGravity(8388627);
        f();
    }

    public void setCheckedIconVisible(boolean z17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.k(z17);
        }
    }

    public void setChipIconVisible(boolean z17) {
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.o(z17);
        }
    }

    public void setCloseIconVisible(boolean z17) {
        ba.f fVar = this.f44466e;
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
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(context, getPaint(), this.f44478t);
            g(getTextAppearance());
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i17) {
        super.setTextAppearance(i17);
        ba.f fVar = this.f44466e;
        if (fVar != null) {
            fVar.A(new ia.c(fVar.M, i17));
        }
        if (getTextAppearance() != null) {
            getTextAppearance().c(getContext(), getPaint(), this.f44478t);
            g(getTextAppearance());
        }
    }
}
