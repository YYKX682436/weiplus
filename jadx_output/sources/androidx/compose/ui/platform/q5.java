package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.q5 f10724a = new androidx.compose.ui.platform.q5();

    public final void a(androidx.compose.ui.platform.AndroidComposeView ownerView) {
        kotlin.jvm.internal.o.g(ownerView, "ownerView");
        android.view.ViewParent parent = ownerView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ownerView, ownerView);
        }
    }
}
