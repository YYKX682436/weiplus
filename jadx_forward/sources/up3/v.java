package up3;

/* loaded from: classes12.dex */
public class v extends up3.f0 {
    @Override // up3.f0
    public boolean a(java.lang.Object obj) {
        return tp3.b.a("é\u00adºº»¯¥°\u009a¶¦´¢ªç").equals(((up3.c0) obj).f511355b);
    }

    @Override // up3.f0
    public void b(java.lang.Object obj) {
        up3.c0 c0Var = (up3.c0) obj;
        if (!ak0.o.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.d0.f511356d, "No patch.");
            return;
        }
        java.io.File c17 = ak0.o.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.d0.f511356d, "Patch is loaded but directory is null.");
            return;
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 e17 = up3.d0.e();
            up3.b.b(new com.p314xaae8f345.mm.vfs.r6(c17.getAbsolutePath()), e17, null, null);
            up3.d0.a(c0Var.f511354a, e17.o(), true);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(up3.d0.f511356d, th6, "Explained by code.", new java.lang.Object[0]);
        }
    }
}
