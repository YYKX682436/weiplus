package y11;

/* loaded from: classes12.dex */
public final class r extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f, g75.t
    public void c() {
        super.c();
    }

    @h75.a
    /* renamed from: handleMsgCommonFillMsgActionDone */
    public final j75.b m176359x5b6ea952(g75.z state, y11.f action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return new y11.g(action.f540346b);
    }

    @h75.a
    /* renamed from: handleMsgInsertInitStgActionDone */
    public final j75.b m176360x9efad03c(g75.z state, y11.h action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return new y11.l(action.f540348b);
    }

    @h75.a
    /* renamed from: handleResendMsgInfoDealActionDone */
    public final j75.b m176361x98d0c150(g75.z state, y11.j action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return new y11.l(action.f540351b);
    }

    @h75.a
    /* renamed from: handleSendMsgInitAction */
    public final j75.b m176362xd0925dd7(g75.z state, y11.p action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (m().f523665g != 0 && m().f523665g != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction resend");
            state.l("PPCKey_LocalMsgId", java.lang.Long.valueOf(m().f523665g));
            state.l("PPCKey_IsResend", java.lang.Boolean.TRUE);
            return new y11.i(m().f523665g, m().f523660b);
        }
        if (m().f523662d.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction content.isEmpty");
            return new y11.l(0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMainFlowPPC", "handleSendMsgInitAction content.isNotEmpty");
        return new y11.e(new com.p314xaae8f345.mm.p2621x8fb0427b.f9());
    }

    @Override // g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return new y11.p();
    }

    public final w11.r1 m() {
        java.lang.Object d17 = h().d("PPCKey_Params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        return (w11.r1) d17;
    }

    @h75.a
    /* renamed from: success */
    public final j75.b m176363x90b54003(g75.z state, y11.m action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        g75.z zVar = new g75.z();
        zVar.l("PPCKey_LocalMsgId", java.lang.Long.valueOf(action.f540353b));
        return new g75.a0(zVar);
    }
}
