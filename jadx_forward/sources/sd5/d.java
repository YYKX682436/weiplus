package sd5;

/* loaded from: classes9.dex */
public final class d extends ke5.s {

    /* renamed from: n, reason: collision with root package name */
    public final yb5.d f488237n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f488238o;

    /* renamed from: p, reason: collision with root package name */
    public sd5.o f488239p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yb5.d chattingContext, hd5.v loader) {
        super(chattingContext, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f488237n = chattingContext;
        this.f488238o = chattingContext.x();
    }

    @Override // ke5.s, ke5.a
    public he5.t e(hd5.n action, android.os.Bundle bundle, hd5.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        if (this.f488239p == null) {
            java.lang.String talkUsername = this.f488238o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talkUsername, "talkUsername");
            this.f488239p = new sd5.o(talkUsername, new sd5.c(this));
        }
        yb5.d dVar = this.f488237n;
        sd5.o oVar = this.f488239p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        return new sd5.b(dVar, oVar, action, bundle, qVar);
    }

    @Override // ke5.s
    public boolean h() {
        sd5.o oVar = this.f488239p;
        if (oVar != null) {
            return oVar.f();
        }
        return true;
    }

    @Override // ke5.s
    public boolean i(int i17, int i18) {
        if (super.i(i17, i18)) {
            return true;
        }
        sd5.o oVar = this.f488239p;
        return oVar != null && oVar.f488257e;
    }

    @Override // ke5.s
    public boolean j(int i17, int i18, long j17) {
        if (super.j(i17, i18, j17)) {
            return true;
        }
        sd5.o oVar = this.f488239p;
        return oVar != null && oVar.f488257e;
    }
}
