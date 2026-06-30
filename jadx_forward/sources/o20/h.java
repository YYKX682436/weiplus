package o20;

/* loaded from: classes14.dex */
public final class h implements o20.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o20.i f423914a;

    public h(o20.i iVar) {
        this.f423914a = iVar;
    }

    @Override // o20.u
    public void a(o20.t oldState, o20.t newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(newState, o20.p.f423929a);
        o20.i iVar = this.f423914a;
        if (b17) {
            ((kk4.v) iVar.f423915a).O();
            iVar.c(this);
        } else if (newState instanceof o20.k) {
            iVar.c(this);
        }
    }
}
