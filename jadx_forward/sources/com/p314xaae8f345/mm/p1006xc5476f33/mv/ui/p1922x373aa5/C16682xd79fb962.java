package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/FrameListView2;", "Landroid/view/View;", "Lkp4/s0;", "thumbFetcherFactory", "Ljz5/f0;", "setThumbFetcherFactory", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "setThumbFetcherExtraData", "Lkp4/a;", "info", "setTrackInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.FrameListView2 */
/* loaded from: classes10.dex */
public final class C16682xd79fb962 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233130d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f233131e;

    /* renamed from: f, reason: collision with root package name */
    public kp4.a f233132f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f233133g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f233134h;

    /* renamed from: i, reason: collision with root package name */
    public float f233135i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f233136m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f233137n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Matrix f233138o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Path f233139p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.RectF f233140q;

    /* renamed from: r, reason: collision with root package name */
    public final float f233141r;

    /* renamed from: s, reason: collision with root package name */
    public final float f233142s;

    /* renamed from: t, reason: collision with root package name */
    public rm5.k f233143t;

    /* renamed from: u, reason: collision with root package name */
    public kp4.s0 f233144u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Object f233145v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16682xd79fb962(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f233130d = "MicroMsg.FrameListView";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f233131e = paint;
        this.f233133g = new java.util.LinkedList();
        this.f233135i = 1.0f;
        this.f233136m = new android.graphics.Rect();
        this.f233137n = new android.graphics.RectF();
        this.f233138o = new android.graphics.Matrix();
        this.f233139p = new android.graphics.Path();
        this.f233140q = new android.graphics.RectF();
        this.f233141r = i65.a.b(context, 4);
        this.f233142s = i65.a.b(context, 4);
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        this.f233144u = new kp4.b();
        paint.setColor(-65536);
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (r0.f392611h == true) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            super.onDraw(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onDraw, trackInfo:"
            r0.<init>(r1)
            kp4.a r1 = r6.f233132f
            r0.append(r1)
            java.lang.String r1 = ", thumbList.size:"
            r0.append(r1)
            java.util.LinkedList r1 = r6.f233133g
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r6.f233130d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r7.save()
            android.graphics.Path r0 = r6.f233139p
            r7.clipPath(r0)
            kp4.a r0 = r6.f233132f
            r2 = 0
            if (r0 == 0) goto L3e
            boolean r0 = r0.f392611h
            r3 = 1
            if (r0 != r3) goto L3e
            goto L3f
        L3e:
            r3 = r2
        L3f:
            android.graphics.Paint r0 = r6.f233131e
            r4 = 0
            if (r3 == 0) goto L55
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L7c
            android.graphics.Matrix r2 = r6.f233138o
            r7.concat(r2)
            r7.drawBitmap(r1, r4, r4, r0)
            goto L7c
        L55:
            java.util.Iterator r1 = r1.iterator()
        L59:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7c
            java.lang.Object r2 = r1.next()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            android.graphics.Rect r3 = r6.f233136m
            android.graphics.RectF r5 = r6.f233137n
            if (r2 == 0) goto L6f
            r7.drawBitmap(r2, r3, r5, r0)
            goto L76
        L6f:
            android.graphics.Bitmap r2 = r6.f233134h
            if (r2 == 0) goto L76
            r7.drawBitmap(r2, r3, r5, r0)
        L76:
            float r2 = r5.right
            r7.translate(r2, r4)
            goto L59
        L7c:
            r7.restore()
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 == 0) goto L99
            android.graphics.RectF r1 = r6.f233140q
            float r2 = r1.left
            int r2 = (int) r2
            float r3 = r1.top
            int r3 = (int) r3
            float r4 = r1.right
            int r4 = (int) r4
            float r1 = r1.bottom
            int r1 = (int) r1
            r0.setBounds(r2, r3, r4, r1)
            r0.draw(r7)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int defaultSize = android.view.View.getDefaultSize(getSuggestedMinimumHeight(), i18);
        android.graphics.RectF rectF = this.f233137n;
        float f17 = defaultSize;
        rectF.bottom = f17;
        int defaultSize2 = android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i17);
        kp4.a aVar = this.f233132f;
        android.graphics.Rect rect = this.f233136m;
        if (aVar != null) {
            int i19 = aVar.f392604a;
            rect.right = i19;
            int i27 = aVar.f392605b;
            rect.bottom = i27;
            float f18 = (1.0f * f17) / i27;
            this.f233135i = f18;
            float f19 = f18 * i19;
            rectF.right = f19;
            defaultSize2 = (int) (f19 * aVar.f392609f);
        }
        if (aVar != null && aVar.f392611h) {
            android.graphics.Matrix matrix = this.f233138o;
            float f27 = rect.right;
            float f28 = rect.bottom;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "<this>");
            android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, f27, f28);
            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, f17, f17);
            matrix.reset();
            float max = java.lang.Math.max(rectF3.height() / rectF2.height(), rectF3.width() / rectF2.width());
            matrix.postTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix.postScale(max, max);
            matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
            defaultSize2 = defaultSize;
        }
        android.graphics.RectF rectF4 = this.f233140q;
        float f29 = this.f233142s;
        rectF4.left = f29;
        rectF4.right = defaultSize2 - f29;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMeasure: false false, ");
        sb6.append(defaultSize2);
        sb6.append(' ');
        sb6.append(defaultSize);
        sb6.append(", thumbScale:");
        sb6.append(this.f233135i);
        sb6.append(", trackInfo.width:");
        kp4.a aVar2 = this.f233132f;
        sb6.append(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f392604a) : null);
        sb6.append(", thumbDrawRect.right:");
        sb6.append(rectF.right);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f233130d, sb6.toString());
        rectF4.bottom = f17;
        android.graphics.Path path = this.f233139p;
        path.reset();
        float f37 = this.f233141r;
        path.addRoundRect(rectF4, new float[]{f37, f37, f37, f37, f37, f37, f37, f37}, android.graphics.Path.Direction.CW);
        setMeasuredDimension(defaultSize2, defaultSize);
    }

    /* renamed from: setThumbFetcherExtraData */
    public final void m67301x2d9e567(java.lang.Object obj) {
        this.f233145v = obj;
    }

    /* renamed from: setThumbFetcherFactory */
    public final void m67302x102fa5d7(kp4.s0 thumbFetcherFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFetcherFactory, "thumbFetcherFactory");
        this.f233144u = thumbFetcherFactory;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f233130d, "clearThumb");
        this.f233133g.clear();
        this.f233134h = null;
        postInvalidate();
    }

    /* renamed from: setTrackInfo */
    public final void m67303x873c5e57(kp4.a info) {
        java.util.LinkedList<kp4.m> linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f233132f = info;
        java.util.LinkedList linkedList2 = this.f233133g;
        linkedList2.clear();
        kp4.a aVar = this.f233132f;
        if (aVar != null && (linkedList = aVar.f392610g) != null) {
            for (kp4.m mVar : linkedList) {
                linkedList2.add(null);
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p(this, null), 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16682xd79fb962(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
