package vu0;

/* loaded from: classes5.dex */
public final class h implements vu0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f521626a;

    public h(vu0.k kVar) {
        this.f521626a = kVar;
    }

    @Override // vu0.c
    public void a(java.lang.String requestId, java.util.List textResult, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textResult, "textResult");
        if (fy0.i.a()) {
            this.f521626a.f521640b.a(requestId, textResult, z17);
        } else {
            fy0.i.b(new vu0.e(this, requestId, textResult, z17));
        }
    }

    @Override // vu0.c
    public void b(java.lang.String requestId, java.util.List textResult, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textResult, "textResult");
        if (fy0.i.a()) {
            this.f521626a.f521640b.b(requestId, textResult, z17, z18);
        } else {
            fy0.i.b(new vu0.g(this, requestId, textResult, z17, z18));
        }
    }

    @Override // vu0.c
    public void c(java.lang.String requestId, vu0.u state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (fy0.i.a()) {
            this.f521626a.f521640b.c(requestId, state);
        } else {
            fy0.i.b(new vu0.f(this, requestId, state));
        }
    }
}
