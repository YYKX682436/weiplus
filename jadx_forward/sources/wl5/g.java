package wl5;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl5.x f528643d;

    public g(wl5.x xVar) {
        this.f528643d = xVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "onViewAttachedToWindow", new java.lang.Object[0]);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.p314xaae8f345.mm.ui.yk.a("SelectableTextHelper", "onViewDetachedFromWindow", new java.lang.Object[0]);
        this.f528643d.c();
    }
}
