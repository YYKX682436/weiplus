package xt1;

/* loaded from: classes8.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f537995d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f537996e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f537997f;

    public e0(int i17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.tu();
        lVar.f152198b = new r45.uu();
        lVar.f152199c = "/cgi-bin/micromsg-bin/cardsync";
        lVar.f152200d = 1047;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f537995d = a17;
        r45.w54 w54Var = new r45.w54();
        w54Var.f470431f = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null);
        w54Var.f470429d = xt1.t0.ij().f530813d;
        w54Var.f470430e = xt1.t0.ij().f530814e;
        r45.tu tuVar = (r45.tu) a17.f152243a.f152217a;
        tuVar.f468337d = i17;
        tuVar.f468339f = w54Var;
        tuVar.f468340g = i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f537997f = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f537995d;
        r45.tu tuVar = (r45.tu) oVar.f152243a.f152217a;
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(282880, null);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str);
        this.f537996e = h17;
        if (h17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
        }
        tuVar.f468338e = x51.j1.a(this.f537996e);
        java.lang.Object[] objArr = new java.lang.Object[1];
        byte[] bArr = this.f537996e;
        objArr[0] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", objArr);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1047;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00bf. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r7, int r8, int r9, java.lang.String r10, com.p314xaae8f345.mm.p971x6de15a2e.v0 r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt1.e0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
