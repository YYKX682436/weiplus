package x44;

/* loaded from: classes4.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static final x44.n f533392d = new x44.n();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f533393e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f533394f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f533395g;

    public static /* synthetic */ org.json.JSONObject d(x44.n nVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureFileDownloadInfo$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        org.json.JSONObject a17 = nVar.a(j17, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureFileDownloadInfo$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return a17;
    }

    public final org.json.JSONObject a(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ensureFileDownloadInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        java.util.Map map = f533393e;
        if (z17 || !map.containsKey(java.lang.Long.valueOf(j17))) {
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
            gVar.m134976x2690a4ac();
            h02.a D0 = gVar.f81913d.D0(j17);
            if (D0 != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appId", D0.f68404x28d45f97);
                jSONObject.put(dm.i4.f66865x76d1ec5a, D0.f68408x32b20428);
                jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, D0.f68419xf1e9b966);
                jSONObject.put("md5", D0.f68426x4b6e68b9);
                jSONObject.put("downloadedSize", D0.f68413xf432b5ad);
                jSONObject.put("fileSize", D0.f68420xf1eb3542);
                jSONObject.put("isAutoDownload", D0.f68405x56e99a7c);
                jSONObject.put("isAutoInstall", D0.f68406x8d834527);
                jSONObject.put("status", D0.f68441x10a0fed7);
                java.lang.String str = D0.f68429xa1e9e82c;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("pkg", str);
                jSONObject.put("fileType", D0.f68421xf1ebe47b);
                jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, D0.f68418xf1e8cfcc);
                jSONObject.put("downloaderType", D0.f68414xf4f8adf4);
                java.lang.String str2 = D0.f68411x238eb002;
                jSONObject.put("url", str2 != null ? str2 : "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                map.put(valueOf, jSONObject);
            }
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ensureFileDownloadInfo", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return jSONObject2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskFailed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "the task failed, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadFailed");
                f533392d.g(j17, d17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when failed, download id is " + j17);
            }
            n(j17);
            f533393e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskFailed, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskFailed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskFinished", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "the task finished, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadFinished");
                d17.put("progress", 100);
                f533392d.g(j17, d17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when finish, download id is " + j17);
            }
            n(j17);
            f533393e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskFinished, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskFinished", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final boolean e(long j17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                z17 = ((java.util.LinkedHashMap) f533394f).get(java.lang.Long.valueOf(j17)) != null;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskMd5Checking", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskMd5Checking", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void g(long j17, org.json.JSONObject obj) {
        x44.j0 j0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                j0Var = (x44.j0) ((java.util.LinkedHashMap) f533394f).get(java.lang.Long.valueOf(j17));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        if (j0Var != null) {
            x44.e3 e3Var = (x44.e3) j0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notify", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "the callback event notified!!");
                w44.a aVar = e3Var.f533360a;
                if (aVar != null) {
                    aVar.a("onDownloadStateChange", obj);
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "there is an exception, " + th7.getMessage());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notify", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.SnsAdJsApiFileDownloadCallback");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskProgressChanged", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject a17 = a(j17, j18 == 0 || j19 == 0);
            if (a17 != null) {
                a17.put("state", "downloadProgressChanged");
                a17.put("downloadedSize", j18);
                long optLong = a17.optLong("fileSize", j19);
                if (0 != optLong) {
                    a17.put("progress", a06.d.b(((((float) j18) * 1.0f) / ((float) optLong)) * 100));
                }
                f533392d.g(j17, a17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when progress changed, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskProgressChanged, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskProgressChanged", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskResumed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadResumed");
                f533392d.g(j17, d17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when resume, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskResumed, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskResumed", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void j(long j17, x44.j0 c17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        synchronized (this) {
            try {
                f533394f.put(java.lang.Long.valueOf(j17), c17);
                if (!f533395g) {
                    if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i()) != null) {
                        i17.a(this);
                    }
                    f533395g = true;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("putCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskPaused", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadPaused");
                f533392d.g(j17, d17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when removed, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskPaused, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskPaused", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskStarted", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadStarted");
                f533392d.g(j17, d17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null, download id is " + j17);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskStarted, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskStarted", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTaskRemoved", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "the task removed, id is " + j17);
            org.json.JSONObject d17 = d(this, j17, false, 2, null);
            if (d17 != null) {
                d17.put("state", "downloadRemoved");
                x44.n nVar = f533392d;
                nVar.g(j17, d17);
                java.lang.String optString = d17.optString("url");
                if (optString == null) {
                    optString = "";
                }
                int optInt = d17.optInt("downloaderType", 0);
                if (nVar.e(j17)) {
                    if ((optString.length() > 0) && 2 == optInt) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "it is going to delete tmp file of download file");
                        if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i()) != null) {
                            i17.f(optString);
                        }
                    }
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task info is null when removed, download id is " + j17);
            }
            n(j17);
            f533393e.remove(java.lang.Long.valueOf(j17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Download", "the task onTaskRemoved, error " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTaskRemoved", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }

    public final void n(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
        synchronized (this) {
            try {
                java.util.Map map = f533394f;
                map.remove(java.lang.Long.valueOf(j17));
                if (map.isEmpty() && f533395g) {
                    if (((vz.v1) i95.n0.c(vz.v1.class)) != null && (i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i()) != null) {
                        i17.s(this);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Download", "the download call back is removed");
                    f533395g = false;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCallback", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FileDownloadCallbackManager");
    }
}
