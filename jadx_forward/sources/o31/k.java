package o31;

/* loaded from: classes9.dex */
public final class k implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f424211e;

    public k(java.lang.String str, yz5.l lVar) {
        this.f424210d = str;
        this.f424211e = lVar;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        yz5.l lVar = this.f424211e;
        if (i17 != 0 || i18 != 0) {
            lVar.mo146xb9724478(null);
            return;
        }
        if (c11158xe7d16ed5 == null) {
            lVar.mo146xb9724478(null);
            return;
        }
        e31.k a17 = e31.n.f328620a.a("name_wxa");
        if (a17 != null) {
            a17.a(this.f424210d, c11158xe7d16ed5.f153318h, c11158xe7d16ed5.f153322o, true, false);
        }
        lVar.mo146xb9724478(new com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3(c11158xe7d16ed5, false, 2, null));
    }
}
