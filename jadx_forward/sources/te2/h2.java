package te2;

/* loaded from: classes14.dex */
public final class h2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f499585a;

    public h2(te2.l2 l2Var) {
        this.f499585a = l2Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        te2.l2 l2Var = this.f499585a;
        java.lang.String str = l2Var.f499725e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        android.os.Message mo50289x733c63a2 = l2Var.f499730m.mo50289x733c63a2(l2Var.f499726f);
        mo50289x733c63a2.arg1 = eVar != null ? eVar.f84020c : 0;
        mo50289x733c63a2.sendToTarget();
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        te2.l2 l2Var = this.f499585a;
        x91.h hVar = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Transitioning;
        }
        te2.c2 c2Var = l2Var.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.u2((te2.a3) c2Var, ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f));
        }
        x91.h hVar2 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar2 != null) {
            hVar2.c(new te2.g2(l2Var));
        }
    }
}
