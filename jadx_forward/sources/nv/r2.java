package nv;

/* loaded from: classes12.dex */
public class r2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5182x3672e502 c5182x3672e502 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5182x3672e502) abstractC20979x809547d1;
        if (c5182x3672e502 == null) {
            return false;
        }
        am.k0 k0Var = c5182x3672e502.f135527g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent, op:%d.", java.lang.Integer.valueOf(k0Var.f88641a));
        int i17 = k0Var.f88641a;
        if (i17 == 1) {
            if (!z65.c.a()) {
                return false;
            }
            kn1.k.f391163a = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nv.n2(this));
            return false;
        }
        if (i17 == 2) {
            if (mn1.d.i().j().i()) {
                gm0.j1.e().j(new nv.p2(this));
                return false;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nv.o2(this));
            return false;
        }
        if (i17 != 3) {
            return false;
        }
        kn1.k.h();
        kn1.k.k(kn1.k.o());
        kn1.k.k(kn1.k.p());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nv.q2(this));
        return false;
    }
}
