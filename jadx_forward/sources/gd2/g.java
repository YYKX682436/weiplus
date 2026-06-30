package gd2;

/* loaded from: classes8.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f352063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gd2.i iVar) {
        super(1);
        this.f352063d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        gd2.i iVar = this.f352063d;
        gd2.f fVar = new gd2.f(username, iVar);
        i95.m c17 = i95.n0.c(n13.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jd5.a aVar = new jd5.a();
        aVar.p(iVar.f352066b);
        n13.t tVar = new n13.t();
        tVar.f415666a = fVar;
        i95.m c18 = i95.n0.c(n13.a0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((dk5.y) ((n13.a0) c18)).wi(iVar.f352065a, aVar, username, tVar);
        return jz5.f0.f384359a;
    }
}
