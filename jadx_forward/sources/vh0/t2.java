package vh0;

/* loaded from: classes7.dex */
public final class t2 extends vh0.x0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.j1 f518501e;

    public t2(vh0.j1 j1Var) {
        this.f518501e = j1Var;
    }

    @Override // vh0.y0
    public void Ah(java.lang.String filePath, long j17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        yb1.r rVar = (yb1.r) this.f518501e;
        rVar.getClass();
        if (!com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] file: '" + filePath + "' does not exist.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(rVar.f542210a, rVar.f542211b, rVar.f542212c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161814h, null, 8, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGenRedPackageCover", "[+] ok, received valid file: '" + filePath + '\'');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3 c12063xb16c5aa3 = rVar.f542210a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = rVar.f542211b;
        java.lang.String D = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.D(c12063xb16c5aa3, lVar, filePath);
        if (D == null) {
            return;
        }
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, D);
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            for (long j27 = 0; j18 > j27; j27 = 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        lVarArr[1] = new jz5.l("msgid", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.E(c12063xb16c5aa3, lVar, rVar.f542212c, kz5.c1.k(lVarArr));
    }

    @Override // vh0.y0
    /* renamed from: onCancel */
    public void mo172110x3d6f0539() {
        yb1.r rVar = (yb1.r) this.f518501e;
        rVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGenRedPackageCover", "[+] user close yuanbao chatting ui without clicking deeplink.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.H(rVar.f542210a, rVar.f542211b, rVar.f542212c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.C12063xb16c5aa3.f161815i, null, 8, null);
    }
}
