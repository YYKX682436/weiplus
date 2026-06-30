package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.y1 f92969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f92970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f92971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f92972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo f92973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f92974i;

    public z1(com.tencent.mm.plugin.backup.roambackup.y1 y1Var, com.tencent.wechat.aff.affroam.g gVar, qo1.j0 j0Var, po1.d dVar, com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo, yz5.l lVar) {
        this.f92969d = y1Var;
        this.f92970e = gVar;
        this.f92971f = j0Var;
        this.f92972g = dVar;
        this.f92973h = backupRangeInfo;
        this.f92974i = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String message;
        long j17;
        long j18;
        long j19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start report for pageAction=");
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = this.f92969d;
        sb6.append(y1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = y1Var.f92964d;
        roamBackupRecoverReport28098Struct.f60067e = y1Var.f92965e;
        com.tencent.wechat.aff.affroam.g gVar = this.f92970e;
        po1.d dVar = this.f92972g;
        if (dVar == null) {
            if (gVar != null) {
                po1.c cVar = po1.d.f357294i;
                com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
                kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
                dVar = cVar.a(uVar);
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            str = dVar.f357295a;
            roamBackupRecoverReport28098Struct.f60069g = roamBackupRecoverReport28098Struct.b("ToDeviceID", str, true);
            int ordinal = dVar.f357296b.ordinal();
            if (ordinal == 0) {
                j19 = 2;
            } else if (ordinal == 1) {
                j19 = 3;
            } else if (ordinal == 2) {
                j19 = 5;
            } else if (ordinal == 3) {
                j19 = 1;
            } else {
                if (ordinal != 4) {
                    throw new jz5.j();
                }
                j19 = 0;
            }
            roamBackupRecoverReport28098Struct.f60068f = j19;
        } else {
            str = null;
        }
        if (str != null) {
            com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
            com.tencent.mm.plugin.backup.roambackup.n nVar = (com.tencent.mm.plugin.backup.roambackup.n) com.tencent.mm.plugin.backup.roambackup.r0.f92689f.get(str);
            if (nVar == null) {
                nVar = com.tencent.mm.plugin.backup.roambackup.n.f92657d;
            }
            int ordinal2 = nVar.ordinal();
            if (ordinal2 == 0) {
                j18 = 0;
            } else if (ordinal2 == 1) {
                j18 = 1;
            } else if (ordinal2 == 2) {
                j18 = 2;
            } else {
                if (ordinal2 != 3) {
                    throw new jz5.j();
                }
                j18 = 3;
            }
            roamBackupRecoverReport28098Struct.A = j18;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = this.f92973h;
        if (gVar != null) {
            roamBackupRecoverReport28098Struct.f60079q = gVar.f215829d;
            roamBackupRecoverReport28098Struct.f60071i = ((gVar.f215835m & 1) != 0) != false ? 1L : 0L;
            roamBackupRecoverReport28098Struct.f60086x = gVar.f215837o.f215838d;
            if (backupRangeInfo == null) {
                po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
                com.tencent.wechat.aff.affroam.i iVar = gVar.f215834i;
                kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
                backupRangeInfo = aVar.a(iVar);
            }
        }
        if (backupRangeInfo != null) {
            roamBackupRecoverReport28098Struct.f60080r = backupRangeInfo.f92730d == po1.b.f357289d ? 1 : 0;
            java.util.List list = backupRangeInfo.f92731e;
            roamBackupRecoverReport28098Struct.f60081s = list.size();
            java.util.List list2 = backupRangeInfo.f92732f;
            roamBackupRecoverReport28098Struct.f60082t = list2.size();
            po1.b bVar = backupRangeInfo.f92730d;
            roamBackupRecoverReport28098Struct.f60083u = bVar == po1.b.f357291f ? 1 : 0;
            long j27 = backupRangeInfo.f92733g;
            roamBackupRecoverReport28098Struct.f60084v = j27 > 0 ? 1 : 0;
            roamBackupRecoverReport28098Struct.C = j27;
            roamBackupRecoverReport28098Struct.D = backupRangeInfo.f92734h;
            int ordinal3 = bVar.ordinal();
            if (ordinal3 == 0) {
                j17 = 0;
            } else if (ordinal3 == 1) {
                j17 = ((list2.isEmpty() ^ true) && (list.isEmpty() ^ true)) ? 3L : list2.isEmpty() ^ true ? 2L : 1L;
            } else {
                if (ordinal3 != 2) {
                    throw new jz5.j();
                }
                j17 = 4;
            }
            roamBackupRecoverReport28098Struct.B = j17;
        }
        roamBackupRecoverReport28098Struct.f60085w = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.h(false).size();
        com.tencent.wechat.aff.affroam.i0 g17 = gVar != null ? com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().g(gVar.f215829d) : null;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        qo1.j0 j0Var = this.f92971f;
        if (j0Var == null) {
            j0Var = gVar != null ? qo1.j1.f365523a.d(gVar.f215829d) : null;
        }
        if (j0Var != null && (j0Var instanceof qo1.f0)) {
            if (y1Var == com.tencent.mm.plugin.backup.roambackup.y1.C1) {
                linkedHashMap.put("errno", java.lang.Long.valueOf(((qo1.i0) ((qo1.f0) j0Var).d().f302834e).f365519d));
            }
            qo1.f0 f0Var = (qo1.f0) j0Var;
            com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
            if (a2Var != null) {
                com.tencent.wechat.aff.affroam.m0 a17 = a2Var.a();
                com.tencent.wechat.aff.affroam.p0 c17 = a2Var.c();
                roamBackupRecoverReport28098Struct.f60070h = roamBackupRecoverReport28098Struct.b("BackupSessionID", a17.f215902d, true);
                roamBackupRecoverReport28098Struct.f60087y = c17.f215950h;
                roamBackupRecoverReport28098Struct.f60088z = f0Var.f365489o;
                if (g17 != null) {
                    roamBackupRecoverReport28098Struct.f60075m = g17.f215849m;
                    roamBackupRecoverReport28098Struct.f60077o = g17.f215850n;
                    roamBackupRecoverReport28098Struct.f60072j = g17.f215847h;
                    roamBackupRecoverReport28098Struct.f60073k = g17.f215846g;
                    roamBackupRecoverReport28098Struct.f60076n = g17.f215851o;
                    roamBackupRecoverReport28098Struct.f60074l = g17.f215848i;
                    linkedHashMap.put("beginDuration", java.lang.Long.valueOf(g17.f215853q));
                    linkedHashMap.put("endDuration", java.lang.Long.valueOf(g17.f215854r));
                    linkedHashMap.put("fullDiffConvCount", java.lang.Long.valueOf(g17.f215856t));
                    linkedHashMap.put("limitedFullDiffConvCount", java.lang.Long.valueOf(g17.f215857u));
                    linkedHashMap.put("importingDuration", java.lang.Long.valueOf(g17.f215855s));
                    linkedHashMap.put("prevBackupTime", java.lang.Long.valueOf(gVar.f215837o.f215839e));
                    linkedHashMap.put("uploadMsgSize", java.lang.Long.valueOf(g17.f215858v));
                    linkedHashMap.put("uploadMediaSize", java.lang.Long.valueOf(g17.f215859w));
                    linkedHashMap.put("uploadIndexSize", java.lang.Long.valueOf(g17.f215860x));
                }
            }
            roamBackupRecoverReport28098Struct.f60078p = f0Var.f365476b.f215937d;
        }
        try {
            java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            message = r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamReport28098", e17, "json error", new java.lang.Object[0]);
            message = e17.getMessage();
        }
        roamBackupRecoverReport28098Struct.p(message);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "extraInfo = " + roamBackupRecoverReport28098Struct.E);
        roamBackupRecoverReport28098Struct.G = !((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ui() ? 1 : 0;
        yz5.l lVar = this.f92974i;
        if (lVar != null) {
            lVar.invoke(roamBackupRecoverReport28098Struct);
        }
        roamBackupRecoverReport28098Struct.k();
    }
}
