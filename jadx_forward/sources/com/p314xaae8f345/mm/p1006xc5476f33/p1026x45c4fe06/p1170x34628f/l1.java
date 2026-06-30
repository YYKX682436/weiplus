package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class l1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 f168377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 f168378c;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m1 m1Var) {
        this.f168378c = o1Var;
        this.f168376a = str;
        this.f168377b = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a;
        r45.rd5 rd5Var;
        java.lang.String str3;
        r45.z1 z1Var;
        r45.fe0 fe0Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String string;
        java.lang.String str4 = null;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f152244b.f152233a) != null && (fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request success");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042 c19797xdd6e8042 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042) oVar.f152244b.f152233a;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_profile_info_mmkv_name" + this.f168376a).H("appbrand_profile_info_key", c19797xdd6e8042.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, encode error");
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19777x35cb352a c19777x35cb352a2 = c19797xdd6e8042.f38907x2f67528e;
            if (c19777x35cb352a2 == null || c19777x35cb352a2.f38898x8e8a4961 != 1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f168378c.f168474b)) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19808x7ed00fc3 c19808x7ed00fc3 = c19797xdd6e8042.f38910x39feb585;
                    if (c19808x7ed00fc3 != null) {
                        double d17 = c19808x7ed00fc3.f39046xf372b5f0;
                        if (d17 != -1.0d) {
                            string = d17 == 0.0d ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571790pt) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4k, java.lang.String.valueOf(d17));
                        }
                    }
                    c19777x35cb352a2 = null;
                } else {
                    string = this.f168378c.f168474b;
                }
                str4 = string;
                c19777x35cb352a2 = null;
            }
            r45.rd5 rd5Var2 = c19797xdd6e8042.f38919x34a9fc5e;
            java.lang.String str5 = c19797xdd6e8042.f38920x17075efc.f39058xd348b174;
            r45.z1 z1Var2 = c19797xdd6e8042.f38906xc238bbde;
            fe0Var = c19797xdd6e8042.f38909x8c2ceb40;
            c19777x35cb352a = c19777x35cb352a2;
            rd5Var = rd5Var2;
            str3 = str5;
            str2 = str4;
            z1Var = z1Var2;
        } else {
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572184a34);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandMenuHeaderDataHelper", "queryProfile, request fail");
            str2 = string2;
            c19777x35cb352a = null;
            rd5Var = null;
            str3 = null;
            z1Var = null;
            fe0Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1 o1Var = this.f168378c;
        o1Var.f168476d = rd5Var != null && rd5Var.f466282o;
        java.lang.String str6 = o1Var.f168473a.f156336n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "updateDeveloperServiceInfo appId:%s", str6);
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o1.f168471g;
        synchronized (hashMap) {
            if (fe0Var != null) {
                hashMap.put(str6, fe0Var);
            } else {
                hashMap.remove(str6);
            }
        }
        java.lang.String str7 = "";
        if (fe0Var != null) {
            try {
                str7 = new java.lang.String(n56.a.b(fe0Var.mo14344x5f01b1f6(), false));
            } catch (java.io.IOException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandMenuHeaderDataHelper", "updateDeveloperServiceInfo, encode error");
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_profile_info_mmkv_name" + str6).D("appbrand_developer_service_info_key", str7);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k1(this, c19777x35cb352a, str2, rd5Var, str3, z1Var, fe0Var));
    }
}
