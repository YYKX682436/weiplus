package com.tencent.mm.plugin.emoji.editor.widgets;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002!\"#$B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorTrimView;", "Landroid/widget/FrameLayout;", "Lo12/f0;", "d", "Lo12/f0;", "getCallback", "()Lo12/f0;", "setCallback", "(Lo12/f0;)V", "callback", "", "value", "e", "F", "setTrimStart", "(F)V", "trimStart", "f", "setTrimEnd", "trimEnd", "", "x", "I", "getThumbSize", "()I", "thumbSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o12/g0", "o12/h0", "o12/i0", "o12/j0", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiEditorTrimView extends android.widget.FrameLayout {
    public final android.graphics.Paint A;
    public final android.graphics.Paint B;
    public android.util.Range C;
    public float D;
    public kotlinx.coroutines.y0 E;
    public java.util.List F;
    public final java.util.HashSet G;
    public final androidx.recyclerview.widget.RecyclerView H;
    public final o12.j0 I;

    /* renamed from: J, reason: collision with root package name */
    public int f97512J;
    public android.util.Range K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public o12.f0 callback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float trimStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float trimEnd;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Bitmap f97516g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f97517h;

    /* renamed from: i, reason: collision with root package name */
    public float f97518i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f97519m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f97520n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f97521o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f97522p;

    /* renamed from: q, reason: collision with root package name */
    public final int f97523q;

    /* renamed from: r, reason: collision with root package name */
    public float f97524r;

    /* renamed from: s, reason: collision with root package name */
    public float f97525s;

    /* renamed from: t, reason: collision with root package name */
    public float f97526t;

    /* renamed from: u, reason: collision with root package name */
    public float f97527u;

    /* renamed from: v, reason: collision with root package name */
    public o12.g0 f97528v;

    /* renamed from: w, reason: collision with root package name */
    public android.util.Range f97529w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final int thumbSize;

    /* renamed from: y, reason: collision with root package name */
    public final int f97531y;

    /* renamed from: z, reason: collision with root package name */
    public final float f97532z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorTrimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final void setTrimEnd(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.trimEnd = f17;
        requestLayout();
    }

    private final void setTrimStart(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.trimStart = f17;
        requestLayout();
    }

    public final boolean a(int i17) {
        o12.g0 g0Var = this.f97528v;
        if (g0Var == o12.g0.f342150e) {
            float f17 = this.f97526t + i17;
            float f18 = this.trimEnd;
            java.lang.Object upper = this.C.getUpper();
            kotlin.jvm.internal.o.f(upper, "getUpper(...)");
            float max = java.lang.Math.max(0.0f, f18 - d(((java.lang.Number) upper).floatValue()));
            float f19 = this.trimEnd;
            java.lang.Object lower = this.C.getLower();
            kotlin.jvm.internal.o.f(lower, "getLower(...)");
            float e17 = e06.p.e(f17, max, f19 - d(((java.lang.Number) lower).floatValue()));
            if (!(e17 == this.trimStart)) {
                setTrimStart(e17);
                invalidate();
                return true;
            }
        } else if (g0Var == o12.g0.f342151f) {
            float f27 = this.trimStart;
            java.lang.Object upper2 = this.C.getUpper();
            kotlin.jvm.internal.o.f(upper2, "getUpper(...)");
            float min = java.lang.Math.min(f27 + d(((java.lang.Number) upper2).floatValue()), (getWidth() - (this.f97531y * 2)) - (this.f97518i * 2));
            float f28 = this.f97527u + i17;
            float f29 = this.trimStart;
            java.lang.Object lower2 = this.C.getLower();
            kotlin.jvm.internal.o.f(lower2, "getLower(...)");
            float e18 = e06.p.e(f28, f29 + d(((java.lang.Number) lower2).floatValue()), min);
            if (!(e18 == this.trimEnd)) {
                setTrimEnd(e18);
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
        kotlin.jvm.internal.o.g(times, "times");
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
        if (f0Var != null && (kVar = (wVar = ((p12.v) f0Var).f351053a).f351054g) != null) {
            ((rm5.h) kVar).a(K0, new p12.u(wVar));
        }
        this.I.notifyDataSetChanged();
        int size = times.size();
        int i17 = this.thumbSize;
        java.lang.Object upper = this.C.getUpper();
        kotlin.jvm.internal.o.f(upper, "getUpper(...)");
        setTrimEnd(java.lang.Math.min(size * i17, d(((java.lang.Number) upper).floatValue())));
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorTrimView", "max duration: " + b(times.size() * i17) + ", trimEnd: " + this.trimEnd);
    }

    public final float d(float f17) {
        return (f17 / this.D) * this.thumbSize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        o12.g0 g0Var = this.f97528v;
        o12.g0 g0Var2 = o12.g0.f342149d;
        int i17 = this.f97531y;
        if (g0Var == g0Var2) {
            float f17 = this.f97524r + i17 + this.f97518i;
            canvas.drawRect(f17, 0.0f, f17 + this.f97523q, getHeight(), this.f97521o);
        }
        android.graphics.RectF rectF = this.f97519m;
        rectF.offsetTo(i17 + this.trimStart, 0.0f);
        android.graphics.RectF rectF2 = this.f97520n;
        float f18 = this.trimStart;
        rectF2.offsetTo(i17 + f18 + this.f97518i + (this.trimEnd - f18), 0.0f);
        float f19 = this.f97532z;
        float f27 = rectF.left;
        float height = getHeight();
        float f28 = this.f97532z;
        android.graphics.Paint paint = this.f97522p;
        canvas.drawRect(0.0f, f19, f27, height - f28, paint);
        canvas.drawRect(rectF2.right, this.f97532z, getWidth(), getHeight() - f28, paint);
        float f29 = 1;
        float f37 = 2;
        android.graphics.Paint paint2 = this.A;
        canvas.drawLine(rectF.right - f29, f28 / f37, rectF2.left + f29, f28 / f37, paint2);
        canvas.drawLine(rectF.right - f29, (f28 / f37) + (getHeight() - f28), rectF2.left + f29, (getHeight() - f28) + (f28 / f37), paint2);
        android.graphics.Paint paint3 = this.B;
        canvas.drawBitmap(this.f97517h, (android.graphics.Rect) null, rectF, paint3);
        canvas.drawBitmap(this.f97516g, (android.graphics.Rect) null, rectF2, paint3);
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
        this.E = kotlinx.coroutines.z0.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.z0.e(this.E, null, 1, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getActionMasked() == 0 && (this.f97519m.contains(event.getX(), event.getY()) || this.f97520n.contains(event.getX(), event.getY()))) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        float height = getHeight();
        android.graphics.Bitmap bitmap = this.f97516g;
        float height2 = (height / bitmap.getHeight()) * bitmap.getWidth();
        this.f97518i = height2;
        this.f97519m.set(0.0f, 0.0f, height2, getHeight());
        this.f97520n.set(0.0f, 0.0f, this.f97518i, getHeight());
        float f17 = i17;
        float f18 = this.f97518i * 2;
        int i28 = this.f97531y;
        int i29 = this.thumbSize;
        float f19 = (((int) (f17 - (f18 + (i28 * 2)))) / i29) * i29;
        o12.f0 f0Var = this.callback;
        if (f0Var != null) {
            float f27 = i29 / f19;
            java.lang.Object upper = this.C.getUpper();
            kotlin.jvm.internal.o.f(upper, "getUpper(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoRenderViewController", "onThumbDurationPredicted, duration: " + (f27 * ((java.lang.Number) upper).floatValue()));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loading video thumb info, path: ");
            p12.w wVar = ((p12.v) f0Var).f351053a;
            java.io.File file = wVar.f351027f;
            sb6.append(file != null ? file.getAbsolutePath() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoRenderViewController", sb6.toString());
            bg0.v vVar = (bg0.v) i95.n0.c(bg0.v.class);
            java.io.File file2 = wVar.f351027f;
            java.lang.String absolutePath = file2 != null ? file2.getAbsolutePath() : null;
            kotlin.jvm.internal.o.d(absolutePath);
            b92.u2 u2Var = (b92.u2) vVar;
            kp4.a Ai = u2Var.Ai(u2Var.Di(absolutePath, false));
            Ai.f311076f = (float) java.lang.Math.ceil(wVar.f351024c / r12);
            Ai.g();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("thumb info generated, frames count: ");
            java.util.LinkedList linkedList = Ai.f311077g;
            sb7.append(linkedList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoRenderViewController", sb7.toString());
            rm5.h a17 = rm5.h.f397489h.a(((kp4.c1) Ai).f311097n.f175627l);
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = wVar.f351055h;
            if (emojiEditorTrimView == null) {
                kotlin.jvm.internal.o.o("trimView");
                throw null;
            }
            int thumbSize = emojiEditorTrimView.getThumbSize();
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView2 = wVar.f351055h;
            if (emojiEditorTrimView2 == null) {
                kotlin.jvm.internal.o.o("trimView");
                throw null;
            }
            a17.setSize(thumbSize, emojiEditorTrimView2.getThumbSize());
            wVar.f351054g = a17;
            com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView3 = wVar.f351055h;
            if (emojiEditorTrimView3 == null) {
                kotlin.jvm.internal.o.o("trimView");
                throw null;
            }
            float f28 = wVar.f351024c / Ai.f311076f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((kp4.m) it.next()).f311124a));
            }
            emojiEditorTrimView3.c(f28, arrayList);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.H;
        float f29 = this.f97518i;
        recyclerView.setPadding((int) (i28 + f29), 0, (int) (f29 + i28), 0);
        float paddingLeft = (f17 - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (this.L) {
            java.lang.Object lower = this.K.getLower();
            kotlin.jvm.internal.o.f(lower, "getLower(...)");
            int d17 = (int) d(((java.lang.Number) lower).floatValue());
            java.lang.Object lower2 = this.K.getLower();
            kotlin.jvm.internal.o.f(lower2, "getLower(...)");
            float d18 = d(((java.lang.Number) lower2).floatValue());
            float max = java.lang.Math.max(d(this.F.size() * this.D) - paddingLeft, 0.0f);
            if (d18 > max) {
                float f37 = d18 - max;
                this.f97526t = f37;
                float floatValue = ((java.lang.Number) this.K.getUpper()).floatValue();
                java.lang.Object lower3 = this.K.getLower();
                kotlin.jvm.internal.o.f(lower3, "getLower(...)");
                this.f97527u = f37 + d(floatValue - ((java.lang.Number) lower3).floatValue());
            } else {
                this.f97526t = d(0.0f);
                float floatValue2 = ((java.lang.Number) this.K.getUpper()).floatValue();
                java.lang.Object lower4 = this.K.getLower();
                kotlin.jvm.internal.o.f(lower4, "getLower(...)");
                this.f97527u = d(floatValue2 - ((java.lang.Number) lower4).floatValue());
            }
            setTrimStart(this.f97526t);
            setTrimEnd(this.f97527u);
            recyclerView.post(new o12.k0(this, d17));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCallback(o12.f0 f0Var) {
        this.callback = f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditorTrimView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Bitmap d07 = com.tencent.mm.sdk.platformtools.x.d0(com.tencent.mm.R.raw.video_emoji_trim_thumb, getResources().getDisplayMetrics().density);
        this.f97516g = d07;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(-1.0f, 1.0f, d07.getWidth() / 2.0f, d07.getHeight() / 2.0f);
        int width = d07.getWidth();
        int height = d07.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        kotlin.jvm.internal.o.f(createBitmap, "run(...)");
        this.f97517h = createBitmap;
        this.f97519m = new android.graphics.RectF();
        this.f97520n = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f97521o = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(Integer.MIN_VALUE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f97522p = paint2;
        this.f97523q = (int) (getResources().getDisplayMetrics().density * 2);
        this.f97525s = -1.0f;
        this.f97528v = o12.g0.f342149d;
        this.f97529w = new android.util.Range(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        int i18 = (int) (getResources().getDisplayMetrics().density * 48);
        this.thumbSize = i18;
        this.f97531y = (int) (getResources().getDisplayMetrics().density * 24);
        float f17 = getResources().getDisplayMetrics().density * 2.0f;
        this.f97532z = f17;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setStrokeWidth(f17);
        this.A = paint3;
        this.B = new android.graphics.Paint(1);
        this.C = new android.util.Range(java.lang.Float.valueOf(500.0f), java.lang.Float.valueOf(5000.0f));
        this.E = kotlinx.coroutines.z0.b();
        this.F = kz5.p0.f313996d;
        this.G = new java.util.HashSet();
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.H = recyclerView;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        o12.j0 j0Var = new o12.j0(this);
        this.I = j0Var;
        this.K = new android.util.Range(java.lang.Float.valueOf(500.0f), java.lang.Float.valueOf(5000.0f));
        setClipToPadding(false);
        setClipChildren(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setAdapter(j0Var);
        addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, i18, 16));
        recyclerView.i(new o12.e0(this));
    }
}
