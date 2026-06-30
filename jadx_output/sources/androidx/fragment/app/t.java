package androidx.fragment.app;

/* loaded from: classes14.dex */
public class t implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.DialogFragment f11475d;

    public t(androidx.fragment.app.DialogFragment dialogFragment) {
        this.f11475d = dialogFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17;
        android.app.Dialog dialog;
        android.app.Dialog dialog2;
        android.app.Dialog dialog3;
        if (((androidx.lifecycle.y) obj) != null) {
            androidx.fragment.app.DialogFragment dialogFragment = this.f11475d;
            z17 = dialogFragment.mShowsDialog;
            if (z17) {
                android.view.View requireView = dialogFragment.requireView();
                if (requireView.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                }
                dialog = dialogFragment.mDialog;
                if (dialog != null) {
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                        dialog3 = dialogFragment.mDialog;
                        java.util.Objects.toString(dialog3);
                    }
                    dialog2 = dialogFragment.mDialog;
                    dialog2.setContentView(requireView);
                }
            }
        }
    }
}
