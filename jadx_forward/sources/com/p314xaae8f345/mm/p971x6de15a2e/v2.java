package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes.dex */
public class v2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPushCore", "[+] Run successfully: %s, funcId: %s", m1Var, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPushCore", "[-] Run failed: %s, funcId: %s, errType:%s, errCode: %s", m1Var, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
