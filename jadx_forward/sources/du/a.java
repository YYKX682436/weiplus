package du;

/* loaded from: classes12.dex */
public final class a extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @h75.a
    public final j75.b end(g75.z state, pt.q0 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        r45.qy5 qy5Var = action.f439711b;
        if (qy5Var == null) {
            return new g75.v(null, 1, null);
        }
        g75.z zVar = new g75.z();
        zVar.l("AppMsgResponse", qy5Var);
        return new g75.a0(zVar);
    }

    @Override // g75.f
    public j75.b l(g75.z state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return new pt.p0((com.p314xaae8f345.mm.p2621x8fb0427b.f9) state.i("MsgInfo"), (r05.k) state.i("AppMsgObj"));
    }
}
