package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes5.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.g2 f174146d = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.g2();

    public g2() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g> packages = (java.util.ArrayList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packages, "packages");
        if (intValue == 0) {
            java.lang.String d17 = oo1.o.f428684a.d();
            for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar : packages) {
                po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = gVar.f297367i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 a17 = aVar.a(iVar);
                int ordinal = a17.f174263d.ordinal();
                int i17 = 2;
                int i18 = 1;
                int i19 = ordinal != 0 ? ordinal != 2 ? 3 : 2 : 1;
                int i27 = gVar.f297365g.f297521d;
                if (i27 == 4011) {
                    i17 = 1;
                } else if (i27 != 13001) {
                    i17 = 0;
                }
                if ((gVar.f297368m & 1) == 0) {
                    i18 = 0;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stock_backup_scan_reported", kz5.c1.k(new jz5.l("is_auto_backup", java.lang.Integer.valueOf(i18)), new jz5.l("scope_of_backup", java.lang.Integer.valueOf(i19)), new jz5.l("last_backup_ts", java.lang.Integer.valueOf(gVar.f297370o.f297372e)), new jz5.l("backup_to_device_id", gVar.f297365g.f297522e), new jz5.l("backup_package_device_type", java.lang.Integer.valueOf(i17)), new jz5.l("backup_source_device_id", d17), new jz5.l("backup_package_id", java.lang.Long.valueOf(gVar.f297362d)), new jz5.l("backup_chat_num", java.lang.Integer.valueOf(a17.f174265f.size()))), 34614);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "reportPackageScanInfo count = " + packages.size() + " error = " + intValue);
        return jz5.f0.f384359a;
    }
}
