package rh;

/* loaded from: classes12.dex */
public class i0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.l0 f476954a;

    public i0(rh.l0 l0Var) {
        this.f476954a = l0Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        java.util.Map map = ((uh.g) o2Var.f477019c).f509214f;
        rh.l0 l0Var = this.f476954a;
        rh.o0 o0Var = l0Var.f476975b;
        rh.b1 b1Var = o0Var.f477013b;
        rh.h0 h0Var = new rh.h0(this, o2Var);
        wh.n1 n1Var = l0Var.f476974a;
        rh.c1 c1Var = o0Var.f477015d;
        b1Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        c1Var.u(rh.j1.class, new rh.z0(b1Var, c1Var, h0Var, n1Var, linkedHashMap));
        map.put("TimeUid", linkedHashMap);
    }
}
