package androidx.appcompat.app;

/* loaded from: classes14.dex */
public class AppCompatDialogFragment extends androidx.fragment.app.DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new androidx.appcompat.app.i0(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(android.app.Dialog dialog, int i17) {
        if (!(dialog instanceof androidx.appcompat.app.i0)) {
            super.setupDialog(dialog, i17);
            return;
        }
        androidx.appcompat.app.i0 i0Var = (androidx.appcompat.app.i0) dialog;
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
