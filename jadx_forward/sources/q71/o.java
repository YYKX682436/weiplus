package q71;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f441888d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f441889e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441890f;

    public o(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.aj5();
        lVar.f152198b = new r45.bj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rcptinfoquery";
        lVar.f152200d = 417;
        lVar.f152201e = 202;
        lVar.f152202f = 1000000202;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f441889e = a17;
        r45.aj5 aj5Var = (r45.aj5) a17.f152243a.f152217a;
        aj5Var.f451586d = i17;
        aj5Var.f451587e = str;
        aj5Var.f451588f = str2;
        aj5Var.f451589g = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f441888d = u0Var;
        return mo9409x10f9447a(sVar, this.f441889e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 417;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.bj5 bj5Var = (r45.bj5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            java.lang.String str2 = bj5Var.f452342f;
            this.f441890f = bj5Var.f452343g == 1;
            java.util.LinkedList linkedList = bj5Var.f452340d.f472672e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(bj5Var.f452340d.f472672e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f441888d.mo815x76e0bfae(i18, i19, str, this);
    }
}
