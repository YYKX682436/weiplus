package y91;

/* loaded from: classes16.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.x f541850d;

    public v(y91.x xVar, y91.u uVar) {
        this.f541850d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y91.x.b(this.f541850d);
        } catch (java.lang.Exception e17) {
            if (e17.getCause() != null) {
                int i17 = y91.x.f541852h;
                v91.b.a("x", e17.getCause().toString());
            }
        }
    }
}
