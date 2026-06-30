package lz3;

/* loaded from: classes15.dex */
public final class f extends lz3.b {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f403908c;

    /* renamed from: d, reason: collision with root package name */
    public final int f403909d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f403910e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.PointF f403911f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PointF f403912g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f403913h;

    public f(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f403908c = context;
        this.f403909d = i17;
        this.f403910e = new android.graphics.Matrix();
        this.f403911f = new android.graphics.PointF();
        this.f403912g = new android.graphics.PointF();
    }

    @Override // lz3.e
    public void a(lz3.c animationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationInfo, "animationInfo");
        if (!this.f403913h && (this.f403898a instanceof db5.f0)) {
            lz3.d dVar = animationInfo.f403905f;
            android.graphics.PointF pointF = dVar.f403906a;
            lz3.d dVar2 = animationInfo.f403904e;
            pointF.set(dVar2.f403906a);
            dVar.f403907b.set(dVar2.f403907b);
            android.view.KeyEvent.Callback callback = this.f403898a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            android.graphics.PointF mo45728xfdb07fbf = ((db5.f0) callback).mo45728xfdb07fbf();
            if (mo45728xfdb07fbf != null) {
                dVar2.f403906a.set(mo45728xfdb07fbf);
            }
            android.view.KeyEvent.Callback callback2 = this.f403898a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            android.graphics.PointF mo45729x3ffd66 = ((db5.f0) callback2).mo45729x3ffd66();
            if (mo45729x3ffd66 != null) {
                dVar2.f403907b.set(mo45729x3ffd66);
            }
            this.f403899b = animationInfo;
            this.f403913h = true;
            android.graphics.PointF pointF2 = dVar2.f403906a;
            android.graphics.PointF pointF3 = dVar2.f403907b;
            android.graphics.PointF pointF4 = dVar.f403906a;
            android.graphics.PointF pointF5 = dVar.f403907b;
        }
    }

    @Override // lz3.e
    public void b(float f17) {
        f(f17);
    }

    @Override // lz3.e
    public void c(float f17) {
        f(f17);
    }

    @Override // lz3.e
    public boolean d() {
        if (this.f403909d == 1) {
            return !(this.f403908c.getResources().getConfiguration().orientation == 2);
        }
        return false;
    }

    @Override // lz3.b, lz3.e
    public void e(lz3.c animationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationInfo, "animationInfo");
        super.e(animationInfo);
        this.f403913h = false;
    }

    public final void f(float f17) {
        lz3.c cVar = this.f403899b;
        if (cVar == null) {
            return;
        }
        android.graphics.PointF pointF = this.f403911f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        android.graphics.PointF pointF2 = cVar.f403904e.f403906a;
        lz3.c cVar2 = this.f403899b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
        android.graphics.PointF pointF3 = cVar2.f403905f.f403906a;
        float f18 = pointF2.x;
        float f19 = pointF2.y;
        float f27 = pointF3.x;
        float f28 = pointF3.y;
        if (!(f18 == f27)) {
            f18 += (f27 - f18) * f17;
        }
        if (!(f19 == f27)) {
            f19 += (f28 - f19) * f17;
        }
        pointF.x = f18;
        pointF.y = f19;
        android.graphics.PointF pointF4 = this.f403912g;
        lz3.c cVar3 = this.f403899b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
        android.graphics.PointF pointF5 = cVar3.f403904e.f403907b;
        lz3.c cVar4 = this.f403899b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar4);
        android.graphics.PointF pointF6 = cVar4.f403905f.f403907b;
        float f29 = pointF5.x;
        float f37 = pointF5.y;
        float f38 = pointF6.x;
        float f39 = pointF6.y;
        if (!(f29 == f38)) {
            f29 += (f38 - f29) * f17;
        }
        if (!(f37 == f39)) {
            f37 += f17 * (f39 - f37);
        }
        pointF4.x = f29;
        pointF4.y = f37;
        android.graphics.Matrix matrix = this.f403910e;
        matrix.reset();
        matrix.setScale(pointF.x, pointF.y);
        matrix.postTranslate(pointF4.x, pointF4.y);
        android.view.KeyEvent.Callback callback = this.f403898a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
        ((db5.f0) callback).mo45742x548ba9bf(matrix);
    }
}
