package di3;

/* loaded from: classes10.dex */
public class b0 implements t21.e2 {
    @Override // t21.e2
    public void Cb(java.lang.String str) {
        boolean z17;
        t21.v2 g17 = t21.o2.Ui().g(str);
        if (g17 == null) {
            return;
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, str, false);
        r45.vh4 vh4Var = g17.H;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d cj6 = d11.s.fj().cj();
        if (vh4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", java.lang.Integer.valueOf(vh4Var.f469769f), str, rj6);
            if (vh4Var.f469769f > 1) {
                t21.d3.G(str);
                return;
            }
        }
        boolean a17 = di3.y.a(rj6, cj6, vh4Var, new di3.z(this, rj6, g17));
        if (vh4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", str, java.lang.Boolean.valueOf(a17));
            vh4Var.f469772i = !a17;
            g17.H = vh4Var;
            g17.U = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
            t21.o2.Ui().C(g17);
        }
        if (a17) {
            boolean aj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(g17.d());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (vh4Var != null) {
                vh4Var.f469769f++;
                g17.H = vh4Var;
            }
            g17.U = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
            t21.o2.Ui().C(g17);
            long j17 = g17.f496549n;
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ai3.a.f86637a;
            synchronized (ai3.a.class) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing: %s", java.lang.Long.valueOf(j17));
                    ai3.a.f86637a.add(java.lang.Long.valueOf(j17));
                    z17 = false;
                } catch (java.lang.Exception e17) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing error: %s", e17.getMessage());
                }
            }
            f65.y0.f341552a.f(str, cj6.A == 1 ? true : z17 ? 2 : 1, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f3.f270835a.a() ? 2 : 1);
            int b17 = di3.y.b(rj6, cj6, vh4Var, new di3.a0(this, g17, rj6));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 3038L;
            c6423x452b9f7c.f137650i = aj6 ? 1L : 0L;
            c6423x452b9f7c.f137651j = b17;
            c6423x452b9f7c.f137652k = java.lang.System.currentTimeMillis() - currentTimeMillis;
            c6423x452b9f7c.k();
            if (b17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 45L, 1L, false);
                t21.d3.G(str);
            } else if (vh4Var != null) {
                vh4Var.f469772i = true;
                g17.H = vh4Var;
                g17.U = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
                t21.o2.Ui().C(g17);
            }
        }
    }
}
