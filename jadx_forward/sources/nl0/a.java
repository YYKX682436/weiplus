package nl0;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f419690e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f419691d;

    static {
        p75.n0 n0Var = dm.s3.f321332m;
        f419690e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(dm.s3.f321341v, "FewShotLearning")};
    }

    public a(l75.k0 k0Var) {
        super(k0Var, dm.s3.f321341v, "FewShotLearning", f419690e);
        this.f419691d = k0Var;
        k0Var.A("FewShotLearning", "Alter table FewShotLearning add tag INT");
    }

    public final int y0(java.lang.String str, int i17) {
        android.database.Cursor B = this.f419691d.B("select * from FewShotLearning where model='" + str + "' and label=" + i17, new java.lang.String[0]);
        int count = B.getCount();
        B.close();
        return count;
    }

    public boolean z0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] a17 = fm0.a.a(str3.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        dm.s3 s3Var = new dm.s3();
        s3Var.f68246x554c55a3 = new java.lang.String(a17, java.nio.charset.StandardCharsets.ISO_8859_1);
        s3Var.f68247x29685f6f = i17;
        s3Var.f68249xc1b4b8a0 = str2;
        s3Var.f68251x2261f6f2 = java.lang.System.currentTimeMillis();
        s3Var.f68248x297cdba4 = str;
        return mo880xb970c2b9(s3Var);
    }
}
