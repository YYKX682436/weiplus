package jj2;

/* loaded from: classes10.dex */
public final class c extends jj2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, jj2.d data) {
        super(context, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // jj2.a
    public void a(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        float m141032xcee5cbf8 = m141032xcee5cbf8() - m141033x74f59ea8().getStrokeWidth();
        float f17 = 2;
        canvas.drawRoundRect(new android.graphics.RectF((m141035xa135536b() / f17) - m141032xcee5cbf8, (m141034x6ba62022() / f17) - m141032xcee5cbf8, (m141035xa135536b() / f17) + m141032xcee5cbf8, (m141034x6ba62022() / f17) + m141032xcee5cbf8), i65.a.a(getContext(), 6.0f), i65.a.a(getContext(), 6.0f), m141033x74f59ea8());
        canvas.restore();
    }
}
