package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public abstract class p1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f152267d = 3;

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 4 || i19 != -301) {
            c72.v vVar = (c72.v) this;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            if (i18 == 4 && i19 == -102) {
                gm0.j1.e().j(new c72.u(vVar, v0Var.mo47979x2d63726f().m150614x960aaed8().f424532c));
                return;
            } else {
                vVar.J(i17, i18, i19, str, v0Var, bArr);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIDCRedirectBase", "NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", java.lang.Integer.valueOf(this.f152267d));
        if (v0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
            c72.v vVar2 = (c72.v) this;
            r45.vt4 I = vVar2.I(v0Var);
            r45.jo joVar = I != null ? I.f470052f : null;
            r45.vt4 I2 = vVar2.I(v0Var);
            r45.rt4 rt4Var = I2 != null ? I2.f470051e : null;
            r45.vt4 I3 = vVar2.I(v0Var);
            r45.kx3 kx3Var = I3 != null ? I3.f470050d : null;
            r45.vt4 I4 = vVar2.I(v0Var);
            c01.f9.d(joVar, rt4Var, kx3Var, true, I4 != null ? I4.f470053g : 0);
        }
        int i27 = this.f152267d - 1;
        this.f152267d = i27;
        if (i27 > 0) {
            mo807x6c193ac1(m47995xb7ba1aa7(), ((c72.v) this).f121127e);
            return;
        }
        c72.v vVar3 = (c72.v) this;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = vVar3.f121127e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(3, -1, "", vVar3);
        }
    }
}
