package rh;

/* loaded from: classes12.dex */
public class k0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.l0 f476967a;

    public k0(rh.l0 l0Var) {
        this.f476967a = l0Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.l0 l0Var = this.f476967a;
        rh.o0 o0Var = l0Var.f476975b;
        java.util.Map map = o0Var.f477014c.f509214f;
        rh.j0 j0Var = new rh.j0(this, (rh.o2) obj);
        wh.n1 n1Var = l0Var.f476974a;
        rh.c1 c1Var = o0Var.f477015d;
        rh.b1 b1Var = o0Var.f477013b;
        b1Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        c1Var.u(rh.j1.class, new rh.z0(b1Var, c1Var, j0Var, n1Var, linkedHashMap));
        map.put("JiffyUid", linkedHashMap);
    }
}
