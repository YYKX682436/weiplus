package va3;

/* loaded from: classes4.dex */
public class z extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f515926d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f515927e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f515928f;

    public z(float f17, float f18, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yh3();
        lVar.f152198b = new r45.zh3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlocimg";
        lVar.f152200d = me1.b.f72880x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f515927e = a17;
        r45.yh3 yh3Var = (r45.yh3) a17.f152243a.f152217a;
        yh3Var.f472614h = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            yh3Var.f472615i = 1;
        } else {
            yh3Var.f472615i = 0;
        }
        yh3Var.f472611e = f17;
        yh3Var.f472610d = f18;
        yh3Var.f472616m = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        while (i19 * i27 > 270000) {
            i19 = (int) (i19 / 1.2d);
            i27 = (int) (i27 / 1.2d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), yh3Var.f472614h);
        yh3Var.f472613g = i27;
        yh3Var.f472612f = i19;
        this.f515928f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f515926d = u0Var;
        return mo9409x10f9447a(sVar, this.f515927e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return me1.b.f72880x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        try {
            byte[] bArr2 = ((r45.zh3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f473595d.f453374f.f273689a;
            com.p314xaae8f345.mm.vfs.w6.S(this.f515928f, bArr2, 0, bArr2.length);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetLocImg", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f515926d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
