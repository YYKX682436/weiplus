package dc3;

/* loaded from: classes8.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f310243e = {l75.n0.m145250x3fdc6f77(dc3.c.B, "LocalStoryDetail")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f310244d;

    public d(l75.k0 k0Var) {
        super(k0Var, dc3.c.B, "LocalStoryDetail", dm.t7.f321663p);
        this.f310244d = k0Var;
    }

    public java.util.List y0(java.lang.String str) {
        android.database.Cursor B = this.f310244d.B(java.lang.String.format("SELECT * from %s where %s=?", "LocalStoryDetail", "packet_id"), new java.lang.String[]{str});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (B.moveToNext()) {
            dc3.c cVar = new dc3.c();
            cVar.mo9015xbf5d97fd(B);
            r45.re6 re6Var = new r45.re6();
            re6Var.f466310g = cVar.f68484xfd0bc00c;
            re6Var.f466311h = cVar.f68491x2a070e41;
            re6Var.f466307d = cVar.f68488x2cc75b1a;
            re6Var.f466308e = cVar.f68489x1a37fd8f;
            re6Var.f466309f = cVar.f68487x1a37dd9e;
            re6Var.f466312i = cVar.f68486x9bdcc647;
            re6Var.f466313m = cVar.f68485x9bdca656;
            arrayList.add(re6Var);
        }
        B.close();
        return arrayList;
    }
}
