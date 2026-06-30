package um2;

/* loaded from: classes2.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f510358d;

    public i0(android.view.View view) {
        this.f510358d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f510358d;
        view.post(new um2.h0(view));
    }
}
