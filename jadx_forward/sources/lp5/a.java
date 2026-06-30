package lp5;

/* loaded from: classes9.dex */
public abstract class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f401978d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f401979e;

    public abstract java.lang.String H();

    public abstract int I();

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f401978d = u0Var;
        return mo9409x10f9447a(sVar, this.f401979e, this);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String string;
        java.lang.String str2;
        int i27;
        int i28 = i18;
        int i29 = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + I() + ", errType = " + i28 + ", errCode = " + i29 + ", errMsg = " + str + " " + mo808xfb85f7b0());
        r45.ex3 ex3Var = (r45.ex3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i28 == 0 && i29 == 0) {
            int i37 = ex3Var.f455315e;
            java.lang.String f17 = x51.j1.f(ex3Var.f455314d);
            int i38 = 1000;
            if (i37 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                int i39 = ex3Var.f455318h;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(f17);
                    int i47 = jSONObject.getInt("retcode");
                    java.lang.String optString = jSONObject.optString("retmsg");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        optString = ex3Var.f455319i;
                    }
                    if ((i47 == 0 && i39 == 0) || (this instanceof ww1.t1)) {
                        mo68407x5f9cdc6f(i47, optString, jSONObject);
                        i38 = i28;
                        i39 = i29;
                        optString = str;
                    } else if (i39 == 0) {
                        i39 = -1000;
                    }
                    str2 = optString;
                    i27 = i39;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MiroMsg.NetSceneTenpayH5TransferBase", e17, "", new java.lang.Object[0]);
                    str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
                }
                string = str2;
                i29 = i27;
                i28 = i38;
            } else {
                str2 = ex3Var.f455316f;
            }
            i27 = 2;
            string = str2;
            i29 = i27;
            i28 = i38;
        } else {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
            if (d17 != null) {
                string = (java.lang.String) d17.get(".e.Content");
            } else {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
            }
        }
        if (i28 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + I() + ", errType = " + i28 + ", errCode = " + i29 + ", errMsg = " + string);
        }
        this.f401978d.mo815x76e0bfae(i28, i29, string, this);
    }

    /* renamed from: onGYNetEnd */
    public abstract void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject);

    /* renamed from: setRequestData */
    public void m146205xb4c13117(java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        if (this.f401979e == null) {
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.dx3();
            lVar.f152198b = new r45.ex3();
            lVar.f152199c = H();
            lVar.f152200d = mo808xfb85f7b0();
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            this.f401979e = a17;
            a17.m47986x306cfea3(true);
        }
        r45.dx3 dx3Var = (r45.dx3) this.f401979e.f152243a.f152217a;
        dx3Var.f454356d = I();
        dx3Var.f454357e = 1;
        java.lang.Object[] array = map.keySet().toArray();
        java.util.Arrays.sort(array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        for (java.lang.Object obj : array) {
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
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.NetSceneTenpayH5TransferBase", "Cmd : " + dx3Var.f454356d + ", req = " + sb6.toString());
        byte[] bytes = sb6.toString().getBytes();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bytes);
        dx3Var.f454358f = cu5Var;
    }
}
