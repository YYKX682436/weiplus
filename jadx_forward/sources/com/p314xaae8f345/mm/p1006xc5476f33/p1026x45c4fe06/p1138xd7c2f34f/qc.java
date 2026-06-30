package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.qc f166620a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.qc();

    public final void a(java.lang.String appId, java.lang.String moduleName, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 wxaVersionInfo, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, r45.y50 cgiCommRequestSource, yz5.l onSuccess, yz5.p onError) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaVersionInfo, "wxaVersionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        int i18 = wxaVersionInfo.f158977d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WVADownloadInfoFetcher", "fetchWVADownloadInfo: appId=" + appId + ", moduleName=" + moduleName + ", version=" + i18);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(moduleName);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(appId);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                str2 = "";
            } else {
                str2 = "$" + a17;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5 c11831x52cc1bc5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11831x52cc1bc5) ((android.util.ArrayMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g8.f166161a.b(wxaVersionInfo, appId, true)).get(moduleName);
        if (c11831x52cc1bc5 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().l(str, i17, i18, c11831x52cc1bc5.f159008e, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v3.b(str, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6();
        z6Var.f166994d = appId;
        z6Var.f166995e = moduleName;
        z6Var.f166996f = 51;
        z6Var.f166997g = i17;
        z6Var.f166998h = i18;
        z6Var.f167000m = 1;
        if (b17 != null) {
            z6Var.f167001n = b17.mo49191x1c82a56c();
            z6Var.f167000m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8.f(b17.mo49190xe121c411());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 x5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a;
        java.util.List c17 = kz5.b0.c(z6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.oc ocVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.oc(z6Var, onError, str, i17, b17, onSuccess);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.pc pcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.pc(onError);
        int i19 = c12566x87f2d8b7 != null ? c12566x87f2d8b7.f169671h : 0;
        java.lang.String str3 = c12566x87f2d8b7 != null ? c12566x87f2d8b7.f169667d : null;
        x5Var.e(c17, ocVar, pcVar, i19, cgiCommRequestSource, str3 == null ? "" : str3);
    }
}
