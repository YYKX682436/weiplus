package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c;

/* renamed from: com.tencent.mm.ui.widget.happybubble.BubbleLayout */
/* loaded from: classes15.dex */
public class C22696x87b656f6 extends android.widget.FrameLayout {
    public int A;
    public ol5.g B;
    public final android.graphics.Region C;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f293620d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f293621e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f293622f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Path f293623g;

    /* renamed from: h, reason: collision with root package name */
    public ol5.f f293624h;

    /* renamed from: i, reason: collision with root package name */
    public int f293625i;

    /* renamed from: m, reason: collision with root package name */
    public int f293626m;

    /* renamed from: n, reason: collision with root package name */
    public int f293627n;

    /* renamed from: o, reason: collision with root package name */
    public int f293628o;

    /* renamed from: p, reason: collision with root package name */
    public int f293629p;

    /* renamed from: q, reason: collision with root package name */
    public int f293630q;

    /* renamed from: r, reason: collision with root package name */
    public int f293631r;

    /* renamed from: s, reason: collision with root package name */
    public int f293632s;

    /* renamed from: t, reason: collision with root package name */
    public int f293633t;

    /* renamed from: u, reason: collision with root package name */
    public int f293634u;

    /* renamed from: v, reason: collision with root package name */
    public int f293635v;

    /* renamed from: w, reason: collision with root package name */
    public int f293636w;

    /* renamed from: x, reason: collision with root package name */
    public int f293637x;

    /* renamed from: y, reason: collision with root package name */
    public int f293638y;

    /* renamed from: z, reason: collision with root package name */
    public int f293639z;

    public C22696x87b656f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        android.graphics.Paint paint = this.f293620d;
        paint.setPathEffect(new android.graphics.CornerPathEffect(this.f293639z));
        paint.setShadowLayer(this.f293636w, this.f293637x, this.f293638y, this.f293635v);
        int i17 = this.f293625i;
        ol5.f fVar = this.f293624h;
        this.f293628o = (fVar == ol5.f.LEFT ? this.f293634u : 0) + i17;
        this.f293629p = (fVar == ol5.f.TOP ? this.f293634u : 0) + i17;
        this.f293630q = (this.f293626m - i17) - (fVar == ol5.f.RIGHT ? this.f293634u : 0);
        this.f293631r = (this.f293627n - i17) - (fVar == ol5.f.BOTTOM ? this.f293634u : 0);
        paint.setColor(this.A);
        this.f293621e.setColor(this.A);
        android.graphics.Path path = this.f293622f;
        path.reset();
        android.graphics.Path path2 = this.f293623g;
        path2.reset();
        int i18 = this.f293632s;
        int i19 = this.f293634u;
        int i27 = i18 + i19;
        int i28 = this.f293631r;
        int i29 = i27 > i28 ? i28 - this.f293633t : i18;
        int i37 = this.f293625i;
        if (i29 <= i37) {
            i29 = i37;
        }
        int i38 = i19 + i18;
        int i39 = this.f293630q;
        if (i38 > i39) {
            i18 = i39 - this.f293633t;
        }
        if (i18 > i37) {
            i37 = i18;
        }
        int ordinal = this.f293624h.ordinal();
        if (ordinal == 0) {
            float f17 = i29;
            path.moveTo(this.f293628o, f17);
            path2.moveTo(this.f293628o, f17);
            path2.rLineTo(-this.f293634u, this.f293633t / 2);
            path2.rLineTo(this.f293634u, this.f293633t / 2);
            path2.lineTo(this.f293628o, f17);
            path.lineTo(this.f293628o, this.f293631r);
            path.lineTo(this.f293630q, this.f293631r);
            path.lineTo(this.f293630q, this.f293629p);
            path.lineTo(this.f293628o, this.f293629p);
        } else if (ordinal == 1) {
            float f18 = i37;
            path.moveTo(f18, this.f293629p);
            path2.moveTo(f18, this.f293629p);
            path2.rLineTo(this.f293633t / 2, -this.f293634u);
            path2.rLineTo(this.f293633t / 2, this.f293634u);
            path2.lineTo(f18, this.f293629p);
            path.lineTo(this.f293630q, this.f293629p);
            path.lineTo(this.f293630q, this.f293631r);
            path.lineTo(this.f293628o, this.f293631r);
            path.lineTo(this.f293628o, this.f293629p);
        } else if (ordinal == 2) {
            float f19 = i29;
            path.moveTo(this.f293630q, f19);
            path2.moveTo(this.f293630q, f19);
            path2.rLineTo(this.f293634u, this.f293633t / 2);
            path2.rLineTo(-this.f293634u, this.f293633t / 2);
            path2.lineTo(this.f293630q, f19);
            path.lineTo(this.f293630q, this.f293631r);
            path.lineTo(this.f293628o, this.f293631r);
            path.lineTo(this.f293628o, this.f293629p);
            path.lineTo(this.f293630q, this.f293629p);
        } else if (ordinal == 3) {
            float f27 = i37;
            path.moveTo(f27, this.f293631r);
            path2.moveTo(f27, this.f293631r);
            path2.rLineTo(this.f293633t / 2, this.f293634u);
            path2.rLineTo(this.f293633t / 2, -this.f293634u);
            path2.lineTo(f27, this.f293631r);
            path.lineTo(this.f293630q, this.f293631r);
            path.lineTo(this.f293630q, this.f293629p);
            path.lineTo(this.f293628o, this.f293629p);
            path.lineTo(this.f293628o, this.f293631r);
        }
        path.close();
        path2.close();
    }

    public void b() {
        int i17 = this.f293625i * 2;
        int ordinal = this.f293624h.ordinal();
        if (ordinal == 0) {
            setPadding(this.f293634u + i17, i17, i17, i17);
            return;
        }
        if (ordinal == 1) {
            setPadding(i17, this.f293634u + i17, i17, i17);
        } else if (ordinal == 2) {
            setPadding(i17, i17, this.f293634u + i17, i17);
        } else {
            if (ordinal != 3) {
                return;
            }
            setPadding(i17, i17, i17, this.f293634u + i17);
        }
    }

    /* renamed from: getBubbleColor */
    public int m81968x6b7c901() {
        return this.A;
    }

    /* renamed from: getBubblePadding */
    public int m81969xcf40e62f() {
        return this.f293625i;
    }

    /* renamed from: getBubbleRadius */
    public int m81970xe91106b4() {
        return this.f293639z;
    }

    /* renamed from: getLook */
    public ol5.f m81971xfb822f15() {
        return this.f293624h;
    }

    /* renamed from: getLookLength */
    public int m81972xf538f25b() {
        return this.f293634u;
    }

    /* renamed from: getLookPosition */
    public int m81973x43ed475e() {
        return this.f293632s;
    }

    /* renamed from: getLookWidth */
    public int m81974x425433b1() {
        return this.f293633t;
    }

    /* renamed from: getPaint */
    public android.graphics.Paint m81975x74f59ea8() {
        return this.f293620d;
    }

    /* renamed from: getPath */
    public android.graphics.Path m81976xfb83cc9b() {
        return this.f293622f;
    }

    /* renamed from: getShadowColor */
    public int m81977x7b14c0ed() {
        return this.f293635v;
    }

    /* renamed from: getShadowRadius */
    public int m81978x530c48() {
        return this.f293636w;
    }

    /* renamed from: getShadowX */
    public int m81979xb837e702() {
        return this.f293637x;
    }

    /* renamed from: getShadowY */
    public int m81980xb837e703() {
        return this.f293638y;
    }

    @Override // android.view.View
    public void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f293620d;
        paint.setPathEffect(new android.graphics.CornerPathEffect(this.f293639z));
        canvas.drawPath(this.f293622f, paint);
        paint.setPathEffect(null);
        canvas.drawPath(this.f293623g, this.f293621e);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.os.Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        this.f293632s = bundle.getInt("mLookPosition");
        this.f293633t = bundle.getInt("mLookWidth");
        this.f293634u = bundle.getInt("mLookLength");
        this.f293635v = bundle.getInt("mShadowColor");
        this.f293636w = bundle.getInt("mShadowRadius");
        this.f293637x = bundle.getInt("mShadowX");
        this.f293638y = bundle.getInt("mShadowY");
        this.f293639z = bundle.getInt("mBubbleRadius");
        this.f293626m = bundle.getInt("mWidth");
        this.f293627n = bundle.getInt("mHeight");
        this.f293628o = bundle.getInt("mLeft");
        this.f293629p = bundle.getInt("mTop");
        this.f293630q = bundle.getInt("mRight");
        this.f293631r = bundle.getInt("mBottom");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f293632s);
        bundle.putInt("mLookWidth", this.f293633t);
        bundle.putInt("mLookLength", this.f293634u);
        bundle.putInt("mShadowColor", this.f293635v);
        bundle.putInt("mShadowRadius", this.f293636w);
        bundle.putInt("mShadowX", this.f293637x);
        bundle.putInt("mShadowY", this.f293638y);
        bundle.putInt("mBubbleRadius", this.f293639z);
        bundle.putInt("mWidth", this.f293626m);
        bundle.putInt("mHeight", this.f293627n);
        bundle.putInt("mLeft", this.f293628o);
        bundle.putInt("mTop", this.f293629p);
        bundle.putInt("mRight", this.f293630q);
        bundle.putInt("mBottom", this.f293631r);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f293626m = i17;
        this.f293627n = i18;
        a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ol5.g gVar;
        if (motionEvent.getAction() == 0) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            android.graphics.Path path = this.f293622f;
            path.computeBounds(rectF, true);
            android.graphics.Region region = this.C;
            region.setPath(path, new android.graphics.Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (gVar = this.B) != null) {
                ol5.e eVar = ((ol5.c) gVar).f427747a;
                if (eVar.f427760n) {
                    eVar.dismiss();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void postInvalidate() {
        a();
        super.postInvalidate();
    }

    /* renamed from: setBubbleColor */
    public void m81981x9d1d3c75(int i17) {
        this.A = i17;
    }

    /* renamed from: setBubblePadding */
    public void m81982x62174ca3(int i17) {
        this.f293625i = i17;
    }

    /* renamed from: setBubbleRadius */
    public void m81983x1f5a01c0(int i17) {
        this.f293639z = i17;
    }

    /* renamed from: setLook */
    public void m81984x764cf621(ol5.f fVar) {
        this.f293624h = fVar;
        b();
    }

    /* renamed from: setLookLength */
    public void m81985x235d4067(int i17) {
        this.f293634u = i17;
        b();
    }

    /* renamed from: setLookPosition */
    public void m81986x7a36426a(int i17) {
        this.f293632s = i17;
    }

    /* renamed from: setLookWidth */
    public void m81987x9ea7f425(int i17) {
        this.f293633t = i17;
    }

    /* renamed from: setOnClickEdgeListener */
    public void m81988xcd64ff58(ol5.g gVar) {
        this.B = gVar;
    }

    /* renamed from: setShadowColor */
    public void m81989x117a3461(int i17) {
        this.f293635v = i17;
    }

    /* renamed from: setShadowRadius */
    public void m81990x369c0754(int i17) {
        this.f293636w = i17;
    }

    /* renamed from: setShadowX */
    public void m81991x2ba93476(int i17) {
        this.f293637x = i17;
    }

    /* renamed from: setShadowY */
    public void m81992x2ba93477(int i17) {
        this.f293638y = i17;
    }

    public C22696x87b656f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.C = new android.graphics.Region();
        setLayerType(1, null);
        setWillNotDraw(false);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528719d, i17, 0);
        int i18 = obtainStyledAttributes.getInt(3, 4);
        ol5.f fVar = ol5.f.BOTTOM;
        if (i18 == 1) {
            fVar = ol5.f.LEFT;
        } else if (i18 == 2) {
            fVar = ol5.f.TOP;
        } else if (i18 == 3) {
            fVar = ol5.f.RIGHT;
        }
        this.f293624h = fVar;
        this.f293632s = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f293633t = obtainStyledAttributes.getDimensionPixelOffset(6, i65.a.a(getContext(), 17.0f));
        this.f293634u = obtainStyledAttributes.getDimensionPixelOffset(4, i65.a.a(getContext(), 17.0f));
        this.f293636w = obtainStyledAttributes.getDimensionPixelOffset(8, i65.a.a(getContext(), 3.3f));
        this.f293637x = obtainStyledAttributes.getDimensionPixelOffset(9, i65.a.a(getContext(), 1.0f));
        this.f293638y = obtainStyledAttributes.getDimensionPixelOffset(10, i65.a.a(getContext(), 1.0f));
        this.f293639z = obtainStyledAttributes.getDimensionPixelOffset(2, i65.a.a(getContext(), 7.0f));
        this.f293625i = obtainStyledAttributes.getDimensionPixelOffset(1, i65.a.a(getContext(), 8.0f));
        this.f293635v = obtainStyledAttributes.getColor(7, -7829368);
        this.A = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.f293620d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(5);
        this.f293621e = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f293622f = new android.graphics.Path();
        this.f293623g = new android.graphics.Path();
        b();
    }
}
