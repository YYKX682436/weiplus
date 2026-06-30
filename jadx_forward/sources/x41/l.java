package x41;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f533313d;

    public l(android.view.View view) {
        this.f533313d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f533313d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
