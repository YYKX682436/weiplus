package o31;

/* loaded from: classes9.dex */
public final class l implements f31.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f424212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424213e;

    public l(yz5.l lVar, java.lang.String str) {
        this.f424212d = lVar;
        this.f424213e = str;
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        yz5.l lVar = this.f424212d;
        if (i17 != 0 || i18 != 0) {
            lVar.mo146xb9724478(null);
            return;
        }
        e31.k a17 = e31.n.f328620a.a("name_wxa");
        if (a17 != null && c11158xe7d16ed5 != null) {
            a17.a(this.f424213e, c11158xe7d16ed5.f153318h, c11158xe7d16ed5.f153322o, true, false);
        }
        lVar.mo146xb9724478(c11158xe7d16ed5);
    }
}
