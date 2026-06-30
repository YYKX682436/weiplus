package androidx.fragment.app;

/* loaded from: classes14.dex */
public class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.DialogFragment f11470d;

    public s(androidx.fragment.app.DialogFragment dialogFragment) {
        this.f11470d = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog;
        android.app.Dialog dialog2;
        androidx.fragment.app.DialogFragment dialogFragment = this.f11470d;
        dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialog2 = dialogFragment.mDialog;
            dialogFragment.onDismiss(dialog2);
        }
    }
}
