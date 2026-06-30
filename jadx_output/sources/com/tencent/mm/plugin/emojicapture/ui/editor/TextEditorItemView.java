package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\tJ\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView;", "Landroid/view/View;", "Lr22/f;", "", "editing", "Ljz5/f0;", "setEditing", "", "getText", "", "getTextColor", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextEditorItemView extends android.view.View implements r22.f {
    public static final /* synthetic */ int N = 0;
    public float A;
    public final float B;
    public boolean C;
    public final float D;
    public final android.graphics.PointF E;
    public final android.graphics.PointF F;
    public final bw3.e G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Path f98755J;
    public final float K;
    public final float L;
    public final float[] M;

    /* renamed from: d, reason: collision with root package name */
    public boolean f98756d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f98757e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Typeface[] f98758f;

    /* renamed from: g, reason: collision with root package name */
    public int f98759g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f98760h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f98761i;

    /* renamed from: m, reason: collision with root package name */
    public final float f98762m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Path f98763n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f98764o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f98765p;

    /* renamed from: q, reason: collision with root package name */
    public final int f98766q;

    /* renamed from: r, reason: collision with root package name */
    public int f98767r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Bitmap[] f98768s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.RectF f98769t;

    /* renamed from: u, reason: collision with root package name */
    public final float f98770u;

    /* renamed from: v, reason: collision with root package name */
    public final c32.e f98771v;

    /* renamed from: w, reason: collision with root package name */
    public int f98772w;

    /* renamed from: x, reason: collision with root package name */
    public int f98773x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f98774y;

    /* renamed from: z, reason: collision with root package name */
    public float f98775z;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd A[LOOP:1: B:14:0x00db->B:15:0x00dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextEditorItemView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final android.graphics.Bitmap a(android.graphics.Typeface typeface) {
        com.tencent.mm.plugin.emojicapture.ui.editor.FontTextView fontTextView = new com.tencent.mm.plugin.emojicapture.ui.editor.FontTextView(getContext(), null);
        android.graphics.RectF rectF = this.f98769t;
        fontTextView.setMaxWidth(rectF.width());
        fontTextView.setTextDrawer(this.f98771v);
        fontTextView.setTypeface(typeface);
        fontTextView.b(this.f98765p, this.f98772w, this.f98773x, true);
        fontTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (rectF.width() - (2 * this.f98770u)), Integer.MIN_VALUE), 0);
        int measuredWidth = fontTextView.getMeasuredWidth();
        int measuredHeight = fontTextView.getMeasuredHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView", "createTextBitmap", "(Landroid/graphics/Typeface;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emojicapture/ui/editor/TextEditorItemView", "createTextBitmap", "(Landroid/graphics/Typeface;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.save();
        fontTextView.draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    @Override // b32.c0
    public void b(android.graphics.RectF bounds, float f17) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        this.f98769t.set(bounds);
        this.f98755J.addRoundRect(new android.graphics.RectF(bounds.left, bounds.top, bounds.right, bounds.bottom), f17, f17, android.graphics.Path.Direction.CW);
        android.graphics.PointF pointF = this.E;
        float f18 = 2;
        float width = bounds.left + (bounds.width() / f18);
        android.graphics.RectF rectF = this.f98764o;
        pointF.set(width - (rectF.width() / f18), (bounds.bottom - this.D) - rectF.height());
        this.G.f24917g.setTranslate(pointF.x, pointF.y);
    }

    public final void c(int i17, int i18) {
        float f17 = 2;
        float f18 = this.f98762m;
        float f19 = f18 * f17;
        float f27 = i17 + f19;
        float f28 = i18 + f19;
        android.graphics.RectF rectF = this.f98764o;
        float width = rectF.width();
        float height = rectF.height();
        boolean isEmpty = rectF.isEmpty();
        android.graphics.PointF pointF = this.E;
        if (isEmpty) {
            pointF.offset(f27 / f17, -f28);
        } else {
            pointF.offset((width - f27) / f17, (height - f28) / f17);
        }
        rectF.set(0.0f, 0.0f, f27, f28);
        android.graphics.Path path = this.f98763n;
        path.reset();
        path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
        bw3.e eVar = this.G;
        eVar.f24917g.preTranslate((eVar.f24926p - f27) / f17, eVar.f24925o - f28);
        if (!this.f98756d) {
            eVar.f24917g.setTranslate(pointF.x, pointF.y);
        }
        eVar.f24926p = (int) f27;
        eVar.f24925o = (int) f28;
    }

    public final void d() {
        boolean z17 = this.f98756d;
        java.lang.String[] strArr = this.f98757e;
        c32.e eVar = this.f98771v;
        android.graphics.Typeface[] typefaceArr = this.f98758f;
        android.graphics.Bitmap[] bitmapArr = this.f98768s;
        if (z17) {
            int i17 = this.f98767r + 1;
            this.f98767r = i17;
            this.f98767r = i17 % this.f98766q;
            int i18 = this.f98759g;
            android.graphics.Typeface typeface = typefaceArr[i18];
            eVar.b(strArr[i18]);
            int i19 = this.f98759g + 1;
            this.f98759g = i19;
            this.f98759g = i19 % typefaceArr.length;
            if (bitmapArr[this.f98767r] == null) {
                android.graphics.Bitmap a17 = a(typeface);
                bitmapArr[this.f98767r] = a17;
                c(a17.getWidth(), a17.getHeight());
            }
            java.lang.Runnable runnable = this.f98760h;
            removeCallbacks(runnable);
            postDelayed(runnable, 100L);
        } else if (bitmapArr[this.f98767r] == null) {
            android.graphics.Typeface typeface2 = typefaceArr[0];
            eVar.b(strArr[this.f98759g]);
            android.graphics.Bitmap a18 = a(typeface2);
            bitmapArr[this.f98767r] = a18;
            c(a18.getWidth(), a18.getHeight());
        }
        invalidate();
    }

    public final void f(java.lang.CharSequence charSequence, int i17, boolean z17) {
        setContentDescription(charSequence);
        if (z17) {
            this.f98765p = charSequence;
            this.f98772w = i17;
            this.f98773x = y22.n.a(i17);
            this.f98756d = !(charSequence == null || charSequence.length() == 0);
            kz5.v.u(this.f98768s, null, 0, 0, 6, null);
            this.f98767r = 0;
            this.f98759g = 0;
            d();
        }
    }

    @Override // zu3.n
    public zu3.a g() {
        return null;
    }

    @Override // r22.f
    public com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer getItemContainer() {
        if (!(getParent().getParent() instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer)) {
            return null;
        }
        android.view.ViewParent parent = getParent().getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        return (com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer) parent;
    }

    public final java.lang.CharSequence getText() {
        if (this.f98756d) {
            return this.f98765p;
        }
        return null;
    }

    public final int getTextColor() {
        if (this.f98756d) {
            return this.f98772w;
        }
        return 0;
    }

    @Override // b32.c0
    public boolean l() {
        f("", 0, true);
        post(new b32.d0(this));
        return true;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.I) {
            canvas.clipPath(this.f98755J);
        }
        canvas.save();
        canvas.concat(this.G.f24917g);
        if (this.H) {
            canvas.drawPath(this.f98763n, this.f98761i);
        }
        android.graphics.Bitmap bitmap = this.f98768s[this.f98767r];
        if (bitmap != null) {
            android.graphics.PointF pointF = this.F;
            canvas.drawBitmap(bitmap, pointF.x, pointF.y, (android.graphics.Paint) null);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        bw3.e eVar = this.G;
        boolean a17 = eVar.a(event);
        if (!a17) {
            return false;
        }
        postInvalidate();
        int actionMasked = event.getActionMasked();
        float[] fArr = this.M;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.I = false;
                    float abs = java.lang.Math.abs(event.getX() - this.f98775z);
                    float f17 = this.B;
                    if (abs > f17 || java.lang.Math.abs(event.getY() - this.A) > f17) {
                        this.C = true;
                    }
                } else if (actionMasked != 3) {
                    if ((actionMasked == 5 || actionMasked == 6) && !this.f98756d) {
                        return false;
                    }
                }
            }
            this.I = true;
            if ((!this.f98756d || this.f98774y) && !this.C) {
                performClick();
            }
            bw3.b bVar = new bw3.b();
            bVar.f24902c = this.L;
            bVar.f24903d = this.K;
            android.graphics.RectF rectF = this.f98764o;
            bVar.f24901b = new float[]{rectF.width() / 2.0f, rectF.height() / 2.0f};
            android.graphics.RectF rectF2 = this.f98769t;
            bVar.f24900a = new android.graphics.RectF(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
            float[] fArr2 = {eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
            eVar.f24917g.mapPoints(fArr2);
            if (!bVar.f24900a.contains(fArr2[0], fArr2[1])) {
                float f18 = fArr[0];
                float f19 = fArr[1];
                bVar.f24900a = new android.graphics.RectF(f18, f19, f18, f19);
            }
            bVar.a(eVar.f24917g, new b32.e0(this));
        } else {
            this.f98774y = this.H;
            this.C = false;
            this.f98775z = event.getX();
            this.A = event.getY();
            this.I = true;
            fArr[0] = eVar.f24926p / 2.0f;
            fArr[1] = eVar.f24925o / 2.0f;
            eVar.f24917g.mapPoints(fArr);
        }
        if (this.f98756d) {
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer itemContainer = getItemContainer();
            if (itemContainer != null) {
                itemContainer.a(this, event);
            }
        } else {
            android.graphics.Matrix matrix = eVar.f24917g;
            android.graphics.PointF pointF = this.E;
            matrix.setTranslate(pointF.x, pointF.y);
        }
        return a17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        if (!this.f98756d) {
            return null;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.G.f24917g);
        android.graphics.PointF pointF = this.F;
        matrix2.postTranslate(pointF.x, pointF.y);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new av3.b(this.f98768s, 100L, matrix2);
    }

    @Override // b32.c0
    public void pause() {
        removeCallbacks(this.f98760h);
    }

    @Override // b32.c0
    public void resume() {
        d();
    }

    @Override // b32.c0
    public void setEditing(boolean z17) {
        this.H = z17;
        postInvalidate();
    }

    public TextEditorItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
