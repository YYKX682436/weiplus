package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public class k0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, w60.k {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f152887m = true;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152888d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152889e;

    /* renamed from: f, reason: collision with root package name */
    public final long f152890f;

    /* renamed from: g, reason: collision with root package name */
    public final long f152891g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f152892h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f152893i;

    public k0(int i17, int i18) {
        this.f152890f = android.os.SystemClock.elapsedRealtime();
        this.f152891g = java.lang.System.currentTimeMillis();
        this.f152892h = new android.os.Bundle();
        com.p314xaae8f345.mm.p944x882e457a.o c17 = com.p314xaae8f345.mm.p957x53236a1b.j0.c(com.p314xaae8f345.mm.p957x53236a1b.i0.GetA8Key);
        com.p314xaae8f345.mm.p957x53236a1b.j0.a(c17);
        this.f152889e = c17;
        r45.r83 r83Var = (r45.r83) c17.f152243a.f152217a;
        r83Var.f466143d = 3;
        r83Var.f466151o = 5;
        r83Var.f466150n = i17;
        r83Var.f466161y = i18;
        int i19 = r83Var.f466144e.f453372d;
    }

    public static org.json.JSONObject H() {
        try {
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(200, 1) : com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").getString("MMKV_KEY_GETA8KEY_CONFIG_FILE", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) || !com.p314xaae8f345.mm.vfs.w6.j(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetA8Key", "getPayConfigJson error, filePath:%s not exits", b17);
            } else {
                java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(b17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(M)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putString("MMKV_KEY_GETA8KEY_CONFIG_FILE", b17);
                    }
                    return new org.json.JSONObject(M);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetA8Key", "getPayConfigJson error, content is null", b17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetA8Key", e17, "getPayConfigJson", new java.lang.Object[0]);
        }
        return null;
    }

    public static boolean I(android.net.Uri uri, org.json.JSONArray jSONArray) {
        java.lang.String str = uri.getHost() + uri.getPath();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.String optString = jSONArray.optString(i17);
                if (str.startsWith(optString)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "url:%s is startsWith prefix:%s", str, optString);
                    return true;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetA8Key", "prefixes is null");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetA8Key", "url:%s is not match", str);
        return false;
    }

    public byte[] J() {
        r45.cu5 cu5Var = ((r45.s83) this.f152889e.f152244b.f152233a).A;
        if (cu5Var == null) {
            return new byte[0];
        }
        try {
            return x51.j1.d(cu5Var);
        } catch (java.lang.Exception unused) {
            return new byte[0];
        }
    }

    public int K() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).f467080f;
    }

    public int L() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).f76492x92037252.f458492d;
    }

    public int M() {
        return ((r45.r83) this.f152889e.f152243a.f152217a).f466159w;
    }

    public java.lang.String N() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).f467082h;
    }

    public int O() {
        return ((r45.r83) this.f152889e.f152243a.f152217a).f466161y;
    }

    public long P() {
        r45.mb0 mb0Var = ((r45.s83) this.f152889e.f152244b.f152233a).f467092u;
        if (mb0Var != null) {
            return mb0Var.f461851d;
        }
        return -1L;
    }

    public java.lang.String Q() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).f467078d;
    }

    public java.lang.String R() {
        r45.du5 du5Var = ((r45.r83) this.f152889e.f152243a.f152217a).f466148i;
        if (du5Var != null) {
            return du5Var.f454289d;
        }
        return null;
    }

    public int S() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).mo75928xcd1e8d8();
    }

    public java.lang.String T() {
        return ((r45.s83) this.f152889e.f152244b.f152233a).f467086o;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152888d = u0Var;
        R();
        O();
        return mo9409x10f9447a(sVar, this.f152889e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        Q();
        java.lang.String str2 = ((r45.s83) this.f152889e.f152244b.f152233a).f467079e;
        O();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(J());
        long j17 = this.f152891g;
        android.os.Bundle bundle = this.f152892h;
        bundle.putLong("CgiSpeedOutSideStructStartTimeStamp", j17);
        bundle.putLong("CgiSpeedOutSideStructEndTimeStamp", java.lang.System.currentTimeMillis());
        bundle.putLong("CgiSpeedOutSideStructCostTime", android.os.SystemClock.elapsedRealtime() - this.f152890f);
        bundle.putInt("CgiSpeedOutSideStructCgiNo", com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d);
        bundle.putInt("CgiSpeedOutSideStructRet", i19);
        this.f152888d.mo815x76e0bfae(i18, i19, str, this);
    }

    public k0(java.lang.String str, int i17) {
        this.f152890f = android.os.SystemClock.elapsedRealtime();
        this.f152891g = java.lang.System.currentTimeMillis();
        this.f152892h = new android.os.Bundle();
        this.f152889e = com.p314xaae8f345.mm.p957x53236a1b.j0.b(str, i17);
    }

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.mm.p957x53236a1b.i0 i0Var = com.p314xaae8f345.mm.p957x53236a1b.i0.MpGetA8Key;
        this.f152890f = android.os.SystemClock.elapsedRealtime();
        this.f152891g = java.lang.System.currentTimeMillis();
        this.f152892h = new android.os.Bundle();
        com.p314xaae8f345.mm.p944x882e457a.o c17 = com.p314xaae8f345.mm.p957x53236a1b.j0.c(i0Var);
        this.f152889e = c17;
        r45.r83 r83Var = (r45.r83) c17.f152243a.f152217a;
        r83Var.f466143d = 1;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        r83Var.f466145f = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = str2;
        du5Var2.f454290e = true;
        r83Var.f466146g = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f454289d = str3;
        du5Var3.f454290e = true;
        r83Var.f466147h = du5Var3;
        r83Var.f466161y = i17;
    }

    public k0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, byte[] bArr) {
        this(str, i18);
        r45.r83 r83Var = (r45.r83) this.f152889e.f152243a.f152217a;
        r83Var.f466143d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str;
        du5Var.f454290e = true;
        r83Var.f466148i = du5Var;
        r83Var.f466151o = i17;
        r83Var.f466152p = str2;
        r83Var.f466155s = i18;
        r83Var.f466161y = i19;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        r83Var.B = cu5Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr);
    }
}
