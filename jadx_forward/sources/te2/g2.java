package te2;

/* loaded from: classes14.dex */
public final class g2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f499564a;

    public g2(te2.l2 l2Var) {
        this.f499564a = l2Var;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        te2.l2 l2Var = this.f499564a;
        java.lang.String str = l2Var.f499725e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f84020c) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        android.os.Message mo50289x733c63a2 = l2Var.f499730m.mo50289x733c63a2(l2Var.f499726f);
        mo50289x733c63a2.arg1 = eVar != null ? eVar.f84020c : 0;
        mo50289x733c63a2.sendToTarget();
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        x91.c cVar;
        x91.c cVar2;
        te2.l2 l2Var = this.f499564a;
        java.lang.String str = l2Var.f499725e;
        x91.h hVar = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar != null) {
            hVar.f534184e.f534196a = x91.j.Playing;
        }
        x91.h hVar2 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar2 != null) {
            hVar2.f();
        }
        x91.h hVar3 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar3 != null) {
            hVar3.g();
        }
        x91.h hVar4 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar4 != null) {
            hVar4.f534187h = l2Var.f499731n;
        }
        mm2.c1 c1Var = (mm2.c1) l2Var.f499724d.a(mm2.c1.class);
        x91.h hVar5 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        java.lang.String str2 = null;
        java.lang.String str3 = (hVar5 == null || (cVar2 = hVar5.f534180a) == null) ? null : cVar2.f534172g;
        x91.h hVar6 = ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f;
        if (hVar6 != null && (cVar = hVar6.f534180a) != null) {
            str2 = cVar.f534174i;
        }
        c1Var.C4 = new km2.n0(str3, str2);
        te2.c2 c2Var = l2Var.f499729i;
        if (c2Var != null) {
            pm0.v.X(new te2.t2((te2.a3) c2Var, ((je2.i) l2Var.f499724d.a(je2.i.class)).f380768f));
        }
        l2Var.f499732o.d();
    }
}
