package mw3;

/* loaded from: classes9.dex */
public class z extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b) abstractC20979x809547d1;
        rw3.c z07 = kw3.p.Ai().Ni().z0(c6255xde73125b.f136504g.f89954a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryRemittanceStatusEventListener", "find record：%s", c6255xde73125b.f136504g.f89954a);
        am.z10 z10Var = c6255xde73125b.f136505h;
        if (z07 != null) {
            z10Var.f90038a = z07.f68618xd3086e30;
            z10Var.f90039b = z07.f68616xff7bdab7;
            z10Var.f90040c = z07.f68614x65958892;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletQueryRemittanceStatusEventListener", "fail：can not find record");
            z10Var.f90038a = -2;
            z10Var.f90039b = false;
            z10Var.f90040c = false;
        }
        return false;
    }
}
