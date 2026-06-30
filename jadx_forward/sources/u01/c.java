package u01;

/* loaded from: classes9.dex */
public final class c implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 f504984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i31.b f504985b;

    public c(com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3, i31.b bVar) {
        this.f504984a = c11117x314d89f3;
        this.f504985b = bVar;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        ((m31.j) this.f504985b).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList ERROR");
    }

    @Override // e31.l
    public void e(java.lang.String bizUsername, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = new com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3(result, false, 2, null);
        com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3 = this.f504984a;
        c11117x314d89f3.f152391d = c11162xe78737a3;
        c11117x314d89f3.f152389b = c11162xe78737a3.f153368e;
        c11117x314d89f3.i(result.f153318h);
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a32 = c11117x314d89f3.f152391d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11162xe78737a32);
        ((m31.j) this.f504985b).a(c11162xe78737a32);
        c11117x314d89f3.j(c11117x314d89f3.f152391d);
        j31.e.d(1, c11117x314d89f3.f152395h);
    }
}
