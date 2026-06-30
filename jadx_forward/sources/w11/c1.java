package w11;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w11.c1 f523522a = new w11.c1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f523523b = new java.util.HashMap();

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
        java.util.HashMap hashMap = f523523b;
        synchronized (hashMap) {
            w11.b1 b1Var = (w11.b1) hashMap.get(msgIdTalker);
            if (b1Var != null && b1Var.f523517b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RevokeMsgManager", "tryToSendMsgCgi() called with isRevokingMsg: msgIdTalker = " + msgIdTalker + " sceneType:" + mo808xfb85f7b0 + " scene:" + scene + " cancel msg send");
                return true;
            }
            java.lang.Object obj2 = hashMap.get(msgIdTalker);
            if (obj2 == null) {
                obj2 = new w11.b1(false, false, 0L, false, 15, null);
                hashMap.put(msgIdTalker, obj2);
            }
            ((w11.b1) obj2).f523516a = true;
            if (msgIdTalker.f231013d == 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                obj = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            } else {
                obj = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "tryToSendMsgCgi() called with: msgIdTalker = " + msgIdTalker + " sceneType:" + mo808xfb85f7b0 + ' ' + obj);
            return false;
        }
    }

    public final boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 oriMsg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oriMsg, "oriMsg");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(oriMsg.Q0(), oriMsg.m124847x74d37ac6());
        long m124847x74d37ac6 = n17.m124847x74d37ac6();
        int mo78013xfb85f7b0 = n17.mo78013xfb85f7b0();
        int P0 = n17.P0();
        java.lang.String Q0 = n17.Q0();
        if (m124847x74d37ac6 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + m124847x74d37ac6 + ", msgTalker = " + Q0 + ", oriMsgId = " + oriMsg.m124847x74d37ac6() + ", oriMsgTalker = " + oriMsg.Q0() + ", status: " + P0);
            return false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + m124847x74d37ac6 + ", msgTalker = " + Q0 + ", type=" + mo78013xfb85f7b0 + " status:" + P0 + " not Support Revoke BeforeSendMsg");
            return false;
        }
        if (n17.P0() == 2 || n17.h2() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + m124847x74d37ac6 + ", msgTalker = " + Q0 + ", type=" + mo78013xfb85f7b0 + " flag=" + n17.h2() + " already sent or web flag");
            return false;
        }
        java.util.HashMap hashMap = f523523b;
        synchronized (hashMap) {
            com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m124847x74d37ac6, Q0);
            w11.b1 b1Var = (w11.b1) hashMap.get(c16564xb55e1d5);
            if (b1Var != null && b1Var.f523516a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgIdTalker = " + c16564xb55e1d5 + ", type=" + mo78013xfb85f7b0 + " status=" + P0 + " already sending msg cgi");
                return false;
            }
            java.lang.Object obj = hashMap.get(c16564xb55e1d5);
            if (obj == null) {
                obj = new w11.b1(false, false, 0L, false, 15, null);
                hashMap.put(c16564xb55e1d5, obj);
            }
            ((w11.b1) obj).f523517b = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgIdTalker = " + c16564xb55e1d5 + ", type=" + mo78013xfb85f7b0 + " status=" + P0 + " isRevokeBeforeSendMsg = " + z17);
            return true;
        }
    }
}
