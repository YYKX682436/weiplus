package ga3;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351399d;

    public s(ga3.v vVar) {
        this.f351399d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f351399d.f351410c) {
            this.f351399d.a();
        }
    }
}
