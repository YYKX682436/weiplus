package sd5;

/* loaded from: classes9.dex */
public final class f extends ke5.u {

    /* renamed from: n, reason: collision with root package name */
    public final yb5.d f488241n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f488242o;

    /* renamed from: p, reason: collision with root package name */
    public sd5.o f488243p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yb5.d chattingContext, hd5.v loader) {
        super(chattingContext, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f488241n = chattingContext;
        this.f488242o = chattingContext.x();
    }

    @Override // ke5.f0
    public boolean d() {
        return true;
    }

    @Override // ke5.u, ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (this.f488243p == null) {
            java.lang.String talkUsername = this.f488242o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkUsername, "talkUsername");
            this.f488243p = new sd5.o(talkUsername, new sd5.e(this));
        }
        yb5.d dVar = this.f488241n;
        sd5.o oVar = this.f488243p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        return new sd5.h(dVar, oVar, action, bundle, qVar);
    }

    @Override // ke5.u
    public boolean h() {
        sd5.o oVar = this.f488243p;
        return oVar != null && oVar.f();
    }

    @Override // ke5.u
    public boolean i() {
        sd5.o oVar = this.f488243p;
        return oVar != null && oVar.f488257e;
    }
}
