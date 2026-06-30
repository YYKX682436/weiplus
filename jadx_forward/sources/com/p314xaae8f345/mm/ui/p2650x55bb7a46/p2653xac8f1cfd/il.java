package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class il implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml f280769e;

    public il(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f280769e = mlVar;
        this.f280768d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f.INSTANCE.mo68477x336bdfd8(403L, 7L, 1L, false);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ml mlVar = this.f280769e;
        mlVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280768d;
        if (f9Var != null) {
            long j17 = 0;
            if (f9Var.m124847x74d37ac6() != 0) {
                final long F0 = f9Var.F0();
                int i17 = 0;
                boolean z17 = (f9Var.w0() & 4) != 0;
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(mlVar.f280113d.u().d1());
                if (p17 != null) {
                    long F02 = z17 ? p17.F0() : p17.R0();
                    if (z17 && F02 == 0) {
                        i17 = p17.c1();
                    }
                    int i18 = i17;
                    if (z17 && F02 > F0) {
                        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                        final java.lang.String d17 = mlVar.f280113d.u().d1();
                        cj6.getClass();
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = null;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                            if (cj6.Da(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                                f9Var2 = ot0.c3.l().g("getOlderMsgByMsgSeq", new yz5.a() { // from class: com.tencent.mm.storage.g9$$p0
                                    @Override // yz5.a
                                    /* renamed from: invoke */
                                    public final java.lang.Object mo152xb9724478() {
                                        return ot0.z2.f430355a.g1(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, d17, F0);
                                    }
                                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$q0
                                    @Override // yz5.a
                                    /* renamed from: invoke */
                                    public final java.lang.Object mo152xb9724478() {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from message where");
                                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                        java.lang.String str = d17;
                                        sb6.append(g9Var.Z8(str));
                                        sb6.append(" and msgSeq < ");
                                        sb6.append(F0);
                                        sb6.append(" order by msgSeq DESC LIMIT 1 ");
                                        java.lang.String sb7 = sb6.toString();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getOlderMsgByMsgSeq: " + sb7);
                                        android.database.Cursor B = g9Var.f275522r.B(sb7, null);
                                        if (B == null) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getNewerMsgByMsgSeq failed " + str);
                                            return null;
                                        }
                                        if (!B.moveToFirst()) {
                                            B.close();
                                            return null;
                                        }
                                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                        f9Var3.mo9015xbf5d97fd(B);
                                        B.close();
                                        return f9Var3;
                                    }
                                });
                            } else if (cj6.Pb(cj6.X8(d17))) {
                                f9Var2 = ot0.z2.f430355a.g1(cj6.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, d17, F0);
                            } else {
                                java.lang.String str = "select * from message where" + cj6.Z8(d17) + " and msgSeq < " + F0 + " order by msgSeq DESC LIMIT 1 ";
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorage", "getOlderMsgByMsgSeq: " + str);
                                android.database.Cursor B = cj6.f275522r.B(str, null);
                                if (B == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgInfoStorage", "getNewerMsgByMsgSeq failed " + d17);
                                } else if (B.moveToFirst()) {
                                    f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                    f9Var2.mo9015xbf5d97fd(B);
                                    B.close();
                                } else {
                                    B.close();
                                }
                            }
                        }
                        if (f9Var2 != null && f9Var2.F0() < F0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg revised filterSeq[%d] to [%d]", java.lang.Long.valueOf(F02), java.lang.Long.valueOf(f9Var2.F0()));
                            long F03 = f9Var2.F0();
                            i17 = i18;
                            j17 = F03;
                        }
                    }
                    i17 = i18;
                    j17 = F02;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg filterSeq[%d], lastSeq[%d], needCount[%d], flag[%d], up[%b]", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(F0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f9Var.w0()), java.lang.Boolean.valueOf(z17));
                mlVar.f280113d.u().getClass();
            }
        }
    }
}
