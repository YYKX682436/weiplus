package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FlashFlightConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/RectF;", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "setRectF", "(Landroid/graphics/RectF;)V", "rectF", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout */
/* loaded from: classes3.dex */
public final class C14421xa34c3be7 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.graphics.RectF rectF;

    /* renamed from: w, reason: collision with root package name */
    public cn2.e1 f199453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14421xa34c3be7(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        cn2.e1 e1Var = this.f199453w;
        if (e1Var != null) {
            android.graphics.RectF rectF = this.rectF;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
            if (e1Var.f125035e) {
                android.graphics.Bitmap bitmap = e1Var.f125036f;
                if (bitmap != null) {
                    canvas.save();
                    jz5.g gVar = e1Var.f125039i;
                    ((android.graphics.Path) ((jz5.n) gVar).mo141623x754a37bb()).reset();
                    float f17 = e1Var.f125037g / 2.0f;
                    android.graphics.Path path = (android.graphics.Path) ((jz5.n) gVar).mo141623x754a37bb();
                    float f18 = rectF.left - f17;
                    float f19 = rectF.top - f17;
                    float f27 = rectF.right + f17;
                    float f28 = rectF.bottom + f17;
                    float f29 = e1Var.f125041k;
                    path.addRoundRect(f18, f19, f27, f28, f29, f29, android.graphics.Path.Direction.CW);
                    canvas.clipPath((android.graphics.Path) ((jz5.n) gVar).mo141623x754a37bb());
                    jz5.g gVar2 = e1Var.f125040j;
                    ((android.graphics.Matrix) ((jz5.n) gVar2).mo141623x754a37bb()).reset();
                    float f37 = e1Var.f125038h;
                    android.view.View view = e1Var.f125031a;
                    float width = ((-bitmap.getWidth()) / 2.0f) + (f37 * view.getWidth());
                    float height = ((-bitmap.getHeight()) / 2.0f) + (e1Var.f125038h * view.getHeight());
                    ((android.graphics.Matrix) ((jz5.n) gVar2).mo141623x754a37bb()).postRotate(36.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    ((android.graphics.Matrix) ((jz5.n) gVar2).mo141623x754a37bb()).postTranslate(width, height);
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setAntiAlias(true);
                    paint.setDither(true);
                    canvas.drawBitmap(bitmap, (android.graphics.Matrix) ((jz5.n) gVar2).mo141623x754a37bb(), paint);
                    canvas.restore();
                }
            } else if (zl2.q4.f555466a.E()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e1Var.f125032b, "onDraw END!");
            }
        }
        super.dispatchDraw(canvas);
    }

    public final android.graphics.RectF getRectF() {
        return this.rectF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cn2.e1 e1Var = this.f199453w;
        if (e1Var != null) {
            e1Var.b(2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlashFlightConstraintLayout", "onSizeChanged new:" + i17 + ',' + i18 + ",old:" + i19 + ',' + i27);
    }

    /* renamed from: setRectF */
    public final void m57978x53a1a3a0(android.graphics.RectF rectF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "<set-?>");
        this.rectF = rectF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14421xa34c3be7(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }
}
