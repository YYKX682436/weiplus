package do1;

/* loaded from: classes12.dex */
public final class h implements do1.b {
    @Override // do1.b
    public boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    @Override // do1.b
    public boolean b(bw5.u0 msgItem, bw5.t0 mediaInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return false;
    }

    @Override // do1.b
    public boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, bw5.u0 msgItem, bw5.t0 mediaInfo, co1.c cVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        msg.d1(msgItem.f115207g);
        co1.g gVar = co1.g.f125301a;
        if (msgItem.f115204d == 50) {
            try {
                java.lang.String Q0 = msg.Q0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
                if (gVar.c(Q0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemNormal", "conversation " + msg.Q0() + " has voip message, avoid duplicate, return false");
                    return false;
                }
                msg.r1(6);
                java.lang.String content = msgItem.f115207g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
                r45.j07 q17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.q(content);
                if (q17 != null) {
                    msg.u3(q17.f459010d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemNormal", "msg.msgSource = " + msg.G);
                    msg.r1(q17.f459012f ? 3 : 6);
                } else {
                    r45.j07 s17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.s(msg.j());
                    if (s17 == null) {
                        return false;
                    }
                    msg.u3(s17.f459010d);
                    if (s17.f459011e == 0) {
                        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                        str = "voip_content_video";
                    } else {
                        int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                        str = "voip_content_voice";
                    }
                    msg.d1(str);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupItemNormal", "recover voip message error = " + th6.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RoamBackupItemNormal", th6, "", new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, do1.a backupExtraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupExtraInfo, "backupExtraInfo");
        bw5.u0 u0Var = new bw5.u0();
        u0Var.f115204d = msg.mo78013xfb85f7b0();
        u0Var.f115205e = msg.y0();
        u0Var.f115206f = msg.T0();
        java.lang.String j18 = msg.j();
        if (j18 == null) {
            j18 = "";
        }
        u0Var.f115207g = j18;
        u0Var.f115208h = msg.mo78012x3fdd41df();
        java.lang.String str = msg.G;
        u0Var.f115209i = str != null ? str : "";
        u0Var.f115210m = msg.I0();
        u0Var.f115211n = msg.F0();
        bw5.t0 t0Var = new bw5.t0();
        t0Var.f114735d = msg.I0();
        return new co1.h(u0Var, t0Var);
    }

    @Override // do1.b
    public long g(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String mediaId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        return 0L;
    }
}
