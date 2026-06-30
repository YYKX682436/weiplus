package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0017R$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView;", "Landroid/widget/RelativeLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "", "value", "n", "I", "setBgColor", "(I)V", "bgColor", "Landroid/view/GestureDetector;", "q", "Ljz5/g;", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView */
/* loaded from: classes4.dex */
public final class GestureDetectorOnGestureListenerC18820x40894c4b extends android.widget.RelativeLayout implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f257622d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f257623e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f257624f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f257625g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f257626h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f257627i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.RectF f257628m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int bgColor;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f257630o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.PorterDuffXfermode f257631p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureDetectorOnGestureListenerC18820x40894c4b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257622d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f257623e = paint2;
        this.f257624f = new android.graphics.Path();
        this.f257625g = new android.graphics.RectF();
        this.f257627i = new android.graphics.RectF();
        this.f257628m = new android.graphics.RectF();
        this.bgColor = android.graphics.Color.parseColor("#bf232323");
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setDither(false);
        paint3.setColor(this.bgColor);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setFilterBitmap(true);
        this.f257630o = paint3;
        this.f257631p = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT);
        this.touchDetector = jz5.h.b(new qp4.a(this));
        setLayerType(1, null);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0s, (android.view.ViewGroup) this, true);
        setBackgroundColor(0);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(i65.a.b(getContext(), 2));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 1));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    /* renamed from: getTouchDetector */
    private final android.view.GestureDetector m72678x29d4686f() {
        return (android.view.GestureDetector) this.touchDetector.mo141623x754a37bb();
    }

    /* renamed from: setBgColor */
    private final void m72679xa5089f5c(int i17) {
        this.f257630o.setColor(i17);
        this.bgColor = i17;
    }

    public final void a() {
        android.graphics.Path path = this.f257624f;
        path.reset();
        for (int i17 = 1; i17 < 3; i17++) {
            android.graphics.RectF rectF = this.f257625g;
            float f17 = 3;
            float f18 = i17;
            path.moveTo(rectF.left + ((rectF.width() / f17) * f18), this.f257625g.top);
            android.graphics.RectF rectF2 = this.f257625g;
            path.lineTo(rectF2.left + ((rectF2.width() / f17) * f18), this.f257625g.bottom);
            android.graphics.RectF rectF3 = this.f257625g;
            path.moveTo(rectF3.left, rectF3.top + ((rectF3.height() / f17) * f18));
            android.graphics.RectF rectF4 = this.f257625g;
            path.lineTo(rectF4.right, rectF4.top + ((rectF4.height() / f17) * f18));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r0 = 0
            r3.f257626h = r0
            android.graphics.RectF r1 = r3.f257627i
            float r2 = r4.getX()
            float r4 = r4.getY()
            boolean r4 = r1.contains(r2, r4)
            r1 = 1
            if (r4 == 0) goto L1b
            r3.f257626h = r1
        L1b:
            boolean r4 = r3.f257626h
            if (r4 == 0) goto L50
            android.graphics.RectF r4 = r3.f257627i
            float r4 = r4.width()
            android.graphics.RectF r2 = r3.f257628m
            float r2 = r2.width()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r0
        L32:
            if (r4 == 0) goto L4c
            android.graphics.RectF r4 = r3.f257627i
            float r4 = r4.height()
            android.graphics.RectF r2 = r3.f257628m
            float r2 = r2.height()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L46
            r4 = r1
            goto L47
        L46:
            r4 = r0
        L47:
            if (r4 != 0) goto L4a
            goto L4c
        L4a:
            r4 = r0
            goto L4d
        L4c:
            r4 = r1
        L4d:
            if (r4 == 0) goto L50
            r0 = r1
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2337x373aa5.GestureDetectorOnGestureListenerC18820x40894c4b.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.drawColor(this.bgColor);
        android.graphics.PorterDuffXfermode porterDuffXfermode = this.f257631p;
        android.graphics.Paint paint = this.f257630o;
        paint.setXfermode(porterDuffXfermode);
        canvas.drawRect(this.f257627i, paint);
        paint.setXfermode(null);
        canvas.drawPath(this.f257624f, this.f257622d);
        canvas.drawRect(this.f257625g, this.f257623e);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent p17, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        java.util.Objects.toString(motionEvent);
        if (this.f257626h) {
            this.f257627i.offset(-f17, -f18);
            android.graphics.RectF rectF = this.f257627i;
            float f19 = rectF.top;
            float f27 = this.f257628m.top;
            if (f19 < f27) {
                rectF.offset(0.0f, f27 - f19);
            }
            android.graphics.RectF rectF2 = this.f257627i;
            float f28 = rectF2.bottom;
            float f29 = this.f257628m.bottom;
            if (f28 > f29) {
                rectF2.offset(0.0f, f29 - f28);
            }
            android.graphics.RectF rectF3 = this.f257627i;
            float f37 = rectF3.left;
            float f38 = this.f257628m.left;
            if (f37 < f38) {
                rectF3.offset(f38 - f37, 0.0f);
            }
            android.graphics.RectF rectF4 = this.f257627i;
            float f39 = rectF4.right;
            float f47 = this.f257628m.right;
            if (f39 > f47) {
                rectF4.offset(f47 - f39, 0.0f);
            }
            a();
        }
        postInvalidate();
        return this.f257626h;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        yj0.a.i(false, this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.f257626h = false;
        }
        android.view.GestureDetector m72678x29d4686f = m72678x29d4686f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(event);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m72678x29d4686f, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = m72678x29d4686f.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(m72678x29d4686f, onTouchEvent, "com/tencent/mm/plugin/vlog/ui/timelineeditor/view/TimelineEditorDragRectView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureDetectorOnGestureListenerC18820x40894c4b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257622d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f257623e = paint2;
        this.f257624f = new android.graphics.Path();
        this.f257625g = new android.graphics.RectF();
        this.f257627i = new android.graphics.RectF();
        this.f257628m = new android.graphics.RectF();
        this.bgColor = android.graphics.Color.parseColor("#bf232323");
        android.graphics.Paint paint3 = new android.graphics.Paint();
        paint3.setDither(false);
        paint3.setColor(this.bgColor);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setFilterBitmap(true);
        this.f257630o = paint3;
        this.f257631p = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT);
        this.touchDetector = jz5.h.b(new qp4.a(this));
        setLayerType(1, null);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0s, (android.view.ViewGroup) this, true);
        setBackgroundColor(0);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(i65.a.b(getContext(), 2));
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 1));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }
}
