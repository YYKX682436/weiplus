package cw0;

/* loaded from: classes5.dex */
public final class h implements vu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f304165a;

    public h(cw0.l0 l0Var) {
        this.f304165a = l0Var;
    }

    @Override // vu0.c
    public void a(java.lang.String requestId, java.util.List textResult, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textResult, "textResult");
        cw0.l0.k7(this.f304165a, requestId, textResult, z17, true);
    }

    @Override // vu0.c
    public void b(java.lang.String requestId, java.util.List textResult, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textResult, "textResult");
        cw0.l0.k7(this.f304165a, requestId, textResult, z17, z18);
    }

    @Override // vu0.c
    public void c(java.lang.String requestId, vu0.u state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f304165a.Y7(requestId, state);
    }
}
