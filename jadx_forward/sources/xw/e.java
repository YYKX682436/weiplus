package xw;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f539045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f539046e;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f539045d = h0Var;
        this.f539046e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.du5 du5Var;
        boolean z17;
        java.lang.String str;
        java.util.Map map = (java.util.Map) this.f539045d.f391656d;
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f539046e;
        if ((p0Var != null ? p0Var.f152259a : null) == null || (du5Var = p0Var.f152259a.f459094h) == null || map == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        java.lang.String str2 = "";
        if (g17 == null) {
            g17 = "";
        }
        r45.j4 addMsg = p0Var.f152259a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(addMsg, "addMsg");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify acc not ready");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify msgContent=".concat(g17));
        int i17 = 0;
        if (g17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            z17 = false;
        } else {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMergeMsgLogic", "onBizMergeMsgNotify data invalid");
            return;
        }
        final com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        s1Var.f67292x297eb4f7 = r01.q3.oj().W0();
        s1Var.f67293xd09be28e = addMsg.f459101r;
        s1Var.f67308x2262335f = 318767153;
        s1Var.f67306x114ef53e = "notifymessage";
        s1Var.f67307xf966a6f9 = 0;
        int i18 = addMsg.f459098o;
        s1Var.f67282xac3be4e = i18 > 0 ? i18 * 1000 : c01.w9.p();
        s1Var.f67305x10a0fed7 = 3;
        s1Var.f67281xad49e234 = g17;
        java.lang.String str3 = addMsg.f459099p;
        if (str3 == null) {
            str3 = "";
        }
        s1Var.M = str3;
        s1Var.f319718o = true;
        java.util.Map l17 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.l(s1Var);
        if (l17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.act"))) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.merge_title.merge_count"), 0);
        }
        s1Var.f67289x7691d41c = i17;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(s1Var.f67281xad49e234, "msg", null);
        if (d17 != null && (str = (java.lang.String) d17.get(".msg.appmsg.mmreader.notify_msg.notify_msg_id")) != null) {
            str2 = str;
        }
        s1Var.f67295x2e2caee = str2;
        s1Var.f67290x1636613d = s1Var.f67282xac3be4e;
        final com.p314xaae8f345.mm.p2621x8fb0427b.h2 oj6 = r01.q3.oj();
        oj6.getClass();
        final java.lang.String str4 = s1Var.f67295x2e2caee;
        if (str4 == null || str4.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineSingleMsgStorage", "mergeAndInsert notifyMsgId invalid");
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.storage.h2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.h2.a(com.p314xaae8f345.mm.p2621x8fb0427b.h2.this, s1Var, str4);
                }
            }, "BizTimeLineInfoStorageThread");
        }
    }
}
