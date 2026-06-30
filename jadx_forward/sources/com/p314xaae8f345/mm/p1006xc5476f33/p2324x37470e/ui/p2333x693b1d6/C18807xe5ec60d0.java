package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/FrameListView;", "Landroid/view/View;", "Lkp4/s0;", "thumbFetcherFactory", "Ljz5/f0;", "setThumbFetcherFactory", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "setThumbFetcherExtraData", "Lkp4/a;", "info", "setTrackInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.FrameListView */
/* loaded from: classes10.dex */
public final class C18807xe5ec60d0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f257534d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f257535e;

    /* renamed from: f, reason: collision with root package name */
    public kp4.a f257536f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f257537g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f257538h;

    /* renamed from: i, reason: collision with root package name */
    public float f257539i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f257540m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.RectF f257541n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Matrix f257542o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f257543p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f257544q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257545r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f257546s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Path f257547t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f257548u;

    /* renamed from: v, reason: collision with root package name */
    public final float f257549v;

    /* renamed from: w, reason: collision with root package name */
    public final float f257550w;

    /* renamed from: x, reason: collision with root package name */
    public rm5.k f257551x;

    /* renamed from: y, reason: collision with root package name */
    public kp4.s0 f257552y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Object f257553z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18807xe5ec60d0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f257534d = "MicroMsg.FrameListView";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257535e = paint;
        this.f257537g = new java.util.LinkedList();
        this.f257539i = 1.0f;
        this.f257540m = new android.graphics.Rect();
        this.f257541n = new android.graphics.RectF();
        this.f257542o = new android.graphics.Matrix();
        this.f257547t = new android.graphics.Path();
        this.f257548u = new android.graphics.RectF();
        this.f257549v = i65.a.b(context, 4);
        this.f257550w = i65.a.b(context, 4);
        this.f257552y = new kp4.b();
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
            kp4.a r1 = r6.f257536f
            r0.append(r1)
            java.lang.String r1 = ", thumbList.size:"
            r0.append(r1)
            java.util.LinkedList r1 = r6.f257537g
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r6.f257534d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r7.save()
            android.graphics.Path r0 = r6.f257547t
            r7.clipPath(r0)
            kp4.a r0 = r6.f257536f
            r2 = 0
            if (r0 == 0) goto L3e
            boolean r0 = r0.f392611h
            r3 = 1
            if (r0 != r3) goto L3e
            goto L3f
        L3e:
            r3 = r2
        L3f:
            android.graphics.Paint r0 = r6.f257535e
            r4 = 0
            if (r3 == 0) goto L55
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L7c
            android.graphics.Matrix r2 = r6.f257542o
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
            android.graphics.Rect r3 = r6.f257540m
            android.graphics.RectF r5 = r6.f257541n
            if (r2 == 0) goto L6f
            r7.drawBitmap(r2, r3, r5, r0)
            goto L76
        L6f:
            android.graphics.Bitmap r2 = r6.f257538h
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
            android.graphics.RectF r1 = r6.f257548u
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int defaultSize = android.view.View.getDefaultSize(getSuggestedMinimumHeight(), i18);
        android.graphics.RectF rectF = this.f257541n;
        float f17 = defaultSize;
        rectF.bottom = f17;
        int defaultSize2 = android.view.View.getDefaultSize(getSuggestedMinimumWidth(), i17);
        kp4.a aVar = this.f257536f;
        android.graphics.Rect rect = this.f257540m;
        if (aVar != null) {
            int i19 = aVar.f392604a;
            rect.right = i19;
            int i27 = aVar.f392605b;
            rect.bottom = i27;
            float f18 = (1.0f * f17) / i27;
            this.f257539i = f18;
            float f19 = f18 * i19;
            rectF.right = f19;
            defaultSize2 = (int) (f19 * aVar.f392609f);
        }
        if (aVar != null && aVar.f392611h) {
            android.graphics.Matrix matrix = this.f257542o;
            float f27 = rect.right;
            float f28 = rect.bottom;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "<this>");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.b(matrix, new android.graphics.RectF(0.0f, 0.0f, f27, f28), new android.graphics.RectF(0.0f, 0.0f, f17, f17));
            defaultSize2 = defaultSize;
        }
        boolean z17 = this.f257543p;
        float f29 = this.f257550w;
        android.graphics.RectF rectF2 = this.f257548u;
        if (z17) {
            rectF2.left = 0.0f;
        } else {
            rectF2.left = f29;
        }
        if (this.f257544q) {
            rectF2.right = defaultSize2;
        } else {
            rectF2.right = defaultSize2 - f29;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMeasure: ");
        sb6.append(this.f257543p);
        sb6.append(' ');
        sb6.append(this.f257544q);
        sb6.append(", ");
        sb6.append(defaultSize2);
        sb6.append(' ');
        sb6.append(defaultSize);
        sb6.append(", thumbScale:");
        sb6.append(this.f257539i);
        sb6.append(", trackInfo.width:");
        kp4.a aVar2 = this.f257536f;
        sb6.append(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f392604a) : null);
        sb6.append(", thumbDrawRect.right:");
        sb6.append(rectF.right);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257534d, sb6.toString());
        rectF2.bottom = f17;
        android.graphics.Path path = this.f257547t;
        path.reset();
        boolean z18 = this.f257545r;
        float f37 = this.f257549v;
        float f38 = z18 ? 0.0f : f37;
        float f39 = this.f257546s ? 0.0f : f37;
        path.addRoundRect(rectF2, new float[]{f38, f38, f39, f39, f39, f39, f38, f38}, android.graphics.Path.Direction.CW);
        setMeasuredDimension(defaultSize2, defaultSize);
    }

    /* renamed from: setThumbFetcherExtraData */
    public final void m72632x2d9e567(java.lang.Object obj) {
        this.f257553z = obj;
    }

    /* renamed from: setThumbFetcherFactory */
    public final void m72633x102fa5d7(kp4.s0 thumbFetcherFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFetcherFactory, "thumbFetcherFactory");
        this.f257552y = thumbFetcherFactory;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257534d, "clearThumb");
        this.f257537g.clear();
        this.f257538h = null;
        postInvalidate();
    }

    /* renamed from: setTrackInfo */
    public final void m72634x873c5e57(kp4.a info) {
        java.util.LinkedList<kp4.m> linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f257536f = info;
        java.util.LinkedList linkedList2 = this.f257537g;
        linkedList2.clear();
        kp4.a aVar = this.f257536f;
        if (aVar != null && (linkedList = aVar.f392610g) != null) {
            for (kp4.m mVar : linkedList) {
                linkedList2.add(null);
            }
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new kp4.v(this, null), 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18807xe5ec60d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
