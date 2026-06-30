package ek2;

/* loaded from: classes3.dex */
public final class g2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.f2 f334986u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334987v;

    public g2(long j17, long j18, java.lang.String str, byte[] bArr, int i17, java.lang.String str2, ek2.f2 f2Var) {
        super(null, 1, null);
        this.f334986u = f2Var;
        this.f334987v = "Finder.CgiFinderLiveRefreshMic";
        r45.z62 z62Var = new r45.z62();
        z62Var.set(3, java.lang.Long.valueOf(j17));
        z62Var.set(1, db2.t4.f309704a.a(4180));
        z62Var.set(4, java.lang.Long.valueOf(j18));
        z62Var.set(5, str);
        z62Var.set(7, xy2.c.f(this.f97668n));
        z62Var.set(6, java.lang.Integer.valueOf(i17));
        z62Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        z62Var.set(8, str2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = z62Var;
        r45.a72 a72Var = new r45.a72();
        a72Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) a72Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = a72Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliverefreshmicwithaudience";
        lVar.f152200d = 4180;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveRefreshMic", "liveId:" + z62Var.m75942xfb822ef2(3) + " objectId:" + z62Var.m75942xfb822ef2(4) + " objectNonceId:" + z62Var.m75945x2fec8307(5) + " scene:" + z62Var.m75939xb282bd08(6) + " mic_sdk_user_id:" + z62Var.m75945x2fec8307(8));
        p(a17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ma4 ma4Var;
        co0.s u07;
        kn0.i iVar;
        r45.nw1 nw1Var;
        r45.a72 resp = (r45.a72) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334987v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.f2 f2Var = this.f334986u;
        if (f2Var != null) {
            dk2.vd vdVar = (dk2.vd) f2Var;
            dk2.ef efVar = dk2.ef.f314905a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRefreshMicResp errCode:");
            sb6.append(i18);
            sb6.append(", errType:");
            sb6.append(i17);
            sb6.append(", curData:");
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams tRTCParams = null;
            boolean z17 = false;
            sb6.append((e1Var == null || (nw1Var = e1Var.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb6.toString());
            if (i17 == 0 && i18 == 0 && (ma4Var = (r45.ma4) resp.m75936x14adae67(1)) != null) {
                mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
                if (e1Var2 != null) {
                    e1Var2.f410520q = ma4Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "handleRefreshMicResp updatePrivateMapKey");
                in0.q qVar = in0.q.f374302b2;
                if (qVar != null) {
                    if (qVar == null) {
                        in0.q.f374302b2 = new in0.q(rn0.a.f479142a.a());
                    }
                    in0.q qVar2 = in0.q.f374302b2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
                    qVar2.O0(ma4Var.f461832i.i());
                } else {
                    sn0.b bVar = sn0.b.f491497e2;
                    if (bVar != null) {
                        if (bVar == null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
                            sn0.b.f491497e2 = new sn0.b();
                        }
                        sn0.b bVar2 = sn0.b.f491497e2;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
                        bVar2.O0(ma4Var.f461832i.i());
                    } else if (efVar.u0() != null && (u07 = efVar.u0()) != null) {
                        u07.O0(ma4Var.f461832i.i());
                    }
                }
                mm2.e1 e1Var3 = (mm2.e1) efVar.i(mm2.e1.class);
                if (e1Var3 != null && (iVar = e1Var3.f410523t) != null) {
                    tRTCParams = iVar.f391090a;
                }
                if (tRTCParams != null) {
                    tRTCParams.f57076x19d1d6c6 = ma4Var.f461832i.i();
                }
                efVar.t0(ma4Var);
                z17 = true;
            }
            dk2.xg xgVar = dk2.ef.f314928l0;
            if (xgVar != null) {
                xgVar.a();
            }
            if (z17) {
                long j17 = (vdVar.f315781a.f410520q.f461836p - 60) * 1000;
                if (j17 < 60000) {
                    j17 = 60000;
                }
                efVar.Q(j17);
            }
        }
    }
}
