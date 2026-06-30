package ww1;

/* loaded from: classes9.dex */
public class s1 extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531811d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531812e;

    public s1(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ax();
        lVar.f152198b = new r45.bx();
        lVar.f152200d = 3781;
        lVar.f152199c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f531811d = a17;
        r45.ax axVar = (r45.ax) a17.f152243a.f152217a;
        axVar.f451852d = i17;
        axVar.f451853e = i18;
        axVar.f451854f = str;
        axVar.f451855g = str2;
        axVar.f451856h = (int) (java.lang.System.currentTimeMillis() / 1000);
        axVar.f451857i = gVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531812e = u0Var;
        return mo9409x10f9447a(sVar, this.f531811d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3781;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneF2fQrcodeSaveNotify", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f531812e.mo815x76e0bfae(i18, i19, str, this);
    }
}
