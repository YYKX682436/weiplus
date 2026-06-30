package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/LightStartFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/graphics/RectF;", "d", "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "setRectF", "(Landroid/graphics/RectF;)V", "rectF", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout */
/* loaded from: classes3.dex */
public final class C14422x564c9a4b extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.graphics.RectF rectF;

    /* renamed from: e, reason: collision with root package name */
    public cn2.j1 f199455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14422x564c9a4b(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        cn2.j1 j1Var = this.f199455e;
        if (j1Var != null) {
            android.graphics.RectF rectF = this.rectF;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "rectF");
            if (j1Var.f125081c) {
                long c17 = c01.id.c();
                long j17 = j1Var.f125084f;
                long j18 = j17 != 0 ? c17 - j17 : 0L;
                j1Var.f125084f = c17;
                j1Var.f125083e += j18;
                android.graphics.Bitmap bitmap = j1Var.f125082d;
                if (bitmap != null) {
                    canvas.save();
                    float f17 = rectF.right - rectF.left;
                    int height = bitmap.getHeight() / 2;
                    float f18 = f17 / 2;
                    float width = bitmap.getWidth() / 2;
                    float f19 = 22;
                    float f27 = height;
                    j1Var.a(canvas, (rectF.left + f18) - width, (rectF.top + f19) - f27, 1.2f, 0.0f);
                    j1Var.a(canvas, ((rectF.left + f18) + 20) - width, (rectF.top + f19) - f27, 1.2f, 266.0f);
                    float f28 = 10;
                    float f29 = 8;
                    j1Var.a(canvas, ((rectF.left + f18) + 80) - width, ((rectF.bottom - f28) - f27) - f29, 1.2f, 532.0f);
                    j1Var.a(canvas, ((rectF.left + f18) + 100) - width, ((rectF.bottom - f28) - f27) - f29, 1.2f, 798.0f);
                    j1Var.a(canvas, (rectF.right - 14) - width, ((rectF.bottom - f28) - f27) - 12, 1.2f, 1064.0f);
                    canvas.restore();
                }
                j1Var.f125079a.postDelayed(new cn2.f1(j1Var), 100L);
            } else if (zl2.q4.f555466a.E()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j1Var.f125080b, "onDraw END!");
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
        cn2.j1 j1Var = this.f199455e;
        if (j1Var != null) {
            j1Var.b(2);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LightStartFrameLayout", "onSizeChanged new:" + i17 + ',' + i18 + ",old:" + i19 + ',' + i27);
    }

    /* renamed from: setRectF */
    public final void m57980x53a1a3a0(android.graphics.RectF rectF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "<set-?>");
        this.rectF = rectF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14422x564c9a4b(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
    }
}
