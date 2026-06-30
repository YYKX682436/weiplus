package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, w60.k {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f71354m = true;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71355d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71356e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71357f;

    /* renamed from: g, reason: collision with root package name */
    public final long f71358g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f71359h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f71360i;

    public k0(int i17, int i18) {
        this.f71357f = android.os.SystemClock.elapsedRealtime();
        this.f71358g = java.lang.System.currentTimeMillis();
        this.f71359h = new android.os.Bundle();
        com.tencent.mm.modelbase.o c17 = com.tencent.mm.modelsimple.j0.c(com.tencent.mm.modelsimple.i0.GetA8Key);
        com.tencent.mm.modelsimple.j0.a(c17);
        this.f71356e = c17;
        r45.r83 r83Var = (r45.r83) c17.f70710a.f70684a;
        r83Var.f384610d = 3;
        r83Var.f384618o = 5;
        r83Var.f384617n = i17;
        r83Var.f384628y = i18;
        int i19 = r83Var.f384611e.f371839d;
    }

    public static org.json.JSONObject H() {
        try {
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(200, 1) : com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").getString("MMKV_KEY_GETA8KEY_CONFIG_FILE", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17) || !com.tencent.mm.vfs.w6.j(b17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetA8Key", "getPayConfigJson error, filePath:%s not exits", b17);
            } else {
                java.lang.String M = com.tencent.mm.vfs.w6.M(b17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(M)) {
                    if (com.tencent.mm.sdk.platformtools.x2.n()) {
                        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putString("MMKV_KEY_GETA8KEY_CONFIG_FILE", b17);
                    }
                    return new org.json.JSONObject(M);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetA8Key", "getPayConfigJson error, content is null", b17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetA8Key", e17, "getPayConfigJson", new java.lang.Object[0]);
        }
        return null;
    }

    public static boolean I(android.net.Uri uri, org.json.JSONArray jSONArray) {
        java.lang.String str = uri.getHost() + uri.getPath();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.String optString = jSONArray.optString(i17);
                if (str.startsWith(optString)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "url:%s is startsWith prefix:%s", str, optString);
                    return true;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetA8Key", "prefixes is null");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "url:%s is not match", str);
        return false;
    }

    public byte[] J() {
        r45.cu5 cu5Var = ((r45.s83) this.f71356e.f70711b.f70700a).A;
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
        return ((r45.s83) this.f71356e.f70711b.f70700a).f385547f;
    }

    public int L() {
        return ((r45.s83) this.f71356e.f70711b.f70700a).BaseResponse.f376959d;
    }

    public int M() {
        return ((r45.r83) this.f71356e.f70710a.f70684a).f384626w;
    }

    public java.lang.String N() {
        return ((r45.s83) this.f71356e.f70711b.f70700a).f385549h;
    }

    public int O() {
        return ((r45.r83) this.f71356e.f70710a.f70684a).f384628y;
    }

    public long P() {
        r45.mb0 mb0Var = ((r45.s83) this.f71356e.f70711b.f70700a).f385559u;
        if (mb0Var != null) {
            return mb0Var.f380318d;
        }
        return -1L;
    }

    public java.lang.String Q() {
        return ((r45.s83) this.f71356e.f70711b.f70700a).f385545d;
    }

    public java.lang.String R() {
        r45.du5 du5Var = ((r45.r83) this.f71356e.f70710a.f70684a).f384615i;
        if (du5Var != null) {
            return du5Var.f372756d;
        }
        return null;
    }

    public int S() {
        return ((r45.s83) this.f71356e.f70711b.f70700a).computeSize();
    }

    public java.lang.String T() {
        return ((r45.s83) this.f71356e.f70711b.f70700a).f385553o;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71355d = u0Var;
        R();
        O();
        return dispatch(sVar, this.f71356e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        Q();
        java.lang.String str2 = ((r45.s83) this.f71356e.f70711b.f70700a).f385546e;
        O();
        com.tencent.mm.sdk.platformtools.t8.l(J());
        long j17 = this.f71358g;
        android.os.Bundle bundle = this.f71359h;
        bundle.putLong("CgiSpeedOutSideStructStartTimeStamp", j17);
        bundle.putLong("CgiSpeedOutSideStructEndTimeStamp", java.lang.System.currentTimeMillis());
        bundle.putLong("CgiSpeedOutSideStructCostTime", android.os.SystemClock.elapsedRealtime() - this.f71357f);
        bundle.putInt("CgiSpeedOutSideStructCgiNo", com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
        bundle.putInt("CgiSpeedOutSideStructRet", i19);
        this.f71355d.onSceneEnd(i18, i19, str, this);
    }

    public k0(java.lang.String str, int i17) {
        this.f71357f = android.os.SystemClock.elapsedRealtime();
        this.f71358g = java.lang.System.currentTimeMillis();
        this.f71359h = new android.os.Bundle();
        this.f71356e = com.tencent.mm.modelsimple.j0.b(str, i17);
    }

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.modelsimple.i0 i0Var = com.tencent.mm.modelsimple.i0.MpGetA8Key;
        this.f71357f = android.os.SystemClock.elapsedRealtime();
        this.f71358g = java.lang.System.currentTimeMillis();
        this.f71359h = new android.os.Bundle();
        com.tencent.mm.modelbase.o c17 = com.tencent.mm.modelsimple.j0.c(i0Var);
        this.f71356e = c17;
        r45.r83 r83Var = (r45.r83) c17.f70710a.f70684a;
        r83Var.f384610d = 1;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384612f = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = str2;
        du5Var2.f372757e = true;
        r83Var.f384613g = du5Var2;
        r45.du5 du5Var3 = new r45.du5();
        du5Var3.f372756d = str3;
        du5Var3.f372757e = true;
        r83Var.f384614h = du5Var3;
        r83Var.f384628y = i17;
    }

    public k0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, byte[] bArr) {
        this(str, i18);
        r45.r83 r83Var = (r45.r83) this.f71356e.f70710a.f70684a;
        r83Var.f384610d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384615i = du5Var;
        r83Var.f384618o = i17;
        r83Var.f384619p = str2;
        r83Var.f384622s = i18;
        r83Var.f384628y = i19;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        r83Var.B = cu5Var;
        com.tencent.mm.sdk.platformtools.t8.l(bArr);
    }
}
