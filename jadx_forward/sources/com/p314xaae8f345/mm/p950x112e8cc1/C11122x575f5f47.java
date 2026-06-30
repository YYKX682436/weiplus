package com.p314xaae8f345.mm.p950x112e8cc1;

/* renamed from: com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver */
/* loaded from: classes11.dex */
public class C11122x575f5f47 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190> implements l75.z0, l75.q0, com.p314xaae8f345.mm.p950x112e8cc1.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f152764d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f152765e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C11122x575f5f47() {
        /*
            r2 = this;
            com.tencent.mm.app.a0 r0 = com.p314xaae8f345.mm.app.a0.f134821d
            r2.<init>(r0)
            com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2 r1 = new com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver$2
            r1.<init>(r2, r0)
            r2.f152764d = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f152765e = r0
            r1.mo48813x58998cd()
            com.tencent.mm.modelgetchatroommsg.f r0 = com.p314xaae8f345.mm.p950x112e8cc1.f.d()
            r0.f152771d = r2
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.m4 r0 = r0.Di()
            com.tencent.mm.sdk.platformtools.u3 r1 = gm0.j1.e()
            android.os.Looper r1 = r1.a()
            l75.v0 r0 = r0.f398472c
            r0.a(r2, r1)
            java.lang.Class<w11.w1> r0 = w11.w1.class
            i95.m r0 = i95.n0.c(r0)
            w11.w1 r0 = (w11.w1) r0
            xg3.w0 r0 = r0.Ai()
            com.tencent.mm.sdk.platformtools.u3 r1 = gm0.j1.e()
            android.os.Looper r1 = r1.a()
            r0.add(r2, r1)
            r0 = 562497440(0x218707a0, float:9.149974E-19)
            r2.f39173x3fe91575 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p950x112e8cc1.C11122x575f5f47.<init>():void");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6029xbb3f0190 c6029xbb3f0190) {
        gm0.j1.e().j(new com.p314xaae8f345.mm.p950x112e8cc1.h(c6029xbb3f0190, null));
        return true;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (a1Var == ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di() && (obj instanceof java.lang.String) && 5 == i17) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p950x112e8cc1.g(this, obj));
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (x51.t1.b(str)) {
            return;
        }
        try {
            long longValue = java.lang.Long.valueOf(str).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.y7 y7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.y7();
            y7Var.f69372xd234289f = longValue;
            boolean z17 = ((w11.w1) i95.n0.c(w11.w1.class)).Ai().get(y7Var, new java.lang.String[0]);
            java.util.Map map = this.f152765e;
            if (z17) {
                ((java.util.HashMap) map).put(java.lang.Long.valueOf(longValue), y7Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange put info systemRowid[%d], svrId[%d]", java.lang.Long.valueOf(y7Var.f72763xa3c65b86), java.lang.Long.valueOf(longValue));
            } else {
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(longValue));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgReceiver", "summerbadcr dealSysCmdMsg onNotifyChange remove info svrId[%d]", java.lang.Long.valueOf(longValue));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetChatroomMsgReceiver", e17, "summerbadcr dealSysCmdMsg onNotifyChange:", new java.lang.Object[0]);
        }
    }
}
