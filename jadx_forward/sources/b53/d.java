package b53;

/* loaded from: classes8.dex */
public class d implements tx4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b53.f f99616a;

    public d(b53.f fVar) {
        this.f99616a = fVar;
    }

    @Override // tx4.e
    /* renamed from: onCreateMMMenu */
    public void mo9859xc459429a(db5.g4 g4Var) {
        b53.f fVar = this.f99616a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = fVar.f99618a;
        android.content.Context context = x0Var.f488143d;
        b53.c cVar = fVar.f99619b;
        for (r45.rk4 rk4Var : cVar.f99614a) {
            if (rk4Var == null) {
                g4Var.f(-1, "");
            } else {
                b53.a aVar = (b53.a) ((java.util.HashMap) cVar.f99615b).get(java.lang.Integer.valueOf(rk4Var.f466500g));
                if (aVar != null) {
                    aVar.a(context, x0Var, g4Var, rk4Var);
                }
            }
        }
    }
}
