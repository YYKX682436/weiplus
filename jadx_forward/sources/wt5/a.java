package wt5;

/* loaded from: classes15.dex */
public abstract class a implements zt5.b {

    /* renamed from: b, reason: collision with root package name */
    public static au5.k f531069b;

    /* renamed from: c, reason: collision with root package name */
    public static au5.b f531070c;

    static {
        zt5.h.c("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL", new java.lang.Object[0]);
        au5.b f17 = f();
        f531070c = f17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(f17 == null);
        zt5.h.c("Soter.SoterCore", "soter: SoterCore is call static block to init SoterCore IMPL, IMPL is null[%b]", objArr);
    }

    public static zt5.s a(byte[] bArr) {
        zt5.s sVar = null;
        if (bArr == null || bArr.length <= 0) {
            zt5.h.b("Soter.SoterCore", "origin is null or nil. abort", new java.lang.Object[0]);
            return null;
        }
        if (bArr.length < 4) {
            zt5.h.b("Soter.SoterCore", "soter: length not correct 1", new java.lang.Object[0]);
            return null;
        }
        byte[] bArr2 = new byte[4];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
        int i17 = 0;
        for (int i18 = 0; i18 < 4; i18++) {
            i17 += (bArr2[i18] & 255) << (i18 * 8);
        }
        zt5.h.a("Soter", "parsed raw length: " + i17, new java.lang.Object[0]);
        if (i17 > 1048576) {
            zt5.h.b("Soter.SoterCore", "soter: too large signature result!", new java.lang.Object[0]);
            return null;
        }
        byte[] bArr3 = new byte[i17];
        int i19 = i17 + 4;
        if (bArr.length <= i19) {
            zt5.h.b("Soter.SoterCore", "soter: length not correct 2", new java.lang.Object[0]);
            return null;
        }
        java.lang.System.arraycopy(bArr, 4, bArr3, 0, i17);
        java.lang.String str = new java.lang.String(bArr3);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            zt5.s sVar2 = new zt5.s();
            sVar2.f557162j = str;
            sVar2.f557153a = jSONObject.optString(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463);
            sVar2.f557154b = jSONObject.optString("fid");
            sVar2.f557155c = jSONObject.optLong("counter");
            sVar2.f557156d = jSONObject.optString("tee_n");
            sVar2.f557157e = jSONObject.optString("tee_v");
            sVar2.f557158f = jSONObject.optString("fp_n");
            sVar2.f557159g = jSONObject.optString("fp_v");
            sVar2.f557160h = jSONObject.optString("cpu_id");
            sVar2.f557161i = jSONObject.optInt("rsa_pss_saltlen", 20);
            sVar = sVar2;
        } catch (org.json.JSONException e17) {
            zt5.h.b("Soter.SoterSignatureResult", "soter: convert from json failed." + e17.toString(), new java.lang.Object[0]);
        }
        int length = bArr.length - i19;
        zt5.h.a("Soter.SoterCore", "soter: signature length: " + length, new java.lang.Object[0]);
        byte[] bArr4 = new byte[length];
        java.lang.System.arraycopy(bArr, i19, bArr4, 0, length);
        if (sVar != null) {
            sVar.f557163k = android.util.Base64.encodeToString(bArr4, 2);
        }
        return sVar;
    }

    public static java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<deviceinfo><MANUFACTURER name=\"");
        sb6.append(android.os.Build.MANUFACTURER);
        sb6.append("\"><MODEL name=\"");
        sb6.append(android.os.Build.MODEL);
        sb6.append("\"><VERSION_RELEASE name=\"");
        sb6.append(android.os.Build.VERSION.RELEASE);
        sb6.append("\"><VERSION_INCREMENTAL name=\"");
        sb6.append(android.os.Build.VERSION.INCREMENTAL);
        sb6.append("\"><DISPLAY name=\"");
        sb6.append(android.os.Build.DISPLAY);
        sb6.append("\"></DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        zt5.h.a("Soter.SoterCore", "soter: getFingerprint  " + sb6.toString(), new java.lang.Object[0]);
        return sb6.toString();
    }

    public static zt5.r c() {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.d();
        }
        zt5.h.b("Soter.SoterCore", "soter: getAppGlobalSecureKeyModel IMPL is null, not support soter", new java.lang.Object[0]);
        return null;
    }

    public static java.security.Signature d(java.lang.String str) {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.e(str);
        }
        zt5.h.b("Soter.SoterCore", "soter: getAuthInitAndSign IMPL is null, not support soter", new java.lang.Object[0]);
        return null;
    }

    public static zt5.r e(java.lang.String str) {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.f(str);
        }
        zt5.h.b("Soter.SoterCore", "soter: getAuthKeyModel IMPL is null, not support soter", new java.lang.Object[0]);
        return null;
    }

    public static au5.b f() {
        java.security.Provider[] providers;
        au5.c.v();
        if (zt5.o.f557141a.b() || (providers = java.security.Security.getProviders()) == null) {
            return null;
        }
        for (java.security.Provider provider : providers) {
            java.lang.String name = provider.getName();
            if (name != null && name.startsWith("SoterKeyStore")) {
                return name.split("\\.").length > 1 ? new au5.a(name) : new au5.c(name);
            }
        }
        return null;
    }

    public static int g() {
        au5.b bVar = f531070c;
        if (bVar == null) {
            return 0;
        }
        if (bVar instanceof au5.j) {
            zt5.h.a("Soter.SoterCore", "getSoterCoreType is TREBLE", new java.lang.Object[0]);
            return 1;
        }
        zt5.h.a("Soter.SoterCore", "getSoterCoreType is not TREBLE", new java.lang.Object[0]);
        return 0;
    }

    public static boolean h() {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.g();
        }
        zt5.h.b("Soter.SoterCore", "soter: hasAppGlobalSecureKey IMPL is null, not support soter", new java.lang.Object[0]);
        return false;
    }

    public static boolean i(java.lang.String str) {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.h(str);
        }
        zt5.h.b("Soter.SoterCore", "soter: hasAuthKey IMPL is null, not support soter", new java.lang.Object[0]);
        return false;
    }

    public static boolean j() {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.k();
        }
        zt5.h.b("Soter.SoterCore", "soter: isAppGlobalSecureKeyValid IMPL is null, not support soter", new java.lang.Object[0]);
        return false;
    }

    public static boolean k(android.content.Context context, int i17) {
        return (com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, java.lang.Integer.valueOf(i17)).m95995x80ed5ecf() || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, java.lang.Integer.valueOf(i17)).m95996xba1c2120(context)) ? false : true;
    }

    public static boolean l() {
        au5.b bVar = f531070c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: isNativeSupportSoter IMPL is null, not support soter", new java.lang.Object[0]);
            return false;
        }
        boolean m17 = bVar.m();
        zt5.h.b("Soter.SoterCore", "soter: isNativeSupportSoter return[" + m17 + "]", new java.lang.Object[0]);
        return m17;
    }

    public static boolean m(android.content.Context context, int i17) {
        boolean m95997xa185b5d4 = com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, java.lang.Integer.valueOf(i17)).m95997xa185b5d4();
        zt5.h.b("Soter.SoterCore", "soter: isSupportBiometric type[" + i17 + "] return[" + m95997xa185b5d4 + "]", new java.lang.Object[0]);
        return m95997xa185b5d4;
    }

    public static boolean n(android.content.Context context) {
        boolean m95997xa185b5d4 = com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, 1).m95997xa185b5d4();
        zt5.h.b("Soter.SoterCore", "soter: isSupportFingerprint return[" + m95997xa185b5d4 + "]", new java.lang.Object[0]);
        return m95997xa185b5d4;
    }

    public static boolean o(android.content.Context context, int i17) {
        return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, java.lang.Integer.valueOf(i17)).m95994x7fe982f9();
    }

    public static boolean p(android.content.Context context) {
        return com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, 1).m95994x7fe982f9();
    }

    public static boolean q() {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.n();
        }
        zt5.h.b("Soter.SoterCore", "soter: isTrebleServiceConnected IMPL is null, not support soter", new java.lang.Object[0]);
        return false;
    }

    public static zt5.k r() {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.o();
        }
        zt5.h.b("Soter.SoterCore", "soter: removeAppGlobalSecureKey IMPL is null, not support soter", new java.lang.Object[0]);
        return new zt5.k(2);
    }

    public static zt5.k s(java.lang.String str, boolean z17) {
        au5.b bVar = f531070c;
        if (bVar != null) {
            return bVar.p(str, z17);
        }
        zt5.h.b("Soter.SoterCore", "soter: removeAuthKey IMPL is null, not support soter", new java.lang.Object[0]);
        return new zt5.k(2);
    }
}
