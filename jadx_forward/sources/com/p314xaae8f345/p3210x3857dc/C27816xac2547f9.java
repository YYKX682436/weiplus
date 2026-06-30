package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.WebView */
/* loaded from: classes13.dex */
public class C27816xac2547f9 extends android.widget.FrameLayout implements tx5.f {

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.f1 f301722m;

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.f1 f301723n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f301724o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f301725p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f301726q;

    /* renamed from: r, reason: collision with root package name */
    public static final xx5.u f301727r;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.f1 f301728d;

    /* renamed from: e, reason: collision with root package name */
    public tx5.f f301729e;

    /* renamed from: f, reason: collision with root package name */
    public qx5.l f301730f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnLongClickListener f301731g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f301732h;

    /* renamed from: i, reason: collision with root package name */
    public final xx5.t f301733i;

    static {
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        f301722m = f1Var;
        f301723n = f1Var;
        f301724o = "";
        f301725p = false;
        f301726q = false;
        f301727r = new xx5.u();
    }

    public C27816xac2547f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void B0() {
        com.p314xaae8f345.p3210x3857dc.f1 n17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.n(by5.u3.b(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c));
        by5.c4.a("WebView", "reinitToXWeb, webViewKind:" + n17);
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
        if (n17 == f1Var) {
            by5.c4.a("WebView", "reinitToPinus");
            f301722m = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429504d = by5.u3.c(by5.a.b());
            v0(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, f1Var, f301724o, null);
            by5.s0.e(1749L, 66L, 1L);
        }
    }

    public static boolean C0(android.content.Context context, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        com.p314xaae8f345.p3210x3857dc.f1 n17;
        boolean z17;
        int i17;
        boolean z18;
        by5.c4.a("WebView", "tryInitWebViewCore start, type:" + f1Var);
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW;
        if ((f1Var == f1Var2 || f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) && (n17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.n(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d())) != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE && f1Var != n17) {
            by5.c4.a("WebView", "tryInitWebViewCore, type:" + f1Var + ", but actual type:" + n17);
            return false;
        }
        java.util.List list = by5.q.f118113j;
        synchronized (by5.q.class) {
            com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
            if (!by5.d4.e().getBoolean("bIgnoreCrashWatch", false)) {
                if (by5.q.c("LOAD_CORE", f1Var).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_LOAD_CORE, module:" + m120126xba60370d() + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 1);
                } else if (by5.q.c("CREATE_WEBVIEW", f1Var).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + m120126xba60370d() + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 2);
                }
                z17 = true;
            }
            z17 = false;
        }
        if (z17) {
            by5.c4.a("WebView", "tryInitWebViewCore, has recent crash");
            com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
            if (n1Var != null && (f1Var == f1Var2 || f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS)) {
                n1Var.b(577L, 61L, 1L);
                by5.s0.p(nd1.a2.f72909x366c91de, 62);
            }
            return false;
        }
        by5.q c17 = by5.q.c("LOAD_CORE", f1Var);
        c17.g();
        try {
            tx5.i c18 = tx5.j.c(f1Var);
            if (c18 != null) {
                z18 = c18.c(context, null);
                if (z18) {
                    synchronized (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.class) {
                        by5.a1.e(new com.p314xaae8f345.p3210x3857dc.CallableC27817xc6731548(c18));
                    }
                    by5.c4.a("WebView", "tryInitWebViewCore success");
                    by5.s0.l(f1Var);
                    c17.f();
                    f301723n = f1Var;
                    return z18;
                }
            } else {
                z18 = false;
            }
            by5.c4.a("WebView", "tryInitWebViewCore failed");
            return z18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3210x3857dc.n1 n1Var2 = by5.s0.f118128c;
            if (n1Var2 != null) {
                if (f1Var != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_CW && f1Var != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS) {
                    i17 = f1Var == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS ? 80 : 82;
                }
                n1Var2.b(577L, i17, 1L);
            }
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            by5.q.a(stackTraceString);
            by5.c4.a("WebView", "tryInitWebViewCore failed, type:" + f1Var + ", error:" + stackTraceString);
            xx5.g.a(1, stackTraceString, f1Var.ordinal(), "");
            return false;
        }
    }

    /* renamed from: getCurrentModuleLastInitWebCoreType */
    public static com.p314xaae8f345.p3210x3857dc.f1 m120124xb319e038() {
        return f301723n;
    }

    /* renamed from: getCurrentModuleWebCoreType */
    public static com.p314xaae8f345.p3210x3857dc.f1 m120125x97d401de() {
        return f301722m;
    }

    /* renamed from: getModuleName */
    public static java.lang.String m120126xba60370d() {
        return f301724o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[LOOP:0: B:10:0x0029->B:19:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[SYNTHETIC] */
    /* renamed from: getWebViewKindList */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.p314xaae8f345.p3210x3857dc.f1[] m120127xeb0e3355() {
        /*
            com.tencent.xweb.b r0 = com.p314xaae8f345.p3210x3857dc.b.m()
            java.lang.String r1 = "webview_kind_list"
            java.lang.String r2 = m120126xba60370d()
            java.lang.String r0 = r0.g(r1, r2)
            if (r0 == 0) goto L7b
            java.lang.String r1 = ""
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L7b
            java.lang.String r1 = ","
            java.lang.String[] r1 = r0.split(r1)
            if (r1 == 0) goto L7b
            int r2 = r1.length
            if (r2 <= 0) goto L7b
            int r2 = r1.length
            com.tencent.xweb.f1[] r2 = new com.p314xaae8f345.p3210x3857dc.f1[r2]
            r3 = 0
            r4 = r3
        L29:
            int r5 = r1.length
            java.lang.String r6 = "WebView"
            if (r4 >= r5) goto L65
            com.tencent.xweb.b r5 = com.p314xaae8f345.p3210x3857dc.b.m()
            r7 = r1[r4]
            r5.getClass()
            com.tencent.xweb.f1 r8 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE
            if (r7 == 0) goto L51
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L42
            goto L51
        L42:
            com.tencent.xweb.f1 r5 = com.p314xaae8f345.p3210x3857dc.f1.m120252xdce0328(r7)     // Catch: java.lang.Throwable -> L47
            goto L52
        L47:
            r7 = move-exception
            java.lang.String r5 = r5.n()
            java.lang.String r9 = "convertWebType error"
            by5.c4.d(r5, r9, r7)
        L51:
            r5 = r8
        L52:
            if (r5 == r8) goto L59
            r2[r4] = r5
            int r4 = r4 + 1
            goto L29
        L59:
            java.lang.String r1 = "getWebViewKindList, error config:"
            java.lang.String r0 = r1.concat(r0)
            by5.c4.g(r6, r0)
            com.tencent.xweb.f1[] r0 = new com.p314xaae8f345.p3210x3857dc.f1[r3]
            return r0
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getWebViewKindList:"
            r0.<init>(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            by5.c4.f(r6, r0)
            return r2
        L7b:
            com.tencent.xweb.f1 r0 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS
            com.tencent.xweb.f1 r1 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS
            com.tencent.xweb.f1[] r0 = new com.p314xaae8f345.p3210x3857dc.f1[]{r0, r1}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120127xeb0e3355():com.tencent.xweb.f1[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p3210x3857dc.f1 u0(com.p314xaae8f345.p3210x3857dc.f1 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.u0(com.tencent.xweb.f1, java.lang.String):com.tencent.xweb.f1");
    }

    public static synchronized void v0(android.content.Context context, com.p314xaae8f345.p3210x3857dc.f1 f1Var, java.lang.String str, com.p314xaae8f345.p3210x3857dc.e1 e1Var) {
        synchronized (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.class) {
            by5.c4.a("WebView", "initWebviewCore start, kind:" + f1Var + ", module:" + str);
            com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = f301722m;
            if (f1Var2 != com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE) {
                if (f1Var2 != f1Var) {
                    by5.c4.a("WebView", "initWebviewCore, set invalid webview kind:" + f1Var + ", expected:" + f301722m);
                    if (e1Var != null) {
                        e1Var.b();
                    }
                } else {
                    by5.c4.a("WebView", "initWebviewCore, already init webview kind:" + f1Var);
                    if (e1Var != null) {
                        e1Var.a();
                    }
                }
                return;
            }
            xx5.u uVar = f301727r;
            uVar.f539646c = java.lang.System.currentTimeMillis();
            if (str == null || str.isEmpty()) {
                str = "tools";
            }
            f301724o = str;
            by5.s0.f118126a = str;
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.c(context);
            by5.c4.f("XWebUpdater", "tryEmbedInstall, start check runtime update");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "4");
            ((zx5.i0) zx5.n0.f558785a).e(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, hashMap);
            uVar.a(w0(context, u0(f1Var, str), e1Var, true), f301722m.ordinal(), str);
            by5.c4.g("WebView", "###### initWebviewCore costTime:" + uVar.f539648e + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
        }
    }

    public static synchronized boolean w0(android.content.Context context, com.p314xaae8f345.p3210x3857dc.f1 f1Var, com.p314xaae8f345.p3210x3857dc.e1 e1Var, boolean z17) {
        synchronized (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.class) {
            by5.c4.a("WebView", "initWebviewCore, kind:" + f1Var + ", bTryOtherWebtype:" + z17);
            boolean C0 = C0(context, f1Var);
            if (!C0 && z17) {
                by5.c4.g("WebView", "initWebviewCore failed, type:" + f1Var + ", try other webview types");
                com.p314xaae8f345.p3210x3857dc.f1[] m120127xeb0e3355 = m120127xeb0e3355();
                int i17 = 0;
                while (true) {
                    if (i17 >= m120127xeb0e3355.length) {
                        break;
                    }
                    com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = m120127xeb0e3355[i17];
                    if (f1Var2 != f1Var && (C0 = C0(context, f1Var2))) {
                        f301722m = m120127xeb0e3355[i17];
                        break;
                    }
                    i17++;
                }
            } else if (C0) {
                f301722m = f1Var;
            }
            if (!C0) {
                by5.c4.c("WebView", "initWebviewCore failed finally");
                if (e1Var != null) {
                    e1Var.b();
                }
                com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
                if (n1Var != null) {
                    n1Var.b(577L, 83L, 1L);
                }
                return false;
            }
            if (e1Var != null) {
                e1Var.a();
            }
            by5.c4.a("WebView", "initWebviewCore success, type:" + f301722m + ", sdkVer:" + com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19 + ", apkVer:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
            return true;
        }
    }

    public static boolean x0() {
        return f301722m == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
    }

    public static boolean y0() {
        return f301722m == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
    }

    public void A0(int i17, int i18, int i19, int i27) {
    }

    @Override // tx5.f
    public boolean F() {
        return this.f301729e.F();
    }

    @Override // tx5.f
    public void S(boolean z17) {
        this.f301729e.S(z17);
    }

    @Override // tx5.f
    public boolean T() {
        return this.f301729e.T();
    }

    @Override // tx5.f
    /* renamed from: addJavascriptInterface */
    public void mo120128x74041feb(java.lang.Object obj, java.lang.String str) {
        this.f301729e.mo120128x74041feb(obj, str);
    }

    public void b() {
        mo74096x57429eec();
    }

    public void c() {
        mo74095xb01dfb57();
    }

    @Override // tx5.f
    /* renamed from: canGoBack */
    public boolean mo120129xed1a21df() {
        return this.f301729e.mo120129xed1a21df();
    }

    @Override // tx5.f
    /* renamed from: canGoForward */
    public boolean mo120130xc062b2cd() {
        return this.f301729e.mo120130xc062b2cd();
    }

    @Override // tx5.f
    /* renamed from: captureLongScreenshot */
    public void mo120131x81469de8(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        this.f301729e.mo120131x81469de8(rect, valueCallback);
    }

    @Override // tx5.f
    /* renamed from: clearHistory */
    public void mo120132x35d48587() {
        this.f301729e.mo120132x35d48587();
    }

    @Override // tx5.f
    /* renamed from: clearMatches */
    public void mo120133x30b32a26() {
        this.f301729e.mo120133x30b32a26();
    }

    @Override // tx5.f
    /* renamed from: clearSslPreferences */
    public void mo120134x3e28c0f9() {
        this.f301729e.mo120134x3e28c0f9();
    }

    @Override // tx5.f
    /* renamed from: clearView */
    public void mo120135xb4407692() {
        this.f301729e.mo120135xb4407692();
    }

    /* renamed from: destroy */
    public void mo52095x5cd39ffa() {
        android.content.Context context = getContext();
        if (context instanceof com.p314xaae8f345.p3210x3857dc.i1) {
            ((com.p314xaae8f345.p3210x3857dc.i1) context).f301833a = null;
        }
        this.f301729e.mo52095x5cd39ffa();
        if (this.f301732h) {
            return;
        }
        this.f301732h = true;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = this.f301728d;
        synchronized (com.p314xaae8f345.p3210x3857dc.j1.class) {
            com.p314xaae8f345.p3210x3857dc.j1.f301850a--;
            com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
            com.p314xaae8f345.p3210x3857dc.j1.f301851b = f1Var == f1Var2 ? com.p314xaae8f345.p3210x3857dc.j1.f301851b - 1 : com.p314xaae8f345.p3210x3857dc.j1.f301851b;
            com.p314xaae8f345.p3210x3857dc.f1 f1Var3 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
            com.p314xaae8f345.p3210x3857dc.j1.f301852c = f1Var == f1Var3 ? com.p314xaae8f345.p3210x3857dc.j1.f301852c - 1 : com.p314xaae8f345.p3210x3857dc.j1.f301852c;
            by5.c4.f("WebViewCounter", "decrease, count:" + com.p314xaae8f345.p3210x3857dc.j1.f301850a + ", sPinusCount:" + com.p314xaae8f345.p3210x3857dc.j1.f301851b + ", sSysCount:" + com.p314xaae8f345.p3210x3857dc.j1.f301852c + ", WebViewKind:" + f1Var);
            if (f1Var == f1Var3 && com.p314xaae8f345.p3210x3857dc.j1.f301852c == 0 && !com.p314xaae8f345.p3210x3857dc.t1.f() && m120125x97d401de() == f1Var2 && com.p314xaae8f345.p3210x3857dc.b.m().h("webview_counter_reinit_pinus", "mm", true)) {
                w0(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c, f1Var2, null, false);
                by5.c4.f("WebViewCounter", "decrease, reinit pinus webview core.");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        try {
            return super.drawChild(canvas, view, j17);
        } catch (java.lang.Throwable th6) {
            by5.c4.g("WebView", "drawChild error:" + android.util.Log.getStackTraceString(th6));
            return false;
        }
    }

    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f301729e.mo14660x738236e6(str, valueCallback);
    }

    public android.graphics.Bitmap f() {
        return this.f301729e.f();
    }

    @Override // tx5.f
    /* renamed from: findAllAsync */
    public void mo120136x72420634(java.lang.String str) {
        this.f301729e.mo120136x72420634(str);
    }

    @Override // tx5.f
    /* renamed from: findNext */
    public void mo120137xd781704c(boolean z17) {
        this.f301729e.mo120137xd781704c(z17);
    }

    @Override // tx5.f
    /* renamed from: getAbstractInfo */
    public java.lang.String mo120138x33c67a66() {
        return this.f301729e.mo120138x33c67a66();
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m120139x12501425() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        if (createBitmap != null) {
            createBitmap.eraseColor(-1);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            if (z0()) {
                try {
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
                    java.util.Iterator it = ((java.util.ArrayList) t0(this)).iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = ((android.view.TextureView) it.next()).getBitmap();
                        if (bitmap != null) {
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        } else {
                            by5.c4.c("WebView", "getBitmap, textureViewBitmap = null");
                        }
                    }
                    int width2 = getWidth();
                    int height2 = getHeight();
                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(config2);
                    arrayList2.add(java.lang.Integer.valueOf(height2));
                    arrayList2.add(java.lang.Integer.valueOf(width2));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                    yj0.a.e(obj2, createBitmap2, "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    mo120155xf9dcf964().draw(new android.graphics.Canvas(createBitmap2));
                    canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("WebView", "getBitmap, error", th6);
                }
            } else {
                draw(canvas);
            }
        }
        return createBitmap;
    }

    @Override // tx5.f
    /* renamed from: getCertificate */
    public android.net.http.SslCertificate mo120140x4e358861() {
        return this.f301729e.mo120140x4e358861();
    }

    @Override // tx5.f
    /* renamed from: getContentHeight */
    public int mo120141x964f6f4a() {
        return this.f301729e.mo120141x964f6f4a();
    }

    @java.lang.Deprecated
    /* renamed from: getCookieManager */
    public tx5.b m120142x5ad7a0f3() {
        return null;
    }

    /* renamed from: getCurrentInstanceWebCoreType */
    public com.p314xaae8f345.p3210x3857dc.f1 m120143xc7aa84d5() {
        return this.f301728d;
    }

    /* renamed from: getDebugView */
    public qx5.l m120144xf39d54e2() {
        return this.f301730f;
    }

    @Override // tx5.f
    /* renamed from: getFavicon */
    public android.graphics.Bitmap mo120145xfdbefdde() {
        return this.f301729e.mo120145xfdbefdde();
    }

    @Override // tx5.f
    /* renamed from: getFullscreenVideoKind */
    public com.p314xaae8f345.p3210x3857dc.c1 mo120146xc46191fe() {
        return this.f301729e.mo120146xc46191fe();
    }

    @Override // tx5.f
    /* renamed from: getHitTestResult */
    public com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c() {
        return this.f301729e.mo120147x1d5dd38c();
    }

    @Override // tx5.f
    /* renamed from: getImageFromDiskCache */
    public void mo120148x7a5ae7b6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f301729e.mo120148x7a5ae7b6(str, valueCallback);
    }

    @Override // tx5.f
    /* renamed from: getOriginalUrl */
    public java.lang.String mo120149x410b6ca8() {
        return this.f301729e.mo120149x410b6ca8();
    }

    @Override // tx5.f
    /* renamed from: getProgress */
    public int mo120150x402effa3() {
        return this.f301729e.mo120150x402effa3();
    }

    @Override // tx5.f
    /* renamed from: getScale */
    public float mo120151x7520af94() {
        return this.f301729e.mo120151x7520af94();
    }

    @Override // tx5.f
    /* renamed from: getScrollHeight */
    public int mo120152x214ee8ca() {
        return this.f301729e.mo120152x214ee8ca();
    }

    @Override // tx5.f
    /* renamed from: getSettings */
    public com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999() {
        return this.f301729e.mo120153xd15cf999();
    }

    @Override // tx5.f
    /* renamed from: getTextClassifier */
    public android.view.textclassifier.TextClassifier mo120154xd9ba3424() {
        return this.f301729e.mo120154xd9ba3424();
    }

    /* renamed from: getTitle */
    public java.lang.String mo64579x7531c8a2() {
        return this.f301729e.mo64579x7531c8a2();
    }

    @Override // tx5.f
    /* renamed from: getTopView */
    public android.view.ViewGroup mo120155xf9dcf964() {
        return this.f301729e.mo120155xf9dcf964();
    }

    @Override // tx5.f
    /* renamed from: getUrl */
    public java.lang.String mo120156xb5887639() {
        return this.f301729e.mo120156xb5887639();
    }

    @Override // tx5.f
    /* renamed from: getVersionInfo */
    public java.lang.String mo120157x2e41070() {
        return this.f301729e.mo120157x2e41070();
    }

    @Override // tx5.f
    /* renamed from: getView */
    public android.view.View mo120158xfb86a31b() {
        return this.f301729e.mo120158xfb86a31b();
    }

    @Override // tx5.f
    /* renamed from: getVisibleTitleHeight */
    public int mo120159x81ae3bc3() {
        return this.f301729e.mo120159x81ae3bc3();
    }

    @Override // tx5.f
    /* renamed from: getWebChromeClient */
    public com.p314xaae8f345.p3210x3857dc.s0 mo120160x38fe0223() {
        return this.f301729e.mo120160x38fe0223();
    }

    @Override // tx5.f
    /* renamed from: getWebScrollX */
    public int mo120161x95a6d12d() {
        return this.f301729e.mo120161x95a6d12d();
    }

    @Override // tx5.f
    /* renamed from: getWebScrollY */
    public int mo120162x95a6d12e() {
        return this.f301729e.mo120162x95a6d12e();
    }

    @Override // tx5.f
    /* renamed from: getWebViewCallbackClient */
    public com.p314xaae8f345.p3210x3857dc.g1 mo120163xe602a733() {
        return this.f301729e.mo120163xe602a733();
    }

    @Override // tx5.f
    /* renamed from: getWebViewClient */
    public com.p314xaae8f345.p3210x3857dc.h1 mo120164x90fc158e() {
        return this.f301729e.mo120164x90fc158e();
    }

    @Override // tx5.f
    /* renamed from: getWebViewLooper */
    public android.os.Looper mo120165xa084dc14() {
        return this.f301729e.mo120165xa084dc14();
    }

    @Override // tx5.f
    /* renamed from: getWebViewRenderProcessClient */
    public com.p314xaae8f345.p3210x3857dc.m1 mo120166x3808f441() {
        this.f301729e.mo120166x3808f441();
        return null;
    }

    @Override // tx5.f
    /* renamed from: getWebViewUI */
    public android.view.View mo120167xbfee89b7() {
        return this.f301729e.mo120167xbfee89b7();
    }

    @Override // tx5.f
    /* renamed from: goBack */
    public void mo120168xb5fed1ef() {
        this.f301729e.mo120168xb5fed1ef();
    }

    @Override // tx5.f
    /* renamed from: goForward */
    public void mo120169xed0748bd() {
        this.f301729e.mo120169xed0748bd();
    }

    /* renamed from: isSysKernel */
    public boolean m120170x43962b60() {
        return this.f301728d == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
    }

    @java.lang.Deprecated
    /* renamed from: isXWalkKernel */
    public boolean m120171x1f05d274() {
        return this.f301728d == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
    }

    /* renamed from: loadData */
    public void mo74798x6dfa45b0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f301729e.mo74798x6dfa45b0(str, str2, str3);
        by5.s0.q(str, this);
    }

    /* renamed from: loadDataWithBaseURL */
    public void mo64581x9b341568(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f301729e.mo64581x9b341568(str, str2, str3, str4, str5);
        by5.s0.q(str, this);
    }

    /* renamed from: loadUrl */
    public void mo32266x141096a9(java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap;
        if (this.f301730f.d(str)) {
            this.f301729e.mo32265x141096a9("http://weixin.qq.com/");
            return;
        }
        if (r0(str)) {
            return;
        }
        if (map != null) {
            synchronized (map) {
                hashMap = new java.util.HashMap();
                hashMap.putAll(map);
            }
        } else {
            hashMap = null;
        }
        this.f301729e.mo32266x141096a9(str, hashMap);
        by5.s0.q(str, this);
    }

    @Override // tx5.f
    public void m() {
        this.f301729e.m();
    }

    @Override // tx5.f
    public com.p314xaae8f345.p3210x3857dc.o0 m0(com.p314xaae8f345.p3210x3857dc.InterfaceC27815xc8aac369 interfaceC27815xc8aac369) {
        return this.f301729e.m0(interfaceC27815xc8aac369);
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3210x3857dc.InterfaceC27814x36feca02 interfaceC27814x36feca02) {
        return this.f301729e.n0(str, str2, str3, interfaceC27814x36feca02);
    }

    /* renamed from: onHide */
    public void mo81405xc39a57c1() {
        this.f301729e.mo81405xc39a57c1();
    }

    /* renamed from: onPause */
    public void mo74095xb01dfb57() {
        this.f301729e.mo74095xb01dfb57();
    }

    /* renamed from: onResume */
    public void mo74096x57429eec() {
        this.f301729e.mo74096x57429eec();
    }

    /* renamed from: onShow */
    public void mo81406xc39f557c() {
        this.f301729e.mo81406xc39f557c();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        tx5.f fVar = this.f301729e;
        if (fVar != null) {
            android.view.View mo120158xfb86a31b = fVar.mo120158xfb86a31b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo120158xfb86a31b, arrayList.toArray(), "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo120158xfb86a31b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo120158xfb86a31b, "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void q0(com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        java.util.LinkedList<java.lang.String> linkedList;
        by5.c4.a("WebView", "createWebView start, prefer type:" + m120125x97d401de() + ", force type:" + f1Var);
        org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.c(getContext());
        com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = this.f301728d;
        com.p314xaae8f345.p3210x3857dc.f1 f1Var3 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        if (f1Var2 != f1Var3) {
            this.f301733i.f539620a = true;
            by5.c4.a("WebView", "createWebView, already init, webview type:" + this.f301728d);
            return;
        }
        com.p314xaae8f345.p3210x3857dc.f1 m120125x97d401de = m120125x97d401de();
        java.lang.String str = "";
        if (com.p314xaae8f345.p3210x3857dc.t1.f()) {
            com.p314xaae8f345.p3210x3857dc.f1 f1Var4 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
            this.f301728d = f1Var4;
            str = "ChildProcessMonitor";
            by5.c4.a("WebView", "createWebView, XWebChildProcessMonitor force to use sys");
            C0(getContext(), f1Var4);
        } else {
            com.p314xaae8f345.p3210x3857dc.f1 f1Var5 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS;
            if (f1Var == f1Var5) {
                this.f301728d = f1Var;
                str = "WebViewParam";
                by5.c4.a("WebView", "createWebView, force to use sys by webview param");
                C0(getContext(), f1Var5);
            } else if (m120125x97d401de() == f1Var3) {
                this.f301733i.f539621b = false;
                java.lang.String m17 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m("tools");
                if (m17 == null || m17.isEmpty()) {
                    m17 = "tools";
                }
                f301724o = m17;
                by5.s0.f118126a = m17;
                com.p314xaae8f345.p3210x3857dc.f1 u07 = u0(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, m17);
                by5.c4.a("WebView", "createWebView, not init core, use prefer type:" + u07);
                if (u07 != f1Var3) {
                    this.f301728d = u07;
                    if (C0(getContext(), this.f301728d) && z0()) {
                        f301722m = this.f301728d;
                        by5.c4.f("WebView", "createWebView, sProcessWebViewKind:" + f301722m);
                    }
                } else {
                    str = "NonePreferWebViewKind";
                    this.f301728d = f1Var5;
                    C0(getContext(), f1Var5);
                }
            } else {
                this.f301728d = m120125x97d401de();
            }
        }
        xx5.t tVar = this.f301733i;
        tVar.f539624e = str;
        tVar.f539623d = m120126xba60370d();
        xx5.t tVar2 = this.f301733i;
        tVar2.f539630k = this.f301728d.ordinal();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        tVar2.f539631l = currentTimeMillis;
        tVar2.f539629j = currentTimeMillis - tVar2.f539625f;
        by5.c4.a("WebView", "createWebView, try create webview type:" + this.f301728d);
        tx5.f a17 = tx5.j.a(this.f301728d, this);
        this.f301729e = a17;
        if (a17 == null) {
            xx5.t tVar3 = this.f301733i;
            tVar3.getClass();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            tVar3.f539632m = currentTimeMillis2;
            tVar3.f539633n = currentTimeMillis2 - tVar3.f539631l;
            tVar3.f539634o = 2;
            xx5.t tVar4 = this.f301733i;
            tVar4.getClass();
            tVar4.f539636q = java.lang.System.currentTimeMillis();
            by5.c4.a("WebView", "createWebView failed, try other webview types");
            com.p314xaae8f345.p3210x3857dc.f1[] m120127xeb0e3355 = m120127xeb0e3355();
            int i17 = 0;
            while (true) {
                if (i17 >= m120127xeb0e3355.length) {
                    break;
                }
                if (m120127xeb0e3355[i17] != this.f301728d && w0(getContext(), m120127xeb0e3355[i17], null, false)) {
                    tx5.f a18 = tx5.j.a(m120127xeb0e3355[i17], this);
                    this.f301729e = a18;
                    if (a18 != null) {
                        this.f301728d = m120125x97d401de();
                        break;
                    }
                }
                i17++;
            }
            if (this.f301729e == null) {
                xx5.t tVar5 = this.f301733i;
                tVar5.f539635p = 0;
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                tVar5.f539637r = currentTimeMillis3;
                tVar5.f539638s = currentTimeMillis3 - tVar5.f539636q;
                tVar5.f539639t = 2;
                com.p314xaae8f345.p3210x3857dc.f1 f1Var6 = this.f301728d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create webview instance failed. ExpectedKind:");
                sb6.append(f1Var);
                sb6.append(",PreferredKind:");
                sb6.append(f1Var6);
                sb6.append(",AllSupportKind:");
                for (com.p314xaae8f345.p3210x3857dc.f1 f1Var7 : m120127xeb0e3355) {
                    sb6.append(f1Var7);
                    sb6.append(",");
                }
                sb6.append(",ModuleKindBeforeInit:");
                sb6.append(m120125x97d401de);
                if (!android.text.TextUtils.isEmpty(str)) {
                    sb6.append("downgradeReason:");
                    sb6.append(str);
                }
                sb6.append(",AllCrashStacks:\n");
                java.util.List list = by5.q.f118113j;
                synchronized (by5.q.class) {
                    linkedList = new java.util.LinkedList(by5.q.f118113j);
                }
                if (linkedList.size() != 0) {
                    for (java.lang.String str2 : linkedList) {
                        sb6.append("<<<<<<--->>>>>>\n");
                        sb6.append(str2);
                    }
                }
                java.lang.String sb7 = sb6.toString();
                by5.c4.c("WebView", sb7);
                com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
                if (n1Var != null) {
                    n1Var.b(577L, 87L, 1L);
                }
                throw new com.p314xaae8f345.p3210x3857dc.e(sb7);
            }
            xx5.t tVar6 = this.f301733i;
            tVar6.f539635p = this.f301728d.ordinal();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis();
            tVar6.f539637r = currentTimeMillis4;
            tVar6.f539638s = currentTimeMillis4 - tVar6.f539636q;
            tVar6.f539639t = 1;
        } else {
            xx5.t tVar7 = this.f301733i;
            tVar7.getClass();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            tVar7.f539632m = currentTimeMillis5;
            tVar7.f539633n = currentTimeMillis5 - tVar7.f539631l;
            tVar7.f539634o = 1;
        }
        synchronized (by5.q.class) {
            ((java.util.LinkedList) by5.q.f118113j).clear();
        }
        xx5.t tVar8 = this.f301733i;
        tVar8.f539640u = this.f301728d.ordinal();
        tVar8.f539641v = java.lang.System.currentTimeMillis();
        addView(this.f301729e.mo120167xbfee89b7());
        by5.c4.f("WebView", "createWebView success, webview type:" + this.f301728d);
        this.f301729e.mo120158xfb86a31b().setOnLongClickListener(new com.p314xaae8f345.p3210x3857dc.b1(this));
        try {
            this.f301730f = new qx5.y(this);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("WebView", "initDebugView, create dummy one, error", th6);
            this.f301730f = new qx5.e();
        }
        com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        boolean z17 = by5.d4.e().getBoolean("bEnableRemoteDebug", false);
        zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
        by5.c4.f("WebView", "initRemoteDebug, enableRemoteDebug:" + z17 + ", testMode:false");
        if (z17) {
            com.p314xaae8f345.p3210x3857dc.a3.s(true);
        }
        boolean z18 = by5.d4.e().getBoolean("bRemoteDebugStarted", false);
        by5.c4.f("WebView", "initRemoteDebug, remoteDebugStarted:" + z18);
        if (z18) {
            wx5.f.a(by5.d4.e().getString("bRemoteDebugToken", ""));
        }
        if (z0()) {
            android.content.Context context = getContext();
            if (context instanceof com.p314xaae8f345.p3210x3857dc.i1) {
                ((com.p314xaae8f345.p3210x3857dc.i1) context).f301833a = this.f301729e;
            }
        }
        mo120153xd15cf999().Q(mo120153xd15cf999().g() + " MMWEBID/" + by5.a4.b());
        com.p314xaae8f345.p3210x3857dc.f1 f1Var8 = this.f301728d;
        synchronized (com.p314xaae8f345.p3210x3857dc.j1.class) {
            com.p314xaae8f345.p3210x3857dc.j1.f301850a++;
            com.p314xaae8f345.p3210x3857dc.j1.f301851b = f1Var8 == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS ? com.p314xaae8f345.p3210x3857dc.j1.f301851b + 1 : com.p314xaae8f345.p3210x3857dc.j1.f301851b;
            com.p314xaae8f345.p3210x3857dc.j1.f301852c = f1Var8 == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_SYS ? com.p314xaae8f345.p3210x3857dc.j1.f301852c + 1 : com.p314xaae8f345.p3210x3857dc.j1.f301852c;
            if (!com.p314xaae8f345.p3210x3857dc.j1.f301853d) {
                com.p314xaae8f345.p3210x3857dc.j1.f301853d = true;
            }
            by5.c4.f("WebViewCounter", "increase, count:" + com.p314xaae8f345.p3210x3857dc.j1.f301850a + ", sPinusCount:" + com.p314xaae8f345.p3210x3857dc.j1.f301851b + ", sSysCount:" + com.p314xaae8f345.p3210x3857dc.j1.f301852c + ", WebViewKind:" + f1Var8);
        }
        xx5.t tVar9 = this.f301733i;
        tVar9.getClass();
        long currentTimeMillis6 = java.lang.System.currentTimeMillis();
        tVar9.f539642w = currentTimeMillis6;
        tVar9.f539643x = currentTimeMillis6 - tVar9.f539641v;
    }

    public final boolean r0(java.lang.String str) {
        if (com.p314xaae8f345.p3210x3857dc.t0.f302127a.a() || android.text.TextUtils.isEmpty(str) || !str.startsWith("chrome://")) {
            return false;
        }
        by5.c4.f("WebView", "Intercept chrome scheme url success, show the 404 page.");
        mo64581x9b341568("file:///android_asset/", by5.y3.a(getContext(), 404, "Not found", str), "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        return true;
    }

    @Override // tx5.f
    /* renamed from: reload */
    public void mo120172xc84a8199() {
        this.f301729e.mo120172xc84a8199();
    }

    @Override // tx5.f
    /* renamed from: removeJavascriptInterface */
    public void mo120173x7af55728(java.lang.String str) {
        this.f301729e.mo120173x7af55728(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f301729e.s();
    }

    public void s0(android.graphics.Canvas canvas) {
        if (!z0()) {
            draw(canvas);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.ArrayList) t0(this)).iterator();
        while (it.hasNext()) {
            android.view.TextureView textureView = (android.view.TextureView) it.next();
            android.graphics.Bitmap bitmap = textureView.getBitmap();
            by5.c4.c("WebView", "drawCanvas, costTime1:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            if (bitmap != null) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                canvas.drawBitmap(bitmap, textureView.getLeft(), textureView.getTop(), (android.graphics.Paint) null);
                by5.c4.c("WebView", "drawCanvas, costTime2:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + ", view:" + textureView);
            } else {
                by5.c4.c("WebView", "drawCanvas, textureViewBitmap is null");
            }
        }
        mo120155xf9dcf964().draw(canvas);
        by5.c4.c("WebView", "drawCanvas, costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tx5.f
    /* renamed from: savePage */
    public boolean mo120174x847491ac(java.lang.String str, java.lang.String str2, int i17) {
        return this.f301729e.mo120174x847491ac(str, str2, i17);
    }

    @Override // tx5.f
    /* renamed from: setAudioMuted */
    public void mo120175x77c16137(boolean z17) {
        this.f301729e.mo120175x77c16137(z17);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        by5.c4.f("WebView", "setBackgroundColor, color:" + java.lang.Integer.toHexString(i17));
        super.setBackgroundColor(i17);
        tx5.f fVar = this.f301729e;
        if (fVar != null) {
            fVar.mo120167xbfee89b7().setBackgroundColor(i17);
        }
    }

    @Override // tx5.f
    /* renamed from: setBottomHeight */
    public void mo120176x9f718b4(int i17) {
        this.f301729e.mo120176x9f718b4(i17);
    }

    @Override // tx5.f
    /* renamed from: setDownloadListener */
    public void mo120177x7619e5de(android.webkit.DownloadListener downloadListener) {
        this.f301729e.mo120177x7619e5de(downloadListener);
    }

    @Override // tx5.f
    /* renamed from: setFindListener */
    public void mo120178xf031e30f(android.webkit.WebView.FindListener findListener) {
        this.f301729e.mo120178xf031e30f(findListener);
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        if (z17) {
            setDescendantFocusability(131072);
            super.setFocusable(false);
        } else {
            setDescendantFocusability(393216);
            super.setFocusable(false);
        }
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z17) {
        if (z17) {
            setDescendantFocusability(131072);
            super.setFocusableInTouchMode(false);
        } else {
            setDescendantFocusability(393216);
            super.setFocusableInTouchMode(false);
        }
    }

    @Override // android.view.View, tx5.f
    /* renamed from: setHorizontalScrollBarEnabled */
    public void mo120519x347eaca1(boolean z17) {
        this.f301729e.mo120519x347eaca1(z17);
    }

    @Override // tx5.f
    /* renamed from: setHorizontalScrollbarOverlay */
    public void mo120179xdc918990(boolean z17) {
        this.f301729e.mo120179xdc918990(z17);
    }

    @Override // tx5.f
    /* renamed from: setInitialScale */
    public void mo120180x7e2239e8(int i17) {
        this.f301729e.mo120180x7e2239e8(i17);
    }

    @Override // tx5.f
    /* renamed from: setInputOutOfKeyboardEnable */
    public void mo120181x5e593bc7(boolean z17) {
        this.f301729e.mo120181x5e593bc7(z17);
    }

    @Override // tx5.f
    /* renamed from: setJSExceptionListener */
    public void mo120182xbdc6e038(com.p314xaae8f345.p3210x3857dc.l1 l1Var) {
        this.f301729e.mo120182xbdc6e038(l1Var);
    }

    @Override // tx5.f
    /* renamed from: setNativeDownloadClient */
    public void mo120183xbeb5ec(com.p314xaae8f345.p3210x3857dc.p2 p2Var) {
        this.f301729e.mo120183xbeb5ec(p2Var);
    }

    @Override // tx5.f
    /* renamed from: setNetworkAvailable */
    public void mo120184xedbee0bd(boolean z17) {
        this.f301729e.mo120184xedbee0bd(z17);
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f301731g = onLongClickListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f301729e.mo120167xbfee89b7().setOnTouchListener(onTouchListener);
    }

    @Override // tx5.f
    @java.lang.Deprecated
    /* renamed from: setPictureListener */
    public void mo120185x70aa1310(android.webkit.WebView.PictureListener pictureListener) {
        this.f301729e.mo120185x70aa1310(pictureListener);
    }

    @Override // tx5.f
    /* renamed from: setTextClassifier */
    public void mo120186xa1b09c30(android.view.textclassifier.TextClassifier textClassifier) {
        this.f301729e.mo120186xa1b09c30(textClassifier);
    }

    @Override // android.view.View, tx5.f
    /* renamed from: setVerticalScrollBarEnabled */
    public void mo120520x57c53c73(boolean z17) {
        this.f301729e.mo120520x57c53c73(z17);
    }

    @Override // tx5.f
    /* renamed from: setVerticalScrollbarOverlay */
    public void mo120187xffd81962(boolean z17) {
        this.f301729e.mo120187xffd81962(z17);
    }

    /* renamed from: setWebChromeClient */
    public void mo81410x6fd49b97(com.p314xaae8f345.p3210x3857dc.s0 s0Var) {
        this.f301729e.mo81410x6fd49b97(s0Var);
    }

    @Override // tx5.f
    /* renamed from: setWebContentsSize */
    public void mo120188x874abeed(int i17, int i18) {
        this.f301729e.mo120188x874abeed(i17, i18);
    }

    @Override // tx5.f
    /* renamed from: setWebViewCallbackClient */
    public void mo120189xb61559a7(com.p314xaae8f345.p3210x3857dc.g1 g1Var) {
        this.f301729e.mo120189xb61559a7(g1Var);
    }

    /* renamed from: setWebViewClient */
    public void mo74800x23d27c02(com.p314xaae8f345.p3210x3857dc.h1 h1Var) {
        this.f301729e.mo74800x23d27c02(h1Var);
    }

    @Override // tx5.f
    /* renamed from: setWebViewClientExtension */
    public void mo120190xd6bb225d(com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 c27839xa92bc749) {
        this.f301729e.mo120190xd6bb225d(c27839xa92bc749);
    }

    /* renamed from: setWebViewRenderProcessClient */
    public void m120191x27c7aa4d(com.p314xaae8f345.p3210x3857dc.m1 m1Var) {
        this.f301729e.t(null, m1Var);
    }

    @Override // tx5.f
    /* renamed from: setXWebKeyEventHandler */
    public void mo120192x9db21c31(com.p314xaae8f345.p3210x3857dc.InterfaceC27824x41f147d3 interfaceC27824x41f147d3) {
        this.f301729e.mo120192x9db21c31(interfaceC27824x41f147d3);
    }

    @Override // tx5.f
    /* renamed from: smoothScroll */
    public void mo120193x328cce1b(int i17, int i18, long j17) {
        this.f301729e.mo120193x328cce1b(i17, i18, j17);
    }

    @Override // tx5.f
    /* renamed from: stopLoading */
    public void mo120194xc77ccada() {
        this.f301729e.mo120194xc77ccada();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.p314xaae8f345.p3210x3857dc.m1 m1Var) {
        this.f301729e.t(executor, m1Var);
    }

    public final java.util.List t0(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.TextureView) {
            arrayList.add((android.view.TextureView) view);
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                arrayList.addAll(t0(viewGroup.getChildAt(i17)));
            }
        }
        return arrayList;
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return this.f301729e.u(i17);
    }

    @Override // tx5.f
    public boolean y() {
        return this.f301729e.y();
    }

    public boolean z0() {
        return this.f301728d == com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
    }

    @Override // tx5.f
    /* renamed from: zoomIn */
    public boolean mo120195xd67f8458() {
        return this.f301729e.mo120195xd67f8458();
    }

    @Override // tx5.f
    /* renamed from: zoomOut */
    public boolean mo120196xf9711e7b() {
        return this.f301729e.mo120196xf9711e7b();
    }

    public C27816xac2547f9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE);
    }

    public C27816xac2547f9(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.p314xaae8f345.p3210x3857dc.f1 f1Var) {
        super(context instanceof android.content.MutableContextWrapper ? new com.p314xaae8f345.p3210x3857dc.i1(((android.content.MutableContextWrapper) context).getBaseContext()) : context, attributeSet, i17);
        this.f301728d = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_NONE;
        this.f301732h = false;
        xx5.t tVar = new xx5.t();
        this.f301733i = tVar;
        tVar.f539625f = java.lang.System.currentTimeMillis();
        try {
            try {
                q0(f1Var);
                tVar.a(1);
                by5.c4.g("WebView", "###### createWebView costTime:" + tVar.f539627h + ", result:true, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
            } catch (com.p314xaae8f345.p3210x3857dc.e e17) {
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            this.f301733i.a(2);
            by5.c4.g("WebView", "###### createWebView costTime:" + this.f301733i.f539627h + ", result:false, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
            throw th6;
        }
    }

    /* renamed from: loadUrl */
    public void mo32265x141096a9(java.lang.String str) {
        if (this.f301730f.d(str)) {
            this.f301729e.mo32265x141096a9("http://weixin.qq.com/");
        } else {
            if (r0(str)) {
                return;
            }
            this.f301729e.mo32265x141096a9(str);
            by5.s0.q(str, this);
        }
    }
}
