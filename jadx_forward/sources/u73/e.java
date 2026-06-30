package u73;

/* loaded from: classes9.dex */
public class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u73.g f506655d;

    public e(u73.g gVar) {
        this.f506655d = gVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f506655d.f506658e.f456127d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.wk4 wk4Var = (r45.wk4) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wk4Var.f470762d)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wk4Var.f470763e)) {
                    g4Var.f(i17, wk4Var.f470762d);
                } else {
                    g4Var.d(i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(wk4Var.f470763e, true), wk4Var.f470762d);
                }
                i17++;
            }
        }
    }
}
