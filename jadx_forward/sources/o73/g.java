package o73;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f425079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o73.j jVar, java.lang.String str) {
        super(0);
        this.f425079d = jVar;
        this.f425080e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o73.b Y6 = o73.j.Y6(this.f425079d, this.f425080e);
        if (Y6 != null) {
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(this.f425079d, Y6, false, false, 6, null);
            o73.f fVar = this.f425079d.f425088n;
            java.lang.String userName = this.f425080e;
            fVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            synchronized (fVar.f425078a) {
                java.util.Iterator it = fVar.f425078a.iterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((o73.b) next).f76395x11b86abb, userName)) {
                        it.remove();
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
