package zu3;

/* loaded from: classes10.dex */
public abstract class c extends android.view.View implements zu3.n, cw3.s {
    public final float[] A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public final cw3.a f557305d;

    /* renamed from: e, reason: collision with root package name */
    public zu3.f f557306e;

    /* renamed from: f, reason: collision with root package name */
    public final bw3.e f557307f;

    /* renamed from: g, reason: collision with root package name */
    public final int f557308g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f557309h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f557310i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f557311m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f557312n;

    /* renamed from: o, reason: collision with root package name */
    public float f557313o;

    /* renamed from: p, reason: collision with root package name */
    public int f557314p;

    /* renamed from: q, reason: collision with root package name */
    public int f557315q;

    /* renamed from: r, reason: collision with root package name */
    public int f557316r;

    /* renamed from: s, reason: collision with root package name */
    public zu3.s f557317s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.e f557318t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f557319u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Matrix f557320v;

    /* renamed from: w, reason: collision with root package name */
    public float f557321w;

    /* renamed from: x, reason: collision with root package name */
    public float f557322x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f557323y;

    /* renamed from: z, reason: collision with root package name */
    public final int f557324z;

    public c(android.content.Context context) {
        super(context);
        bw3.e eVar = new bw3.e();
        this.f557307f = eVar;
        this.f557308g = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f557309h = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f557310i = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f557311m = paint;
        this.f557313o = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561874v2);
        this.f557318t = zu3.e.f557329e;
        this.A = new float[2];
        eVar.f106461r = 0.5f;
        eVar.f106460q = 3.0f;
        android.content.res.Resources resources = getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.f557305d = new cw3.a(resources);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        this.f557324z = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        paint.setAntiAlias(true);
        this.B = true;
    }

    public zu3.a g() {
        if (this.f557319u == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(this.f557307f.f106450g);
        zu3.e eVar = this.f557318t;
        if (eVar == zu3.e.f557329e || eVar == zu3.e.f557332h) {
            return new zu3.a0(this.f557312n, this.f557314p, this.f557315q, this.f557316r, matrix);
        }
        zu3.s sVar = this.f557317s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar);
        java.lang.String str = sVar.f557359g;
        zu3.s sVar2 = this.f557317s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar2);
        java.lang.String str2 = sVar2.f557360h;
        zu3.s sVar3 = this.f557317s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar3);
        float f17 = sVar3.f557361i;
        zu3.s sVar4 = this.f557317s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar4);
        return new zu3.s(str, str2, f17, sVar4.f557362j, matrix);
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m179493x12501425() {
        return this.f557319u;
    }

    /* renamed from: getColor */
    public final int m179494x7444d5ad() {
        return this.f557314p;
    }

    @Override // cw3.s
    /* renamed from: getContentBoundary */
    public float[] mo122946xf6c2c98d() {
        return (float[]) this.f557307f.f106457n.clone();
    }

    /* renamed from: getDisplayRect */
    public final android.graphics.Rect m179495x4003fc90() {
        return this.f557310i;
    }

    @Override // cw3.s
    /* renamed from: getDrawRect */
    public android.graphics.RectF mo122947x4a8ff6be() {
        float[] fArr = this.f557307f.f106457n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    /* renamed from: getEditorData */
    public abstract /* synthetic */ zu3.a mo122948x9174bead();

    /* renamed from: getEnableNotify */
    public final boolean m179496xf394cd22() {
        return this.B;
    }

    /* renamed from: getLocation */
    public final zu3.s m179497xed29dd2b() {
        return this.f557317s;
    }

    /* renamed from: getMarginBottom */
    public final int m179498x4fb623ef() {
        return this.f557316r;
    }

    /* renamed from: getNavigateBarHeight */
    public final int m179499xe24e0ff3() {
        return this.f557308g;
    }

    /* renamed from: getSafeArea */
    public android.graphics.Rect m179500xe4fab330() {
        android.graphics.Rect rect = this.f557307f.f106451h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    /* renamed from: getSourceDataType */
    public final zu3.e m179501x7f55c35() {
        return this.f557318t;
    }

    /* renamed from: getText */
    public final java.lang.CharSequence m179502xfb85ada3() {
        return this.f557312n;
    }

    /* renamed from: getTextBg */
    public final int m179503x30d0d948() {
        return this.f557315q;
    }

    /* renamed from: getTextSize */
    public final float m179504x40077844() {
        return this.f557313o;
    }

    /* renamed from: getTouchDownX */
    public final float m179505x8d9107ed() {
        return this.f557321w;
    }

    /* renamed from: getTouchDownY */
    public final float m179506x8d9107ee() {
        return this.f557322x;
    }

    /* renamed from: getTouchMoved */
    public final boolean m179507x8e0fd6aa() {
        return this.f557323y;
    }

    /* renamed from: getTouchSlop */
    public final int m179508x151bf723() {
        return this.f557324z;
    }

    /* renamed from: getTouchTracker */
    public final bw3.e m179509xbfb64d6f() {
        return this.f557307f;
    }

    /* renamed from: getType */
    public abstract /* synthetic */ cw3.j mo122949xfb85f7b0();

    /* renamed from: getValidRect */
    public final android.graphics.Rect m179510xbd40714a() {
        return this.f557309h;
    }

    /* renamed from: getViewMatrix */
    public final android.graphics.Matrix m179511x73fb26bc() {
        return this.f557320v;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayRect, "displayRect");
        this.f557310i.set(displayRect);
        this.f557307f.f106450g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f557307f;
        eVar.f106451h = safeRect;
        eVar.f106452i = i65.a.b(getContext(), i17);
    }

    @Override // cw3.s
    public boolean o() {
        return this.B;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        android.graphics.Matrix matrix = this.f557320v;
        bw3.e eVar = this.f557307f;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(eVar.f106450g);
        }
        if (isActivated()) {
            this.f557305d.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f557309h);
        canvas.save();
        android.graphics.Matrix matrix2 = this.f557320v;
        if (matrix2 != null) {
            canvas.setMatrix(matrix2);
        } else {
            canvas.setMatrix(eVar.f106450g);
        }
        android.graphics.Bitmap bitmap = this.f557319u;
        if (bitmap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f557311m);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f557307f;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                bringToFront();
                zu3.f fVar = this.f557306e;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        if (z17) {
            int actionMasked2 = event.getActionMasked();
            float[] fArr = this.A;
            if (actionMasked2 == 0) {
                this.f557321w = event.getX();
                this.f557322x = event.getY();
                this.f557323y = false;
                fArr[0] = eVar.f106459p / 2.0f;
                fArr[1] = eVar.f106458o / 2.0f;
                eVar.f106450g.mapPoints(fArr);
            } else if (actionMasked2 == 1) {
                bw3.b bVar = new bw3.b();
                bVar.f106435c = eVar.f106461r;
                bVar.f106436d = eVar.f106460q;
                bVar.f106434b = new float[]{eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
                android.graphics.Rect rect = this.f557309h;
                bVar.f106433a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
                float[] fArr2 = {eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
                eVar.f106450g.mapPoints(fArr2);
                if (!bVar.f106433a.contains(fArr2[0], fArr2[1])) {
                    float f17 = fArr[0];
                    float f18 = fArr[1];
                    bVar.f106433a = new android.graphics.RectF(f17, f18, f17, f18);
                }
                bVar.a(eVar.f106450g, new zu3.b(this, event));
            } else if (actionMasked2 == 2) {
                float max = java.lang.Math.max(java.lang.Math.abs(event.getX() - this.f557321w), java.lang.Math.abs(event.getY() - this.f557322x));
                if (!this.f557323y) {
                    this.f557323y = max > ((float) this.f557324z);
                }
            }
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        if (this.f557319u == null) {
            return null;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.f557307f.f106450g);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new av3.c(this.f557319u, matrix2);
    }

    /* renamed from: setBitmap */
    public final void m179512x5854831(android.graphics.Bitmap bitmap) {
        this.f557319u = bitmap;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            bw3.e eVar = this.f557307f;
            eVar.f106459p = width;
            eVar.f106458o = bitmap.getHeight();
            eVar.f106450g.preTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
            this.f557305d.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            eVar.getClass();
            eVar.f106455l = new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, 0.0f, bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight()};
        }
    }

    /* renamed from: setColor */
    public final void m179513x52d2f021(int i17) {
        this.f557314p = i17;
    }

    /* renamed from: setEnableNotify */
    public final void m179514x29ddc82e(boolean z17) {
        this.B = z17;
    }

    /* renamed from: setLocation */
    public final void m179515xe7e23e37(zu3.s sVar) {
        this.f557317s = sVar;
    }

    /* renamed from: setMarginBottom */
    public final void m179516x85ff1efb(int i17) {
        this.f557316r = i17;
    }

    /* renamed from: setSourceDataType */
    public final void m179517xcfebc441(zu3.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.f557318t = eVar;
    }

    /* renamed from: setStateResolve */
    public final void m179518xe2f7cd9d(zu3.f stateResolve) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateResolve, "stateResolve");
        this.f557306e = stateResolve;
    }

    /* renamed from: setText */
    public final void m179519x765074af(java.lang.CharSequence charSequence) {
        this.f557312n = charSequence;
    }

    /* renamed from: setTextBg */
    public final void m179520x24060d54(int i17) {
        this.f557315q = i17;
    }

    /* renamed from: setTextSize */
    public final void m179521x3abfd950(float f17) {
        this.f557313o = f17;
    }

    /* renamed from: setTouchDownX */
    public final void m179522xbbb555f9(float f17) {
        this.f557321w = f17;
    }

    /* renamed from: setTouchDownY */
    public final void m179523xbbb555fa(float f17) {
        this.f557322x = f17;
    }

    /* renamed from: setTouchMoved */
    public final void m179524xbc3424b6(boolean z17) {
        this.f557323y = z17;
    }

    @Override // cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.f557309h.set(validRect);
    }

    /* renamed from: setViewMatrix */
    public final void m179525xa21f74c8(android.graphics.Matrix matrix) {
        this.f557320v = matrix;
        if (matrix != null) {
            bw3.e eVar = this.f557307f;
            eVar.getClass();
            eVar.f106450g = matrix;
            android.graphics.Canvas canvas = new android.graphics.Canvas();
            canvas.save();
            if (this.f557320v != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.f557305d.draw(canvas);
            }
            android.graphics.Bitmap bitmap = this.f557319u;
            if (bitmap != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
        }
    }
}
