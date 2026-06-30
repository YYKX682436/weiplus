package uf;

/* loaded from: classes7.dex */
public final class l1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f508574c;

    public l1(uf.o1 o1Var) {
        this.f508574c = o1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc
    public boolean a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "volume down");
        uf.o1 o1Var = this.f508574c;
        uf.o0 q17 = o1Var.q();
        uf.k1 k1Var = new uf.k1(o1Var);
        q17.getClass();
        x91.h c17 = q17.f508595e.c();
        uf.s sVar = new uf.s(k1Var);
        x91.l lVar = c17.f534183d;
        if (lVar == null) {
            return true;
        }
        c17.f534181b.g(new w91.c(c17.a(lVar), c17.f534183d.f534197a), sVar);
        return true;
    }
}
