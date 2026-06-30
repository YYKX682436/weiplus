package androidx.fragment.app;

/* loaded from: classes14.dex */
public class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.DialogFragment f11462d;

    public r(androidx.fragment.app.DialogFragment dialogFragment) {
        this.f11462d = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog;
        android.app.Dialog dialog2;
        androidx.fragment.app.DialogFragment dialogFragment = this.f11462d;
        dialog = dialogFragment.mDialog;
        if (dialog != null) {
            dialog2 = dialogFragment.mDialog;
            dialogFragment.onCancel(dialog2);
        }
    }
}
