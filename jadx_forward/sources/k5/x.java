package k5;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final k5.y f385702d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f385703e;

    public x(k5.y yVar, java.lang.String str) {
        this.f385702d = yVar;
        this.f385703e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f385702d.f385708d) {
            if (((k5.x) ((java.util.HashMap) this.f385702d.f385706b).remove(this.f385703e)) != null) {
                k5.w wVar = (k5.w) ((java.util.HashMap) this.f385702d.f385707c).remove(this.f385703e);
                if (wVar != null) {
                    a5.a0.c().a(d5.f.f308015p, java.lang.String.format("Exceeded time limits on execution for %s", this.f385703e), new java.lang.Throwable[0]);
                    ((d5.f) wVar).e();
                }
            } else {
                a5.a0.c().a("WrkTimerRunnable", java.lang.String.format("Timer with %s is already marked as complete.", this.f385703e), new java.lang.Throwable[0]);
            }
        }
    }
}
