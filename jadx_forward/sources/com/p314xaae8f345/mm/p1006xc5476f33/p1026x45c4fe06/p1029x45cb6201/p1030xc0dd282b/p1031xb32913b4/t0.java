package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/export/WxaPkgStorageExportServiceIPC$PkgParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class t0<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.t0();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        k91.v5 k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07;
        t81.i y07;
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.C11684x7b6b80f8) obj).f157303d;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        boolean z17 = true;
        int i17 = 0;
        if (!(str == null || str.length() == 0)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            java.lang.String f17 = k91.k4.f(str);
            if (f17 == null || f17.length() == 0) {
                f17 = (java.lang.String) k91.e3.f387106d.get(str);
            }
            if (f17 != null && f17.length() != 0) {
                z17 = false;
            }
            int i18 = (z17 || (y07 = ((t81.j) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.j.class)).y0(f17)) == null) ? 0 : y07.f68626x119cf7dc;
            if (i18 >= 0) {
                i17 = i18;
            } else {
                k91.m4 ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij();
                if (ij6 != null && (k17 = ij6.k1(str, "versionInfo")) != null && (w07 = k17.w0()) != null) {
                    i17 = w07.f158977d;
                }
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(i17);
    }
}
