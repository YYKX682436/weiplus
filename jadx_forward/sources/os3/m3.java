package os3;

/* loaded from: classes8.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab f429684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.p3 f429685e;

    public m3(os3.p3 p3Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab c5728x615a84ab) {
        this.f429685e = p3Var;
        this.f429684d = c5728x615a84ab;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f429684d.f136051h.f89161a;
        os3.p3 p3Var = this.f429685e;
        if (!z17) {
            os3.o3 o3Var = p3Var.f429705d;
            if (o3Var != null) {
                o3Var.getClass();
                return;
            }
            return;
        }
        p3Var.getClass();
        if (java.lang.System.currentTimeMillis() - os3.p3.f429704f <= 600000 || !gm0.j1.b().m()) {
            return;
        }
        gm0.j1.d().g(new c01.ra(new os3.n3(p3Var), null));
    }
}
