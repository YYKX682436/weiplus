package vf1;

/* loaded from: classes7.dex */
public class g extends vf1.a implements tf1.k {

    /* renamed from: CTRL_INDEX */
    private static final int f77300x366c91de = 806;

    /* renamed from: NAME */
    public static final java.lang.String f77301x24728b = "insertXWebCamera";

    /* renamed from: g, reason: collision with root package name */
    public boolean f517854g;

    /* renamed from: h, reason: collision with root package name */
    public mi1.w0 f517855h;

    public final boolean F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, tb1.a0 a0Var, vf1.f fVar) {
        si1.e1.a(java.lang.String.valueOf(lVar.mo48798x74292566()), new vf1.e(this, lVar, a0Var, fVar));
        android.app.Activity activity = (android.app.Activity) lVar.mo50352x76847179();
        if (activity == null) {
            return false;
        }
        boolean b17 = nf.t.b(activity, lVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        tb1.c cVar = tb1.b.f498422a;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", java.lang.Boolean.valueOf(b17));
        boolean a17 = nf.t.a(activity, lVar, "android.permission.CAMERA", 16, "", "");
        cVar.f498423a = a17;
        if (!a17) {
            return false;
        }
        si1.e1.c(lVar.mo48798x74292566());
        if (!this.f517854g) {
            if (fVar != null) {
                uf1.d dVar = (uf1.d) fVar;
                dVar.f508686a.a(dVar.f508687b, dVar.f508688c.o("ok"));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610) a0Var).h();
            this.f517854g = true;
        }
        return true;
    }
}
