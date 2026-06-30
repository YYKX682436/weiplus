package xt1;

/* loaded from: classes15.dex */
public class l extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f538050e = {l75.n0.m145250x3fdc6f77(xt1.k.K1, "CardMsgInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f538051d;

    public l(l75.k0 k0Var) {
        super(k0Var, xt1.k.K1, "CardMsgInfo", null);
        this.f538051d = k0Var;
    }

    public int f() {
        android.database.Cursor f17 = this.f538051d.f(" select count(*) from CardMsgInfo where read_state = ? ", new java.lang.String[]{"1"}, 2);
        if (f17 == null) {
            return 0;
        }
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    @Override // l75.n0
    /* renamed from: getAll */
    public android.database.Cursor mo78085xb5882a6b() {
        return this.f538051d.B("select * from CardMsgInfo order by time desc", null);
    }
}
