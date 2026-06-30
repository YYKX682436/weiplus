package c4;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.l0 f119833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.k0 f119834e;

    public h0(c4.k0 k0Var, c4.l0 l0Var) {
        this.f119834e = k0Var;
        this.f119833d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.IBinder a17 = ((c4.m0) this.f119833d).a();
        c4.n nVar = (c4.n) this.f119834e.f119850a.f93238g.m174754xc84af884(a17);
        if (nVar != null) {
            a17.unlinkToDeath(nVar, 0);
        }
    }
}
