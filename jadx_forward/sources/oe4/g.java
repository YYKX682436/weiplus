package oe4;

/* loaded from: classes15.dex */
public abstract class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {
    public abstract void H();

    public abstract void I(int i17, int i18, java.lang.String str);

    public abstract void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr);

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSoterBase", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        oe4.l lVar = new oe4.l(new oe4.f(this, null));
        boolean z17 = true;
        if (i18 == 4 && i19 == -3200) {
            cu5.b.d(new oe4.k(lVar), true, new oe4.i());
        } else if (i18 == 4 && i19 == -3202) {
            H();
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        J(i17, i18, i19, str, v0Var, bArr);
    }
}
