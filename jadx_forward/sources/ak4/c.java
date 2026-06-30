package ak4;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87134e;

    public c(boolean z17, android.view.View view) {
        this.f87133d = z17;
        this.f87134e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f87133d;
        android.view.View view = this.f87134e;
        if (z17) {
            view.requestLayout();
        }
        view.invalidate();
    }
}
