package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f163557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 f163558f;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var, java.util.ArrayList arrayList, boolean z17) {
        this.f163558f = y3Var;
        this.f163556d = arrayList;
        this.f163557e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 O;
        java.lang.String N;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c9;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 O2;
        java.lang.String str5;
        java.lang.String N2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c10;
        java.lang.String e07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c11;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c12;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c14;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c15;
        java.util.ArrayList arrayList = this.f163556d;
        int size = arrayList.size();
        boolean z17 = this.f163557e;
        int i17 = -1;
        com.p314xaae8f345.mm.vfs.z2 z2Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3 y3Var = this.f163558f;
        if (size != 1) {
            if (arrayList.size() > 1) {
                c12163xa32fed7c = y3Var.f163680d;
                c12163xa32fed7c.f163180d = -2;
                org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
                try {
                    jSONStringer.array();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String str7 = (java.lang.String) it.next();
                        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str7);
                        java.lang.String str8 = a17.f294812f;
                        if (str8 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str8, r8, r8);
                            if (!str8.equals(l17)) {
                                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, z2Var);
                        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "take media local, the path file exist, success, path:%s", str7);
                            c12163xa32fed7c4 = y3Var.f163680d;
                            c12163xa32fed7c4.f163180d = i17;
                            c12163xa32fed7c5 = y3Var.f163680d;
                            c12163xa32fed7c5.f163181e = "video";
                            O = y3Var.O(str7, z17);
                            if (O == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,videoFilePath is %s", str7);
                                r8 = false;
                            } else {
                                y3Var.T(str7);
                                N = y3Var.N();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.d(jSONStringer, O.f157635d, N, O.f157645n, O.f157648q, O.f157647p, O.f157646o);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "take media local, videoFilePath is %s, the file not exist, fail", str7);
                        }
                        i17 = -1;
                        z2Var = null;
                        r8 = false;
                    }
                    jSONStringer.endArray();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
                }
                c12163xa32fed7c2 = y3Var.f163680d;
                c12163xa32fed7c2.f163182f = jSONStringer.toString();
                c12163xa32fed7c3 = y3Var.f163680d;
                y3Var.m50420x7b736e5c(c12163xa32fed7c3);
                return;
            }
            return;
        }
        y3Var.f163682f = com.p314xaae8f345.mm.vfs.w6.i((java.lang.String) arrayList.get(0), false);
        str = y3Var.f163682f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is  null, fail");
            c12163xa32fed7c14 = y3Var.f163680d;
            c12163xa32fed7c14.f163180d = -2;
            c12163xa32fed7c15 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c15);
            return;
        }
        str2 = y3Var.f163682f;
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str9 = a18.f294812f;
        if (str9 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str9, false, false);
            if (!str9.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!(m18.a() ? m18.f294799a.F(m18.f294800b) : false)) {
            str3 = y3Var.f163682f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is %s, the file not exist, fail", str3);
            c12163xa32fed7c6 = y3Var.f163680d;
            c12163xa32fed7c6.f163180d = -2;
            c12163xa32fed7c7 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c7);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "take media local, the mVideoFilePath file exist, success");
        c12163xa32fed7c8 = y3Var.f163680d;
        c12163xa32fed7c8.f163180d = -1;
        c12163xa32fed7c9 = y3Var.f163680d;
        c12163xa32fed7c9.f163181e = "video";
        str4 = y3Var.f163682f;
        O2 = y3Var.O(str4, z17);
        if (O2 == null) {
            str6 = y3Var.f163682f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", str6);
            c12163xa32fed7c12 = y3Var.f163680d;
            c12163xa32fed7c12.f163180d = -2;
            c12163xa32fed7c13 = y3Var.f163680d;
            y3Var.m50420x7b736e5c(c12163xa32fed7c13);
            return;
        }
        str5 = y3Var.f163682f;
        y3Var.T(str5);
        N2 = y3Var.N();
        c12163xa32fed7c10 = y3Var.f163680d;
        e07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.e0(O2.f157635d, N2, O2.f157645n, O2.f157648q, O2.f157647p, O2.f157646o);
        c12163xa32fed7c10.f163182f = e07;
        c12163xa32fed7c11 = y3Var.f163680d;
        y3Var.m50420x7b736e5c(c12163xa32fed7c11);
    }
}
