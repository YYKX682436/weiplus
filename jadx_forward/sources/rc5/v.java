package rc5;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.x f475727d;

    public v(rc5.x xVar) {
        this.f475727d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc5.m mVar;
        rc5.x xVar = this.f475727d;
        android.view.Window window = xVar.m158354x19263085().getWindow();
        xVar.getClass();
        if (window != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            if (window.getStatusBarColor() != 0) {
                xVar.B = window.getStatusBarColor();
                window.setStatusBarColor(0);
            }
            window.getDecorView().setBackgroundColor(0);
            java.lang.ref.WeakReference weakReference = xVar.A;
            if (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null) {
                return;
            }
            mVar.setBackgroundColor(0);
        }
    }
}
