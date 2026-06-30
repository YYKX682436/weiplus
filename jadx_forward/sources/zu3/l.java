package zu3;

/* loaded from: classes10.dex */
public final class l extends com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 implements zu3.n, cw3.s {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f557347r;

    /* renamed from: s, reason: collision with root package name */
    public final bw3.e f557348s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.f f557349t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f557350u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f557351v;

    /* renamed from: w, reason: collision with root package name */
    public final cw3.a f557352w;

    /* renamed from: x, reason: collision with root package name */
    public zu3.j f557353x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f557354y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f557355z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f557347r = "MicroMsg.EmojiItemView";
        bw3.e eVar = new bw3.e();
        this.f557348s = eVar;
        this.f557350u = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f557351v = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);
        this.f557355z = new float[2];
        eVar.f106461r = 0.5f;
        eVar.f106460q = 3.0f;
        android.content.res.Resources resources = getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.f557352w = new cw3.a(resources);
    }

    @Override // zu3.n
    public zu3.a g() {
        float f17;
        zu3.j jVar;
        bv3.d dVar;
        bv3.d dVar2;
        if (m43708x63ed375e() == null) {
            return null;
        }
        boolean z17 = getDrawable() instanceof android.graphics.drawable.BitmapDrawable;
        bw3.e eVar = this.f557348s;
        if (z17) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postConcat(eVar.f106450g);
            jVar = new zu3.j(m43708x63ed375e(), matrix, matrix);
            zu3.j jVar2 = this.f557353x;
            if (jVar2 != null && (dVar2 = jVar2.f557293c) != null) {
                jVar.f557293c.d(dVar2.c(), dVar2.b());
            }
            zu3.j jVar3 = this.f557353x;
            jVar.f557294d = jVar3 != null ? jVar3.f557294d : null;
        } else {
            if (getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
                android.graphics.drawable.Drawable drawable = getDrawable();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
                f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable).e();
            } else if (getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
                android.graphics.drawable.Drawable drawable2 = getDrawable();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
                f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable2).e();
            } else {
                f17 = 1.0f;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createEditorData displayRect:");
            sb6.append(this.f557351v);
            sb6.append(" validRect:");
            sb6.append(this.f557350u);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557347r, sb6.toString());
            matrix3.set(eVar.f106450g);
            matrix3.postTranslate((-(r6.width() - r7.width())) / 2.0f, -r7.top);
            matrix2.setScale(f17, f17);
            matrix2.postConcat(eVar.f106450g);
            jVar = new zu3.j(m43708x63ed375e(), matrix3, matrix2);
            zu3.j jVar4 = this.f557353x;
            if (jVar4 != null && (dVar = jVar4.f557293c) != null) {
                jVar.f557293c.d(dVar.c(), dVar.b());
            }
            zu3.j jVar5 = this.f557353x;
            jVar.f557294d = jVar5 != null ? jVar5.f557294d : null;
        }
        return jVar;
    }

    @Override // cw3.s
    /* renamed from: getContentBoundary */
    public float[] mo122946xf6c2c98d() {
        return (float[]) this.f557348s.f106457n.clone();
    }

    @Override // cw3.s
    /* renamed from: getDrawRect */
    public android.graphics.RectF mo122947x4a8ff6be() {
        float[] fArr = this.f557348s.f106457n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @Override // cw3.s
    /* renamed from: getEditorData */
    public zu3.a mo122948x9174bead() {
        return this.f557353x;
    }

    /* renamed from: getSafeArea */
    public android.graphics.Rect m179532xe4fab330() {
        android.graphics.Rect rect = this.f557348s.f106451h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    /* renamed from: getTouchTracker */
    public final bw3.e m179533xbfb64d6f() {
        return this.f557348s;
    }

    @Override // cw3.s
    /* renamed from: getType */
    public cw3.j mo122949xfb85f7b0() {
        return cw3.j.f305702h;
    }

    /* renamed from: getViewMatrix */
    public final android.graphics.Matrix m179534x73fb26bc() {
        return null;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayRect, "displayRect");
        this.f557351v.set(displayRect);
        this.f557348s.f106450g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f557348s;
        eVar.f106451h = safeRect;
        eVar.f106452i = i65.a.b(getContext(), i17);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        bw3.e eVar = this.f557348s;
        canvas.setMatrix(eVar.f106450g);
        if (isActivated()) {
            this.f557352w.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f557350u);
        canvas.save();
        canvas.setMatrix(eVar.f106450g);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f557348s;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                bringToFront();
                zu3.f fVar = this.f557349t;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        int actionMasked2 = event.getActionMasked();
        float[] fArr = this.f557355z;
        if (actionMasked2 == 0) {
            fArr[0] = eVar.f106459p / 2.0f;
            fArr[1] = eVar.f106458o / 2.0f;
            eVar.f106450g.mapPoints(fArr);
        } else if (event.getActionMasked() == 1) {
            bw3.b bVar = new bw3.b();
            bVar.f106435c = eVar.f106461r;
            bVar.f106436d = eVar.f106460q;
            bVar.f106434b = new float[]{eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
            android.graphics.Rect rect = this.f557350u;
            bVar.f106433a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
            float[] fArr2 = {eVar.f106459p / 2.0f, eVar.f106458o / 2.0f};
            eVar.f106450g.mapPoints(fArr2);
            if (!bVar.f106433a.contains(fArr2[0], fArr2[1])) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                bVar.f106433a = new android.graphics.RectF(f17, f18, f17, f18);
            }
            bVar.a(eVar.f106450g, new zu3.k(this, event));
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        float f17;
        if (m43708x63ed375e() == null) {
            return null;
        }
        boolean z17 = getDrawable() instanceof android.graphics.drawable.BitmapDrawable;
        bw3.e eVar = this.f557348s;
        if (z17) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.postConcat(eVar.f106450g);
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            return new av3.c(bitmap, matrix2);
        }
        if (getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable2).e();
        } else if (getDrawable() instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
            android.graphics.drawable.Drawable drawable3 = getDrawable();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(drawable3, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f17 = ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable3).e();
        } else {
            f17 = 1.0f;
        }
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557347r, "createEditorItem displayRect:" + this.f557351v + " validRect:" + this.f557350u);
        matrix3.setScale(f17, f17);
        matrix3.postConcat(eVar.f106450g);
        if (matrix != null) {
            matrix3.postConcat(matrix);
        }
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e = m43708x63ed375e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m43708x63ed375e);
        return new av3.e(m43708x63ed375e, matrix3);
    }

    /* renamed from: setEmojiItem */
    public final void m179535xc0410e37(zu3.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f557353x = item;
        m43712xc040f7d2(item.f557343g);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable).S, 0L);
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            boolean z17 = this.f557354y;
            bw3.e eVar = this.f557348s;
            if (!z17) {
                eVar.f106450g.postTranslate(eVar.f106459p / 2.0f, eVar.f106458o / 2.0f);
                eVar.f106459p = intrinsicWidth;
                eVar.f106458o = intrinsicHeight;
                android.graphics.Rect rect = this.f557351v;
                float f17 = (rect.top + rect.bottom) / 2;
                android.graphics.Rect rect2 = this.f557350u;
                eVar.f106450g.postTranslate((-intrinsicWidth) / 2.0f, -((f17 - ((rect2.top + rect2.bottom) / 2.0f)) + (intrinsicHeight / 2.0f)));
            }
            this.f557352w.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f18 = intrinsicWidth;
            float f19 = intrinsicHeight;
            eVar.getClass();
            eVar.f106455l = new float[]{0.0f, 0.0f, f18, 0.0f, 0.0f, f19, f18, f19};
        }
        super.setImageDrawable(drawable);
    }

    /* renamed from: setStateResolve */
    public final void m179536xe2f7cd9d(zu3.f stateResolve) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateResolve, "stateResolve");
        this.f557349t = stateResolve;
    }

    @Override // cw3.s
    /* renamed from: setValidArea */
    public void mo122950x198ca867(android.graphics.Rect validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.f557350u.set(validRect);
    }

    /* renamed from: setViewMatrix */
    public final void m179537xa21f74c8(android.graphics.Matrix matrix) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, matrix) || matrix == null) {
            return;
        }
        bw3.e eVar = this.f557348s;
        eVar.getClass();
        eVar.f106450g = matrix;
    }
}
