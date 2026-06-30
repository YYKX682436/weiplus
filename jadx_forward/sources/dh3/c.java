package dh3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static int f314025d;

    /* renamed from: a, reason: collision with root package name */
    public static final dh3.c f314022a = new dh3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f314023b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("message_batch_revoke", gm0.j1.b().h(), 1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f314024c = 7200;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f314026e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f314027f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(1000);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f314028g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a(java.lang.String str, long j17, long j18, java.lang.String str2) {
        dh3.e eVar = new dh3.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f314023b;
        java.lang.String t17 = o4Var.t(str2);
        if (t17 != null) {
            eVar.m126728xdc93280d(t17);
        }
        if (eVar.j().contains(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "addBatchSendForUser already exist: revokeBatchId: " + str2 + ", talker: " + str + ", msgId: " + j17);
            return false;
        }
        eVar.j().add(java.lang.Long.valueOf(j17));
        java.lang.String m126747x696739c = eVar.m126747x696739c();
        int i17 = f314024c;
        o4Var.E(str2, m126747x696739c, i17);
        java.lang.String i18 = i(str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        f314027f.d(i18, str2);
        o4Var.E(i18, str2, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "addBatchSendForUser: revokeBatchId: " + str2 + ", talker: " + str + ", msgId: " + j17);
        return true;
    }

    public final boolean b(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String revokeBatchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeBatchId, "revokeBatchId");
        if (!(str == null || str.length() == 0) && f9Var != null && f9Var.m124847x74d37ac6() > 0) {
            return a(str, f9Var.m124847x74d37ac6(), f9Var.mo78012x3fdd41df(), revokeBatchId);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addBatchSendForUser: talker[");
        sb6.append(str);
        sb6.append("] is empty or recordMsg is null or recordMsg.msgId <= 0L[");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", sb6.toString());
        return false;
    }

    public final boolean c(java.lang.String str, oi3.g gVar, java.lang.String revokeBatchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeBatchId, "revokeBatchId");
        if (!(str == null || str.length() == 0) && gVar != null) {
            int i17 = gVar.f427150d;
            if (gVar.m75942xfb822ef2(i17 + 0) > 0) {
                return a(str, gVar.m75942xfb822ef2(i17 + 0), gVar.m75942xfb822ef2(i17 + 2), revokeBatchId);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addBatchSendForUser: talker[");
        sb6.append(str);
        sb6.append("] is empty or recordMsg is null or recordMsg.localId <= 0L[");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.m75942xfb822ef2(gVar.f427150d + 0)) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", sb6.toString());
        return false;
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 targetMsg, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 forwardMsgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetMsg, "targetMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        java.lang.String Q0 = targetMsg.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        dh3.a aVar = new dh3.a(forwardMsgIdTalker, Q0);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f314028g;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(aVar);
        if (str == null || str.length() == 0) {
            return;
        }
        if (!b(targetMsg.Q0(), targetMsg, str)) {
            targetMsg.f275467n2 = str;
        }
        concurrentHashMap.remove(aVar);
    }

    public final void e(oi3.g targetSimpleMsg, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 forwardMsgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetSimpleMsg, "targetSimpleMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        int i17 = targetSimpleMsg.f427150d;
        dh3.a aVar = new dh3.a(forwardMsgIdTalker, targetSimpleMsg.m75945x2fec8307(i17 + 3));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f314028g;
        java.lang.String str = (java.lang.String) concurrentHashMap.get(aVar);
        if ((str == null || str.length() == 0) || !c(targetSimpleMsg.m75945x2fec8307(i17 + 3), targetSimpleMsg, str)) {
            return;
        }
        concurrentHashMap.remove(aVar);
    }

    public final java.lang.String f(java.lang.String str, dh3.d scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(c01.id.c());
        synchronized (f314026e) {
            int i17 = f314025d + 1;
            f314025d = i17;
            sb6.append(java.lang.String.valueOf(i17));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        byte[] bytes = sb7.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "generated new revoke batch id for user:" + str + ", batchId: " + g17 + ", scene:" + scene);
        dh3.e eVar = new dh3.e();
        eVar.l(scene.f314033d);
        eVar.k(new java.util.LinkedList());
        f314023b.E(g17, eVar.m126747x696739c(), f314024c);
        return g17;
    }

    public final java.lang.String g(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 forwardMsgIdTalker, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardMsgIdTalker, "forwardMsgIdTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.lang.String str = (java.lang.String) f314028g.get(new dh3.a(forwardMsgIdTalker, toUser));
        return str == null ? "" : str;
    }

    public final java.lang.String h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String Q0 = msgInfo.Q0();
        if (Q0 == null || Q0.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "getBatchSendForUser: talker is empty or recordMsg is null");
            return null;
        }
        java.lang.String Q02 = msgInfo.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
        java.lang.String i17 = i(Q02, java.lang.Long.valueOf(msgInfo.m124847x74d37ac6()), java.lang.Long.valueOf(msgInfo.mo78012x3fdd41df()));
        java.lang.String str = (java.lang.String) f314027f.b(i17);
        return str == null ? f314023b.t(i17) : str;
    }

    public final java.lang.String i(java.lang.String str, java.lang.Long l17, java.lang.Long l18) {
        return "Index_" + str + '_' + l17 + '_' + l18;
    }

    public final void j(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker, java.lang.String toUser, java.lang.String revokeBatchId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeBatchId, "revokeBatchId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "putMsgBatchIdIntoCache: revokeBatchId: " + revokeBatchId + ", msgIdTalker: " + msgIdTalker + ", toUser: " + toUser);
        f314028g.put(new dh3.a(msgIdTalker, toUser), revokeBatchId);
    }

    public final void k(java.lang.String str, long j17, long j18, long j19) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: talker is empty ");
            return;
        }
        java.lang.String i17 = i(str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f314023b;
        java.lang.String t17 = o4Var.t(i17);
        if (t17 == null || t17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: revokeBatchId is null, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
            return;
        }
        dh3.e eVar = new dh3.e();
        java.lang.String t18 = o4Var.t(t17);
        if (t18 != null) {
            eVar.m126728xdc93280d(t18);
        }
        if (eVar.j().isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: record is null, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
            return;
        }
        eVar.j().remove(java.lang.Long.valueOf(j17));
        if (eVar.j().isEmpty()) {
            o4Var.remove(t17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: remove revokeBatchId kv, talker: " + str + ", msgId: " + j17 + ", svrId: " + j18);
        } else {
            o4Var.E(t17, eVar.m126747x696739c(), f314024c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgBatchRevokeMgr", "removeBatchSendForUser: revokeBatchId: " + t17 + ", talker: " + str + ", msgId: " + j17);
        }
        o4Var.remove(i17);
        f314027f.e(i17);
    }
}
