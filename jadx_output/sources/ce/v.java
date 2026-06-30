package ce;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce.o f40726d;

    public v(ce.o oVar) {
        this.f40726d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ce.o oVar = this.f40726d;
        oVar.N();
        oVar.f40685f.setOnConfigurationChangedListener(null);
    }
}
