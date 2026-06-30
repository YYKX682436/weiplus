package q71;

/* loaded from: classes8.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441894d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441895e;

    public q(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ej5();
        lVar.f152198b = new r45.fj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rcptinfotouch";
        lVar.f152200d = 419;
        lVar.f152201e = 204;
        lVar.f152202f = 1000000204;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441895e = a17;
        ((r45.ej5) a17.f152243a.f152217a).f455106d = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441894d = u0Var;
        return mo9409x10f9447a(sVar, this.f441895e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 419;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.fj5 fj5Var = (r45.fj5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            java.util.LinkedList linkedList = fj5Var.f455935d.f472672e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(fj5Var.f455935d.f472672e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f441894d.mo815x76e0bfae(i18, i19, str, this);
    }
}
