package af1;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ af1.x f4488e;

    public l(af1.x xVar, long j17) {
        this.f4488e = xVar;
        this.f4487d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        af1.x xVar = this.f4488e;
        if (xVar.M()) {
            xVar.f4503r.seekTo(this.f4487d);
        }
    }
}
