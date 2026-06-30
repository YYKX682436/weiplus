package ak4;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f5601e;

    public c(boolean z17, android.view.View view) {
        this.f5600d = z17;
        this.f5601e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f5600d;
        android.view.View view = this.f5601e;
        if (z17) {
            view.requestLayout();
        }
        view.invalidate();
    }
}
