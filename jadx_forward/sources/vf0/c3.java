package vf0;

/* loaded from: classes12.dex */
public final class c3 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        vf0.h3 h3Var;
        c01.h7 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f445225b;
        if (v0Var == null || (h3Var = v0Var.f554096i) == null) {
            return;
        }
        if (event.f445224a != qi3.g0.f445245n) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = event.f445230g;
        java.lang.String a18 = c16564xb55e1d5 != null ? c16564xb55e1d5.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = event.f445230g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(a18, c16564xb55e1d52 != null ? c16564xb55e1d52.f231013d : 0L);
        if (k17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.video.VideoSendIncrementalCleanFSC", "onSendVideoEventAsync: " + k17.m124847x74d37ac6() + '-' + tg3.l1.a(k17) + ",try to clean incremental");
        c01.h7 h7Var = h3Var.f517708b.f517817f;
        if (h7Var != null && (a17 = c01.i7.a(h7Var)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.video.VideoSendIncrementalCleanFSC", "onSendVideoEventAsync: forwardMsgId=" + a17.f118760b + ",forwardMsgTalker=" + a17.f118762d);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(a17.f118760b), a17.f118762d);
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(java.lang.Long.valueOf(k17.m124847x74d37ac6()), k17.Q0());
    }
}
