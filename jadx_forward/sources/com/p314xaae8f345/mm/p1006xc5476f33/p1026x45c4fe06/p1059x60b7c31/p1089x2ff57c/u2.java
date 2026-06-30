package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes8.dex */
public class u2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a f162666a;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar) {
        this.f162666a = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        boolean m50424x3966f5e8;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.webkit.ValueCallback valueCallback;
        uh0.v G;
        java.lang.String str5;
        boolean z17;
        java.lang.String str6 = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, receiveValue = %s", str6);
        boolean equals = "query for feature_wx_float_window successfully".equals(str6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.a aVar = this.f162666a;
        if (equals) {
            if (aVar.m50422x8f77ef41() != null) {
                aVar.m50422x8f77ef41().f159910y = true;
                uh0.s sVar = (uh0.s) i95.n0.c(uh0.s.class);
                boolean s17 = aVar.m50422x8f77ef41().f159902q.s();
                m50421x3c6fed6a2 = aVar.m50421x3c6fed6a();
                str = aVar.f162559e;
                str2 = aVar.f162560f;
                str3 = aVar.f162561g;
                str4 = aVar.f162562h;
                valueCallback = aVar.f162565n;
                G = aVar.G(true);
                str5 = aVar.f162558d;
                z17 = aVar.f162563i;
                ((th0.w) sVar).Ai(s17, false, false, true, m50421x3c6fed6a2, str, str2, str3, str4, 10, valueCallback, G, true, str5, z17);
                return;
            }
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str6) || "xwebFileReaderUserOperated".equals(str6)) {
            return;
        }
        if ("fileReaderClosed".equals(str6)) {
            m50424x3966f5e8 = aVar.m50424x3966f5e8();
            if (!m50424x3966f5e8) {
                if (aVar.m50422x8f77ef41() == null) {
                    aVar.m50420x7b736e5c(null);
                    return;
                } else if (aVar.m50422x8f77ef41().f159909x) {
                    aVar.m50420x7b736e5c(null);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenFileRequest", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(aVar.m50422x8f77ef41().f159909x));
                    aVar.m50422x8f77ef41().f159909x = true;
                    return;
                }
            }
        }
        if ("fileReaderMenuClicked".equals(str6)) {
            m50421x3c6fed6a = aVar.m50421x3c6fed6a();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m50421x3c6fed6a, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.r2(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.t2(this);
            k0Var.v();
        }
    }
}
