package u9;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f507319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f507320e;

    public q(u9.s sVar, android.view.Surface surface) {
        this.f507320e = sVar;
        this.f507319d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f507320e.f507324b.n(this.f507319d);
    }
}
