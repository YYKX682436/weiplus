package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f166746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v4 f166747e;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v4 v4Var, k91.v5 v5Var) {
        this.f166747e = v4Var;
        this.f166746d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v4 v4Var = this.f166747e;
        k91.v5 v5Var = this.f166746d;
        try {
            java.lang.String str = v5Var.f68904x28d45f97;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var = v4Var.f166788d;
            java.lang.String str2 = x4Var.f166934e;
            java.lang.String str3 = x4Var.f166935f;
            int i17 = x4Var.f166933d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07 = v5Var.w0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var2 = v4Var.f166788d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.lb lbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.lb(str, 0, str2, str3, i17, w07, x4Var2.f166932c, x4Var2.f166938i, x4Var2.f166939j, true, x4Var2.f166940k);
            lbVar.g(false);
            c11667xc7e59dd6 = lbVar.call();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "%s, prepare pkg exp = %s", v5Var.f68904x28d45f97, e17);
            c11667xc7e59dd6 = null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p7) v4Var.f166788d.f166937h).b(c11667xc7e59dd6 == null ? ne1.j.UPDATE_FAILED : ne1.j.UPDATE_READY, v5Var.w0().f158977d, v5Var.w0().f158978e, null, null, c11667xc7e59dd6);
        if (c11667xc7e59dd6 != null) {
            try {
                k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(v4Var.f166788d.f166930a, new java.lang.String[0]);
                if (n17.w0().f158977d == v5Var.w0().f158977d) {
                    ((k91.a4) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(k91.a4.class)).z1(n17);
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x4 x4Var3 = v4Var.f166788d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "appUsername(%s) appId(%s) update backup attr get exception", x4Var3.f166930a, x4Var3.f166931b);
            }
        }
    }
}
