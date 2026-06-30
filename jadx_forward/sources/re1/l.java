package re1;

/* loaded from: classes13.dex */
public class l extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ConditionVariable f475879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re1.m f475880e;

    public l(re1.m mVar, android.os.ConditionVariable conditionVariable) {
        this.f475880e = mVar;
        this.f475879d = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f475880e) {
            this.f475879d.open();
            re1.m.a(this.f475880e);
        }
    }
}
