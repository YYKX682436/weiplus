package bt3;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static bt3.l0 f24214a;

    public static com.tencent.mm.pluginsdk.model.app.d a(java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str2);
        if (J0 == null) {
            J0 = new com.tencent.mm.pluginsdk.model.app.d();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                J0 = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
                long V = com.tencent.mm.sdk.platformtools.t8.V(str, -1L);
                if (V != -1) {
                    ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).z0(V, J0);
                    if (J0.systemRowid != V && ((J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str)) == null || !J0.field_mediaSvrId.equals(str))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
                        J0 = null;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
                } else {
                    J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str);
                    if (J0 == null || !J0.field_mediaSvrId.equals(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
                        J0 = null;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
                }
            }
        }
        if (J0 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(J0.systemRowid);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(J0.field_isUpload);
            java.lang.String str3 = J0.field_fileFullPath;
            java.lang.Long valueOf3 = java.lang.Long.valueOf(J0.field_totalLen);
            java.lang.Long valueOf4 = java.lang.Long.valueOf(J0.field_offset);
            java.lang.String str4 = J0.field_mediaSvrId;
            java.lang.String str5 = J0.field_mediaId;
            java.lang.Long valueOf5 = java.lang.Long.valueOf(J0.field_msgInfoId);
            java.lang.Long valueOf6 = java.lang.Long.valueOf(J0.field_type);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", J0, valueOf, valueOf2, str3, valueOf3, valueOf4, str4, str5, valueOf5, valueOf6, new com.tencent.mm.sdk.platformtools.z3());
        } else {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
        }
        return J0;
    }

    public static java.lang.String b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", java.lang.Long.valueOf(j17), str2, str4);
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        if (str4 == null) {
            java.lang.String t17 = lp0.b.t();
            java.lang.String n17 = v17.n();
            java.lang.String str5 = v17.f348690o;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(t17);
            java.lang.String str6 = a17.f213279f;
            if (str6 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
                if (!str6.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    str4 = str4 + "." + str5;
                }
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && !n17.endsWith(str5)) {
                    n17 = n17 + "." + str5;
                }
                java.lang.String str7 = t17 + n17;
                if (com.tencent.mm.vfs.w6.j(str7)) {
                    int i17 = 1;
                    while (true) {
                        if (i17 >= 20) {
                            str4 = str7;
                            break;
                        }
                        if (!com.tencent.mm.vfs.w6.j(t17 + i17 + "_" + n17)) {
                            str4 = t17 + i17 + "_" + n17;
                            break;
                        }
                        i17++;
                    }
                    if (i17 == 20) {
                        str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            str4 = str4 + "." + str5;
                        }
                    }
                } else {
                    str4 = str7;
                }
            }
            try {
                if (!new com.tencent.mm.vfs.r6(str4).s().o().equalsIgnoreCase(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(t17)).o())) {
                    str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str4);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
                str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    str4 = str4 + "." + str5;
                }
            }
        }
        java.lang.String str8 = str4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348694p) && !com.tencent.mm.sdk.platformtools.t8.K0(v17.L)) {
            v17.f348694p = "" + v17.L.hashCode();
        }
        int i18 = v17.f348650e;
        java.lang.String str9 = v17.f348646d;
        java.lang.String str10 = v17.f348694p;
        long j18 = v17.f348682m;
        int i19 = v17.f348666i;
        int i27 = v17.f348714u;
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_fileFullPath = str8;
        dVar.field_appId = str9;
        dVar.field_sdkVer = i18;
        dVar.field_mediaSvrId = str10;
        dVar.field_totalLen = j18;
        ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = c01.id.a();
        dVar.field_lastModifyTime = c01.id.e();
        dVar.field_msgInfoId = j17;
        dVar.field_msgInfoTalker = str;
        dVar.field_netTimes = 0L;
        dVar.field_type = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", java.lang.Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).insert(dVar)), java.lang.Long.valueOf(dVar.systemRowid), java.lang.Long.valueOf(dVar.field_totalLen), java.lang.Long.valueOf(dVar.field_type), java.lang.Integer.valueOf(i27), str8, new com.tencent.mm.sdk.platformtools.z3());
        return str10;
    }

    public static boolean c(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.d dVar) {
        if (dVar == null || !com.tencent.mm.vfs.w6.j(dVar.field_fileFullPath)) {
            return false;
        }
        return dVar.t0() || (f9Var.A0() == 1 && dVar.field_isUpload);
    }

    public static void d(long j17) {
        ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).b1(j17, 198L);
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).z0(j17, dVar);
        long j18 = dVar.field_msgInfoId;
        if (j18 <= 0) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, j18);
        if (Li.getMsgId() != dVar.field_msgInfoId) {
            return;
        }
        if (Li.getType() == 1090519089 && Li.Z1() == 1) {
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, dVar, 3, true);
        } else {
            Li.r1(5);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
    }
}
