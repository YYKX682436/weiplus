package wo3;

/* loaded from: classes9.dex */
public abstract class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f529697d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f529698e;

    public void H(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f529697d = u0Var;
        return mo9409x10f9447a(sVar, this.f529698e, this);
    }

    /* renamed from: getFuncId */
    public abstract int mo174269x19c9adf5();

    /* renamed from: getTenpayCgicmd */
    public abstract int mo174270x46809856();

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 385;
    }

    /* renamed from: getUri */
    public abstract java.lang.String mo174271xb5887636();

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String str2;
        int i27;
        int i28;
        int i29 = i18;
        int i37 = i19;
        java.lang.String str3 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + mo174270x46809856() + ", errType = " + i29 + ", errCode = " + i37 + ", errMsg = " + str3);
        r45.gl6 gl6Var = (r45.gl6) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i29 == 0 && i37 == 0) {
            if (gl6Var.f456876e == 0) {
                java.lang.String f17 = x51.j1.f(gl6Var.f456875d);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(f17);
                    int i38 = jSONObject.getInt("retcode");
                    java.lang.String str4 = gl6Var.f456880i;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        str4 = jSONObject.optString("retmsg");
                    }
                    int i39 = gl6Var.f456879h;
                    if (i38 == 0 && i39 == 0) {
                        mo174272x5f9cdc6f(i38, str4, jSONObject);
                        i38 = i37;
                        str4 = str3;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayOfflineBase", "ErrCode tenpayErrType : " + i39);
                        if (i39 != 0) {
                            i38 = i39;
                        }
                        if (i38 == 0) {
                            i38 = -1000;
                        }
                        i29 = 1000;
                    }
                    H(gl6Var.f456879h, gl6Var.f456880i, f17);
                    i28 = i29;
                    str2 = str4;
                    i27 = i38;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneTenpayOfflineBase", e17, "", new java.lang.Object[0]);
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
                }
                str3 = str2;
                i37 = i27;
                i29 = i28;
            } else {
                str2 = gl6Var.f456877f;
            }
            i27 = 2;
            i28 = 1000;
            str3 = str2;
            i37 = i27;
            i29 = i28;
        } else {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str3, "e", null);
            if (d17 != null) {
                str3 = (java.lang.String) d17.get(".e.Content");
            }
        }
        if (i29 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayOfflineBase", "Cmd : " + mo174270x46809856() + ", errType = " + i29 + ", errCode = " + i37 + ", errMsg = " + str3);
        }
        this.f529697d.mo815x76e0bfae(i29, i37, str3, this);
        mo174270x46809856();
    }

    /* renamed from: onGYNetEnd */
    public abstract void mo174272x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    /* renamed from: setRequestData */
    public void m174273xb4c13117(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        if (!h45.y.c()) {
            map.put("jsapi_reqkey", h45.y.f360501a);
        }
        if (this.f529698e == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.fl6();
            lVar.f152198b = new r45.gl6();
            java.lang.String mo174271xb5887636 = mo174271xb5887636();
            int mo174269x19c9adf5 = mo174269x19c9adf5();
            lVar.f152199c = mo174271xb5887636;
            lVar.f152200d = mo174269x19c9adf5;
            lVar.f152201e = 185;
            lVar.f152202f = 1000000185;
            this.f529698e = lVar.a();
        }
        r45.fl6 fl6Var = (r45.fl6) this.f529698e.f152243a.f152217a;
        fl6Var.f455960d = mo174270x46809856();
        fl6Var.f455961e = 1;
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        boolean z17 = false;
        while (true) {
            if (i17 >= array.length) {
                break;
            }
            java.lang.Object obj = array[i17];
            java.lang.String str = (java.lang.String) map.get(obj);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (z17) {
                    sb6.append("&");
                }
                sb6.append(obj);
                sb6.append("=");
                sb6.append(str);
                z17 = true;
            }
            i17++;
        }
        java.lang.String m121664x51474d82 = com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28004x1aebb22d.m121664x51474d82(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        boolean z18 = false;
        for (java.lang.Object obj2 : array) {
            java.lang.String str2 = (java.lang.String) map.get(obj2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (z18) {
                    sb7.append("&");
                }
                sb7.append(obj2);
                sb7.append("=");
                sb7.append(fp.s0.a(str2));
                z18 = true;
            }
        }
        sb7.append(z18 ? "&" : "");
        sb7.append("WCPaySign=");
        sb7.append(m121664x51474d82);
        byte[] bytes = sb7.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        fl6Var.f455962f = cu5Var;
    }
}
