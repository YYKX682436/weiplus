package li4;

/* loaded from: classes11.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f400319e = {l75.n0.m145250x3fdc6f77(hi4.e.P, "TextStatusGreetingItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f400320f = "markUnread";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f400321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, hi4.e.P, "TextStatusGreetingItem", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hi4.e.P;
        this.f400321d = db6;
    }

    public static int y0(li4.b bVar, int i17, int i18, java.lang.Object obj) {
        android.database.Cursor B = bVar.f400321d.B("select count(rowid) from TextStatusGreetingItem where Read != 1 ", null);
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        return r1;
    }

    public final java.util.List Ca(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusGreetingItemStorage", "query() called with: offset = " + i17 + ", nextCount = " + i18);
        p75.i0 i19 = rj4.d.f477802t.i();
        i19.f434192f = kz5.b0.c(rj4.d.f477803u.u());
        i19.c(i18, i17);
        return i19.a().k(this.f400321d, hi4.e.class);
    }

    public final hi4.e z0() {
        p75.n0 TABLE = rj4.d.f477802t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(TABLE, "TABLE");
        p75.i0 i17 = TABLE.i();
        i17.f434192f = kz5.b0.c(rj4.d.f477803u.u());
        i17.c(1, 0);
        return (hi4.e) i17.a().o(this.f400321d, hi4.e.class);
    }
}
