package gl5;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354556d;

    public k(gl5.e0 e0Var) {
        this.f354556d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gl5.y yVar = this.f354556d.f354481f;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            yVar.f354643a.update();
        } else {
            yVar.getClass();
        }
    }
}
