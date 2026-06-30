package tf;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.j0 f500349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.k0 f500350e;

    public h0(tf.k0 k0Var, tf.j0 j0Var) {
        this.f500350e = k0Var;
        this.f500349d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f500349d.f500363a.onFrameAvailable(this.f500350e.f500367a);
    }
}
