package qi3;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ qi3.x f445294a = new qi3.x();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f363687g.a();
        long j17 = msgIdTalker.f231013d;
        if (j17 <= 0 || !(!r26.n0.N(msgIdTalker.a()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "invalid msgIdTalker " + msgIdTalker);
            return;
        }
        java.lang.String str = j17 + ';' + msgIdTalker.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "addSendingMsgIdTalker " + str);
        if (a17.T6().f(str)) {
            return;
        }
        a17.T6().A(str, 1);
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f363687g.a();
        long j17 = msgIdTalker.f231013d;
        if (j17 <= 0 || !(!r26.n0.N(msgIdTalker.a()))) {
            return false;
        }
        return a17.T6().f(j17 + ';' + msgIdTalker.a());
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 msgIdTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIdTalker, "msgIdTalker");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        hm.j a17 = hm.j.f363687g.a();
        java.lang.String str = msgIdTalker.f231013d + ';' + msgIdTalker.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSend.MsgSendingFSC", "removeSendingMsgIdTalker " + str);
        a17.T6().remove(str);
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j d(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
        int ordinal = task.C().ordinal();
        if (ordinal != 2) {
            if (ordinal != 5) {
                if (ordinal != 10) {
                    if (ordinal != 12) {
                        return p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    }
                }
            }
            return ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(task);
        }
        vf0.y2 y2Var = (vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class));
        y2Var.getClass();
        if (!(task instanceof zf0.v0)) {
            throw new java.lang.UnsupportedOperationException("MicroMsg.video.VideoSendFeatureServicesendAsync only support SendVideoTask Type");
        }
        yf0.k0 a17 = yf0.k0.f543109o.a();
        zf0.v0 v0Var = (zf0.v0) task;
        a17.getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(2, 0, null, 6, null);
        v0Var.f445211g = b17;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f543111f).mo141623x754a37bb(), null, new yf0.g0(v0Var, a17, null), 1, null);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new vf0.w2(b17, y2Var, null), 1, null);
        }
        return b17;
    }
}
