package r01;

/* loaded from: classes4.dex */
public final class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f449581e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f449582d;

    static {
        l75.e0 e0Var = c01.x.f119091p;
        f449581e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(c01.x.f119091p, "BizBlockFinderInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l75.k0 db6) {
        super(db6, c01.x.f119091p, "BizBlockFinderInfo", dm.w0.f322242g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = c01.x.f119091p;
        this.f449582d = db6;
    }

    public final boolean d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizBlockFinderInfoStorage", "[delete] username: " + str + " unblock");
        c01.x xVar = new c01.x();
        xVar.f68934x3a0bff44 = str;
        return super.mo9951xb06685ab(xVar, new java.lang.String[0]);
    }
}
