package nz2;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f423076a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f423077b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f423078c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f423079d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f423080e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f423081f;

    public static nz2.c a(java.lang.String str, int i17, int i18, int i19, int i27) {
        nz2.c cVar = new nz2.c();
        cVar.f423076a = i17;
        cVar.f423077b = i18;
        cVar.f423078c = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63455xd772203(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k(), java.lang.String.valueOf(i18), com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.a(), str, wo.w0.m());
        cVar.f423079d = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63454x6d7333e1(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k(), cVar.f423078c);
        return cVar;
    }

    public static nz2.c b(eu5.a aVar) {
        nz2.c cVar = new nz2.c();
        boolean a17 = aVar.a();
        mz2.d2 d2Var = mz2.d2.IML;
        if (a17) {
            zt5.s sVar = (zt5.s) aVar.f338360c;
            if (sVar != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("json", sVar.f557162j);
                    jSONObject.put("signature", sVar.f557163k);
                    java.lang.String str = sVar.f557162j;
                    cVar.f423080e = str;
                    java.lang.String str2 = sVar.f557163k;
                    cVar.f423081f = str2;
                    d2Var.f414647g = sVar;
                    cVar.f423076a = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BiometricPayAuthenticationResult", "soter authen result: %s, sign: %s", str, str2);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BiometricPayAuthenticationResult", e17, "", new java.lang.Object[0]);
                    cVar.f423076a = 3000;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BiometricPayAuthenticationResult", "signature result is null");
                cVar.f423076a = 3000;
            }
        } else {
            int i17 = aVar.f557138a;
            if (i17 == 1007 || i17 == 1027 || i17 == 1018) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BiometricPayAuthenticationResult", "init error, maybe key invalid. remove former key and give suggestion");
                cVar.f423076a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8;
                d2Var.f414646f = true;
            } else if (i17 == 1021 || i17 == 1022) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BiometricPayAuthenticationResult", "too many trial");
                cVar.f423076a = 10308;
            } else if (i17 == 1020) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BiometricPayAuthenticationResult", "user cancelled");
                cVar.f423076a = 2000;
            } else if (i17 == 1023) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BiometricPayAuthenticationResult", "add authenticate task failed");
                cVar.f423076a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654;
            } else if (i17 == 1029) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BiometricPayAuthenticationResult", "clicked negative button");
                cVar.f423076a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef;
            } else {
                cVar.f423076a = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111;
            }
        }
        return cVar;
    }
}
