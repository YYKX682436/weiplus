package r92;

/* loaded from: classes10.dex */
public final class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f474983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, m92.b.T1, "FinderAccount", dm.v3.Q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = m92.b.T1;
        this.f474983d = db6;
    }

    public final long y0(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String str = new m92.b(username).f68723xdec927b;
        p75.i0 i17 = dm.v3.N.i();
        i17.f434190d = dm.v3.P.j(str);
        i17.f434189c = "MicroMsg.SDK.BaseFinderAccount";
        m92.b bVar = (m92.b) i17.a().o(this.f474983d, m92.b.class);
        if (bVar != null) {
            return bVar.f72763xa3c65b86;
        }
        return -1L;
    }
}
