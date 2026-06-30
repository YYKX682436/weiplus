package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qd {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f50904a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> f50905b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> f50906c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f50907d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f50908e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f50909f;

    /* renamed from: g, reason: collision with root package name */
    private int f50910g;

    private com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq b(java.lang.String str) {
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> list = this.f50906c;
        if (list != null && !list.isEmpty()) {
            for (com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq fileUpdateReq : this.f50906c) {
                if (com.tencent.mapsdk.internal.hr.a(fileUpdateReq.sName, str)) {
                    return fileUpdateReq;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x013f A[LOOP:0: B:6:0x005b->B:18:0x013f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> a(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq r18, com.tencent.mapsdk.internal.qf r19) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qd.a(java.lang.String, java.lang.String, java.lang.String, com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq, com.tencent.mapsdk.internal.qf):java.util.List");
    }

    private void a(int i17, java.lang.String str, java.lang.Throwable th6, boolean z17, boolean z18, boolean z19, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        com.tencent.mapsdk.internal.qf qfVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>[] b17;
        com.tencent.mapsdk.internal.bg bgVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> weakReference = this.f50905b;
        if (weakReference == null || (qfVar = weakReference.get()) == null || (b17 = qfVar.b()) == null) {
            return;
        }
        for (java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference2 : b17) {
            if (weakReference2 != null && (bgVar = weakReference2.get()) != null && bgVar.f48905b != null && bgVar.f48905b.f52273as != null) {
                int i18 = bgVar.f48905b.f52273as.K;
                if (i17 == 2) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i18).a(com.tencent.mapsdk.internal.la.a.f50264e, str, th6);
                } else if (i17 == 3) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i18).b(com.tencent.mapsdk.internal.la.a.f50264e, str, th6);
                } else if (i17 == 4) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i18).c(com.tencent.mapsdk.internal.la.a.f50264e, str, th6);
                } else if (i17 == 5) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i18).d(com.tencent.mapsdk.internal.la.a.f50264e, str, th6);
                } else if (i17 == 6) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i18).e(com.tencent.mapsdk.internal.la.a.f50264e, str, th6);
                }
                if (z17) {
                    com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50205f, str2, i18);
                }
                if (z18) {
                    com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50205f, str2, str3, obj, i18);
                }
                if (z19) {
                    com.tencent.mapsdk.internal.lb.f(com.tencent.mapsdk.internal.kx.f50205f, str2, i18);
                }
            }
        }
    }

    private java.util.List<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp> a(com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq cSFileUpdateReq) {
        byte[] bArr;
        try {
            com.tencent.map.tools.net.NetResponse configFileUpdate = ((com.tencent.mapsdk.internal.dc) ((com.tencent.mapsdk.internal.dr) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dr.class)).i()).configFileUpdate(com.tencent.mapsdk.internal.hn.i(), com.tencent.mapsdk.internal.hn.d(), com.tencent.mapsdk.internal.hn.m(), com.tencent.mapsdk.internal.hn.g(), this.f50909f, cSFileUpdateReq.toByteArray("UTF-8"));
            if (configFileUpdate != null && (bArr = configFileUpdate.data) != null) {
                com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr);
                mVar.a("UTF-8");
                com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp sCFileUpdateRsp = new com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp();
                try {
                    sCFileUpdateRsp.readFrom(mVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50205f, "MapConfigUpdate read field exception:" + e17.fillInStackTrace());
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "scrsp.iRet = " + sCFileUpdateRsp.iRet);
                if (sCFileUpdateRsp.iRet == 0) {
                    return sCFileUpdateRsp.vItems;
                }
                return null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rsp = ");
            sb6.append(configFileUpdate != null ? java.lang.Integer.valueOf(configFileUpdate.statusCode) : "null");
            com.tencent.mapsdk.core.utils.log.LogUtil.c("net", sb6.toString());
            return null;
        } catch (java.lang.Exception e18) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e18));
            return null;
        }
    }

    private com.tencent.mapsdk.internal.hb.c a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp fileUpdateRsp) {
        if (fileUpdateRsp == null || fileUpdateRsp.iRet != 0) {
            return null;
        }
        java.lang.String str = fileUpdateRsp.sName;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1319508241:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49369n)) {
                    c17 = 0;
                    break;
                }
                break;
            case -1091367180:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49368m)) {
                    c17 = 1;
                    break;
                }
                break;
            case -503063473:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49371p)) {
                    c17 = 2;
                    break;
                }
                break;
            case 178735484:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49365j)) {
                    c17 = 3;
                    break;
                }
                break;
            case 204802075:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49367l)) {
                    c17 = 4;
                    break;
                }
                break;
            case 451944782:
                if (str.equals("poi_icon")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1366209438:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49364i)) {
                    c17 = 6;
                    break;
                }
                break;
            case 1864531656:
                if (str.equals(com.tencent.mapsdk.internal.ep.f49370o)) {
                    c17 = 7;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                return a(fileUpdateRsp, this.f50907d, false);
            case 3:
                return a(fileUpdateRsp, this.f50908e, true);
            case 5:
                return a(fileUpdateRsp, this.f50907d, true);
            default:
                return null;
        }
    }

    private com.tencent.mapsdk.internal.hb.c a(com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp fileUpdateRsp, java.lang.String str, boolean z17) {
        if (fileUpdateRsp.iFileUpdated != 1) {
            return null;
        }
        java.lang.String str2 = fileUpdateRsp.sName;
        if (str2.equals(com.tencent.mapsdk.internal.ep.f49364i)) {
            str2 = com.tencent.mapsdk.internal.ep.f49356a;
        } else if (str2.equals(com.tencent.mapsdk.internal.ep.f49367l)) {
            str2 = com.tencent.mapsdk.internal.ep.f49357b;
        } else if (str2.equals(com.tencent.mapsdk.internal.ep.f49368m)) {
            str2 = com.tencent.mapsdk.internal.ep.f49358c;
        } else if (str2.equals(com.tencent.mapsdk.internal.ep.f49369n)) {
            str2 = com.tencent.mapsdk.internal.ep.f49360e;
        } else if (str2.equals(com.tencent.mapsdk.internal.ep.f49370o)) {
            str2 = com.tencent.mapsdk.internal.ep.f49361f;
        } else if (str2.equals(com.tencent.mapsdk.internal.ep.f49371p)) {
            str2 = com.tencent.mapsdk.internal.ep.f49363h;
        }
        java.io.File file = new java.io.File(str + str2);
        com.tencent.mapsdk.internal.hb.c a17 = a(str2, fileUpdateRsp.sUpdateUrl, file);
        com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "fileUpdateRsp.sName = " + fileUpdateRsp.sName);
        if (a17 != null) {
            a17.f49725a = fileUpdateRsp.sName;
            return a17;
        }
        try {
            java.lang.String a18 = com.tencent.mapsdk.internal.lh.a(file);
            com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "fileMd5 = ".concat(java.lang.String.valueOf(a18)));
            if (!fileUpdateRsp.sMd5.equals(a18)) {
                com.tencent.mapsdk.internal.hb.c cVar = new com.tencent.mapsdk.internal.hb.c();
                cVar.f49725a = fileUpdateRsp.sName;
                cVar.f49727c = fileUpdateRsp.sMd5;
                cVar.f49728d = a18;
                com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "error md5 1");
                a(5, "md5 not equal, file md5: " + a18 + ", server md5: " + fileUpdateRsp.sMd5, null, false, false, false, "", "", null);
                return cVar;
            }
            if (z17) {
                try {
                    com.tencent.mapsdk.internal.kv.b(file, file.getParent());
                    file.delete();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(th6.getMessage());
                    com.tencent.mapsdk.internal.hb.c cVar2 = new com.tencent.mapsdk.internal.hb.c();
                    cVar2.f49725a = fileUpdateRsp.sName;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "error unzip");
                    a(6, "unzip tmp file: " + fileUpdateRsp.sName + ", exception appear", th6, false, false, false, "", "", null);
                    return cVar2;
                }
            }
            java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> weakReference = this.f50905b;
            if (weakReference != null && weakReference.get() != null) {
                this.f50905b.get().f50915a = true;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(e17.getMessage());
            com.tencent.mapsdk.internal.hb.c cVar3 = new com.tencent.mapsdk.internal.hb.c();
            cVar3.f49725a = fileUpdateRsp.sName;
            com.tencent.mapsdk.core.utils.log.LogUtil.c("net", "error md5 2 " + e17.getMessage());
            a(6, "get tmp file md5 exception", e17, false, false, false, "", "", null);
            return cVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.mapsdk.internal.hb.c a(java.lang.String r22, java.lang.String r23, java.io.File r24) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.qd.a(java.lang.String, java.lang.String, java.io.File):com.tencent.mapsdk.internal.hb$c");
    }

    private static java.lang.String a(java.lang.String str) {
        return str.equals(com.tencent.mapsdk.internal.ep.f49364i) ? com.tencent.mapsdk.internal.ep.f49356a : str.equals(com.tencent.mapsdk.internal.ep.f49367l) ? com.tencent.mapsdk.internal.ep.f49357b : str.equals(com.tencent.mapsdk.internal.ep.f49368m) ? com.tencent.mapsdk.internal.ep.f49358c : str.equals(com.tencent.mapsdk.internal.ep.f49369n) ? com.tencent.mapsdk.internal.ep.f49360e : str.equals(com.tencent.mapsdk.internal.ep.f49370o) ? com.tencent.mapsdk.internal.ep.f49361f : str.equals(com.tencent.mapsdk.internal.ep.f49371p) ? com.tencent.mapsdk.internal.ep.f49363h : str;
    }

    private void a(com.tencent.mapsdk.internal.hb.c cVar) {
        com.tencent.mapsdk.internal.qf qfVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg>[] b17;
        com.tencent.mapsdk.internal.bg bgVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.qf> weakReference = this.f50905b;
        if (weakReference == null || (qfVar = weakReference.get()) == null || (b17 = qfVar.b()) == null) {
            return;
        }
        for (java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference2 : b17) {
            if (weakReference2 != null && (bgVar = weakReference2.get()) != null && bgVar.f48905b != null && bgVar.f48905b.f52273as != null) {
                com.tencent.mapsdk.internal.hg hgVar = bgVar.f48905b.f52273as.f49000c;
                if (hgVar == null) {
                    return;
                }
                cVar.f49726b -= hgVar.t();
                hgVar.a().a(cVar);
            }
        }
    }
}
