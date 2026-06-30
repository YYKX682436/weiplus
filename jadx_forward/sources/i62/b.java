package i62;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f370471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370473f;

    public b(android.app.Activity activity, long j17, int i17) {
        this.f370471d = activity;
        this.f370472e = j17;
        this.f370473f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window;
        android.view.View decorView;
        android.app.Activity activity = this.f370471d;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new i62.a(this.f370472e, activity, this.f370473f));
    }
}
