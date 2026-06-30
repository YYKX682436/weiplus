package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.FlutterViewDelegate */
/* loaded from: classes14.dex */
public class C28555x71171166 {
    /* renamed from: getCaptionBarInsets */
    public java.util.List<android.graphics.Rect> m137294x29b34119(android.content.Context context) {
        android.view.WindowInsets m137295xd1b697c = m137295xd1b697c(context);
        return m137295xd1b697c == null ? java.util.Collections.emptyList() : m137295xd1b697c.getBoundingRects(android.view.WindowInsets.Type.captionBar());
    }

    /* renamed from: getWindowInsets */
    public android.view.WindowInsets m137295xd1b697c(android.content.Context context) {
        android.view.Window window;
        android.app.Activity m139426x19263085 = io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139426x19263085(context);
        if (m139426x19263085 == null || (window = m139426x19263085.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    /* renamed from: growViewportMetricsToCaptionBar */
    public void m137296x54eae6f2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics) {
        m137294x29b34119(context);
        viewportMetrics.f71262xab8f1409 = viewportMetrics.f71262xab8f1409;
    }
}
