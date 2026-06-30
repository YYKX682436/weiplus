package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$d */
/* loaded from: classes14.dex */
public final /* synthetic */ class RunnableC1063x255a955c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92021d;

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Class cls = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988.Q1;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 this$0 = this.f92021d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        this$0.K1 = false;
        android.view.MotionEvent motionEvent = this$0.E1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        this$0.u(motionEvent);
    }
}
