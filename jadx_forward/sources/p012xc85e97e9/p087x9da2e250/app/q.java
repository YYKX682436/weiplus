package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 f92983d;

    public q(p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8) {
        this.f92983d = dialogInterfaceOnCancelListenerC1100xc25047d8;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.DialogInterface.OnDismissListener onDismissListener;
        android.app.Dialog dialog;
        p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8 = this.f92983d;
        onDismissListener = dialogInterfaceOnCancelListenerC1100xc25047d8.f3397x2e958892;
        dialog = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
        onDismissListener.onDismiss(dialog);
    }
}
