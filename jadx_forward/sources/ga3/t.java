package ga3;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351400d;

    public t(ga3.v vVar) {
        this.f351400d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f351400d.f351410c) {
            this.f351400d.b();
        }
    }
}
