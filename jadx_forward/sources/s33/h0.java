package s33;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f484030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s33.i0 f484031e;

    public h0(s33.i0 i0Var, java.util.Map map) {
        this.f484031e = i0Var;
        this.f484030d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f484030d;
        if (map == null || !map.containsKey(this.f484031e.f484036a)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67();
        am.d2 d2Var = c5239x4881ea67.f135572g;
        d2Var.f87961a = 0;
        d2Var.f87963c = false;
        c5239x4881ea67.e();
        ku5.u0 u0Var = ku5.t0.f394148d;
        s33.g0 g0Var = new s33.g0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(g0Var, 200L, false);
    }
}
