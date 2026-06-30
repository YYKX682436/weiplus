package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class t implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 f93008d;

    public t(p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8) {
        this.f93008d = dialogInterfaceOnCancelListenerC1100xc25047d8;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17;
        android.app.Dialog dialog;
        android.app.Dialog dialog2;
        android.app.Dialog dialog3;
        if (((p012xc85e97e9.p093xedfae76a.y) obj) != null) {
            p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 dialogInterfaceOnCancelListenerC1100xc25047d8 = this.f93008d;
            z17 = dialogInterfaceOnCancelListenerC1100xc25047d8.f3399x9b62d751;
            if (z17) {
                android.view.View m7554x159e75aa = dialogInterfaceOnCancelListenerC1100xc25047d8.m7554x159e75aa();
                if (m7554x159e75aa.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                }
                dialog = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
                if (dialog != null) {
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                        dialog3 = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
                        java.util.Objects.toString(dialog3);
                    }
                    dialog2 = dialogInterfaceOnCancelListenerC1100xc25047d8.f3390x62415;
                    dialog2.setContentView(m7554x159e75aa);
                }
            }
        }
    }
}
