package y80;

@j95.b
/* loaded from: classes12.dex */
public final class p0 extends jm0.o implements z80.h0 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(a90.f.class);
    }

    public qi3.b0 Zi(y80.q1 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsgFeatureService", "createSendLocationTask: toUser=" + params.f541434a);
        return new y80.t0(params);
    }

    public boolean aj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsgFeatureService", "resendLocation: msgId=" + msgInfo.m124847x74d37ac6() + ", talker=" + msgInfo.Q0());
        java.lang.String Q0 = msgInfo.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        y80.q1 q1Var = new y80.q1(Q0);
        q1Var.f541435b = true;
        q1Var.f541436c = g45.b.f350379a.b(msgInfo);
        bj(Zi(q1Var));
        return true;
    }

    public void bj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationMsgFeatureService", "sendSync: starting task " + task.id());
        boolean z17 = task instanceof qi3.c;
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendSync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendAsync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        jz5.g gVar = a90.f.f83943g;
        y80.p0 p0Var = (y80.p0) i95.n0.c(y80.p0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p0Var);
        if (!jm0.g.class.isAssignableFrom(a90.f.class)) {
            throw new java.lang.IllegalArgumentException(y80.p0.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(p0Var.getViewModel(), new jm0.e(p0Var)).a(a90.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qi3.c cVar = (qi3.c) task;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(2, 0, null, 6, null);
        cVar.f445211g = b17;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) ((a90.f) ((jm0.g) a17)).f83944f).mo141623x754a37bb(), null, new a90.d(cVar, null), 1, null);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new y80.o0(b17, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationMsgFeatureService", "sendSync: accountScope is null, cannot execute task " + task.id());
        }
    }
}
