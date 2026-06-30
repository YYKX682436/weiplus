package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10746d;

    public t(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        this.f10746d = androidComposeView;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10746d;
        androidComposeView.removeCallbacks(this);
        android.view.MotionEvent motionEvent = androidComposeView.E1;
        if (motionEvent != null) {
            boolean z17 = false;
            boolean z18 = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (!z18 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                z17 = true;
            }
            if (z17) {
                int i17 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i17 = 2;
                }
                androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this.f10746d;
                androidComposeView2.v(motionEvent, i17, androidComposeView2.F1, false);
            }
        }
    }
}
