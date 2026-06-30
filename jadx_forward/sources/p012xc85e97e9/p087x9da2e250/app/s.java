package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 f93003d;

    public s(p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8) {
        this.f93003d = dialogInterfaceOnCancelListenerC1100xc25047d8;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog;
        android.app.Dialog dialog2;
        p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8 = this.f93003d;
        dialog = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
            dialogInterfaceOnCancelListenerC1100xc25047d8.onDismiss(dialog2);
        }
    }
}
