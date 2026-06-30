package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes11.dex */
public class p0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152922d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152923e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152924f;

    public p0(java.lang.String str) {
        this.f152923e = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.sl3();
        lVar.f152198b = new r45.tl3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getprofile";
        lVar.f152200d = 302;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152922d = a17;
        ((r45.sl3) a17.f152243a.f152217a).f467363d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152923e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetProfile", "null or empty username");
            return -1;
        }
        this.f152924f = u0Var;
        return mo9409x10f9447a(sVar, this.f152922d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 302;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0500  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r23, int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p971x6de15a2e.v0 r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 1479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p957x53236a1b.p0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
