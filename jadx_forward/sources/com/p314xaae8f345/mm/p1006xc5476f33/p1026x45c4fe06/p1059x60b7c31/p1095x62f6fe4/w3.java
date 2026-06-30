package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 f163645d;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var) {
        this.f163645d = y3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b179102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 O;
        java.lang.String str4;
        java.lang.String N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5;
        java.lang.String e07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c6;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var = this.f163645d;
        str = y3Var.f163682f;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str6 = a17.f294812f;
        if (str6 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            str2 = y3Var.f163682f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", str2);
            c12163xa32fed7c = y3Var.f163680d;
            c12163xa32fed7c.f163180d = -2;
            c12163xa32fed7c2 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "take media camera, the mVideoFilePath file exist, success");
        c12163xa32fed7c3 = y3Var.f163680d;
        c12163xa32fed7c3.f163180d = -1;
        c12162xc2b17910 = y3Var.f163681e;
        if (c12162xc2b17910.f163172i) {
            c12163xa32fed7c9 = y3Var.f163680d;
            c12163xa32fed7c9.f163181e = "mix";
        } else {
            c12163xa32fed7c4 = y3Var.f163680d;
            c12163xa32fed7c4.f163181e = "video";
        }
        str3 = y3Var.f163682f;
        c12162xc2b179102 = y3Var.f163681e;
        O = y3Var.O(str3, c12162xc2b179102.f163177q);
        if (O == null) {
            str5 = y3Var.f163682f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", str5);
            c12163xa32fed7c7 = y3Var.f163680d;
            c12163xa32fed7c7.f163180d = -2;
            c12163xa32fed7c8 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c8);
            return;
        }
        str4 = y3Var.f163682f;
        y3Var.T(str4);
        N = y3Var.N();
        c12163xa32fed7c5 = y3Var.f163680d;
        e07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.e0(O.f157635d, N, O.f157645n, O.f157648q, O.f157647p, O.f157646o);
        c12163xa32fed7c5.f163182f = e07;
        c12163xa32fed7c6 = y3Var.f163680d;
        y3Var.m50420x7b736e5c(c12163xa32fed7c6);
    }
}
