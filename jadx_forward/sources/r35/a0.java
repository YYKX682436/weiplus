package r35;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public java.net.HttpURLConnection f450564a;

    /* renamed from: b, reason: collision with root package name */
    public final r35.b0 f450565b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f450566c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f450567d;

    /* renamed from: e, reason: collision with root package name */
    public int f450568e = -1;

    public a0(java.lang.String str, boolean z17, r35.b0 b0Var) {
        this.f450566c = str;
        this.f450567d = z17;
        this.f450565b = b0Var;
    }

    public q11.b a(java.io.InputStream inputStream) {
        java.net.HttpURLConnection httpURLConnection = this.f450564a;
        if (httpURLConnection != null) {
            httpURLConnection.getContentType();
        }
        java.net.HttpURLConnection httpURLConnection2 = this.f450564a;
        if (httpURLConnection2 != null) {
            httpURLConnection2.getContentLength();
        }
        r35.b0 b0Var = this.f450565b;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        if (inputStream == null) {
            java.net.HttpURLConnection httpURLConnection3 = this.f450564a;
            inputStream = httpURLConnection3 != null ? httpURLConnection3.getInputStream() : null;
        }
        byte[] d17 = com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226.f.d(inputStream, 0L, false);
        java.net.HttpURLConnection httpURLConnection4 = this.f450564a;
        q11.b bVar = new q11.b(d17, 2, httpURLConnection4 != null ? httpURLConnection4.getContentType() : null);
        java.net.HttpURLConnection httpURLConnection5 = this.f450564a;
        bVar.f441069f = httpURLConnection5 != null ? httpURLConnection5.getContentLength() : 0;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return bVar;
    }

    public int b() {
        r35.b0 b0Var = this.f450565b;
        if (b0Var != null) {
            int i17 = this.f450568e;
            r35.c0 c0Var = (r35.c0) b0Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            boolean z17 = this.f450567d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onRequest id: %s, imageType: %d, forceNormal: %b, url: %s", c0Var.f450589c, valueOf, java.lang.Boolean.valueOf(z17), c0Var.f450587a);
            c0Var.f450590d = i17;
            c0Var.f450591e = z17;
            c0Var.f450595i = java.lang.System.currentTimeMillis();
            if (c0Var.f450592f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(1111L, 0L, 1L);
                int i18 = c0Var.f450590d;
                if (i18 == 0) {
                    g0Var.C(1111L, 1L, 1L);
                } else if (i18 == 1) {
                    g0Var.C(1111L, 2L, 1L);
                } else if (i18 == 2) {
                    g0Var.C(1111L, 31L, 1L);
                }
                if (c0Var.f450591e) {
                    int i19 = c0Var.f450590d;
                    if (i19 == 0) {
                        g0Var.C(1111L, 14L, 1L);
                    } else if (i19 == 2) {
                        g0Var.C(1111L, 40L, 1L);
                    }
                }
            }
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        java.net.HttpURLConnection httpURLConnection = this.f450564a;
        int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return responseCode;
    }

    public java.net.HttpURLConnection c() {
        java.lang.String str = this.f450566c;
        java.lang.String str2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String str3 = this.f450566c;
        boolean z17 = this.f450567d;
        if (z17) {
            if (str3 != null) {
                r35.y yVar = r35.y.f450859a;
                android.net.Uri parse = android.net.Uri.parse(str3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(...)");
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (java.lang.String str4 : queryParameterNames) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "tp")) {
                        clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
                    }
                }
                java.lang.String decode = java.net.URLDecoder.decode(clearQuery.build().toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                str2 = qk.c.c(decode, false);
            }
            this.f450566c = str2;
        }
        r35.b0 b0Var = this.f450565b;
        if (b0Var != null) {
            java.lang.String str5 = this.f450566c;
            r35.c0 c0Var = (r35.c0) b0Var;
            c0Var.f450588b = str3;
            c0Var.f450587a = str5;
            c0Var.f450594h = java.lang.System.currentTimeMillis();
            r35.y yVar2 = r35.y.f450859a;
            if (c0Var.f450593g == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 3, c0Var.f450588b, 0L, 4, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onStart id: %s", c0Var.f450589c);
        }
        if (z17 && b0Var != null) {
            r35.c0 c0Var2 = (r35.c0) b0Var;
            r35.y yVar3 = r35.y.f450859a;
            if (c0Var2.f450593g == 1) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0 i0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a;
                java.lang.String str6 = c0Var2.f450588b;
                if (!(str6 == null || str6.length() == 0)) {
                    i0Var.b(str6);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g0(str6, java.lang.System.currentTimeMillis()));
                }
            }
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        java.net.URLConnection openConnection = new java.net.URL(this.f450566c).openConnection();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        this.f450564a = httpURLConnection;
        httpURLConnection.setConnectTimeout(15000);
        java.net.HttpURLConnection httpURLConnection2 = this.f450564a;
        if (httpURLConnection2 != null) {
            httpURLConnection2.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        }
        if (!z17 && qk.c.g(this.f450566c)) {
            this.f450568e = 1;
            java.net.HttpURLConnection httpURLConnection3 = this.f450564a;
            if (httpURLConnection3 != null) {
                httpURLConnection3.addRequestProperty("Accept", "image/wxpic");
            }
        } else if (qk.c.h(this.f450566c)) {
            this.f450568e = 2;
            java.net.HttpURLConnection httpURLConnection4 = this.f450564a;
            if (httpURLConnection4 != null) {
                httpURLConnection4.setRequestProperty("Referer", m11.n1.a(o45.wf.f424562g));
            }
        } else {
            this.f450568e = 0;
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return this.f450564a;
    }

    public void d(int i17) {
        r35.b0 b0Var = this.f450565b;
        if (b0Var != null) {
            r35.c0 c0Var = (r35.c0) b0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onResultError id: %s, requestImageType: %d, responseCode: %d", c0Var.f450589c, java.lang.Integer.valueOf(c0Var.f450590d), java.lang.Integer.valueOf(i17));
            c0Var.f450596j = java.lang.System.currentTimeMillis();
            if (c0Var.f450592f) {
                r35.x xVar = r35.x.f450853a;
                xVar.a(c0Var.f450590d, false);
                if (c0Var.f450591e) {
                    xVar.e(c0Var.f450590d, false);
                }
            }
            if (r35.y.f450859a.b(c0Var.f450593g)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 3, c0Var.f450588b, 0L, 4, null);
            }
        }
    }

    public void e(q11.b response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        r35.b0 b0Var = this.f450565b;
        if (b0Var != null) {
            r35.c0 c0Var = (r35.c0) b0Var;
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c0Var.f450594h);
            java.lang.String str = c0Var.f450589c;
            java.lang.String str2 = response.f441068e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onResultSuccess id: %s, contentType: %s, cost: %d", str, str2, valueOf);
            c0Var.f450596j = java.lang.System.currentTimeMillis();
            if (c0Var.f450592f) {
                r35.x xVar = r35.x.f450853a;
                xVar.a(c0Var.f450590d, true);
                if (c0Var.f450590d == 1) {
                    int c17 = r35.y.f450859a.c(str2);
                    if (c17 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 7L, 1L);
                    } else if (c17 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 8L, 1L);
                    }
                }
                r35.y yVar = r35.y.f450859a;
                int c18 = yVar.c(str2);
                if (c18 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 17L, 1L);
                } else if (c18 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 19L, 1L);
                } else if (c18 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 36L, 1L);
                }
                long j17 = c0Var.f450596j - c0Var.f450595i;
                if (j17 >= 0) {
                    int c19 = yVar.c(str2);
                    if (c19 == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 18L, j17);
                    } else if (c19 == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 20L, j17);
                    } else if (c19 == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 37L, j17);
                    }
                }
                if (c0Var.f450591e && response.f441066c != null) {
                    xVar.e(c0Var.f450590d, true);
                }
            }
            if (r35.y.f450859a.b(c0Var.f450593g)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 3, c0Var.f450588b, 0L, 4, null);
            }
        }
    }
}
