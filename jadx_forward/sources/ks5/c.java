package ks5;

/* loaded from: classes15.dex */
public abstract class c implements ks5.a {

    /* renamed from: J, reason: collision with root package name */
    public static final char[] f393337J;
    public static final java.lang.String K;
    public java.util.LinkedList E;
    public boolean[] F;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f393338a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f393339b;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f393340c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f393341d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f393342e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f393343f;

    /* renamed from: l, reason: collision with root package name */
    public float f393349l;

    /* renamed from: m, reason: collision with root package name */
    public float f393350m;

    /* renamed from: n, reason: collision with root package name */
    public float f393351n;

    /* renamed from: o, reason: collision with root package name */
    public float f393352o;

    /* renamed from: p, reason: collision with root package name */
    public float f393353p;

    /* renamed from: q, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f393354q;

    /* renamed from: s, reason: collision with root package name */
    public int f393356s;

    /* renamed from: u, reason: collision with root package name */
    public float[] f393358u;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f393344g = new float[12];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f393345h = new float[6];

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f393346i = new java.util.HashMap(12);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f393347j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f393348k = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public int f393355r = 0;

    /* renamed from: t, reason: collision with root package name */
    public final android.text.TextPaint f393357t = new android.text.TextPaint();

    /* renamed from: v, reason: collision with root package name */
    public final ks5.e f393359v = new ks5.e(android.text.style.ImageSpan.class);

    /* renamed from: w, reason: collision with root package name */
    public final ks5.e f393360w = new ks5.e(android.text.style.LineHeightSpan.class);

    /* renamed from: x, reason: collision with root package name */
    public final ks5.e f393361x = new ks5.e(android.text.style.AbsoluteSizeSpan.class);

    /* renamed from: y, reason: collision with root package name */
    public final ks5.e f393362y = new ks5.e(android.text.style.RelativeSizeSpan.class);

    /* renamed from: z, reason: collision with root package name */
    public final ks5.e f393363z = new ks5.e(android.text.style.BackgroundColorSpan.class);
    public final ks5.e A = new ks5.e(android.text.style.ForegroundColorSpan.class);
    public final ks5.e B = new ks5.e(android.text.style.ClickableSpan.class);
    public final ks5.e C = new ks5.e(android.text.style.LineBackgroundSpan.class);
    public float D = 0.0f;
    public int G = 0;
    public int H = 0;
    public int I = 0;

    static {
        char[] cArr = {8230};
        f393337J = cArr;
        K = new java.lang.String(cArr);
    }

    public c(java.lang.CharSequence charSequence, float[] fArr) {
        this.f393338a = charSequence;
        java.lang.String charSequence2 = charSequence.toString();
        this.f393339b = charSequence2;
        this.f393340c = charSequence2.toCharArray();
        if (fArr != null) {
            float[] fArr2 = new float[fArr.length];
            this.f393342e = fArr2;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        }
    }

    @Override // ks5.a
    public int a(int i17) {
        ks5.b bVar;
        java.util.ArrayList arrayList = this.f393347j;
        int size = arrayList.size();
        if (size > i17) {
            bVar = (ks5.b) arrayList.get(i17);
        } else {
            if (size <= 0) {
                return 0;
            }
            bVar = (ks5.b) arrayList.get(size - 1);
        }
        return (int) ((ks5.d) bVar).f393378t.top;
    }

    @Override // ks5.a
    public int b(int i17) {
        java.util.ArrayList arrayList = this.f393347j;
        return arrayList.size() > i17 ? ((ks5.d) ((ks5.b) arrayList.get(i17))).f393367f : this.f393340c.length;
    }

    @Override // ks5.a
    public int c(int i17) {
        ks5.b bVar;
        java.util.ArrayList arrayList = this.f393347j;
        int size = arrayList.size();
        if (size <= i17) {
            if (size > 0) {
                bVar = (ks5.b) arrayList.get(size - 1);
            }
            return 0;
        }
        bVar = (ks5.b) arrayList.get(i17);
        if (((int) ((ks5.d) bVar).f393381w) >= 0) {
            return (int) ((ks5.d) bVar).f393381w;
        }
        return 0;
    }

    @Override // ks5.a
    public int e(int i17) {
        ks5.b bVar;
        java.util.ArrayList arrayList = this.f393347j;
        int size = arrayList.size();
        if (size > i17) {
            bVar = (ks5.b) arrayList.get(i17);
        } else {
            if (size <= 0) {
                return 0;
            }
            bVar = (ks5.b) arrayList.get(size - 1);
        }
        return (int) ((ks5.d) bVar).f393378t.bottom;
    }

    @Override // ks5.a
    public float f(int i17) {
        int n17 = n(i17);
        if (n17 < 0) {
            return 0.0f;
        }
        java.util.ArrayList arrayList = this.f393347j;
        if (arrayList.size() > n17) {
            return ((ks5.d) ((ks5.b) arrayList.get(n17))).c(i17);
        }
        return 0.0f;
    }

    @Override // ks5.a
    public int g(int i17, float f17) {
        float f18 = f17 - this.f393350m;
        java.util.ArrayList arrayList = this.f393347j;
        if (arrayList.size() <= i17) {
            return 0;
        }
        return ((ks5.d) ((ks5.b) arrayList.get(i17))).b((int) f18, 0);
    }

    @Override // ks5.a
    public int h(int i17) {
        int i18 = (int) (i17 - this.f393351n);
        java.util.Iterator it = this.f393347j.iterator();
        int i19 = 0;
        float f17 = 0.0f;
        while (it.hasNext()) {
            ks5.b bVar = (ks5.b) it.next();
            if (f17 == 0.0f) {
                f17 = ((ks5.d) bVar).f393379u.top;
            }
            android.graphics.RectF rectF = ((ks5.d) bVar).f393379u;
            if (rectF.contains(rectF.centerX(), i18)) {
                return i19;
            }
            i19++;
        }
        if (i18 <= f17) {
            return 0;
        }
        return i19 - 1;
    }

    @Override // ks5.a
    public float i(int i17) {
        java.util.ArrayList arrayList = this.f393347j;
        if (arrayList.size() > i17) {
            return ((ks5.d) ((ks5.b) arrayList.get(i17))).f393378t.right;
        }
        return 0.0f;
    }

    @Override // ks5.a
    public int j(int i17) {
        if (this.I == i17) {
            return this.G;
        }
        return 0;
    }

    @Override // ks5.a
    public int k(int i17, int i18) {
        int i19 = (int) (i17 - this.f393350m);
        int i27 = (int) (i18 - this.f393351n);
        java.util.Iterator it = this.f393347j.iterator();
        while (it.hasNext()) {
            ks5.b bVar = (ks5.b) it.next();
            if (((ks5.d) bVar).f393379u.contains(i19, i27)) {
                return ((ks5.d) bVar).b(i19, i27);
            }
        }
        return this.f393340c.length;
    }

    @Override // ks5.a
    public int l(int i17) {
        if (this.I == i17) {
            return this.H;
        }
        return 0;
    }

    @Override // ks5.a
    public java.util.List m() {
        if (this.E == null) {
            this.E = new java.util.LinkedList();
            java.util.Iterator it = this.f393348k.iterator();
            while (it.hasNext()) {
                js5.b bVar = (js5.b) it.next();
                if (bVar.getClass() == js5.c.class) {
                    this.E.add((js5.c) bVar);
                }
            }
        }
        return this.E;
    }

    @Override // ks5.a
    public int n(int i17) {
        java.util.Iterator it = this.f393347j.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            ks5.b bVar = (ks5.b) it.next();
            if (((ks5.d) bVar).f393367f <= i17 && i17 < ((ks5.d) bVar).f393368g) {
                return i18;
            }
            i18++;
        }
        if (i18 > 0) {
            return i18 - 1;
        }
        return 0;
    }

    @Override // ks5.a
    public float o(int i17) {
        java.util.ArrayList arrayList = this.f393347j;
        int size = arrayList.size();
        if (size <= 0 || size <= i17) {
            return 0.0f;
        }
        return ((ks5.d) ((ks5.b) arrayList.get(i17))).f393378t.width();
    }

    public abstract void p(android.text.TextPaint textPaint, float[] fArr, float f17, float f18, float f19, int i17, android.text.TextUtils.TruncateAt truncateAt, boolean z17);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.text.TextUtils.TruncateAt r8, float r9, android.text.TextPaint r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks5.c.q(android.text.TextUtils$TruncateAt, float, android.text.TextPaint):void");
    }

    public final void r(android.text.TextPaint textPaint, float f17, float f18, float f19, float f27, float f28, int i17, android.text.TextUtils.TruncateAt truncateAt, float f29, boolean z17, int i18) {
        this.f393341d = new android.text.TextPaint(textPaint);
        this.f393353p = f29;
        this.f393349l = f17;
        this.f393350m = f19;
        this.f393351n = f27;
        this.f393355r = i17;
        this.f393354q = truncateAt;
        this.f393352o = f28;
        this.f393358u = null;
        this.f393356s = i18;
        java.lang.CharSequence charSequence = this.f393338a;
        int length = charSequence.length();
        if (this.f393342e == null) {
            float[] fArr = new float[length];
            this.f393342e = fArr;
            textPaint.getTextWidths(this.f393339b, fArr);
        }
        boolean[] zArr = new boolean[length];
        this.F = zArr;
        u(charSequence, textPaint, zArr);
        v(textPaint);
        p(textPaint, new float[0], f17, f18, f28, i17, truncateAt, z17);
        q(truncateAt, f29, textPaint);
    }

    public final void s(android.text.TextPaint textPaint, float[] fArr, float f17, float f18, float f19, float f27, float f28, int i17, android.text.TextUtils.TruncateAt truncateAt, float f29, boolean z17, int i18) {
        this.f393341d = new android.text.TextPaint(textPaint);
        this.f393353p = f29;
        this.f393349l = f17;
        this.f393350m = f19;
        this.f393351n = f27;
        this.f393355r = i17;
        this.f393354q = truncateAt;
        this.f393352o = f28;
        this.f393358u = null;
        this.f393356s = i18;
        java.lang.CharSequence charSequence = this.f393338a;
        int length = charSequence.length();
        if (this.f393342e == null) {
            float[] fArr2 = new float[length];
            this.f393342e = fArr2;
            textPaint.getTextWidths(this.f393339b, fArr2);
        }
        boolean[] zArr = new boolean[length];
        this.F = zArr;
        u(charSequence, textPaint, zArr);
        v(textPaint);
        float[] fArr3 = new float[fArr.length];
        for (int i19 = 0; i19 < fArr.length; i19++) {
            fArr3[i19] = f17 - fArr[i19];
        }
        p(textPaint, fArr3, f17, f18, f28, i17, truncateAt, z17);
        q(truncateAt, f29, textPaint);
    }

    public float[] t() {
        if (this.f393358u == null) {
            java.util.Iterator it = this.f393347j.iterator();
            float f17 = 0.0f;
            float f18 = 0.0f;
            while (it.hasNext()) {
                ks5.b bVar = (ks5.b) it.next();
                if (f17 < ((ks5.d) bVar).f393374p) {
                    f17 = ((ks5.d) bVar).f393374p;
                }
                f18 += ((ks5.d) bVar).f393373o;
            }
            this.f393358u = new float[]{f17, f18};
        }
        return this.f393358u;
    }

    public void u(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, boolean[] zArr) {
        java.util.LinkedList linkedList;
        boolean z17 = charSequence instanceof android.text.Spanned;
        ks5.e eVar = this.B;
        ks5.e eVar2 = this.f393363z;
        ks5.e eVar3 = this.f393360w;
        ks5.e eVar4 = this.f393359v;
        ks5.e eVar5 = this.f393362y;
        ks5.e eVar6 = this.f393361x;
        if (z17) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            int length = charSequence.length();
            eVar4.b(spanned, 0, length);
            eVar3.b(spanned, 0, length);
            eVar6.b(spanned, 0, length);
            eVar5.b(spanned, 0, length);
            this.A.b(spanned, 0, length);
            eVar2.b(spanned, 0, length);
            eVar.b(spanned, 0, length);
            this.C.b(spanned, 0, length);
        }
        android.text.TextPaint textPaint2 = this.f393357t;
        textPaint2.set(textPaint);
        for (int i17 = 0; i17 < eVar6.f393383b; i17++) {
            ((android.text.style.AbsoluteSizeSpan[]) eVar6.f393384c)[i17].updateMeasureState(textPaint2);
            int i18 = eVar6.f393385d[i17];
            int i19 = eVar6.f393386e[i17];
            int i27 = i19 - i18;
            float[] fArr = new float[i27];
            textPaint2.getTextWidths(charSequence, i18, i19, fArr);
            java.lang.System.arraycopy(fArr, 0, this.f393342e, i18, i27);
            if (this.f393343f == null) {
                this.f393343f = new float[charSequence.length()];
            }
            float[] fArr2 = this.f393343f;
            fArr2[i18] = java.lang.Math.max(fArr2[i18], textPaint2.getTextSize());
        }
        for (int i28 = 0; i28 < eVar5.f393383b; i28++) {
            ((android.text.style.RelativeSizeSpan[]) eVar5.f393384c)[i28].updateMeasureState(textPaint2);
            int i29 = eVar5.f393385d[i28];
            int i37 = eVar5.f393386e[i28];
            int i38 = i37 - i29;
            float[] fArr3 = new float[i38];
            textPaint2.getTextWidths(charSequence, i29, i37, fArr3);
            java.lang.System.arraycopy(fArr3, 0, this.f393342e, i29, i38);
            if (this.f393343f == null) {
                this.f393343f = new float[charSequence.length()];
            }
            float[] fArr4 = this.f393343f;
            fArr4[i29] = java.lang.Math.max(fArr4[i29], textPaint2.getTextSize());
        }
        for (int i39 = 0; i39 < eVar3.f393383b; i39++) {
            android.text.style.LineHeightSpan lineHeightSpan = ((android.text.style.LineHeightSpan[]) eVar3.f393384c)[i39];
            int i47 = eVar3.f393385d[i39];
            int i48 = eVar3.f393386e[i39];
            if (this.f393343f == null) {
                this.f393343f = new float[charSequence.length()];
            }
            lineHeightSpan.chooseHeight(charSequence, i47, i48, 0, 0, this.f393341d.getFontMetricsInt());
            float[] fArr5 = this.f393343f;
            fArr5[i47] = java.lang.Math.max(fArr5[i47], r7.descent - r7.ascent);
        }
        for (int i49 = 0; i49 < eVar4.f393383b; i49++) {
            android.text.style.ImageSpan imageSpan = ((android.text.style.ImageSpan[]) eVar4.f393384c)[i49];
            int i57 = eVar4.f393385d[i49];
            int i58 = eVar4.f393386e[i49] - i57;
            android.graphics.drawable.Drawable drawable = imageSpan.getDrawable();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (drawable != null) {
                rect.set(drawable.getBounds());
            }
            this.f393342e[i57] = imageSpan.getSize(textPaint, charSequence, i57, r5, null);
            zArr[i57] = true;
            for (int i59 = i57 + 1; i59 < i57 + i58; i59++) {
                float[] fArr6 = this.f393342e;
                if (i59 >= fArr6.length) {
                    break;
                }
                fArr6[i59] = 0.0f;
                zArr[i59] = true;
            }
            if (this.f393343f == null) {
                this.f393343f = new float[charSequence.length()];
            }
            android.graphics.Paint.FontMetrics fontMetrics = this.f393341d.getFontMetrics();
            float f17 = fontMetrics.bottom - fontMetrics.top;
            float[] fArr7 = this.f393343f;
            fArr7[i57] = java.lang.Math.max(fArr7[i57], java.lang.Math.max(f17, rect.height()));
        }
        int i66 = 0;
        while (true) {
            int i67 = eVar2.f393383b;
            linkedList = this.f393348k;
            if (i66 >= i67) {
                break;
            }
            linkedList.add(new js5.a(eVar2.f393385d[i66], eVar2.f393386e[i66], ((android.text.style.BackgroundColorSpan[]) eVar2.f393384c)[i66]));
            i66++;
        }
        for (int i68 = 0; i68 < eVar.f393383b; i68++) {
            linkedList.add(new js5.c(eVar.f393385d[i68], eVar.f393386e[i68], ((android.text.style.ClickableSpan[]) eVar.f393384c)[i68]));
        }
    }

    public final void v(android.graphics.Paint paint) {
        java.util.HashMap hashMap = this.f393346i;
        hashMap.clear();
        android.graphics.Rect rect = new android.graphics.Rect();
        char[] cArr = is5.a.f376015a;
        int i17 = 0;
        for (int i18 = 0; i18 < 12; i18++) {
            char c17 = cArr[i18];
            float measureText = paint.measureText(c17 + "");
            paint.getTextBounds(c17 + "", 0, 1, rect);
            this.f393344g[i17] = measureText - ((float) rect.right);
            i17++;
        }
        char[] cArr2 = is5.a.f376016b;
        int i19 = 0;
        for (int i27 = 0; i27 < 6; i27++) {
            paint.getTextBounds(cArr2[i27] + "", 0, 1, rect);
            float max = (float) java.lang.Math.max(rect.left, 0);
            this.f393345h[i19] = max;
            hashMap.put(java.lang.Character.valueOf(cArr2[i19]), java.lang.Float.valueOf(max));
            i19++;
        }
    }
}
