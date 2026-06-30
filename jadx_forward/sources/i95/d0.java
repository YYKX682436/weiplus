package i95;

/* loaded from: classes12.dex */
public class d0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f371321d;

    public d0(i95.e0 e0Var, android.view.View view) {
        this.f371321d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] onGlobalLayout called.");
        this.f371321d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (i95.n0.g()) {
            android.os.Handler handler = i95.n0.f371362m;
            handler.removeCallbacks(i95.n0.f371366q);
            java.lang.Runnable runnable = i95.n0.f371365p;
            handler.removeCallbacks(runnable);
            handler.postAtFrontOfQueue(runnable);
            i95.n0.f371350a.unregisterActivityLifecycleCallbacks(i95.n0.f371367r);
        }
    }
}
