package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R)\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/widgets/AdjustSeekBar;", "Landroid/view/View;", "", "enabled", "Ljz5/f0;", "setEnabled", "", "value", "d", "F", "getProgress", "()F", "setProgress", "(F)V", "progress", "Lkotlin/Function0;", "e", "Lyz5/a;", "getOnProgressStartChangeCallback", "()Lyz5/a;", "setOnProgressStartChangeCallback", "(Lyz5/a;)V", "onProgressStartChangeCallback", "", "Lkotlin/Function1;", "f", "Ljava/util/List;", "getOnProgressChangedCallback", "()Ljava/util/List;", "onProgressChangedCallback", "g", "Lyz5/l;", "getOnProgressConfirmCallback", "()Lyz5/l;", "setOnProgressConfirmCallback", "(Lyz5/l;)V", "onProgressConfirmCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar */
/* loaded from: classes5.dex */
public final class C10956x6271c3cc extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a onProgressStartChangeCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final java.util.List onProgressChangedCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l onProgressConfirmCallback;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f150895h;

    /* renamed from: i, reason: collision with root package name */
    public final float f150896i;

    /* renamed from: m, reason: collision with root package name */
    public final float f150897m;

    /* renamed from: n, reason: collision with root package name */
    public final float f150898n;

    /* renamed from: o, reason: collision with root package name */
    public final int f150899o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Paint f150900p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f150901q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Paint f150902r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f150903s;

    /* renamed from: t, reason: collision with root package name */
    public float f150904t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10956x6271c3cc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getOnProgressChangedCallback */
    public final java.util.List<yz5.l> m47179xb2e597() {
        return this.onProgressChangedCallback;
    }

    public final yz5.l getOnProgressConfirmCallback() {
        return this.onProgressConfirmCallback;
    }

    public final yz5.a getOnProgressStartChangeCallback() {
        return this.onProgressStartChangeCallback;
    }

    public final float getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float width2 = getWidth() / 2.0f;
        float height2 = getHeight() / 2.0f;
        float f17 = this.f150896i;
        float f18 = 2;
        float f19 = (height - f17) / f18;
        android.graphics.RectF rectF = this.f150903s;
        rectF.set(0.0f, f19, width, f19 + f17);
        android.graphics.Paint paint = this.f150900p;
        float f27 = this.f150897m;
        canvas.drawRoundRect(rectF, f27, f27, paint);
        android.graphics.Paint paint2 = this.f150902r;
        boolean z17 = this.f150895h;
        if (z17) {
            canvas.drawCircle(width2, height2, j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 3.0f, paint2);
        }
        float f28 = this.f150898n;
        float width3 = z17 ? ((this.progress * (getWidth() - (f28 * f18))) / f18) + width2 : ((getWidth() - (f18 * f28)) * this.progress) + f28;
        if (!z17) {
            rectF.set(0.0f, f19, width3, f17 + f19);
        } else if (this.progress > 0.0f) {
            rectF.set(width2, f19, width3, f17 + f19);
        } else {
            rectF.set(width3, f19, width2, f17 + f19);
        }
        canvas.drawRoundRect(rectF, f27, f27, paint2);
        canvas.drawCircle(width3, height2, f28, this.f150901q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r1 > 1.0f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        m47185x3ae760af(r0);
        invalidate();
        r1 = ((java.util.ArrayList) r8.onProgressChangedCallback).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
    
        if (r1.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        r2 = (yz5.l) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        if (r5 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r2.mo146xb9724478(java.lang.Float.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        r4 = a06.d.b(r0 * r3) / r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r1 > 1.0f) goto L52;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        if (z17 == isEnabled()) {
            return;
        }
        setAlpha(z17 ? 1.0f : 0.15f);
        super.setEnabled(z17);
    }

    /* renamed from: setOnProgressConfirmCallback */
    public final void m47183x1e95f617(yz5.l lVar) {
        this.onProgressConfirmCallback = lVar;
    }

    /* renamed from: setOnProgressStartChangeCallback */
    public final void m47184x5e3ea709(yz5.a aVar) {
        this.onProgressStartChangeCallback = aVar;
    }

    /* renamed from: setProgress */
    public final void m47185x3ae760af(float f17) {
        this.progress = f17;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10956x6271c3cc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.onProgressChangedCallback = new java.util.ArrayList();
        float f17 = j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 2.0f;
        this.f150896i = f17;
        float f18 = j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 2.0f;
        this.f150897m = f18;
        int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6i);
        int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.acj);
        float f19 = j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 6.0f;
        this.f150898n = f19;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.f150900p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        this.f150901q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setAntiAlias(true);
        this.f150902r = paint3;
        this.f150903s = new android.graphics.RectF();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ez0.l.f339347a, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f150895h = obtainStyledAttributes.getBoolean(0, this.f150895h);
        this.f150896i = obtainStyledAttributes.getDimension(5, f17);
        this.f150897m = obtainStyledAttributes.getDimension(4, f18);
        int color3 = obtainStyledAttributes.getColor(3, color);
        int color4 = obtainStyledAttributes.getColor(2, color2);
        int color5 = obtainStyledAttributes.getColor(6, -1);
        this.f150898n = obtainStyledAttributes.getDimension(7, f19);
        this.f150899o = obtainStyledAttributes.getInteger(1, this.f150899o);
        obtainStyledAttributes.recycle();
        paint.setColor(color3);
        paint2.setColor(color5);
        paint3.setColor(color4);
    }
}
