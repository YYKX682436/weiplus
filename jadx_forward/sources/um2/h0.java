package um2;

/* loaded from: classes2.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510350d;

    public h0(android.view.View view) {
        this.f510350d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f510350d.animate().alpha(1.0f).setDuration(500L).start();
    }
}
