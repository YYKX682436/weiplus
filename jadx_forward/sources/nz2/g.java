package nz2;

/* loaded from: classes9.dex */
public class g implements re4.z {
    public g(nz2.h hVar) {
    }

    @Override // re4.z
    public void h(int i17, java.lang.String str) {
        if (!cu5.b.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DummyBiometricPayManager", "init failed: %s, %s", java.lang.Integer.valueOf(i17), str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 43);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DummyBiometricPayManager", "init success: %s", java.lang.Integer.valueOf(i17));
            nz2.x xVar = new nz2.x();
            xVar.mo150321xed060d07();
            gm0.j1.q(nz2.o.class, xVar);
        }
    }
}
