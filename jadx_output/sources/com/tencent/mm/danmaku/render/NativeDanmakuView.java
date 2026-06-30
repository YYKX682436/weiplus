package com.tencent.mm.danmaku.render;

/* loaded from: classes10.dex */
public class NativeDanmakuView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public yp.k f64872d;

    /* renamed from: e, reason: collision with root package name */
    public wp.e f64873e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f64874f;

    public NativeDanmakuView(android.content.Context context) {
        super(context);
        this.f64873e = null;
        this.f64874f = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        wp.e eVar = this.f64873e;
        if (!((eVar == null || eVar.f448358a == null) ? false : true)) {
            super.dispatchDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        if (this.f64874f == null) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.f64874f = paint;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        wp.e eVar2 = this.f64873e;
        canvas.drawBitmap(eVar2.f448358a, eVar2.f448359b, eVar2.f448360c, this.f64874f);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yp.k kVar = this.f64872d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            if (lVar.f464384d) {
                yp.i iVar = lVar.f464385e;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            }
            yp.i iVar2 = lVar.f464385e;
            if (iVar2 != null) {
                iVar2.b();
                lVar.f464385e.c();
            }
            lVar.f464384d = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yp.k kVar = this.f64872d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            yp.i iVar = lVar.f464385e;
            if (iVar != null) {
                iVar.a();
            }
            lVar.f464384d = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        yp.k kVar = this.f64872d;
        if (kVar != null) {
            ((yp.l) kVar).getClass();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yp.k kVar = this.f64872d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            if (lVar.f464384d) {
                yp.i iVar = lVar.f464385e;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            }
            yp.i iVar2 = lVar.f464385e;
            if (iVar2 != null) {
                iVar2.b();
                lVar.f464385e.c();
            }
            lVar.f464384d = true;
        }
    }

    public void setDrawMask(wp.e eVar) {
        this.f64873e = eVar;
    }

    public NativeDanmakuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64873e = null;
        this.f64874f = null;
    }

    public NativeDanmakuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f64873e = null;
        this.f64874f = null;
    }
}
