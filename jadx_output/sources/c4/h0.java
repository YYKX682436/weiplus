package c4;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f38300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f38301e;

    public h0(c4.k0 k0Var, c4.l0 l0Var) {
        this.f38301e = k0Var;
        this.f38300d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f38300d).a();
        c4.n nVar = (c4.n) this.f38301e.f38317a.f11705g.remove(a17);
        if (nVar != null) {
            a17.unlinkToDeath(nVar, 0);
        }
    }
}
