package qg1;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f444304m;

    /* renamed from: n, reason: collision with root package name */
    public final int f444305n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f444306o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f444307p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile java.util.HashMap f444308q = new java.util.HashMap();

    public k(java.lang.String str, int i17, java.util.List list, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nb nbVar) {
        this.f444304m = str;
        this.f444305n = i17;
        this.f444306o = c12566x87f2d8b7;
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        r45.wb7 wb7Var = new r45.wb7();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            qg1.o oVar = (qg1.o) it.next();
            r45.vb7 vb7Var = new r45.vb7();
            vb7Var.f469618d = oVar.f444318a;
            vb7Var.f469619e = oVar.f444319b;
            vb7Var.f469620f = oVar.f444320c;
            wb7Var.f470580d.add(vb7Var);
        }
        wb7Var.f470581e = wo.w0.m();
        wb7Var.f470582f = android.os.Build.BRAND;
        wb7Var.f470583g = android.os.Build.MANUFACTURER;
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        wb7Var.f470584h = str3;
        wb7Var.f470587n = str3;
        wb7Var.f470588o = android.os.Build.VERSION.INCREMENTAL;
        wb7Var.f470589p = android.os.Build.DISPLAY;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        if (a17 != null) {
            wb7Var.f470585i = a17.W0();
            wb7Var.f470586m = a17.i();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5124;
        lVar.f152199c = "/cgi-bin/mmgame-bin/getwxagameabtestinfo";
        lVar.f152197a = wb7Var;
        lVar.f152198b = new r45.xb7();
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            qg1.o oVar2 = (qg1.o) it6.next();
            sb6.append("{appId:");
            sb6.append(oVar2.f444318a);
            sb6.append(", appType:");
            sb6.append(oVar2.f444319b);
            sb6.append(", versionType:");
            sb6.append(oVar2.f444320c);
            sb6.append("}");
        }
        sb6.append("]");
        objArr[2] = sb6.toString();
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = this.f444306o.f169667d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, instanceId:%s", objArr);
    }

    public static java.lang.String s(java.lang.String str, int i17, int i18) {
        return str + (i17 == 1 ? "_weApp" : i17 == 2 ? "_plugin" : "") + i18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        byte[] mo14344x5f01b1f6;
        r45.vb7 vb7Var;
        r45.xb7 xb7Var = (r45.xb7) fVar;
        if (xb7Var == null) {
            str2 = "NULL";
        } else if (xb7Var.f471496d == null) {
            str2 = "NULL_API_INFO_LIST";
        } else {
            str2 = "API_INFO_LIST SIZE:" + xb7Var.f471496d.size();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f444307p), str2);
        if (i17 != 0 || i18 != 0 || xb7Var == null || (linkedList = xb7Var.f471496d) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.yb7 yb7Var = (r45.yb7) it.next();
            if (!((yb7Var == null || (vb7Var = yb7Var.f472485d) == null || vb7Var.f469618d == null || yb7Var.f472486e == null) ? false : true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql: error! response is invalid");
                break;
            }
            java.lang.String str3 = yb7Var.f472485d.f469618d;
            r45.l63 l63Var = yb7Var.f472487f;
            if (l63Var != null) {
                try {
                    mo14344x5f01b1f6 = l63Var.mo14344x5f01b1f6();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "getGameRewardDataByteArray error: ", e17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9 o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9.class);
                r45.vb7 vb7Var2 = yb7Var.f472485d;
                int i19 = vb7Var2.f469619e;
                int i27 = vb7Var2.f469620f;
                byte[] g17 = yb7Var.f472486e.g();
                o9Var.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(g17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo,invalid input %s", str3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "insertOrUpdate, appId:%s , appType :%d, versionType :%d", str3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n9 n9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n9();
                    n9Var.f68522x28d45f97 = str3;
                    n9Var.f68523x454032b6 = i19;
                    n9Var.f68526x94d24c6d = i27;
                    n9Var.f68525xed561697 = g17;
                    boolean z17 = o9Var.get(n9Var, new java.lang.String[0]);
                    n9Var.f68525xed561697 = g17;
                    n9Var.f68524x3cc05c57 = mo14344x5f01b1f6;
                    if (z17 ? o9Var.mo9952xce0038c9(n9Var, new java.lang.String[0]) : o9Var.mo880xb970c2b9(n9Var)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo appId:%s ok", str3);
                    }
                }
                java.util.HashMap hashMap = this.f444308q;
                r45.vb7 vb7Var3 = yb7Var.f472485d;
                hashMap.put(s(str3, vb7Var3.f469619e, vb7Var3.f469620f), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89(yb7Var.f472486e.g(), mo14344x5f01b1f6));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:wxaAppidABTest AppId:%s, size:%d", str3, java.lang.Integer.valueOf(yb7Var.f472486e.g().length));
            }
            mo14344x5f01b1f6 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9 o9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o9.class);
            r45.vb7 vb7Var22 = yb7Var.f472485d;
            int i192 = vb7Var22.f469619e;
            int i272 = vb7Var22.f469620f;
            byte[] g172 = yb7Var.f472486e.g();
            o9Var2.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo,invalid input %s", str3);
            java.util.HashMap hashMap2 = this.f444308q;
            r45.vb7 vb7Var32 = yb7Var.f472485d;
            hashMap2.put(s(str3, vb7Var32.f469619e, vb7Var32.f469620f), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89(yb7Var.f472486e.g(), mo14344x5f01b1f6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:wxaAppidABTest AppId:%s, size:%d", str3, java.lang.Integer.valueOf(yb7Var.f472486e.g().length));
        }
        if (this.f444307p) {
            return;
        }
        java.lang.String str4 = this.f444304m;
        int i28 = this.f444305n;
        java.lang.String str5 = this.f444306o.f169667d;
        java.util.HashMap hashMap3 = this.f444308q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.j(str5);
        if (j17 != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str4;
            objArr[1] = java.lang.Integer.valueOf(i28);
            objArr[2] = str5;
            objArr[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyAppidABTestPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr);
            if (j17.f166902n != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) j17.f166902n.a(0);
                if (c11813xf952a195 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyAppidABTestPermissionInfoUpdate null config with appId(%s)", str4);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = str4;
                    objArr2[1] = java.lang.Integer.valueOf(i28);
                    objArr2[2] = str5;
                    objArr2[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]", objArr2);
                    c11813xf952a195.C = hashMap3;
                    j17.f166902n = nm5.j.d(c11813xf952a195, null, j17.S);
                }
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[4];
                objArr3[0] = str4;
                objArr3[1] = java.lang.Integer.valueOf(i28);
                objArr3[2] = str5;
                objArr3[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] set mMaybeUpdatedAppidABTestPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]", objArr3);
                j17.f166916x1 = hashMap3;
            }
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[4];
            objArr4[0] = str4;
            objArr4[1] = java.lang.Integer.valueOf(i28);
            objArr4[2] = str5;
            objArr4[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyAppidABTestPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12342x9640fe16 c12342x9640fe16 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12342x9640fe16();
            c12342x9640fe16.f165960d = str4;
            c12342x9640fe16.f165961e = i28;
            c12342x9640fe16.f165962f = hashMap3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.l.a(str4, c12342x9640fe16);
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr5 = new java.lang.Object[4];
            objArr5[0] = str4;
            objArr5[1] = java.lang.Integer.valueOf(i28);
            objArr5[2] = str5;
            objArr5[3] = java.lang.Integer.valueOf(hashMap3 != null ? hashMap3.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", th6, "notifyAppidABTestPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr5);
        }
    }
}
