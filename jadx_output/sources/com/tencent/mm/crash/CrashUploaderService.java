package com.tencent.mm.crash;

/* loaded from: classes11.dex */
public class CrashUploaderService extends com.tencent.mm.service.MMIntentService {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f64871m;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(16);
        f64871m = hashMap;
        hashMap.put("exception", 10001);
        hashMap.put(com.tencent.mm.app.MMBugReportContents.f53222c, 10002);
        hashMap.put("handler", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL));
        hashMap.put("sql", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID));
        hashMap.put("permission", 10005);
    }

    public CrashUploaderService() {
        super("CrashUploaderService");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public static boolean k(java.lang.String str, byte[] bArr, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int length = bArr.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(bArr);
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        kk.d.b(pByteArray, a17, lowerCase.getBytes());
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
        sb6.append(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) f64871m.get(str4)));
        if (str != null && !str.equals("")) {
            sb6.append("&username=");
            sb6.append(str);
        }
        try {
            org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
            org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(sb6.toString());
            org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(pByteArray.value);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashUploaderService", com.tencent.mm.sdk.platformtools.t8.e(defaultHttpClient.execute(httpPost).getEntity().getContent()));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashUploaderService", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.CrashUploaderService";
    }

    @Override // com.tencent.mm.service.MMIntentService
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
        java.lang.String str2 = (stringExtra2 + "," + stringExtra6 + "_" + i17 + "_" + android.os.Build.CPU_ABI + ",") + "exception,time_" + com.tencent.mm.sdk.platformtools.t8.i1() + ",error_" + stringExtra;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(stringExtra3);
            if (r6Var.m()) {
                com.tencent.mm.vfs.r6[] G = r6Var.G();
                if (G != null) {
                    for (com.tencent.mm.vfs.r6 r6Var2 : G) {
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
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(stringExtra4);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        java.lang.String str4 = stringExtra4 + stringExtra5;
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(str4);
        if (r6Var3.m()) {
            if (r6Var3.C() > 262144) {
                r6Var3.l();
            }
            byte[] N = com.tencent.mm.vfs.w6.N(str4, 0, -1);
            if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
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
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(str5);
        if (!r6Var4.m()) {
            r6Var4.J();
        }
        j(str5 + "__" + i17 + "__" + java.lang.System.currentTimeMillis(), str2, stringExtra5);
        com.tencent.mm.vfs.r6[] G2 = r6Var4.G();
        int length = G2.length;
        for (int i19 = 0; i19 < length; i19++) {
            com.tencent.mm.vfs.r6 r6Var5 = G2[i19];
            if (r6Var5 != null && (split = r6Var5.getName().split("__")) != null && split.length >= 2) {
                byte[] N2 = com.tencent.mm.vfs.w6.N(r6Var5.u(), 0, i18);
                if (com.tencent.mm.sdk.platformtools.t8.M0(N2)) {
                    r6Var5.l();
                } else if (k(stringExtra2, N2, java.lang.Integer.parseInt(split[1]), str, stringExtra7, stringExtra8)) {
                    r6Var5.l();
                }
            }
        }
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || str3.equals("0")) {
                sb6.append("uin[" + java.lang.Integer.toString((android.os.Build.DEVICE + android.os.Build.FINGERPRINT + android.os.Build.MANUFACTURER + android.os.Build.MODEL).hashCode()) + "] ");
            } else {
                sb6.append("uin[" + str3 + "] ");
            }
            sb6.append(com.tencent.mars.xlog.Log.getSysInfo());
            sb6.append(" BRAND:[" + android.os.Build.BRAND + "] ");
            sb6.append("\n");
            com.tencent.mm.vfs.w6.a(str, sb6.toString().getBytes());
        }
        com.tencent.mm.vfs.w6.a(str, (str2 + "\n").getBytes());
    }
}
