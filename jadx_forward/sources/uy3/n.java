package uy3;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f513517d;

    public n(android.view.View view) {
        this.f513517d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f513517d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
