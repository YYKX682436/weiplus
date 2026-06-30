package zu3;

/* loaded from: classes10.dex */
public final class x extends android.view.View implements zu3.n, cw3.s {

    /* renamed from: d, reason: collision with root package name */
    public final cw3.a f557389d;

    /* renamed from: e, reason: collision with root package name */
    public zu3.f f557390e;

    /* renamed from: f, reason: collision with root package name */
    public final bw3.e f557391f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f557392g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f557393h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f557394i;

    /* renamed from: m, reason: collision with root package name */
    public zu3.y f557395m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f557396n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f557397o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bw3.e eVar = new bw3.e();
        this.f557391f = eVar;
        this.f557392g = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f557393h = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f557394i = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f557396n = true;
        this.f557397o = new float[2];
        eVar.f106461r = 0.5f;
        eVar.f106460q = 3.0f;
        android.content.res.Resources resources = getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.f557389d = new cw3.a(resources);
        paint.setColor(822083583);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // zu3.n
    public zu3.a g() {
        zu3.y yVar = this.f557395m;
        if (yVar != null) {
            yVar.f557296f.set(this.f557391f.f106450g);
        }
        return this.f557395m;
    }

    @Override // cw3.s
    /* renamed from: getContentBoundary */
    public float[] mo122946xf6c2c98d() {
        return (float[]) this.f557391f.f106457n.clone();
    }

    @Override // cw3.s
    /* renamed from: getDrawRect */
    public android.graphics.RectF mo122947x4a8ff6be() {
        float[] fArr = this.f557391f.f106457n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @Override // cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.f557395m;
    }

    /* renamed from: getSafeArea */
    public android.graphics.Rect m179589xe4fab330() {
        android.graphics.Rect rect = this.f557391f.f106451h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    /* renamed from: getTouchTracker */
    public final bw3.e m179590xbfb64d6f() {
        return this.f557391f;
    }

    @Override // cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305705n;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayRect, "displayRect");
        this.f557393h.set(displayRect);
        bw3.e eVar = this.f557391f;
        eVar.f106450g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
        zu3.y yVar = this.f557395m;
        if (yVar != null) {
            yVar.p(eVar.f106450g);
        }
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeRect, "safeRect");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.setMatrix(this.f557391f.f106450g);
        if (isActivated()) {
            this.f557389d.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        zu3.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f557391f;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                zu3.y yVar = this.f557395m;
                if (yVar != null) {
                    yVar.p(eVar.f106450g);
                }
                bringToFront();
                zu3.y yVar2 = this.f557395m;
                if (yVar2 != null && (rVar = yVar2.f557408q) != null) {
                    rVar.a();
                }
                zu3.f fVar = this.f557390e;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        int actionMasked2 = event.getActionMasked();
        float[] fArr = this.f557397o;
        if (actionMasked2 == 0) {
            fArr[0] = eVar.f106459p / 2.0f;
            fArr[1] = eVar.f106458o / 2.0f;
            eVar.f106450g.mapPoints(fArr);
        } else if (event.getActionMasked() == 1) {
            bw3.b bVar = new bw3.b();
            bVar.f106435c = eVar.f106461r;
            bVar.f106436d = eVar.f106460q;
            bVar.f106434b = new float[]{eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
            android.graphics.Rect rect = this.f557392g;
            bVar.f106433a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
            float[] fArr2 = {eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
            eVar.f106450g.mapPoints(fArr2);
            if (!bVar.f106433a.contains(fArr2[0], fArr2[1])) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                bVar.f106433a = new android.graphics.RectF(f17, f18, f17, f18);
            }
            bVar.a(eVar.f106450g, new zu3.w(this, event));
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.f557391f.f106450g);
        int width = this.f557393h.width();
        android.graphics.Rect rect = this.f557392g;
        matrix2.postTranslate((-(width - rect.width())) / 2.0f, (-(r1.height() - rect.height())) / 2.0f);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new av3.i(matrix2);
    }

    /* renamed from: setEditItem */
    public final void m179591xd60ae6bf(zu3.y pagItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagItem, "pagItem");
        this.f557395m = pagItem;
        bw3.e eVar = this.f557391f;
        android.graphics.Matrix matrix = eVar.f106450g;
        float f17 = pagItem.f557405n;
        matrix.postScale(f17, f17);
        int i17 = pagItem.f557401j;
        int i18 = pagItem.f557402k;
        this.f557389d.setBounds(0, 0, i17, i18);
        this.f557394i.set(0, 0, i17, i18);
        eVar.f106450g.postTranslate(eVar.f106459p / 2.0f, eVar.f106458o / 2.0f);
        eVar.f106459p = i17;
        eVar.f106458o = i18;
        zu3.y yVar = this.f557395m;
        float f18 = yVar != null ? yVar.f557405n : 1.0f;
        android.graphics.Rect rect = this.f557393h;
        float f19 = (rect.top + rect.bottom) / 2;
        android.graphics.Rect rect2 = this.f557392g;
        float f27 = i18;
        eVar.f106450g.postTranslate(((-i17) * f18) / 2.0f, -((f19 - ((rect2.top + rect2.bottom) / 2.0f)) + ((f18 * f27) / 2.0f)));
        float f28 = i17;
        eVar.f106455l = new float[]{0.0f, 0.0f, f28, 0.0f, 0.0f, f27, f28, f27};
        zu3.y yVar2 = this.f557395m;
        if (yVar2 != null) {
            yVar2.p(eVar.f106450g);
        }
    }

    /* renamed from: setStateResolve */
    public final void m179592xe2f7cd9d(zu3.f stateResolve) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateResolve, "stateResolve");
        this.f557390e = stateResolve;
    }

    @Override // cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.f557392g.set(validRect);
    }
}
