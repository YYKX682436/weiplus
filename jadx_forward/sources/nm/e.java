package nm;

/* loaded from: classes12.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nm.i f419964e;

    public e(nm.i iVar, android.view.View view) {
        this.f419964e = iVar;
        this.f419963d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] onGlobalLayout called.");
        this.f419963d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        synchronized (this.f419964e.f419972c) {
            nm.i iVar = this.f419964e;
            nm.h hVar = iVar.f419970a;
            android.app.Application application = iVar.f419972c[0];
            hVar.getClass();
            application.unregisterActivityLifecycleCallbacks(hVar);
            hVar.f419968e.f419971b.removeCallbacks(hVar);
        }
        this.f419964e.f419971b.a();
    }
}
