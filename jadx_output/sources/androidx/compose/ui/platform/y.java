package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class y implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.x f10816d;

    public y(androidx.compose.ui.platform.x xVar) {
        this.f10816d = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        androidx.compose.ui.platform.x xVar = this.f10816d;
        xVar.f10790h.removeCallbacks(xVar.A);
    }
}
