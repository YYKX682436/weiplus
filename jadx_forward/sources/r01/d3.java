package r01;

/* loaded from: classes9.dex */
public class d3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449578d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449579e;

    /* renamed from: f, reason: collision with root package name */
    public final r01.c3 f449580f;

    public d3(java.lang.String str, java.lang.String str2, r01.c3 c3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBizAttrSync", "[BizAttr] NetSceneBizAttrSync (%s)", str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1075;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/bizattr/bizattrsync";
        lVar.f152197a = new r45.hj();
        lVar.f152198b = new r45.ij();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449579e = a17;
        r45.hj hjVar = (r45.hj) a17.f152243a.f152217a;
        hjVar.f457741d = str;
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str2 == null ? "" : str2);
        hjVar.f457742e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h17, 0, h17.length);
        this.f449580f = c3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449578d = u0Var;
        return mo9409x10f9447a(sVar, this.f449579e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1075;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0601  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r22, int r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p971x6de15a2e.v0 r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.d3.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
