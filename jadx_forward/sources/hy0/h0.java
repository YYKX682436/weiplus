package hy0;

/* loaded from: classes5.dex */
public abstract class h0 implements iy0.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f367370a = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hy0.y0 f367371b;

    public h0(hy0.y0 y0Var) {
        this.f367371b = y0Var;
    }

    public final void f(android.graphics.Canvas canvas, float[] decibels, ex0.q qVar) {
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decibels, "decibels");
        hy0.y0 y0Var = this.f367371b;
        hy0.b3 b3Var = y0Var.f367556j;
        android.graphics.RectF borderRect = this.f367370a;
        b3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(borderRect, "borderRect");
        b3Var.f367328a.set(borderRect);
        hy0.b3 b3Var2 = y0Var.f367556j;
        b3Var2.getClass();
        float f18 = 0.0f;
        if (qVar != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = qVar.f338663f;
            f17 = (float) (c4183xefcb50b7.i0().m33987xd22e7c2d() / c4183xefcb50b7.p0().m33987xd22e7c2d());
        } else {
            f17 = 0.0f;
        }
        if (qVar != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b72 = qVar.f338663f;
            c4183xefcb50b72.getClass();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b72.D();
            if (D != null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.X(c4183xefcb50b72, D);
            }
            f18 = (float) (c4128x879fba0a.m33987xd22e7c2d() / c4183xefcb50b72.p0().m33987xd22e7c2d());
        }
        java.lang.Float g07 = kz5.z.g0(decibels);
        if (g07 != null) {
            b3Var2.f367331d = g07.floatValue();
            java.lang.Float i07 = kz5.z.i0(decibels);
            if (i07 != null) {
                b3Var2.f367332e = i07.floatValue();
                canvas.save();
                android.graphics.RectF rectF = b3Var2.f367328a;
                canvas.clipRect(rectF);
                float width = rectF.width() / ((1 - f17) - f18);
                float length = width / decibels.length;
                float f19 = rectF.bottom;
                float f27 = rectF.left - (width * f17);
                android.graphics.Path path = b3Var2.f367330c;
                path.reset();
                path.moveTo(f27, f19);
                for (float f28 : decibels) {
                    f27 += length;
                    float f29 = b3Var2.f367332e;
                    path.lineTo(f27, f19 - (((f28 - f29) / (b3Var2.f367331d - f29)) * (rectF.height() * 0.714f)));
                }
                path.lineTo(f27, f19);
                path.close();
                canvas.drawPath(path, b3Var2.f367329b);
                canvas.restore();
            }
        }
    }
}
