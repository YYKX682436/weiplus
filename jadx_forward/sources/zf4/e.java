package zf4;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f554186d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f554187e;

    public e(int i17, java.util.LinkedList linkedList, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jz4();
        lVar.f152198b = new r45.kz4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/opvoicereminder";
        lVar.f152200d = 331;
        lVar.f152201e = 150;
        lVar.f152202f = 1000000150;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f554187e = a17;
        r45.jz4 jz4Var = (r45.jz4) a17.f152243a.f152217a;
        jz4Var.f459760d = i17;
        jz4Var.f459762f = linkedList;
        jz4Var.f459761e = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f554186d = u0Var;
        return mo9409x10f9447a(sVar, this.f554187e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 331;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        this.f554186d.mo815x76e0bfae(i18, i19, str, this);
    }
}
