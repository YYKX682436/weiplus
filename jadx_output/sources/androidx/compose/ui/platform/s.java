package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(0);
        this.f10739d = androidComposeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int actionMasked;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10739d;
        android.view.MotionEvent motionEvent = androidComposeView.E1;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            androidComposeView.F1 = android.os.SystemClock.uptimeMillis();
            androidComposeView.post(androidComposeView.I1);
        }
        return jz5.f0.f302826a;
    }
}
