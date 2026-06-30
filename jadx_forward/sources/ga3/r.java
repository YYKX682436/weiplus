package ga3;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351398d;

    public r(ga3.v vVar) {
        this.f351398d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f351398d.f351410c) {
            ga3.v.d(this.f351398d);
        }
    }
}
