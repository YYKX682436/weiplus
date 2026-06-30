package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class w0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        int i17;
        if (gm0.j1.a() && map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.AppID");
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.UserName");
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.Path");
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.URL");
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.MD5");
            java.lang.String str7 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.ExtInfo");
            java.lang.String str8 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.WsEndpoint");
            java.lang.String str9 = (java.lang.String) map.get(".sysmsg.DebugAppCodeUpdated.OpenAppInfo.VersionType");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "onNewXmlReceived appId %s, userName %s, path %s, url %s, md5 %s, extInfo %s, wsEndpoint:%s, versionType:%s", str2, str3, str4, str5, str6, str7, str8, str9);
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str9, 1);
            if (P == 0 || P == 1 || P == 2) {
                i17 = P;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "parseDebugType: invalid versionType=%s, fallback to AS_TESTING", str9);
                i17 = 1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "appId = %s, username = %s, invalid, return", str2, str3);
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(str2, i17, str5, str6, 0L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + 7200)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().s(str2, i17);
            }
            com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = new com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9();
            c11105x57aff1b9.f151950f = str7;
            c11105x57aff1b9.f151954m = str8;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).z0(str2, i17, str7);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 a17 = k91.x5.a(str7);
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1> list = a17.f158983m;
                java.util.List list2 = a17.f158985o;
                if (list2 != null && list2.size() > 0) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f c11830xcf46aa1f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11830xcf46aa1f) it.next();
                        java.util.List list3 = c11830xcf46aa1f.f159002i;
                        if (list3 != null && list3.size() > 0) {
                            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1 c11827xceb9d1c1 : c11830xcf46aa1f.f159002i) {
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11827xceb9d1c1.f158973n)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "start: module :%s dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", c11830xcf46aa1f.f158997d, c11827xceb9d1c1.f158966d, c11827xceb9d1c1.f158973n, java.lang.Integer.valueOf(new kk.v(c11827xceb9d1c1.f158972m).f390011d), java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya.class)).D0(c11827xceb9d1c1.f158966d, c11827xceb9d1c1.f158973n, c11827xceb9d1c1.f158972m)));
                                    it = it;
                                    c11830xcf46aa1f = c11830xcf46aa1f;
                                }
                            }
                        }
                    }
                } else if (list != null && list.size() > 0) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11827xceb9d1c1 c11827xceb9d1c12 : list) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11827xceb9d1c12.f158973n)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugCodeUpdateSysCmdMsgListener", "start: dev plugin provider:%s,versionDesc:%s,devUin:%d saveRet:%b", c11827xceb9d1c12.f158966d, c11827xceb9d1c12.f158973n, java.lang.Integer.valueOf(new kk.v(c11827xceb9d1c12.f158972m).f390011d), java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ya.class)).D0(c11827xceb9d1c12.f158966d, c11827xceb9d1c12.f158973n, c11827xceb9d1c12.f158972m)));
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae8559.f169323f = 1101;
            c12559xbdae8559.f169324g = str2 + ":" + str3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str3, null, str4, i17, -1, c12559xbdae8559, null, c11105x57aff1b9);
        }
    }
}
