package h6;

/* loaded from: classes16.dex */
public final class i implements l36.o, yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final l36.n f360656d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f360657e;

    public i(l36.n call, p3325xe03a0797.p3326xc267989b.q continuation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        this.f360656d = call;
        this.f360657e = continuation;
    }

    @Override // l36.o
    public void a(l36.n call, l36.a1 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f360657e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(response));
    }

    @Override // l36.o
    public void d(l36.n call, java.io.IOException e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (((l36.u0) call).f397185e.f433273d) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f360657e;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17)));
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        try {
            ((l36.u0) this.f360656d).a();
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f384359a;
    }
}
