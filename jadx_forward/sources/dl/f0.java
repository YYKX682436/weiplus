package dl;

/* loaded from: classes10.dex */
public final class f0 extends dl.y {
    public static final /* synthetic */ int W = 0;
    public boolean Q;
    public boolean T;
    public final android.graphics.Paint V;
    public final java.lang.String P = "MicroMsg.StickerArtist";
    public final ok.i R = new ok.i(this);
    public final float[] S = new float[8];
    public final java.util.List U = new java.util.ArrayList(2);

    public f0() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        paint2.setStrokeWidth(3.0f);
        this.V = paint2;
    }

    @Override // dl.y
    public float[] H() {
        return this.Q ? new float[]{this.f316574c.width() * 0.5f, this.f316574c.height() * 0.5f} : super.H();
    }

    @Override // dl.y
    public boolean K(xk0.f fVar, android.view.MotionEvent motionEvent, android.graphics.Rect rect, float f17) {
        if (fVar == null || !fVar.s() || rect == null || motionEvent == null) {
            return false;
        }
        motionEvent.getRawY();
        motionEvent.getPointerCount();
        return this.T && this.f316690v && motionEvent.getPointerCount() == 1 && ((float) rect.top) <= motionEvent.getRawY();
    }

    @Override // dl.y
    public xk0.f L(android.content.Context context, android.graphics.Matrix matrix, java.lang.String id6, android.graphics.Rect layerRect, android.graphics.Rect maxInteractRect, android.text.SpannableString spannableString, int i17, int i18, java.lang.String font) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layerRect, "layerRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maxInteractRect, "maxInteractRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        return new xk0.o(context, matrix, id6, layerRect, maxInteractRect, spannableString, i17, i18, font, false, false);
    }

    @Override // dl.y
    public void R(xk0.f item, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.graphics.Rect rect = new android.graphics.Rect();
        item.r(rect, false);
        if (item.f536487i.contains(rect)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.P, "resetScaleOnUpdateTextItem: currentScale:" + item.f536490o + ", not safe");
        item.f536490o = f17;
    }

    @Override // dl.y, dl.b
    public dl.a m() {
        return dl.a.STICKER;
    }

    @Override // dl.y, dl.b
    public boolean x(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            xk0.f g17 = ((um.g) d()).g();
            if (g17 != null && g17.s() && (g17 instanceof yk0.a)) {
                a(event.getX(), event.getY());
                java.util.Iterator it = ((java.util.ArrayList) this.U).iterator();
                if (it.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                    throw null;
                }
            }
        } else if (actionMasked == 1) {
            boolean n17 = n();
            java.lang.String str = this.P;
            if (!n17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[ACTION_UP] is not alive!");
                return false;
            }
            if (d() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[getCache] is null!");
                return false;
            }
            ((um.g) d()).g();
        }
        return super.x(event);
    }

    @Override // dl.y, dl.b
    public void y(android.graphics.Canvas canvas) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        um.m d17 = d();
        um.t tVar = d17 instanceof um.t ? (um.t) d17 : null;
        if (tVar != null) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator it = tVar.e(true).iterator();
            while (it.hasNext()) {
                xk0.f fVar = (xk0.f) it.next();
                if ((fVar instanceof yk0.a) && ((yk0.a) fVar).F) {
                    linkedList.add(fVar);
                }
            }
        } else {
            linkedList = null;
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((yk0.a) it6.next()).i(canvas);
            }
        }
        super.y(canvas);
        um.g gVar = (um.g) d();
        xk0.f g17 = gVar != null ? gVar.g() : null;
        if (g17 instanceof yk0.a) {
            yk0.a aVar = (yk0.a) g17;
            if (!aVar.s()) {
                aVar.E = false;
                return;
            }
            float f17 = aVar.f536490o;
            float f18 = aVar.f536489n;
            float[] fArr = this.S;
            aVar.B(fArr, f17, f18);
            float f19 = fArr[0];
            float f27 = fArr[1];
            float f28 = fArr[2];
            float f29 = fArr[3];
            float f37 = fArr[4];
            float f38 = fArr[5];
            float f39 = fArr[6];
            float f47 = fArr[7];
            android.graphics.Paint paint = this.V;
            canvas.drawLine(f19, f27, f28, f29, paint);
            canvas.drawLine(f19, f27, f37, f38, paint);
            canvas.drawLine(f28, f29, f39, f47, paint);
            canvas.drawLine(f39, f47, f37, f38, paint);
            java.util.ArrayList arrayList = (java.util.ArrayList) this.U;
            if (arrayList.size() > 0) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
                throw null;
            }
            if (aVar.E) {
                return;
            }
            aVar.E = true;
        }
    }
}
