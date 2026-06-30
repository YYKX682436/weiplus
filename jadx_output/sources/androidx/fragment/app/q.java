package androidx.fragment.app;

/* loaded from: classes14.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.DialogFragment f11450d;

    public q(androidx.fragment.app.DialogFragment dialogFragment) {
        this.f11450d = dialogFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.DialogInterface.OnDismissListener onDismissListener;
        android.app.Dialog dialog;
        androidx.fragment.app.DialogFragment dialogFragment = this.f11450d;
        onDismissListener = dialogFragment.mOnDismissListener;
        dialog = dialogFragment.mDialog;
        onDismissListener.onDismiss(dialog);
    }
}
