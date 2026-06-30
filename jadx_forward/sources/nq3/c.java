package nq3;

/* loaded from: classes12.dex */
public class c extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq3.d f420524d;

    public c(nq3.d dVar, nq3.a aVar) {
        this.f420524d = dVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CFileAutoDownloadTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        float f17;
        r45.qc qcVar;
        int i17;
        int i18;
        java.lang.Class cls;
        java.lang.String str;
        int i19;
        nq3.c cVar = this;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_flag, 0) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download expt flag");
            return;
        }
        if (!cVar.f420524d.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "not auto download condition");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f420524d.f420525d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "Downloading %s", cVar.f420524d.f420525d);
            return;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        try {
            j17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_bg_border_size, 10) * 1024 * 1024;
        } catch (java.lang.Exception unused) {
            j17 = 10485760;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).getClass();
        try {
            f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_file_auto_download_bg_border_priority, 5) / 100.0f;
        } catch (java.lang.Exception unused2) {
            f17 = 0.05f;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_chat_file_auto_download_flag, false);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        nq3.f fVar = nVar.f347064p;
        fVar.getClass();
        android.database.Cursor h17 = fVar.f420527a.h(java.lang.String.format("SELECT * FROM %s WHERE status = %s AND (reason & %s) > 0 AND createtime > ? ORDER BY createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", 1, 1), new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000)});
        try {
            if (h17.moveToNext()) {
                qcVar = fVar.a(h17);
            } else {
                h17.close();
                qcVar = null;
            }
            if (qcVar != null) {
                i17 = 1;
            } else if (fj6) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mmc2c_chat_file_auto_download_bg_rank, 20);
                float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.d0.clicfg_mmc2c_chat_file_auto_download_bg_score, 10.0f);
                fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar2.m134976x2690a4ac();
                nq3.f fVar2 = nVar2.f347064p;
                fVar2.getClass();
                h17 = fVar2.f420527a.h(java.lang.String.format("SELECT * FROM %s File, %s Chat WHERE Chat.rank <= ? AND Chat.totallsp > ? AND Chat.chat = File.fromuser AND createtime > ? AND File.status = ? ORDER BY File.createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", "C2CChatUsageResult"), new java.lang.String[]{java.lang.String.valueOf(Ni), java.lang.String.valueOf(Di), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(1)});
                try {
                    if (h17.moveToNext()) {
                        r45.qc a17 = fVar2.a(h17);
                        h17.close();
                        qcVar = a17;
                    } else {
                        h17.close();
                        qcVar = null;
                    }
                    i17 = 3;
                } finally {
                }
            } else {
                fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar3.m134976x2690a4ac();
                nq3.f fVar3 = nVar3.f347064p;
                fVar3.getClass();
                h17 = fVar3.f420527a.h(java.lang.String.format("SELECT * FROM %s WHERE status = %s AND priority >= ? AND createtime > ? AND filesize <= ? ORDER BY priority DESC, createtime DESC LIMIT 1;", "C2CMsgAutoDownloadFile", 1), new java.lang.String[]{java.lang.String.valueOf(f17), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 432000000), java.lang.String.valueOf(j17)});
                try {
                    if (h17.moveToNext()) {
                        r45.qc a18 = fVar3.a(h17);
                        h17.close();
                        qcVar = a18;
                    } else {
                        h17.close();
                        qcVar = null;
                    }
                    i17 = 2;
                } finally {
                }
            }
            if (qcVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "autodownloadfile is null %d %.2f", java.lang.Long.valueOf(j17), java.lang.Float.valueOf(f17));
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(qcVar.f465352e, qcVar.f465359o);
            if (o27 == null) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                nVar4.f347064p.b(qcVar.f465351d, qcVar.f465359o);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "invalid auto download file info");
                return;
            }
            ot0.q v17 = ot0.q.v((com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(o27.Q0()) && o27.A0() == 0) ? c01.w9.u(o27.j()) : o27.j());
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "appMsgContent is null");
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.m134976x2690a4ac();
                nVar5.f347064p.b(qcVar.f465351d, qcVar.f465359o);
                return;
            }
            if (qcVar.f465354g == 2) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(java.lang.Long.valueOf(qcVar.f465351d).longValue(), o27.Q0());
                if (J0 == null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
                    java.lang.String t17 = lp0.b.t();
                    java.lang.String n17 = v17.n();
                    java.lang.String str2 = v17.f430223o;
                    com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(t17);
                    java.lang.String str3 = a19.f294812f;
                    if (str3 != null) {
                        i18 = i17;
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                        if (str3.equals(l17)) {
                            cls = fq3.n.class;
                        } else {
                            cls = fq3.n.class;
                            a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l17, a19.f294813g, a19.f294814h);
                        }
                    } else {
                        cls = fq3.n.class;
                        i18 = i17;
                    }
                    com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                    com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a19, null);
                    if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a19, m17);
                        if (m18.a()) {
                            m18.f294799a.r(m18.f294800b);
                        }
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                        str = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            str = str + "." + str2;
                        }
                    } else {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !n17.endsWith(str2)) {
                            n17 = n17 + "." + str2;
                        }
                        java.lang.String str4 = t17 + n17;
                        if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                            int i27 = 1;
                            while (true) {
                                if (i27 >= 20) {
                                    str = str4;
                                    i19 = 20;
                                    break;
                                }
                                if (!com.p314xaae8f345.mm.vfs.w6.j(t17 + i27 + "_" + n17)) {
                                    str = t17 + i27 + "_" + n17;
                                    i19 = 20;
                                    break;
                                }
                                i27++;
                            }
                            if (i27 == i19) {
                                str = t17 + "da_" + java.lang.System.currentTimeMillis();
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                    str = str + "." + str2;
                                }
                            }
                        } else {
                            str = str4;
                        }
                    }
                    try {
                        if (!new com.p314xaae8f345.mm.vfs.r6(str).s().o().equalsIgnoreCase(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(t17)).o())) {
                            str = t17 + "da_" + java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Priority.PriorityUtil", "maybe DirTraversal attach. %s", str);
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Priority.PriorityUtil", e17, "", new java.lang.Object[0]);
                        str = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            str = str + "." + str2;
                        }
                    }
                    dVar.f68099xfeae815 = str;
                    dVar.f68094x28d45f97 = v17.f430179d;
                    dVar.f68110xfc39fee = v17.f430183e;
                    dVar.f68105x2c1f0acb = v17.f430227p;
                    dVar.f68113xeb1a61d6 = v17.f430215m;
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                    dVar.f68112x10a0fed7 = 101;
                    dVar.f68101x13f40970 = false;
                    dVar.f68096xac3be4e = c01.id.a();
                    dVar.f68103x4a777c2 = c01.id.e();
                    dVar.f68106x315a5445 = java.lang.Long.valueOf(qcVar.f465351d).longValue();
                    dVar.f68107xaaaa6883 = o27.Q0();
                    dVar.f68108x6a1cf14e = 0L;
                    dVar.f68114x2262335f = v17.f430247u;
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo880xb970c2b9(dVar);
                    J0 = dVar;
                } else {
                    cls = fq3.n.class;
                    i18 = i17;
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(J0.f68099xfeae815);
                if (r6Var.m() && r6Var.C() == J0.f68113xeb1a61d6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "file already exist");
                    fq3.n nVar6 = (fq3.n) i95.n0.c(cls);
                    nVar6.m134976x2690a4ac();
                    nVar6.f347064p.f(qcVar.f465351d, qcVar.f465359o, 5);
                    jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 8L, 1L, false);
                    return;
                }
                fq3.n nVar7 = (fq3.n) i95.n0.c(cls);
                nVar7.m134976x2690a4ac();
                nVar7.f347064p.f(qcVar.f465351d, qcVar.f465359o, 2);
                cVar = this;
                cVar.f420524d.f420525d = qcVar.f465351d;
                ((ku5.t0) ku5.t0.f394148d).B(new nq3.b(cVar, o27, v17));
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 0L, 1L, false);
                oq3.h e18 = oq3.k.f428927a.e(o27.G);
                ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Di(4L, qcVar.f465359o, qcVar.f465352e, kq3.i.b(qcVar.f465363s), e18.f428919b, e18.f428920c, qcVar.f465355h);
            } else {
                i18 = i17;
                java.util.Iterator it = bt3.g2.A(v17.f430196h0).f468998f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if (gp0Var.T.equals(qcVar.f465351d)) {
                        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0(cVar.f420524d);
                        if (bt3.g2.O(gp0Var, o27.Q0(), o27.m124847x74d37ac6(), true)) {
                            cVar.f420524d.f420525d = qcVar.f465351d;
                            jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 1L, 1L, false);
                        } else {
                            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(cVar.f420524d);
                        }
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f420524d.f420525d)) {
                return;
            }
            int i28 = i18;
            if (i28 == 1) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 6L, 1L, false);
            } else if (i28 == 2) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 7L, 1L, false);
            } else if (i28 == 3) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1241L, 9L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "downloading file way:%d currentId %s", java.lang.Integer.valueOf(i28), cVar.f420524d.f420525d);
        } finally {
        }
    }
}
