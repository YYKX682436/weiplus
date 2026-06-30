package cy4;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f306395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cy4.e f306396e;

    public c(cy4.e eVar, android.app.Activity activity) {
        this.f306396e = eVar;
        this.f306395d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f306395d.getWindow().getDecorView();
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-5895));
        this.f306396e.f306409k = true;
    }
}
