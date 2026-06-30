package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes8.dex */
public class xa extends i95.w implements com.tencent.mm.feature.emoji.api.u6 {
    public boolean wi(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = l11.e.f314974d;
        if (n3Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(n3Var != null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[1] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.SubCoreGIF", "check decoder thread available fail, handler[%B] stack[%s]", objArr);
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = l11.e.f314974d;
            if (n3Var2 != null) {
                n3Var2.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var3 = new com.tencent.mm.sdk.platformtools.n3("GIF-Decoder");
            l11.e.f314974d = n3Var3;
            n3Var3.setLogging(false);
        }
        if (j17 > 0) {
            l11.e.f314974d.postDelayed(runnable, j17);
        } else {
            l11.e.f314974d.post(runnable);
        }
        return true;
    }
}
