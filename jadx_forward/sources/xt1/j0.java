package xt1;

/* loaded from: classes4.dex */
public class j0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538034d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538035e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f538036f;

    /* renamed from: g, reason: collision with root package name */
    public int f538037g;

    /* renamed from: h, reason: collision with root package name */
    public int f538038h;

    /* renamed from: i, reason: collision with root package name */
    public int f538039i;

    public j0(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.jc3();
        lVar.f152198b = new r45.kc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcardserial";
        lVar.f152200d = nd1.a2.f72909x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538034d = a17;
        ((r45.jc3) a17.f152243a.f152217a).f459230d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538035e = u0Var;
        return mo9409x10f9447a(sVar, this.f538034d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return nd1.a2.f72909x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.kc3 kc3Var = (r45.kc3) this.f538034d.f152244b.f152233a;
            this.f538036f = kc3Var.f460116d;
            this.f538037g = kc3Var.f460117e;
            this.f538038h = kc3Var.f460118f;
            this.f538039i = kc3Var.f460119g;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", java.lang.Integer.valueOf(this.f538037g), java.lang.Integer.valueOf(this.f538038h), java.lang.Integer.valueOf(this.f538039i));
        if (this.f538036f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.f538036f.size());
        }
        this.f538035e.mo815x76e0bfae(i18, i19, str, this);
    }
}
