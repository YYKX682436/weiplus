package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class h4 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AbstractComposeView f10578d;

    public h4(androidx.compose.ui.platform.AbstractComposeView abstractComposeView) {
        this.f10578d = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        boolean z17;
        kotlin.jvm.internal.o.g(v17, "v");
        androidx.compose.ui.platform.AbstractComposeView abstractComposeView = this.f10578d;
        kotlin.jvm.internal.o.g(abstractComposeView, "<this>");
        java.util.Iterator it = q26.y.d(abstractComposeView.getParent(), n3.w1.f334433d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object obj = (android.view.ViewParent) it.next();
            if (obj instanceof android.view.View) {
                android.view.View view = (android.view.View) obj;
                kotlin.jvm.internal.o.g(view, "<this>");
                java.lang.Object tag = view.getTag(com.tencent.mm.R.id.hgw);
                java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            return;
        }
        n0.f1 f1Var = abstractComposeView.f10451f;
        if (f1Var != null) {
            ((androidx.compose.ui.platform.WrappedComposition) f1Var).dispose();
        }
        abstractComposeView.f10451f = null;
        abstractComposeView.requestLayout();
    }
}
