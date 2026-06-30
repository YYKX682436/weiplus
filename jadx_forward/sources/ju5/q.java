package ju5;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.z f383674d;

    public q(ju5.z zVar) {
        this.f383674d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f383674d.f383706h;
        if (dVar != null) {
            ((pe4.g) dVar).f435234a.f435241j = true;
        }
    }
}
