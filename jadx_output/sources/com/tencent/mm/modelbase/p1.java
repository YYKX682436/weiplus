package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public abstract class p1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f70734d = 3;

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 4 || i19 != -301) {
            c72.v vVar = (c72.v) this;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            if (i18 == 4 && i19 == -102) {
                gm0.j1.e().j(new c72.u(vVar, v0Var.getReqObj().getRsaInfo().f342999c));
                return;
            } else {
                vVar.J(i17, i18, i19, str, v0Var, bArr);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIDCRedirectBase", "NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", java.lang.Integer.valueOf(this.f70734d));
        if (v0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
            c72.v vVar2 = (c72.v) this;
            r45.vt4 I = vVar2.I(v0Var);
            r45.jo joVar = I != null ? I.f388519f : null;
            r45.vt4 I2 = vVar2.I(v0Var);
            r45.rt4 rt4Var = I2 != null ? I2.f388518e : null;
            r45.vt4 I3 = vVar2.I(v0Var);
            r45.kx3 kx3Var = I3 != null ? I3.f388517d : null;
            r45.vt4 I4 = vVar2.I(v0Var);
            c01.f9.d(joVar, rt4Var, kx3Var, true, I4 != null ? I4.f388520g : 0);
        }
        int i27 = this.f70734d - 1;
        this.f70734d = i27;
        if (i27 > 0) {
            doScene(dispatcher(), ((c72.v) this).f39594e);
            return;
        }
        c72.v vVar3 = (c72.v) this;
        com.tencent.mm.modelbase.u0 u0Var = vVar3.f39594e;
        if (u0Var != null) {
            u0Var.onSceneEnd(3, -1, "", vVar3);
        }
    }
}
