package tr5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static bs5.q f502982a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f502983b;

    /* renamed from: c, reason: collision with root package name */
    public static int f502984c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Runnable f502985d;

    public static java.lang.String a(java.lang.String str) {
        if (str.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.net.HttpURLConnection httpURLConnection = null;
        try {
            java.net.URL url = new java.net.URL(str);
            httpURLConnection = url.getProtocol().equalsIgnoreCase("https") ? (javax.net.ssl.HttpsURLConnection) url.openConnection() : (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(2000);
            httpURLConnection.setReadTimeout(2000);
            httpURLConnection.connect();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    java.lang.String sb7 = sb6.toString();
                    httpURLConnection.disconnect();
                    return sb7;
                }
                sb6.append(readLine);
            }
        } catch (java.lang.Throwable th6) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th6;
        }
    }

    public static void b() {
        java.lang.String sb6;
        int i17 = 0;
        if (f502983b.equals("Https")) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("https://");
            java.lang.String[] strArr = kr5.d.f393066c;
            if (f502984c > 1) {
                f502984c = 0;
            }
            sb7.append(strArr[f502984c]);
            sb7.append("/conf?token=");
            sb7.append(f502982a.f105591d);
            sb6 = sb7.toString();
        } else {
            java.lang.String str = f502983b.equals("AesHttp") ? "aes" : "des";
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("http://");
            java.lang.String[] strArr2 = kr5.d.f393068e;
            if (f502984c > 1) {
                f502984c = 0;
            }
            sb8.append(strArr2[f502984c]);
            sb8.append("/conf?id=");
            sb8.append(f502982a.f105589b);
            sb8.append("&alg=");
            sb8.append(str);
            sb6 = sb8.toString();
        }
        if (sb6 == null || sb6.isEmpty()) {
            return;
        }
        while (i17 <= 1) {
            try {
                c(a(sb6));
                return;
            } catch (java.net.SocketTimeoutException unused) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Timeout occurred, %s retrying... (");
                i17++;
                sb9.append(i17);
                sb9.append("/2)");
                or5.b.a(sb9.toString(), sb6);
            } catch (java.lang.Exception unused2) {
            }
        }
        f502984c++;
        d(5);
    }

    public static void c(java.lang.String str) {
        int parseInt;
        if (str.length() > 0) {
            java.lang.String a17 = f502983b.equals("Https") ? str : f502983b.equals("AesHttp") ? yr5.a.a(str, f502982a.f105590c) : zr5.a.a(str, f502982a.f105590c);
            or5.b.a("lookup config rsp: %s, raw: %s", a17, str);
            java.lang.String str2 = "";
            int i17 = 60;
            boolean z17 = false;
            boolean z18 = false;
            for (java.lang.String str3 : a17.split("\\|")) {
                java.lang.String[] split = str3.split(":");
                if (split[0].contains("log")) {
                    z17 = "1".equals(split[1]);
                }
                if (split[0].contains("domain")) {
                    z18 = "1".equals(split[1]);
                }
                if (split[0].contains(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54552x8c62eff0)) {
                    str2 = split[1];
                }
                if (split[0].contains("ttl") && !split[1].isEmpty() && (parseInt = java.lang.Integer.parseInt(split[1])) >= 1 && parseInt <= 1440) {
                    i17 = parseInt;
                }
            }
            if (!kr5.p.f393105c) {
                throw new java.lang.IllegalStateException("DnsService".concat(" is not initialized yet"));
            }
            kr5.g gVar = kr5.p.f393104b;
            gVar.f393088j = z17;
            gVar.f393095q = z18;
            if (str2.isEmpty()) {
                kr5.c.c().d();
                return;
            }
            kr5.c c17 = kr5.c.c();
            c17.getClass();
            if (!str2.isEmpty()) {
                java.lang.String[] split2 = str2.split(";");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str4 : split2) {
                    if (sr5.e.a(str4)) {
                        arrayList.add(str4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    kr5.c.c().e(arrayList);
                    android.content.SharedPreferences.Editor edit = kr5.p.f393103a.getSharedPreferences("HTTPDNSFile", 0).edit();
                    edit.putString("httpdnsIps", android.text.TextUtils.join(";", arrayList));
                    edit.putString("httpType", c17.f393060b.f393087i);
                    edit.putLong("httpdnsIps_timestamp", java.lang.System.currentTimeMillis() + (i17 * 60000));
                    edit.apply();
                }
            }
            d(i17);
        }
    }

    public static void d(int i17) {
        if (f502985d != null) {
            ((lr5.c) lr5.e.f402302b).a(f502985d);
            f502985d = null;
        }
        f502985d = new tr5.a();
        or5.b.a("The delayed scheduling task will be executed after %s minutes.", java.lang.Integer.valueOf(i17));
        ((lr5.c) lr5.e.f402302b).b(f502985d, i17 * 60000);
    }
}
