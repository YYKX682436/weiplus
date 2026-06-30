package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class d9 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.regex.Pattern f273113s = java.util.regex.Pattern.compile("image/[A-Za-z0-9]+");

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.regex.Pattern f273114t = java.util.regex.Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273115d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f273116e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f273117f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f273118g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f273119h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f273120i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f273121m;

    /* renamed from: n, reason: collision with root package name */
    public final int f273122n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 f273123o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f273124p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f273125q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f273126r = false;

    public d9(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 g9Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f9Var) {
        this.f273115d = context;
        this.f273116e = str;
        this.f273117f = str2;
        this.f273120i = str3;
        this.f273121m = z17;
        this.f273122n = i17;
        this.f273123o = g9Var;
        this.f273124p = f9Var;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a9 a9Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a9(this, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(a9Var, 1000L, false);
    }

    public static byte[] e(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (java.lang.Throwable th6) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "close input stream failed: %s", e17.getMessage());
                        }
                    }
                    throw th6;
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "inputStreamToBytes failed: %s", e18.getMessage());
                if (inputStream == null) {
                    return null;
                }
                try {
                    inputStream.close();
                    return null;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "close input stream failed: %s", e19.getMessage());
                    return null;
                }
            }
        }
        byteArrayOutputStream.flush();
        try {
            inputStream.close();
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "close input stream failed: %s", e27.getMessage());
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.tencent.mm.pluginsdk.ui.tools.d9] */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        java.io.InputStream inputStream;
        java.lang.Exception e17;
        int responseCode;
        boolean z17 = this.f273121m;
        android.content.Context context = this.f273115d;
        if (!z17) {
            this.f273119h = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575225lb2);
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273116e)) {
            return false;
        }
        java.lang.String str = null;
        if (android.webkit.URLUtil.isDataUrl(this.f273116e)) {
            this.f273118g = d(((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273116e) || !this.f273116e.startsWith("data:image/png")) && !this.f273116e.startsWith("data:image/png".toUpperCase())) ? "jpg" : "png");
            try {
                int indexOf = this.f273116e.indexOf("base64");
                if (indexOf > 0) {
                    this.f273116e = this.f273116e.substring(indexOf + 7);
                }
                byte[] bArr = new byte[0];
                byte[] decode = android.util.Base64.decode(this.f273116e, 0);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f9Var = this.f273124p;
                if (f9Var != null && decode != null) {
                    try {
                        byte[] m64973x2abfde78 = com.p314xaae8f345.mm.p1006xc5476f33.gif.C16080x6bc1f265.m64973x2abfde78(decode);
                        if (m64973x2abfde78 != null && m64973x2abfde78.length > 0) {
                            str = new java.lang.String(m64973x2abfde78);
                        }
                        bArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(f9Var.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(decode)));
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewUtil", "decodeBase64DataResource watermark failed " + e18.getMessage());
                    }
                }
                if (bArr.length != 0) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(bArr)) {
                        decode = bArr;
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(this.f273118g, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b9(this, decode));
                if (str != null && !str.isEmpty()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(str, this.f273118g);
                }
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                this.f273119h = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572555bm2, q75.c.e());
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                java.lang.String str2 = this.f273118g;
                ((ub0.r) oVar).getClass();
                q75.c.f(str2, context);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "decode base64 pic failed : %s", e19.getMessage());
            }
        } else {
            ?? isHttpsUrl = android.webkit.URLUtil.isHttpsUrl(this.f273116e);
            try {
                if (isHttpsUrl != 0) {
                    try {
                        isHttpsUrl = (javax.net.ssl.HttpsURLConnection) new java.net.URL(this.f273116e).openConnection();
                    } catch (java.lang.Exception e27) {
                        e17 = e27;
                        isHttpsUrl = 0;
                        inputStream = null;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        isHttpsUrl = 0;
                        inputStream = null;
                    }
                    try {
                        isHttpsUrl.setRequestMethod("GET");
                        isHttpsUrl.setRequestProperty("Cookie", this.f273120i);
                        isHttpsUrl.setRequestProperty("referer", this.f273117f);
                        isHttpsUrl.setAllowUserInteraction(true);
                        responseCode = isHttpsUrl.getResponseCode();
                    } catch (java.lang.Exception e28) {
                        e17 = e28;
                        inputStream = null;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        inputStream = null;
                        f(isHttpsUrl, inputStream, null);
                        throw th;
                    }
                    if (responseCode != 200) {
                        if (responseCode == 301 || responseCode == 302) {
                            java.lang.String headerField = isHttpsUrl.getHeaderField("Location");
                            if (headerField == null) {
                                headerField = isHttpsUrl.getHeaderField(ya.b.f77489x9ff58fb5);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUtil", "redirect url = %s", headerField);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(headerField)) {
                                this.f273116e = headerField;
                                c();
                                f(isHttpsUrl, null, null);
                            }
                        }
                        this.f273119h = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575224lb1);
                        f(isHttpsUrl, null, null);
                    } else {
                        java.lang.String contentType = isHttpsUrl.getContentType();
                        inputStream = isHttpsUrl.getInputStream();
                        try {
                            g(contentType, isHttpsUrl.getHeaderField("Content-Disposition"), inputStream, null);
                            isHttpsUrl = isHttpsUrl;
                        } catch (java.lang.Exception e29) {
                            e17 = e29;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "download https resource failed : %s", e17.getMessage());
                            isHttpsUrl = isHttpsUrl;
                            f(isHttpsUrl, inputStream, null);
                            return true;
                        }
                        f(isHttpsUrl, inputStream, null);
                    }
                } else {
                    c();
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        this.f273126r = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f273125q;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (1 == this.f273122n) {
            this.f273123o.a(this.f273118g);
        } else {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273119h);
            android.content.Context context = this.f273115d;
            if (K0) {
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575224lb1), 1).show();
            } else {
                dp.a.m125854x26a183b(context, this.f273119h, 1).show();
            }
        }
        return true;
    }

    public final void c() {
        java.net.HttpURLConnection httpURLConnection;
        java.io.InputStream inputStream;
        int responseCode;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(this.f273116e).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("Cookie", this.f273120i);
                httpURLConnection.setRequestProperty("referer", this.f273117f);
                httpURLConnection.setAllowUserInteraction(true);
                responseCode = httpURLConnection.getResponseCode();
            } catch (java.lang.Exception e17) {
                e = e17;
                inputStream = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream = null;
                f(httpURLConnection, inputStream, null);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            httpURLConnection = null;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            httpURLConnection = null;
            inputStream = null;
        }
        if (responseCode == 200) {
            java.lang.String contentType = httpURLConnection.getContentType();
            inputStream = httpURLConnection.getInputStream();
            try {
                try {
                    g(contentType, httpURLConnection.getHeaderField("Content-Disposition"), inputStream, null);
                } catch (java.lang.Exception e19) {
                    e = e19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "init http url connection failed : %s", e.getMessage());
                    f(httpURLConnection, inputStream, null);
                    return;
                }
                f(httpURLConnection, inputStream, null);
                return;
            } catch (java.lang.Throwable th8) {
                th = th8;
                f(httpURLConnection, inputStream, null);
                throw th;
            }
        }
        if (responseCode == 301 || responseCode == 302) {
            java.lang.String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                headerField = httpURLConnection.getHeaderField(ya.b.f77489x9ff58fb5);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUtil", "redirect url = %s", headerField);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(headerField)) {
                this.f273116e = headerField;
                c();
                f(httpURLConnection, null, null);
                return;
            }
        }
        this.f273119h = this.f273115d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575224lb1);
        f(httpURLConnection, null, null);
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.String d17;
        if (this.f273122n == 1) {
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            d17 = lp0.b.h0("WebImageCache").o() + "/";
        } else {
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            d17 = q75.c.d();
        }
        java.lang.String str2 = d17 + java.lang.String.format(java.util.Locale.US, "mmexport%s_%d.%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f273116e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
        this.f273118g = str2;
        return str2;
    }

    public final void f(java.net.HttpURLConnection httpURLConnection, java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", e17.getMessage());
            }
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewUtil", e18, "", new java.lang.Object[0]);
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewUtil", e19, "", new java.lang.Object[0]);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|(2:10|(1:12))|13|(2:15|(1:17)(1:18))|19|20|21|22|(1:57)(4:25|(1:33)|34|35)|(3:48|49|(1:51))|37|(1:41)|42|(2:44|45)(1:47)))|59|6|(3:8|10|(0))|13|(0)|19|20|21|22|(0)|57|(0)|37|(2:39|41)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        r5 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r5, java.lang.String r6, java.io.InputStream r7, java.io.OutputStream r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9.g(java.lang.String, java.lang.String, java.io.InputStream, java.io.OutputStream):void");
    }
}
