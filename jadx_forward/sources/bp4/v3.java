package bp4;

/* loaded from: classes10.dex */
public final class v3 implements yo4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.z3 f104931a;

    public v3(bp4.z3 z3Var) {
        this.f104931a = z3Var;
    }

    @Override // yo4.b
    public void a(int i17) {
        bp4.z3 z3Var = this.f104931a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f104971g, "onSelected: " + i17);
        z3Var.f104980s = i17;
        yz5.l lVar = z3Var.f104982u;
        if (lVar != null) {
            ((bp4.u3) lVar).mo146xb9724478(z3Var.f104976o.get(i17));
        }
    }
}
