package f4;

/* loaded from: classes15.dex */
public class o extends f4.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f4.i jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view, window);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jankStats, "jankStats");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
    }

    @Override // f4.n
    public long d(android.view.FrameMetrics frameMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMetrics, "frameMetrics");
        return frameMetrics.getMetric(10);
    }
}
