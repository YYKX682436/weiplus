package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public class f0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        try {
            com.p314xaae8f345.mm.p959x883644fd.i0.f153048e = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            int i17 = com.p314xaae8f345.mm.p959x883644fd.i0.f153049f;
            if (i17 >= 2000 || i17 <= 1000) {
                com.p314xaae8f345.mm.p959x883644fd.i0.f(i17, 0.0f, 0.0f, 0, 0L);
            } else {
                com.p314xaae8f345.mm.p959x883644fd.i0.a(i17, 0.0f, 0.0f, 0, 0L);
            }
            return false;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetTypeReporter", "run :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }
}
