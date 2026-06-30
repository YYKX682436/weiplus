package wh4;

/* loaded from: classes.dex */
public final class c extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f527536e = {l75.n0.m145250x3fdc6f77(uh4.g0.f509513x, "TeenModeAuthorization")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f527537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l75.k0 db6) {
        super(db6, uh4.g0.f509513x, "TeenModeAuthorization", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f527537d = db6;
    }

    public final uh4.g0 y0(int i17, java.lang.String key, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        uh4.g0 g0Var = new uh4.g0();
        g0Var.f77356xe412923f = i17;
        g0Var.f77355xb4c6a6ba = key;
        g0Var.f77358xd09be28e = j17;
        java.lang.String str = "select * from TeenModeAuthorization where businessType = " + i17 + " and businessKey = '" + key + "' ";
        if (j17 > 0) {
            str = str + " and msgSvrId = " + j17;
        }
        android.database.Cursor B = this.f527537d.B(str + " order by time desc ", null);
        if (B.moveToNext()) {
            g0Var.mo9015xbf5d97fd(B);
        }
        B.close();
        return g0Var;
    }
}
