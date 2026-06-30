package te2;

/* loaded from: classes14.dex */
public final class j2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f499664a;

    public j2(te2.l2 l2Var) {
        this.f499664a = l2Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.String str = this.f499664a.f499725e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        te2.l2 l2Var = this.f499664a;
        java.lang.String str = l2Var.f499725e;
        gk2.e eVar2 = l2Var.f499724d;
        x91.h hVar = ((je2.i) eVar2.a(je2.i.class)).f380768f;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Stopped;
        }
        x91.h hVar2 = ((je2.i) eVar2.a(je2.i.class)).f380768f;
        if (hVar2 != null) {
            hVar2.h();
        }
        x91.h hVar3 = ((je2.i) eVar2.a(je2.i.class)).f380768f;
        if (hVar3 != null) {
            hVar3.i();
        }
        x91.h hVar4 = ((je2.i) eVar2.a(je2.i.class)).f380768f;
        if (hVar4 != null) {
            hVar4.f534187h = null;
        }
        ((mm2.c1) eVar2.a(mm2.c1.class)).C4 = null;
        te2.c2 c2Var = l2Var.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.s2((te2.a3) c2Var, ((je2.i) eVar2.a(je2.i.class)).f380768f));
        }
        ((je2.i) eVar2.a(je2.i.class)).f380768f = null;
    }
}
