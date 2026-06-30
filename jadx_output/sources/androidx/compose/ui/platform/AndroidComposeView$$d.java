package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final /* synthetic */ class AndroidComposeView$$d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f10488d;

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.Q1;
        androidx.compose.ui.platform.AndroidComposeView this$0 = this.f10488d;
        kotlin.jvm.internal.o.g(this$0, "this$0");
        this$0.K1 = false;
        android.view.MotionEvent motionEvent = this$0.E1;
        kotlin.jvm.internal.o.d(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        this$0.u(motionEvent);
    }
}
