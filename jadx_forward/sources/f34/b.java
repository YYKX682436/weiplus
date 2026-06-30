package f34;

/* loaded from: classes11.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f340852d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f340853e;

    /* renamed from: f, reason: collision with root package name */
    public f34.d f340854f;

    public b(float f17, float f18, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n36();
        lVar.f152198b = new r45.o36();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/card/shakecard";
        lVar.f152200d = 1250;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f340853e = a17;
        r45.n36 n36Var = (r45.n36) a17.f152243a.f152217a;
        n36Var.f462596e = f18;
        n36Var.f462595d = f17;
        n36Var.f462597f = i17;
        n36Var.f462598g = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f340852d = u0Var;
        return mo9409x10f9447a(sVar, this.f340853e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1250;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250 errType = " + i18 + " errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            r45.o36 o36Var = (r45.o36) this.f340853e.f152244b.f152233a;
            if (o36Var != null) {
                f34.d dVar = new f34.d();
                this.f340854f = dVar;
                dVar.f340861a = o36Var.f463400d;
                dVar.f340862b = o36Var.f463401e;
                dVar.f340863c = o36Var.f463402f;
                dVar.f340864d = o36Var.f463403g;
                dVar.f340865e = o36Var.f463406m;
                dVar.f340866f = o36Var.f463407n;
                dVar.f340867g = o36Var.f463408o;
                dVar.f340868h = o36Var.f463409p;
                dVar.f340869i = o36Var.f463410q;
                dVar.f340870j = o36Var.f463411r;
                dVar.f340871k = o36Var.f463412s;
                dVar.f340872l = o36Var.f463413t;
                dVar.f340873m = o36Var.f463414u;
                dVar.f340874n = o36Var.f463415v;
                dVar.f340875o = o36Var.f463416w;
                dVar.f340876p = o36Var.f463417x;
                c34.h0.Bi().f340860f = this.f340854f.f340873m;
            } else {
                f34.d dVar2 = new f34.d();
                this.f340854f = dVar2;
                dVar2.f340861a = 3;
                dVar2.f340873m = c34.h0.Bi().f340860f;
            }
        } else {
            f34.d dVar3 = new f34.d();
            this.f340854f = dVar3;
            dVar3.f340861a = 3;
            dVar3.f340873m = c34.h0.Bi().f340860f;
        }
        this.f340852d.mo815x76e0bfae(i18, i19, str, this);
    }
}
