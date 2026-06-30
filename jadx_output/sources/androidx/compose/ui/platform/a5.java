package androidx.compose.ui.platform;

/* loaded from: classes3.dex */
public final class a5 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f10510d;

    public a5(kotlinx.coroutines.r2 r2Var) {
        this.f10510d = r2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17.removeOnAttachStateChangeListener(this);
        kotlinx.coroutines.p2.a(this.f10510d, null, 1, null);
    }
}
