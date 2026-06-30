package gi;

/* loaded from: classes12.dex */
public final class v0 extends rh.g {

    /* renamed from: k, reason: collision with root package name */
    public ri.k f353732k;

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.g, rh.a, rh.e3
    public void c() {
        super.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
    }

    @Override // rh.g, rh.a, rh.e3
    public void e() {
        super.e();
    }

    @Override // rh.g, rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        qh.w wVar = f0Var.f444868d.f444816b;
        if (wVar instanceof ri.k) {
            this.f353732k = (ri.k) wVar;
        }
    }

    @Override // rh.g, rh.a
    public java.lang.String i() {
        return "Matrix.battery.IpcPoolJiffies";
    }

    @Override // rh.g
    public void s(java.util.List list) {
        rh.o2 o2Var;
        ri.k kVar = this.f353732k;
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.listener", "#onIpcTraceOverHeat, size = " + list.size());
            if (list.isEmpty() || (o2Var = (rh.o2) list.get(0)) == null || ((java.lang.Long) ((rh.f) o2Var.f477019c).f476910g.f477085a).longValue() <= 0) {
                return;
            }
            qh.u uVar = new qh.u();
            uVar.i();
            uVar.f444920a.append((java.lang.Object) "| IpcPool Task Jiffies Tracing OverHeat");
            uVar.a("\n");
            gi.w0 w0Var = new gi.w0(kVar.f444921d, "overheat");
            ((java.util.HashMap) w0Var.f476858g).put(gi.v0.class, list);
            new ri.m().a(w0Var, uVar);
            uVar.f();
            uVar.d();
            new ri.n("overheat").a(w0Var);
        }
    }

    @Override // rh.g
    public boolean t(rh.o2 o2Var) {
        return super.t(o2Var);
    }
}
