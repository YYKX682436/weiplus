package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class ma implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f157212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa f157213e;

    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa qaVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var) {
        this.f157213e = qaVar;
        this.f157212d = n9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa qaVar = this.f157213e;
        qaVar.getClass();
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "select count(%s) from %s where %s=? and %s=? and %s=?", "appId", "AppBrandWxaPkgManifestRecord", "appId", "debugType", "version");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = this.f157212d;
        android.database.Cursor B = qaVar.f157454d.B(format, new java.lang.String[]{n9Var.f67177x28d45f97, n9Var.f67180x8ecd6328 + "", n9Var.f67185x8987ca93 + ""});
        boolean z17 = false;
        if (B != null) {
            try {
                if (B.moveToNext()) {
                    if (B.getInt(0) > 0) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    B.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
        if (B != null) {
            B.close();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pa paVar = qaVar.f157455e;
        if (z17) {
            boolean mo9952xce0038c9 = paVar.mo9952xce0038c9(n9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.I);
            if (mo9952xce0038c9 && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).wi(n9Var.f67183x55b471cc);
            }
            return java.lang.Boolean.valueOf(mo9952xce0038c9);
        }
        boolean mo880xb970c2b9 = paVar.mo880xb970c2b9(n9Var);
        if (mo880xb970c2b9 && com.p314xaae8f345.mm.vfs.w6.j(n9Var.f67183x55b471cc)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3.class))).wi(n9Var.f67183x55b471cc);
        }
        return java.lang.Boolean.valueOf(mo880xb970c2b9);
    }
}
