package se4;

/* loaded from: classes9.dex */
public class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f488463a = null;

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        if (!((java.lang.Boolean) bVar.a(0)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterPrepareAskFunc", "not need prepare ask, return");
            return (java.lang.Boolean) bVar.a(1);
        }
        this.f488463a = km5.u.b();
        if (!cu5.b.c()) {
            return java.lang.Boolean.FALSE;
        }
        iu5.e iVar = gm0.j1.a() ? new oe4.i() : new oe4.j();
        wt5.a.h();
        this.f488463a.b();
        cu5.b.d(new se4.i(this, bVar), false, iVar);
        bVar.a(1);
        return (java.lang.Boolean) bVar.a(1);
    }
}
