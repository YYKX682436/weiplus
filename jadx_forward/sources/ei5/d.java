package ei5;

/* loaded from: classes3.dex */
public final class d implements dg3.o {

    /* renamed from: a, reason: collision with root package name */
    public final mf3.k f334783a;

    /* renamed from: b, reason: collision with root package name */
    public final dg3.o f334784b;

    public d(mf3.k info, lf3.o legoUIC, dg3.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(legoUIC, "legoUIC");
        this.f334783a = info;
        this.f334784b = oVar;
    }

    @Override // dg3.o
    public void a(dg3.q type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        dg3.o oVar = this.f334784b;
        if (oVar != null) {
            oVar.a(type);
        }
        if (ei5.c.f334782a[type.ordinal()] == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
            c6631xd817ea85.f139850e = 3L;
            c6631xd817ea85.f139851f = 5L;
            eg3.i c17 = this.f334783a.c();
            if (c17 != null) {
                c6631xd817ea85.q(c17.f334197b);
                c6631xd817ea85.p(c17.f334198c);
            }
            c6631xd817ea85.k();
        }
    }

    @Override // dg3.o
    public void b(dg3.q type, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        dg3.o oVar = this.f334784b;
        if (oVar != null) {
            oVar.b(type, userName);
        }
    }
}
