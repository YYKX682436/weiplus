package t23;

/* loaded from: classes10.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f496808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t23.v0 f496809e;

    public u0(t23.v0 v0Var, boolean z17) {
        this.f496809e = v0Var;
        this.f496808d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.i iVar = this.f496809e.f496813d;
        boolean z17 = this.f496808d;
        if (!iVar.f496714o) {
            iVar.f496716q.f496722d.remove(iVar.f496713n);
        }
        iVar.f496716q.f496722d.size();
        t23.j jVar = iVar.f496716q;
        jVar.f496720b++;
        jVar.i();
        if (z17) {
            iVar.f496716q.f496719a.d(iVar.f496706d, iVar.f496715p, 12288, iVar.f496710h, iVar.f496714o, iVar.f496711i, iVar.f496712m);
            iVar.f496715p = null;
        }
    }
}
