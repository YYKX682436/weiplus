package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class u0<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.u0();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8 c11684x7b6b80f8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8) obj;
        java.lang.String str = c11684x7b6b80f8.f157303d;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        java.lang.String str2 = c11684x7b6b80f8.f157306g;
        boolean z17 = false;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str3 = null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) ? "" : "$null");
                    str3 = sb6.toString();
                }
                int i17 = c11684x7b6b80f8.f157305f;
                java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e9.f(str3, i17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.a(str2, f17, false)) {
                    try {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6.d(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(f17)));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9();
                        n9Var.f67177x28d45f97 = str;
                        n9Var.f67185x8987ca93 = i17;
                        n9Var.f67180x8ecd6328 = 0;
                        n9Var.f67183x55b471cc = f17;
                        n9Var.f67186x912ff5eb = d17;
                        n9Var.f67176xd0b3bac3 = d17;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class)).getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                        if (Di != null) {
                            z17 = Di.t(n9Var);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg failed: appId:" + str + ", version:" + i17 + ", filePath:" + str2 + ", storage is null");
                        }
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "insertPkg(appId:" + str + ", version:" + i17 + ", filePath:" + str2 + "), get exception:" + e17);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgStorageExportServiceImpl", "copy pkg failed: appId[%s] version[%d] from %s to %s", str, java.lang.Integer.valueOf(i17), str2, f17);
                }
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17);
    }
}
