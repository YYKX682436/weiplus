package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class f0 implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        try {
            com.tencent.mm.modelstat.i0.f71515e = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            int i17 = com.tencent.mm.modelstat.i0.f71516f;
            if (i17 >= 2000 || i17 <= 1000) {
                com.tencent.mm.modelstat.i0.f(i17, 0.0f, 0.0f, 0, 0L);
            } else {
                com.tencent.mm.modelstat.i0.a(i17, 0.0f, 0.0f, 0, 0L);
            }
            return false;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetTypeReporter", "run :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return false;
        }
    }
}
