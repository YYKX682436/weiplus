package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* renamed from: com.tencent.mm.plugin.scanner.view.MultiRectView */
/* loaded from: classes3.dex */
public class C17342x67de96e2 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f241401d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f241402e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f241403f;

    public C17342x67de96e2(android.content.Context context) {
        super(context);
        new java.util.ArrayList();
        this.f241402e = new android.graphics.Paint();
        this.f241403f = new android.graphics.Paint();
        a();
    }

    public final void a() {
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f241402e;
        paint.setStyle(style);
        paint.setStrokeWidth(8.0f);
        paint.setColor(-65536);
        paint.setAntiAlias(true);
        this.f241403f.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.List list = this.f241401d;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (android.graphics.Rect rect : this.f241401d) {
            if (rect != null) {
                canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                canvas.drawRect(rect, this.f241402e);
                canvas.restore();
            }
        }
    }

    /* renamed from: setRect */
    public void m68904x764f8966(java.util.List<android.graphics.Rect> list) {
        this.f241401d = list;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiRectView", "setRect:" + list);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiRectView", "setRect:" + list.size());
        setVisibility(0);
        invalidate();
    }

    public C17342x67de96e2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new java.util.ArrayList();
        this.f241402e = new android.graphics.Paint();
        this.f241403f = new android.graphics.Paint();
        a();
    }

    public C17342x67de96e2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new java.util.ArrayList();
        this.f241402e = new android.graphics.Paint();
        this.f241403f = new android.graphics.Paint();
        a();
    }
}
