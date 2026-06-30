package a82;

/* loaded from: classes12.dex */
public class b extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f83504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f83504f = jz5.h.b(new a82.a(service));
    }

    public final void T6(o72.e2 cdnInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnInfo, "cdnInfo");
        o72.s2.d(o72.s2.f(cdnInfo.f67088x958756b0), "dealWithStatus: localId=%d, dataId=%s, type=%d, status=%d", java.lang.Long.valueOf(cdnInfo.f67088x958756b0), cdnInfo.f67085xf604e54a, java.lang.Integer.valueOf(cdnInfo.f67095x2262335f), java.lang.Integer.valueOf(cdnInfo.f67093x10a0fed7));
        int i17 = cdnInfo.f67095x2262335f;
        if (i17 == 0) {
            o72.x1.S0(cdnInfo);
        } else if (i17 == 1) {
            o72.x1.P0(cdnInfo);
        }
    }

    public final boolean U6(r45.bq0 bq0Var, o72.e2 e2Var) {
        java.util.LinkedList<r45.gp0> linkedList;
        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null) {
            for (r45.gp0 gp0Var : linkedList) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e2Var.f67085xf604e54a, gp0Var.T)) {
                    gp0Var.a0(e2Var.f67083xf47749d7);
                    gp0Var.b0(e2Var.f67084xf47770e7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest data key and url updated, md5:%s, cdnUrl:%s", e2Var.f67085xf604e54a, e2Var.f67084xf47770e7);
                    if (com.p314xaae8f345.mm.vfs.w6.j(e2Var.f67091x2260084a) && gp0Var.R != com.p314xaae8f345.mm.vfs.w6.k(e2Var.f67091x2260084a)) {
                        long k17 = com.p314xaae8f345.mm.vfs.w6.k(e2Var.f67091x2260084a);
                        gp0Var.q0(k17);
                        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(e2Var.f67091x2260084a);
                        java.lang.String f17 = kk.k.f(e2Var.f67091x2260084a, 0, 256);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem " + gp0Var.T + "  fullSize:" + k17 + ", dataMd5:" + p17 + ", dataShortMd5:" + f17);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem dataMd5 or dataShortMd5 is null");
                        } else {
                            gp0Var.p0(p17);
                            gp0Var.r0(f17);
                        }
                        java.lang.String x17 = o72.x1.x(gp0Var);
                        if (((x17 == null || x17.length() == 0) ? 1 : 0) == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem move file:" + com.p314xaae8f345.mm.vfs.w6.x(e2Var.f67091x2260084a, x17, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k17 + ", md5:" + p17);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem size and md5, fullSize:" + k17 + ", dataMd5:" + p17);
                    }
                    return true;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e2Var.f67085xf604e54a, o72.x1.W(gp0Var.T))) {
                    gp0Var.c0(e2Var.f67083xf47749d7);
                    gp0Var.d0(e2Var.f67084xf47770e7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest thumb key and url updated, md5:%s, cdnUrl:%s", e2Var.f67085xf604e54a, e2Var.f67084xf47770e7);
                    return true;
                }
                if (o72.x1.h0(gp0Var.I) && U6(gp0Var.f456984y2, e2Var)) {
                    o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
                    r45.bq0 bq0Var2 = gp0Var.f456984y2;
                    java.lang.String str = bq0Var2 != null ? bq0Var2.f452505q : null;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = bq0Var2 != null ? bq0Var2.f452507s : null;
                    java.lang.String str3 = str2 != null ? str2 : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bq0Var2, "getProtoItem(...)");
                    gp0Var.C0(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.v1) t4Var).wi(str, str3, bq0Var2, gp0Var.I));
                    java.lang.String msg = "RecordInfo update, upload cdn, dataId:" + gp0Var.T + ", dataItem.recordInfo:" + gp0Var.Z1;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                    if (msg.length() <= 2000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", msg);
                    } else {
                        int i17 = 1;
                        while (r0 < msg.length()) {
                            int min = java.lang.Math.min(r0 + 2000, msg.length());
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LogLong Part ");
                            sb6.append(i17);
                            sb6.append("] ");
                            java.lang.String substring = msg.substring(r0, min);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                            sb6.append(substring);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", sb6.toString());
                            i17++;
                            r0 = min;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int V6(o72.e2 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.f67094xeb1a61d6 > 26214400) {
            return 10007;
        }
        if ((info.f67087x26b1b2e8 & 1) == 0) {
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "NEED To Exchange Type, defType %d", java.lang.Integer.valueOf(i17));
        return 10002 == i17 ? 10001 : 10002;
    }

    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a W6() {
        return (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f83504f).mo141623x754a37bb();
    }

    public final void X6(o72.e2 cdnInfo, dn.h completeResult) {
        iz4.r a17;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnInfo, "cdnInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completeResult, "completeResult");
        java.lang.String f17 = o72.s2.f(cdnInfo.f67088x958756b0);
        boolean z17 = false;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish getFavItemInfoStorage null!");
            o72.s2.j("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "ERR_INVALID_PARAMETER", "onCdnTranFinish", cdnInfo.f67088x958756b0, 0, "FavItemInfoStorage is null", new java.lang.Object[0]);
            return;
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(cdnInfo.f67088x958756b0);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish item info null!");
            o72.s2.j("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "ERR_INVALID_PARAMETER", "onCdnTranFinish", cdnInfo.f67088x958756b0, 0, "ItemInfo is null", new java.lang.Object[0]);
            return;
        }
        o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "onCdnTranFinish: localId=%d, favId=%d, dataId=%s, cdnType=%d, cdnUrl=%s", java.lang.Long.valueOf(cdnInfo.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), cdnInfo.f67085xf604e54a, java.lang.Integer.valueOf(cdnInfo.f67095x2262335f), o72.s2.n(completeResult.f69522xf9dbbe9c));
        java.util.Iterator it = F.f67640x5ab01132.f452497f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cdnInfo.f67085xf604e54a, gp0Var.T)) {
                gp0Var.a0(cdnInfo.f67083xf47749d7);
                gp0Var.b0(cdnInfo.f67084xf47770e7);
                if (cdnInfo.f67095x2262335f == 0 && cdnInfo.y0()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "video stream, id:%s", completeResult.f69569x931c604d);
                    gp0Var.T0(completeResult.f69569x931c604d);
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20246x24701f66()) == 1 ? true : z17) {
                        java.lang.String field_path = cdnInfo.f67091x2260084a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_path, "field_path");
                        java.lang.String H = o72.x1.H();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(H, "getFavVideoTransferDir(...)");
                        if (r26.i0.y(field_path, H, z17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, path:" + cdnInfo.f67091x2260084a);
                            if (com.p314xaae8f345.mm.vfs.w6.j(cdnInfo.f67091x2260084a)) {
                                long k17 = com.p314xaae8f345.mm.vfs.w6.k(cdnInfo.f67091x2260084a);
                                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(cdnInfo.f67091x2260084a);
                                gp0Var.q0(k17);
                                gp0Var.p0(p17);
                                java.lang.String x17 = o72.x1.x(gp0Var);
                                str = f17;
                                if (!(x17 == null || x17.length() == 0)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "move file:" + com.p314xaae8f345.mm.vfs.w6.x(cdnInfo.f67091x2260084a, x17, true) + ", rewrite dataitem size and md5, fileSize:" + k17 + ", md5:" + p17);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fileSize:" + k17 + ", md5:" + p17);
                            } else {
                                str = f17;
                                long j17 = cdnInfo.f67094xeb1a61d6;
                                gp0Var.q0(j17);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, transfer video not exist, fileSize:" + j17);
                            }
                            if (cdnInfo.f67095x2262335f == 0 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(cdnInfo.f67091x2260084a)) {
                                str2 = dm.i4.f66867x2a5c95c7;
                            } else {
                                if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20253xef3d9240()) == 1) {
                                    java.lang.String field_path2 = cdnInfo.f67091x2260084a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_path2, "field_path");
                                    java.lang.String z18 = o72.x1.z();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z18, "getFavImgTransferDir(...)");
                                    if (r26.i0.y(field_path2, z18, false)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite image dataitem size and md5, path:" + cdnInfo.f67091x2260084a);
                                        if (com.p314xaae8f345.mm.vfs.w6.j(cdnInfo.f67091x2260084a)) {
                                            long k18 = com.p314xaae8f345.mm.vfs.w6.k(cdnInfo.f67091x2260084a);
                                            java.lang.String p18 = com.p314xaae8f345.mm.vfs.w6.p(cdnInfo.f67091x2260084a);
                                            gp0Var.q0(k18);
                                            gp0Var.p0(p18);
                                            java.lang.String x18 = o72.x1.x(gp0Var);
                                            if (x18 == null || x18.length() == 0) {
                                                str2 = dm.i4.f66867x2a5c95c7;
                                            } else {
                                                java.lang.String str3 = cdnInfo.f67091x2260084a;
                                                str2 = dm.i4.f66867x2a5c95c7;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "move file:" + com.p314xaae8f345.mm.vfs.w6.x(str3, x18, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k18 + ", md5:" + p18);
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fileSize:" + k18 + ", md5:" + p18);
                                        } else {
                                            str2 = dm.i4.f66867x2a5c95c7;
                                            long j18 = cdnInfo.f67094xeb1a61d6;
                                            gp0Var.q0(j18);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, transfer image not exist, fileSize:" + j18);
                                        }
                                    }
                                }
                                str2 = dm.i4.f66867x2a5c95c7;
                                if (com.p314xaae8f345.mm.vfs.w6.j(cdnInfo.f67091x2260084a) && gp0Var.R != com.p314xaae8f345.mm.vfs.w6.k(cdnInfo.f67091x2260084a)) {
                                    long k19 = com.p314xaae8f345.mm.vfs.w6.k(cdnInfo.f67091x2260084a);
                                    gp0Var.q0(k19);
                                    java.lang.String p19 = com.p314xaae8f345.mm.vfs.w6.p(cdnInfo.f67091x2260084a);
                                    java.lang.String f18 = kk.k.f(cdnInfo.f67091x2260084a, 0, 256);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem " + gp0Var.T + "  fullSize:" + k19 + ", dataMd5:" + p19 + ", dataShortMd5:" + f18);
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p19) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f18)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem dataMd5 or dataShortMd5 is null");
                                    } else {
                                        gp0Var.p0(p19);
                                        gp0Var.r0(f18);
                                    }
                                    java.lang.String x19 = o72.x1.x(gp0Var);
                                    if (!(x19 == null || x19.length() == 0)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem move file:" + com.p314xaae8f345.mm.vfs.w6.x(cdnInfo.f67091x2260084a, x19, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k19 + ", md5:" + p19);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fullSize:" + k19 + ", dataMd5:" + p19);
                                }
                            }
                            F.f67660x4b6e9352 = o72.r2.G0(F);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(F, str2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", cdnInfo.f67085xf604e54a, cdnInfo.f67084xf47770e7);
                            o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", str, "onCdnTranFinish: data updated, localId=%d, dataId=%s, isStreamMedia=%b", java.lang.Long.valueOf(cdnInfo.f67088x958756b0), cdnInfo.f67085xf604e54a, java.lang.Boolean.valueOf(cdnInfo.y0()));
                        }
                    }
                }
                str = f17;
                if (cdnInfo.f67095x2262335f == 0) {
                }
                str2 = dm.i4.f66867x2a5c95c7;
                F.f67660x4b6e9352 = o72.r2.G0(F);
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(F, str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", cdnInfo.f67085xf604e54a, cdnInfo.f67084xf47770e7);
                o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", str, "onCdnTranFinish: data updated, localId=%d, dataId=%s, isStreamMedia=%b", java.lang.Long.valueOf(cdnInfo.f67088x958756b0), cdnInfo.f67085xf604e54a, java.lang.Boolean.valueOf(cdnInfo.y0()));
            } else {
                boolean z19 = z17;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cdnInfo.f67085xf604e54a, o72.x1.W(gp0Var.T))) {
                    gp0Var.c0(cdnInfo.f67083xf47749d7);
                    gp0Var.d0(cdnInfo.f67084xf47770e7);
                    F.f67660x4b6e9352 = o72.r2.G0(F);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(F, dm.i4.f66867x2a5c95c7);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish thumb key and url updated, md5:%s, cdnUrl:%s", cdnInfo.f67085xf604e54a, cdnInfo.f67084xf47770e7);
                    o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "onCdnTranFinish: thumb updated, localId=%d, dataId=%s", java.lang.Long.valueOf(cdnInfo.f67088x958756b0), cdnInfo.f67085xf604e54a);
                    break;
                }
                if (o72.x1.h0(gp0Var.I) && U6(gp0Var.f456984y2, cdnInfo)) {
                    o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
                    r45.bq0 bq0Var = gp0Var.f456984y2;
                    java.lang.String str4 = bq0Var != null ? bq0Var.f452505q : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String str5 = bq0Var != null ? bq0Var.f452507s : null;
                    java.lang.String str6 = str5 != null ? str5 : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bq0Var, "getProtoItem(...)");
                    gp0Var.C0(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.v1) t4Var).wi(str4, str6, bq0Var, gp0Var.I));
                    F.f67660x4b6e9352 = o72.r2.G0(F);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(F, dm.i4.f66867x2a5c95c7);
                }
                z17 = z19;
            }
        }
        s72.p0 p0Var = (s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (p0Var.X6() && p0Var.f485666s && p0Var.T6(F)) {
            if (((p0Var.f485663p == null || (a17 = mz4.b0.c().a()) == null) ? -1L : a17.f377673e) == F.f67645x88be67a1) {
                p0Var.a7();
            } else {
                int i17 = p0Var.f485657g;
                int i18 = F.f67643xc8a07680;
                if (i17 == i18 && i18 != -1) {
                    p0Var.a7();
                    p0Var.a7();
                }
            }
        }
        T6(cdnInfo);
    }

    public final void Y6(int i17, java.lang.String dataId, boolean z17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "[reportFavCdnDownloadQuality]: dataType: " + i17 + ", dataId: " + dataId + ", isThumb: " + z17 + ", retCode: " + i18 + ", retryCount: " + i19);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6439xecd315fa c6439xecd315fa = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6439xecd315fa();
        c6439xecd315fa.f137777d = (long) i17;
        c6439xecd315fa.f137778e = c6439xecd315fa.b("dataId", dataId, true);
        c6439xecd315fa.f137779f = z17 ? 1L : 0L;
        c6439xecd315fa.f137780g = i18;
        c6439xecd315fa.f137781h = i19;
        c6439xecd315fa.k();
    }

    public final void Z6(long j17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(1927L, j17, 1L, false);
    }
}
