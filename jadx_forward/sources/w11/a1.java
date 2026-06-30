package w11;

/* loaded from: classes12.dex */
public abstract class a1 {
    public static void a(int i17, byte[] bArr, byte[] bArr2, r45.cx4 cx4Var) {
        boolean m75998xcde97c32;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1;
        o45.yh yhVar = new o45.yh();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc13 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(255);
        try {
            m75998xcde97c32 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75998xcde97c32(c19764x527bffc13, bArr, bArr2, c19764x527bffc12, c19767x257d7f, c19767x257d7f2, c19767x257d7f3, c19767x257d7f4, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", "summerdiz dealWithPushResp unpack ret:" + m75998xcde97c32 + ", noticeid:" + m75998xcde97c32, java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171));
            if (c19767x257d7f3.f38864x6ac9171 != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015 c5598x407a5015 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015();
                c5598x407a5015.f135923g.f89341a = c19767x257d7f3.f38864x6ac9171;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Boolean.valueOf(c5598x407a5015.e()));
                c19767x257d7f3.f38864x6ac9171 = 0;
            }
            if (c19767x257d7f2.f38864x6ac9171 == 13) {
                gm0.j1.i();
                byte[] c17 = gm0.j1.n().c(3);
                c19764x527bffc1 = c19764x527bffc13;
                c19764x527bffc1.f38861x6ac9171 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46285x1906568c(c17, c19764x527bffc1.f38861x6ac9171);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summerdiz dealWithPushResp unpack AES_GCM_ENCRYPT serverSession");
                int i18 = -1;
                sb6.append(c17 == null ? -1 : c17.length);
                sb6.append(" new pr[");
                sb6.append(c19764x527bffc1.f38861x6ac9171);
                sb6.append(": ");
                byte[] bArr3 = c19764x527bffc1.f38861x6ac9171;
                if (bArr3 != null) {
                    i18 = bArr3.length;
                }
                sb6.append(i18);
                sb6.append("]");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", sb6.toString());
            } else {
                c19764x527bffc1 = c19764x527bffc13;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed: %s", e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewSyncMgr", e17, "", new java.lang.Object[0]);
        }
        if (!m75998xcde97c32) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed");
            return;
        }
        yhVar.m150584x85cc8068(c19767x257d7f4.f38864x6ac9171);
        int i19 = c19767x257d7f.f38864x6ac9171;
        if (i19 == -13) {
            yhVar.m150587xf2a12b6c(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSyncMgr", "unpack push resp failed session timeout");
            return;
        }
        yhVar.m150587xf2a12b6c(yhVar.mo13863x347f4535(c19764x527bffc1.f38861x6ac9171));
        yhVar.m150582x8e03ce63(bArr.length);
        byte[] a17 = w11.c2.f523524a.a();
        byte[] d17 = x51.j1.d(yhVar.f424572a.f455294g);
        gm0.j1.i();
        gm0.m b17 = gm0.j1.b();
        r45.ew4 ew4Var = yhVar.f424572a;
        b17.D(ew4Var.f455295h, ew4Var.f455296i);
        gm0.m.A(yhVar.f424572a.f455295h);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(d17) && o45.qi.b(a17, d17)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().g(yhVar, i17, cx4Var);
            if (c19767x257d7f3.f38864x6ac9171 != 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015 c5598x407a50152 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015();
                c5598x407a50152.f135923g.f89341a = c19767x257d7f3.f38864x6ac9171;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", java.lang.Integer.valueOf(c19767x257d7f3.f38864x6ac9171), java.lang.Boolean.valueOf(c5598x407a50152.e()));
                c19767x257d7f3.f38864x6ac9171 = 0;
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewSyncMgr", "compareKeybuf syncKey failed");
    }

    public static boolean b() {
        boolean z17;
        if (w11.c2.f523524a.a().length > 0) {
            gm0.j1.i();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
