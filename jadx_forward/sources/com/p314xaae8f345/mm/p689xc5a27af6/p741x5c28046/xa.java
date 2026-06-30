package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes8.dex */
public class xa extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6 {
    public boolean wi(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = l11.e.f396507d;
        if (n3Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(n3Var != null);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[1] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] stack[%s]", objArr);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = l11.e.f396507d;
            if (n3Var2 != null) {
                n3Var2.mo50302x6b17ad39(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("GIF-Decoder");
            l11.e.f396507d = n3Var3;
            n3Var3.m77789xc5a5549d(false);
        }
        if (j17 > 0) {
            l11.e.f396507d.mo50297x7c4d7ca2(runnable, j17);
        } else {
            l11.e.f396507d.mo50293x3498a0(runnable);
        }
        return true;
    }
}
