package do1;

/* loaded from: classes12.dex */
public final class i implements do1.b {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        msg.d1(msgItem.f115207g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemSys", "msg.type:" + msg.mo78013xfb85f7b0() + ", content:" + msg.j() + ", msgSource:" + msgItem.f115209i);
        java.lang.String content = msgItem.f115207g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
        if (r26.n0.L(content, "<sysmsg", 0, false, 6, null) >= 0) {
            msg.m124850x7650bebc(570425393);
            return true;
        }
        msg.m124850x7650bebc(10000);
        return true;
    }

    @Override // do1.b
    public co1.h e(long j17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, do1.a backupExtraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backupExtraInfo, "backupExtraInfo");
        if (msg.I0() == 0) {
            return null;
        }
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
        if (msg.mo78013xfb85f7b0() == 570425393) {
            java.lang.String j19 = msg.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j19, "getContent(...)");
            if (r26.n0.B(j19, "type=\"sysmsgtemplate\"", false)) {
                u0Var.f115204d = 10002;
            }
        }
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
