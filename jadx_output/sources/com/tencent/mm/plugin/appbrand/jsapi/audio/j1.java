package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes15.dex */
public class j1 extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {
    public boolean A;
    public final com.tencent.mm.sdk.event.IListener B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.v0 f79219d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.i0 f79220e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.audio.k1 f79221f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f79222g;

    /* renamed from: h, reason: collision with root package name */
    public int f79223h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79225m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f79226n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f79229q;

    /* renamed from: r, reason: collision with root package name */
    public int f79230r;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f79236x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f79237y;

    /* renamed from: z, reason: collision with root package name */
    public int f79238z;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79224i = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f79227o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f79228p = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f79231s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f79232t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f79233u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f79234v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f79235w = "";

    public j1(com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OperateRecordEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$OperateRecordTask$1
            {
                this.__eventId = -1109317931;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent) {
                com.tencent.mm.autogen.events.OperateRecordEvent operateRecordEvent2 = operateRecordEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "mListener callback action : %d", java.lang.Integer.valueOf(operateRecordEvent2.f54601g.f8108a));
                com.tencent.mm.plugin.appbrand.jsapi.audio.j1 j1Var = com.tencent.mm.plugin.appbrand.jsapi.audio.j1.this;
                java.lang.String str = j1Var.f79225m;
                am.un unVar = operateRecordEvent2.f54601g;
                if (!str.equalsIgnoreCase(unVar.f8117j)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Record.JsApiOperateRecorder", "appId is diff, don't send event");
                    return false;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("state", unVar.f8110c);
                j1Var.f79234v = unVar.f8110c;
                if (unVar.f8108a == 2) {
                    j1Var.f79231s = unVar.f8111d;
                    j1Var.f79233u = unVar.f8109b;
                    j1Var.f79232t = unVar.f8112e;
                    java.lang.String str2 = j1Var.f79225m;
                    java.util.HashMap hashMap2 = (java.util.HashMap) com.tencent.mm.plugin.appbrand.media.record.h.f85809a;
                    if (hashMap2.containsKey(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AppBrandRecordClientService", "removeRecordListener,appId:%s", str2);
                        com.tencent.mm.plugin.appbrand.media.record.h.f85810b.remove(str2);
                        com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) hashMap2.remove(str2);
                        if (iListener != null) {
                            iListener.dead();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s not exist the appId for listener", str2);
                    }
                }
                if (unVar.f8108a == 4) {
                    hashMap.put("errCode", java.lang.Integer.valueOf(unVar.f8115h));
                    hashMap.put("errMsg", !android.text.TextUtils.isEmpty(unVar.f8116i) ? unVar.f8116i : "");
                }
                if (unVar.f8108a == 5) {
                    byte[] bArr = unVar.f8113f;
                    if (bArr == null || bArr.length <= 819200) {
                        j1Var.f79237y = bArr;
                    } else {
                        java.lang.System.nanoTime();
                        java.io.OutputStream outputStream = null;
                        try {
                            try {
                                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(j1Var.f79236x);
                                if (!r6Var.m()) {
                                    r6Var.k();
                                }
                                outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                                outputStream.write(unVar.f8113f);
                                outputStream.close();
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e17, "", new java.lang.Object[0]);
                                }
                            } catch (java.lang.Throwable th6) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (java.io.IOException e18) {
                                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e18, "", new java.lang.Object[0]);
                                    }
                                }
                                throw th6;
                            }
                        } catch (java.io.FileNotFoundException e19) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e19, "", new java.lang.Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e27) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e27, "", new java.lang.Object[0]);
                                }
                            }
                        } catch (java.io.IOException e28) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e28, "", new java.lang.Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (java.io.IOException e29) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e29, "", new java.lang.Object[0]);
                                }
                            }
                        }
                        java.lang.System.nanoTime();
                    }
                    byte[] bArr2 = unVar.f8113f;
                    int length = bArr2 != null ? bArr2.length : 0;
                    j1Var.f79238z = length;
                    j1Var.A = unVar.f8114g;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "frameBufferSize:%d", java.lang.Integer.valueOf(length));
                }
                j1Var.f79229q = new org.json.JSONObject(hashMap).toString();
                j1Var.f79230r = unVar.f8108a;
                j1Var.b();
                return true;
            }
        };
        this.f79221f = k1Var;
        this.f79222g = e9Var;
        this.f79223h = i17;
        ik1.b0 b0Var = new ik1.b0();
        if (e9Var.getFileSystem().getTempDirectory(b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            this.f79236x = new com.tencent.mm.vfs.r6((java.lang.String) b0Var.f291824a, "frameBuffer").o();
            return;
        }
        this.f79236x = new com.tencent.mm.vfs.r6(e9Var.getF147807d().getCacheDir(), "frameBuffer_" + e9Var.getAppId()).o();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0233  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.audio.j1.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if ("opus".equalsIgnoreCase(r10) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f4, code lost:
    
        r6.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f2, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d5, code lost:
    
        if (r6.m() != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.tencent.mm.vfs.r6] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.audio.j1.b():void");
    }
}
