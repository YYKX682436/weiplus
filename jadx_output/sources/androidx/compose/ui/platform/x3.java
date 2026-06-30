package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.x3 f10814a = new androidx.compose.ui.platform.x3();

    public final int a(android.view.RenderNode renderNode) {
        kotlin.jvm.internal.o.g(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(android.view.RenderNode renderNode) {
        kotlin.jvm.internal.o.g(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(android.view.RenderNode renderNode, int i17) {
        kotlin.jvm.internal.o.g(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i17);
    }

    public final void d(android.view.RenderNode renderNode, int i17) {
        kotlin.jvm.internal.o.g(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i17);
    }
}
