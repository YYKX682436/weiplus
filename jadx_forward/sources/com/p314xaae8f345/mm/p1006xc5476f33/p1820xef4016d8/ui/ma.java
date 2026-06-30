package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ma implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f f228707b;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f fVar) {
        this.f228706a = activityC16373x8a110f13;
        this.f228707b = fVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = fVar2 != null ? java.lang.Integer.valueOf(fVar2.f152148a) : null;
        objArr[1] = fVar2 != null ? java.lang.Integer.valueOf(fVar2.f152149b) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，errType：%s，cgiBack.errCode：%s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228706a;
        if (activityC16373x8a110f13.isFinishing() || activityC16373x8a110f13.isDestroyed() || fVar2 == null || (fVar = fVar2.f152151d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return java.lang.Boolean.TRUE;
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, failed");
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, resp.cover_info_buff_base64: %s", ((r45.eg3) fVar).f454976d);
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.eg3 eg3Var = (r45.eg3) fVar2.f152151d;
        r45.jm5 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) jVar).Ai(eg3Var != null ? eg3Var.f454976d : null);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, coverInfoDetailCgi is null");
            return java.lang.Boolean.TRUE;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16373x8a110f13.f227819x0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，mMsgXml is null");
            return java.lang.Boolean.TRUE;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(activityC16373x8a110f13.f227819x0, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，values is null");
            return java.lang.Boolean.TRUE;
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f fVar3 = this.f228707b;
        java.lang.String str2 = fVar3.f226798m;
        java.lang.String str3 = activityC16373x8a110f13.A1;
        java.lang.String str4 = Ai.f459477p;
        java.lang.String str5 = fVar3.f226799n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack， order_xml paymsgid： %s，cgi_sendid : %s , order_sendid: %s , cgi_xml packet_id : %s , cgi_pakcetid: %s", str, str2, str3, str4, str5);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String str6 = fVar3.f226798m;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, activityC16373x8a110f13.A1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str6, activityC16373x8a110f13.A1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, Ai.f459477p)) {
                    java.lang.String str7 = activityC16373x8a110f13.f227819x0;
                    r45.eg3 eg3Var2 = (r45.eg3) fVar2.f152151d;
                    activityC16373x8a110f13.f227819x0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).sj(str7, "<coverinfo>", "</coverinfo>", ot0.q.g(eg3Var2 != null ? eg3Var2.f454976d : null));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31063, str, 1, 5);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，pakcetid or send_id not match");
                }
                return java.lang.Boolean.TRUE;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，Util.isNullOrNil(payMsgid) || Util.isNullOrNil(cgi.getMSendId()) || Util.isNullOrNil(cgi.getMPacketId())");
        return java.lang.Boolean.TRUE;
    }
}
