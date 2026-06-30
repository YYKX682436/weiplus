package tu;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f503586d;

    public b(android.app.Dialog dialog) {
        this.f503586d = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f503586d.dismiss();
    }
}
