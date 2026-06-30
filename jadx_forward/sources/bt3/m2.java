package bt3;

/* loaded from: classes9.dex */
public class m2 implements java.lang.Runnable, wf0.u1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final zs3.b0 f105882d;

    /* renamed from: e, reason: collision with root package name */
    public int f105883e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f105884f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f105885g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f105886h = false;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bt3.t2 f105887i;

    public m2(bt3.t2 t2Var, zs3.b0 b0Var) {
        this.f105887i = t2Var;
        this.f105882d = b0Var;
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
        gm0.j1.n().f354821b.a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
    }

    public final boolean a(java.util.HashMap hashMap, boolean z17, zs3.b0 b0Var) {
        boolean z18;
        if (hashMap != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!java.lang.Boolean.valueOf(((java.lang.Boolean) ((java.util.Map.Entry) it.next()).getValue()).booleanValue()).booleanValue()) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        if (!z18 || !z17) {
            return false;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        b0Var.f68504x2262335f = 2;
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj().mo9952xce0038c9(b0Var, dm.i4.f66867x2a5c95c7);
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r29) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.m2.b(com.tencent.mm.storage.f9):void");
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = r1Var.f527062a;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        zs3.b0 b0Var = this.f105882d;
        if (h17 == null) {
            a(null, this.f105886h, b0Var);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
        if (h17.i()) {
            java.util.HashMap hashMap = this.f105884f;
            hashMap.put(java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Boolean.TRUE);
            a(hashMap, this.f105886h, b0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof bt3.l0;
        zs3.b0 b0Var = this.f105882d;
        if (!z17) {
            a(null, this.f105886h, b0Var);
            return;
        }
        gm0.j1.n().f354821b.q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
        java.util.HashMap hashMap = this.f105885g;
        java.util.HashMap hashMap2 = this.f105884f;
        if (hashMap != null) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                long longValue = ((java.lang.Long) entry.getKey()).longValue();
                java.lang.String str2 = ((bt3.n2) entry.getValue()).f105892a;
                java.lang.String str3 = ((bt3.n2) entry.getValue()).f105893b;
                if (longValue > 0 && !((java.lang.Boolean) hashMap2.get(java.lang.Long.valueOf(longValue))).booleanValue()) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a17 = bt3.c.a(str2, longValue, str3);
                    java.lang.String str4 = a17 != null ? a17.f68099xfeae815 : null;
                    if (str4 != null && str4.length() > 0) {
                        hashMap2.put(java.lang.Long.valueOf(longValue), java.lang.Boolean.TRUE);
                        java.util.Iterator it = b0Var.f68494x84214f59.f452497f.iterator();
                        while (it.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it.next();
                            if (gp0Var.V1 == longValue) {
                                gp0Var.A0(a17.f68099xfeae815);
                            }
                        }
                    }
                }
            }
        }
        a(hashMap2, this.f105886h, b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [m11.j] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [int] */
    /* JADX WARN: Type inference failed for: r18v6 */
    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        bt3.t2 t2Var;
        ?? r18;
        this.f105883e = 0;
        this.f105886h = false;
        zs3.b0 b0Var = this.f105882d;
        r45.bq0 bq0Var = b0Var.f68494x84214f59;
        bt3.t2 t2Var2 = this.f105887i;
        if (bq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgSendService", "ChatDataDownloadRunnable info.field_dataProto null id:%s", java.lang.Long.valueOf(b0Var.f68498x297eb4f7));
            this.f105886h = true;
            t2Var2.f105945d = false;
            a(null, true, b0Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "dojob ChatDataDownloadRunnable, info id:%s dataListSize:%s", java.lang.Long.valueOf(b0Var.f68498x297eb4f7), b0Var.f68494x84214f59.f452497f);
        java.util.Iterator it = b0Var.f68494x84214f59.f452497f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f105884f;
            if (!hasNext) {
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            long j17 = gp0Var.V1;
            if (j17 > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(b0Var.f68494x84214f59.f452495d.f459569f, j17);
                java.lang.String str = gp0Var.V;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - Li.mo78012x3fdd41df();
                boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(str);
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
                if (currentTimeMillis > com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.h(Li) && !j18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "dataItem is expired!! msgId: %s msgType:%s dataId:%s", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Integer.valueOf(Li.mo78013xfb85f7b0()), gp0Var.T);
                } else {
                    int i17 = gp0Var.I;
                    if (i17 != 2) {
                        t2Var = t2Var2;
                        if (i17 == 4 || i17 == 15) {
                            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                            java.lang.String z07 = Li.z0();
                            ((vf0.y1) x1Var).getClass();
                            t21.v2 h17 = t21.d3.h(z07);
                            if (h17 != null && h17.f496544i != 199) {
                                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "need download videoInfo MsgId:%s dataId:%s", java.lang.Long.valueOf(Li.m124847x74d37ac6()), gp0Var.T);
                                if (h17.j()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "start complete online video");
                                    wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                                    java.lang.String z08 = Li.z0();
                                    ((vf0.y1) x1Var2).getClass();
                                    t21.d3.K(z08);
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "start complete offline video");
                                    wf0.x1 x1Var3 = (wf0.x1) i95.n0.c(wf0.x1.class);
                                    java.lang.String z09 = Li.z0();
                                    ((vf0.y1) x1Var3).getClass();
                                    t21.d3.L(z09);
                                }
                            }
                        } else if ((i17 == 8 || i17 == 10130) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456944g2)) {
                            b(Li);
                        }
                    } else if (Li.J2()) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        t2Var = t2Var2;
                        m11.b0 b27 = m11.b1.Di().b2(Li.Q0(), Li.I0());
                        if (Li.A0() == 1) {
                            r18 = b27.j();
                        } else {
                            if (b27.j()) {
                                ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                                if (com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(Li, bm5.f0.f104095g, m11.c0.d(b27).f404170e, "", ""))) {
                                    r18 = 1;
                                }
                            }
                            r18 = 0;
                        }
                        int i18 = b27.f404168c;
                        int i19 = b27.f404169d;
                        if (i18 < i19 || i19 == 0) {
                            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
                            this.f105883e = b0Var.f68494x84214f59.f452497f.indexOf(gp0Var);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "need download imgDataItem MsgId:%s imgLocalId:%s dataId:%s", java.lang.Long.valueOf(Li.m124847x74d37ac6()), java.lang.Long.valueOf(b27.f404166a), gp0Var.T);
                            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).c(b27.f404166a, tg3.l1.a(Li), r18, gp0Var, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, new bt3.l2(this, b27, Li, j17));
                        }
                    } else {
                        t2Var = t2Var2;
                        if (Li.o2()) {
                            b(Li);
                        }
                    }
                }
            } else {
                t2Var = t2Var2;
            }
            t2Var2 = t2Var;
        }
        bt3.t2 t2Var3 = t2Var2;
        this.f105886h = true;
        t2Var3.f105945d = false;
        if (a(hashMap, true, b0Var)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "checkIsReadyForUpload downloadMap:%s finish:%s Id:%s localId:%s", hashMap.toString(), java.lang.Boolean.valueOf(this.f105886h), java.lang.Long.valueOf(b0Var.f68498x297eb4f7), java.lang.Integer.valueOf(b0Var.f68497x88be67a1));
        t2Var3.f(null, false);
    }
}
