package re2;

/* loaded from: classes3.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f475942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f475943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(re2.h1 h1Var, yz5.a aVar) {
        super(1);
        this.f475942d = h1Var;
        this.f475943e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.lx0 resp = (r45.lx0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        re2.h1 h1Var = this.f475942d;
        h1Var.getClass();
        h1Var.f475923c = resp.f461451d;
        java.lang.String str = resp.f461452e;
        if (str == null) {
            str = "";
        }
        h1Var.f475925e = str;
        h1Var.f475926f = resp.f461453f;
        r45.f50 f50Var = h1Var.f475924d;
        if (f50Var == null) {
            f50Var = new r45.f50();
        }
        f50Var.f455546d = h1Var.f475923c;
        f50Var.f455551i = h1Var.f475926f;
        f50Var.f455547e = 0;
        f50Var.f455548f = h1Var.f475959r;
        f50Var.f455553n = h1Var.f475925e;
        if (f50Var.f455550h == null) {
            ya2.g gVar = ya2.h.f542017a;
            java.lang.String str2 = h1Var.f475921a;
            ya2.b2 b17 = gVar.b(str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76240x66bc2758(str2);
            c19782x23db1cfa.m76227x7ac946f0(b17 != null ? b17.w0() : "");
            c19782x23db1cfa.m76218xe0a5bcad(b17 != null ? b17.y0() : "");
            f50Var.f455550h = c19782x23db1cfa;
        }
        h1Var.f475924d = f50Var;
        h1Var.j();
        h1Var.b();
        yz5.a aVar = this.f475943e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
