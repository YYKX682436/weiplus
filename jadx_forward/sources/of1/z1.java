package of1;

/* loaded from: classes8.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f426596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426597e;

    public z1(of1.m2 m2Var, java.util.Map map) {
        this.f426597e = m2Var;
        this.f426596d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426597e.f426508e;
        if (nVar != null) {
            nVar.q0(this.f426596d);
        }
    }
}
