package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class c8 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibRuntimeReader", "getLib(release:%b)", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 c17 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.c(true) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.c(false);
        if (c17 == null) {
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c17.f67185x8987ca93);
        java.lang.String str = c17.f67186x912ff5eb;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3 c11653xaba0e3b3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibRuntimeReader", "getLib(%b), record.version:%d, record.md5:%s, embed.version:%d", valueOf, valueOf2, str, java.lang.Integer.valueOf(c11653xaba0e3b3.i()));
        if (z17 && c17.f67185x8987ca93 < c11653xaba0e3b3.i()) {
            return null;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(c17.f67183x55b471cc)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i8.b(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibRuntimeReader", "getLib, file not found, path %s", c17.f67183x55b471cc);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Object mo32082xb9724478(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 c10757xa20383b0) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa qaVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.AbstractC11652xbeaa3fb5 abstractC11652xbeaa3fb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
        if (!gm0.j1.a()) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11659xf97312ad();
        }
        try {
            try {
                qaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
            } catch (java.lang.Exception unused) {
                qaVar = null;
            }
            if (qaVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibRuntimeReader", "decideWhichLib, NULL == WxaPkgStorage");
                a17 = null;
            } else {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157049b) {
                    a17 = a(false);
                    if (a17 == null) {
                        a17 = a(true);
                    }
                }
            }
            if (a17 == null || !a17.f156934f) {
                if (a17 != null && !android.text.TextUtils.isEmpty(a17.f33455xe121c411)) {
                    abstractC11652xbeaa3fb5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11660xa0d206d(a17);
                }
                abstractC11652xbeaa3fb5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibRuntimeReader", "IPC_ReadLib invalid PkgInfo=%s", a17);
            } else {
                abstractC11652xbeaa3fb5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibRuntimeReader", "IPC_ReadLib use local pkg");
            }
            java.util.Objects.requireNonNull(abstractC11652xbeaa3fb5);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.b(abstractC11652xbeaa3fb5);
            return abstractC11652xbeaa3fb5;
        } finally {
        }
    }
}
