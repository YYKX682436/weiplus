package dt4;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f324761a = com.p314xaae8f345.mm.p2802xd031a825.f.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Map f324762b = null;

    public static java.lang.String a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
            return null;
        }
        return java.lang.String.format("%s/%s", f324761a, kk.k.g(str.getBytes()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static at4.k b(android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt4.b.b(android.content.Context, java.lang.String):at4.k");
    }

    public static at4.k c(android.content.Context context, java.lang.String str, boolean z17) {
        if (!z17) {
            return b(context, str);
        }
        if (!"CITIC_CREDIT".equals(str)) {
            return null;
        }
        at4.k kVar = new at4.k();
        kVar.f95415e = com.p314xaae8f345.mm.R.C30861xcebc809e.chn;
        kVar.f95416f = com.p314xaae8f345.mm.R.C30861xcebc809e.chp;
        at4.k b17 = b(context, str);
        if (b17 == null) {
            return kVar;
        }
        kVar.f95411a = b17.f95411a;
        return kVar;
    }

    public static void d() {
        f324762b = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, ?> entry : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("bank_logo", 0).getAll().entrySet()) {
            f324762b.put(entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    public static boolean e(java.lang.String str) {
        try {
            if (f324762b == null) {
                f324762b = new java.util.HashMap();
            }
            android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("bank_logo", 0).edit();
            org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("bank_urls_list");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = c01.z1.I() ? jSONObject.optString("bank_desc") : jSONObject.optString("bank_type");
                java.lang.String jSONObject2 = jSONObject.toString();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject2)) {
                    break;
                }
                edit.putString(optString, jSONObject2);
                f324762b.put(optString, jSONObject2);
            }
            edit.commit();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBankLogoStorage", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
