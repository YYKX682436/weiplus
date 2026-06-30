package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f290735f = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".extra_url");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f290736g = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".extra_action");

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f290737h = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".extra_params");

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f290738i = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".extra_chromePackage");

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f290739j = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".action_refresh");

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f290740k = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".no_activity_exception");

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f290741l = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.class.getSimpleName().concat(".action_customTabRedirect");

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f290742m = "https://m.facebook.com/dialog/";

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f290743n = "https://graph.facebook.com/";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f290744o = "https://api.facebook.com/restserver.php";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.ref.WeakReference f290745p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f290746a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f290747b = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k f290748c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k f290749d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.m f290750e;

    public l() {
        this.f290750e = null;
        this.f290750e = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.m();
    }

    public static android.os.Bundle e(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.net.URLDecoder.decode(split[1], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    } else if (split.length == 1) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), "");
                    }
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    public void a(android.app.Activity activity, java.lang.String[] strArr, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k kVar) {
        this.f290748c = kVar;
        this.f290749d = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.j(this);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4 c22454x642d6fa4 = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22454x642d6fa4(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474(activity));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        arrayList.clear();
        for (java.lang.String str2 : strArr) {
            arrayList.add(str2);
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request request = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22455x96068474.Request(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.u.NATIVE_WITH_FALLBACK, java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList)), com.p314xaae8f345.mm.ui.p2722x33325c.sdk.g.FRIENDS, "rerequest", "290293790992170", java.util.UUID.randomUUID().toString());
        android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5> creator = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.C22453x25437ad5.f39602x681a0c0c;
        request.f290710i = false;
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Set set = request.f290706e;
        java.lang.String str3 = null;
        if (!(set == null || set.size() == 0)) {
            java.lang.String join = android.text.TextUtils.join(",", set);
            bundle.putString("scope", join);
            if (c22454x642d6fa4.f290721d == null) {
                c22454x642d6fa4.f290721d = new java.util.HashMap();
            }
            c22454x642d6fa4.f290721d.put("scope", join == null ? null : join.toString());
        }
        bundle.putString("default_audience", "friends");
        bundle.putString("state", new org.json.JSONObject().toString());
        bundle.putString("cbt", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        bundle.putString("ies", "0");
        bundle.putString("redirect_uri", c22454x642d6fa4.f290699h);
        bundle.putString("client_id", request.f290708g);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException unused) {
        }
        bundle.putString("e2e", jSONObject.toString());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        bundle.putString("login_behavior", "NATIVE_WITH_FALLBACK");
        bundle.putString("sdk", java.lang.String.format(java.util.Locale.ROOT, "android-%s", "android-8.2.0"));
        bundle.putString("sso", "chrome_custom_tab");
        bundle.putString("cct_prefetching", "0");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.account.ui.CustomTabMainActivity");
        intent.putExtra(f290736g, "oauth");
        intent.putExtra(f290737h, bundle);
        java.lang.String str4 = c22454x642d6fa4.f290697f;
        if (str4 == null) {
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getPackageManager().queryIntentServices(new android.content.Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.f.f290730a));
                java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.content.pm.ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        str3 = serviceInfo.packageName;
                        break;
                    }
                }
            }
            c22454x642d6fa4.f290697f = str3;
            str4 = str3;
        }
        intent.putExtra(f290738i, str4);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(101);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/ui/mmfb/sdk/CustomTabLoginMethodHandler", "tryAuthorize", "(Landroid/app/Activity;[Ljava/lang/String;)I", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        h(activity);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.i iVar = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.i(this);
        f290745p = new java.lang.ref.WeakReference(iVar);
        b4.d.a(activity).b(iVar, new android.content.IntentFilter(f290741l));
        jx3.f.INSTANCE.mo68477x336bdfd8(582L, 0L, 1L, false);
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        long E1;
        if (i17 == 0) {
            if (i18 != -1) {
                if (i18 == 0) {
                    if (intent == null) {
                        this.f290748c.mo48702x3d6f0539();
                        return;
                    } else {
                        intent.getStringExtra("error");
                        this.f290748c.c(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h(intent.getStringExtra("error"), intent.getIntExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, -1), intent.getStringExtra("failing_url")));
                        return;
                    }
                }
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("error_type");
            }
            if (stringExtra == null) {
                g(intent.getStringExtra("access_token"));
                java.lang.String stringExtra2 = intent.getStringExtra("expires_in");
                if (stringExtra2 != null) {
                    if (stringExtra2.equals("0")) {
                        E1 = 0;
                    } else {
                        E1 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(stringExtra2) * 1000) + java.lang.System.currentTimeMillis();
                    }
                    this.f290747b = E1;
                }
                if (d()) {
                    this.f290748c.b(intent.getExtras());
                    return;
                } else {
                    this.f290748c.d(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n("Failed to receive access token."));
                    return;
                }
            }
            if (stringExtra.equals("service_disabled") || stringExtra.equals("AndroidAuthKillSwitchException")) {
                new android.os.Bundle();
                throw null;
            }
            if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                this.f290748c.mo48702x3d6f0539();
                return;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("error_description");
            if (stringExtra3 != null) {
                stringExtra = stringExtra + ":" + stringExtra3;
            }
            this.f290748c.d(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n(stringExtra));
        }
    }

    public void c(android.app.Activity activity) {
        if (this.f290750e != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("facebook destory, unInitSdk = ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", sb6.toString());
        }
        h(activity);
    }

    public boolean d() {
        return this.f290746a != null && (this.f290747b == 0 || java.lang.System.currentTimeMillis() < this.f290747b);
    }

    public java.lang.String f(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        java.lang.String d17;
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, "json");
        if (d()) {
            bundle.putString("access_token", this.f290746a);
        }
        java.lang.String str3 = str != null ? f290743n + str : f290744o;
        if (str2.equals("GET")) {
            str3 = str3 + "?" + com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.b(bundle);
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str3).openConnection();
        httpURLConnection.setConnectTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        httpURLConnection.setRequestProperty("User-Agent", java.lang.System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
        if (!str2.equals("GET")) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            for (java.lang.String str4 : bundle.keySet()) {
                if (bundle.getByteArray(str4) != null) {
                    bundle2.putByteArray(str4, bundle.getByteArray(str4));
                }
            }
            if (!bundle.containsKey(ya.b.f77491x8758c4e1)) {
                bundle.putString(ya.b.f77491x8758c4e1, str2);
            }
            if (bundle.containsKey("access_token")) {
                bundle.putString("access_token", java.net.URLDecoder.decode(bundle.getString("access_token")));
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.connect();
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str5 : bundle.keySet()) {
                if (bundle.getByteArray(str5) == null) {
                    sb6.append("Content-Disposition: form-data; name=\"" + str5 + "\"\r\n\r\n" + bundle.getString(str5));
                    sb6.append("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n");
                }
            }
            bufferedOutputStream.write(sb6.toString().getBytes());
            bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            if (!bundle2.isEmpty()) {
                for (java.lang.String str6 : bundle2.keySet()) {
                    bufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + str6 + "\"\r\n").getBytes());
                    bufferedOutputStream.write("Content-Type: content/unknown\r\n\r\n".getBytes());
                    bufferedOutputStream.write(bundle2.getByteArray(str6));
                    bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
                }
            }
            bufferedOutputStream.flush();
        }
        try {
            d17 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.d(httpURLConnection.getInputStream());
        } catch (java.io.FileNotFoundException unused) {
            d17 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.o.d(httpURLConnection.getErrorStream());
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FacebookUtil", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return d17;
    }

    public void g(java.lang.String str) {
        this.f290746a = str;
        java.lang.System.currentTimeMillis();
    }

    public void h(android.content.Context context) {
        try {
            java.lang.ref.WeakReference weakReference = f290745p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "unregisterReceiver");
            b4.d.a(context).d((android.content.BroadcastReceiver) f290745p.get());
            f290745p = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "facebook destory, Exception = " + e17);
        }
    }
}
