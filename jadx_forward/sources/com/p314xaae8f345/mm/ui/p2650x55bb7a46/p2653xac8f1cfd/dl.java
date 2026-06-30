package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class dl implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl f280477a;

    public dl(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl glVar) {
        this.f280477a = glVar;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        java.lang.String str;
        java.lang.String str2;
        if (sVar == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl glVar = this.f280477a;
        glVar.getClass();
        java.lang.String z07 = sVar.z0();
        long V = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(z07, 0L) : 0L;
        if (V != 0) {
            str = "TypingTrigger_ISP" + V;
            str2 = "TypingInterval_ISP" + V;
        } else {
            str = "TypingTrigger";
            str2 = "TypingInterval";
        }
        boolean m17 = gm0.j1.b().m();
        java.lang.String str3 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0;
        java.lang.String str4 = "15";
        if (m17) {
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
            if (d17 != null) {
                str3 = d17;
            }
            java.lang.String d18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str2);
            if (d18 != null) {
                str4 = d18;
            }
        }
        glVar.f280642e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0);
        glVar.f280643f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SignallingComponent", "ispId: %d, trigger:%d, interval:%d", java.lang.Long.valueOf(V), java.lang.Integer.valueOf(glVar.f280642e), java.lang.Integer.valueOf(glVar.f280643f));
        int i17 = glVar.f280642e;
        if (i17 != -1 && i17 != -2 && i17 <= 0) {
            glVar.f280642e = 10;
        }
        if (glVar.f280643f <= 0) {
            glVar.f280643f = 15;
        }
        sVar.H(glVar.f280643f * 1000, 20000L);
    }
}
