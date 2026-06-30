package com.p312xaaa79c6.p313xcbe86b0a;

/* renamed from: com.robinhood.ticker.TickerView */
/* loaded from: classes15.dex */
public class C2885xf34260ef extends android.view.View {

    /* renamed from: x, reason: collision with root package name */
    public static final android.view.animation.Interpolator f127360x = new android.view.animation.AccelerateDecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f127361d;

    /* renamed from: e, reason: collision with root package name */
    public final xb.f f127362e;

    /* renamed from: f, reason: collision with root package name */
    public final xb.e f127363f;

    /* renamed from: g, reason: collision with root package name */
    public final android.animation.ValueAnimator f127364g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f127365h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f127366i;

    /* renamed from: m, reason: collision with root package name */
    public int f127367m;

    /* renamed from: n, reason: collision with root package name */
    public int f127368n;

    /* renamed from: o, reason: collision with root package name */
    public int f127369o;

    /* renamed from: p, reason: collision with root package name */
    public int f127370p;

    /* renamed from: q, reason: collision with root package name */
    public float f127371q;

    /* renamed from: r, reason: collision with root package name */
    public int f127372r;

    /* renamed from: s, reason: collision with root package name */
    public long f127373s;

    /* renamed from: t, reason: collision with root package name */
    public long f127374t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Interpolator f127375u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f127376v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f127377w;

    public C2885xf34260ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f127361d = textPaint;
        xb.f fVar = new xb.f(textPaint);
        this.f127362e = fVar;
        this.f127363f = new xb.e(fVar);
        this.f127364g = android.animation.ValueAnimator.ofFloat(1.0f);
        this.f127365h = new android.graphics.Rect();
        c(context, attributeSet, 0, 0);
    }

    public final void a() {
        boolean z17 = this.f127367m != b();
        boolean z18 = this.f127368n != (((int) this.f127362e.f534403c) + getPaddingTop()) + getPaddingBottom();
        if (z17 || z18) {
            requestLayout();
        }
    }

    public final int b() {
        boolean z17 = this.f127376v;
        int i17 = 0;
        float f17 = 0.0f;
        xb.e eVar = this.f127363f;
        if (z17) {
            java.util.ArrayList arrayList = eVar.f534397a;
            int size = arrayList.size();
            while (i17 < size) {
                xb.d dVar = (xb.d) arrayList.get(i17);
                dVar.a();
                f17 += dVar.f534391l;
                i17++;
            }
        } else {
            java.util.ArrayList arrayList2 = eVar.f534397a;
            int size2 = arrayList2.size();
            while (i17 < size2) {
                xb.d dVar2 = (xb.d) arrayList2.get(i17);
                dVar2.a();
                f17 += dVar2.f534393n;
                i17++;
            }
        }
        return ((int) f17) + getPaddingLeft() + getPaddingRight();
    }

    public void c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        xb.j jVar = new xb.j(this, context.getResources());
        int[] iArr = xb.a.f534374a;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, i18);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            jVar.a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        jVar.a(obtainStyledAttributes);
        this.f127375u = f127360x;
        this.f127374t = obtainStyledAttributes.getInt(11, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
        this.f127376v = obtainStyledAttributes.getBoolean(10, false);
        this.f127369o = jVar.f534412a;
        int i19 = jVar.f534413b;
        android.graphics.Paint paint = this.f127361d;
        if (i19 != 0) {
            paint.setShadowLayer(jVar.f534416e, jVar.f534414c, jVar.f534415d, i19);
        }
        int i27 = jVar.f534420i;
        if (i27 != 0) {
            this.f127372r = i27;
            m21511x4e4ad719(paint.getTypeface());
        }
        m21509x1c5c5ff4(jVar.f534418g);
        m21510x3abfd950(jVar.f534419h);
        int i28 = obtainStyledAttributes.getInt(12, 0);
        if (i28 == 1) {
            m21505xcac67eee("0123456789");
        } else if (i28 == 2) {
            m21505xcac67eee("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } else if (isInEditMode()) {
            m21505xcac67eee("0123456789");
        }
        int i29 = obtainStyledAttributes.getInt(13, 0);
        xb.f fVar = this.f127362e;
        if (i29 == 0) {
            fVar.f534405e = xb.i.ANY;
        } else if (i29 == 1) {
            fVar.f534405e = xb.i.UP;
        } else {
            if (i29 != 2) {
                throw new java.lang.IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i29);
            }
            fVar.f534405e = xb.i.DOWN;
        }
        if (this.f127363f.f534399c != null) {
            d(jVar.f534417f, false);
        } else {
            this.f127377w = jVar.f534417f;
        }
        obtainStyledAttributes.recycle();
        xb.g gVar = new xb.g(this);
        android.animation.ValueAnimator valueAnimator = this.f127364g;
        valueAnimator.addUpdateListener(gVar);
        valueAnimator.addListener(new xb.h(this));
    }

    public void d(java.lang.String str, boolean z17) {
        java.util.ArrayList arrayList;
        char[] cArr;
        xb.e eVar;
        int i17;
        java.util.ArrayList arrayList2;
        char[] cArr2;
        boolean z18;
        int i18;
        com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef = this;
        if (android.text.TextUtils.equals(str, c2885xf34260ef.f127366i)) {
            return;
        }
        c2885xf34260ef.f127366i = str;
        boolean z19 = false;
        char[] charArray = str == null ? new char[0] : str.toCharArray();
        xb.e eVar2 = c2885xf34260ef.f127363f;
        if (eVar2.f534399c == null) {
            throw new java.lang.IllegalStateException("Need to call #setCharacterLists first.");
        }
        int i19 = 0;
        while (true) {
            arrayList = eVar2.f534397a;
            if (i19 >= arrayList.size()) {
                break;
            }
            xb.d dVar = (xb.d) arrayList.get(i19);
            dVar.a();
            if (dVar.f534391l > 0.0f) {
                i19++;
            } else {
                arrayList.remove(i19);
            }
        }
        int size = arrayList.size();
        char[] cArr3 = new char[size];
        for (int i27 = 0; i27 < size; i27++) {
            cArr3[i27] = ((xb.d) arrayList.get(i27)).f534382c;
        }
        java.util.Set set = eVar2.f534400d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i28 = 0;
        int i29 = 0;
        while (true) {
            boolean z27 = i28 == size ? true : z19;
            boolean z28 = i29 == charArray.length ? true : z19;
            if (z27 && z28) {
                break;
            }
            if (z27) {
                int length = charArray.length - i29;
                for (int i37 = 0; i37 < length; i37++) {
                    arrayList3.add(1);
                }
            } else if (z28) {
                int i38 = size - i28;
                for (int i39 = 0; i39 < i38; i39++) {
                    arrayList3.add(2);
                }
            } else {
                java.util.HashSet hashSet = (java.util.HashSet) set;
                boolean contains = hashSet.contains(java.lang.Character.valueOf(cArr3[i28]));
                boolean contains2 = hashSet.contains(java.lang.Character.valueOf(charArray[i29]));
                if (contains && contains2) {
                    int i47 = i28 + 1;
                    while (true) {
                        if (i47 >= size) {
                            i18 = size;
                            break;
                        } else {
                            if (!hashSet.contains(java.lang.Character.valueOf(cArr3[i47]))) {
                                i18 = i47;
                                break;
                            }
                            i47++;
                        }
                    }
                    int i48 = i29 + 1;
                    while (true) {
                        if (i48 >= charArray.length) {
                            i48 = charArray.length;
                            break;
                        } else if (!hashSet.contains(java.lang.Character.valueOf(charArray[i48]))) {
                            break;
                        } else {
                            i48++;
                        }
                    }
                    int i49 = i48;
                    int i57 = i18 - i28;
                    int i58 = i49 - i29;
                    int max = java.lang.Math.max(i57, i58);
                    if (i57 == i58) {
                        for (int i59 = 0; i59 < max; i59++) {
                            arrayList3.add(0);
                        }
                        cArr = charArray;
                        eVar = eVar2;
                        i17 = size;
                        arrayList2 = arrayList;
                        cArr2 = cArr3;
                        z18 = false;
                    } else {
                        int i66 = i57 + 1;
                        int i67 = i58 + 1;
                        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i66, i67);
                        for (int i68 = 0; i68 < i66; i68++) {
                            iArr[i68][0] = i68;
                        }
                        z18 = false;
                        for (int i69 = 0; i69 < i67; i69++) {
                            iArr[0][i69] = i69;
                        }
                        int i76 = 1;
                        while (i76 < i66) {
                            xb.e eVar3 = eVar2;
                            int i77 = 1;
                            while (i77 < i67) {
                                int i78 = i76 - 1;
                                int i79 = size;
                                int i86 = i77 - 1;
                                java.util.ArrayList arrayList4 = arrayList;
                                int i87 = cArr3[i78 + i28] == charArray[i86 + i29] ? 0 : 1;
                                int[] iArr2 = iArr[i76];
                                int[] iArr3 = iArr[i78];
                                iArr2[i77] = java.lang.Math.min(iArr3[i77] + 1, java.lang.Math.min(iArr2[i86] + 1, iArr3[i86] + i87));
                                i77++;
                                size = i79;
                                arrayList = arrayList4;
                                charArray = charArray;
                                cArr3 = cArr3;
                            }
                            i76++;
                            eVar2 = eVar3;
                        }
                        cArr = charArray;
                        eVar = eVar2;
                        i17 = size;
                        arrayList2 = arrayList;
                        cArr2 = cArr3;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(max * 2);
                        int i88 = i66 - 1;
                        while (true) {
                            i67--;
                            while (true) {
                                if (i88 <= 0 && i67 <= 0) {
                                    break;
                                }
                                if (i88 == 0) {
                                    arrayList5.add(1);
                                    break;
                                }
                                if (i67 != 0) {
                                    int i89 = i67 - 1;
                                    int i96 = iArr[i88][i89];
                                    int i97 = i88 - 1;
                                    int[] iArr4 = iArr[i97];
                                    int i98 = iArr4[i67];
                                    int i99 = iArr4[i89];
                                    if (i96 < i98 && i96 < i99) {
                                        arrayList5.add(1);
                                        break;
                                    } else {
                                        if (i98 >= i99) {
                                            arrayList5.add(0);
                                            i88 = i97;
                                            break;
                                        }
                                        arrayList5.add(2);
                                    }
                                } else {
                                    arrayList5.add(2);
                                }
                                i88--;
                            }
                        }
                        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                            arrayList3.add(arrayList5.get(size2));
                        }
                    }
                    i29 = i49;
                    i28 = i18;
                } else {
                    cArr = charArray;
                    eVar = eVar2;
                    i17 = size;
                    arrayList2 = arrayList;
                    cArr2 = cArr3;
                    z18 = false;
                    if (contains) {
                        arrayList3.add(1);
                    } else if (contains2) {
                        arrayList3.add(2);
                        i28++;
                    } else {
                        arrayList3.add(0);
                        i28++;
                    }
                    i29++;
                }
                c2885xf34260ef = this;
                z19 = z18;
                eVar2 = eVar;
                size = i17;
                arrayList = arrayList2;
                charArray = cArr;
                cArr3 = cArr2;
            }
        }
        int size3 = arrayList3.size();
        int[] iArr5 = new int[size3];
        for (int i100 = 0; i100 < arrayList3.size(); i100++) {
            iArr5[i100] = ((java.lang.Integer) arrayList3.get(i100)).intValue();
        }
        int i101 = 0;
        int i102 = 0;
        for (int i103 = 0; i103 < size3; i103++) {
            int i104 = iArr5[i103];
            if (i104 != 0) {
                if (i104 == 1) {
                    arrayList.add(i101, new xb.d(eVar2.f534399c, eVar2.f534398b));
                } else {
                    if (i104 != 2) {
                        throw new java.lang.IllegalArgumentException("Unknown action: " + iArr5[i103]);
                    }
                    ((xb.d) arrayList.get(i101)).c((char) 0);
                    i101++;
                }
            }
            ((xb.d) arrayList.get(i101)).c(charArray[i102]);
            i101++;
            i102++;
        }
        setContentDescription(str);
        if (z17) {
            android.animation.ValueAnimator valueAnimator = c2885xf34260ef.f127364g;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.setStartDelay(c2885xf34260ef.f127373s);
            valueAnimator.setDuration(c2885xf34260ef.f127374t);
            valueAnimator.setInterpolator(c2885xf34260ef.f127375u);
            valueAnimator.start();
            return;
        }
        eVar2.a(1.0f);
        int size4 = arrayList.size();
        for (int i105 = 0; i105 < size4; i105++) {
            xb.d dVar2 = (xb.d) arrayList.get(i105);
            dVar2.a();
            dVar2.f534393n = dVar2.f534391l;
        }
        a();
        invalidate();
    }

    /* renamed from: getAnimateMeasurementChange */
    public boolean m21492x2238bb21() {
        return this.f127376v;
    }

    /* renamed from: getAnimationDelay */
    public long m21493x96d30d55() {
        return this.f127373s;
    }

    /* renamed from: getAnimationDuration */
    public long m21494xf2fc9082() {
        return this.f127374t;
    }

    /* renamed from: getAnimationInterpolator */
    public android.view.animation.Interpolator m21495xf9d364b5() {
        return this.f127375u;
    }

    /* renamed from: getGravity */
    public int m21496x4e85ae18() {
        return this.f127369o;
    }

    /* renamed from: getText */
    public java.lang.String m21497xfb85ada3() {
        return this.f127366i;
    }

    /* renamed from: getTextColor */
    public int m21498xc0089f80() {
        return this.f127370p;
    }

    /* renamed from: getTextSize */
    public float m21499x40077844() {
        return this.f127371q;
    }

    /* renamed from: getTypeface */
    public android.graphics.Typeface m21500x5392760d() {
        return this.f127361d.getTypeface();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        xb.e eVar = this.f127363f;
        java.util.ArrayList arrayList = eVar.f534397a;
        int size = arrayList.size();
        float f17 = 0.0f;
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            dVar.a();
            f17 += dVar.f534391l;
        }
        xb.f fVar = this.f127362e;
        float f18 = fVar.f534403c;
        int i18 = this.f127369o;
        android.graphics.Rect rect = this.f127365h;
        int width = rect.width();
        int height = rect.height();
        float f19 = (i18 & 16) == 16 ? rect.top + ((height - f18) / 2.0f) : 0.0f;
        float f27 = (i18 & 1) == 1 ? rect.left + ((width - f17) / 2.0f) : 0.0f;
        if ((i18 & 48) == 48) {
            f19 = 0.0f;
        }
        if ((i18 & 80) == 80) {
            f19 = rect.top + (height - f18);
        }
        if ((i18 & 8388611) == 8388611) {
            f27 = 0.0f;
        }
        if ((i18 & 8388613) == 8388613) {
            f27 = rect.left + (width - f17);
        }
        canvas.translate(f27, f19);
        canvas.clipRect(0.0f, 0.0f, f17, f18);
        canvas.translate(0.0f, fVar.f534404d);
        android.graphics.Paint paint = this.f127361d;
        java.util.ArrayList arrayList2 = eVar.f534397a;
        int size2 = arrayList2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            xb.d dVar2 = (xb.d) arrayList2.get(i19);
            if (dVar2.b(canvas, paint, dVar2.f534384e, dVar2.f534387h, dVar2.f534388i)) {
                int i27 = dVar2.f534387h;
                if (i27 >= 0) {
                    dVar2.f534382c = dVar2.f534384e[i27];
                }
                dVar2.f534394o = dVar2.f534388i;
            }
            dVar2.b(canvas, paint, dVar2.f534384e, dVar2.f534387h + 1, dVar2.f534388i - dVar2.f534389j);
            dVar2.b(canvas, paint, dVar2.f534384e, dVar2.f534387h - 1, dVar2.f534388i + dVar2.f534389j);
            dVar2.a();
            canvas.translate(dVar2.f534391l, 0.0f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        this.f127367m = b();
        this.f127368n = ((int) this.f127362e.f534403c) + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(android.view.View.resolveSize(this.f127367m, i17), android.view.View.resolveSize(this.f127368n, i18));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f127365h.set(getPaddingLeft(), getPaddingTop(), i17 - getPaddingRight(), i18 - getPaddingBottom());
    }

    /* renamed from: setAnimateMeasurementChange */
    public void m21501xd205842d(boolean z17) {
        this.f127376v = z17;
    }

    /* renamed from: setAnimationDelay */
    public void m21502x5ec97561(long j17) {
        this.f127373s = j17;
    }

    /* renamed from: setAnimationDuration */
    public void m21503xce929cf6(long j17) {
        this.f127374t = j17;
    }

    /* renamed from: setAnimationInterpolator */
    public void m21504xc9e61729(android.view.animation.Interpolator interpolator) {
        this.f127375u = interpolator;
    }

    /* renamed from: setCharacterLists */
    public void m21505xcac67eee(java.lang.String... strArr) {
        xb.e eVar = this.f127363f;
        eVar.getClass();
        eVar.f534399c = new xb.c[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            eVar.f534399c[i17] = new xb.c(strArr[i17]);
        }
        eVar.f534400d = new java.util.HashSet();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            eVar.f534400d.addAll(((java.util.HashMap) eVar.f534399c[i18].f534379c).keySet());
        }
        java.lang.String str = this.f127377w;
        if (str != null) {
            d(str, false);
            this.f127377w = null;
        }
    }

    /* renamed from: setGravity */
    public void m21506xc1f6fb8c(int i17) {
        if (this.f127369o != i17) {
            this.f127369o = i17;
            invalidate();
        }
    }

    /* renamed from: setPreferredScrollingDirection */
    public void m21507x6fe7f1a9(xb.i iVar) {
        this.f127362e.f534405e = iVar;
    }

    /* renamed from: setText */
    public void m21508x765074af(java.lang.String str) {
        d(str, !android.text.TextUtils.isEmpty(this.f127366i));
    }

    /* renamed from: setTextColor */
    public void m21509x1c5c5ff4(int i17) {
        if (this.f127370p != i17) {
            this.f127370p = i17;
            this.f127361d.setColor(i17);
            invalidate();
        }
    }

    /* renamed from: setTextSize */
    public void m21510x3abfd950(float f17) {
        if (this.f127371q != f17) {
            this.f127371q = f17;
            this.f127361d.setTextSize(f17);
            xb.f fVar = this.f127362e;
            ((java.util.HashMap) fVar.f534402b).clear();
            android.graphics.Paint.FontMetrics fontMetrics = fVar.f534401a.getFontMetrics();
            float f18 = fontMetrics.bottom;
            float f19 = fontMetrics.top;
            fVar.f534403c = f18 - f19;
            fVar.f534404d = -f19;
            a();
            invalidate();
        }
    }

    /* renamed from: setTypeface */
    public void m21511x4e4ad719(android.graphics.Typeface typeface) {
        int i17 = this.f127372r;
        if (i17 == 3) {
            typeface = android.graphics.Typeface.create(typeface, 3);
        } else if (i17 == 1) {
            typeface = android.graphics.Typeface.create(typeface, 1);
        } else if (i17 == 2) {
            typeface = android.graphics.Typeface.create(typeface, 2);
        }
        this.f127361d.setTypeface(typeface);
        xb.f fVar = this.f127362e;
        ((java.util.HashMap) fVar.f534402b).clear();
        android.graphics.Paint.FontMetrics fontMetrics = fVar.f534401a.getFontMetrics();
        float f17 = fontMetrics.bottom;
        float f18 = fontMetrics.top;
        fVar.f534403c = f17 - f18;
        fVar.f534404d = -f18;
        a();
        invalidate();
    }

    public C2885xf34260ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f127361d = textPaint;
        xb.f fVar = new xb.f(textPaint);
        this.f127362e = fVar;
        this.f127363f = new xb.e(fVar);
        this.f127364g = android.animation.ValueAnimator.ofFloat(1.0f);
        this.f127365h = new android.graphics.Rect();
        c(context, attributeSet, i17, 0);
    }
}
