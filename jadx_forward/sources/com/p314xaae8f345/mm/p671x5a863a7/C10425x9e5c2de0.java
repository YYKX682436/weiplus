package com.p314xaae8f345.mm.p671x5a863a7;

/* renamed from: com.tencent.mm.crash.CrashUploaderService */
/* loaded from: classes11.dex */
public class C10425x9e5c2de0 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f146404m;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(16);
        f146404m = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put(com.p314xaae8f345.mm.app.C4999x403c3a42.f134755c, 10002);
        hashMap.put("handler", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6));
        hashMap.put("sql", java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261));
        hashMap.put("permission", 10005);
    }

    public C10425x9e5c2de0() {
        super("CrashUploaderService");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public static boolean k(java.lang.String str, byte[] bArr, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int length = bArr.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(bArr);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        kk.d.b(c19764x527bffc1, a17, lowerCase.getBytes());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str3);
        sb6.append("/cgi-bin/mmsupport-bin/stackreport?version=");
        sb6.append(java.lang.Integer.toHexString(i17));
        sb6.append("&devicetype=");
        sb6.append(str2);
        sb6.append("&filelength=");
        sb6.append(length);
        sb6.append("&sum=");
        sb6.append(lowerCase);
        sb6.append("&reporttype=1&NewReportType=");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) f146404m.get(str4)));
        if (str != null && !str.equals("")) {
            sb6.append("&username=");
            sb6.append(str);
        }
        try {
            org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
            org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(sb6.toString());
            org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(c19764x527bffc1.f38861x6ac9171);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CrashUploaderService", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(defaultHttpClient.execute(httpPost).getEntity().getContent()));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CrashUploaderService", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.CrashUploaderService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9
    public void i(android.content.Intent intent) {
        int i17;
        java.lang.String str;
        int i18;
        java.lang.String[] split;
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("INTENT_EXTRA_EXCEPTION_MSG");
        java.lang.String stringExtra2 = intent.getStringExtra("INTENT_EXTRA_USER_NAME");
        java.lang.String stringExtra3 = intent.getStringExtra("INTENT_EXTRA_SDCARD_PATH");
        java.lang.String stringExtra4 = intent.getStringExtra("INTENT_EXTRA_DATA_PATH");
        java.lang.String stringExtra5 = intent.getStringExtra("INTENT_EXTRA_UIN");
        try {
            i17 = java.lang.Integer.decode(intent.getStringExtra("INTENT_EXTRA_CLIENT_VERSION")).intValue();
        } catch (java.lang.Error unused) {
            i17 = 0;
        }
        java.lang.String stringExtra6 = intent.getStringExtra("INTENT_EXTRA_DEVICE_TYPE");
        java.lang.String stringExtra7 = intent.getStringExtra("INTENT_EXTRA_HOST");
        java.lang.String stringExtra8 = intent.getStringExtra("INTENT_EXTRA_TAG");
        if (stringExtra8 == null || stringExtra8.length() == 0) {
            stringExtra8 = "exception";
        }
        java.lang.String str2 = (stringExtra2 + "," + stringExtra6 + "_" + i17 + "_" + android.os.Build.CPU_ABI + ",") + "exception,time_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + ",error_" + stringExtra;
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(stringExtra3);
            if (r6Var.m()) {
                com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
                if (G != null) {
                    for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
                        if (java.lang.System.currentTimeMillis() - r6Var2.B() > 2592000000L) {
                            r6Var2.l();
                        }
                    }
                }
            } else {
                r6Var.J();
            }
            j(stringExtra3 + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(new java.util.Date()) + ".txt", str2, stringExtra5);
        } catch (java.lang.Exception unused2) {
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(stringExtra4);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        java.lang.String str4 = stringExtra4 + stringExtra5;
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(str4);
        if (r6Var3.m()) {
            if (r6Var3.C() > 262144) {
                r6Var3.l();
            }
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str4, 0, -1);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                r6Var3.l();
                return;
            }
            str = stringExtra6;
            i18 = -1;
            if (k(stringExtra2, N, i17, stringExtra6, stringExtra7, stringExtra8)) {
                r6Var3.l();
            }
        } else {
            str = stringExtra6;
            i18 = -1;
        }
        java.lang.String str5 = stringExtra4 + stringExtra5 + "_nf/";
        com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(str5);
        if (!r6Var4.m()) {
            r6Var4.J();
        }
        j(str5 + "__" + i17 + "__" + java.lang.System.currentTimeMillis(), str2, stringExtra5);
        com.p314xaae8f345.mm.vfs.r6[] G2 = r6Var4.G();
        int length = G2.length;
        for (int i19 = 0; i19 < length; i19++) {
            com.p314xaae8f345.mm.vfs.r6 r6Var5 = G2[i19];
            if (r6Var5 != null && (split = r6Var5.m82467xfb82e301().split("__")) != null && split.length >= 2) {
                byte[] N2 = com.p314xaae8f345.mm.vfs.w6.N(r6Var5.u(), 0, i18);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N2)) {
                    r6Var5.l();
                } else if (k(stringExtra2, N2, java.lang.Integer.parseInt(split[1]), str, stringExtra7, stringExtra8)) {
                    r6Var5.l();
                }
            }
        }
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || str3.equals("0")) {
                sb6.append("uin[" + java.lang.Integer.toString((android.os.Build.DEVICE + android.os.Build.FINGERPRINT + android.os.Build.MANUFACTURER + android.os.Build.MODEL).hashCode()) + "] ");
            } else {
                sb6.append("uin[" + str3 + "] ");
            }
            sb6.append(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40538xd62ba4e5());
            sb6.append(" BRAND:[" + android.os.Build.BRAND + "] ");
            sb6.append("\n");
            com.p314xaae8f345.mm.vfs.w6.a(str, sb6.toString().getBytes());
        }
        com.p314xaae8f345.mm.vfs.w6.a(str, (str2 + "\n").getBytes());
    }
}
