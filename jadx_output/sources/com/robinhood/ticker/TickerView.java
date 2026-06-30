package com.robinhood.ticker;

/* loaded from: classes15.dex */
public class TickerView extends android.view.View {

    /* renamed from: x, reason: collision with root package name */
    public static final android.view.animation.Interpolator f45827x = new android.view.animation.AccelerateDecelerateInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f45828d;

    /* renamed from: e, reason: collision with root package name */
    public final xb.f f45829e;

    /* renamed from: f, reason: collision with root package name */
    public final xb.e f45830f;

    /* renamed from: g, reason: collision with root package name */
    public final android.animation.ValueAnimator f45831g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f45832h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f45833i;

    /* renamed from: m, reason: collision with root package name */
    public int f45834m;

    /* renamed from: n, reason: collision with root package name */
    public int f45835n;

    /* renamed from: o, reason: collision with root package name */
    public int f45836o;

    /* renamed from: p, reason: collision with root package name */
    public int f45837p;

    /* renamed from: q, reason: collision with root package name */
    public float f45838q;

    /* renamed from: r, reason: collision with root package name */
    public int f45839r;

    /* renamed from: s, reason: collision with root package name */
    public long f45840s;

    /* renamed from: t, reason: collision with root package name */
    public long f45841t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Interpolator f45842u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f45843v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f45844w;

    public TickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f45828d = textPaint;
        xb.f fVar = new xb.f(textPaint);
        this.f45829e = fVar;
        this.f45830f = new xb.e(fVar);
        this.f45831g = android.animation.ValueAnimator.ofFloat(1.0f);
        this.f45832h = new android.graphics.Rect();
        c(context, attributeSet, 0, 0);
    }

    public final void a() {
        boolean z17 = this.f45834m != b();
        boolean z18 = this.f45835n != (((int) this.f45829e.f452870c) + getPaddingTop()) + getPaddingBottom();
        if (z17 || z18) {
            requestLayout();
        }
    }

    public final int b() {
        boolean z17 = this.f45843v;
        int i17 = 0;
        float f17 = 0.0f;
        xb.e eVar = this.f45830f;
        if (z17) {
            java.util.ArrayList arrayList = eVar.f452864a;
            int size = arrayList.size();
            while (i17 < size) {
                xb.d dVar = (xb.d) arrayList.get(i17);
                dVar.a();
                f17 += dVar.f452858l;
                i17++;
            }
        } else {
            java.util.ArrayList arrayList2 = eVar.f452864a;
            int size2 = arrayList2.size();
            while (i17 < size2) {
                xb.d dVar2 = (xb.d) arrayList2.get(i17);
                dVar2.a();
                f17 += dVar2.f452860n;
                i17++;
            }
        }
        return ((int) f17) + getPaddingLeft() + getPaddingRight();
    }

    public void c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        xb.j jVar = new xb.j(this, context.getResources());
        int[] iArr = xb.a.f452841a;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, i18);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            jVar.a(obtainStyledAttributes2);
            obtainStyledAttributes2.recycle();
        }
        jVar.a(obtainStyledAttributes);
        this.f45842u = f45827x;
        this.f45841t = obtainStyledAttributes.getInt(11, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
        this.f45843v = obtainStyledAttributes.getBoolean(10, false);
        this.f45836o = jVar.f452879a;
        int i19 = jVar.f452880b;
        android.graphics.Paint paint = this.f45828d;
        if (i19 != 0) {
            paint.setShadowLayer(jVar.f452883e, jVar.f452881c, jVar.f452882d, i19);
        }
        int i27 = jVar.f452887i;
        if (i27 != 0) {
            this.f45839r = i27;
            setTypeface(paint.getTypeface());
        }
        setTextColor(jVar.f452885g);
        setTextSize(jVar.f452886h);
        int i28 = obtainStyledAttributes.getInt(12, 0);
        if (i28 == 1) {
            setCharacterLists("0123456789");
        } else if (i28 == 2) {
            setCharacterLists("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        } else if (isInEditMode()) {
            setCharacterLists("0123456789");
        }
        int i29 = obtainStyledAttributes.getInt(13, 0);
        xb.f fVar = this.f45829e;
        if (i29 == 0) {
            fVar.f452872e = xb.i.ANY;
        } else if (i29 == 1) {
            fVar.f452872e = xb.i.UP;
        } else {
            if (i29 != 2) {
                throw new java.lang.IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i29);
            }
            fVar.f452872e = xb.i.DOWN;
        }
        if (this.f45830f.f452866c != null) {
            d(jVar.f452884f, false);
        } else {
            this.f45844w = jVar.f452884f;
        }
        obtainStyledAttributes.recycle();
        xb.g gVar = new xb.g(this);
        android.animation.ValueAnimator valueAnimator = this.f45831g;
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
        com.robinhood.ticker.TickerView tickerView = this;
        if (android.text.TextUtils.equals(str, tickerView.f45833i)) {
            return;
        }
        tickerView.f45833i = str;
        boolean z19 = false;
        char[] charArray = str == null ? new char[0] : str.toCharArray();
        xb.e eVar2 = tickerView.f45830f;
        if (eVar2.f452866c == null) {
            throw new java.lang.IllegalStateException("Need to call #setCharacterLists first.");
        }
        int i19 = 0;
        while (true) {
            arrayList = eVar2.f452864a;
            if (i19 >= arrayList.size()) {
                break;
            }
            xb.d dVar = (xb.d) arrayList.get(i19);
            dVar.a();
            if (dVar.f452858l > 0.0f) {
                i19++;
            } else {
                arrayList.remove(i19);
            }
        }
        int size = arrayList.size();
        char[] cArr3 = new char[size];
        for (int i27 = 0; i27 < size; i27++) {
            cArr3[i27] = ((xb.d) arrayList.get(i27)).f452849c;
        }
        java.util.Set set = eVar2.f452867d;
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
                tickerView = this;
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
                    arrayList.add(i101, new xb.d(eVar2.f452866c, eVar2.f452865b));
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
            android.animation.ValueAnimator valueAnimator = tickerView.f45831g;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.setStartDelay(tickerView.f45840s);
            valueAnimator.setDuration(tickerView.f45841t);
            valueAnimator.setInterpolator(tickerView.f45842u);
            valueAnimator.start();
            return;
        }
        eVar2.a(1.0f);
        int size4 = arrayList.size();
        for (int i105 = 0; i105 < size4; i105++) {
            xb.d dVar2 = (xb.d) arrayList.get(i105);
            dVar2.a();
            dVar2.f452860n = dVar2.f452858l;
        }
        a();
        invalidate();
    }

    public boolean getAnimateMeasurementChange() {
        return this.f45843v;
    }

    public long getAnimationDelay() {
        return this.f45840s;
    }

    public long getAnimationDuration() {
        return this.f45841t;
    }

    public android.view.animation.Interpolator getAnimationInterpolator() {
        return this.f45842u;
    }

    public int getGravity() {
        return this.f45836o;
    }

    public java.lang.String getText() {
        return this.f45833i;
    }

    public int getTextColor() {
        return this.f45837p;
    }

    public float getTextSize() {
        return this.f45838q;
    }

    public android.graphics.Typeface getTypeface() {
        return this.f45828d.getTypeface();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        xb.e eVar = this.f45830f;
        java.util.ArrayList arrayList = eVar.f452864a;
        int size = arrayList.size();
        float f17 = 0.0f;
        for (int i17 = 0; i17 < size; i17++) {
            xb.d dVar = (xb.d) arrayList.get(i17);
            dVar.a();
            f17 += dVar.f452858l;
        }
        xb.f fVar = this.f45829e;
        float f18 = fVar.f452870c;
        int i18 = this.f45836o;
        android.graphics.Rect rect = this.f45832h;
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
        canvas.translate(0.0f, fVar.f452871d);
        android.graphics.Paint paint = this.f45828d;
        java.util.ArrayList arrayList2 = eVar.f452864a;
        int size2 = arrayList2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            xb.d dVar2 = (xb.d) arrayList2.get(i19);
            if (dVar2.b(canvas, paint, dVar2.f452851e, dVar2.f452854h, dVar2.f452855i)) {
                int i27 = dVar2.f452854h;
                if (i27 >= 0) {
                    dVar2.f452849c = dVar2.f452851e[i27];
                }
                dVar2.f452861o = dVar2.f452855i;
            }
            dVar2.b(canvas, paint, dVar2.f452851e, dVar2.f452854h + 1, dVar2.f452855i - dVar2.f452856j);
            dVar2.b(canvas, paint, dVar2.f452851e, dVar2.f452854h - 1, dVar2.f452855i + dVar2.f452856j);
            dVar2.a();
            canvas.translate(dVar2.f452858l, 0.0f);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        this.f45834m = b();
        this.f45835n = ((int) this.f45829e.f452870c) + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(android.view.View.resolveSize(this.f45834m, i17), android.view.View.resolveSize(this.f45835n, i18));
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f45832h.set(getPaddingLeft(), getPaddingTop(), i17 - getPaddingRight(), i18 - getPaddingBottom());
    }

    public void setAnimateMeasurementChange(boolean z17) {
        this.f45843v = z17;
    }

    public void setAnimationDelay(long j17) {
        this.f45840s = j17;
    }

    public void setAnimationDuration(long j17) {
        this.f45841t = j17;
    }

    public void setAnimationInterpolator(android.view.animation.Interpolator interpolator) {
        this.f45842u = interpolator;
    }

    public void setCharacterLists(java.lang.String... strArr) {
        xb.e eVar = this.f45830f;
        eVar.getClass();
        eVar.f452866c = new xb.c[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            eVar.f452866c[i17] = new xb.c(strArr[i17]);
        }
        eVar.f452867d = new java.util.HashSet();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            eVar.f452867d.addAll(((java.util.HashMap) eVar.f452866c[i18].f452846c).keySet());
        }
        java.lang.String str = this.f45844w;
        if (str != null) {
            d(str, false);
            this.f45844w = null;
        }
    }

    public void setGravity(int i17) {
        if (this.f45836o != i17) {
            this.f45836o = i17;
            invalidate();
        }
    }

    public void setPreferredScrollingDirection(xb.i iVar) {
        this.f45829e.f452872e = iVar;
    }

    public void setText(java.lang.String str) {
        d(str, !android.text.TextUtils.isEmpty(this.f45833i));
    }

    public void setTextColor(int i17) {
        if (this.f45837p != i17) {
            this.f45837p = i17;
            this.f45828d.setColor(i17);
            invalidate();
        }
    }

    public void setTextSize(float f17) {
        if (this.f45838q != f17) {
            this.f45838q = f17;
            this.f45828d.setTextSize(f17);
            xb.f fVar = this.f45829e;
            ((java.util.HashMap) fVar.f452869b).clear();
            android.graphics.Paint.FontMetrics fontMetrics = fVar.f452868a.getFontMetrics();
            float f18 = fontMetrics.bottom;
            float f19 = fontMetrics.top;
            fVar.f452870c = f18 - f19;
            fVar.f452871d = -f19;
            a();
            invalidate();
        }
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        int i17 = this.f45839r;
        if (i17 == 3) {
            typeface = android.graphics.Typeface.create(typeface, 3);
        } else if (i17 == 1) {
            typeface = android.graphics.Typeface.create(typeface, 1);
        } else if (i17 == 2) {
            typeface = android.graphics.Typeface.create(typeface, 2);
        }
        this.f45828d.setTypeface(typeface);
        xb.f fVar = this.f45829e;
        ((java.util.HashMap) fVar.f452869b).clear();
        android.graphics.Paint.FontMetrics fontMetrics = fVar.f452868a.getFontMetrics();
        float f17 = fontMetrics.bottom;
        float f18 = fontMetrics.top;
        fVar.f452870c = f17 - f18;
        fVar.f452871d = -f18;
        a();
        invalidate();
    }

    public TickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f45828d = textPaint;
        xb.f fVar = new xb.f(textPaint);
        this.f45829e = fVar;
        this.f45830f = new xb.e(fVar);
        this.f45831g = android.animation.ValueAnimator.ofFloat(1.0f);
        this.f45832h = new android.graphics.Rect();
        c(context, attributeSet, i17, 0);
    }
}
