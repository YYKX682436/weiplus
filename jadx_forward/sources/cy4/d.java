package cy4;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f306397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy4.e f306398e;

    public d(cy4.e eVar, android.app.Activity activity) {
        this.f306398e = eVar;
        this.f306397d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f306398e.f306409k = false;
        ((android.view.ViewGroup) this.f306397d.getWindow().getDecorView()).setSystemUiVisibility(5894);
    }
}
