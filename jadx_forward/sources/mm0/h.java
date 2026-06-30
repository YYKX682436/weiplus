package mm0;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public mm0.g f410145a;

    /* renamed from: b, reason: collision with root package name */
    public nm0.a f410146b;

    /* renamed from: d, reason: collision with root package name */
    public android.text.StaticLayout f410148d;

    /* renamed from: f, reason: collision with root package name */
    public int f410150f;

    /* renamed from: g, reason: collision with root package name */
    public int f410151g;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f410156l;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f410147c = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410149e = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f410152h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f410153i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f410154j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f410155k = false;

    /* renamed from: m, reason: collision with root package name */
    public int f410157m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f410158n = 0;

    public h(android.view.View view, nm0.a aVar) {
        this.f410156l = view;
        this.f410146b = aVar;
    }

    public int a() {
        android.text.TextPaint paint = this.f410145a.f410144k.getPaint();
        if (paint == null) {
            paint = this.f410146b.f419987d;
        }
        float fontMetricsInt = paint.getFontMetricsInt(null);
        nm0.a aVar = this.f410146b;
        return java.lang.Math.round((fontMetricsInt * aVar.f419993j) + aVar.f419992i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r5 == 8388613) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.h.b(android.graphics.Canvas):void");
    }

    public android.graphics.Point c(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        e(size);
        android.text.StaticLayout staticLayout = this.f410148d;
        if (staticLayout == null) {
            return null;
        }
        android.view.View view = this.f410156l;
        if (mode != 1073741824) {
            int i19 = 0;
            if (this.f410146b.f419989f == null) {
                int i27 = this.f410157m;
                if (i27 != 0) {
                    i19 = i27;
                } else {
                    int lineCount = staticLayout.getLineCount();
                    java.lang.CharSequence text = staticLayout.getText();
                    int i28 = 0;
                    while (true) {
                        if (i28 >= lineCount - 1) {
                            float f17 = 0.0f;
                            while (i19 < lineCount) {
                                f17 = java.lang.Math.max(f17, staticLayout.getLineWidth(i19));
                                i19++;
                            }
                            int ceil = (int) java.lang.Math.ceil(f17);
                            this.f410157m = ceil;
                            int paddingLeft = ceil + view.getPaddingLeft() + view.getPaddingRight();
                            this.f410157m = paddingLeft;
                            i19 = paddingLeft;
                        } else {
                            if (text.charAt(staticLayout.getLineEnd(i28) - 1) != '\n') {
                                i19 = -1;
                                break;
                            }
                            i28++;
                        }
                    }
                }
            }
            int ceil2 = (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(this.f410148d.getText(), this.f410148d.getPaint()));
            if (ceil2 > i19) {
                i19 = ceil2;
            }
            size = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i19) : i19;
        }
        if (mode2 != 1073741824) {
            android.text.StaticLayout staticLayout2 = this.f410148d;
            int i29 = this.f410158n;
            if (i29 == 0) {
                int lineCount2 = staticLayout2.getLineCount();
                int i37 = this.f410145a.f410135b;
                if (i37 > 0 && i37 < lineCount2) {
                    lineCount2 = i37;
                }
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
                int lineTop = staticLayout2.getLineTop(lineCount2);
                int i38 = this.f410146b.f419985b;
                if (i38 > 0 && lineCount2 < i38) {
                    lineTop += a() * (this.f410146b.f419985b - lineCount2);
                }
                i29 = lineTop + paddingTop;
                this.f410158n = i29;
            }
            size2 = mode2 == Integer.MIN_VALUE ? java.lang.Math.min(i29, size2) : i29;
        }
        return new android.graphics.Point(size, size2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm0.h.d(android.view.MotionEvent):boolean");
    }

    public final boolean e(int i17) {
        if ((!this.f410149e && this.f410145a != null && this.f410148d != null) || this.f410146b == null || i17 <= 0) {
            return false;
        }
        f();
        mm0.g a17 = mm0.e.d(this.f410147c, i17, this.f410146b).a();
        this.f410145a = a17;
        this.f410148d = a17.f410144k;
        this.f410149e = false;
        return true;
    }

    public final void f() {
        this.f410158n = 0;
        this.f410157m = 0;
        this.f410150f = 0;
        this.f410151g = 0;
    }

    public void g(int i17) {
        nm0.a aVar = this.f410146b;
        if (aVar.f419984a == i17 && aVar.f419985b == i17) {
            return;
        }
        this.f410149e = true;
        f();
        nm0.a aVar2 = this.f410146b;
        aVar2.f419984a = i17;
        aVar2.f419985b = i17;
        android.view.View view = this.f410156l;
        view.requestLayout();
        view.invalidate();
    }

    public void h(boolean z17) {
        int i17 = z17 ? 1 : Integer.MAX_VALUE;
        nm0.a aVar = this.f410146b;
        if (aVar.f419984a != i17) {
            aVar.f419984a = i17;
            this.f410149e = true;
            f();
            android.view.View view = this.f410156l;
            view.requestLayout();
            view.invalidate();
        }
    }

    public void i(java.lang.CharSequence charSequence, boolean z17) {
        if (charSequence == null) {
            return;
        }
        java.lang.CharSequence charSequence2 = this.f410147c;
        if (charSequence2 == null || !charSequence.equals(charSequence2) || z17) {
            this.f410147c = charSequence;
            this.f410149e = true;
            android.view.View view = this.f410156l;
            view.requestLayout();
            view.invalidate();
        }
    }

    public void j(mm0.g gVar) {
        android.text.StaticLayout staticLayout;
        if (gVar == null || (staticLayout = gVar.f410144k) == null) {
            this.f410145a = null;
            return;
        }
        if (this.f410146b == null) {
            nm0.a aVar = new nm0.a();
            aVar.f419984a = gVar.f410135b;
            aVar.f419986c = gVar.f410136c;
            android.text.TextPaint textPaint = gVar.f410139f;
            aVar.f419987d = textPaint;
            aVar.f419988e = gVar.f410140g;
            aVar.f419989f = gVar.f410141h;
            aVar.f419990g = gVar.f410142i;
            aVar.f419995l = textPaint.getTextSize();
            aVar.f419996m = gVar.f410139f.getColor();
            aVar.f419998o = gVar.f410143j;
            this.f410146b = aVar;
        }
        f();
        android.view.View view = this.f410156l;
        view.setWillNotDraw(false);
        this.f410145a = gVar;
        this.f410148d = staticLayout;
        java.lang.CharSequence charSequence = gVar.f410138e;
        this.f410147c = charSequence;
        boolean z17 = charSequence instanceof android.text.Spannable;
        this.f410152h = z17;
        if (z17) {
            this.f410147c = charSequence;
            if (om0.b.f427794a == null) {
                om0.b.f427794a = new om0.b();
            }
            om0.b bVar = om0.b.f427794a;
            android.text.Spannable spannable = (android.text.Spannable) this.f410147c;
            bVar.getClass();
            android.text.Selection.removeSelection(spannable);
            spannable.removeSpan(om0.b.f427795b);
        }
        if (this.f410147c == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(gVar.f410138e == null);
            objArr[1] = java.lang.Boolean.valueOf(this.f410145a.f410138e == null);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[2] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StaticTextViewHolder", "text is null, [%b, %b, %s]", objArr);
        }
        view.requestLayout();
        view.invalidate();
    }

    public void k(int i17, float f17) {
        nm0.a aVar;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension == 0.0f || (aVar = this.f410146b) == null || applyDimension == aVar.f419995l) {
            return;
        }
        aVar.f419995l = applyDimension;
        this.f410149e = true;
    }
}
