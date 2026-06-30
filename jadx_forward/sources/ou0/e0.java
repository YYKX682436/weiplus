package ou0;

/* loaded from: classes5.dex */
public abstract class e0 {
    public static final void a(ex0.f fVar, gx0.bf playbackControlUIC, gx0.kh timelineUIC, android.util.SizeF videoContainerSizeF) {
        android.graphics.PointF pointF;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playbackControlUIC, "playbackControlUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineUIC, "timelineUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoContainerSizeF, "videoContainerSizeF");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db k76 = playbackControlUIC.k7();
        if (k76 == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = timelineUIC.o7();
        boolean z17 = false;
        if (o76 != null) {
            if (o76.q() >= 1.0d) {
                z17 = true;
            }
        }
        float width = videoContainerSizeF.getWidth();
        float height = videoContainerSizeF.getHeight();
        if (z17) {
            android.graphics.PointF v17 = fVar.v();
            pointF = new android.graphics.PointF(width * v17.x, height * v17.y);
        } else {
            android.graphics.PointF w17 = fVar.w();
            pointF = new android.graphics.PointF(width * w17.x, height * w17.y);
        }
        android.graphics.PointF m34135xeeb76d6a = k76.m34135xeeb76d6a(pointF);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34135xeeb76d6a, "calcRenderCoord(...)");
        fVar.r(m34135xeeb76d6a);
        fVar.t(z17 ? new android.graphics.PointF(0.865f, 0.865f) : new android.graphics.PointF(1.0f, 1.0f));
    }
}
