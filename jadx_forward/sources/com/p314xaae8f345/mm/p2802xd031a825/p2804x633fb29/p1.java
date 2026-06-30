package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1 f295508h;

    /* renamed from: a, reason: collision with root package name */
    public int f295509a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f295510b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f295511c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f295512d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f295513e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i f295514f = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Vector f295515g = new java.util.Vector();

    public static java.lang.String b() {
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
    }

    public static com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1 c() {
        if (f295508h == null) {
            f295508h = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1();
        }
        return f295508h;
    }

    public static void e(java.lang.String str, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, str);
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_ENCRYPT_TYPE_INT_SYNC, java.lang.Integer.valueOf(iVar.ordinal()));
    }

    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (str.equals(b())) {
            this.f295509a = 0;
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_NO_STRING_SYNC, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigCertManager", "clean token %s  stack %s ", str, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                if (com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121786xf107e929(str)) {
                    com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121771xb437c611(str);
                } else if (com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121922x2982b3de(str)) {
                    com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121911xb437c611(str);
                }
            }
        }
        java.util.Iterator it = this.f295515g.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1 o1Var = (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, o1Var.f295493c)) {
                this.f295515g.remove(o1Var);
                return;
            }
        }
    }

    public void d(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("cert_info");
        if (optJSONObject == null) {
            return;
        }
        this.f295515g = new java.util.Vector();
        int optInt = optJSONObject.optInt("show_crt_info");
        this.f295509a = optJSONObject.optInt("is_crt_install");
        this.f295513e = optJSONObject.optString("crt_item_logo_url");
        this.f295510b = optJSONObject.optString("crt_entry_desc");
        this.f295511c = optJSONObject.optString("crt_entry_title");
        this.f295512d = optJSONObject.optString("crt_status_name");
        int optInt2 = optJSONObject.optInt("use_cert_encrypt_type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneKindaGenDigitalCert", "encrypt type: %d", java.lang.Integer.valueOf(optInt2));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar2 = (optInt2 < 0 || optInt2 > 2) ? iVar : com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[optInt2];
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar3 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeCa;
        if (iVar2 == iVar3) {
            this.f295514f = iVar3;
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar4 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeTw;
            if (iVar2 == iVar4) {
                this.f295514f = iVar4;
            } else {
                this.f295514f = iVar;
            }
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, java.lang.Integer.valueOf(optInt));
        java.lang.String b17 = b();
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("crt_list");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                try {
                    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1 o1Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o1(optJSONArray.getJSONObject(i17));
                    java.lang.String str = o1Var.f295493c;
                    if (o1Var.f295494d == 0) {
                        this.f295515g.add(o1Var);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigCertManager", "drop crt list no exist local drop: %s", str);
                    } else if (str.equals(b17)) {
                        this.f295515g.add(o1Var);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigCertManager", "drop crt list %s drop: %s", b17, str);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDigCertManager", "WalletDigCertManager error %s", e17.getMessage());
                }
            }
        }
    }
}
