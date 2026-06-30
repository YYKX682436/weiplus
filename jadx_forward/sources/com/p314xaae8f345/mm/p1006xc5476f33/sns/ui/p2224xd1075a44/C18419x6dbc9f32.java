package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView */
/* loaded from: classes4.dex */
public class C18419x6dbc9f32 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f252410d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 f252411e;

    /* renamed from: f, reason: collision with root package name */
    public int f252412f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f252413g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f252414h;

    /* renamed from: i, reason: collision with root package name */
    public final s34.k0 f252415i;

    public C18419x6dbc9f32(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        ((java.util.ArrayList) this.f252410d).clear();
        postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public final java.util.List b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f252410d).iterator();
        while (it.hasNext()) {
            android.graphics.PointF pointF = (android.graphics.PointF) it.next();
            arrayList.add(new android.graphics.PointF(pointF.x, pointF.y));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return arrayList;
    }

    /* renamed from: getOnGestureListener */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 m71272x8b900488() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var = this.f252411e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return w2Var;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.List<android.graphics.PointF> list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        super.onDraw(canvas);
        s34.k0 k0Var = this.f252415i;
        if (k0Var != null && !a84.b0.b(k0Var.f484221a) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19899xf4ead4f4()) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("debugDrawSamplePoints", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(-16711936);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColor(-16711936);
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            if (k0Var != null && (list = k0Var.f484221a) != null) {
                for (android.graphics.PointF pointF : list) {
                    canvas.drawCircle(pointF.x, pointF.y, 10.0f, paint);
                    canvas.drawCircle(pointF.x, pointF.y, k0Var.f484222b, paint2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugDrawSamplePoints", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        }
        java.util.List list2 = this.f252410d;
        if (((java.util.ArrayList) list2).size() > 0) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).y);
            android.graphics.Paint paint3 = this.f252414h;
            canvas.drawCircle(((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).y, i65.a.b(getContext(), 8) / 2.0f, paint3);
            for (int i17 = 1; i17 < ((java.util.ArrayList) list2).size(); i17++) {
                path.lineTo(((android.graphics.PointF) ((java.util.ArrayList) list2).get(i17)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(i17)).y);
            }
            canvas.drawPath(path, this.f252413g);
            canvas.drawCircle(((android.graphics.PointF) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).y, i65.a.b(getContext(), 8) / 2.0f, paint3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.f252410d;
        if (actionMasked == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var = this.f252411e;
            if (w2Var != null) {
                w2Var.c();
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 2) {
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
            postInvalidate();
        } else if (motionEvent.getActionMasked() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDrawGestureViewView", "point count %d", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
            if (((java.util.ArrayList) list).size() < 6) {
                ((java.util.ArrayList) list).clear();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var2 = this.f252411e;
                if (w2Var2 != null) {
                    w2Var2.a();
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var3 = this.f252411e;
                if (w2Var3 != null) {
                    w2Var3.b(b());
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var4 = this.f252411e;
            if (w2Var4 != null) {
                w2Var4.b(b());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return true;
    }

    /* renamed from: setOnGestureListener */
    public void m71273x672610fc(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 w2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f252411e = w2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    /* renamed from: setPaintColor */
    public void m71274x4a93d7a7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f252412f = i17;
        this.f252413g.setColor(i17);
        this.f252414h.setColor(this.f252412f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public C18419x6dbc9f32(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252410d = new java.util.ArrayList();
        this.f252412f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f252413g = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f252414h = paint2;
        this.f252415i = new s34.k0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        paint.setColor(this.f252412f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i65.a.b(getContext(), 8));
        paint.setPathEffect(new android.graphics.CornerPathEffect(i65.a.b(getContext(), 4)));
        paint.setAntiAlias(true);
        paint2.setColor(this.f252412f);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        if (fp.h.a(21)) {
            setLayerType(1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }
}
