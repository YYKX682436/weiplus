package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.AppCompatDialogFragment */
/* loaded from: classes14.dex */
public class C0067xeeb05b7b extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 {
    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        return new p012xc85e97e9.p016x746ad0e3.app.i0(mo7438x76847179(), mo7395x75311c13());
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: setupDialog */
    public void mo2554x8b5a9225(android.app.Dialog dialog, int i17) {
        if (!(dialog instanceof p012xc85e97e9.p016x746ad0e3.app.i0)) {
            super.mo2554x8b5a9225(dialog, i17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.i0 i0Var = (p012xc85e97e9.p016x746ad0e3.app.i0) dialog;
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        i0Var.C(1);
    }
}
