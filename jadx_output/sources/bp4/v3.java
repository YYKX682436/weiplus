package bp4;

/* loaded from: classes10.dex */
public final class v3 implements yo4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.z3 f23398a;

    public v3(bp4.z3 z3Var) {
        this.f23398a = z3Var;
    }

    @Override // yo4.b
    public void a(int i17) {
        bp4.z3 z3Var = this.f23398a;
        com.tencent.mars.xlog.Log.i(z3Var.f23438g, "onSelected: " + i17);
        z3Var.f23447s = i17;
        yz5.l lVar = z3Var.f23449u;
        if (lVar != null) {
            ((bp4.u3) lVar).invoke(z3Var.f23443o.get(i17));
        }
    }
}
