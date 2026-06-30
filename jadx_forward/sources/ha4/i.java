package ha4;

/* loaded from: classes4.dex */
public class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var;
        r45.du5 du5Var;
        java.lang.String str;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (p0Var == null || (j4Var = p0Var.f152259a) == null || (du5Var = j4Var.f459094h) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleExperimentLsn", "recv null msg");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        java.lang.String b17 = b(g17, "<TimelineObject", "</TimelineObject>");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  timelineObj tag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String b18 = b(g17, "<RecXml", "</RecXml>");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  RecXml tag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        java.lang.String b19 = b(g17, "<ADInfo", "</ADInfo>");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleExperimentLsn", "recv addMsg has no  ADInfo tag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 q17 = m21.y.q(b17);
        r45.ck5 ck5Var = new r45.ck5();
        ck5Var.f453154e = x51.j1.i(b19);
        r45.ca6 ca6Var = new r45.ca6();
        ck5Var.f453153d = ca6Var;
        ca6Var.f452936e = x51.j1.i(b18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
        c19806x4c372b7.Id = new java.math.BigInteger(q17.Id).longValue();
        c19806x4c372b7.f38965xc86e6609 = q17.f39015xc86e6609;
        c19806x4c372b7.f38999xf403ecf6 = q17.f39018xf3f56116;
        c19806x4c372b7.f38990xb6613a90 = x51.j1.a(b17.getBytes());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        ca6Var.f452935d = c19806x4c372b7;
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.f246278a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        r45.g5 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.c(ck5Var);
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(x51.j1.g(c17.f456419e));
            l44.h3.f(c17902x72cc1771.f38080x66a5f3c7);
            int i19 = c17902x72cc1771.f38086x8cc202f1;
            int i27 = i19 <= 0 ? 1 : i19 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            Fj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Fj.o2();
            if (Fj.b3("")) {
                str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND " + Fj.p1("");
            } else {
                str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
            }
            java.lang.String str2 = (str + " AND  (snsId != 0 ) ") + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247516p + " limit 1";
            android.database.Cursor f17 = Fj.f247527d.f(str2, null, 2);
            if (f17.moveToFirst()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                c17933xe8d1b226.mo9015xbf5d97fd(f17);
                i17 = c17933xe8d1b226.f68883xac3be4e;
            } else {
                i17 = 0;
            }
            f17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorage", "getLastTime " + str2 + " createtime " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastTime", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "ad.pos = %d, dbLimit = %d, createTime.limit = %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17));
            android.database.Cursor d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().d1("", i17, i27);
            if (d17 == null || d17.getCount() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "db return nothing");
                i18 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "db return %d feeds", java.lang.Integer.valueOf(d17.getCount()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                if (i19 < 0) {
                    i19 = 0;
                }
                if (d17.moveToPosition(i19)) {
                    c17933xe8d1b2262.mo9015xbf5d97fd(d17);
                } else {
                    d17.moveToLast();
                    c17933xe8d1b2262.mo9015xbf5d97fd(d17);
                }
                i18 = c17933xe8d1b2262.m70357x3fdd41df() + 1;
            }
            d17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "inserting snsid  " + c17.f456418d.f455609d.Id + " ,createTime " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.o(c17, i18, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.u(c17.f456418d.f455609d.Id, c17902x72cc1771);
            try {
                y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(c17.f456418d.f455609d.Id);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video,  exp=" + th6.toString());
                ca4.q.c("adVideoPreloadInStorage", th6);
            }
            if (y07 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            } else {
                y07.m70325x5db51809();
                try {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70311x485d7 = y07.m70311x485d7();
                    r45.a90 a90Var = m70311x485d7.f39014x86965dde;
                    if (a90Var != null && (linkedList = a90Var.f451373h) != null && linkedList.size() > 0) {
                        java.util.Iterator it = m70311x485d7.f39014x86965dde.f451373h.iterator();
                        while (it.hasNext()) {
                            ((r45.jj4) it.next()).N = true;
                        }
                        y07.m70330xfabce6e3(m70311x485d7);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "onRecieveMsg, exp=" + e17.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().W0(y07.f67610x29d1292e, y07);
                java.lang.String t07 = ca4.z0.t0(c17.f456418d.f455609d.Id);
                if (!n74.c1.b(c17902x72cc1771, t07)) {
                    n74.c1.c(1, t07, c17902x72cc1771, c17.f456418d.f455609d, y07.m70298xd15b2ed8());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70300x74235b3e = y07.m70300x74235b3e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70299x10413e67 = y07.m70299x10413e67();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adXml.usePreferedInfo" + m70300x74235b3e.f38276x78e6b24);
                n74.v1.d(y07.m70311x485d7(), m70300x74235b3e, m70299x10413e67, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07.m70298xd15b2ed8();
                if (n74.l0.a(m70298xd15b2ed8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdSnsInfoStorageLogic", "adVideoPreload, preload test timeline online video, snsId=" + t07);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().k(m70298xd15b2ed8);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj().t();
                }
                za4.f1.b(c17, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertRec", "com.tencent.mm.plugin.sns.model.AdSnsInfoStorageLogic");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRecieveMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        int indexOf = str.indexOf(str2);
        int indexOf2 = indexOf >= 0 ? str.indexOf(str3) : -1;
        if (indexOf < 0 || indexOf2 <= indexOf) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
            return "";
        }
        java.lang.String substring = str.substring(indexOf, indexOf2 + str3.length());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        return substring;
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDeleteMsg", "com.tencent.mm.plugin.sns.lucky.model.SimpleExperimentLsn");
    }
}
