package tf;

/* loaded from: classes7.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final tf.k0 f500355a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f500356b;

    public i0(android.os.Handler handler, tf.k0 k0Var) {
        super(handler.getLooper());
        this.f500356b = handler;
        this.f500355a = k0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f500356b.handleMessage(message);
        tf.k0 k0Var = this.f500355a;
        synchronized (k0Var) {
            java.util.Iterator it = ((java.util.ArrayList) k0Var.f500368b).iterator();
            while (it.hasNext()) {
                tf.j0 j0Var = (tf.j0) it.next();
                android.os.Handler handler = j0Var.f500364b;
                if (handler == null) {
                    j0Var.f500363a.onFrameAvailable(k0Var.f500367a);
                } else {
                    handler.post(new tf.h0(k0Var, j0Var));
                }
            }
        }
    }
}
