package com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196;

/* renamed from: com.tencent.mm.danmaku.render.NativeDanmakuView */
/* loaded from: classes10.dex */
public class C10429x362d5b9d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public yp.k f146405d;

    /* renamed from: e, reason: collision with root package name */
    public wp.e f146406e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f146407f;

    public C10429x362d5b9d(android.content.Context context) {
        super(context);
        this.f146406e = null;
        this.f146407f = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        wp.e eVar = this.f146406e;
        if (!((eVar == null || eVar.f529891a == null) ? false : true)) {
            super.dispatchDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        if (this.f146407f == null) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.f146407f = paint;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        wp.e eVar2 = this.f146406e;
        canvas.drawBitmap(eVar2.f529891a, eVar2.f529892b, eVar2.f529893c, this.f146407f);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yp.k kVar = this.f146405d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            if (lVar.f545917d) {
                yp.i iVar = lVar.f545918e;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            }
            yp.i iVar2 = lVar.f545918e;
            if (iVar2 != null) {
                iVar2.b();
                lVar.f545918e.c();
            }
            lVar.f545917d = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yp.k kVar = this.f146405d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            yp.i iVar = lVar.f545918e;
            if (iVar != null) {
                iVar.a();
            }
            lVar.f545917d = false;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        yp.k kVar = this.f146405d;
        if (kVar != null) {
            ((yp.l) kVar).getClass();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yp.k kVar = this.f146405d;
        if (kVar != null) {
            yp.l lVar = (yp.l) kVar;
            if (lVar.f545917d) {
                yp.i iVar = lVar.f545918e;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            }
            yp.i iVar2 = lVar.f545918e;
            if (iVar2 != null) {
                iVar2.b();
                lVar.f545918e.c();
            }
            lVar.f545917d = true;
        }
    }

    /* renamed from: setDrawMask */
    public void m43628x454604d2(wp.e eVar) {
        this.f146406e = eVar;
    }

    public C10429x362d5b9d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146406e = null;
        this.f146407f = null;
    }

    public C10429x362d5b9d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f146406e = null;
        this.f146407f = null;
    }
}
