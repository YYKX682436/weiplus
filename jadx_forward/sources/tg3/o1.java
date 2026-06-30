package tg3;

/* loaded from: classes5.dex */
public final class o1 {
    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.i9 a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.i9 b17 = b(msgInfo.Q0(), msgInfo.m124847x74d37ac6());
        return b17 == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.i9() : b17;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.i9 b(java.lang.String str, long j17) {
        if (!(str == null || str.length() == 0) && j17 > 0) {
            java.lang.String c17 = c(str, j17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var = tg3.p1.f500742d;
            com.p314xaae8f345.mm.p2621x8fb0427b.i9 i9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.i9) c0Var.b(c17);
            if (i9Var != null) {
                return i9Var;
            }
            byte[] j18 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) tg3.p1.f500741c).mo141623x754a37bb()).j(c17);
            if (j18 != null) {
                try {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2621x8fb0427b.i9().mo11468x92b714fd(j18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.storage.MsgProcessingInfo");
                    com.p314xaae8f345.mm.p2621x8fb0427b.i9 i9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.i9) mo11468x92b714fd;
                    c0Var.d(c17, i9Var2);
                    return i9Var2;
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgProcessingManager", "chris: can not parse from mmkv data!");
                } catch (java.lang.ClassCastException unused2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgProcessingManager", "chris: can not parse to msg processing info");
                    return null;
                }
            }
        }
        return null;
    }

    public final java.lang.String c(java.lang.String str, long j17) {
        return str + '_' + j17;
    }

    public final void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String Q0 = msgInfo.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        e(Q0, msgInfo.m124847x74d37ac6());
    }

    public final void e(java.lang.String msgTalker, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        java.lang.String c17 = c(msgTalker, j17);
        tg3.p1.f500742d.e(c17);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) tg3.p1.f500741c).mo141623x754a37bb()).remove(c17);
    }
}
