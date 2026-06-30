package bt3;

/* loaded from: classes9.dex */
public class o1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.p1 f105897d;

    public o1(bt3.p1 p1Var) {
        this.f105897d = p1Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        bt3.p1 p1Var = this.f105897d;
        if (i17 == -21006 || i17 == -21005) {
            p1Var.a();
            return 0;
        }
        zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(str);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgCDNService", "onCdnCallback info null, mediaId[%s]", str);
            p1Var.a();
            return 0;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgCDNService", "[record] tran fail, startRet[%d], mediaId[%s], type[%d]", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(D0.f68334x2262335f));
            if (-5103059 == i17) {
                D0.f68328x10a0fed7 = 4;
            } else {
                D0.f68328x10a0fed7 = 3;
            }
            D0.f68320x1c571ead = i17;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(D0, dm.i4.f66867x2a5c95c7);
            p1Var.a();
        } else if (gVar != null) {
            D0.f68325x90a9378 = (int) gVar.f69496x83ec3dd;
            D0.f68330xeb1a61d6 = (int) gVar.f69500x8ab84c59;
            D0.f68328x10a0fed7 = 1;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(D0, dm.i4.f66867x2a5c95c7);
        } else if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(hVar.f69553xb5f54fe9);
            objArr[1] = java.lang.Integer.valueOf(hVar.f69501xb9d727af);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            objArr[3] = java.lang.Boolean.valueOf(hVar.f69521xc9ff4d81);
            objArr[4] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(hVar.f69502xf11df5f5);
            objArr[5] = hVar.f69526x419c9c3d;
            objArr[6] = str;
            objArr[7] = java.lang.Boolean.valueOf(1 == D0.f68334x2262335f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s], mediaId:%s, isDownload:%b", objArr);
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 >= 0) {
                D0.f68328x10a0fed7 = 2;
                if (1 == D0.f68334x2262335f) {
                    java.lang.String str2 = D0.f68326x2260084a + ".temp";
                    java.lang.String str3 = D0.f68326x2260084a;
                    p1Var.getClass();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgCDNService", "do rename and copy file, but path error");
                    } else {
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
                        java.lang.String str4 = a17.f294812f;
                        if (str4 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                            if (!str4.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                        java.lang.String str5 = a18.f294812f;
                        if (str5 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                            if (!str5.equals(l18)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
                        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, null);
                            if (m18.a() && m19.a()) {
                                try {
                                    m19.f294799a.t(m19.f294800b, m18.f294799a, m18.f294800b);
                                } catch (java.io.IOException unused) {
                                }
                            }
                        }
                    }
                    ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(D0.f68326x2260084a, 19, null, null);
                    ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9951xb06685ab(D0, dm.i4.f66867x2a5c95c7);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "transfer done, mediaid=%s, md5=%s", hVar.f323299a, str);
                    if (hVar.b()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", java.lang.Boolean.valueOf(hVar.f69565x50c91291), java.lang.Integer.valueOf(hVar.f69501xb9d727af), java.lang.Integer.valueOf(hVar.f69525x419c7893), hVar.f69502xf11df5f5, hVar.f69543x16680d46);
                        gm0.j1.n().f354821b.g(new bt3.k0(hVar.f69522xf9dbbe9c, hVar.f69526x419c9c3d, hVar.f69543x16680d46, hVar.f69525x419c7893, new bt3.n1(this, D0, hVar)));
                        return 0;
                    }
                    D0.f68317xf47749d7 = hVar.f69502xf11df5f5;
                    D0.f68318xf47770e7 = hVar.f69522xf9dbbe9c;
                    ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(D0, dm.i4.f66867x2a5c95c7);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgCDNService", "transfer error, mediaid=%s, retCode:%d", hVar.f323299a, java.lang.Integer.valueOf(i18));
                int i19 = hVar.f69553xb5f54fe9;
                if (-5103059 == i19) {
                    D0.f68328x10a0fed7 = 4;
                } else {
                    D0.f68328x10a0fed7 = 3;
                }
                D0.f68320x1c571ead = i19;
                ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(D0, dm.i4.f66867x2a5c95c7);
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
