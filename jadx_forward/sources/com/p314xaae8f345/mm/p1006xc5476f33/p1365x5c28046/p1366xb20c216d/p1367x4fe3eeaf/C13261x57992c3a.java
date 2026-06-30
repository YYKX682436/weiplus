package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002!\"#$B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView;", "Landroid/widget/FrameLayout;", "Lo12/f0;", "d", "Lo12/f0;", "getCallback", "()Lo12/f0;", "setCallback", "(Lo12/f0;)V", "callback", "", "value", "e", "F", "setTrimStart", "(F)V", "trimStart", "f", "setTrimEnd", "trimEnd", "", "x", "I", "getThumbSize", "()I", "thumbSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o12/g0", "o12/h0", "o12/i0", "o12/j0", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView */
/* loaded from: classes10.dex */
public final class C13261x57992c3a extends android.widget.FrameLayout {
    public final android.graphics.Paint A;
    public final android.graphics.Paint B;
    public android.util.Range C;
    public float D;
    public p3325xe03a0797.p3326xc267989b.y0 E;
    public java.util.List F;
    public final java.util.HashSet G;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 H;
    public final o12.j0 I;

    /* renamed from: J, reason: collision with root package name */
    public int f179045J;
    public android.util.Range K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public o12.f0 callback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float trimStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float trimEnd;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Bitmap f179049g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f179050h;

    /* renamed from: i, reason: collision with root package name */
    public float f179051i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f179052m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f179053n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f179054o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f179055p;

    /* renamed from: q, reason: collision with root package name */
    public final int f179056q;

    /* renamed from: r, reason: collision with root package name */
    public float f179057r;

    /* renamed from: s, reason: collision with root package name */
    public float f179058s;

    /* renamed from: t, reason: collision with root package name */
    public float f179059t;

    /* renamed from: u, reason: collision with root package name */
    public float f179060u;

    /* renamed from: v, reason: collision with root package name */
    public o12.g0 f179061v;

    /* renamed from: w, reason: collision with root package name */
    public android.util.Range f179062w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final int thumbSize;

    /* renamed from: y, reason: collision with root package name */
    public final int f179064y;

    /* renamed from: z, reason: collision with root package name */
    public final float f179065z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13261x57992c3a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setTrimEnd */
    private final void m54770x72141a97(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.trimEnd = f17;
        requestLayout();
    }

    /* renamed from: setTrimStart */
    private final void m54771x3e3fd71e(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.trimStart = f17;
        requestLayout();
    }

    public final boolean a(int i17) {
        o12.g0 g0Var = this.f179061v;
        if (g0Var == o12.g0.f423683e) {
            float f17 = this.f179059t + i17;
            float f18 = this.trimEnd;
            java.lang.Object upper = this.C.getUpper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper, "getUpper(...)");
            float max = java.lang.Math.max(0.0f, f18 - d(((java.lang.Number) upper).floatValue()));
            float f19 = this.trimEnd;
            java.lang.Object lower = this.C.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
            float e17 = e06.p.e(f17, max, f19 - d(((java.lang.Number) lower).floatValue()));
            if (!(e17 == this.trimStart)) {
                m54771x3e3fd71e(e17);
                invalidate();
                return true;
            }
        } else if (g0Var == o12.g0.f423684f) {
            float f27 = this.trimStart;
            java.lang.Object upper2 = this.C.getUpper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper2, "getUpper(...)");
            float min = java.lang.Math.min(f27 + d(((java.lang.Number) upper2).floatValue()), (getWidth() - (this.f179064y * 2)) - (this.f179051i * 2));
            float f28 = this.f179060u + i17;
            float f29 = this.trimStart;
            java.lang.Object lower2 = this.C.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower2, "getLower(...)");
            float e18 = e06.p.e(f28, f29 + d(((java.lang.Number) lower2).floatValue()), min);
            if (!(e18 == this.trimEnd)) {
                m54770x72141a97(e18);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final int b(float f17) {
        return (int) ((f17 / this.thumbSize) * this.D);
    }

    public final void c(float f17, java.util.List times) {
        p12.w wVar;
        rm5.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(times, "times");
        this.D = f17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(times, 10));
        java.util.Iterator it = times.iterator();
        while (it.hasNext()) {
            arrayList.add(new o12.h0(((java.lang.Number) it.next()).longValue(), null, 2, null));
        }
        this.F = arrayList;
        java.util.List K0 = kz5.n0.K0(times, 10);
        this.G.addAll(K0);
        o12.f0 f0Var = this.callback;
        if (f0Var != null && (kVar = (wVar = ((p12.v) f0Var).f432586a).f432587g) != null) {
            ((rm5.h) kVar).a(K0, new p12.u(wVar));
        }
        this.I.m8146xced61ae5();
        int size = times.size();
        int i17 = this.thumbSize;
        java.lang.Object upper = this.C.getUpper();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper, "getUpper(...)");
        m54770x72141a97(java.lang.Math.min(size * i17, d(((java.lang.Number) upper).floatValue())));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorTrimView", "max duration: " + b(times.size() * i17) + ", trimEnd: " + this.trimEnd);
    }

    public final float d(float f17) {
        return (f17 / this.D) * this.thumbSize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        o12.g0 g0Var = this.f179061v;
        o12.g0 g0Var2 = o12.g0.f423682d;
        int i17 = this.f179064y;
        if (g0Var == g0Var2) {
            float f17 = this.f179057r + i17 + this.f179051i;
            canvas.drawRect(f17, 0.0f, f17 + this.f179056q, getHeight(), this.f179054o);
        }
        android.graphics.RectF rectF = this.f179052m;
        rectF.offsetTo(i17 + this.trimStart, 0.0f);
        android.graphics.RectF rectF2 = this.f179053n;
        float f18 = this.trimStart;
        rectF2.offsetTo(i17 + f18 + this.f179051i + (this.trimEnd - f18), 0.0f);
        float f19 = this.f179065z;
        float f27 = rectF.left;
        float height = getHeight();
        float f28 = this.f179065z;
        android.graphics.Paint paint = this.f179055p;
        canvas.drawRect(0.0f, f19, f27, height - f28, paint);
        canvas.drawRect(rectF2.right, this.f179065z, getWidth(), getHeight() - f28, paint);
        float f29 = 1;
        float f37 = 2;
        android.graphics.Paint paint2 = this.A;
        canvas.drawLine(rectF.right - f29, f28 / f37, rectF2.left + f29, f28 / f37, paint2);
        canvas.drawLine(rectF.right - f29, (f28 / f37) + (getHeight() - f28), rectF2.left + f29, (getHeight() - f28) + (f28 / f37), paint2);
        android.graphics.Paint paint3 = this.B;
        canvas.drawBitmap(this.f179050h, (android.graphics.Rect) null, rectF, paint3);
        canvas.drawBitmap(this.f179049g, (android.graphics.Rect) null, rectF2, paint3);
    }

    public final o12.f0 getCallback() {
        return this.callback;
    }

    public final int getThumbSize() {
        return this.thumbSize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p3325xe03a0797.p3326xc267989b.z0.e(this.E, null, 1, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getActionMasked() == 0 && (this.f179052m.contains(event.getX(), event.getY()) || this.f179053n.contains(event.getX(), event.getY()))) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float height = getHeight();
        android.graphics.Bitmap bitmap = this.f179049g;
        float height2 = (height / bitmap.getHeight()) * bitmap.getWidth();
        this.f179051i = height2;
        this.f179052m.set(0.0f, 0.0f, height2, getHeight());
        this.f179053n.set(0.0f, 0.0f, this.f179051i, getHeight());
        float f17 = i17;
        float f18 = this.f179051i * 2;
        int i28 = this.f179064y;
        int i29 = this.thumbSize;
        float f19 = (((int) (f17 - (f18 + (i28 * 2)))) / i29) * i29;
        o12.f0 f0Var = this.callback;
        if (f0Var != null) {
            float f27 = i29 / f19;
            java.lang.Object upper = this.C.getUpper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upper, "getUpper(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", "onThumbDurationPredicted, duration: " + (f27 * ((java.lang.Number) upper).floatValue()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loading video thumb info, path: ");
            p12.w wVar = ((p12.v) f0Var).f432586a;
            java.io.File file = wVar.f432560f;
            sb6.append(file != null ? file.getAbsolutePath() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", sb6.toString());
            bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
            java.io.File file2 = wVar.f432560f;
            java.lang.String absolutePath = file2 != null ? file2.getAbsolutePath() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(absolutePath);
            b92.u2 u2Var = (b92.u2) vVar;
            kp4.a Ai = u2Var.Ai(u2Var.Di(absolutePath, false));
            Ai.f392609f = (float) java.lang.Math.ceil(wVar.f432557c / r12);
            Ai.g();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("thumb info generated, frames count: ");
            java.util.LinkedList linkedList = Ai.f392610g;
            sb7.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoRenderViewController", sb7.toString());
            rm5.h a17 = rm5.h.f479022h.a(((kp4.c1) Ai).f392630n.f257160l);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = wVar.f432588h;
            if (c13261x57992c3a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
                throw null;
            }
            int thumbSize = c13261x57992c3a.getThumbSize();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a2 = wVar.f432588h;
            if (c13261x57992c3a2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
                throw null;
            }
            a17.mo122876x76500f83(thumbSize, c13261x57992c3a2.getThumbSize());
            wVar.f432587g = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a3 = wVar.f432588h;
            if (c13261x57992c3a3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
                throw null;
            }
            float f28 = wVar.f432557c / Ai.f392609f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((kp4.m) it.next()).f392657a));
            }
            c13261x57992c3a3.c(f28, arrayList);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.H;
        float f29 = this.f179051i;
        c1163xf1deaba4.setPadding((int) (i28 + f29), 0, (int) (f29 + i28), 0);
        float paddingLeft = (f17 - c1163xf1deaba4.getPaddingLeft()) - c1163xf1deaba4.getPaddingRight();
        if (this.L) {
            java.lang.Object lower = this.K.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower, "getLower(...)");
            int d17 = (int) d(((java.lang.Number) lower).floatValue());
            java.lang.Object lower2 = this.K.getLower();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower2, "getLower(...)");
            float d18 = d(((java.lang.Number) lower2).floatValue());
            float max = java.lang.Math.max(d(this.F.size() * this.D) - paddingLeft, 0.0f);
            if (d18 > max) {
                float f37 = d18 - max;
                this.f179059t = f37;
                float floatValue = ((java.lang.Number) this.K.getUpper()).floatValue();
                java.lang.Object lower3 = this.K.getLower();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower3, "getLower(...)");
                this.f179060u = f37 + d(floatValue - ((java.lang.Number) lower3).floatValue());
            } else {
                this.f179059t = d(0.0f);
                float floatValue2 = ((java.lang.Number) this.K.getUpper()).floatValue();
                java.lang.Object lower4 = this.K.getLower();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lower4, "getLower(...)");
                this.f179060u = d(floatValue2 - ((java.lang.Number) lower4).floatValue());
            }
            m54771x3e3fd71e(this.f179059t);
            m54770x72141a97(this.f179060u);
            c1163xf1deaba4.post(new o12.k0(this, d17));
            this.L = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setCallback */
    public final void m54774x6c4ebec7(o12.f0 f0Var) {
        this.callback = f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13261x57992c3a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Bitmap d07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d0(com.p314xaae8f345.mm.R.raw.f81296xd30de856, getResources().getDisplayMetrics().density);
        this.f179049g = d07;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(-1.0f, 1.0f, d07.getWidth() / 2.0f, d07.getHeight() / 2.0f);
        int width = d07.getWidth();
        int height = d07.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(d07);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "run(...)");
        this.f179050h = createBitmap;
        this.f179052m = new android.graphics.RectF();
        this.f179053n = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f179054o = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(Integer.MIN_VALUE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f179055p = paint2;
        this.f179056q = (int) (getResources().getDisplayMetrics().density * 2);
        this.f179058s = -1.0f;
        this.f179061v = o12.g0.f423682d;
        this.f179062w = new android.util.Range(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        int i18 = (int) (getResources().getDisplayMetrics().density * 48);
        this.thumbSize = i18;
        this.f179064y = (int) (getResources().getDisplayMetrics().density * 24);
        float f17 = getResources().getDisplayMetrics().density * 2.0f;
        this.f179065z = f17;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setStrokeWidth(f17);
        this.A = paint3;
        this.B = new android.graphics.Paint(1);
        this.C = new android.util.Range(java.lang.Float.valueOf(500.0f), java.lang.Float.valueOf(5000.0f));
        this.E = p3325xe03a0797.p3326xc267989b.z0.b();
        this.F = kz5.p0.f395529d;
        this.G = new java.util.HashSet();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        this.H = c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false);
        o12.j0 j0Var = new o12.j0(this);
        this.I = j0Var;
        this.K = new android.util.Range(java.lang.Float.valueOf(500.0f), java.lang.Float.valueOf(5000.0f));
        setClipToPadding(false);
        setClipChildren(false);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.setClipChildren(false);
        c1163xf1deaba4.setClipToPadding(false);
        c1163xf1deaba4.mo7960x6cab2c8d(j0Var);
        addView(c1163xf1deaba4, new android.widget.FrameLayout.LayoutParams(-1, i18, 16));
        c1163xf1deaba4.i(new o12.e0(this));
    }
}
