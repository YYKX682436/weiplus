package af1;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f86020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ af1.x f86021e;

    public l(af1.x xVar, long j17) {
        this.f86021e = xVar;
        this.f86020d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        af1.x xVar = this.f86021e;
        if (xVar.M()) {
            xVar.f86036r.mo146928xc9fc1b13(this.f86020d);
        }
    }
}
