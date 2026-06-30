package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class k1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a;
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107710x1d3f4980 = d95.f.t(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174453g, false).f309212b.m107710x1d3f4980("SELECT package_id,package_name,attribute FROM roam_backup_package", null);
            while (m107710x1d3f4980.moveToNext()) {
                long j17 = m107710x1d3f4980.getLong(0);
                java.lang.String string = m107710x1d3f4980.getString(1);
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "pkgId = " + j17 + ", pkgName = " + string + ", size = " + new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h().mo11468x92b714fd(m107710x1d3f4980.getBlob(2)).f297371d);
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "parse attribute error = " + e17.getMessage());
                } catch (java.io.IOException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Shell", e18, "", new java.lang.Object[0]);
                }
            }
        }
    }
}
