package w6;

/* loaded from: classes13.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f524619a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f524620b = new android.os.Handler(android.os.Looper.getMainLooper(), new w6.c1());

    public synchronized void a(w6.z0 z0Var) {
        if (this.f524619a) {
            this.f524620b.obtainMessage(1, z0Var).sendToTarget();
        } else {
            this.f524619a = true;
            z0Var.mo14474x408b7293();
            this.f524619a = false;
        }
    }
}
