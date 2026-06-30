package s9;

/* loaded from: classes13.dex */
public class q extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ConditionVariable f486505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s9.r f486506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s9.r rVar, java.lang.String str, android.os.ConditionVariable conditionVariable) {
        super(str);
        this.f486506e = rVar;
        this.f486505d = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f486506e) {
            this.f486505d.open();
            try {
                s9.r.l(this.f486506e);
            } catch (s9.a e17) {
                this.f486506e.f486513g = e17;
            }
            this.f486506e.f486508b.getClass();
        }
    }
}
