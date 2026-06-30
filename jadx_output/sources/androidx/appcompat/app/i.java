package androidx.appcompat.app;

/* loaded from: classes7.dex */
public final class i extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f9151a;

    public i(android.content.DialogInterface dialogInterface) {
        this.f9151a = new java.lang.ref.WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) this.f9151a.get(), message.what);
        } else {
            if (i17 != 1) {
                return;
            }
            ((android.content.DialogInterface) message.obj).dismiss();
        }
    }
}
