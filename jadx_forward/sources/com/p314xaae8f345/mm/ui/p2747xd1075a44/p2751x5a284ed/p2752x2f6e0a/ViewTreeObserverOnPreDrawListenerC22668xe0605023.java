package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a;

@android.widget.RemoteViews.RemoteView
/* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView */
/* loaded from: classes15.dex */
public class ViewTreeObserverOnPreDrawListenerC22668xe0605023 extends android.view.View implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o2, reason: collision with root package name */
    public static final float[] f293104o2 = new float[2];

    /* renamed from: p2, reason: collision with root package name */
    public static final android.graphics.RectF f293105p2 = new android.graphics.RectF();

    /* renamed from: q2, reason: collision with root package name */
    public static final android.text.InputFilter[] f293106q2 = new android.text.InputFilter[0];

    /* renamed from: r2, reason: collision with root package name */
    public static final android.text.Spanned f293107r2 = new android.text.SpannedString("");

    /* renamed from: s2, reason: collision with root package name */
    public static final int[] f293108s2 = {android.R.attr.state_multiline};

    /* renamed from: t2, reason: collision with root package name */
    public static final android.util.SparseIntArray f293109t2;

    /* renamed from: u2, reason: collision with root package name */
    public static final android.text.BoringLayout.Metrics f293110u2;
    public java.lang.CharSequence A;
    public int A1;
    public android.text.Spannable B;
    public int B1;
    public java.lang.CharSequence C;
    public int C1;
    public android.widget.TextView.BufferType D;
    public int D1;
    public java.lang.CharSequence E;
    public boolean E1;
    public android.text.Layout F;
    public int F1;
    public il5.a G;
    public boolean G1;
    public android.text.method.TransformationMethod H;
    public int H1;
    public gl5.f I;
    public android.graphics.Rect I1;

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f293111J;
    public long J1;
    public android.text.TextPaint K;
    public android.widget.Scroller K1;
    public boolean L;
    public android.text.BoringLayout.Metrics L1;
    public android.text.Layout M;
    public android.text.BoringLayout.Metrics M1;
    public boolean N;
    public android.text.BoringLayout N1;
    public android.text.BoringLayout O1;
    public int P;
    public android.text.TextDirectionHeuristic P1;
    public boolean Q;
    public android.text.InputFilter[] Q1;
    public boolean R;
    public android.os.UserHandle R1;
    public boolean S;
    public int S1;
    public int T;
    public android.graphics.Path T1;
    public boolean U;
    public android.graphics.Paint U1;
    public int V;
    public boolean V1;
    public boolean W;
    public int W1;
    public android.graphics.drawable.Drawable X1;
    public int Y1;
    public android.graphics.drawable.Drawable Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f293112a2;

    /* renamed from: b2, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293113b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f293114c2;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f293115d;

    /* renamed from: d2, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293116d2;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f293117e;

    /* renamed from: e2, reason: collision with root package name */
    public int f293118e2;

    /* renamed from: f, reason: collision with root package name */
    public android.content.res.ColorStateList f293119f;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f293120f2;

    /* renamed from: g, reason: collision with root package name */
    public int f293121g;

    /* renamed from: g2, reason: collision with root package name */
    public gl5.e0 f293122g2;

    /* renamed from: h, reason: collision with root package name */
    public int f293123h;

    /* renamed from: h2, reason: collision with root package name */
    public android.widget.TextView f293124h2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f293125i;

    /* renamed from: i2, reason: collision with root package name */
    public final android.text.TextWatcher f293126i2;

    /* renamed from: j2, reason: collision with root package name */
    public int f293127j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f293128k2;

    /* renamed from: l1, reason: collision with root package name */
    public int f293129l1;

    /* renamed from: l2, reason: collision with root package name */
    public nl5.a0 f293130l2;

    /* renamed from: m, reason: collision with root package name */
    public android.text.Editable.Factory f293131m;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.Set f293132m2;

    /* renamed from: n, reason: collision with root package name */
    public android.text.Spannable.Factory f293133n;

    /* renamed from: n2, reason: collision with root package name */
    public final java.util.Set f293134n2;

    /* renamed from: o, reason: collision with root package name */
    public float f293135o;

    /* renamed from: p, reason: collision with root package name */
    public float f293136p;

    /* renamed from: p0, reason: collision with root package name */
    public float f293137p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f293138p1;

    /* renamed from: q, reason: collision with root package name */
    public float f293139q;

    /* renamed from: r, reason: collision with root package name */
    public int f293140r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f293141s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f293142t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f293143u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.textclassifier.TextClassifier f293144v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.textclassifier.TextClassificationContext f293145w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f293146x;

    /* renamed from: x0, reason: collision with root package name */
    public float f293147x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f293148x1;

    /* renamed from: y, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f293149y;

    /* renamed from: y0, reason: collision with root package name */
    public int f293150y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f293151y1;

    /* renamed from: z, reason: collision with root package name */
    public gl5.g f293152z;

    /* renamed from: z1, reason: collision with root package name */
    public int f293153z1;

    static {
        gl5.b bVar = new gl5.b();
        f293109t2 = bVar;
        bVar.put(5, 5);
        bVar.put(4, 4);
        bVar.put(6, 6);
        bVar.put(7, 7);
        bVar.put(1, 1);
        try {
            bVar.put(89, 89);
        } catch (java.lang.Throwable unused) {
        }
        android.util.SparseIntArray sparseIntArray = f293109t2;
        sparseIntArray.put(2, 2);
        sparseIntArray.put(68, 68);
        sparseIntArray.put(3, 3);
        sparseIntArray.put(88, 88);
        sparseIntArray.put(65, 65);
        sparseIntArray.put(34, 34);
        sparseIntArray.put(35, 35);
        sparseIntArray.put(36, 36);
        sparseIntArray.put(37, 37);
        sparseIntArray.put(69, 69);
        sparseIntArray.put(84, 84);
        sparseIntArray.put(70, 70);
        sparseIntArray.put(71, 71);
        sparseIntArray.put(83, 83);
        f293110u2 = new android.text.BoringLayout.Metrics();
    }

    public ViewTreeObserverOnPreDrawListenerC22668xe0605023(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30868x68b1db1.f575858k0);
    }

    public static int E(android.text.Layout layout) {
        int lineCount = layout.getLineCount();
        java.lang.CharSequence text = layout.getText();
        for (int i17 = 0; i17 < lineCount - 1; i17++) {
            if (text.charAt(layout.getLineEnd(i17) - 1) != '\n') {
                return -1;
            }
        }
        float f17 = 0.0f;
        for (int i18 = 0; i18 < lineCount; i18++) {
            f17 = java.lang.Math.max(f17, layout.getLineWidth(i18));
        }
        return (int) java.lang.Math.ceil(f17);
    }

    public static boolean S(int i17) {
        int i18 = i17 & 4095;
        return i18 == 129 || i18 == 225 || i18 == 18;
    }

    /* renamed from: getCustomLocaleForKeyListenerOrNull */
    private java.util.Locale m81605xd8272795() {
        android.os.LocaleList m81653x7ab58b47;
        if (this.R && (m81653x7ab58b47 = m81653x7ab58b47()) != null) {
            return m81653x7ab58b47.get(0);
        }
        return null;
    }

    /* renamed from: getDesiredHeight */
    private int m81606x335cfcab() {
        return java.lang.Math.max(I(this.M, true), I(this.F, this.f293149y != null));
    }

    /* renamed from: getInputMethodManager */
    private android.view.inputmethod.InputMethodManager m81607x6460f9d8() {
        return (android.view.inputmethod.InputMethodManager) getContext().getSystemService(android.view.inputmethod.InputMethodManager.class);
    }

    /* renamed from: getLayoutAlignment */
    private android.text.Layout.Alignment m81608x128f87a3() {
        switch (getTextAlignment()) {
            case 1:
                int i17 = this.T & 8388615;
                if (i17 == 1) {
                    return android.text.Layout.Alignment.ALIGN_CENTER;
                }
                if (i17 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "getTextAlignment() Gravity.LEFT");
                } else {
                    if (i17 != 5) {
                        if (i17 != 8388611 && i17 == 8388613) {
                            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        }
                        return android.text.Layout.Alignment.ALIGN_NORMAL;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "getTextAlignment() Gravity.RIGHT");
                }
                return null;
            case 2:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 3:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            case 4:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 5:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_START");
                return null;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "getTextAlignment() TEXT_ALIGNMENT_VIEW_END");
                return null;
            default:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
        }
    }

    /* renamed from: getUpdatedHighlightPath */
    private android.graphics.Path m81609x4e603e74() {
        android.graphics.Paint paint = this.U1;
        int m81687x6f2c472c = m81687x6f2c472c();
        int m81686xffd93625 = m81686xffd93625();
        if (this.G != null && ((isFocused() || isPressed()) && m81687x6f2c472c >= 0)) {
            if (m81687x6f2c472c != m81686xffd93625) {
                if (this.V1) {
                    if (this.T1 == null) {
                        this.T1 = new android.graphics.Path();
                    }
                    this.T1.reset();
                    this.M.getSelectionPath(m81687x6f2c472c, m81686xffd93625, this.T1);
                    this.V1 = false;
                }
                paint.setColor(this.S1);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                return this.T1;
            }
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                boolean z17 = true;
                if (!(e0Var.f354497v && e0Var.U.V()) || (!e0Var.f354495t && (android.os.SystemClock.uptimeMillis() - e0Var.f354494s) % 1000 >= 500)) {
                    z17 = false;
                }
                if (z17) {
                    if (this.V1) {
                        if (this.T1 == null) {
                            this.T1 = new android.graphics.Path();
                        }
                        this.T1.reset();
                        this.M.getCursorPath(m81687x6f2c472c, this.T1, this.A);
                        gl5.e0 e0Var2 = this.f293122g2;
                        android.graphics.drawable.Drawable drawable = e0Var2.F;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var2.U;
                        if (drawable == null) {
                            e0Var2.F = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81699x9ff5a297();
                        }
                        if (e0Var2.F != null) {
                            android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
                            int m81687x6f2c472c2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
                            int lineForOffset = m81661x22f21e20.getLineForOffset(m81687x6f2c472c2);
                            int lineTop = m81661x22f21e20.getLineTop(lineForOffset);
                            int lineBottom = m81661x22f21e20.getLineBottom(lineForOffset);
                            float primaryHorizontal = m81661x22f21e20.getPrimaryHorizontal(m81687x6f2c472c2);
                            if (e0Var2.F == null) {
                                e0Var2.F = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81699x9ff5a297();
                            }
                            int c17 = e0Var2.c(e0Var2.F, primaryHorizontal);
                            int intrinsicWidth = e0Var2.F.getIntrinsicWidth();
                            android.graphics.drawable.Drawable drawable2 = e0Var2.F;
                            android.graphics.Rect rect = e0Var2.T;
                            drawable2.setBounds(c17, lineTop - rect.top, intrinsicWidth + c17, lineBottom + rect.bottom);
                        }
                        this.V1 = false;
                    }
                    paint.setColor(this.f293121g);
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    return this.T1;
                }
            }
        }
        return null;
    }

    /* renamed from: setHintInternal */
    private void m81610x159f1fe6(java.lang.CharSequence charSequence) {
        this.E = android.text.TextUtils.stringOrSpannedString(charSequence);
        if (this.M != null) {
            A();
        }
        if (this.A.length() == 0) {
            invalidate();
        }
        if (this.f293122g2 != null) {
            this.A.length();
        }
    }

    /* renamed from: setInputTypeSingleLine */
    private void m81611x3357c5de(boolean z17) {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            int i17 = e0Var.f354491p;
            if ((i17 & 15) == 1) {
                if (z17) {
                    e0Var.f354491p = (-131073) & i17;
                } else {
                    e0Var.f354491p = 131072 | i17;
                }
            }
        }
    }

    /* renamed from: setKeyListenerOnly */
    private void m81612x3270a5bd(android.text.method.KeyListener keyListener) {
        if (this.f293122g2 == null && keyListener == null) {
            return;
        }
        D();
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var.f354490o != keyListener) {
            e0Var.f354490o = keyListener;
            if (keyListener != null) {
                java.lang.CharSequence charSequence = this.A;
                if (!(charSequence instanceof android.text.Editable)) {
                    m81790x765074af(charSequence);
                }
            }
            k0((android.text.Editable) this.A, this.Q1);
        }
    }

    /* renamed from: setTextInternal */
    private void m81613xa93e808c(java.lang.CharSequence charSequence) {
        this.A = charSequence;
        this.B = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : null;
    }

    public final void A() {
        android.text.Layout layout;
        if ((getLayoutParams().width == -2 && (this.B1 != this.D1 || this.A1 != this.C1)) || ((this.E != null && this.F == null) || ((getRight() - getLeft()) - m81628xdc9a71d7()) - m81629xb70a2a4c() <= 0)) {
            Y();
            requestLayout();
            invalidate();
            return;
        }
        int height = this.M.getHeight();
        int width = this.M.getWidth();
        android.text.Layout layout2 = this.F;
        int width2 = layout2 == null ? 0 : layout2.getWidth();
        android.text.BoringLayout.Metrics metrics = f293110u2;
        X(width, width2, metrics, metrics, ((getRight() - getLeft()) - m81628xdc9a71d7()) - m81629xb70a2a4c(), false);
        if (this.f293149y != android.text.TextUtils.TruncateAt.MARQUEE) {
            if (getLayoutParams().height != -2 && getLayoutParams().height != -1) {
                invalidate();
                return;
            } else if (this.M.getHeight() == height && ((layout = this.F) == null || layout.getHeight() == height)) {
                invalidate();
                return;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void B() {
        boolean z17 = false;
        if (this.M != null) {
            if (getLayoutParams().width == -2) {
                invalidate();
                z17 = true;
            }
            if (getLayoutParams().height != -2 ? !(getLayoutParams().height != -1 || this.F1 < 0 || m81606x335cfcab() == this.F1) : m81606x335cfcab() != getHeight()) {
                z17 = true;
            }
        }
        if (z17) {
            requestLayout();
        }
    }

    public float C(float f17) {
        return java.lang.Math.min((getWidth() - m81714xce806939()) - 1, java.lang.Math.max(0.0f, f17 - m81713xd51a214a())) + getScrollX();
    }

    public final void D() {
        if (this.f293122g2 == null) {
            this.f293122g2 = new gl5.e0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(int r8, android.view.KeyEvent r9, android.view.KeyEvent r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.F(int, android.view.KeyEvent, android.view.KeyEvent):int");
    }

    public void G() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.f354500y = false;
            gl5.s sVar = e0Var.f354486k;
            if (sVar != null) {
                int i17 = sVar.f354623c - 1;
                sVar.f354623c = i17;
                if (i17 == 0) {
                    e0Var.h(sVar);
                }
            }
        }
    }

    public final void H() {
        gl5.e0 e0Var;
        if (this.G == null && ((e0Var = this.f293122g2) == null || e0Var.f354490o == null)) {
            setClickable(false);
            setLongClickable(false);
        } else {
            setFocusable(true);
            setClickable(true);
            setLongClickable(true);
        }
    }

    public final int I(android.text.Layout layout, boolean z17) {
        int i17;
        if (layout == null) {
            return 0;
        }
        int height = layout.getHeight();
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            height = java.lang.Math.max(java.lang.Math.max(height, gVar.f354529q), gVar.f354530r);
        }
        int lineCount = layout.getLineCount();
        int m81631x51707585 = m81631x51707585() + m81626xf4837fb();
        int i18 = height + m81631x51707585;
        if (this.f293129l1 != 1) {
            i18 = java.lang.Math.min(i18, this.f293150y0);
        } else if (z17 && lineCount > (i17 = this.f293150y0) && ((layout instanceof android.text.DynamicLayout) || (layout instanceof android.text.BoringLayout))) {
            int lineTop = layout.getLineTop(i17);
            if (gVar != null) {
                lineTop = java.lang.Math.max(java.lang.Math.max(lineTop, gVar.f354529q), gVar.f354530r);
            }
            i18 = lineTop + m81631x51707585;
            lineCount = this.f293150y0;
        }
        if (this.f293148x1 != 1) {
            i18 = java.lang.Math.max(i18, this.f293138p1);
        } else if (lineCount < this.f293138p1) {
            i18 += m81664xcf821e31() * (this.f293138p1 - lineCount);
        }
        return java.lang.Math.max(i18, getSuggestedMinimumHeight());
    }

    public int J(float f17) {
        return m81661x22f21e20().getLineForVertical((int) (java.lang.Math.min((getHeight() - m81711xe699d6ae()) - 1, java.lang.Math.max(0.0f, f17 - m81716xd5538bb2())) + getScrollY()));
    }

    public int K(float f17, float f18) {
        if (m81661x22f21e20() == null) {
            return -1;
        }
        return m81661x22f21e20().getOffsetForHorizontal(J(f18), C(f17));
    }

    public int L(boolean z17) {
        int m81640x14c7f93;
        int m81639x67e4b2d;
        android.text.Layout layout;
        int i17 = this.T & 112;
        android.text.Layout layout2 = this.M;
        if (!z17 && this.A.length() == 0 && (layout = this.F) != null) {
            layout2 = layout;
        }
        if (i17 != 48) {
            if (layout2 == this.F) {
                m81640x14c7f93 = m81631x51707585();
                m81639x67e4b2d = m81626xf4837fb();
            } else {
                m81640x14c7f93 = m81640x14c7f93();
                m81639x67e4b2d = m81639x67e4b2d();
            }
            int measuredHeight = getMeasuredHeight() - (m81640x14c7f93 + m81639x67e4b2d);
            int height = layout2.getHeight();
            if (height < measuredHeight) {
                int i18 = measuredHeight - height;
                return i17 == 80 ? i18 : i18 >> 1;
            }
        }
        return 0;
    }

    public boolean M() {
        int m81687x6f2c472c = m81687x6f2c472c();
        int m81686xffd93625 = m81686xffd93625();
        return m81687x6f2c472c >= 0 && m81686xffd93625 > 0 && m81687x6f2c472c != m81686xffd93625;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:434:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0758  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.content.Context r63, android.util.AttributeSet r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.N(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void O(int i17, int i18, int i19) {
        android.graphics.drawable.Drawable drawable;
        if (i17 >= 0 || i18 >= 0 || i19 >= 0) {
            int min = java.lang.Math.min(java.lang.Math.min(i17, i18), i19);
            int max = java.lang.Math.max(java.lang.Math.max(i17, i18), i19);
            android.text.Layout layout = this.M;
            if (layout == null) {
                invalidate();
                return;
            }
            int lineForOffset = layout.getLineForOffset(min);
            int lineTop = this.M.getLineTop(lineForOffset);
            if (lineForOffset > 0) {
                lineTop -= this.M.getLineDescent(lineForOffset - 1);
            }
            int lineBottom = this.M.getLineBottom(min == max ? lineForOffset : this.M.getLineForOffset(max));
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null && (drawable = e0Var.F) != null) {
                android.graphics.Rect bounds = drawable.getBounds();
                lineTop = java.lang.Math.min(lineTop, bounds.top);
                lineBottom = java.lang.Math.max(lineBottom, bounds.bottom);
            }
            int m81628xdc9a71d7 = m81628xdc9a71d7();
            int m81640x14c7f93 = m81640x14c7f93() + L(true);
            invalidate(getScrollX() + m81628xdc9a71d7, lineTop + m81640x14c7f93, getScrollY() + (getWidth() - m81629xb70a2a4c()), m81640x14c7f93 + lineBottom);
        }
    }

    public void P() {
        if (this.V1) {
            int m81686xffd93625 = m81686xffd93625();
            O(m81686xffd93625, m81686xffd93625, m81686xffd93625);
            return;
        }
        int m81628xdc9a71d7 = m81628xdc9a71d7();
        int m81640x14c7f93 = m81640x14c7f93() + L(true);
        android.graphics.drawable.Drawable drawable = this.f293122g2.F;
        if (drawable != null) {
            android.graphics.Rect bounds = drawable.getBounds();
            invalidate(bounds.left + m81628xdc9a71d7, bounds.top + m81640x14c7f93, bounds.right + m81628xdc9a71d7, bounds.bottom + m81640x14c7f93);
            return;
        }
        android.graphics.RectF rectF = f293105p2;
        synchronized (rectF) {
            float ceil = (float) java.lang.Math.ceil(this.K.getStrokeWidth());
            if (ceil < 1.0f) {
                ceil = 1.0f;
            }
            float f17 = ceil / 2.0f;
            this.T1.computeBounds(rectF, false);
            float f18 = m81628xdc9a71d7;
            float f19 = m81640x14c7f93;
            invalidate((int) java.lang.Math.floor((rectF.left + f18) - f17), (int) java.lang.Math.floor((rectF.top + f19) - f17), (int) java.lang.Math.ceil(f18 + rectF.right + f17), (int) java.lang.Math.ceil(f19 + rectF.bottom + f17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r7 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(android.view.MotionEvent r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.f293118e2
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L10
            int r0 = r6.getPointerId(r1)
            r5.f293118e2 = r0
            r5.f293120f2 = r7
            goto L1c
        L10:
            int r4 = r6.getPointerId(r1)
            if (r0 == r4) goto L1c
            boolean r0 = r5.f293120f2
            if (r0 == 0) goto L1d
            if (r7 == 0) goto L1d
        L1c:
            r1 = r2
        L1d:
            int r7 = r6.getActionMasked()
            if (r7 == r2) goto L2a
            int r6 = r6.getActionMasked()
            r7 = 3
            if (r6 != r7) goto L2c
        L2a:
            r5.f293118e2 = r3
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.Q(android.view.MotionEvent, boolean):boolean");
    }

    public boolean R() {
        java.lang.String str;
        return m81683x23df71a2().size() > 0 && (str = android.os.Build.BRAND) != null && m81682x4bfed82a().contains(str.toLowerCase());
    }

    public boolean T(float f17, float f18) {
        float[] fArr = f293104o2;
        synchronized (fArr) {
            fArr[0] = f17;
            fArr[1] = f18;
            android.view.View view = this;
            while (view != null) {
                if (view != this) {
                    fArr[0] = fArr[0] - view.getScrollX();
                    fArr[1] = fArr[1] - view.getScrollY();
                }
                float f19 = fArr[0];
                if (f19 >= 0.0f && fArr[1] >= 0.0f && f19 <= view.getWidth() && fArr[1] <= view.getHeight()) {
                    if (!view.getMatrix().isIdentity()) {
                        view.getMatrix().mapPoints(fArr);
                    }
                    fArr[0] = fArr[0] + view.getLeft();
                    fArr[1] = fArr[1] + view.getTop();
                    java.lang.Object parent = view.getParent();
                    view = parent instanceof android.view.View ? (android.view.View) parent : null;
                }
                return false;
            }
            return true;
        }
    }

    public boolean U() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return false;
        }
        int i17 = e0Var.f354491p;
        if ((i17 & 15) != 1 || (524288 & i17) > 0) {
            return false;
        }
        int i18 = i17 & 4080;
        return i18 == 0 || i18 == 48 || i18 == 80 || i18 == 64 || i18 == 160;
    }

    public boolean V() {
        return (this.A instanceof android.text.Editable) && onCheckIsTextEditor() && isEnabled();
    }

    public boolean W() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f354499x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    public void X(int i17, int i18, android.text.BoringLayout.Metrics metrics, android.text.BoringLayout.Metrics metrics2, int i19, boolean z17) {
        android.text.BoringLayout.Metrics metrics3;
        android.text.TextUtils.TruncateAt truncateAt;
        int i27;
        android.text.Layout.Alignment alignment;
        android.text.Layout layout;
        android.text.BoringLayout boringLayout;
        android.text.BoringLayout boringLayout2;
        ?? r132;
        int i28;
        android.text.Layout layout2;
        android.text.BoringLayout.Metrics metrics4;
        int i29;
        int i37 = i19;
        this.f293151y1 = this.f293150y0;
        this.f293153z1 = this.f293129l1;
        this.V1 = true;
        int i38 = i17 < 0 ? 0 : i17;
        int i39 = i18 < 0 ? 0 : i18;
        android.text.Layout.Alignment m81608x128f87a3 = m81608x128f87a3();
        boolean z18 = this.E1 && this.M != null && (m81608x128f87a3 == android.text.Layout.Alignment.ALIGN_NORMAL || m81608x128f87a3 == android.text.Layout.Alignment.ALIGN_OPPOSITE);
        int paragraphDirection = z18 ? this.M.getParagraphDirection(0) : 0;
        boolean z19 = this.f293149y != null && m81659xded63efd() == null;
        android.text.TextUtils.TruncateAt truncateAt2 = this.f293149y;
        if (this.P1 == null) {
            this.P1 = m81700xe50814e();
        }
        boolean z27 = truncateAt2 == this.f293149y;
        boolean z28 = W() || this.B != null;
        android.text.BoringLayout.Metrics metrics5 = f293110u2;
        if (z28) {
            r132 = 0;
            metrics3 = metrics5;
            truncateAt = truncateAt2;
            i27 = paragraphDirection;
            alignment = m81608x128f87a3;
            layout = new android.text.DynamicLayout(this.A, this.C, this.K, i38, m81608x128f87a3, this.f293137p0, this.f293147x0, this.G1, m81659xded63efd() == null ? truncateAt2 : null, i19);
        } else {
            android.text.BoringLayout.Metrics metrics6 = metrics;
            java.lang.Object obj = null;
            metrics3 = metrics5;
            truncateAt = truncateAt2;
            i27 = paragraphDirection;
            alignment = m81608x128f87a3;
            if (metrics6 == metrics3 && (metrics6 = android.text.BoringLayout.isBoring(this.C, this.K, this.L1)) != null) {
                this.L1 = metrics6;
            }
            android.text.BoringLayout.Metrics metrics7 = metrics6;
            if (metrics7 != null) {
                int i47 = metrics7.width;
                if (i47 <= i38 && (truncateAt == null || i47 <= i37)) {
                    android.text.BoringLayout make = (!z27 || (boringLayout2 = this.N1) == null) ? android.text.BoringLayout.make(this.C, this.K, i38, alignment, this.f293137p0, this.f293147x0, metrics7, this.G1) : boringLayout2.replaceOrMake(this.C, this.K, i38, alignment, this.f293137p0, this.f293147x0, metrics7, this.G1);
                    layout = make;
                    r132 = obj;
                    if (z27) {
                        this.N1 = make;
                        layout = make;
                        r132 = obj;
                    }
                } else if (z19 && i47 <= i38) {
                    if (!z27 || (boringLayout = this.N1) == null) {
                        layout = android.text.BoringLayout.make(this.C, this.K, i38, alignment, this.f293137p0, this.f293147x0, metrics7, this.G1, truncateAt, i19);
                        r132 = obj;
                    } else {
                        layout = boringLayout.replaceOrMake(this.C, this.K, i38, alignment, this.f293137p0, this.f293147x0, metrics7, this.G1, truncateAt, i19);
                        r132 = obj;
                    }
                }
            }
            layout = null;
            r132 = obj;
        }
        if (layout == null) {
            java.lang.CharSequence charSequence = this.C;
            int length = charSequence.length();
            android.text.TextPaint textPaint = this.K;
            float f17 = this.f293137p0;
            float f18 = this.f293147x0;
            boolean z29 = this.G1;
            android.text.TextUtils.TruncateAt truncateAt3 = z19 ? truncateAt : r132;
            if (z19) {
                i29 = i37;
                i28 = i38;
            } else {
                i28 = i38;
                i29 = 0;
            }
            layout2 = new android.text.StaticLayout(charSequence, 0, length, textPaint, i28, alignment, f17, f18, z29, truncateAt3, i29);
        } else {
            i28 = i38;
            layout2 = layout;
        }
        this.M = layout2;
        boolean z37 = this.f293149y != null;
        this.F = r132;
        java.lang.CharSequence charSequence2 = this.E;
        if (charSequence2 != null) {
            int i48 = z37 ? i28 : i39;
            if (metrics2 == metrics3) {
                android.text.BoringLayout.Metrics isBoring = android.text.BoringLayout.isBoring(charSequence2, this.K, this.M1);
                if (isBoring != null) {
                    this.M1 = isBoring;
                }
                metrics4 = isBoring;
            } else {
                metrics4 = metrics2;
            }
            if (metrics4 != null) {
                int i49 = metrics4.width;
                if (i49 <= i48 && (!z37 || i49 <= i37)) {
                    android.text.BoringLayout boringLayout3 = this.O1;
                    if (boringLayout3 != null) {
                        this.F = boringLayout3.replaceOrMake(this.E, this.K, i48, alignment, this.f293137p0, this.f293147x0, metrics4, this.G1);
                    } else {
                        this.F = android.text.BoringLayout.make(this.E, this.K, i48, alignment, this.f293137p0, this.f293147x0, metrics4, this.G1);
                    }
                    this.O1 = (android.text.BoringLayout) this.F;
                } else if (z37 && i49 <= i48) {
                    android.text.BoringLayout boringLayout4 = this.O1;
                    if (boringLayout4 != null) {
                        this.F = boringLayout4.replaceOrMake(this.E, this.K, i48, alignment, this.f293137p0, this.f293147x0, metrics4, this.G1, this.f293149y, i19);
                    } else {
                        this.F = android.text.BoringLayout.make(this.E, this.K, i48, alignment, this.f293137p0, this.f293147x0, metrics4, this.G1, this.f293149y, i19);
                    }
                }
            }
            if (this.F == null) {
                java.lang.CharSequence charSequence3 = this.E;
                int length2 = charSequence3.length();
                android.text.TextPaint textPaint2 = this.K;
                float f19 = this.f293137p0;
                float f27 = this.f293147x0;
                boolean z38 = this.G1;
                android.text.TextUtils.TruncateAt truncateAt4 = z37 ? truncateAt : r132;
                if (!z37) {
                    i37 = 0;
                }
                this.F = new android.text.StaticLayout(charSequence3, 0, length2, textPaint2, i48, alignment, f19, f27, z38, truncateAt4, i37);
            }
        }
        if (z17 || (z18 && i27 != this.M.getParagraphDirection(0))) {
            d0();
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.z();
        }
    }

    public void Y() {
        android.text.Layout layout = this.M;
        if ((layout instanceof android.text.BoringLayout) && this.N1 == null) {
            this.N1 = (android.text.BoringLayout) layout;
        }
        android.text.Layout layout2 = this.F;
        if ((layout2 instanceof android.text.BoringLayout) && this.O1 == null) {
            this.O1 = (android.text.BoringLayout) layout2;
        }
        this.M1 = null;
        this.L1 = null;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z(int i17) {
        java.lang.Object obj;
        gl5.e0 e0Var = this.f293122g2;
        gl5.r rVar = e0Var == null ? null : e0Var.f354485j;
        if (rVar != null) {
            gl5.h hVar = rVar.f354617f;
            if (hVar != null) {
                if (this instanceof fl5.i ? ((fl5.l) hVar).f345488a.a((fl5.i) this, i17, null) : false) {
                    return;
                }
            }
            if (i17 == 5) {
                android.view.View focusSearch = focusSearch(2);
                if (focusSearch != null && !focusSearch.requestFocus(2)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            }
            if (i17 == 7) {
                android.view.View focusSearch2 = focusSearch(1);
                if (focusSearch2 != null && !focusSearch2.requestFocus(1)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                return;
            }
            if (i17 == 6) {
                android.view.inputmethod.InputMethodManager m81607x6460f9d8 = m81607x6460f9d8();
                if (m81607x6460f9d8 == null || !m81607x6460f9d8.isActive(this)) {
                    return;
                }
                m81607x6460f9d8.hideSoftInputFromWindow(getWindowToken(), 0);
                return;
            }
        }
        java.lang.Class<?>[] clsArr = new java.lang.Class[0];
        java.lang.reflect.Method method = null;
        for (java.lang.Class<?> cls = getClass(); cls != java.lang.Object.class; cls = cls.getSuperclass()) {
            try {
                method = cls.getDeclaredMethod("getViewRootImpl", clsArr);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (method == null) {
            new java.lang.Throwable("MB getViewRootImpl");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        try {
            method.setAccessible(true);
            obj = method.invoke(this, objArr);
        } catch (java.lang.Throwable unused2) {
            obj = null;
        }
        if (obj != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            java.lang.Class<?>[] clsArr2 = {android.view.KeyEvent.class};
            java.lang.reflect.Method method2 = null;
            for (java.lang.Class<?> cls2 = obj.getClass(); cls2 != java.lang.Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    method2 = cls2.getDeclaredMethod("dispatchKeyFromIme", clsArr2);
                } catch (java.lang.Throwable unused3) {
                }
            }
            if (method2 == null) {
                new java.lang.Throwable("MB dispatchKeyFromIme");
            }
            java.lang.reflect.Method method3 = method2;
            java.lang.Object[] objArr2 = {new android.view.KeyEvent(uptimeMillis, uptimeMillis, 0, 66, 0, 0, -1, 0, 22)};
            try {
                method3.setAccessible(true);
                method3.invoke(obj, objArr2);
            } catch (java.lang.Throwable unused4) {
            }
            java.lang.Class<?>[] clsArr3 = {android.view.KeyEvent.class};
            java.lang.reflect.Method method4 = null;
            for (java.lang.Class<?> cls3 = obj.getClass(); cls3 != java.lang.Object.class; cls3 = cls3.getSuperclass()) {
                try {
                    method4 = cls3.getDeclaredMethod("dispatchKeyFromIme", clsArr3);
                } catch (java.lang.Throwable unused5) {
                }
            }
            if (method4 == null) {
                new java.lang.Throwable("MB dispatchKeyFromIme");
            }
            java.lang.reflect.Method method5 = method4;
            java.lang.Object[] objArr3 = {new android.view.KeyEvent(android.os.SystemClock.uptimeMillis(), uptimeMillis, 1, 66, 0, 0, -1, 0, 22)};
            try {
                method5.setAccessible(true);
                method5.invoke(obj, objArr3);
            } catch (java.lang.Throwable unused6) {
            }
        }
    }

    public boolean a0(java.lang.String str, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.View
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        android.graphics.RectF characterBounds;
        float f17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this;
        if (bundle == null || !str.equals("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            return;
        }
        int i17 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i18 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i18 <= 0 || i17 < 0 || i17 >= viewTreeObserverOnPreDrawListenerC22668xe0605023.A.length()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cmEdit.CMTextView", "Invalid arguments for accessibility character locations");
            return;
        }
        android.graphics.RectF[] rectFArr = new android.graphics.RectF[i18];
        android.view.inputmethod.CursorAnchorInfo.Builder builder = new android.view.inputmethod.CursorAnchorInfo.Builder();
        int i19 = i17 + i18;
        float m81628xdc9a71d7 = m81628xdc9a71d7() - getScrollX();
        float y07 = y0();
        int lineForOffset = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineForOffset(i17);
        int lineForOffset2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineForOffset(i19 - 1);
        int i27 = lineForOffset;
        while (i27 <= lineForOffset2) {
            int lineStart = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineStart(i27);
            int lineEnd = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineEnd(i27);
            int max = java.lang.Math.max(lineStart, i17);
            int min = java.lang.Math.min(lineEnd, i19);
            boolean z17 = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getParagraphDirection(i27) == 1;
            float[] fArr = new float[min - max];
            viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getPaint().getTextWidths(viewTreeObserverOnPreDrawListenerC22668xe0605023.C, max, min, fArr);
            float lineTop = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineTop(i27);
            float lineBottom = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineBottom(i27);
            int i28 = i19;
            int i29 = max;
            while (i29 < min) {
                float f18 = fArr[i29 - max];
                float[] fArr2 = fArr;
                boolean isRtlCharAt = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.isRtlCharAt(i29);
                int i37 = min;
                float primaryHorizontal = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getPrimaryHorizontal(i29);
                int i38 = max;
                float secondaryHorizontal = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getSecondaryHorizontal(i29);
                if (!z17) {
                    if (isRtlCharAt) {
                        secondaryHorizontal = primaryHorizontal - f18;
                    } else {
                        primaryHorizontal = secondaryHorizontal + f18;
                    }
                    float f19 = secondaryHorizontal;
                    secondaryHorizontal = primaryHorizontal;
                    primaryHorizontal = f19;
                } else if (isRtlCharAt) {
                    primaryHorizontal = secondaryHorizontal - f18;
                } else {
                    secondaryHorizontal = f18 + primaryHorizontal;
                }
                float f27 = primaryHorizontal + m81628xdc9a71d7;
                float f28 = secondaryHorizontal + m81628xdc9a71d7;
                int i39 = i27;
                float f29 = lineTop + y07;
                int i47 = lineForOffset2;
                float f37 = lineBottom + y07;
                boolean T = viewTreeObserverOnPreDrawListenerC22668xe0605023.T(f27, f29);
                boolean T2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.T(f28, f37);
                int i48 = (T || T2) ? 1 : 0;
                if (!T || !T2) {
                    i48 |= 2;
                }
                if (isRtlCharAt) {
                    f17 = lineBottom;
                    i48 |= 4;
                } else {
                    f17 = lineBottom;
                }
                builder.addCharacterBounds(i29, f27, f29, f28, f37, i48);
                i29++;
                viewTreeObserverOnPreDrawListenerC22668xe0605023 = this;
                i27 = i39;
                fArr = fArr2;
                min = i37;
                max = i38;
                lineForOffset2 = i47;
                lineBottom = f17;
                lineTop = lineTop;
            }
            i27++;
            viewTreeObserverOnPreDrawListenerC22668xe0605023 = this;
            i19 = i28;
        }
        android.view.inputmethod.CursorAnchorInfo build = builder.setMatrix(null).build();
        for (int i49 = 0; i49 < i18; i49++) {
            int i57 = i17 + i49;
            if ((build.getCharacterBoundsFlags(i57) & 1) == 1 && (characterBounds = build.getCharacterBounds(i57)) != null) {
                rectFArr[i49] = characterBounds;
            }
        }
        accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
    }

    /* renamed from: append */
    public final void m81614xabe4cf1a(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        java.lang.CharSequence charSequence2 = this.A;
        if (!(charSequence2 instanceof android.text.Editable)) {
            n0(charSequence2, android.widget.TextView.BufferType.EDITABLE);
        }
        ((android.text.Editable) this.A).append(charSequence, 0, length);
        int i17 = this.V;
        if (i17 == 0 || !android.text.util.Linkify.addLinks(this.B, i17) || !this.W || v0()) {
            return;
        }
        m81777x3d6d7372(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22672x3783f92a.m81861x9cf0d20b());
    }

    @Override // android.view.View
    public void autofill(android.view.autofill.AutofillValue autofillValue) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 26 || (autofillValue.isText() && V())) {
            o0(i17 >= 26 ? autofillValue.getTextValue() : null, this.D, true, 0);
            java.lang.CharSequence mo81602xfb85ada3 = mo81602xfb85ada3();
            if (mo81602xfb85ada3 instanceof android.text.Spannable) {
                android.text.Selection.setSelection((android.text.Spannable) mo81602xfb85ada3, mo81602xfb85ada3.length());
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("cmEdit.CMTextView", autofillValue + " could not be autofilled into " + this);
    }

    public void b0(int i17, int i18) {
        sendAccessibilityEvent(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011d A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c0(int r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.c0(int):boolean");
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.f354493r = true;
        }
    }

    /* renamed from: clearComposingText */
    public void m81615x1b248a4f() {
        if (this.A instanceof android.text.Spannable) {
            android.view.inputmethod.BaseInputConnection.removeComposingSpans(this.B);
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        android.text.Layout layout = this.M;
        return layout != null ? (this.E1 && (this.T & 7) == 3) ? (int) layout.getLineWidth(0) : layout.getWidth() : super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.K1;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return (getHeight() - m81631x51707585()) - m81626xf4837fb();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        android.text.Layout layout = this.M;
        return layout != null ? layout.getHeight() : super.computeVerticalScrollRange();
    }

    public final void d0() {
        if (this.f293141s) {
            return;
        }
        getViewTreeObserver().addOnPreDrawListener(this);
        this.f293141s = true;
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f17, float f18) {
        super.drawableHotspotChanged(f17, f18);
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            for (android.graphics.drawable.Drawable drawable : gVar.f354514b) {
                if (drawable != null) {
                    drawable.setHotspot(f17, f18);
                }
            }
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        super.drawableStateChanged();
        android.content.res.ColorStateList colorStateList3 = this.f293115d;
        if ((colorStateList3 != null && colorStateList3.isStateful()) || (((colorStateList = this.f293117e) != null && colorStateList.isStateful()) || ((colorStateList2 = this.f293119f) != null && colorStateList2.isStateful()))) {
            x0();
        }
        if (this.f293152z != null) {
            int[] drawableState = getDrawableState();
            for (android.graphics.drawable.Drawable drawable : this.f293152z.f354514b) {
                if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
                    invalidateDrawable(drawable);
                }
            }
        }
    }

    public final void e0(int i17, int i18, java.lang.Class cls) {
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            android.text.Editable editable = (android.text.Editable) charSequence;
            java.lang.Object[] spans = editable.getSpans(i17, i18, cls);
            int length = spans.length;
            for (int i19 = 0; i19 < length; i19++) {
                int spanStart = editable.getSpanStart(spans[i19]);
                if (editable.getSpanEnd(spans[i19]) == i17 || spanStart == i18) {
                    return;
                }
                editable.removeSpan(spans[i19]);
            }
        }
    }

    public java.lang.CharSequence f0(java.lang.CharSequence charSequence) {
        if (!(charSequence instanceof android.text.Spanned)) {
            return charSequence;
        }
        android.text.Spannable newSpannable = charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : this.f293133n.newSpannable(charSequence);
        android.text.style.SuggestionSpan[] suggestionSpanArr = (android.text.style.SuggestionSpan[]) newSpannable.getSpans(0, charSequence.length(), android.text.style.SuggestionSpan.class);
        if (suggestionSpanArr.length == 0) {
            return charSequence;
        }
        for (android.text.style.SuggestionSpan suggestionSpan : suggestionSpanArr) {
            newSpannable.removeSpan(suggestionSpan);
        }
        return newSpannable;
    }

    @Override // android.view.View
    public void findViewsWithText(java.util.ArrayList arrayList, java.lang.CharSequence charSequence, int i17) {
        super.findViewsWithText(arrayList, charSequence, i17);
        if (arrayList.contains(this) || (i17 & 1) == 0 || android.text.TextUtils.isEmpty(charSequence) || android.text.TextUtils.isEmpty(this.A)) {
            return;
        }
        if (this.A.toString().toLowerCase().contains(charSequence.toString().toLowerCase())) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View
    public android.view.View focusSearch(int i17) {
        try {
            return super.focusSearch(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cmEdit.CMTextView", "focusSearch err", th6);
            return null;
        }
    }

    public android.view.ViewParent g() {
        return getParent();
    }

    public final void g0(android.graphics.Typeface typeface, int i17, int i18) {
        if (i18 < 0) {
            p0(typeface, i17);
        } else {
            java.lang.Math.min(1000, i18);
            p0(typeface, i17);
        }
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.class.getName();
    }

    /* renamed from: getAccessibilitySelectionEnd */
    public int m81616x48d5d167() {
        return m81686xffd93625();
    }

    /* renamed from: getAccessibilitySelectionStart */
    public int m81617x6b6f19ee() {
        return m81687x6f2c472c();
    }

    /* renamed from: getAdaptText */
    public android.widget.TextView m81618x9236a0b9() {
        return this.f293124h2;
    }

    @Override // android.view.View
    public int getAutofillType() {
        return V() ? 1 : 0;
    }

    @Override // android.view.View
    public android.view.autofill.AutofillValue getAutofillValue() {
        if (!V()) {
            return null;
        }
        java.lang.CharSequence b17 = jl5.b.b(mo81602xfb85ada3());
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return android.view.autofill.AutofillValue.forText(b17);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.M == null ? super.getBaseline() : m81619xe56c7c2e() + this.M.getLineBaseline(0);
    }

    /* renamed from: getBaselineOffset */
    public int m81619xe56c7c2e() {
        return m81640x14c7f93() + ((this.T & 112) != 48 ? L(true) : 0);
    }

    @Override // android.view.View
    public int getBottomPaddingOffset() {
        return (int) java.lang.Math.max(0.0f, this.f293139q + this.f293135o);
    }

    /* renamed from: getCompoundDrawablePadding */
    public int m81620x63867032() {
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            return gVar.f354531s;
        }
        return 0;
    }

    /* renamed from: getCompoundDrawableTintBlendMode */
    public android.graphics.BlendMode m81621x34688c3a() {
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            return gVar.f354516d;
        }
        return null;
    }

    /* renamed from: getCompoundDrawableTintList */
    public android.content.res.ColorStateList m81622x65e2d238() {
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            return gVar.f354515c;
        }
        return null;
    }

    /* renamed from: getCompoundDrawableTintMode */
    public android.graphics.PorterDuff.Mode m81623x65e35b3d() {
        return null;
    }

    /* renamed from: getCompoundDrawables */
    public android.graphics.drawable.Drawable[] m81624x3cd42174() {
        gl5.g gVar = this.f293152z;
        return gVar != null ? (android.graphics.drawable.Drawable[]) gVar.f354514b.clone() : new android.graphics.drawable.Drawable[]{null, null, null, null};
    }

    /* renamed from: getCompoundDrawablesRelative */
    public android.graphics.drawable.Drawable[] m81625xcf3cc60() {
        gl5.g gVar = this.f293152z;
        if (gVar == null) {
            return new android.graphics.drawable.Drawable[]{null, null, null, null};
        }
        android.graphics.drawable.Drawable[] drawableArr = gVar.f354514b;
        return new android.graphics.drawable.Drawable[]{gVar.f354519g, drawableArr[1], gVar.f354520h, drawableArr[3]};
    }

    /* renamed from: getCompoundPaddingBottom */
    public int m81626xf4837fb() {
        gl5.g gVar = this.f293152z;
        return (gVar == null || gVar.f354514b[3] == null) ? getPaddingBottom() : getPaddingBottom() + gVar.f354531s + gVar.f354524l;
    }

    /* renamed from: getCompoundPaddingEnd */
    public int m81627x51703d0b() {
        return getLayoutDirection() != 1 ? m81629xb70a2a4c() : m81628xdc9a71d7();
    }

    /* renamed from: getCompoundPaddingLeft */
    public int m81628xdc9a71d7() {
        gl5.g gVar = this.f293152z;
        return (gVar == null || gVar.f354514b[0] == null) ? getPaddingLeft() : getPaddingLeft() + gVar.f354531s + gVar.f354525m;
    }

    /* renamed from: getCompoundPaddingRight */
    public int m81629xb70a2a4c() {
        gl5.g gVar = this.f293152z;
        return (gVar == null || gVar.f354514b[2] == null) ? getPaddingRight() : getPaddingRight() + gVar.f354531s + gVar.f354526n;
    }

    /* renamed from: getCompoundPaddingStart */
    public int m81630xb71d2c92() {
        return getLayoutDirection() != 1 ? m81628xdc9a71d7() : m81629xb70a2a4c();
    }

    /* renamed from: getCompoundPaddingTop */
    public int m81631x51707585() {
        gl5.g gVar = this.f293152z;
        return (gVar == null || gVar.f354514b[1] == null) ? getPaddingTop() : getPaddingTop() + gVar.f354531s + gVar.f354523k;
    }

    /* renamed from: getCurrentHintTextColor */
    public final int m81632xc87f72ec() {
        return this.f293117e != null ? this.f293123h : this.f293121g;
    }

    /* renamed from: getCurrentTextColor */
    public final int m81633xac551033() {
        return this.f293121g;
    }

    /* renamed from: getCustomInsertionActionModeCallback */
    public android.view.ActionMode.Callback m81634xa414ca86() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.L;
    }

    /* renamed from: getCustomSelectionActionModeCallback */
    public android.view.ActionMode.Callback m81635xda617023() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.K;
    }

    /* renamed from: getDefaultEditable */
    public boolean mo81599xbafd298f() {
        return false;
    }

    /* renamed from: getDefaultMovementMethod */
    public il5.a mo81600xd12d2d5b() {
        return null;
    }

    /* renamed from: getEditableText */
    public android.text.Editable m81636x4ef76827() {
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            return (android.text.Editable) charSequence;
        }
        return null;
    }

    /* renamed from: getEditor */
    public gl5.e0 m81637x17234463() {
        return this.f293122g2;
    }

    @android.view.ViewDebug.ExportedProperty
    /* renamed from: getEllipsize */
    public android.text.TextUtils.TruncateAt m81638x5c1a2bd7() {
        return this.f293149y;
    }

    /* renamed from: getExtendedPaddingBottom */
    public int m81639x67e4b2d() {
        if (this.f293129l1 != 1) {
            return m81626xf4837fb();
        }
        if (this.M == null) {
            t();
        }
        if (this.M.getLineCount() <= this.f293150y0) {
            return m81626xf4837fb();
        }
        int m81631x51707585 = m81631x51707585();
        int m81626xf4837fb = m81626xf4837fb();
        int height = (getHeight() - m81631x51707585) - m81626xf4837fb;
        int lineTop = this.M.getLineTop(this.f293150y0);
        if (lineTop >= height) {
            return m81626xf4837fb;
        }
        int i17 = this.T & 112;
        return i17 == 48 ? (m81626xf4837fb + height) - lineTop : i17 == 80 ? m81626xf4837fb : m81626xf4837fb + ((height - lineTop) / 2);
    }

    /* renamed from: getExtendedPaddingTop */
    public int m81640x14c7f93() {
        int i17;
        if (this.f293129l1 != 1) {
            return m81631x51707585();
        }
        if (this.M == null) {
            t();
        }
        if (this.M.getLineCount() <= this.f293150y0) {
            return m81631x51707585();
        }
        int m81631x51707585 = m81631x51707585();
        int height = (getHeight() - m81631x51707585) - m81626xf4837fb();
        int lineTop = this.M.getLineTop(this.f293150y0);
        return (lineTop < height && (i17 = this.T & 112) != 48) ? i17 == 80 ? (m81631x51707585 + height) - lineTop : m81631x51707585 + ((height - lineTop) / 2) : m81631x51707585;
    }

    /* renamed from: getFilters */
    public android.text.InputFilter[] m81641xadddfc5() {
        return this.Q1;
    }

    /* renamed from: getFirstBaselineToTopHeight */
    public int m81642x77e793c2() {
        return getPaddingTop() - m81679x74f59ea8().getFontMetricsInt().top;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        if (this.M == null) {
            super.getFocusedRect(rect);
            return;
        }
        int m81686xffd93625 = m81686xffd93625();
        if (m81686xffd93625 < 0) {
            super.getFocusedRect(rect);
            return;
        }
        int m81687x6f2c472c = m81687x6f2c472c();
        if (m81687x6f2c472c < 0 || m81687x6f2c472c >= m81686xffd93625) {
            int lineForOffset = this.M.getLineForOffset(m81686xffd93625);
            rect.top = this.M.getLineTop(lineForOffset);
            rect.bottom = this.M.getLineBottom(lineForOffset);
            int primaryHorizontal = ((int) this.M.getPrimaryHorizontal(m81686xffd93625)) - 2;
            rect.left = primaryHorizontal;
            rect.right = primaryHorizontal + 4;
        } else {
            int lineForOffset2 = this.M.getLineForOffset(m81687x6f2c472c);
            int lineForOffset3 = this.M.getLineForOffset(m81686xffd93625);
            rect.top = this.M.getLineTop(lineForOffset2);
            rect.bottom = this.M.getLineBottom(lineForOffset3);
            if (lineForOffset2 == lineForOffset3) {
                rect.left = (int) this.M.getPrimaryHorizontal(m81687x6f2c472c);
                rect.right = (int) this.M.getPrimaryHorizontal(m81686xffd93625);
            } else {
                if (this.V1) {
                    if (this.T1 == null) {
                        this.T1 = new android.graphics.Path();
                    }
                    this.T1.reset();
                    this.M.getSelectionPath(m81687x6f2c472c, m81686xffd93625, this.T1);
                    this.V1 = false;
                }
                android.graphics.RectF rectF = f293105p2;
                synchronized (rectF) {
                    this.T1.computeBounds(rectF, true);
                    rect.left = ((int) rectF.left) - 1;
                    rect.right = ((int) rectF.right) + 1;
                }
            }
        }
        int m81628xdc9a71d7 = m81628xdc9a71d7();
        int m81640x14c7f93 = m81640x14c7f93();
        if ((this.T & 112) != 48) {
            m81640x14c7f93 += L(false);
        }
        rect.offset(m81628xdc9a71d7, m81640x14c7f93);
        rect.bottom += m81639x67e4b2d();
    }

    /* renamed from: getFontFeatureSettings */
    public java.lang.String m81643x9ca4c5b4() {
        return this.K.getFontFeatureSettings();
    }

    /* renamed from: getFontVariationSettings */
    public java.lang.String m81644x12ab4d11() {
        return android.os.Build.VERSION.SDK_INT >= 26 ? this.K.getFontVariationSettings() : "";
    }

    /* renamed from: getFreezesText */
    public boolean mo81601x590e5ad3() {
        return this.f293125i;
    }

    /* renamed from: getGravity */
    public int m81645x4e85ae18() {
        return this.T;
    }

    /* renamed from: getHighlightColor */
    public int m81646xbd65005() {
        return this.S1;
    }

    @android.view.ViewDebug.CapturedViewProperty
    /* renamed from: getHint */
    public java.lang.CharSequence m81647xfb8046fd() {
        return this.E;
    }

    /* renamed from: getHintTextColors */
    public final android.content.res.ColorStateList m81648x1401e3da() {
        return this.f293117e;
    }

    /* renamed from: getHorizontalOffsetForDrawables */
    public int m81649x81b3dab9() {
        return 0;
    }

    /* renamed from: getHorizontallyScrolling */
    public boolean m81650x78cd2a8e() {
        return this.U;
    }

    /* renamed from: getImeActionId */
    public int m81651xf0bc39c() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (rVar = e0Var.f354485j) == null) {
            return 0;
        }
        return rVar.f354615d;
    }

    /* renamed from: getImeActionLabel */
    public java.lang.CharSequence m81652xea2aacd3() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (rVar = e0Var.f354485j) == null) {
            return null;
        }
        return rVar.f354614c;
    }

    /* renamed from: getImeHintLocales */
    public android.os.LocaleList m81653x7ab58b47() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (rVar = e0Var.f354485j) == null) {
            return null;
        }
        return rVar.f354619h;
    }

    /* renamed from: getImeOptions */
    public int m81654x56193393() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (rVar = e0Var.f354485j) == null) {
            return 0;
        }
        return rVar.f354612a;
    }

    /* renamed from: getIncludeFontPadding */
    public boolean m81655x8bc4dcf0() {
        return this.G1;
    }

    /* renamed from: getInputExtras */
    public android.os.Bundle m81656xafeef997(boolean z17) {
        if (this.f293122g2 == null && !z17) {
            return null;
        }
        D();
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var.f354485j == null) {
            if (!z17) {
                return null;
            }
            e0Var.d();
        }
        gl5.r rVar = this.f293122g2.f354485j;
        if (rVar.f354616e == null) {
            if (!z17) {
                return null;
            }
            rVar.f354616e = new android.os.Bundle();
        }
        return this.f293122g2.f354485j.f354616e;
    }

    /* renamed from: getInputType */
    public int m81657x652bd76e() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.f354491p;
    }

    /* renamed from: getIterableTextForAccessibility */
    public java.lang.CharSequence m81658x714bf45a() {
        return this.A;
    }

    /* renamed from: getKeyListener */
    public final android.text.method.KeyListener m81659xded63efd() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return null;
        }
        return e0Var.f354490o;
    }

    /* renamed from: getLastBaselineToBottomHeight */
    public int m81660x1e44791e() {
        return getPaddingBottom() + m81679x74f59ea8().getFontMetricsInt().bottom;
    }

    /* renamed from: getLayout */
    public final android.text.Layout m81661x22f21e20() {
        return this.M;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (m81663x92d2fac5() != 1) {
            return super.getLeftFadingEdgeStrength();
        }
        float lineLeft = m81661x22f21e20().getLineLeft(0);
        if (lineLeft > getScrollX()) {
            return 0.0f;
        }
        float scrollX = getScrollX();
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (horizontalFadingEdgeLength == 0) {
            return 0.0f;
        }
        float abs = java.lang.Math.abs(scrollX - lineLeft);
        float f17 = horizontalFadingEdgeLength;
        if (abs > f17) {
            return 1.0f;
        }
        return abs / f17;
    }

    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return (m81628xdc9a71d7() - getPaddingLeft()) + ((int) java.lang.Math.min(0.0f, this.f293136p - this.f293135o));
    }

    /* renamed from: getLetterSpacing */
    public float m81662x3b343d87() {
        return this.K.getLetterSpacing();
    }

    /* renamed from: getLineCount */
    public int m81663x92d2fac5() {
        android.text.Layout layout = this.M;
        if (layout != null) {
            return layout.getLineCount();
        }
        return 0;
    }

    /* renamed from: getLineHeight */
    public int m81664xcf821e31() {
        return (int) (((((this.K.getFontMetricsInt(null) * this.f293137p0) + this.f293147x0) * 1.6777216E7f) + 8388608) >> 24);
    }

    /* renamed from: getLineSpacingExtra */
    public float m81665x66610f17() {
        return this.f293147x0;
    }

    /* renamed from: getLineSpacingMultiplier */
    public float m81666x5274cf1a() {
        return this.f293137p0;
    }

    /* renamed from: getLinkTextColors */
    public final android.content.res.ColorStateList m81667x5f6ec18d() {
        return this.f293119f;
    }

    /* renamed from: getLinksClickable */
    public final boolean m81668x5527941f() {
        return this.W;
    }

    /* renamed from: getMaxEms */
    public int m81669x24a5e3bd() {
        if (this.B1 == 1) {
            return this.A1;
        }
        return -1;
    }

    /* renamed from: getMaxHeight */
    public int m81670xc96bf8f5() {
        if (this.f293129l1 == 2) {
            return this.f293150y0;
        }
        return -1;
    }

    /* renamed from: getMaxLines */
    public int m81671x931cb571() {
        if (this.f293129l1 == 1) {
            return this.f293150y0;
        }
        return -1;
    }

    /* renamed from: getMaxWidth */
    public int m81672x93b79438() {
        if (this.B1 == 2) {
            return this.A1;
        }
        return -1;
    }

    /* renamed from: getMenuCallback */
    public nl5.a0 m81673x1a3c5d3a() {
        return this.f293130l2;
    }

    /* renamed from: getMinEms */
    public int m81674x2512140f() {
        if (this.D1 == 1) {
            return this.C1;
        }
        return -1;
    }

    /* renamed from: getMinHeight */
    public int m81675xf7770f63() {
        if (this.f293148x1 == 2) {
            return this.f293138p1;
        }
        return -1;
    }

    /* renamed from: getMinLines */
    public int m81676x293e1943() {
        if (this.f293148x1 == 1) {
            return this.f293138p1;
        }
        return -1;
    }

    /* renamed from: getMinWidth */
    public int m81677x29d8f80a() {
        if (this.D1 == 2) {
            return this.C1;
        }
        return -1;
    }

    /* renamed from: getMovementMethod */
    public final il5.a m81678x75770b66() {
        return this.G;
    }

    /* renamed from: getPaint */
    public android.text.TextPaint m81679x74f59ea8() {
        return this.K;
    }

    /* renamed from: getPaintFlags */
    public int m81680x1c9848bf() {
        return this.K.getFlags();
    }

    /* renamed from: getPrivateImeOptions */
    public java.lang.String m81681x80bd3cca() {
        gl5.r rVar;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (rVar = e0Var.f354485j) == null) {
            return null;
        }
        return rVar.f354613b;
    }

    /* renamed from: getReuseBrands */
    public java.util.Set<java.lang.String> m81682x4bfed82a() {
        return this.f293134n2;
    }

    /* renamed from: getReuseItems */
    public java.util.Set<java.lang.String> m81683x23df71a2() {
        return this.f293132m2;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength;
        if (m81663x92d2fac5() != 1) {
            return super.getRightFadingEdgeStrength();
        }
        float scrollX = getScrollX() + ((getWidth() - m81628xdc9a71d7()) - m81629xb70a2a4c());
        float lineRight = m81661x22f21e20().getLineRight(0);
        if (lineRight < scrollX || (horizontalFadingEdgeLength = getHorizontalFadingEdgeLength()) == 0) {
            return 0.0f;
        }
        float abs = java.lang.Math.abs(scrollX - lineRight);
        float f17 = horizontalFadingEdgeLength;
        if (abs > f17) {
            return 1.0f;
        }
        return abs / f17;
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return (-(m81629xb70a2a4c() - getPaddingRight())) + ((int) java.lang.Math.max(0.0f, this.f293136p + this.f293135o));
    }

    @android.view.ViewDebug.ExportedProperty(category = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)
    /* renamed from: getScaledTextSize */
    public float m81684x706c923e() {
        return this.K.getTextSize() / this.K.density;
    }

    /* renamed from: getSelectedText */
    public java.lang.String m81685xf85f78de() {
        if (!M()) {
            return null;
        }
        int m81687x6f2c472c = m81687x6f2c472c();
        int m81686xffd93625 = m81686xffd93625();
        java.lang.CharSequence charSequence = this.A;
        return java.lang.String.valueOf(m81687x6f2c472c > m81686xffd93625 ? charSequence.subSequence(m81686xffd93625, m81687x6f2c472c) : charSequence.subSequence(m81687x6f2c472c, m81686xffd93625));
    }

    @android.view.ViewDebug.ExportedProperty(category = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)
    /* renamed from: getSelectionEnd */
    public int m81686xffd93625() {
        return android.text.Selection.getSelectionEnd(mo81602xfb85ada3());
    }

    @android.view.ViewDebug.ExportedProperty(category = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)
    /* renamed from: getSelectionStart */
    public int m81687x6f2c472c() {
        return android.text.Selection.getSelectionStart(mo81602xfb85ada3());
    }

    /* renamed from: getShadowColor */
    public int m81688x7b14c0ed() {
        return this.f293140r;
    }

    /* renamed from: getShadowDx */
    public float m81689x4ec4f74a() {
        return this.f293136p;
    }

    /* renamed from: getShadowDy */
    public float m81690x4ec4f74b() {
        return this.f293139q;
    }

    /* renamed from: getShadowRadius */
    public float m81691x530c48() {
        return this.f293135o;
    }

    /* renamed from: getShowSoftInputOnFocus */
    public final boolean m81692x21468dec() {
        gl5.e0 e0Var = this.f293122g2;
        return e0Var == null || e0Var.f354501z;
    }

    /* renamed from: getSpellCheckerLocale */
    public java.util.Locale m81693xa9ee201d() {
        android.os.AsyncTask.execute(new gl5.d(this));
        return null;
    }

    @android.view.ViewDebug.CapturedViewProperty
    /* renamed from: getText */
    public java.lang.CharSequence mo81602xfb85ada3() {
        return this.A;
    }

    /* renamed from: getTextClassificationContext */
    public android.view.textclassifier.TextClassificationContext m81694xaae42106() {
        return this.f293145w;
    }

    /* renamed from: getTextClassificationManagerForUser */
    public final android.view.textclassifier.TextClassificationManager m81695x8fbb5090() {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        getContext().getPackageName();
        return (android.view.textclassifier.TextClassificationManager) (this.R1 == null ? getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class) : null);
    }

    /* renamed from: getTextClassificationSession */
    public android.view.textclassifier.TextClassifier m81696xe87d6ded() {
        android.view.textclassifier.TextClassifier textClassifier;
        if (android.os.Build.VERSION.SDK_INT >= 28 && ((textClassifier = this.f293144v) == null || textClassifier.isDestroyed())) {
            android.view.textclassifier.TextClassificationManager m81695x8fbb5090 = m81695x8fbb5090();
            if (m81695x8fbb5090 != null) {
                android.view.textclassifier.TextClassificationContext build = new android.view.textclassifier.TextClassificationContext.Builder(getContext().getPackageName(), V() ? "edittext" : W() ? "textview" : "nosel-textview").build();
                this.f293145w = build;
                if (this.f293143u == null) {
                    this.f293144v = m81695x8fbb5090.createTextClassificationSession(build);
                }
            } else {
                this.f293144v = android.view.textclassifier.TextClassifier.NO_OP;
            }
        }
        return this.f293144v;
    }

    /* renamed from: getTextClassifier */
    public android.view.textclassifier.TextClassifier m81697xd9ba3424() {
        if (this.f293143u == null) {
            android.view.textclassifier.TextClassificationManager m81695x8fbb5090 = m81695x8fbb5090();
            if (m81695x8fbb5090 != null && android.os.Build.VERSION.SDK_INT >= 26) {
                return m81695x8fbb5090.getTextClassifier();
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                return android.view.textclassifier.TextClassifier.NO_OP;
            }
        }
        return this.f293143u;
    }

    /* renamed from: getTextColors */
    public final android.content.res.ColorStateList m81698x410b50f3() {
        return this.f293115d;
    }

    /* renamed from: getTextCursorDrawable */
    public android.graphics.drawable.Drawable m81699x9ff5a297() {
        if (this.X1 == null && this.W1 != 0) {
            this.X1 = getContext().getDrawable(this.W1);
        }
        return this.X1;
    }

    /* renamed from: getTextDirectionHeuristic */
    public android.text.TextDirectionHeuristic m81700xe50814e() {
        if (this.H instanceof android.text.method.PasswordTransformationMethod) {
            return android.text.TextDirectionHeuristics.LTR;
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null && (e0Var.f354491p & 15) == 3) {
            byte directionality = java.lang.Character.getDirectionality((android.os.Build.VERSION.SDK_INT >= 28 ? android.icu.text.DecimalFormatSymbols.getInstance(m81701x5062a1dd()).getDigitStrings()[0] : null).codePointAt(0));
            return (directionality == 1 || directionality == 2) ? android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
        }
        boolean z17 = getLayoutDirection() == 1;
        switch (getTextDirection()) {
            case 2:
                return android.text.TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return android.text.TextDirectionHeuristics.LTR;
            case 4:
                return android.text.TextDirectionHeuristics.RTL;
            case 5:
                return android.text.TextDirectionHeuristics.LOCALE;
            case 6:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z17 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: getTextLocale */
    public java.util.Locale m81701x5062a1dd() {
        return this.K.getTextLocale();
    }

    /* renamed from: getTextLocales */
    public android.os.LocaleList m81702xbbf19a36() {
        return this.K.getTextLocales();
    }

    /* renamed from: getTextScaleX */
    public float m81703x5baab3d1() {
        return this.K.getTextScaleX();
    }

    /* renamed from: getTextSelectHandle */
    public android.graphics.drawable.Drawable m81704xb4748787() {
        if (this.f293116d2 == null && this.f293114c2 != 0) {
            this.f293116d2 = getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563705bt4);
        }
        return this.f293116d2;
    }

    /* renamed from: getTextSelectHandleLeft */
    public android.graphics.drawable.Drawable m81705xd06b802e() {
        if (this.Z1 == null && this.Y1 != 0) {
            this.Z1 = getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563704bt3);
        }
        return this.Z1;
    }

    /* renamed from: getTextSelectHandleRight */
    public android.graphics.drawable.Drawable m81706x3d5ae6d5() {
        if (this.f293113b2 == null && this.f293112a2 != 0) {
            this.f293113b2 = getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563706bt5);
        }
        return this.f293113b2;
    }

    /* renamed from: getTextServicesLocale */
    public java.util.Locale m81707x9f3c2cdb() {
        android.os.AsyncTask.execute(new gl5.d(this));
        return java.util.Locale.getDefault();
    }

    /* renamed from: getTextServicesManagerForUser */
    public final android.view.textservice.TextServicesManager m81708x1fd46948() {
        return (android.view.textservice.TextServicesManager) (this.R1 == null ? getContext().getSystemService(android.view.textservice.TextServicesManager.class) : null);
    }

    @android.view.ViewDebug.ExportedProperty(category = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)
    /* renamed from: getTextSize */
    public float m81709x40077844() {
        return this.K.getTextSize();
    }

    /* renamed from: getTextSizeUnit */
    public int m81710x837203e8() {
        return this.P;
    }

    @Override // android.view.View
    public int getTopPaddingOffset() {
        return (int) java.lang.Math.min(0.0f, this.f293139q - this.f293135o);
    }

    /* renamed from: getTotalPaddingBottom */
    public int m81711xe699d6ae() {
        int i17;
        int m81640x14c7f93;
        int m81639x67e4b2d;
        int m81639x67e4b2d2 = m81639x67e4b2d();
        int i18 = this.T & 112;
        android.text.Layout layout = this.M;
        if (i18 != 80) {
            if (layout == this.F) {
                m81640x14c7f93 = m81631x51707585();
                m81639x67e4b2d = m81626xf4837fb();
            } else {
                m81640x14c7f93 = m81640x14c7f93();
                m81639x67e4b2d = m81639x67e4b2d();
            }
            int measuredHeight = getMeasuredHeight() - (m81640x14c7f93 + m81639x67e4b2d);
            int height = layout.getHeight();
            if (height < measuredHeight) {
                i17 = measuredHeight - height;
                if (i18 != 48) {
                    i17 >>= 1;
                }
                return m81639x67e4b2d2 + i17;
            }
        }
        i17 = 0;
        return m81639x67e4b2d2 + i17;
    }

    /* renamed from: getTotalPaddingEnd */
    public int m81712xd5535338() {
        return m81627x51703d0b();
    }

    /* renamed from: getTotalPaddingLeft */
    public int m81713xd51a214a() {
        return m81628xdc9a71d7();
    }

    /* renamed from: getTotalPaddingRight */
    public int m81714xce806939() {
        return m81629xb70a2a4c();
    }

    /* renamed from: getTotalPaddingStart */
    public int m81715xce936b7f() {
        return m81630xb71d2c92();
    }

    /* renamed from: getTotalPaddingTop */
    public int m81716xd5538bb2() {
        return m81640x14c7f93() + L(true);
    }

    /* renamed from: getTransformationMethod */
    public final android.text.method.TransformationMethod m81717x261961c0() {
        return this.H;
    }

    /* renamed from: getTransformed */
    public java.lang.CharSequence m81718x62a793d5() {
        return this.C;
    }

    /* renamed from: getTypeface */
    public android.graphics.Typeface m81719x5392760d() {
        return this.K.getTypeface();
    }

    @android.view.ViewDebug.ExportedProperty(category = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, mapping = {@android.view.ViewDebug.IntToString(from = 0, to = "NORMAL"), @android.view.ViewDebug.IntToString(from = 1, to = "BOLD"), @android.view.ViewDebug.IntToString(from = 2, to = "ITALIC"), @android.view.ViewDebug.IntToString(from = 3, to = "BOLD_ITALIC")})
    /* renamed from: getTypefaceStyle */
    public int m81720x8e7e77a4() {
        android.graphics.Typeface typeface = this.K.getTypeface();
        if (typeface != null) {
            return typeface.getStyle();
        }
        return 0;
    }

    /* renamed from: getUrls */
    public android.text.style.URLSpan[] m81721xfb86515a() {
        java.lang.CharSequence charSequence = this.A;
        return charSequence instanceof android.text.Spanned ? (android.text.style.URLSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.URLSpan.class) : new android.text.style.URLSpan[0];
    }

    /* renamed from: getWordIterator */
    public kl5.b m81722x81761c0e() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null) {
            return null;
        }
        if (e0Var.Q == null) {
            e0Var.Q = new kl5.b(e0Var.U.m81707x9f3c2cdb());
        }
        return e0Var.Q;
    }

    public void h() {
        requestLayout();
    }

    public boolean h0() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null && e0Var != null) {
            e0Var.U.removeCallbacks(e0Var.V);
            hl5.g gVar = e0Var.Z;
            if (gVar != null) {
                try {
                    gVar.f363667i.m81637x17234463().n().b(gVar.f363673o);
                    gVar.f363659a.dismiss();
                } catch (java.lang.Throwable unused) {
                }
            }
            android.view.ActionMode actionMode = e0Var.f354478c;
            if (actionMode != null) {
                actionMode.hide(500);
            }
        }
        int length = this.A.length();
        android.text.Selection.setSelection(this.B, 0, length);
        return length > 0;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return ((getBackground() == null || getBackground().getCurrent() == null) && this.B == null && !M() && !isHorizontalFadingEdgeEnabled() && this.f293140r == 0) ? false : true;
    }

    public int i() {
        return getWidth();
    }

    public final void i0(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.Class<?> cls;
        java.util.ArrayList arrayList = this.f293111J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                ((android.text.TextWatcher) arrayList.get(i27)).beforeTextChanged(charSequence, i17, i18, i19);
            }
        }
        try {
            cls = java.lang.Class.forName("android.text.style.SpellCheckSpan");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            e0(i17, i17 + i18, cls);
        }
        e0(i17, i18 + i17, android.text.style.SuggestionSpan.class);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        int bottom;
        int m81631x51707585;
        int i17;
        boolean z17 = false;
        if (verifyDrawable(drawable)) {
            android.graphics.Rect bounds = drawable.getBounds();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            gl5.g gVar = this.f293152z;
            if (gVar != null) {
                android.graphics.drawable.Drawable[] drawableArr = gVar.f354514b;
                if (drawable == drawableArr[0]) {
                    m81631x51707585 = m81631x51707585();
                    int bottom2 = ((getBottom() - getTop()) - m81626xf4837fb()) - m81631x51707585;
                    scrollX += getPaddingLeft();
                    i17 = (bottom2 - gVar.f354529q) / 2;
                } else if (drawable == drawableArr[2]) {
                    m81631x51707585 = m81631x51707585();
                    int bottom3 = ((getBottom() - getTop()) - m81626xf4837fb()) - m81631x51707585;
                    scrollX += ((getRight() - getLeft()) - getPaddingRight()) - gVar.f354526n;
                    i17 = (bottom3 - gVar.f354530r) / 2;
                } else {
                    if (drawable == drawableArr[1]) {
                        int m81628xdc9a71d7 = m81628xdc9a71d7();
                        scrollX += m81628xdc9a71d7 + (((((getRight() - getLeft()) - m81629xb70a2a4c()) - m81628xdc9a71d7) - gVar.f354527o) / 2);
                        bottom = getPaddingTop();
                    } else if (drawable == drawableArr[3]) {
                        int m81628xdc9a71d72 = m81628xdc9a71d7();
                        scrollX += m81628xdc9a71d72 + (((((getRight() - getLeft()) - m81629xb70a2a4c()) - m81628xdc9a71d72) - gVar.f354528p) / 2);
                        bottom = ((getBottom() - getTop()) - getPaddingBottom()) - gVar.f354524l;
                    }
                    scrollY += bottom;
                    z17 = true;
                }
                bottom = m81631x51707585 + i17;
                scrollY += bottom;
                z17 = true;
            }
            if (z17) {
                invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
            }
        }
        if (z17) {
            return;
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isPaddingOffsetRequired() {
        return (this.f293135o == 0.0f && this.f293152z == null) ? false : true;
    }

    public void j0(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = this.f293111J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i27 = 0; i27 < size; i27++) {
                ((android.text.TextWatcher) arrayList.get(i27)).onTextChanged(charSequence, i17, i18, i19);
            }
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.o().getClass();
            e0Var.S = true;
            e0Var.r();
            gl5.b0 b0Var = e0Var.f354477b;
            if (b0Var != null) {
                b0Var.g();
            }
            e0Var.J();
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        gl5.g gVar = this.f293152z;
        if (gVar != null) {
            for (android.graphics.drawable.Drawable drawable : gVar.f354514b) {
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                }
            }
        }
    }

    public boolean k() {
        return requestFocus();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final void k0(android.text.Editable editable, android.text.InputFilter[] inputFilterArr) {
        ?? r07;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || (r07 = e0Var.f354490o instanceof android.text.InputFilter) <= 0) {
            editable.setFilters(inputFilterArr);
            return;
        }
        android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + (r07 == true ? 1 : 0)];
        java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, inputFilterArr.length);
        if (r07 != 0) {
            inputFilterArr2[inputFilterArr.length + 0] = (android.text.InputFilter) this.f293122g2.f354490o;
        }
        editable.setFilters(inputFilterArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(int r8, boolean r9) {
        /*
            r7 = this;
            r0 = r8 & 15
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L2b
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r8
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L15
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.CHARACTERS
            goto L25
        L15:
            r0 = r8 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L1c
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.WORDS
            goto L25
        L1c:
            r0 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L23
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.SENTENCES
            goto L25
        L23:
            android.text.method.TextKeyListener$Capitalize r0 = android.text.method.TextKeyListener.Capitalize.NONE
        L25:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance(r2, r0)
            goto La1
        L2b:
            r3 = 2
            r4 = 26
            r5 = 0
            if (r0 != r3) goto L5f
            java.util.Locale r0 = r7.m81605xd8272795()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L4b
            r4 = r8 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            r5 = r8 & 8192(0x2000, float:1.148E-41)
            if (r5 == 0) goto L45
            goto L46
        L45:
            r2 = r1
        L46:
            android.text.method.DigitsKeyListener r2 = android.text.method.DigitsKeyListener.getInstance(r0, r4, r2)
            goto L4c
        L4b:
            r2 = r5
        L4c:
            if (r0 == 0) goto L5d
            int r0 = r2.getInputType()
            r4 = r0 & 15
            if (r4 == r3) goto L5d
            r8 = r8 & 16
            if (r8 == 0) goto L5c
            r0 = r0 | 128(0x80, float:1.8E-43)
        L5c:
            r8 = r0
        L5d:
            r0 = r2
            goto La1
        L5f:
            r2 = 4
            if (r0 != r2) goto L95
            java.util.Locale r0 = r7.m81605xd8272795()
            r2 = r8 & 4080(0xff0, float:5.717E-42)
            r3 = 16
            if (r2 == r3) goto L82
            r3 = 32
            if (r2 == r3) goto L79
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.DateTimeKeyListener r0 = android.text.method.DateTimeKeyListener.getInstance(r0)
            goto L8c
        L79:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.TimeKeyListener r0 = android.text.method.TimeKeyListener.getInstance(r0)
            goto L8c
        L82:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L8b
            android.text.method.DateKeyListener r0 = android.text.method.DateKeyListener.getInstance(r0)
            goto L8c
        L8b:
            r0 = r5
        L8c:
            boolean r2 = r7.R
            if (r2 == 0) goto La1
            int r8 = r0.getInputType()
            goto La1
        L95:
            r2 = 3
            if (r0 != r2) goto L9d
            android.text.method.DialerKeyListener r0 = android.text.method.DialerKeyListener.getInstance()
            goto La1
        L9d:
            android.text.method.TextKeyListener r0 = android.text.method.TextKeyListener.getInstance()
        La1:
            r7.m81781xda53085e(r8)
            r7.Q = r1
            if (r9 == 0) goto Lb0
            r7.D()
            gl5.e0 r8 = r7.f293122g2
            r8.f354490o = r0
            goto Lb3
        Lb0:
            r7.m81612x3270a5bd(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.l0(int, boolean):void");
    }

    /* renamed from: length */
    public int m81723xbe0e3ae6() {
        return this.A.length();
    }

    public final void m0(float f17, boolean z17) {
        if (f17 != this.K.getTextSize()) {
            this.K.setTextSize(f17);
            if (!z17 || this.M == null) {
                return;
            }
            Y();
            requestLayout();
            invalidate();
        }
    }

    public void n0(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        o0(charSequence, bufferType, true, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        if (r11.G != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(java.lang.CharSequence r12, android.widget.TextView.BufferType r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.o0(java.lang.CharSequence, android.widget.TextView$BufferType, boolean, int):void");
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            android.view.ViewTreeObserver viewTreeObserver = viewTreeObserverOnPreDrawListenerC22668xe0605023.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                gl5.w wVar = e0Var.f354475a;
                if (wVar != null) {
                    viewTreeObserver.addOnTouchModeChangeListener(wVar);
                }
                gl5.b0 b0Var = e0Var.f354477b;
                if (b0Var != null) {
                    b0Var.g();
                    viewTreeObserver.addOnTouchModeChangeListener(e0Var.f354477b);
                }
                viewTreeObserver.addOnDrawListener(e0Var.f354483h);
            }
            if (viewTreeObserverOnPreDrawListenerC22668xe0605023.M()) {
                e0Var.A();
            }
            gl5.n nVar = e0Var.f354496u;
            if (nVar != null) {
                nVar.f354578d = false;
                e0Var.x();
            }
        }
        if (this.f293142t) {
            getViewTreeObserver().addOnPreDrawListener(this);
            this.f293142t = false;
        }
        post(new gl5.c(this));
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        gl5.e0 e0Var = this.f293122g2;
        return (e0Var == null || e0Var.f354491p == 0) ? false : true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N) {
            return;
        }
        this.K.setTextLocales(android.os.LocaleList.getDefault());
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i17) {
        int[] onCreateDrawableState;
        if (this.E1) {
            onCreateDrawableState = super.onCreateDrawableState(i17);
        } else {
            onCreateDrawableState = super.onCreateDrawableState(i17 + 1);
            android.view.View.mergeDrawableStates(onCreateDrawableState, f293108s2);
        }
        if (W()) {
            int length = onCreateDrawableState.length;
            for (int i18 = 0; i18 < length; i18++) {
                if (onCreateDrawableState[i18] == 16842919) {
                    int[] iArr = new int[length - 1];
                    java.lang.System.arraycopy(onCreateDrawableState, 0, iArr, 0, i18);
                    java.lang.System.arraycopy(onCreateDrawableState, i18 + 1, iArr, i18, (length - i18) - 1);
                    return iArr;
                }
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        if (onCheckIsTextEditor() && isEnabled()) {
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var.f354486k == null) {
                e0Var.f354486k = new gl5.s();
            }
            editorInfo.inputType = m81657x652bd76e();
            gl5.r rVar = this.f293122g2.f354485j;
            if (rVar != null) {
                editorInfo.imeOptions = rVar.f354612a;
                editorInfo.privateImeOptions = rVar.f354613b;
                editorInfo.actionLabel = rVar.f354614c;
                editorInfo.actionId = rVar.f354615d;
                editorInfo.extras = rVar.f354616e;
                editorInfo.hintLocales = rVar.f354619h;
            } else {
                editorInfo.imeOptions = 0;
                editorInfo.hintLocales = null;
            }
            int i17 = editorInfo.imeOptions;
            if ((i17 & 255) == 0) {
                if ((134217728 & i17) != 0) {
                    editorInfo.imeOptions = i17 | 5;
                } else {
                    editorInfo.imeOptions = i17 | 6;
                }
                if (!r0()) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 131087) == 131073) {
                editorInfo.imeOptions |= 1073741824;
            }
            editorInfo.hintText = this.E;
            if (this.A instanceof android.text.Editable) {
                gl5.j jVar = new gl5.j(this);
                editorInfo.initialSelStart = m81687x6f2c472c();
                editorInfo.initialSelEnd = m81686xffd93625();
                editorInfo.initialCapsMode = jVar.getCursorCapsMode(m81657x652bd76e());
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        java.lang.Runnable runnable;
        super.onDetachedFromWindow();
        if (this.f293141s) {
            getViewTreeObserver().removeOnPreDrawListener(this);
            this.f293142t = true;
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            gl5.n nVar = e0Var.f354496u;
            if (nVar != null && !nVar.f354578d) {
                nVar.f354579e.U.removeCallbacks(nVar);
                nVar.f354578d = true;
            }
            gl5.w wVar = e0Var.f354475a;
            if (wVar != null) {
                wVar.f354639e.U.getViewTreeObserver().removeOnTouchModeChangeListener(wVar);
                gl5.u uVar = wVar.f354638d;
                if (uVar != null && (runnable = uVar.Q) != null) {
                    uVar.T.U.removeCallbacks(runnable);
                }
            }
            gl5.b0 b0Var = e0Var.f354477b;
            if (b0Var != null) {
                b0Var.f354446q.U.getViewTreeObserver().removeOnTouchModeChangeListener(b0Var);
            }
            java.lang.Runnable runnable2 = e0Var.P;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            if (runnable2 != null) {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(runnable2);
            }
            viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(e0Var.V);
            android.view.ViewTreeObserver viewTreeObserver = viewTreeObserverOnPreDrawListenerC22668xe0605023.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(e0Var.f354483h);
            }
            e0Var.r();
            e0Var.K();
        }
    }

    @Override // android.view.View
    public boolean onDragEvent(android.view.DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 1) {
            gl5.e0 e0Var = this.f293122g2;
            return e0Var != null && e0Var.f354479d;
        }
        if (action == 2) {
            if (this.A instanceof android.text.Spannable) {
                android.text.Selection.setSelection(this.B, K(dragEvent.getX(), dragEvent.getY()));
            }
            return true;
        }
        if (action != 3) {
            if (action != 5) {
                return true;
            }
            requestFocus();
            return true;
        }
        gl5.e0 e0Var2 = this.f293122g2;
        if (e0Var2 != null) {
            e0Var2.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var2.U;
            viewTreeObserverOnPreDrawListenerC22668xe0605023.u();
            try {
                int K = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(dragEvent.getX(), dragEvent.getY());
                dragEvent.getLocalState();
                viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3().length();
                android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), K);
                ((android.text.Editable) viewTreeObserverOnPreDrawListenerC22668xe0605023.A).replace(K, K, spannableStringBuilder);
            } finally {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.G();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z17, int i17, android.graphics.Rect rect) {
        android.text.Spannable spannable;
        int i18;
        if (isTemporarilyDetached()) {
            super.onFocusChanged(z17, i17, rect);
            return;
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.f354494s = android.os.SystemClock.uptimeMillis();
            gl5.s sVar = e0Var.f354486k;
            if (sVar != null && sVar.f354623c != 0) {
                sVar.f354623c = 0;
                e0Var.h(sVar);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            if (z17) {
                int m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c();
                int m81686xffd93625 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625();
                e0Var.M = e0Var.f354487l && viewTreeObserverOnPreDrawListenerC22668xe0605023.M() && !(e0Var.f354498w && m81687x6f2c472c == 0 && m81686xffd93625 == viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3().length());
                if (!e0Var.f354487l || m81687x6f2c472c < 0 || m81686xffd93625 < 0) {
                    gl5.b0 b0Var = e0Var.f354477b;
                    if (b0Var == null || (i18 = b0Var.f354438f) < 0) {
                        i18 = -1;
                    } else if (i18 > viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3().length()) {
                        i18 = viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3().length();
                    }
                    if (i18 >= 0) {
                        android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), i18);
                    }
                    il5.a m81678x75770b66 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81678x75770b66();
                    if (m81678x75770b66 != null) {
                        m81678x75770b66.mo81830x56212972(viewTreeObserverOnPreDrawListenerC22668xe0605023, (android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), i17);
                    }
                    if (e0Var.f354488m && m81687x6f2c472c >= 0 && m81686xffd93625 >= 0) {
                        android.text.Selection.setSelection((android.text.Spannable) viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3(), m81687x6f2c472c, m81686xffd93625);
                    }
                    if (e0Var.f354498w) {
                        viewTreeObserverOnPreDrawListenerC22668xe0605023.h0();
                    }
                    e0Var.f354489n = true;
                }
                e0Var.f354487l = false;
                e0Var.f354488m = false;
                e0Var.x();
            } else {
                viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
                e0Var.r();
                if (viewTreeObserverOnPreDrawListenerC22668xe0605023.isTemporarilyDetached()) {
                    e0Var.K();
                } else {
                    e0Var.J();
                }
                gl5.b0 b0Var2 = e0Var.f354477b;
                if (b0Var2 != null) {
                    b0Var2.g();
                }
                e0Var.e();
            }
        }
        if (z17 && (spannable = this.B) != null) {
            android.text.method.MetaKeyKeyListener.resetMetaState(spannable);
        }
        android.text.method.TransformationMethod transformationMethod = this.H;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(this, this.A, z17, i17, rect);
        }
        super.onFocusChanged(z17, i17, rect);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        il5.a aVar = this.G;
        if (aVar != null && (this.A instanceof android.text.Spannable) && this.M != null) {
            try {
                if (aVar.mo81844x16dab66c(this, this.B, motionEvent)) {
                    return true;
                }
            } catch (java.lang.AbstractMethodError unused) {
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (F(i17, keyEvent, null) == 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        android.view.KeyEvent changeAction = android.view.KeyEvent.changeAction(keyEvent, 0);
        int F = F(i17, changeAction, keyEvent);
        if (F == 0) {
            return super.onKeyMultiple(i17, i18, keyEvent);
        }
        if (F == -1) {
            return true;
        }
        int i19 = i18 - 1;
        android.view.KeyEvent changeAction2 = android.view.KeyEvent.changeAction(keyEvent, 1);
        if (F == 1) {
            this.f293122g2.f354490o.onKeyUp(this, (android.text.Editable) this.A, i17, changeAction2);
            while (true) {
                i19--;
                if (i19 <= 0) {
                    break;
                }
                this.f293122g2.f354490o.onKeyDown(this, (android.text.Editable) this.A, i17, changeAction);
                this.f293122g2.f354490o.onKeyUp(this, (android.text.Editable) this.A, i17, changeAction2);
            }
        } else if (F == 2) {
            this.G.mo81847xafd962bb(this, this.B, i17, changeAction2);
            while (true) {
                i19--;
                if (i19 <= 0) {
                    break;
                }
                this.G.mo81845x1f03f0c2(this, this.B, i17, changeAction);
                this.G.mo81847xafd962bb(this, this.B, i17, changeAction2);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
        /*
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L49
            gl5.e0 r0 = r2.f293122g2
            r1 = 1
            if (r0 == 0) goto L45
            boolean r0 = r0.t()
            if (r0 == 0) goto Lf
            goto L45
        Lf:
            int r0 = r4.getAction()
            if (r0 != 0) goto L26
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L26
            android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
            if (r0 == 0) goto L24
            r0.startTracking(r4, r2)
        L24:
            r0 = r1
            goto L46
        L26:
            int r0 = r4.getAction()
            if (r0 != r1) goto L45
            android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
            if (r0 == 0) goto L35
            r0.handleUpEvent(r4)
        L35:
            boolean r0 = r4.isTracking()
            if (r0 == 0) goto L45
            boolean r0 = r4.isCanceled()
            if (r0 != 0) goto L45
            r2.t0()
            goto L24
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L49
            return r1
        L49:
            boolean r3 = super.onKeyPreIme(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.hasModifiers(4096)) {
            if (i17 != 29) {
                if (i17 != 31) {
                    if (i17 != 50) {
                        if (i17 == 52 && x()) {
                            return c0(android.R.id.cut);
                        }
                    } else if (y()) {
                        return c0(android.R.id.paste);
                    }
                } else if (w()) {
                    return c0(android.R.id.copy);
                }
            } else if (z()) {
                return c0(android.R.id.selectAll);
            }
        } else if (keyEvent.hasModifiers(4097) && i17 == 50 && y()) {
            return c0(android.R.id.pasteAsPlainText);
        }
        return super.onKeyShortcut(i17, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.inputmethod.InputMethodManager m81607x6460f9d8;
        gl5.r rVar;
        gl5.h hVar;
        android.text.method.KeyListener keyListener;
        if (!isEnabled()) {
            return super.onKeyUp(i17, keyEvent);
        }
        if (!android.view.KeyEvent.isModifierKey(i17)) {
            this.f293146x = false;
        }
        if (i17 == 23) {
            if (keyEvent.hasNoModifiers() && !hasOnClickListeners() && this.G != null && (this.A instanceof android.text.Editable) && this.M != null && onCheckIsTextEditor()) {
                android.view.inputmethod.InputMethodManager m81607x6460f9d82 = m81607x6460f9d8();
                if (m81607x6460f9d82 != null) {
                    m81607x6460f9d82.viewClicked(this);
                }
                if (m81607x6460f9d82 != null && m81692x21468dec()) {
                    m81607x6460f9d82.showSoftInput(this, 0);
                }
            }
            return super.onKeyUp(i17, keyEvent);
        }
        if ((i17 != 66 && i17 != 160) || !keyEvent.hasNoModifiers()) {
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null && (keyListener = e0Var.f354490o) != null && keyListener.onKeyUp(this, (android.text.Editable) this.A, i17, keyEvent)) {
                return true;
            }
            il5.a aVar = this.G;
            if (aVar == null || this.M == null || !aVar.mo81847xafd962bb(this, this.B, i17, keyEvent)) {
                return super.onKeyUp(i17, keyEvent);
            }
            return true;
        }
        gl5.e0 e0Var2 = this.f293122g2;
        if (e0Var2 != null && (rVar = e0Var2.f354485j) != null && (hVar = rVar.f354617f) != null && rVar.f354618g) {
            rVar.f354618g = false;
            if (this instanceof fl5.i ? ((fl5.l) hVar).f345488a.a((fl5.i) this, 0, keyEvent) : false) {
                return true;
            }
        }
        if (((keyEvent.getFlags() & 16) != 0 || r0()) && !hasOnClickListeners()) {
            android.view.View focusSearch = focusSearch(130);
            if (focusSearch != null) {
                if (!focusSearch.requestFocus(130)) {
                    throw new java.lang.IllegalStateException("focus search returned a view that wasn't able to take focus!");
                }
                super.onKeyUp(i17, keyEvent);
                return true;
            }
            if ((keyEvent.getFlags() & 16) != 0 && (m81607x6460f9d8 = m81607x6460f9d8()) != null && m81607x6460f9d8.isActive(this)) {
                m81607x6460f9d8.hideSoftInputFromWindow(getWindowToken(), 0);
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.H1;
        if (i28 >= 0) {
            this.H1 = -1;
            v(java.lang.Math.min(i28, this.A.length()));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.text.BoringLayout.Metrics metrics;
        boolean z17;
        int i19;
        int i27;
        android.text.BoringLayout.Metrics metrics2;
        int i28;
        android.text.BoringLayout.Metrics metrics3;
        android.text.BoringLayout.Metrics metrics4;
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        android.text.BoringLayout.Metrics metrics5 = f293110u2;
        if (this.P1 == null) {
            this.P1 = m81700xe50814e();
        }
        if (mode == 1073741824) {
            i28 = size;
            metrics2 = metrics5;
            metrics3 = metrics2;
            z17 = false;
            i27 = -1;
        } else {
            android.text.Layout layout = this.M;
            int E = (layout == null || this.f293149y != null) ? -1 : E(layout);
            if (E < 0) {
                metrics = android.text.BoringLayout.isBoring(this.C, this.K, this.L1);
                if (metrics != null) {
                    this.L1 = metrics;
                }
                z17 = false;
            } else {
                metrics = metrics5;
                z17 = true;
            }
            if (metrics == null || metrics == metrics5) {
                if (E < 0) {
                    java.lang.CharSequence charSequence = this.C;
                    E = (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.K));
                }
                i19 = E;
            } else {
                i19 = metrics.width;
            }
            gl5.g gVar = this.f293152z;
            if (gVar != null) {
                i19 = java.lang.Math.max(java.lang.Math.max(i19, gVar.f354527o), gVar.f354528p);
            }
            if (this.E != null) {
                android.text.Layout layout2 = this.F;
                int E2 = (layout2 == null || this.f293149y != null) ? -1 : E(layout2);
                if (E2 < 0) {
                    metrics4 = android.text.BoringLayout.isBoring(this.E, this.K, this.M1);
                    if (metrics4 != null) {
                        this.M1 = metrics4;
                    }
                } else {
                    metrics4 = metrics5;
                }
                if (metrics4 != null && metrics4 != metrics5) {
                    E2 = metrics4.width;
                }
                metrics5 = metrics4;
                if (E2 > i19) {
                    i19 = E2;
                }
            }
            int m81628xdc9a71d7 = i19 + m81628xdc9a71d7() + m81629xb70a2a4c();
            int min = this.B1 == 1 ? java.lang.Math.min(m81628xdc9a71d7, this.A1 * m81664xcf821e31()) : java.lang.Math.min(m81628xdc9a71d7, this.A1);
            int max = java.lang.Math.max(this.D1 == 1 ? java.lang.Math.max(min, this.C1 * m81664xcf821e31()) : java.lang.Math.max(min, this.C1), getSuggestedMinimumWidth());
            if (mode == Integer.MIN_VALUE) {
                i28 = java.lang.Math.min(size, max);
                i27 = E;
                metrics2 = metrics;
            } else {
                i27 = E;
                metrics2 = metrics;
                i28 = max;
            }
            metrics3 = metrics5;
        }
        int m81628xdc9a71d72 = (i28 - m81628xdc9a71d7()) - m81629xb70a2a4c();
        int i29 = this.U ? 1048576 : m81628xdc9a71d72;
        android.text.Layout layout3 = this.F;
        int width = layout3 == null ? i29 : layout3.getWidth();
        android.text.Layout layout4 = this.M;
        if (layout4 == null) {
            X(i29, i29, metrics2, metrics3, (i28 - m81628xdc9a71d7()) - m81629xb70a2a4c(), false);
        } else {
            boolean z18 = (layout4.getWidth() == i29 && width == i29 && this.M.getEllipsizedWidth() == (i28 - m81628xdc9a71d7()) - m81629xb70a2a4c()) ? false : true;
            boolean z19 = this.E == null && this.f293149y == null && i29 > this.M.getWidth() && ((this.M instanceof android.text.BoringLayout) || (z17 && i27 >= 0 && i27 <= i29));
            boolean z27 = (this.f293129l1 == this.f293153z1 && this.f293150y0 == this.f293151y1) ? false : true;
            if (z18 || z27) {
                if (z27 || !z19) {
                    X(i29, i29, metrics2, metrics3, (i28 - m81628xdc9a71d7()) - m81629xb70a2a4c(), false);
                } else {
                    this.M.increaseWidthTo(i29);
                }
            }
        }
        if (mode2 == 1073741824) {
            this.F1 = -1;
        } else {
            int m81606x335cfcab = m81606x335cfcab();
            this.F1 = m81606x335cfcab;
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(m81606x335cfcab, size2) : m81606x335cfcab;
        }
        int m81631x51707585 = (size2 - m81631x51707585()) - m81626xf4837fb();
        if (this.f293129l1 == 1) {
            int lineCount = this.M.getLineCount();
            int i37 = this.f293150y0;
            if (lineCount > i37) {
                m81631x51707585 = java.lang.Math.min(m81631x51707585, this.M.getLineTop(i37));
            }
        }
        if (this.G != null || this.M.getWidth() > m81628xdc9a71d72 || this.M.getHeight() > m81631x51707585) {
            d0();
        } else {
            scrollTo(0, 0);
        }
        setMeasuredDimension(i28, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        if (r6 < 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.onPreDraw():boolean");
    }

    @Override // android.view.View
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i17) {
        if (this.B != null && this.W) {
            int K = K(motionEvent.getX(i17), motionEvent.getY(i17));
            if (((android.text.style.ClickableSpan[]) this.B.getSpans(K, K, android.text.style.ClickableSpan.class)).length > 0) {
                return android.view.PointerIcon.getSystemIcon(getContext(), 1002);
            }
        }
        return (W() || V()) ? android.view.PointerIcon.getSystemIcon(getContext(), 1008) : super.onResolvePointerIcon(motionEvent, i17);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i17;
        if (!(parcelable instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.SavedState savedState = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        java.lang.CharSequence charSequence = savedState.f293156f;
        if (charSequence != null) {
            m81790x765074af(charSequence);
        }
        if (savedState.f293154d >= 0 && savedState.f293155e >= 0 && this.B != null) {
            int length = this.A.length();
            int i18 = savedState.f293154d;
            if (i18 > length || (i17 = savedState.f293155e) > length) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cmEdit.CMTextView", "Saved cursor position " + savedState.f293154d + "/" + savedState.f293155e + " out of range for " + (savedState.f293156f != null ? "(restored) " : "") + "text " + ((java.lang.Object) this.A));
            } else {
                android.text.Selection.setSelection(this.B, i18, i17);
                if (savedState.f293157g) {
                    D();
                    this.f293122g2.f354487l = true;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002.C22674xc6a422ec c22674xc6a422ec = savedState.f293159i;
        if (c22674xc6a422ec != null) {
            D();
            this.f293122g2.getClass();
            c22674xc6a422ec.f293160d.setDataPosition(0);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
        android.text.TextDirectionHeuristic m81700xe50814e = m81700xe50814e();
        if (this.P1 != m81700xe50814e) {
            this.P1 = m81700xe50814e;
            if (this.M != null) {
                A();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r10 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            boolean r1 = r10.mo81601x590e5ad3()
            java.lang.CharSequence r2 = r10.A
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            int r2 = r10.m81687x6f2c472c()
            int r5 = r10.m81686xffd93625()
            if (r2 >= 0) goto L1a
            if (r5 < 0) goto L1e
        L1a:
            r6 = r3
            goto L1f
        L1c:
            r2 = -1
            r5 = r2
        L1e:
            r6 = r4
        L1f:
            if (r1 != 0) goto L25
            if (r6 == 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState r7 = new com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState
            r7.<init>(r0)
            if (r1 == 0) goto L6b
            java.lang.CharSequence r0 = r10.A
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L65
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r1 = r10.A
            r0.<init>(r1)
            gl5.e0 r1 = r10.f293122g2
            if (r1 == 0) goto L62
            int r1 = r0.length()
            java.lang.Class<android.text.style.SuggestionSpan> r8 = android.text.style.SuggestionSpan.class
            java.lang.Object[] r1 = r0.getSpans(r4, r1, r8)
            android.text.style.SuggestionSpan[] r1 = (android.text.style.SuggestionSpan[]) r1
        L49:
            int r8 = r1.length
            if (r4 >= r8) goto L62
            r8 = r1[r4]
            int r8 = r8.getFlags()
            r9 = r8 & 1
            if (r9 == 0) goto L5f
            r8 = r8 & 2
            if (r8 == 0) goto L5f
            r8 = r1[r4]
            r0.removeSpan(r8)
        L5f:
            int r4 = r4 + 1
            goto L49
        L62:
            r7.f293156f = r0
            goto L6b
        L65:
            java.lang.String r0 = r0.toString()
            r7.f293156f = r0
        L6b:
            if (r6 == 0) goto L71
            r7.f293154d = r2
            r7.f293155e = r5
        L71:
            boolean r0 = r10.isFocused()
            if (r0 == 0) goto L7d
            if (r2 < 0) goto L7d
            if (r5 < 0) goto L7d
            r7.f293157g = r3
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i17) {
        gl5.n nVar;
        super.onScreenStateChanged(i17);
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            if (i17 != 0) {
                if (i17 == 1 && (nVar = e0Var.f354496u) != null) {
                    nVar.f354578d = false;
                    e0Var.x();
                    return;
                }
                return;
            }
            gl5.n nVar2 = e0Var.f354496u;
            if (nVar2 == null || nVar2.f354578d) {
                return;
            }
            nVar2.f354579e.U.removeCallbacks(nVar2);
            nVar2.f354578d = true;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            gl5.z zVar = e0Var.f354474J;
            if (zVar != null) {
                zVar.f354661o = true;
            }
            android.view.ActionMode actionMode = e0Var.f354478c;
            if (actionMode != null) {
                actionMode.invalidateContentRect();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0138, code lost:
    
        if (r2 != 3) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0382  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        android.text.Spannable spannable;
        il5.a aVar = this.G;
        if (aVar == null || (spannable = this.B) == null || this.M == null || !aVar.mo81848x830d5eaf(this, spannable, motionEvent)) {
            return super.onTrackballEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || i17 == 0) {
            return;
        }
        e0Var.r();
        t0();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            if (z17) {
                gl5.n nVar = e0Var.f354496u;
                if (nVar != null) {
                    nVar.f354578d = false;
                    e0Var.x();
                }
                if (!e0Var.U.M() || e0Var.g()) {
                    return;
                }
                e0Var.A();
                return;
            }
            gl5.n nVar2 = e0Var.f354496u;
            if (nVar2 != null && !nVar2.f354578d) {
                nVar2.f354579e.U.removeCallbacks(nVar2);
                nVar2.f354578d = true;
            }
            gl5.r rVar = e0Var.f354485j;
            if (rVar != null) {
                rVar.f354618g = false;
            }
            e0Var.r();
            e0Var.K();
            gl5.s sVar = e0Var.f354486k;
            if (sVar != null && sVar.f354623c != 0) {
                sVar.f354623c = 0;
                e0Var.h(sVar);
            }
            e0Var.e();
        }
    }

    public android.content.Context p() {
        return getContext();
    }

    public void p0(android.graphics.Typeface typeface, int i17) {
        if (i17 <= 0) {
            this.K.setFakeBoldText(false);
            this.K.setTextSkewX(0.0f);
            m81811x4e4ad719(typeface);
        } else {
            android.graphics.Typeface defaultFromStyle = typeface == null ? android.graphics.Typeface.defaultFromStyle(i17) : android.graphics.Typeface.create(typeface, i17);
            m81811x4e4ad719(defaultFromStyle);
            int i18 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i17;
            this.K.setFakeBoldText((i18 & 1) != 0);
            this.K.setTextSkewX((i18 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i17, android.os.Bundle bundle) {
        boolean z17;
        int length;
        if (i17 == 16) {
            if (!isEnabled()) {
                return false;
            }
            if (isClickable() || isLongClickable()) {
                if (isFocusable() && !isFocused()) {
                    requestFocus();
                }
                performClick();
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.G != null || onCheckIsTextEditor()) {
                java.lang.CharSequence charSequence = this.A;
                if ((charSequence != null && (charSequence instanceof android.text.Spannable)) && this.M != null && ((V() || W()) && isFocused())) {
                    android.view.inputmethod.InputMethodManager m81607x6460f9d8 = m81607x6460f9d8();
                    if (m81607x6460f9d8 != null) {
                        m81607x6460f9d8.viewClicked(this);
                    }
                    if (!W() && this.f293122g2.f354501z && m81607x6460f9d8 != null) {
                        z17 |= m81607x6460f9d8.showSoftInput(this, 0);
                    }
                }
            }
            return z17;
        }
        if (i17 != 32) {
            if (i17 == 256 || i17 == 512) {
                java.lang.CharSequence charSequence2 = this.A;
                if (!(charSequence2 instanceof android.text.Spannable)) {
                    n0(charSequence2, android.widget.TextView.BufferType.SPANNABLE);
                }
                return super.performAccessibilityAction(i17, bundle);
            }
            if (i17 != 16384) {
                if (i17 != 32768) {
                    if (i17 == 65536) {
                        return isFocused() && x() && c0(android.R.id.cut);
                    }
                    if (i17 == 131072) {
                        java.lang.CharSequence charSequence3 = this.A;
                        if (!(charSequence3 instanceof android.text.Spannable)) {
                            n0(charSequence3, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        java.lang.CharSequence m81658x714bf45a = m81658x714bf45a();
                        if (m81658x714bf45a == null) {
                            return false;
                        }
                        int i18 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1;
                        int i19 = bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1;
                        if (m81687x6f2c472c() != i18 || m81686xffd93625() != i19) {
                            if (i18 == i19 && i19 == -1) {
                                android.text.Selection.removeSelection((android.text.Spannable) m81658x714bf45a);
                                return true;
                            }
                            if (i18 >= 0 && i18 <= i19 && i19 <= m81658x714bf45a.length()) {
                                android.text.Selection.setSelection((android.text.Spannable) m81658x714bf45a, i18, i19);
                                gl5.e0 e0Var = this.f293122g2;
                                if (e0Var != null) {
                                    e0Var.I(false);
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                    if (i17 == 2097152) {
                        if (!isEnabled() || this.D != android.widget.TextView.BufferType.EDITABLE) {
                            return false;
                        }
                        m81790x765074af(bundle != null ? bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null);
                        java.lang.CharSequence charSequence4 = this.A;
                        if (charSequence4 != null && (length = charSequence4.length()) > 0) {
                            android.text.Selection.setSelection(this.B, length);
                        }
                        return true;
                    }
                }
            } else if (isFocused() && w() && c0(android.R.id.copy)) {
                return true;
            }
            return isFocused() && y() && c0(android.R.id.paste);
        }
        if (isLongClickable()) {
            if (!isEnabled() || this.D != android.widget.TextView.BufferType.EDITABLE) {
                return performLongClick();
            }
            this.f293122g2.E = true;
            try {
                return performLongClick();
            } finally {
                this.f293122g2.E = false;
            }
        }
        return super.performAccessibilityAction(i17, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performLongClick() {
        /*
            r9 = this;
            boolean r0 = super.performLongClick()
            gl5.e0 r1 = r9.f293122g2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Laf
            boolean r4 = r1.E
            if (r4 == 0) goto L20
            if (r0 != 0) goto L1d
            boolean r4 = r1.t()
            if (r4 != 0) goto L1a
            r1.J()
            goto L1d
        L1a:
            r1.H()
        L1d:
            r5 = r2
            goto L94
        L20:
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView r4 = r1.U
            if (r0 != 0) goto L50
            gl5.f0 r5 = r1.O
            float r6 = r5.f354506a
            float r7 = r5.f354507b
            boolean r6 = r1.v(r6, r7)
            if (r6 != 0) goto L50
            boolean r6 = r1.f354479d
            if (r6 == 0) goto L50
            float r6 = r5.f354506a
            float r5 = r5.f354507b
            int r5 = r4.K(r6, r5)
            java.lang.CharSequence r6 = r4.mo81602xfb85ada3()
            android.text.Spannable r6 = (android.text.Spannable) r6
            android.text.Selection.setSelection(r6, r5)
            gl5.w r5 = r1.k()
            r5.mo131740x35dafd()
            r1.W = r2
            r5 = r2
            goto L51
        L50:
            r5 = r0
        L51:
            if (r5 != 0) goto L8e
            boolean r6 = r1.t()
            if (r6 != 0) goto L8e
            int r5 = r4.m81687x6f2c472c()
            int r6 = r4.m81686xffd93625()
            if (r5 != r6) goto L64
            goto L80
        L64:
            if (r5 <= r6) goto L72
            java.lang.CharSequence r4 = r4.mo81602xfb85ada3()
            android.text.Spannable r4 = (android.text.Spannable) r4
            android.text.Selection.setSelection(r4, r6, r5)
            r8 = r6
            r6 = r5
            r5 = r8
        L72:
            gl5.b0 r4 = r1.p()
            int r7 = r4.f354438f
            int r4 = r4.f354439g
            if (r7 < r5) goto L80
            if (r4 >= r6) goto L80
            r4 = r2
            goto L81
        L80:
            r4 = r3
        L81:
            if (r4 == 0) goto L87
            r1.G()
            goto L8d
        L87:
            r1.J()
            r1.D()
        L8d:
            r5 = r2
        L8e:
            if (r5 != 0) goto L94
            boolean r5 = r1.D()
        L94:
            r1 = r0 | r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "editor performLongClick handled ="
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "cmEdit.CMTextView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            gl5.e0 r4 = r9.f293122g2
            r4.getClass()
            goto Lb0
        Laf:
            r1 = r0
        Lb0:
            if (r1 == 0) goto Lbd
            if (r0 != 0) goto Lb7
            r9.performHapticFeedback(r3)
        Lb7:
            gl5.e0 r0 = r9.f293122g2
            if (r0 == 0) goto Lbd
            r0.f354492q = r2
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.performLongClick():boolean");
    }

    public final void q0(android.graphics.Typeface typeface, java.lang.String str, int i17, int i18, int i19) {
        if (typeface == null && str != null) {
            g0(android.graphics.Typeface.create(str, 0), i18, i19);
            return;
        }
        if (typeface != null) {
            g0(typeface, i18, i19);
            return;
        }
        if (i17 == 1) {
            g0(android.graphics.Typeface.SANS_SERIF, i18, i19);
            return;
        }
        if (i17 == 2) {
            g0(android.graphics.Typeface.SERIF, i18, i19);
        } else if (i17 != 3) {
            g0(null, i18, i19);
        } else {
            g0(android.graphics.Typeface.MONOSPACE, i18, i19);
        }
    }

    public final void r() {
        gl5.g gVar = this.f293152z;
        if (gVar == null) {
            return;
        }
        boolean z17 = gVar.f354517e;
        if (z17 || gVar.f354518f) {
            android.content.res.ColorStateList colorStateList = gVar.f354515c;
            android.graphics.BlendMode blendMode = gVar.f354516d;
            boolean z18 = gVar.f354518f;
            int[] drawableState = getDrawableState();
            for (android.graphics.drawable.Drawable drawable : this.f293152z.f354514b) {
                if (drawable != null) {
                    this.f293152z.getClass();
                    drawable.mutate();
                    if (z17) {
                        drawable.setTintList(colorStateList);
                    }
                    if (drawable.isStateful()) {
                        drawable.setState(drawableState);
                    }
                }
            }
        }
    }

    public final boolean r0() {
        int i17;
        if (m81659xded63efd() == null) {
            return false;
        }
        if (this.E1) {
            return true;
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            int i18 = e0Var.f354491p;
            if ((i18 & 15) == 1 && ((i17 = i18 & 4080) == 32 || i17 == 48)) {
                return true;
            }
        }
        return false;
    }

    public final void s(boolean z17, boolean z18, boolean z19) {
        this.E1 = z17;
        if (z17) {
            m81764x534f0fbd(1);
            m81754x48dfdd02(true);
            if (z18) {
                m81810xa06c90cc(android.text.method.SingleLineTransformationMethod.getInstance());
                return;
            }
            return;
        }
        if (z19) {
            m81770x8dd5167d(Integer.MAX_VALUE);
        }
        m81754x48dfdd02(false);
        if (z18) {
            m81810xa06c90cc(null);
        }
    }

    public void s0(android.text.Spanned spanned, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        boolean z17;
        int i28;
        gl5.e0 e0Var = this.f293122g2;
        gl5.s sVar = e0Var == null ? null : e0Var.f354486k;
        int i29 = -1;
        if (obj == android.text.Selection.SELECTION_END) {
            if (i17 >= 0 || i18 >= 0) {
                O(android.text.Selection.getSelectionStart(spanned), i17, i18);
                B();
                d0();
                gl5.e0 e0Var2 = this.f293122g2;
                if (e0Var2 != null) {
                    e0Var2.x();
                }
            }
            i28 = i18;
            z17 = true;
        } else {
            z17 = false;
            i28 = -1;
        }
        if (obj == android.text.Selection.SELECTION_START) {
            if (i17 >= 0 || i18 >= 0) {
                O(android.text.Selection.getSelectionEnd(spanned), i17, i18);
            }
            i29 = i18;
            z17 = true;
        }
        if (z17) {
            this.V1 = true;
            if (this.f293122g2 != null && !isFocused()) {
                this.f293122g2.f354488m = true;
            }
            if ((spanned.getSpanFlags(obj) & 512) == 0) {
                if (i29 < 0) {
                    i29 = android.text.Selection.getSelectionStart(spanned);
                }
                if (i28 < 0) {
                    i28 = android.text.Selection.getSelectionEnd(spanned);
                }
                gl5.e0 e0Var3 = this.f293122g2;
                if (e0Var3 != null) {
                    e0Var3.A();
                    if (!M() && this.f293122g2.t() && hasTransientState()) {
                        setHasTransientState(false);
                    }
                }
                b0(i29, i28);
            }
        }
        if ((obj instanceof android.text.style.UpdateAppearance) || (obj instanceof android.text.style.ParagraphStyle) || (obj instanceof android.text.style.CharacterStyle)) {
            if (sVar == null || sVar.f354623c == 0) {
                invalidate();
                this.V1 = true;
                B();
            } else {
                sVar.f354626f = true;
            }
            gl5.e0 e0Var4 = this.f293122g2;
            if (e0Var4 != null) {
                e0Var4.s();
            }
        }
        if (android.text.method.MetaKeyKeyListener.isMetaTracker(spanned, obj)) {
            this.V1 = true;
            if (sVar != null && android.text.method.MetaKeyKeyListener.isSelectingMetaTracker(spanned, obj)) {
                sVar.f354625e = true;
            }
            if (android.text.Selection.getSelectionStart(spanned) >= 0) {
                if (sVar == null || sVar.f354623c == 0) {
                    int m81686xffd93625 = m81686xffd93625();
                    O(m81686xffd93625, m81686xffd93625, m81686xffd93625);
                } else {
                    sVar.f354624d = true;
                }
            }
        }
        if (!(obj instanceof android.text.ParcelableSpan) || sVar == null || sVar.f354621a == null) {
            return;
        }
        if (sVar.f354623c == 0) {
            sVar.f354626f = true;
            return;
        }
        if (i17 >= 0) {
            if (sVar.f354627g > i17) {
                sVar.f354627g = i17;
            }
            if (sVar.f354627g > i19) {
                sVar.f354627g = i19;
            }
        }
        if (i18 >= 0) {
            if (sVar.f354627g > i18) {
                sVar.f354627g = i18;
            }
            if (sVar.f354627g > i27) {
                sVar.f354627g = i27;
            }
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    /* renamed from: setAdaptText */
    public void m81724xee8a612d(android.widget.TextView textView) {
        this.f293124h2 = textView;
        textView.addTextChangedListener(this.f293126i2);
    }

    /* renamed from: setAllCaps */
    public void m81725x7ad83960(boolean z17) {
        if (z17) {
            return;
        }
        m81810xa06c90cc(null);
    }

    /* renamed from: setAutoLinkMask */
    public final void m81726xd4094e57(int i17) {
        this.V = i17;
    }

    /* renamed from: setBreakStrategy */
    public void m81727xc08d1450(int i17) {
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: setCompoundDrawablePadding */
    public void m81728x79b655a6(int i17) {
        gl5.g gVar = this.f293152z;
        if (i17 != 0) {
            if (gVar == null) {
                gVar = new gl5.g(getContext());
                this.f293152z = gVar;
            }
            gVar.f354531s = i17;
        } else if (gVar != null) {
            gVar.f354531s = i17;
        }
        invalidate();
        requestLayout();
    }

    /* renamed from: setCompoundDrawableTintBlendMode */
    public void m81729x96ab8aae(android.graphics.BlendMode blendMode) {
        if (this.f293152z == null) {
            this.f293152z = new gl5.g(getContext());
        }
        gl5.g gVar = this.f293152z;
        gVar.f354516d = blendMode;
        gVar.f354518f = true;
        r();
    }

    /* renamed from: setCompoundDrawableTintList */
    public void m81730x15af9b44(android.content.res.ColorStateList colorStateList) {
        if (this.f293152z == null) {
            this.f293152z = new gl5.g(getContext());
        }
        gl5.g gVar = this.f293152z;
        gVar.f354515c = colorStateList;
        gVar.f354517e = true;
        r();
    }

    /* renamed from: setCompoundDrawableTintMode */
    public void m81731x15b02449(android.graphics.PorterDuff.Mode mode) {
    }

    /* renamed from: setCursorVisible */
    public void m81732x26e44afa(boolean z17) {
        if (z17 && this.f293122g2 == null) {
            return;
        }
        D();
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var.f354497v != z17) {
            e0Var.f354497v = z17;
            invalidate();
            this.f293122g2.x();
            this.f293122g2.z();
        }
    }

    /* renamed from: setCustomInsertionActionModeCallback */
    public void m81733x170b6efa(android.view.ActionMode.Callback callback) {
        D();
        this.f293122g2.L = callback;
    }

    /* renamed from: setCustomSelectionActionModeCallback */
    public void m81734x4d581497(android.view.ActionMode.Callback callback) {
        D();
        this.f293122g2.K = callback;
    }

    /* renamed from: setEditableFactory */
    public final void m81735xb3470d44(android.text.Editable.Factory factory) {
        this.f293131m = factory;
        m81790x765074af(this.A);
    }

    /* renamed from: setElegantTextHeight */
    public void m81736x76579cd0(boolean z17) {
        if (z17 != this.K.isElegantTextHeight()) {
            this.K.setElegantTextHeight(z17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setEllipsize */
    public void mo81603xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.f293149y != truncateAt) {
            this.f293149y = truncateAt;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setEms */
    public void m81737xca026109(int i17) {
        this.C1 = i17;
        this.A1 = i17;
        this.D1 = 1;
        this.B1 = 1;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        android.view.inputmethod.InputMethodManager m81607x6460f9d8;
        android.view.inputmethod.InputMethodManager m81607x6460f9d82;
        if (z17 == isEnabled()) {
            return;
        }
        if (!z17 && (m81607x6460f9d82 = m81607x6460f9d8()) != null && m81607x6460f9d82.isActive(this)) {
            m81607x6460f9d82.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        super.setEnabled(z17);
        if (z17 && (m81607x6460f9d8 = m81607x6460f9d8()) != null) {
            m81607x6460f9d8.restartInput(this);
        }
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.z();
            this.f293122g2.x();
        }
    }

    /* renamed from: setError */
    public void m81738x52f092c6(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            D();
        } else {
            D();
        }
    }

    /* renamed from: setExtractedText */
    public void m81739x49da38eb(android.view.inputmethod.ExtractedText extractedText) {
        java.lang.Class<?> cls;
        int i17;
        android.text.Editable m81636x4ef76827 = m81636x4ef76827();
        java.lang.CharSequence charSequence = extractedText.text;
        if (charSequence != null) {
            if (m81636x4ef76827 == null) {
                n0(charSequence, android.widget.TextView.BufferType.EDITABLE);
            } else {
                int length = m81636x4ef76827.length();
                if (extractedText.partialStartOffset >= 0) {
                    length = m81636x4ef76827.length();
                    int i18 = extractedText.partialStartOffset;
                    if (i18 > length) {
                        i18 = length;
                    }
                    int i19 = extractedText.partialEndOffset;
                    i17 = i18;
                    if (i19 <= length) {
                        length = i19;
                    }
                } else {
                    i17 = 0;
                }
                java.lang.Object[] spans = m81636x4ef76827.getSpans(i17, length, android.text.ParcelableSpan.class);
                int length2 = spans.length;
                while (length2 > 0) {
                    length2--;
                    m81636x4ef76827.removeSpan(spans[length2]);
                }
                if (android.text.TextUtils.equals(m81636x4ef76827.subSequence(i17, length), extractedText.text)) {
                    java.lang.CharSequence charSequence2 = extractedText.text;
                    if (charSequence2 instanceof android.text.Spanned) {
                        android.text.TextUtils.copySpansFrom((android.text.Spanned) charSequence2, 0, length - i17, java.lang.Object.class, m81636x4ef76827, i17);
                    }
                } else {
                    m81636x4ef76827.replace(i17, length, extractedText.text);
                }
            }
        }
        android.text.Spannable spannable = (android.text.Spannable) mo81602xfb85ada3();
        int length3 = spannable.length();
        int i27 = extractedText.selectionStart;
        if (i27 < 0) {
            i27 = 0;
        } else if (i27 > length3) {
            i27 = length3;
        }
        int i28 = extractedText.selectionEnd;
        if (i28 < 0) {
            length3 = 0;
        } else if (i28 <= length3) {
            length3 = i28;
        }
        android.text.Selection.setSelection(spannable, i27, length3);
        if ((extractedText.flags & 2) != 0) {
            java.lang.Class<?>[] clsArr = {android.text.Spannable.class};
            try {
                cls = java.lang.Class.forName(android.text.method.MetaKeyKeyListener.class.getName());
            } catch (java.lang.Throwable unused) {
                cls = null;
            }
            java.lang.reflect.Method method = null;
            while (cls != java.lang.Object.class) {
                try {
                    method = cls.getDeclaredMethod("startSelecting", clsArr);
                } catch (java.lang.Throwable unused2) {
                }
                cls = cls.getSuperclass();
            }
            java.lang.Object[] objArr = {this, spannable};
            try {
                method.setAccessible(true);
                method.invoke(null, objArr);
            } catch (java.lang.Throwable unused3) {
            }
        } else {
            jl5.c.b(this, spannable);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            m81610x159f1fe6(extractedText.hint);
        }
    }

    /* renamed from: setExtracting */
    public void m81740x4930e5c3(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        gl5.e0 e0Var = this.f293122g2;
        gl5.s sVar = e0Var.f354486k;
        if (sVar != null) {
            sVar.f354621a = extractedTextRequest;
        }
        e0Var.r();
        t0();
        gl5.b0 b0Var = this.f293122g2.f354477b;
        if (b0Var != null) {
            b0Var.g();
        }
    }

    /* renamed from: setFallbackLineSpacing */
    public void m81741xb6518dab(boolean z17) {
        if (this.S != z17) {
            this.S = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setFilters */
    public void m81742x7e4f2d39(android.text.InputFilter[] inputFilterArr) {
        if (inputFilterArr == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.Q1 = inputFilterArr;
        java.lang.CharSequence charSequence = this.A;
        if (charSequence instanceof android.text.Editable) {
            k0((android.text.Editable) charSequence, inputFilterArr);
        }
    }

    /* renamed from: setFirstBaselineToTopHeight */
    public void m81743x27b45cce(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = m81679x74f59ea8().getFontMetricsInt();
        int i18 = m81655x8bc4dcf0() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i17 > java.lang.Math.abs(i18)) {
            setPadding(getPaddingLeft(), i17 - (-i18), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: setFontFeatureSettings */
    public void m81744xeae98528(java.lang.String str) {
        if (str != this.K.getFontFeatureSettings()) {
            this.K.setFontFeatureSettings(str);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setFreezesText */
    public void m81745xef73ce47(boolean z17) {
        this.f293125i = z17;
    }

    /* renamed from: setGravity */
    public void m81746xc1f6fb8c(int i17) {
        if ((i17 & 8388615) == 0) {
            i17 |= 8388611;
        }
        if ((i17 & 112) == 0) {
            i17 |= 48;
        }
        int i18 = i17 & 8388615;
        int i19 = this.T;
        boolean z17 = i18 != (8388615 & i19);
        if (i17 != i19) {
            invalidate();
        }
        this.T = i17;
        android.text.Layout layout = this.M;
        if (layout == null || !z17) {
            return;
        }
        int width = layout.getWidth();
        android.text.Layout layout2 = this.F;
        int width2 = layout2 != null ? layout2.getWidth() : 0;
        android.text.BoringLayout.Metrics metrics = f293110u2;
        X(width, width2, metrics, metrics, ((getRight() - getLeft()) - m81628xdc9a71d7()) - m81629xb70a2a4c(), true);
    }

    /* renamed from: setHandleColorRes */
    public void m81747xbc531187(int i17) {
        this.f293127j2 = i17;
    }

    /* renamed from: setHeight */
    public void m81748xf84e829(int i17) {
        this.f293138p1 = i17;
        this.f293150y0 = i17;
        this.f293148x1 = 2;
        this.f293129l1 = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setHighlightColor */
    public void m81749xd3ccb811(int i17) {
        if (this.S1 != i17) {
            this.S1 = i17;
            invalidate();
        }
    }

    /* renamed from: setHint */
    public final void m81751x764b0e09(java.lang.CharSequence charSequence) {
        m81610x159f1fe6(charSequence);
        if (this.f293122g2 != null) {
            android.view.inputmethod.InputMethodManager m81607x6460f9d8 = m81607x6460f9d8();
            if (m81607x6460f9d8 != null && m81607x6460f9d8.isActive(this)) {
                this.f293122g2.B();
            }
        }
    }

    /* renamed from: setHintTextColor */
    public final void m81752x40e6fa2d(int i17) {
        this.f293117e = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    /* renamed from: setHorizontallyScrolling */
    public void m81754x48dfdd02(boolean z17) {
        if (this.U != z17) {
            this.U = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setImeHintLocales */
    public void m81755x42abf353(android.os.LocaleList localeList) {
        gl5.e0 e0Var;
        D();
        this.f293122g2.d();
        this.f293122g2.f354485j.f354619h = localeList;
        if (this.R) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            java.util.Locale locale = localeList == null ? null : localeList.get(0);
            if (this.Q || (e0Var = this.f293122g2) == null) {
                return;
            }
            android.text.method.KeyListener keyListener = e0Var.f354490o;
            if (!(keyListener instanceof android.text.method.DigitsKeyListener)) {
                if (keyListener instanceof android.text.method.DateKeyListener) {
                    if (i17 >= 26) {
                        keyListener = android.text.method.DateKeyListener.getInstance(locale);
                    }
                } else if (keyListener instanceof android.text.method.TimeKeyListener) {
                    if (i17 >= 26) {
                        keyListener = android.text.method.TimeKeyListener.getInstance(locale);
                    }
                } else {
                    if (!(keyListener instanceof android.text.method.DateTimeKeyListener)) {
                        return;
                    }
                    if (i17 >= 26) {
                        keyListener = android.text.method.DateTimeKeyListener.getInstance(locale);
                    }
                }
            }
            boolean S = S(this.f293122g2.f354491p);
            m81612x3270a5bd(keyListener);
            try {
                gl5.e0 e0Var2 = this.f293122g2;
                e0Var2.f354491p = e0Var2.f354490o.getInputType();
            } catch (java.lang.IncompatibleClassChangeError unused) {
                this.f293122g2.f354491p = 1;
            }
            m81611x3357c5de(this.E1);
            if (S) {
                gl5.e0 e0Var3 = this.f293122g2;
                int i18 = e0Var3.f354491p;
                int i19 = i18 & 15;
                if (i19 == 1) {
                    e0Var3.f354491p = i18 | 128;
                } else if (i19 == 2) {
                    e0Var3.f354491p = i18 | 16;
                }
            }
        }
    }

    /* renamed from: setImeOptions */
    public void m81756x843d819f(int i17) {
        D();
        this.f293122g2.d();
        this.f293122g2.f354485j.f354612a = i17;
    }

    /* renamed from: setIncludeFontPadding */
    public void m81757x22f05efc(boolean z17) {
        if (this.G1 != z17) {
            this.G1 = z17;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setInputExtras */
    public void m81758x46546d0b(int i17) {
        D();
        android.content.res.XmlResourceParser xml = getResources().getXml(i17);
        this.f293122g2.d();
        this.f293122g2.f354485j.f354616e = new android.os.Bundle();
        getResources().parseBundleExtras(xml, this.f293122g2.f354485j.f354616e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: setInputType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m81759xc17f97e2(int r11) {
        /*
            r10 = this;
            int r0 = r10.m81657x652bd76e()
            boolean r0 = S(r0)
            int r1 = r10.m81657x652bd76e()
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            r2 = 145(0x91, float:2.03E-43)
            r6 = 0
            r7 = 1
            if (r1 != r2) goto L16
            r1 = r7
            goto L17
        L16:
            r1 = r6
        L17:
            r10.l0(r11, r6)
            boolean r8 = S(r11)
            r3 = r11 & 4095(0xfff, float:5.738E-42)
            if (r3 != r2) goto L24
            r2 = r7
            goto L25
        L24:
            r2 = r6
        L25:
            if (r8 == 0) goto L38
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r10.m81810xa06c90cc(r0)
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            goto L66
        L38:
            if (r2 == 0) goto L4f
            android.text.method.TransformationMethod r0 = r10.H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L44
            r9 = r7
            goto L45
        L44:
            r9 = r6
        L45:
            r1 = 0
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            goto L67
        L4f:
            if (r0 != 0) goto L53
            if (r1 == 0) goto L66
        L53:
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r0 = r10
            r0.q0(r1, r2, r3, r4, r5)
            android.text.method.TransformationMethod r0 = r10.H
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            if (r0 != r1) goto L66
            r9 = r7
            goto L67
        L66:
            r9 = r6
        L67:
            r0 = 131087(0x2000f, float:1.83692E-40)
            r0 = r0 & r11
            r1 = 131073(0x20001, float:1.83672E-40)
            if (r0 != r1) goto L71
            r6 = r7
        L71:
            r0 = r6 ^ 1
            boolean r1 = r10.E1
            if (r1 != r0) goto L79
            if (r9 == 0) goto L7e
        L79:
            r1 = r8 ^ 1
            r10.s(r0, r1, r7)
        L7e:
            boolean r0 = r10.U()
            if (r0 != 0) goto L8d
            java.lang.CharSequence r0 = r10.A
            java.lang.CharSequence r0 = r10.f0(r0)
            r10.m81613xa93e808c(r0)
        L8d:
            android.view.inputmethod.InputMethodManager r0 = r10.m81607x6460f9d8()
            if (r0 == 0) goto L96
            r0.restartInput(r10)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.m81759xc17f97e2(int):void");
    }

    /* renamed from: setKeyListener */
    public void m81760x753bb271(android.text.method.KeyListener keyListener) {
        this.Q = true;
        m81612x3270a5bd(keyListener);
        H();
        if (keyListener != null) {
            D();
            try {
                gl5.e0 e0Var = this.f293122g2;
                e0Var.f354491p = e0Var.f354490o.getInputType();
            } catch (java.lang.IncompatibleClassChangeError unused) {
                this.f293122g2.f354491p = 1;
            }
            m81611x3357c5de(this.E1);
        } else {
            gl5.e0 e0Var2 = this.f293122g2;
            if (e0Var2 != null) {
                e0Var2.f354491p = 0;
            }
        }
        android.view.inputmethod.InputMethodManager m81607x6460f9d8 = m81607x6460f9d8();
        if (m81607x6460f9d8 != null) {
            m81607x6460f9d8.restartInput(this);
        }
    }

    /* renamed from: setLastBaselineToBottomHeight */
    public void m81761xe032f2a(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = m81679x74f59ea8().getFontMetricsInt();
        int i18 = m81655x8bc4dcf0() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i17 > java.lang.Math.abs(i18)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i17 - i18);
        }
    }

    /* renamed from: setLetterSpacing */
    public void m81762xce0aa3fb(float f17) {
        if (f17 != this.K.getLetterSpacing()) {
            this.K.setLetterSpacing(f17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setLineHeight */
    public void m81763xfda66c3d(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int fontMetricsInt = m81679x74f59ea8().getFontMetricsInt(null);
        if (i17 != fontMetricsInt) {
            float f17 = i17 - fontMetricsInt;
            if (this.f293147x0 == f17 && this.f293137p0 == 1.0f) {
                return;
            }
            this.f293147x0 = f17;
            this.f293137p0 = 1.0f;
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setLines */
    public void m81764x534f0fbd(int i17) {
        this.f293138p1 = i17;
        this.f293150y0 = i17;
        this.f293148x1 = 1;
        this.f293129l1 = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setLinkTextColor */
    public final void m81765x645e1a1a(int i17) {
        this.f293119f = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    /* renamed from: setLinksClickable */
    public final void m81767x1d1dfc2b(boolean z17) {
        this.W = z17;
    }

    /* renamed from: setMaxEms */
    public void m81768x17db17c9(int i17) {
        this.A1 = i17;
        this.B1 = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxHeight */
    public void m81769x25bfb969(int i17) {
        this.f293150y0 = i17;
        this.f293129l1 = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxLines */
    public void m81770x8dd5167d(int i17) {
        this.f293150y0 = i17;
        this.f293129l1 = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMaxWidth */
    public void m81771x8e6ff544(int i17) {
        this.A1 = i17;
        this.B1 = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMenuCallback */
    public void m81772x50855846(nl5.a0 a0Var) {
        this.f293130l2 = a0Var;
    }

    /* renamed from: setMinEms */
    public void m81773x1847481b(int i17) {
        this.C1 = i17;
        this.D1 = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinHeight */
    public void m81774x53cacfd7(int i17) {
        this.f293138p1 = i17;
        this.f293148x1 = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinLines */
    public void m81775x23f67a4f(int i17) {
        this.f293138p1 = i17;
        this.f293148x1 = 1;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMinWidth */
    public void m81776x24915916(int i17) {
        this.C1 = i17;
        this.D1 = 2;
        requestLayout();
        invalidate();
    }

    /* renamed from: setMovementMethod */
    public final void m81777x3d6d7372(il5.a aVar) {
        if (this.G != aVar) {
            this.G = aVar;
            if (aVar != null && this.B == null) {
                m81790x765074af(this.A);
            }
            H();
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                e0Var.z();
            }
        }
    }

    /* renamed from: setOnEditorActionListener */
    public void m81778x37562b58(gl5.h hVar) {
        D();
        this.f293122g2.d();
        this.f293122g2.f354485j.f354617f = hVar;
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingLeft() || i19 != getPaddingRight() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            Y();
        }
        super.setPadding(i17, i18, i19, i27);
        invalidate();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i17, int i18, int i19, int i27) {
        if (i17 != getPaddingStart() || i19 != getPaddingEnd() || i18 != getPaddingTop() || i27 != getPaddingBottom()) {
            Y();
        }
        super.setPaddingRelative(i17, i18, i19, i27);
        invalidate();
    }

    /* renamed from: setPaintFlags */
    public void m81779x4abc96cb(int i17) {
        if (this.K.getFlags() != i17) {
            this.K.setFlags(i17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setPrivateImeOptions */
    public void m81780x5c53493e(java.lang.String str) {
        D();
        this.f293122g2.d();
        this.f293122g2.f354485j.f354613b = str;
    }

    /* renamed from: setRawInputType */
    public void m81781xda53085e(int i17) {
        if (i17 == 0 && this.f293122g2 == null) {
            return;
        }
        D();
        this.f293122g2.f354491p = i17;
    }

    /* renamed from: setReuseBrands */
    public void m81782xe2644b9e(java.util.List<java.lang.String> list) {
        if (list != null) {
            java.util.Set set = this.f293134n2;
            ((java.util.HashSet) set).clear();
            set.addAll(list);
        }
    }

    /* renamed from: setReuseItems */
    public void m81783x5203bfae(java.util.List<java.lang.String> list) {
        if (list != null) {
            java.util.Set set = this.f293132m2;
            ((java.util.HashSet) set).clear();
            set.addAll(list);
        }
    }

    /* renamed from: setScroller */
    public void m81784x5e9a12bc(android.widget.Scroller scroller) {
        this.K1 = scroller;
    }

    /* renamed from: setSelectAllOnFocus */
    public void m81785x61d663f6(boolean z17) {
        D();
        this.f293122g2.f354498w = z17;
        if (z17) {
            java.lang.CharSequence charSequence = this.A;
            if (charSequence instanceof android.text.Spannable) {
                return;
            }
            n0(charSequence, android.widget.TextView.BufferType.SPANNABLE);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        isSelected();
        super.setSelected(z17);
    }

    /* renamed from: setShowSoftInputOnFocus */
    public final void m81786x9b99bcf8(boolean z17) {
        D();
        this.f293122g2.f354501z = z17;
    }

    /* renamed from: setSingleLine */
    public void m81787x52d64a5e(boolean z17) {
        m81611x3357c5de(z17);
        s(z17, true, true);
    }

    /* renamed from: setSpannableFactory */
    public final void m81788xe9a3bdee(android.text.Spannable.Factory factory) {
        this.f293133n = factory;
        m81790x765074af(this.A);
    }

    /* renamed from: setText */
    public final void m81790x765074af(java.lang.CharSequence charSequence) {
        n0(charSequence, this.D);
    }

    /* renamed from: setTextClassifier */
    public void m81791xa1b09c30(android.view.textclassifier.TextClassifier textClassifier) {
        this.f293143u = textClassifier;
    }

    /* renamed from: setTextColor */
    public void m81792x1c5c5ff4(int i17) {
        this.f293115d = android.content.res.ColorStateList.valueOf(i17);
        x0();
    }

    /* renamed from: setTextCursorDrawable */
    public void m81795x372124a3(android.graphics.drawable.Drawable drawable) {
        this.X1 = drawable;
        this.W1 = 0;
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var == null || e0Var.F != null) {
            return;
        }
        e0Var.F = e0Var.U.m81699x9ff5a297();
    }

    /* renamed from: setTextIsSelectable */
    public void m81796x115c236f(boolean z17) {
        if (z17 || this.f293122g2 != null) {
            D();
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var.f354499x == z17) {
                return;
            }
            e0Var.f354499x = z17;
            setFocusableInTouchMode(z17);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                setFocusable(16);
            } else {
                setFocusable(z17);
            }
            setClickable(z17);
            setLongClickable(z17);
            m81777x3d6d7372(z17 ? com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22670xdaff81c6.m81817x9cf0d20b() : null);
            n0(this.A, z17 ? android.widget.TextView.BufferType.SPANNABLE : android.widget.TextView.BufferType.NORMAL);
            this.f293122g2.z();
        }
    }

    /* renamed from: setTextKeepState */
    public final void m81797xf7c5941d(java.lang.CharSequence charSequence) {
        android.text.Spannable spannable;
        android.widget.TextView.BufferType bufferType = this.D;
        int m81687x6f2c472c = m81687x6f2c472c();
        int m81686xffd93625 = m81686xffd93625();
        int length = charSequence.length();
        n0(charSequence, bufferType);
        if ((m81687x6f2c472c >= 0 || m81686xffd93625 >= 0) && (spannable = this.B) != null) {
            android.text.Selection.setSelection(spannable, java.lang.Math.max(0, java.lang.Math.min(m81687x6f2c472c, length)), java.lang.Math.max(0, java.lang.Math.min(m81686xffd93625, length)));
        }
    }

    /* renamed from: setTextLocale */
    public void m81798x7e86efe9(java.util.Locale locale) {
        this.N = true;
        this.K.setTextLocale(locale);
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: setTextLocales */
    public void m81799x52570daa(android.os.LocaleList localeList) {
        this.N = true;
        this.K.setTextLocales(localeList);
        if (this.M != null) {
            Y();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: setTextOperationUser */
    public final void m81800x66c43963(android.os.UserHandle userHandle) {
        if (java.util.Objects.equals(this.R1, userHandle)) {
            return;
        }
        if (userHandle != null) {
            android.os.Process.myUserHandle().equals(userHandle);
        }
        this.R1 = userHandle;
    }

    /* renamed from: setTextScaleX */
    public void m81801x89cf01dd(float f17) {
        if (f17 != this.K.getTextScaleX()) {
            this.L = true;
            this.K.setTextScaleX(f17);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setTextSelectHandle */
    public void m81803x58711c93(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.f293116d2 = drawable;
            this.f293114c2 = 0;
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The text select handle should not be null.");
    }

    /* renamed from: setTextSelectHandleLeft */
    public void m81805x4abeaf3a(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.Z1 = drawable;
            this.Y1 = 0;
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The left text select handle should not be null.");
    }

    /* renamed from: setTextSelectHandleRight */
    public void m81807xd6d9949(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.f293113b2 = drawable;
            this.f293112a2 = 0;
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                e0Var.w(true);
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("The right text select handle should not be null.");
    }

    /* renamed from: setTextSize */
    public void m81808x3abfd950(float f17) {
        m81809x3abfd950(2, f17);
    }

    /* renamed from: setTransformationMethod */
    public final void m81810xa06c90cc(android.text.method.TransformationMethod transformationMethod) {
        android.text.Spannable spannable;
        android.text.method.TransformationMethod transformationMethod2 = this.H;
        if (transformationMethod == transformationMethod2) {
            return;
        }
        if (transformationMethod2 != null && (spannable = this.B) != null) {
            spannable.removeSpan(transformationMethod2);
        }
        this.H = transformationMethod;
        m81790x765074af(this.A);
        boolean z17 = this.H instanceof android.text.method.PasswordTransformationMethod;
        this.P1 = m81700xe50814e();
    }

    /* renamed from: setTypeface */
    public void m81811x4e4ad719(android.graphics.Typeface typeface) {
        if (this.K.getTypeface() != typeface) {
            this.K.setTypeface(typeface);
            if (this.M != null) {
                Y();
                requestLayout();
                invalidate();
            }
        }
    }

    /* renamed from: setWidth */
    public void m81812x53e9ee84(int i17) {
        this.C1 = i17;
        this.A1 = i17;
        this.D1 = 2;
        this.B1 = 2;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public boolean showContextMenu() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return super.showContextMenu();
    }

    public final void t() {
        int right = ((getRight() - getLeft()) - m81628xdc9a71d7()) - m81629xb70a2a4c();
        if (right < 1) {
            right = 0;
        }
        int i17 = right;
        int i18 = this.U ? 1048576 : i17;
        android.text.BoringLayout.Metrics metrics = f293110u2;
        X(i18, i17, metrics, metrics, i17, false);
    }

    public void t0() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.J();
        }
    }

    public void u() {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.f354500y = true;
            gl5.s sVar = e0Var.f354486k;
            if (sVar != null) {
                int i17 = sVar.f354623c + 1;
                sVar.f354623c = i17;
                if (i17 == 1) {
                    sVar.f354624d = false;
                    sVar.f354629i = 0;
                    boolean z17 = sVar.f354626f;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
                    if (z17) {
                        sVar.f354627g = 0;
                        sVar.f354628h = viewTreeObserverOnPreDrawListenerC22668xe0605023.mo81602xfb85ada3().length();
                    } else {
                        sVar.f354627g = -1;
                        sVar.f354628h = -1;
                        sVar.f354626f = false;
                    }
                    viewTreeObserverOnPreDrawListenerC22668xe0605023.getClass();
                }
            }
        }
    }

    public boolean u0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if ((r11 - r10) < r12) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(int r18) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.v(int):boolean");
    }

    public boolean v0() {
        il5.a aVar = this.G;
        if (aVar == null || !aVar.mo81821x906aba63()) {
            return false;
        }
        return V() || (W() && (this.A instanceof android.text.Spannable) && isEnabled());
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        gl5.g gVar;
        boolean verifyDrawable = super.verifyDrawable(drawable);
        if (!verifyDrawable && (gVar = this.f293152z) != null) {
            for (android.graphics.drawable.Drawable drawable2 : gVar.f354514b) {
                if (drawable == drawable2) {
                    return true;
                }
            }
        }
        return verifyDrawable;
    }

    public boolean w() {
        return !(this.H instanceof android.text.method.PasswordTransformationMethod) && this.A.length() > 0 && M() && this.f293122g2 != null;
    }

    public void w0() {
        invalidate();
        int m81687x6f2c472c = m81687x6f2c472c();
        if (m81687x6f2c472c >= 0 || (this.T & 112) == 80) {
            d0();
        }
        B();
        if (m81687x6f2c472c >= 0) {
            this.V1 = true;
            gl5.e0 e0Var = this.f293122g2;
            if (e0Var != null) {
                e0Var.x();
            }
            v(m81687x6f2c472c);
        }
    }

    public boolean x() {
        gl5.e0 e0Var;
        return !(this.H instanceof android.text.method.PasswordTransformationMethod) && this.A.length() > 0 && M() && (this.A instanceof android.text.Editable) && (e0Var = this.f293122g2) != null && e0Var.f354490o != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r7.A.length() == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0() {
        /*
            r7 = this;
            int[] r0 = r7.getDrawableState()
            android.content.res.ColorStateList r1 = r7.f293115d
            r2 = 0
            int r1 = r1.getColorForState(r0, r2)
            int r3 = r7.f293121g
            r4 = 1
            if (r1 == r3) goto L14
            r7.f293121g = r1
            r1 = r4
            goto L15
        L14:
            r1 = r2
        L15:
            android.content.res.ColorStateList r3 = r7.f293119f
            if (r3 == 0) goto L26
            int r3 = r3.getColorForState(r0, r2)
            android.text.TextPaint r5 = r7.K
            int r6 = r5.linkColor
            if (r3 == r6) goto L26
            r5.linkColor = r3
            r1 = r4
        L26:
            android.content.res.ColorStateList r3 = r7.f293117e
            if (r3 == 0) goto L3d
            int r0 = r3.getColorForState(r0, r2)
            int r2 = r7.f293123h
            if (r0 == r2) goto L3d
            r7.f293123h = r0
            java.lang.CharSequence r0 = r7.A
            int r0 = r0.length()
            if (r0 != 0) goto L3d
            goto L3e
        L3d:
            r4 = r1
        L3e:
            if (r4 == 0) goto L43
            r7.invalidate()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.x0():void");
    }

    public boolean y() {
        gl5.e0 e0Var;
        return (this.A instanceof android.text.Editable) && (e0Var = this.f293122g2) != null && e0Var.f354490o != null && m81687x6f2c472c() >= 0 && m81686xffd93625() >= 0;
    }

    public int y0() {
        int m81640x14c7f93 = m81640x14c7f93() - getScrollY();
        return (this.T & 112) != 48 ? m81640x14c7f93 + L(false) : m81640x14c7f93;
    }

    public boolean z() {
        gl5.e0 e0Var;
        return (this.A.length() == 0 || (e0Var = this.f293122g2) == null || !e0Var.f354480e) ? false : true;
    }

    public ViewTreeObserverOnPreDrawListenerC22668xe0605023(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    /* renamed from: setText */
    public final void m81789x765074af(int i17) {
        m81790x765074af(getContext().getResources().getText(i17));
    }

    /* renamed from: setTextSize */
    public void m81809x3abfd950(int i17, float f17) {
        android.content.res.Resources resources;
        u0();
        android.content.Context context = getContext();
        if (context == null) {
            resources = android.content.res.Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        this.P = i17;
        m0(android.util.TypedValue.applyDimension(i17, f17, resources.getDisplayMetrics()), true);
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomTextView$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023.SavedState> f39743x681a0c0c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.a();

        /* renamed from: d, reason: collision with root package name */
        public int f293154d;

        /* renamed from: e, reason: collision with root package name */
        public int f293155e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.CharSequence f293156f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f293157g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.CharSequence f293158h;

        /* renamed from: i, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002.C22674xc6a422ec f293159i;

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.f293154d = -1;
            this.f293155e = -1;
        }

        /* renamed from: toString */
        public java.lang.String m81814x9616526c() {
            java.lang.String str = "TextView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " start=" + this.f293154d + " end=" + this.f293155e;
            if (this.f293156f != null) {
                str = str + " text=" + ((java.lang.Object) this.f293156f);
            }
            return str + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f293154d);
            parcel.writeInt(this.f293155e);
            parcel.writeInt(this.f293157g ? 1 : 0);
            android.text.TextUtils.writeToParcel(this.f293156f, parcel, i17);
            java.lang.CharSequence charSequence = this.f293158h;
            if (charSequence == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                android.text.TextUtils.writeToParcel(charSequence, parcel, i17);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002.C22674xc6a422ec c22674xc6a422ec = this.f293159i;
            if (c22674xc6a422ec == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                c22674xc6a422ec.writeToParcel(parcel, i17);
            }
        }

        public SavedState(android.os.Parcel parcel, gl5.a aVar) {
            super(parcel);
            this.f293154d = -1;
            this.f293155e = -1;
            this.f293154d = parcel.readInt();
            this.f293155e = parcel.readInt();
            this.f293157g = parcel.readInt() != 0;
            this.f293156f = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                this.f293158h = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            if (parcel.readInt() != 0) {
                this.f293159i = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2754x36f002.C22674xc6a422ec.f39752x681a0c0c.createFromParcel(parcel);
            }
        }
    }

    public ViewTreeObserverOnPreDrawListenerC22668xe0605023(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f293131m = android.text.Editable.Factory.getInstance();
        this.f293133n = android.text.Spannable.Factory.getInstance();
        this.D = android.widget.TextView.BufferType.NORMAL;
        this.N = false;
        this.P = -1;
        this.Q = false;
        this.T = 8388659;
        this.W = true;
        this.f293137p0 = 1.0f;
        this.f293147x0 = 0.0f;
        this.f293150y0 = Integer.MAX_VALUE;
        this.f293129l1 = 1;
        this.f293138p1 = 0;
        this.f293148x1 = 1;
        this.f293151y1 = Integer.MAX_VALUE;
        this.f293153z1 = 1;
        this.A1 = Integer.MAX_VALUE;
        this.B1 = 2;
        this.C1 = 0;
        this.D1 = 2;
        this.F1 = -1;
        this.G1 = true;
        this.H1 = -1;
        this.Q1 = f293106q2;
        this.S1 = 1714664933;
        this.V1 = true;
        this.W1 = android.R.attr.textCursorDrawable;
        this.Y1 = android.R.attr.textSelectHandleLeft;
        this.f293112a2 = android.R.attr.textSelectHandleRight;
        this.f293114c2 = android.R.attr.textSelectHandle;
        this.f293118e2 = -1;
        this.f293126i2 = new gl5.a(this);
        this.f293127j2 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560393j6);
        this.f293128k2 = false;
        this.f293132m2 = new java.util.HashSet();
        this.f293134n2 = new java.util.HashSet();
        N(context, attributeSet, i17, i18);
    }

    /* renamed from: setHintTextColor */
    public final void m81753x40e6fa2d(android.content.res.ColorStateList colorStateList) {
        this.f293117e = colorStateList;
        x0();
    }

    /* renamed from: setLinkTextColor */
    public final void m81766x645e1a1a(android.content.res.ColorStateList colorStateList) {
        this.f293119f = colorStateList;
        x0();
    }

    /* renamed from: setTextColor */
    public void m81793x1c5c5ff4(android.content.res.ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f293115d = colorStateList;
        x0();
    }

    @Override // android.view.View
    public boolean showContextMenu(float f17, float f18) {
        gl5.e0 e0Var = this.f293122g2;
        if (e0Var != null) {
            e0Var.getClass();
        }
        return super.showContextMenu(f17, f18);
    }

    /* renamed from: setHint */
    public final void m81750x764b0e09(int i17) {
        m81751x764b0e09(getContext().getResources().getText(i17));
    }

    /* renamed from: setTextCursorDrawable */
    public void m81794x372124a3(int i17) {
        m81795x372124a3(i17 != 0 ? getContext().getDrawable(i17) : null);
    }

    /* renamed from: setTextSelectHandle */
    public void m81802x58711c93(int i17) {
        if (i17 != 0) {
            m81803x58711c93(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select handle should be a valid drawable resource id.");
    }

    /* renamed from: setTextSelectHandleLeft */
    public void m81804x4abeaf3a(int i17) {
        if (i17 != 0) {
            m81805x4abeaf3a(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select left handle should be a valid drawable resource id.");
    }

    /* renamed from: setTextSelectHandleRight */
    public void m81806xd6d9949(int i17) {
        if (i17 != 0) {
            m81807xd6d9949(getContext().getDrawable(i17));
            return;
        }
        throw new java.lang.IllegalArgumentException("The text select right handle should be a valid drawable resource id.");
    }
}
