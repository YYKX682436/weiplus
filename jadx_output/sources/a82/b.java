package a82;

/* loaded from: classes12.dex */
public class b extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f1971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f1971f = jz5.h.b(new a82.a(service));
    }

    public final void T6(o72.e2 cdnInfo) {
        kotlin.jvm.internal.o.g(cdnInfo, "cdnInfo");
        o72.s2.d(o72.s2.f(cdnInfo.field_favLocalId), "dealWithStatus: localId=%d, dataId=%s, type=%d, status=%d", java.lang.Long.valueOf(cdnInfo.field_favLocalId), cdnInfo.field_dataId, java.lang.Integer.valueOf(cdnInfo.field_type), java.lang.Integer.valueOf(cdnInfo.field_status));
        int i17 = cdnInfo.field_type;
        if (i17 == 0) {
            o72.x1.S0(cdnInfo);
        } else if (i17 == 1) {
            o72.x1.P0(cdnInfo);
        }
    }

    public final boolean U6(r45.bq0 bq0Var, o72.e2 e2Var) {
        java.util.LinkedList<r45.gp0> linkedList;
        if (bq0Var != null && (linkedList = bq0Var.f370964f) != null) {
            for (r45.gp0 gp0Var : linkedList) {
                if (kotlin.jvm.internal.o.b(e2Var.field_dataId, gp0Var.T)) {
                    gp0Var.a0(e2Var.field_cdnKey);
                    gp0Var.b0(e2Var.field_cdnUrl);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest data key and url updated, md5:%s, cdnUrl:%s", e2Var.field_dataId, e2Var.field_cdnUrl);
                    if (com.tencent.mm.vfs.w6.j(e2Var.field_path) && gp0Var.R != com.tencent.mm.vfs.w6.k(e2Var.field_path)) {
                        long k17 = com.tencent.mm.vfs.w6.k(e2Var.field_path);
                        gp0Var.q0(k17);
                        java.lang.String p17 = com.tencent.mm.vfs.w6.p(e2Var.field_path);
                        java.lang.String f17 = kk.k.f(e2Var.field_path, 0, 256);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem " + gp0Var.T + "  fullSize:" + k17 + ", dataMd5:" + p17 + ", dataShortMd5:" + f17);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(p17) || com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem dataMd5 or dataShortMd5 is null");
                        } else {
                            gp0Var.p0(p17);
                            gp0Var.r0(f17);
                        }
                        java.lang.String x17 = o72.x1.x(gp0Var);
                        if (((x17 == null || x17.length() == 0) ? 1 : 0) == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem move file:" + com.tencent.mm.vfs.w6.x(e2Var.field_path, x17, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k17 + ", md5:" + p17);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite2 dataitem size and md5, fullSize:" + k17 + ", dataMd5:" + p17);
                    }
                    return true;
                }
                if (kotlin.jvm.internal.o.b(e2Var.field_dataId, o72.x1.W(gp0Var.T))) {
                    gp0Var.c0(e2Var.field_cdnKey);
                    gp0Var.d0(e2Var.field_cdnUrl);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish nest thumb key and url updated, md5:%s, cdnUrl:%s", e2Var.field_dataId, e2Var.field_cdnUrl);
                    return true;
                }
                if (o72.x1.h0(gp0Var.I) && U6(gp0Var.f375451y2, e2Var)) {
                    o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
                    r45.bq0 bq0Var2 = gp0Var.f375451y2;
                    java.lang.String str = bq0Var2 != null ? bq0Var2.f370972q : null;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = bq0Var2 != null ? bq0Var2.f370974s : null;
                    java.lang.String str3 = str2 != null ? str2 : "";
                    kotlin.jvm.internal.o.f(bq0Var2, "getProtoItem(...)");
                    gp0Var.C0(((com.tencent.mm.pluginsdk.model.v1) t4Var).wi(str, str3, bq0Var2, gp0Var.I));
                    java.lang.String msg = "RecordInfo update, upload cdn, dataId:" + gp0Var.T + ", dataItem.recordInfo:" + gp0Var.Z1;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (msg.length() <= 2000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", msg);
                    } else {
                        int i17 = 1;
                        while (r0 < msg.length()) {
                            int min = java.lang.Math.min(r0 + 2000, msg.length());
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LogLong Part ");
                            sb6.append(i17);
                            sb6.append("] ");
                            java.lang.String substring = msg.substring(r0, min);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            sb6.append(substring);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", sb6.toString());
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
        kotlin.jvm.internal.o.g(info, "info");
        if (info.field_totalLen > 26214400) {
            return 10007;
        }
        if ((info.field_extFlag & 1) == 0) {
            return i17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "NEED To Exchange Type, defType %d", java.lang.Integer.valueOf(i17));
        return 10002 == i17 ? 10001 : 10002;
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope W6() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f1971f).getValue();
    }

    public final void X6(o72.e2 cdnInfo, dn.h completeResult) {
        iz4.r a17;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(cdnInfo, "cdnInfo");
        kotlin.jvm.internal.o.g(completeResult, "completeResult");
        java.lang.String f17 = o72.s2.f(cdnInfo.field_favLocalId);
        boolean z17 = false;
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish getFavItemInfoStorage null!");
            o72.s2.j("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "ERR_INVALID_PARAMETER", "onCdnTranFinish", cdnInfo.field_favLocalId, 0, "FavItemInfoStorage is null", new java.lang.Object[0]);
            return;
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(cdnInfo.field_favLocalId);
        if (F == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish item info null!");
            o72.s2.j("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "ERR_INVALID_PARAMETER", "onCdnTranFinish", cdnInfo.field_favLocalId, 0, "ItemInfo is null", new java.lang.Object[0]);
            return;
        }
        o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "onCdnTranFinish: localId=%d, favId=%d, dataId=%s, cdnType=%d, cdnUrl=%s", java.lang.Long.valueOf(cdnInfo.field_favLocalId), java.lang.Integer.valueOf(F.field_id), cdnInfo.field_dataId, java.lang.Integer.valueOf(cdnInfo.field_type), o72.s2.n(completeResult.field_fileId));
        java.util.Iterator it = F.field_favProto.f370964f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (kotlin.jvm.internal.o.b(cdnInfo.field_dataId, gp0Var.T)) {
                gp0Var.a0(cdnInfo.field_cdnKey);
                gp0Var.b0(cdnInfo.field_cdnUrl);
                if (cdnInfo.field_type == 0 && cdnInfo.y0()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "video stream, id:%s", completeResult.field_videoFileId);
                    gp0Var.T0(completeResult.field_videoFileId);
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFav265Switch()) == 1 ? true : z17) {
                        java.lang.String field_path = cdnInfo.field_path;
                        kotlin.jvm.internal.o.f(field_path, "field_path");
                        java.lang.String H = o72.x1.H();
                        kotlin.jvm.internal.o.f(H, "getFavVideoTransferDir(...)");
                        if (r26.i0.y(field_path, H, z17)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, path:" + cdnInfo.field_path);
                            if (com.tencent.mm.vfs.w6.j(cdnInfo.field_path)) {
                                long k17 = com.tencent.mm.vfs.w6.k(cdnInfo.field_path);
                                java.lang.String p17 = com.tencent.mm.vfs.w6.p(cdnInfo.field_path);
                                gp0Var.q0(k17);
                                gp0Var.p0(p17);
                                java.lang.String x17 = o72.x1.x(gp0Var);
                                str = f17;
                                if (!(x17 == null || x17.length() == 0)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "move file:" + com.tencent.mm.vfs.w6.x(cdnInfo.field_path, x17, true) + ", rewrite dataitem size and md5, fileSize:" + k17 + ", md5:" + p17);
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fileSize:" + k17 + ", md5:" + p17);
                            } else {
                                str = f17;
                                long j17 = cdnInfo.field_totalLen;
                                gp0Var.q0(j17);
                                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, transfer video not exist, fileSize:" + j17);
                            }
                            if (cdnInfo.field_type == 0 || !com.tencent.mm.sdk.platformtools.y1.f(cdnInfo.field_path)) {
                                str2 = dm.i4.COL_LOCALID;
                            } else {
                                if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavWxamSwitch()) == 1) {
                                    java.lang.String field_path2 = cdnInfo.field_path;
                                    kotlin.jvm.internal.o.f(field_path2, "field_path");
                                    java.lang.String z18 = o72.x1.z();
                                    kotlin.jvm.internal.o.f(z18, "getFavImgTransferDir(...)");
                                    if (r26.i0.y(field_path2, z18, false)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite image dataitem size and md5, path:" + cdnInfo.field_path);
                                        if (com.tencent.mm.vfs.w6.j(cdnInfo.field_path)) {
                                            long k18 = com.tencent.mm.vfs.w6.k(cdnInfo.field_path);
                                            java.lang.String p18 = com.tencent.mm.vfs.w6.p(cdnInfo.field_path);
                                            gp0Var.q0(k18);
                                            gp0Var.p0(p18);
                                            java.lang.String x18 = o72.x1.x(gp0Var);
                                            if (x18 == null || x18.length() == 0) {
                                                str2 = dm.i4.COL_LOCALID;
                                            } else {
                                                java.lang.String str3 = cdnInfo.field_path;
                                                str2 = dm.i4.COL_LOCALID;
                                                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "move file:" + com.tencent.mm.vfs.w6.x(str3, x18, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k18 + ", md5:" + p18);
                                            }
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fileSize:" + k18 + ", md5:" + p18);
                                        } else {
                                            str2 = dm.i4.COL_LOCALID;
                                            long j18 = cdnInfo.field_totalLen;
                                            gp0Var.q0(j18);
                                            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, transfer image not exist, fileSize:" + j18);
                                        }
                                    }
                                }
                                str2 = dm.i4.COL_LOCALID;
                                if (com.tencent.mm.vfs.w6.j(cdnInfo.field_path) && gp0Var.R != com.tencent.mm.vfs.w6.k(cdnInfo.field_path)) {
                                    long k19 = com.tencent.mm.vfs.w6.k(cdnInfo.field_path);
                                    gp0Var.q0(k19);
                                    java.lang.String p19 = com.tencent.mm.vfs.w6.p(cdnInfo.field_path);
                                    java.lang.String f18 = kk.k.f(cdnInfo.field_path, 0, 256);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem " + gp0Var.T + "  fullSize:" + k19 + ", dataMd5:" + p19 + ", dataShortMd5:" + f18);
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(p19) || com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem dataMd5 or dataShortMd5 is null");
                                    } else {
                                        gp0Var.p0(p19);
                                        gp0Var.r0(f18);
                                    }
                                    java.lang.String x19 = o72.x1.x(gp0Var);
                                    if (!(x19 == null || x19.length() == 0)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem move file:" + com.tencent.mm.vfs.w6.x(cdnInfo.field_path, x19, true) + ", rewrite dataitem " + gp0Var.T + " size and md5, fileSize:" + k19 + ", md5:" + p19);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "rewrite dataitem size and md5, fullSize:" + k19 + ", dataMd5:" + p19);
                                }
                            }
                            F.field_xml = o72.r2.G0(F);
                            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(F, str2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", cdnInfo.field_dataId, cdnInfo.field_cdnUrl);
                            o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", str, "onCdnTranFinish: data updated, localId=%d, dataId=%s, isStreamMedia=%b", java.lang.Long.valueOf(cdnInfo.field_favLocalId), cdnInfo.field_dataId, java.lang.Boolean.valueOf(cdnInfo.y0()));
                        }
                    }
                }
                str = f17;
                if (cdnInfo.field_type == 0) {
                }
                str2 = dm.i4.COL_LOCALID;
                F.field_xml = o72.r2.G0(F);
                ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(F, str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish data key and url updated, md5:%s, cdnUrl:%s", cdnInfo.field_dataId, cdnInfo.field_cdnUrl);
                o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", str, "onCdnTranFinish: data updated, localId=%d, dataId=%s, isStreamMedia=%b", java.lang.Long.valueOf(cdnInfo.field_favLocalId), cdnInfo.field_dataId, java.lang.Boolean.valueOf(cdnInfo.y0()));
            } else {
                boolean z19 = z17;
                if (kotlin.jvm.internal.o.b(cdnInfo.field_dataId, o72.x1.W(gp0Var.T))) {
                    gp0Var.c0(cdnInfo.field_cdnKey);
                    gp0Var.d0(cdnInfo.field_cdnUrl);
                    F.field_xml = o72.r2.G0(F);
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(F, dm.i4.COL_LOCALID);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "klem onCdnTranFinish thumb key and url updated, md5:%s, cdnUrl:%s", cdnInfo.field_dataId, cdnInfo.field_cdnUrl);
                    o72.s2.g("MicroMsg.Fav.BaseFavCdnServiceFSC", f17, "onCdnTranFinish: thumb updated, localId=%d, dataId=%s", java.lang.Long.valueOf(cdnInfo.field_favLocalId), cdnInfo.field_dataId);
                    break;
                }
                if (o72.x1.h0(gp0Var.I) && U6(gp0Var.f375451y2, cdnInfo)) {
                    o72.t4 t4Var = (o72.t4) i95.n0.c(o72.t4.class);
                    r45.bq0 bq0Var = gp0Var.f375451y2;
                    java.lang.String str4 = bq0Var != null ? bq0Var.f370972q : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String str5 = bq0Var != null ? bq0Var.f370974s : null;
                    java.lang.String str6 = str5 != null ? str5 : "";
                    kotlin.jvm.internal.o.f(bq0Var, "getProtoItem(...)");
                    gp0Var.C0(((com.tencent.mm.pluginsdk.model.v1) t4Var).wi(str4, str6, bq0Var, gp0Var.I));
                    F.field_xml = o72.r2.G0(F);
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(F, dm.i4.COL_LOCALID);
                }
                z17 = z19;
            }
        }
        s72.p0 p0Var = (s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (p0Var.X6() && p0Var.f404133s && p0Var.T6(F)) {
            if (((p0Var.f404130p == null || (a17 = mz4.b0.c().a()) == null) ? -1L : a17.f296140e) == F.field_localId) {
                p0Var.a7();
            } else {
                int i17 = p0Var.f404124g;
                int i18 = F.field_id;
                if (i17 == i18 && i18 != -1) {
                    p0Var.a7();
                    p0Var.a7();
                }
            }
        }
        T6(cdnInfo);
    }

    public final void Y6(int i17, java.lang.String dataId, boolean z17, int i18, int i19) {
        kotlin.jvm.internal.o.g(dataId, "dataId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavCdnServiceFSC", "[reportFavCdnDownloadQuality]: dataType: " + i17 + ", dataId: " + dataId + ", isThumb: " + z17 + ", retCode: " + i18 + ", retryCount: " + i19);
        com.tencent.mm.autogen.mmdata.rpt.FavCdnDownloadQualityStruct favCdnDownloadQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.FavCdnDownloadQualityStruct();
        favCdnDownloadQualityStruct.f56244d = (long) i17;
        favCdnDownloadQualityStruct.f56245e = favCdnDownloadQualityStruct.b("dataId", dataId, true);
        favCdnDownloadQualityStruct.f56246f = z17 ? 1L : 0L;
        favCdnDownloadQualityStruct.f56247g = i18;
        favCdnDownloadQualityStruct.f56248h = i19;
        favCdnDownloadQualityStruct.k();
    }

    public final void Z6(long j17) {
        jx3.f.INSTANCE.idkeyStat(1927L, j17, 1L, false);
    }
}
