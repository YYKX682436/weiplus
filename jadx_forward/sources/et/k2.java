package et;

@j95.b
/* loaded from: classes9.dex */
public final class k2 extends i95.w implements ft.n4 {
    public java.lang.String Ai(java.lang.String str, java.lang.String weAppSourceUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppSourceUserName, "weAppSourceUserName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(weAppSourceUserName)) {
            return str == null ? "" : str;
        }
        p15.e eVar = new p15.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            eVar.m126728xdc93280d(str);
        }
        eVar.F(weAppSourceUserName);
        java.lang.String m126747x696739c = eVar.m126747x696739c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaInfoMsgSourceService", "tryInsertMsgSource msgSource: " + m126747x696739c);
        return m126747x696739c;
    }

    public void Bi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 targetMsg, java.lang.String weAppSourceUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetMsg, "targetMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppSourceUserName, "weAppSourceUserName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(weAppSourceUserName)) {
            return;
        }
        p15.e eVar = new p15.e();
        java.lang.String str = targetMsg.G;
        if (str != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMsgSource(...)");
            eVar.m126728xdc93280d(str);
        }
        eVar.F(weAppSourceUserName);
        targetMsg.u3(eVar.m126747x696739c());
        if (targetMsg.m124847x74d37ac6() != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(targetMsg.m124847x74d37ac6(), targetMsg, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaInfoMsgSourceService", "tryInsertMsgSource " + targetMsg.G);
    }

    public java.lang.String wi(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (!r26.n0.B(str, "<weappsourceUsername>", false)) {
            return "";
        }
        p15.e eVar = new p15.e();
        eVar.m126728xdc93280d(str);
        java.lang.String s17 = eVar.s();
        return s17 == null ? "" : s17;
    }
}
