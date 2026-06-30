package yv4;

/* loaded from: classes4.dex */
public final class k extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f547761d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.RectF f547762e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f547763f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f547764g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f547765h;

    /* renamed from: i, reason: collision with root package name */
    public float f547766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(yv4.f.f547754d);
        this.f547761d = jz5.h.b(yv4.e.f547753d);
        this.f547763f = jz5.h.b(new yv4.d(this));
        this.f547764g = jz5.h.b(new yv4.b(this));
        this.f547765h = jz5.h.b(new yv4.j(this));
    }

    public final void T6(boolean z17) {
        android.graphics.RectF rectF = this.f547762e;
        if (rectF != null) {
            float mo79182x97cbed21 = U6().mo79182x97cbed21();
            float mo79180x47e2bd2c = U6().mo79180x47e2bd2c();
            float width = U6().getWidth();
            float height = U6().getHeight();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleToSearchPreviewUIC", "onAdjust img:" + mo79182x97cbed21 + '|' + mo79180x47e2bd2c + " ; iv:" + width + '|' + height);
            float f17 = width / mo79182x97cbed21;
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
            e0Var.f391648d = ((height - this.f547766i) / ((float) 2)) - ((rectF.centerY() / mo79180x47e2bd2c) * (mo79180x47e2bd2c * f17));
            float f18 = rectF.left * f17;
            float f19 = rectF.top * f17;
            float f27 = e0Var.f391648d;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f18, f19 + f27, rectF.right * f17, (rectF.bottom * f17) + f27);
            float f28 = rectF2.top;
            if (f28 < 0.0f) {
                float f29 = -f28;
                rectF2.top = f28 + f29;
                rectF2.bottom += f29;
                e0Var.f391648d += f29;
            }
            float a17 = ym5.x.a(m80379x76847179(), 16.0f);
            rectF2.left = java.lang.Math.max(a17, rectF2.left);
            rectF2.top = java.lang.Math.max(a17, rectF2.top);
            rectF2.right = java.lang.Math.min(width - a17, rectF2.right);
            rectF2.bottom = java.lang.Math.min(height - a17, rectF2.bottom);
            jz5.g gVar = this.f547764g;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
                return;
            }
            if (z17) {
                float f37 = U6().mo45728xfdb07fbf().x;
                android.graphics.PointF mo45729x3ffd66 = U6().mo45729x3ffd66();
                float f38 = mo45729x3ffd66 != null ? mo45729x3ffd66.y : 0.0f;
                android.graphics.RectF f263222g = ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf) ((jz5.n) gVar).mo141623x754a37bb()).getF263222g();
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(250L);
                ofFloat.addUpdateListener(new yv4.a(this, f263222g, rectF2, f37, f17, f38, e0Var));
                ofFloat.start();
                return;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f U6 = U6();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(f17, f17);
            matrix.postTranslate(0.0f, e0Var.f391648d);
            U6.mo45742x548ba9bf(matrix);
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf c19221xe73e25bf = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf) ((jz5.n) gVar).mo141623x754a37bb();
            c19221xe73e25bf.getClass();
            c19221xe73e25bf.f263222g = rectF2;
            c19221xe73e25bf.postInvalidate();
        }
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f U6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) ((jz5.n) this.f547765h).mo141623x754a37bb();
    }
}
