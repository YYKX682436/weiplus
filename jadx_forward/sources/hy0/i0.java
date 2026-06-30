package hy0;

/* loaded from: classes5.dex */
public final class i0 extends hy0.h0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f367385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hy0.y0 y0Var) {
        super(y0Var);
        this.f367385c = y0Var;
    }

    @Override // iy0.c
    public void a(android.graphics.Canvas canvas, hy0.z2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ex0.e eVar = context.f367579b.I;
        double m34345x1629663d = context.f367580c.f117810d.f117800s.m34345x1629663d(eVar.f338657b);
        int centerX = context.f367581d.centerX();
        android.graphics.RectF rectF = this.f367370a;
        android.graphics.RectF rectF2 = this.f367385c.f377249b;
        rectF.set((float) m34345x1629663d, rectF2.top, centerX, rectF2.bottom);
        hy0.y0 y0Var = this.f367371b;
        canvas.drawRoundRect(rectF, hy0.y0.b(y0Var), hy0.y0.b(y0Var), y0Var.f367558l);
        f(canvas, eVar.f338658c, null);
    }
}
