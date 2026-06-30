package mm0;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: s, reason: collision with root package name */
    public static final mm0.f f410111s = new mm0.f(3);

    /* renamed from: t, reason: collision with root package name */
    public static final android.text.SpannableString f410112t = new android.text.SpannableString("");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f410113a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f410114b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f410115c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f410116d = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.text.TextPaint f410117e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f410118f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.text.Layout.Alignment f410119g = android.text.Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: h, reason: collision with root package name */
    public int f410120h = 51;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f410121i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f410122j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f410123k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public android.text.TextDirectionHeuristic f410124l = null;

    /* renamed from: m, reason: collision with root package name */
    public float f410125m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f410126n = 1.1f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f410127o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f410128p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f410129q = -1;

    /* renamed from: r, reason: collision with root package name */
    public android.text.InputFilter.LengthFilter f410130r = null;

    public static mm0.e c() {
        mm0.e eVar;
        mm0.f fVar = f410111s;
        synchronized (fVar.f410133c) {
            int i17 = fVar.f410132b;
            eVar = null;
            if (i17 > 0) {
                int i18 = i17 - 1;
                mm0.e[] eVarArr = fVar.f410131a;
                mm0.e eVar2 = eVarArr[i18];
                eVarArr[i18] = null;
                fVar.f410132b = i18;
                eVar = eVar2;
            }
        }
        return eVar == null ? new mm0.e() : eVar;
    }

    public static mm0.e d(java.lang.CharSequence charSequence, int i17, nm0.a aVar) {
        if (charSequence == null) {
            charSequence = "";
        }
        int length = charSequence.length();
        mm0.e c17 = c();
        c17.f410113a = charSequence.toString();
        c17.f410114b = charSequence;
        c17.f410115c = 0;
        c17.f410116d = length;
        c17.f410118f = i17;
        c17.f410117e = new android.text.TextPaint();
        int i18 = aVar.f419984a;
        if (i18 != -1 && i18 >= 0) {
            c17.f410123k = i18;
        }
        int i19 = aVar.f419986c;
        if (i19 != -1 && i19 >= 0) {
            c17.f410128p = i19;
            c17.f410130r = new android.text.InputFilter.LengthFilter(c17.f410128p);
        }
        android.text.Layout.Alignment alignment = aVar.f419988e;
        if (alignment != null) {
            c17.f410119g = alignment;
        }
        android.text.TextUtils.TruncateAt truncateAt = aVar.f419989f;
        if (truncateAt != null) {
            c17.f410121i = truncateAt;
        }
        c17.f410120h = aVar.f419990g;
        int i27 = aVar.f419991h;
        if (i27 != -1 && i27 >= 0) {
            c17.f410122j = i27;
        }
        float f17 = aVar.f419992i;
        float f18 = aVar.f419993j;
        c17.f410125m = f17;
        c17.f410126n = f18;
        c17.f410127o = false;
        float f19 = aVar.f419995l;
        if (f19 != -1.0f) {
            c17.f410117e.setTextSize(f19);
        }
        int i28 = aVar.f419996m;
        if (i28 != -1) {
            c17.f410117e.setColor(i28);
        }
        int i29 = aVar.f419997n;
        if (i29 != -1) {
            c17.f410117e.linkColor = i29;
        }
        android.text.TextPaint textPaint = aVar.f419987d;
        if (textPaint != null) {
            c17.f410117e = textPaint;
        }
        int i37 = aVar.f419998o;
        if (i37 >= 0 && i37 >= 0) {
            c17.f410129q = i37;
        }
        return c17;
    }

    public mm0.g a() {
        int i17;
        int i18;
        android.text.StaticLayout staticLayout;
        android.text.InputFilter.LengthFilter lengthFilter;
        android.text.TextUtils.TruncateAt truncateAt = this.f410121i;
        if (truncateAt == null || (i17 = this.f410122j) <= 0) {
            i17 = this.f410118f;
        }
        if (truncateAt == null && this.f410123k == 1) {
            this.f410121i = android.text.TextUtils.TruncateAt.END;
        }
        if (this.f410128p > 0 && (lengthFilter = this.f410130r) != null) {
            java.lang.CharSequence charSequence = this.f410114b;
            java.lang.CharSequence filter = lengthFilter.filter(charSequence, 0, charSequence.length(), f410112t, 0, 0);
            if (filter != null) {
                this.f410114b = filter;
                if (this.f410116d > filter.length()) {
                    this.f410116d = this.f410114b.length();
                }
            }
        }
        android.text.Layout.Alignment alignment = this.f410119g;
        android.text.Layout.Alignment alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
        if (alignment == alignment2) {
            int i19 = this.f410120h & 8388615;
            if (i19 != 1) {
                if (i19 != 3) {
                    if (i19 != 5) {
                        if (i19 != 8388611) {
                            if (i19 != 8388613) {
                                this.f410119g = alignment2;
                            }
                        }
                    }
                    this.f410119g = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                }
                this.f410119g = alignment2;
            } else {
                this.f410119g = android.text.Layout.Alignment.ALIGN_CENTER;
            }
        }
        this.f410117e.setAntiAlias(true);
        boolean z17 = false;
        boolean z18 = (this.f410124l == null || (fp.h.c(18) && this.f410124l == android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) && ((i18 = this.f410123k) == Integer.MAX_VALUE || i18 == -1);
        try {
            staticLayout = b(this.f410114b, z18, i17, this.f410129q);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaticTextView.StaticLayoutBuilder", "build static layout error: %s", e17.getMessage());
            android.text.StaticLayout staticLayout2 = null;
            int i27 = 0;
            while (i27 < 3) {
                try {
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f410114b);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), android.text.style.MetricAffectingSpan.class);
                    if (metricAffectingSpanArr == null || metricAffectingSpanArr.length <= 0) {
                        i27 = 100;
                    } else {
                        spannableStringBuilder.insert(spannableStringBuilder.getSpanStart(metricAffectingSpanArr[0]) - 1, (java.lang.CharSequence) " ");
                        i27++;
                    }
                    this.f410114b = spannableStringBuilder;
                    staticLayout2 = b(spannableStringBuilder, z18, i17, this.f410129q);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaticTextView.StaticLayoutBuilder", "fix from build static layout, fixCount: %s", java.lang.Integer.valueOf(i27));
                    break;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StaticTextView.StaticLayoutBuilder", "fix, build static layout error: %s, fixCount: %s", e18.getMessage(), java.lang.Integer.valueOf(i27));
                }
            }
            staticLayout = staticLayout2;
        }
        if (staticLayout == null) {
            java.lang.String charSequence2 = this.f410114b.toString();
            this.f410114b = charSequence2;
            staticLayout = b(charSequence2, z18, i17, this.f410129q);
        }
        mm0.g gVar = new mm0.g(staticLayout);
        gVar.f410137d = this.f410113a;
        gVar.f410138e = this.f410114b;
        gVar.f410136c = this.f410128p;
        gVar.f410135b = this.f410123k;
        gVar.f410140g = this.f410119g;
        gVar.f410141h = this.f410121i;
        gVar.f410139f = this.f410117e;
        gVar.f410142i = this.f410120h;
        gVar.f410143j = this.f410129q;
        mm0.f fVar = f410111s;
        synchronized (fVar.f410133c) {
            int i28 = 0;
            while (true) {
                if (i28 >= fVar.f410132b) {
                    break;
                }
                if (fVar.f410131a[i28] == this) {
                    z17 = true;
                    break;
                }
                i28++;
            }
            if (z17) {
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
            e();
            int i29 = fVar.f410132b;
            mm0.e[] eVarArr = fVar.f410131a;
            if (i29 < eVarArr.length) {
                eVarArr[i29] = this;
                fVar.f410132b = i29 + 1;
            }
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final android.text.StaticLayout b(java.lang.CharSequence charSequence, boolean z17, int i17, int i18) {
        java.lang.Object obj;
        java.lang.reflect.Constructor constructor;
        int i19;
        android.text.TextUtils.TruncateAt truncateAt;
        if (i18 >= 0) {
            return android.text.StaticLayout.Builder.obtain(charSequence, this.f410115c, this.f410116d, this.f410117e, this.f410118f).setAlignment(this.f410119g).setTextDirection(android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(this.f410125m, this.f410126n).setIncludePad(this.f410127o).setEllipsize(this.f410121i).setEllipsizedWidth(i17).setBreakStrategy(i18).setMaxLines(Integer.MAX_VALUE).build();
        }
        if (z17 != 0) {
            return new android.text.StaticLayout(charSequence, this.f410115c, this.f410116d, this.f410117e, this.f410118f, this.f410119g, this.f410126n, this.f410125m, this.f410127o, this.f410121i, i17);
        }
        if (this.f410124l == null) {
            this.f410124l = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        int i27 = this.f410115c;
        int i28 = this.f410116d;
        android.text.TextPaint textPaint = this.f410117e;
        int i29 = this.f410118f;
        android.text.Layout.Alignment alignment = this.f410119g;
        android.text.TextDirectionHeuristic textDirectionHeuristic = this.f410124l;
        float f17 = this.f410126n;
        float f18 = this.f410125m;
        boolean z18 = this.f410127o;
        android.text.TextUtils.TruncateAt truncateAt2 = this.f410121i;
        int i37 = this.f410123k;
        synchronized (om0.a.class) {
            try {
                try {
                    synchronized (om0.a.class) {
                        try {
                            java.lang.Object obj2 = om0.a.f427793b;
                            try {
                                if (obj2 == null) {
                                    try {
                                        try {
                                            try {
                                                obj2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                                om0.a.f427793b = obj2;
                                            } catch (java.lang.NoSuchFieldException e17) {
                                                e = e17;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristics.FIRSTSTRONG_LTR not found.", new java.lang.Object[0]);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                                throw new java.lang.RuntimeException(e);
                                            }
                                        } catch (java.lang.IllegalAccessException e18) {
                                            e = e18;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristics.FIRSTSTRONG_LTR not accessible.", new java.lang.Object[0]);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                            throw new java.lang.RuntimeException(e);
                                        }
                                    } catch (java.lang.ClassNotFoundException e19) {
                                        e = e19;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristic class not found.", new java.lang.Object[0]);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                        throw new java.lang.RuntimeException(e);
                                    } catch (java.lang.Throwable th6) {
                                        e = th6;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "Other error.", new java.lang.Object[0]);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "#tryGetTextDirection fail, error: " + e.getMessage());
                                        throw new java.lang.RuntimeException(e);
                                    }
                                }
                                obj = obj2;
                                synchronized (om0.a.class) {
                                    constructor = om0.a.f427792a;
                                    if (constructor != null) {
                                        truncateAt = truncateAt2;
                                        i19 = i37;
                                    } else {
                                        if (android.os.Build.VERSION.SDK_INT >= 29) {
                                            truncateAt = truncateAt2;
                                            i19 = i37;
                                        } else {
                                            i19 = i37;
                                            try {
                                                java.lang.Class cls = java.lang.Integer.TYPE;
                                                java.lang.Class cls2 = java.lang.Float.TYPE;
                                                java.lang.reflect.Constructor declaredConstructor = android.text.StaticLayout.class.getDeclaredConstructor(java.lang.CharSequence.class, cls, cls, android.text.TextPaint.class, cls, android.text.Layout.Alignment.class, android.text.TextDirectionHeuristic.class, cls2, cls2, java.lang.Boolean.TYPE, android.text.TextUtils.TruncateAt.class, cls, cls);
                                                om0.a.f427792a = declaredConstructor;
                                                declaredConstructor.setAccessible(true);
                                                truncateAt = truncateAt2;
                                                e = null;
                                            } catch (java.lang.ClassNotFoundException e27) {
                                                e = e27;
                                                truncateAt = truncateAt2;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "TextDirectionHeuristic class not found.", new java.lang.Object[0]);
                                            } catch (java.lang.NoSuchMethodException e28) {
                                                e = e28;
                                                truncateAt = truncateAt2;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "StaticLayout constructor with max lines not found.", new java.lang.Object[0]);
                                            } catch (java.lang.Throwable th7) {
                                                e = th7;
                                                truncateAt = truncateAt2;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("StaticTextView.StaticLayoutWithMaxLines", e, "Other error.", new java.lang.Object[0]);
                                            }
                                            if (e != null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "create StaticLayout constructor fail: " + e.getMessage());
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StaticTextView.StaticLayoutWithMaxLines", "use builtin StaticLayout.Builder as fallback!");
                                            } else {
                                                constructor = om0.a.f427792a;
                                            }
                                        }
                                        constructor = null;
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                throw th;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                    }
                    if (constructor == null) {
                        return android.text.StaticLayout.Builder.obtain(charSequence, i27, i28, textPaint, i29).setAlignment(alignment).setTextDirection((android.text.TextDirectionHeuristic) obj).setLineSpacing(f18, f17).setIncludePad(z18).setEllipsizedWidth(i17).setEllipsize(truncateAt).setMaxLines(i19).build();
                    }
                    return (android.text.StaticLayout) constructor.newInstance(charSequence, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), textPaint, java.lang.Integer.valueOf(i29), alignment, textDirectionHeuristic, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Boolean.valueOf(z18), truncateAt, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                } catch (java.lang.Exception e29) {
                    e = e29;
                    z17 = "Error creating StaticLayout with max lines: ";
                    throw new java.lang.IllegalStateException(z17 + e.getCause());
                }
            } catch (java.lang.Exception e37) {
                e = e37;
                throw new java.lang.IllegalStateException(z17 + e.getCause());
            }
        }
    }

    public void e() {
        this.f410113a = null;
        this.f410114b = null;
        this.f410115c = 0;
        this.f410116d = 0;
        this.f410117e = new android.text.TextPaint();
        this.f410118f = 0;
        this.f410119g = android.text.Layout.Alignment.ALIGN_NORMAL;
        this.f410120h = 51;
        this.f410121i = null;
        this.f410122j = 0;
        this.f410123k = Integer.MAX_VALUE;
        this.f410124l = null;
        this.f410125m = 0.0f;
        this.f410126n = 1.0f;
        this.f410127o = false;
        this.f410128p = 0;
        this.f410130r = null;
        this.f410129q = -1;
    }
}
