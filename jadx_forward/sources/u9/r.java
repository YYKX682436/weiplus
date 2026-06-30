package u9;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.f f507321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f507322e;

    public r(u9.s sVar, o8.f fVar) {
        this.f507322e = sVar;
        this.f507321d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f507321d) {
        }
        this.f507322e.f507324b.q(this.f507321d);
    }
}
