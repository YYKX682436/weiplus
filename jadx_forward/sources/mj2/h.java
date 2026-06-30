package mj2;

/* loaded from: classes10.dex */
public final class h implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh2.c f408563a;

    public h(zh2.c cVar) {
        this.f408563a = cVar;
    }

    @Override // si2.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l a() {
        return this.f408563a.a();
    }

    @Override // si2.b
    public void c(dk2.pf battleData, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        qf2.c3 c3Var = (qf2.c3) this.f408563a.mo57008x143f1b92(qf2.c3.class);
        if (c3Var != null) {
            c3Var.c7(1, battleData, lVar);
        }
    }
}
