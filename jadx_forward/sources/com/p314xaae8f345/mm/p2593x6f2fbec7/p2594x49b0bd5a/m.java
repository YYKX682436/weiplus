package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* loaded from: classes11.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f273835a = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "crash/";

    public static boolean a(java.lang.String str, byte[] bArr) {
        final java.util.Map d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "post url = %s, data.length = %s", str, java.lang.Integer.valueOf(bArr.length));
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "binary/octet-stream");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "post url responseCode = %d", java.lang.Integer.valueOf(responseCode));
                java.lang.String e17 = responseCode == 200 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(httpURLConnection.getInputStream()) : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(httpURLConnection.getErrorStream());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "post url returnConnection = %s", e17);
                if (!e17.isEmpty() && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(e17, "Response", null)) != null && "-1000".equalsIgnoreCase((java.lang.String) d17.get(".Response.retCode")) && d17.get(".Response.url") != null) {
                    ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.mm.sandbox.monitor.m$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.content.Intent className = new android.content.Intent().setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.mm.sandbox.updater.AppUpdaterUI");
                            className.addFlags(268435456);
                            java.util.Map map = d17;
                            className.putExtra("intent_extra_desc", (java.lang.String) map.get(".Response.desc"));
                            className.putExtra("intent_update_type", 999);
                            className.putExtra("intent_extra_download_url", new java.lang.String[]{(java.lang.String) map.get(".Response.url")});
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(className);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sandbox/monitor/MMBugReporter", "lambda$post$2", "(Ljava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(context, "com/tencent/mm/sandbox/monitor/MMBugReporter", "lambda$post$2", "(Ljava/util/Map;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }, 500L);
                }
                com.p314xaae8f345.mm.app.p4.a(35);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "post url responseCode = %d returnConnection = %s", java.lang.Integer.valueOf(responseCode), e17);
                return responseCode == 200;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p4.a(36);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBugReporter", th6, "error type: %s, msg: %s", th6.getClass().getSimpleName(), th6.getMessage());
            return false;
        }
    }

    public static void b(java.lang.String str, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "saveCrashFile file exists " + file.getAbsolutePath());
        }
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.a(str, (c20964xc27324c3.m77654x9616526c() + "\n").getBytes());
    }

    public static int c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.e(str3) < 5242880) {
            com.p314xaae8f345.mm.app.p4.a(28);
        } else {
            com.p314xaae8f345.mm.app.p4.a(29);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "uploadCrashFile %s", str3);
        byte[] f17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.f(str3, 0, -1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(f17)) {
            return -1;
        }
        int length = f17.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format(java.util.Locale.ENGLISH, "weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(f17);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        kk.d.b(c19764x527bffc1, a17, lowerCase.getBytes());
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.n(length, lowerCase, str2, str, c19764x527bffc1));
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.b(str3);
        com.p314xaae8f345.mm.app.p4.a(30);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "upload & delete file %s", str3);
        return 1;
    }

    public static void d(android.content.Intent intent, java.lang.String str) {
        com.p314xaae8f345.mm.app.p4.a(15);
        if (intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.io.File file = new java.io.File(f273835a);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra("tag");
            if (stringExtra == null) {
                stringExtra = "exception";
            }
            java.lang.String str2 = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("exceptionMsg");
            java.lang.String stringExtra3 = intent.getStringExtra("userName");
            boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                return;
            }
            java.lang.String encodeToString = android.util.Base64.encodeToString(kk.y.a(new java.lang.String(android.util.Base64.decode(stringExtra2, 2)).getBytes()), 2);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.o.a(str, (new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3(stringExtra3, str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), "json_" + encodeToString, booleanExtra).m77654x9616526c() + "\n").getBytes());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMBugReporter", "write crashPreventPath:[%s]", str);
            com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.a.a();
            com.p314xaae8f345.mm.app.p4.a(16);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMBugReporter", e17, "", new java.lang.Object[0]);
        }
    }
}
