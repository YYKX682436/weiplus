package ju5;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.z f383677d;

    public r(ju5.z zVar) {
        this.f383677d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f383677d.f383706h;
        if (dVar != null) {
            ((pe4.g) dVar).f435234a.f435241j = true;
        }
    }
}
