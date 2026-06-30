package com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5;

/* renamed from: com.tencent.neattextview.textview.view.NeatTextView */
/* loaded from: classes15.dex */
public class C23001x9d3a0bdc extends android.view.View implements com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a {
    public static final android.util.LruCache K = new android.util.LruCache(800);
    public static final android.os.Handler L;
    public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i A;
    public boolean B;
    public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f C;
    public int D;
    public android.text.TextUtils.TruncateAt E;
    public float F;
    public boolean G;
    public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.g H;
    public float[] I;

    /* renamed from: J, reason: collision with root package name */
    public ks5.a f296709J;

    /* renamed from: d, reason: collision with root package name */
    public ks5.c f296710d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f296711e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f296712f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.e f296713g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f296714h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f296715i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.res.ColorStateList f296716m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.res.ColorStateList f296717n;

    /* renamed from: o, reason: collision with root package name */
    public int f296718o;

    /* renamed from: p, reason: collision with root package name */
    public int f296719p;

    /* renamed from: q, reason: collision with root package name */
    public int f296720q;

    /* renamed from: r, reason: collision with root package name */
    public int f296721r;

    /* renamed from: s, reason: collision with root package name */
    public int f296722s;

    /* renamed from: t, reason: collision with root package name */
    public int f296723t;

    /* renamed from: u, reason: collision with root package name */
    public int f296724u;

    /* renamed from: v, reason: collision with root package name */
    public float f296725v;

    /* renamed from: w, reason: collision with root package name */
    public float f296726w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.CharSequence f296727x;

    /* renamed from: y, reason: collision with root package name */
    public final android.text.Spannable.Factory f296728y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.CharSequence f296729z;

    /* renamed from: com.tencent.neattextview.textview.view.NeatTextView$AdaptedTextView */
    /* loaded from: classes15.dex */
    public static class AdaptedTextView extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.d f296730g;

        public AdaptedTextView(android.content.Context context) {
            super(context, null);
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.d dVar = this.f296730g;
            if (dVar != null) {
                ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.b) dVar).f296731a.invalidate();
            }
        }

        @Override // android.view.View
        public void postInvalidate() {
            super.postInvalidate();
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.d dVar = this.f296730g;
            if (dVar != null) {
                ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.b) dVar).f296731a.postInvalidate();
            }
        }

        public AdaptedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public AdaptedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }
    }

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("PreMeasuredThread", -8);
        handlerThread.start();
        android.os.Looper looper = handlerThread.getLooper();
        if (looper != null) {
            L = new android.os.Handler(looper);
        }
    }

    public C23001x9d3a0bdc(android.content.Context context) {
        super(context);
        this.f296713g = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.e(this, null);
        this.f296720q = Integer.MAX_VALUE;
        this.f296721r = Integer.MAX_VALUE;
        this.f296722s = Integer.MAX_VALUE;
        this.f296723t = 0;
        this.f296724u = 0;
        this.f296725v = 0.0f;
        this.f296726w = 1.0f;
        this.f296727x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f296728y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWrappedTxtLayout */
    public android.text.Layout m84146xd4ef5e2b() {
        android.widget.TextView m84165x334dfae1 = m84165x334dfae1();
        if (m84165x334dfae1 != null) {
            return m84165x334dfae1.getLayout();
        }
        return null;
    }

    /* renamed from: setRawTextSize */
    private void m84147x1be6954(float f17) {
        if (f17 != this.f296714h.getTextSize()) {
            this.f296714h.setTextSize(f17);
            if (this.f296710d != null) {
                e();
                requestLayout();
                invalidate();
            }
        }
    }

    public java.lang.CharSequence a() {
        java.lang.CharSequence charSequence = this.f296727x;
        return charSequence == null ? "" : charSequence;
    }

    public void b(java.lang.CharSequence charSequence) {
        c(charSequence, android.widget.TextView.BufferType.NORMAL, null);
    }

    public void c(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.lang.Boolean bool) {
        boolean z17;
        if (charSequence == null) {
            charSequence = "";
        }
        if (bufferType == android.widget.TextView.BufferType.NORMAL) {
            charSequence = android.text.TextUtils.stringOrSpannedString(charSequence);
        } else if (bufferType == android.widget.TextView.BufferType.SPANNABLE) {
            charSequence = this.f296728y.newSpannable(charSequence);
        }
        this.f296727x = charSequence;
        boolean z18 = true;
        if (h()) {
            if (bool != null) {
                z17 = bool.booleanValue();
            } else {
                java.lang.String charSequence2 = charSequence.toString();
                android.util.LruCache lruCache = K;
                com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.h hVar = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.h) lruCache.get(f(charSequence2));
                if (hVar == null) {
                    boolean z19 = !charSequence2.matches("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$");
                    lruCache.put(f(charSequence2), new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.h(z19, null));
                    z17 = z19;
                } else {
                    z17 = hVar.f296739a;
                }
            }
            if (!z17) {
                z18 = false;
            }
        }
        this.f296711e = z18;
        if (z18) {
            if (getLayoutParams() != null) {
                m84165x334dfae1().setLayoutParams(getLayoutParams());
            }
            m84165x334dfae1().setText(charSequence, bufferType);
            this.f296727x = m84165x334dfae1().getText();
            requestLayout();
            invalidate();
        } else {
            e();
        }
        java.lang.CharSequence charSequence3 = this.f296727x;
        if (charSequence3 instanceof android.text.Spannable) {
            ((android.text.Spannable) charSequence3).setSpan(this.f296713g, 0, charSequence.length(), 18);
        }
    }

    public final void e() {
        java.lang.CharSequence charSequence;
        this.f296710d = null;
        android.os.Handler handler = L;
        if (handler != null) {
            java.lang.CharSequence charSequence2 = this.f296727x;
            if (charSequence2 == null && (charSequence = this.f296729z) != null) {
                com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.g gVar = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.g(charSequence.toString(), this.f296714h);
                this.H = gVar;
                handler.post(gVar);
            } else {
                if (charSequence2 == null) {
                    return;
                }
                com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.g gVar2 = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.g(charSequence2.toString(), this.f296714h);
                this.H = gVar2;
                handler.post(gVar2);
            }
        }
        requestLayout();
        invalidate();
    }

    public final java.lang.String f(java.lang.String str) {
        return str + "#" + this.f296714h.getTextSize();
    }

    /* JADX WARN: Finally extract failed */
    public final void g(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        int i18;
        this.A = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i(getContext(), this, new android.os.Handler(android.os.Looper.getMainLooper()));
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc.AdaptedTextView adaptedTextView = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc.AdaptedTextView(context);
        adaptedTextView.setClickable(true);
        adaptedTextView.setFocusable(true);
        adaptedTextView.f296730g = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.b(this);
        this.f296712f = adaptedTextView;
        this.f296714h = m84165x334dfae1().getPaint();
        boolean z17 = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hs5.a.f366168a, i17, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i19 = -16777216;
            java.lang.String str = null;
            int i27 = 0;
            int i28 = -16777216;
            int i29 = -1;
            int i37 = 15;
            int i38 = -16776961;
            int i39 = -7829368;
            while (i27 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i27);
                if (index == 0) {
                    i37 = obtainStyledAttributes.getDimensionPixelSize(index, 15);
                } else if (index == 3) {
                    i28 = obtainStyledAttributes.getColor(index, i19);
                } else {
                    if (index == 23) {
                        m84175x8dd5167d(obtainStyledAttributes.getBoolean(index, z17) ? 1 : this.f296720q);
                    } else if (index == 20) {
                        m84172x534f0fbd(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 7) {
                        m84184x4ee3c29f(obtainStyledAttributes.getInt(index, 16));
                    } else if (index == 13) {
                        m84176x8e6ff544(obtainStyledAttributes.getDimensionPixelSize(index, this.f296721r));
                    } else if (index == 24) {
                        m84182x42191760(obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f296725v));
                    } else if (index == 25) {
                        k(obtainStyledAttributes.getDimensionPixelSize(index, 1), this.f296725v);
                    } else if (index == 15) {
                        m84178x24915916(obtainStyledAttributes.getDimensionPixelSize(index, this.f296723t));
                    } else if (index == 16) {
                        m84177x53cacfd7(obtainStyledAttributes.getDimensionPixelSize(index, this.f296724u));
                    } else if (index == 14) {
                        m84174x25bfb969(obtainStyledAttributes.getDimensionPixelSize(index, this.f296722s));
                    } else if (index == 19) {
                        m84175x8dd5167d(obtainStyledAttributes.getInt(index, Integer.MAX_VALUE));
                    } else if (index == 17) {
                        str = obtainStyledAttributes.getString(index);
                    } else if (index == 22) {
                        m84186x53e9ee84(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 21) {
                        m84167xf84e829(obtainStyledAttributes.getDimensionPixelSize(index, -1));
                    } else if (index == 18) {
                        m84169x764b0e09(obtainStyledAttributes.getText(index));
                    } else if (index == 4) {
                        i39 = obtainStyledAttributes.getColor(index, -7829368);
                    } else {
                        if (index == 5) {
                            i38 = obtainStyledAttributes.getColor(index, -16776961);
                        } else if (index == 6) {
                            i29 = obtainStyledAttributes.getInt(index, i29);
                        } else {
                            i18 = i29;
                            if (index == 27) {
                                this.G = obtainStyledAttributes.getBoolean(index, true);
                            }
                            i29 = i18;
                        }
                        i27++;
                        z17 = false;
                        i19 = -16777216;
                    }
                    i18 = i29;
                    i29 = i18;
                    i27++;
                    z17 = false;
                    i19 = -16777216;
                }
                i27++;
                z17 = false;
                i19 = -16777216;
            }
            int i47 = i29;
            obtainStyledAttributes.recycle();
            m84183x1c5c5ff4(i28);
            m84147x1be6954(i37);
            m84173x645e1a1a(i38);
            m84170x40e6fa2d(i39);
            if (i47 == 1) {
                m84166xb86dec4b(android.text.TextUtils.TruncateAt.START);
            } else if (i47 == 2) {
                m84166xb86dec4b(android.text.TextUtils.TruncateAt.MIDDLE);
            } else if (i47 == 3) {
                m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                b(str);
            }
            m84165x334dfae1().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } catch (java.lang.Throwable th6) {
            obtainStyledAttributes.recycle();
            throw th6;
        }
    }

    /* renamed from: getCurrentHintTextColor */
    public final int m84148xc87f72ec() {
        return this.f296716m != null ? this.f296719p : this.f296718o;
    }

    /* renamed from: getCurrentTextColor */
    public final int m84149xac551033() {
        return this.f296718o;
    }

    /* renamed from: getExtraEllipsizeWidth */
    public float m84150x7aeff433() {
        return this.F;
    }

    /* renamed from: getHint */
    public java.lang.CharSequence m84151xfb8046fd() {
        return this.f296729z;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a
    /* renamed from: getHorizontalOffset */
    public float mo84152x4431994d() {
        return ((this.D & 7) == 3 || this.f296710d == null) ? getPaddingLeft() : (getMeasuredWidth() - this.f296710d.t()[0]) / 2.0f;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a
    /* renamed from: getLayout */
    public ks5.a mo84153x22f21e20() {
        ks5.a aVar = this.f296709J;
        if (aVar != null) {
            return aVar;
        }
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.c cVar = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.c(this);
        this.f296709J = cVar;
        return cVar;
    }

    /* renamed from: getLineCount */
    public int m84154x92d2fac5() {
        ks5.c cVar = this.f296710d;
        if (cVar != null) {
            return cVar.f393347j.size();
        }
        return 0;
    }

    /* renamed from: getLineHeight */
    public int m84155xcf821e31() {
        return java.lang.Math.round((this.f296714h.getFontMetricsInt(null) * this.f296726w) + this.f296725v);
    }

    /* renamed from: getLineSpacingExtra */
    public float m84156x66610f17() {
        return this.f296725v;
    }

    /* renamed from: getLineSpacingMultiplier */
    public float m84157x5274cf1a() {
        return this.f296726w;
    }

    /* renamed from: getMaxHeight */
    public int m84158xc96bf8f5() {
        return this.f296722s;
    }

    /* renamed from: getMaxLines */
    public int m84159x931cb571() {
        return this.f296720q;
    }

    /* renamed from: getMaxWidth */
    public int m84160x93b79438() {
        return this.f296721r;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.a
    /* renamed from: getOnDoubleClickListener */
    public com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f mo84161xa4b83ff6() {
        return this.C;
    }

    /* renamed from: getPaint */
    public android.text.TextPaint m84162x74f59ea8() {
        return this.f296714h;
    }

    /* renamed from: getTextGravity */
    public int m84163xb87e4f2b() {
        return this.D;
    }

    /* renamed from: getTextSize */
    public float m84164x40077844() {
        return m84162x74f59ea8().getTextSize();
    }

    /* renamed from: getVerticalOffset */
    public float mo81369xcbe6949f() {
        return ((this.D & 112) == 48 || this.f296710d == null) ? getPaddingTop() : (getMeasuredHeight() - this.f296710d.t()[1]) / 2.0f;
    }

    /* renamed from: getWrappedTextView */
    public android.widget.TextView m84165x334dfae1() {
        return this.f296712f;
    }

    public boolean h() {
        return this.B;
    }

    public ks5.a i(int i17, int i18) {
        if (android.text.TextUtils.isEmpty(this.f296727x)) {
            return null;
        }
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414 c23000xc9450414 = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414(this.f296727x, null);
        c23000xc9450414.r(m84162x74f59ea8(), i17, i18, getPaddingLeft(), getPaddingTop(), m84155xcf821e31(), this.f296720q, this.E, this.F, this.G, this.D);
        return c23000xc9450414;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
    }

    public void j(android.text.TextUtils.TruncateAt truncateAt, float f17) {
        this.F = f17;
        this.E = truncateAt;
        m84165x334dfae1().setEllipsize(this.E);
        if (this.f296710d != null) {
            this.f296710d = null;
            requestLayout();
            invalidate();
        }
    }

    public void k(float f17, float f18) {
        this.f296725v = f17;
        this.f296726w = f18;
        m84165x334dfae1().setLineSpacing(f17, f18);
        requestLayout();
        invalidate();
    }

    public void l(int i17, float f17) {
        android.content.Context context = getContext();
        m84147x1be6954(android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1.length() != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            android.content.res.ColorStateList r0 = r6.f296715i
            int[] r1 = r6.getDrawableState()
            r2 = 0
            int r0 = r0.getColorForState(r1, r2)
            int r1 = r6.f296718o
            r3 = 1
            if (r0 == r1) goto L14
            r6.f296718o = r0
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            android.content.res.ColorStateList r1 = r6.f296717n
            if (r1 == 0) goto L2a
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            android.text.TextPaint r4 = r6.f296714h
            int r5 = r4.linkColor
            if (r1 == r5) goto L2a
            r4.linkColor = r1
            r0 = r3
        L2a:
            android.content.res.ColorStateList r1 = r6.f296716m
            if (r1 == 0) goto L47
            int[] r4 = r6.getDrawableState()
            int r1 = r1.getColorForState(r4, r2)
            int r2 = r6.f296719p
            if (r1 == r2) goto L47
            r6.f296719p = r1
            java.lang.CharSequence r1 = r6.f296727x
            if (r1 == 0) goto L48
            int r1 = r1.length()
            if (r1 != 0) goto L47
            goto L48
        L47:
            r3 = r0
        L48:
            if (r3 == 0) goto L4d
            r6.invalidate()
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc.m():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0188, code lost:
    
        if (r2 != false) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r31) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i iVar = this.A;
        if (iVar == null || !iVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void postInvalidate() {
        super.postInvalidate();
    }

    /* renamed from: setEllipsize */
    public void m84166xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.E != truncateAt) {
            this.E = truncateAt;
            m84165x334dfae1().setEllipsize(this.E);
            if (this.f296710d != null) {
                this.f296710d = null;
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setHeight */
    public void m84167xf84e829(int i17) {
        this.f296722s = i17;
        m84165x334dfae1().setMaxHeight(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setHint */
    public final void m84168x764b0e09(int i17) {
        m84169x764b0e09(getContext().getResources().getText(i17));
    }

    /* renamed from: setHintTextColor */
    public final void m84170x40e6fa2d(int i17) {
        this.f296716m = android.content.res.ColorStateList.valueOf(i17);
        m84165x334dfae1().setHintTextColor(i17);
        m();
    }

    /* renamed from: setLineEndExtraWidths */
    public void m84171x2778bcd8(float[] fArr) {
        this.I = fArr;
    }

    /* renamed from: setLines */
    public void m84172x534f0fbd(int i17) {
        this.f296720q = i17;
        m84165x334dfae1().setLines(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setLinkTextColor */
    public final void m84173x645e1a1a(int i17) {
        this.f296717n = android.content.res.ColorStateList.valueOf(i17);
        m();
    }

    /* renamed from: setMaxHeight */
    public void m84174x25bfb969(int i17) {
        this.f296722s = i17;
        m84165x334dfae1().setMaxHeight(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxLines */
    public void m84175x8dd5167d(int i17) {
        this.f296720q = i17;
        m84165x334dfae1().setMaxLines(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxWidth */
    public void m84176x8e6ff544(int i17) {
        this.f296721r = i17;
        m84165x334dfae1().setMaxWidth(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinHeight */
    public void m84177x53cacfd7(int i17) {
        this.f296724u = i17;
        m84165x334dfae1().setMinHeight(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinWidth */
    public void m84178x24915916(int i17) {
        this.f296723t = i17;
        m84165x334dfae1().setMinWidth(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setNeatEnable */
    public void m84179x6392584f(boolean z17) {
        this.B = z17;
    }

    /* renamed from: setOnDoubleClickListener */
    public void m84180x74caf26a(com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.f fVar) {
        this.C = fVar;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            this.f296710d = null;
        }
        super.setPadding(i17, i18, i19, i27);
        m84165x334dfae1().setPadding(i17, i18, i19, i27);
        invalidate();
    }

    /* renamed from: setSmartLetterEnable */
    public void m84181x18131970(boolean z17) {
        this.G = z17;
    }

    /* renamed from: setSpacingAdd */
    public void m84182x42191760(int i17) {
        float f17 = i17;
        this.f296725v = f17;
        m84165x334dfae1().setLineSpacing(f17, this.f296726w);
        requestLayout();
        invalidate();
    }

    /* renamed from: setTextColor */
    public void m84183x1c5c5ff4(int i17) {
        this.f296715i = android.content.res.ColorStateList.valueOf(i17);
        m84165x334dfae1().setTextColor(i17);
        m();
    }

    /* renamed from: setTextGravity */
    public void m84184x4ee3c29f(int i17) {
        m84165x334dfae1().setGravity(i17);
        if ((8388615 & i17) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        this.D = i17;
    }

    /* renamed from: setTextSize */
    public void m84185x3abfd950(float f17) {
        l(2, f17);
    }

    /* renamed from: setWidth */
    public void m84186x53e9ee84(int i17) {
        this.f296721r = i17;
        m84165x334dfae1().setMaxWidth(i17);
        requestLayout();
        invalidate();
    }

    /* renamed from: setHint */
    public final void m84169x764b0e09(java.lang.CharSequence charSequence) {
        this.f296729z = android.text.TextUtils.stringOrSpannedString(charSequence);
        m84165x334dfae1().setHint(this.f296729z);
        if (android.text.TextUtils.isEmpty(this.f296727x)) {
            e();
        }
    }

    public C23001x9d3a0bdc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f296713g = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.e(this, null);
        this.f296720q = Integer.MAX_VALUE;
        this.f296721r = Integer.MAX_VALUE;
        this.f296722s = Integer.MAX_VALUE;
        this.f296723t = 0;
        this.f296724u = 0;
        this.f296725v = 0.0f;
        this.f296726w = 1.0f;
        this.f296727x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f296728y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, attributeSet, 0);
    }

    public C23001x9d3a0bdc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f296713g = new com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.e(this, null);
        this.f296720q = Integer.MAX_VALUE;
        this.f296721r = Integer.MAX_VALUE;
        this.f296722s = Integer.MAX_VALUE;
        this.f296723t = 0;
        this.f296724u = 0;
        this.f296725v = 0.0f;
        this.f296726w = 1.0f;
        this.f296727x = "";
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
        this.f296728y = android.text.Spannable.Factory.getInstance();
        this.B = true;
        this.D = 8388659;
        this.G = true;
        g(context, attributeSet, i17);
    }
}
