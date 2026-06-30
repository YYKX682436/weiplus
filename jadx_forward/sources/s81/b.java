package s81;

/* loaded from: classes7.dex */
public final class b extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f486258f = {l75.n0.m145250x3fdc6f77(s81.c.A, "AppBrandWxaPkgPreDownloadStatistics2"), "DROP TABLE IF EXISTS AppBrandWxaPkgPreDownloadStatistics"};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f486259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, s81.c.A, "AppBrandWxaPkgPreDownloadStatistics2", dm.l0.f319683o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f486259e = db6;
    }

    public final java.lang.String y0(s81.c cVar) {
        return "appId:" + cVar.f67271x28d45f97 + ", version:" + cVar.f67277x8987ca93 + ", packageType:" + cVar.f67274xa1ecfcdb + ", packageKey:" + cVar.f67273xbae6789e + ", source:" + cVar.f67276x10639700 + ", reportId:" + cVar.f67275x44eeb14;
    }

    public final void z0() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var;
        java.lang.String str2;
        android.database.Cursor mo78085xb5882a6b = mo78085xb5882a6b();
        if (mo78085xb5882a6b != null) {
            try {
                if (mo78085xb5882a6b.moveToFirst()) {
                    java.util.LinkedList<s81.c> linkedList = new java.util.LinkedList();
                    do {
                        s81.c cVar = new s81.c();
                        cVar.mo9015xbf5d97fd(mo78085xb5882a6b);
                        linkedList.add(cVar);
                    } while (mo78085xb5882a6b.moveToNext());
                    for (s81.c cVar2 : linkedList) {
                        java.lang.String str3 = cVar2.f67271x28d45f97;
                        java.lang.String str4 = cVar2.f67273xbae6789e;
                        int i17 = cVar2.f67274xa1ecfcdb;
                        java.lang.String str5 = "";
                        if (i17 == 0) {
                            str = "";
                        } else if (i17 == 6) {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
                        } else if (i17 == 12) {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
                        } else if (i17 == 13) {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4) + "$__WITHOUT_PLUGINCODE__";
                        } else if (i17 == 22) {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
                        } else if (i17 != 23) {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4);
                        } else {
                            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str4) + "$__WITHOUT_MULTI_PLUGINCODE__";
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                        boolean z17 = true;
                        if (Di != null) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(str3);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                    str5 = "$" + str;
                                }
                                sb6.append(str5);
                                str2 = sb6.toString();
                            } else {
                                str2 = null;
                            }
                            n9Var = Di.L(str2, cVar2.f67277x8987ca93, 0, "pkgPath");
                        } else {
                            n9Var = null;
                        }
                        if (n9Var != null) {
                            java.lang.String str6 = n9Var.f67183x55b471cc;
                            if (str6 != null && str6.length() != 0) {
                                z17 = false;
                            }
                        }
                        super.mo9951xb06685ab(cVar2, new java.lang.String[0]);
                    }
                }
            } finally {
            }
        }
        vz5.b.a(mo78085xb5882a6b, null);
    }
}
