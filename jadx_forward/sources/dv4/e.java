package dv4;

/* loaded from: classes.dex */
public class e implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv4.f f325536d;

    public e(dv4.f fVar) {
        this.f325536d = fVar;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        dv4.j jVar;
        dv4.a aVar = (dv4.a) vVar.f432690b.f432603m;
        if (aVar == null || (jVar = (dv4.j) ((java.util.HashMap) this.f325536d.f325538b).remove(aVar)) == null) {
            return;
        }
        int i17 = vVar.f432691c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            aVar.a(java.util.Collections.emptyList());
        } else if (i17 == 0) {
            java.util.List list = vVar.f432693e;
            if (list == null || list.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMatchContact", "local contact search size 0");
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.k0) jVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var = k0Var.f263088d;
                q0Var.d(q0Var.f263135r, k0Var.f263085a, k0Var.f263086b, k0Var.f263087c);
                return;
            }
            aVar.a(vVar.f432693e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.k0 k0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.k0) jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var2 = k0Var2.f263088d;
        q0Var2.d(q0Var2.f263135r, k0Var2.f263085a, k0Var2.f263086b, k0Var2.f263087c);
    }
}
