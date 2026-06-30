package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes7.dex */
public class fb extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f275473e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.eb.f275423r, "UserOpenIdInApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f275474d;

    public fb(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.eb.f275423r, "UserOpenIdInApp", null);
        this.f275474d = k0Var;
        k0Var.A("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
        k0Var.A("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo11260x413cb2b4(com.p314xaae8f345.mm.p2621x8fb0427b.eb ebVar) {
        if (ebVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ebVar.f67851x28d45f97) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ebVar.f67852x996f3ea) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ebVar.f67853xdec927b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
            return false;
        }
        return this.f275474d.m("UserOpenIdInApp", com.p314xaae8f345.mm.p2621x8fb0427b.eb.f275423r.f398486b, ebVar.mo9763xeb27878e()) > 0;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.eb y0(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f275474d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
        android.database.Cursor D = k0Var.D("UserOpenIdInApp", null, "appId=? and username=? ", new java.lang.String[]{str, str2}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with appId-%s, username-%s:", str, str2);
            D.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.eb ebVar = new com.p314xaae8f345.mm.p2621x8fb0427b.eb();
        ebVar.mo9015xbf5d97fd(D);
        D.close();
        return ebVar;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.eb z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f275474d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        android.database.Cursor D = k0Var.D("UserOpenIdInApp", null, "openId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:".concat(str));
            D.close();
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.eb ebVar = new com.p314xaae8f345.mm.p2621x8fb0427b.eb();
        ebVar.mo9015xbf5d97fd(D);
        D.close();
        return ebVar;
    }
}
