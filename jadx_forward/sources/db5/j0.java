package db5;

/* loaded from: classes8.dex */
public class j0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f309932d;

    public j0(java.lang.ref.WeakReference weakReference) {
        this.f309932d = weakReference;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = (android.content.DialogInterface.OnCancelListener) this.f309932d.get();
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        db5.m9.a(false, null);
    }
}
