package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.f10663d = androidComposeView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17 = ((l1.a) obj).f314969a;
        boolean z17 = false;
        boolean z18 = i17 == 1;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10663d;
        if (z18) {
            z17 = androidComposeView.isInTouchMode();
        } else {
            if (i17 == 2) {
                z17 = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
