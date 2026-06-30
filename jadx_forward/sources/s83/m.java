package s83;

/* loaded from: classes8.dex */
public class m extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f486419e = {l75.n0.m145250x3fdc6f77(s83.l.f486418x, "IPCallRecord")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f486420f = {"*", "rowid"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f486421d;

    public m(l75.k0 k0Var) {
        super(k0Var, s83.l.f486418x, "IPCallRecord", null);
        this.f486421d = k0Var;
    }

    public android.database.Cursor y0(long j17) {
        return this.f486421d.E("IPCallRecord", f486420f, "addressId=?", new java.lang.String[]{j17 + ""}, null, null, "calltime desc");
    }

    public void z0(s83.l lVar) {
        if (lVar != null) {
            mo11261xce0038c9(lVar.f72763xa3c65b86, lVar);
        }
    }
}
