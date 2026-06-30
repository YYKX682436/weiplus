package bt3;

/* loaded from: classes9.dex */
public class o1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.p1 f24364d;

    public o1(bt3.p1 p1Var) {
        this.f24364d = p1Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        bt3.p1 p1Var = this.f24364d;
        if (i17 == -21006 || i17 == -21005) {
            p1Var.a();
            return 0;
        }
        zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(str);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgCDNService", "onCdnCallback info null, mediaId[%s]", str);
            p1Var.a();
            return 0;
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgCDNService", "[record] tran fail, startRet[%d], mediaId[%s], type[%d]", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(D0.field_type));
            if (-5103059 == i17) {
                D0.field_status = 4;
            } else {
                D0.field_status = 3;
            }
            D0.field_errCode = i17;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(D0, dm.i4.COL_LOCALID);
            p1Var.a();
        } else if (gVar != null) {
            D0.field_offset = (int) gVar.field_finishedLength;
            D0.field_totalLen = (int) gVar.field_toltalLength;
            D0.field_status = 1;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(D0, dm.i4.COL_LOCALID);
        } else if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(hVar.field_retCode);
            objArr[1] = java.lang.Integer.valueOf(hVar.field_UploadHitCacheType);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            objArr[3] = java.lang.Boolean.valueOf(hVar.field_exist_whencheck);
            objArr[4] = com.tencent.mm.sdk.platformtools.t8.G1(hVar.field_aesKey);
            objArr[5] = hVar.field_filemd5;
            objArr[6] = str;
            objArr[7] = java.lang.Boolean.valueOf(1 == D0.field_type);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s], mediaId:%s, isDownload:%b", objArr);
            int i18 = hVar.field_retCode;
            if (i18 >= 0) {
                D0.field_status = 2;
                if (1 == D0.field_type) {
                    java.lang.String str2 = D0.field_path + ".temp";
                    java.lang.String str3 = D0.field_path;
                    p1Var.getClass();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgCDNService", "do rename and copy file, but path error");
                    } else {
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
                        java.lang.String str4 = a17.f213279f;
                        if (str4 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                            if (!str4.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
                        java.lang.String str5 = a18.f213279f;
                        if (str5 != null) {
                            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
                            if (!str5.equals(l18)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                            com.tencent.mm.vfs.z2 m19 = b3Var.m(a18, null);
                            if (m18.a() && m19.a()) {
                                try {
                                    m19.f213266a.t(m19.f213267b, m18.f213266a, m18.f213267b);
                                } catch (java.io.IOException unused) {
                                }
                            }
                        }
                    }
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D0.field_path, 19, null, null);
                    ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).delete(D0, dm.i4.COL_LOCALID);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "transfer done, mediaid=%s, md5=%s", hVar.f241766a, str);
                    if (hVar.b()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", java.lang.Boolean.valueOf(hVar.field_upload_by_safecdn), java.lang.Integer.valueOf(hVar.field_UploadHitCacheType), java.lang.Integer.valueOf(hVar.field_filecrc), hVar.field_aesKey, hVar.field_mp4identifymd5);
                        gm0.j1.n().f273288b.g(new bt3.k0(hVar.field_fileId, hVar.field_filemd5, hVar.field_mp4identifymd5, hVar.field_filecrc, new bt3.n1(this, D0, hVar)));
                        return 0;
                    }
                    D0.field_cdnKey = hVar.field_aesKey;
                    D0.field_cdnUrl = hVar.field_fileId;
                    ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(D0, dm.i4.COL_LOCALID);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgCDNService", "transfer error, mediaid=%s, retCode:%d", hVar.f241766a, java.lang.Integer.valueOf(i18));
                int i19 = hVar.field_retCode;
                if (-5103059 == i19) {
                    D0.field_status = 4;
                } else {
                    D0.field_status = 3;
                }
                D0.field_errCode = i19;
                ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).update(D0, dm.i4.COL_LOCALID);
            }
            p1Var.a();
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
