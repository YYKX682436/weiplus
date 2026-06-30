package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class go {

    /* renamed from: a, reason: collision with root package name */
    static volatile boolean f49655a;

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        java.lang.String f49667a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "token")
        com.tencent.mapsdk.internal.go.b f49668b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "create_time")
        long f49669c;

        /* renamed from: d, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(ignore = true)
        com.tencent.mapsdk.internal.bn f49670d;

        public a(com.tencent.mapsdk.internal.bn bnVar) {
            this(bnVar, "");
        }

        private long c() {
            return this.f49669c;
        }

        private long d() {
            com.tencent.mapsdk.internal.go.b bVar = this.f49668b;
            if (bVar != null) {
                return java.lang.Long.parseLong(bVar.f49675b);
            }
            return 0L;
        }

        private java.lang.String e() {
            return "https://" + this.f49668b.f49676c + "/" + b();
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        private boolean f() {
            byte[] c17;
            java.io.File[] listFiles;
            if (this.f49670d == null) {
                return false;
            }
            java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(this.f49670d.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a());
            java.io.File a17 = com.tencent.mapsdk.internal.ks.a(file, a());
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "创建上传文件目录:".concat(java.lang.String.valueOf(a17)));
            java.io.File b17 = com.tencent.mapsdk.internal.ks.b(a17, "base-info.txt");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mapsdk.internal.bn.b F = this.f49670d.F();
            sb6.append(com.tencent.mapsdk.internal.hn.a(F.f49011c, F.f49012d));
            sb6.append("&engine_draw_version=");
            sb6.append(this.f49670d.G());
            sb6.append("&engine_data_version=");
            sb6.append(this.f49670d.H());
            sb6.append("&camera=");
            sb6.append(this.f49670d.f48999b.getMap().getCameraPosition());
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
            com.tencent.mapsdk.internal.ks.a(b17, sb6.toString().getBytes());
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集日志数据至文件:".concat(java.lang.String.valueOf(b17)));
            com.tencent.mapsdk.internal.ks.b(new java.io.File(com.tencent.mapsdk.internal.mz.a(this.f49670d.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(this.f49670d.F().f49011c)), new java.io.File(a17, "config"));
            java.lang.String a18 = this.f49670d.J().a();
            if (!android.text.TextUtils.isEmpty(a18)) {
                java.io.File b18 = com.tencent.mapsdk.internal.ks.b(a17, "engine-crash-info.txt");
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集引擎Crash至文件:".concat(java.lang.String.valueOf(b18)));
                com.tencent.mapsdk.internal.ks.a(b18, a18.getBytes());
            }
            java.lang.String b19 = this.f49670d.J().b();
            if (!android.text.TextUtils.isEmpty(b19)) {
                java.io.File b27 = com.tencent.mapsdk.internal.ks.b(a17, "engine-log-info.txt");
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集引擎日志至文件:".concat(java.lang.String.valueOf(b27)));
                com.tencent.mapsdk.internal.ks.a(b27, b19.getBytes());
            }
            java.io.File d17 = com.tencent.mapsdk.internal.u.a().f52296a.d();
            if (d17 != null && d17.exists() && d17.isDirectory() && (listFiles = d17.listFiles()) != null) {
                for (java.io.File file2 : listFiles) {
                    if (file2 != null && file2.exists() && file2.isFile()) {
                        com.tencent.mapsdk.internal.ks.b(file2, new java.io.File(a17, "plugin"));
                    }
                }
            }
            java.lang.String a19 = com.tencent.mapsdk.core.utils.log.LogUtil.a();
            if (!android.text.TextUtils.isEmpty(a19)) {
                java.io.File file3 = new java.io.File(a19);
                if (file3.exists() && file3.isDirectory()) {
                    java.io.File[] e17 = com.tencent.mapsdk.internal.ks.e(file3, ".*.log.*");
                    if (e17 != null) {
                        for (java.io.File file4 : e17) {
                            if (file4 != null && file4.exists() && file4.isFile()) {
                                com.tencent.mapsdk.internal.ks.b(file4, new java.io.File(a17, "logs"));
                            }
                        }
                    }
                    java.io.File[] e18 = com.tencent.mapsdk.internal.ks.e(file3, "archive-.*.zip");
                    if (e18 != null) {
                        for (java.io.File file5 : e18) {
                            if (file5 != null && file5.exists() && file5.isFile()) {
                                com.tencent.mapsdk.internal.ks.b(file5, new java.io.File(a17, "archives"));
                            }
                        }
                    }
                }
            }
            java.io.File a27 = com.tencent.mapsdk.internal.kv.a(a17, file.getAbsolutePath());
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "打包成zip文件:".concat(java.lang.String.valueOf(a27)));
            if (a27 == null || (c17 = com.tencent.mapsdk.internal.ks.c(a27)) == null) {
                return false;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "zip文件大小:" + c17.length);
            if (c17.length > 0) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "开始上传文件到：" + e());
                java.lang.String a28 = com.tencent.mapsdk.internal.li.a(a27);
                com.tencent.map.tools.net.NetRequest postData = new com.tencent.map.tools.net.NetRequest(com.tencent.map.tools.net.NetMethod.PUT, e()).setPostData(c17);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(c17.length);
                com.tencent.map.tools.net.NetResponse doRequest = com.tencent.map.tools.net.NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb7.toString()).setMapHeaders("Authorization", this.f49668b.f49674a).setMapHeaders("x-cos-content-sha1", a28).setTimeout(120000));
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "结束上传文件");
                com.tencent.mapsdk.internal.ks.b(a27);
                com.tencent.mapsdk.internal.ks.b(a17);
                int i17 = doRequest.statusCode;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "上传状态:".concat(java.lang.String.valueOf(i17)));
                if (i17 == 200) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        private byte[] g() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mapsdk.internal.bn.b F = this.f49670d.F();
            sb6.append(com.tencent.mapsdk.internal.hn.a(F.f49011c, F.f49012d));
            sb6.append("&engine_draw_version=");
            sb6.append(this.f49670d.G());
            sb6.append("&engine_data_version=");
            sb6.append(this.f49670d.H());
            sb6.append("&camera=");
            sb6.append(this.f49670d.f48999b.getMap().getCameraPosition());
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
            return sb6.toString().getBytes();
        }

        public final java.lang.String a() {
            return "android-" + this.f49667a + "-" + this.f49669c;
        }

        public final java.lang.String b() {
            return a() + ".zip";
        }

        public a(com.tencent.mapsdk.internal.bn bnVar, java.lang.String str) {
            this.f49667a = str;
            this.f49670d = bnVar;
            this.f49669c = java.lang.System.currentTimeMillis();
        }

        public final boolean a(android.content.Context context) {
            com.tencent.mapsdk.internal.go.b bVar;
            return (!com.tencent.map.tools.net.NetUtil.isWifi(context) || (bVar = this.f49668b) == null || bVar.a()) ? false : true;
        }

        public final void a(final com.tencent.map.tools.Callback<java.lang.Boolean> callback) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.a.2
                private java.lang.Boolean a() {
                    return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.go.a.a(com.tencent.mapsdk.internal.go.a.this));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.go.a.a(com.tencent.mapsdk.internal.go.a.this));
                }
            }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.a.1
                private void a(java.lang.Boolean bool) {
                    com.tencent.map.tools.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.callback(bool);
                    }
                }

                @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
                public final /* bridge */ /* synthetic */ void callback(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    com.tencent.map.tools.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.callback(bool);
                    }
                }
            });
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.go.a aVar) {
            byte[] c17;
            java.io.File[] listFiles;
            if (aVar.f49670d != null) {
                java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(aVar.f49670d.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a());
                java.io.File a17 = com.tencent.mapsdk.internal.ks.a(file, aVar.a());
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "创建上传文件目录:".concat(java.lang.String.valueOf(a17)));
                java.io.File b17 = com.tencent.mapsdk.internal.ks.b(a17, "base-info.txt");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mapsdk.internal.bn.b F = aVar.f49670d.F();
                sb6.append(com.tencent.mapsdk.internal.hn.a(F.f49011c, F.f49012d));
                sb6.append("&engine_draw_version=");
                sb6.append(aVar.f49670d.G());
                sb6.append("&engine_data_version=");
                sb6.append(aVar.f49670d.H());
                sb6.append("&camera=");
                sb6.append(aVar.f49670d.f48999b.getMap().getCameraPosition());
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
                com.tencent.mapsdk.internal.ks.a(b17, sb6.toString().getBytes());
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集日志数据至文件:".concat(java.lang.String.valueOf(b17)));
                com.tencent.mapsdk.internal.ks.b(new java.io.File(com.tencent.mapsdk.internal.mz.a(aVar.f49670d.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).a(aVar.f49670d.F().f49011c)), new java.io.File(a17, "config"));
                java.lang.String a18 = aVar.f49670d.J().a();
                if (!android.text.TextUtils.isEmpty(a18)) {
                    java.io.File b18 = com.tencent.mapsdk.internal.ks.b(a17, "engine-crash-info.txt");
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集引擎Crash至文件:".concat(java.lang.String.valueOf(b18)));
                    com.tencent.mapsdk.internal.ks.a(b18, a18.getBytes());
                }
                java.lang.String b19 = aVar.f49670d.J().b();
                if (!android.text.TextUtils.isEmpty(b19)) {
                    java.io.File b27 = com.tencent.mapsdk.internal.ks.b(a17, "engine-log-info.txt");
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "收集引擎日志至文件:".concat(java.lang.String.valueOf(b27)));
                    com.tencent.mapsdk.internal.ks.a(b27, b19.getBytes());
                }
                java.io.File d17 = com.tencent.mapsdk.internal.u.a().f52296a.d();
                if (d17 != null && d17.exists() && d17.isDirectory() && (listFiles = d17.listFiles()) != null) {
                    for (java.io.File file2 : listFiles) {
                        if (file2 != null && file2.exists() && file2.isFile()) {
                            com.tencent.mapsdk.internal.ks.b(file2, new java.io.File(a17, "plugin"));
                        }
                    }
                }
                java.lang.String a19 = com.tencent.mapsdk.core.utils.log.LogUtil.a();
                if (!android.text.TextUtils.isEmpty(a19)) {
                    java.io.File file3 = new java.io.File(a19);
                    if (file3.exists() && file3.isDirectory()) {
                        java.io.File[] e17 = com.tencent.mapsdk.internal.ks.e(file3, ".*.log.*");
                        if (e17 != null) {
                            for (java.io.File file4 : e17) {
                                if (file4 != null && file4.exists() && file4.isFile()) {
                                    com.tencent.mapsdk.internal.ks.b(file4, new java.io.File(a17, "logs"));
                                }
                            }
                        }
                        java.io.File[] e18 = com.tencent.mapsdk.internal.ks.e(file3, "archive-.*.zip");
                        if (e18 != null) {
                            for (java.io.File file5 : e18) {
                                if (file5 != null && file5.exists() && file5.isFile()) {
                                    com.tencent.mapsdk.internal.ks.b(file5, new java.io.File(a17, "archives"));
                                }
                            }
                        }
                    }
                }
                java.io.File a27 = com.tencent.mapsdk.internal.kv.a(a17, file.getAbsolutePath());
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "打包成zip文件:".concat(java.lang.String.valueOf(a27)));
                if (a27 != null && (c17 = com.tencent.mapsdk.internal.ks.c(a27)) != null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "zip文件大小:" + c17.length);
                    if (c17.length > 0) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "开始上传文件到：" + aVar.e());
                        java.lang.String a28 = com.tencent.mapsdk.internal.li.a(a27);
                        com.tencent.map.tools.net.NetRequest postData = new com.tencent.map.tools.net.NetRequest(com.tencent.map.tools.net.NetMethod.PUT, aVar.e()).setPostData(c17);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(c17.length);
                        com.tencent.map.tools.net.NetResponse doRequest = com.tencent.map.tools.net.NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb7.toString()).setMapHeaders("Authorization", aVar.f49668b.f49674a).setMapHeaders("x-cos-content-sha1", a28).setTimeout(120000));
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "结束上传文件");
                        com.tencent.mapsdk.internal.ks.b(a27);
                        com.tencent.mapsdk.internal.ks.b(a17);
                        int i17 = doRequest.statusCode;
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "上传状态:".concat(java.lang.String.valueOf(i17)));
                        if (i17 == 200) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "token")
        java.lang.String f49674a;

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "expire")
        java.lang.String f49675b;

        /* renamed from: c, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "host")
        java.lang.String f49676c;

        public final boolean a() {
            try {
                return java.lang.Long.parseLong(this.f49675b) < android.os.SystemClock.uptimeMillis() / 1000;
            } catch (java.lang.Exception unused) {
                return true;
            }
        }
    }

    public static boolean a(final android.content.Context context, final android.content.SharedPreferences sharedPreferences, final com.tencent.mapsdk.internal.go.a aVar) {
        if (aVar != null && context != null) {
            if (com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50209j) && android.os.Build.VERSION.SDK_INT < 30) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("日志名称:\n");
                    sb6.append(aVar.a());
                    sb6.append("\n创建时间:\n");
                    sb6.append(java.text.DateFormat.getInstance().format(new java.util.Date(aVar.f49669c)));
                    sb6.append("\n过期时间:\n");
                    java.text.DateFormat dateFormat = java.text.DateFormat.getInstance();
                    com.tencent.mapsdk.internal.go.b bVar = aVar.f49668b;
                    sb6.append(dateFormat.format(new java.util.Date((bVar != null ? java.lang.Long.parseLong(bVar.f49675b) : 0L) * 1000)));
                    sb6.append("\n");
                    final com.tencent.mapsdk.internal.kp.a a17 = com.tencent.mapsdk.internal.kp.a(context, "调试模式", sb6.toString(), 1);
                    return a17.a().a("上报(仅WIFI)", new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.go.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            if (com.tencent.mapsdk.internal.go.f49655a || !com.tencent.mapsdk.internal.go.a.this.a(context)) {
                                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "正在上传中");
                                return;
                            }
                            a17.a("上报中", (android.view.View.OnClickListener) null);
                            com.tencent.mapsdk.internal.go.a.this.a(new com.tencent.map.tools.Callback<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.3.1
                                private void a(java.lang.Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "清理本地缓存");
                                        com.tencent.mapsdk.internal.ku.a(sharedPreferences).a("reportFile", "");
                                    }
                                    android.widget.Toast toast = a17.f50164a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    com.tencent.mapsdk.internal.go.f49655a = false;
                                }

                                @Override // com.tencent.map.tools.Callback
                                public final /* synthetic */ void callback(java.lang.Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "清理本地缓存");
                                        com.tencent.mapsdk.internal.ku.a(sharedPreferences).a("reportFile", "");
                                    }
                                    android.widget.Toast toast = a17.f50164a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    com.tencent.mapsdk.internal.go.f49655a = false;
                                }
                            });
                            com.tencent.mapsdk.internal.go.f49655a = true;
                        }
                    }).b();
                } catch (java.lang.Exception unused) {
                }
            } else if (!f49655a && aVar.a(context)) {
                aVar.a(new com.tencent.map.tools.Callback<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.4
                    private void a(java.lang.Boolean bool) {
                        if (!bool.booleanValue()) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "清理本地缓存");
                            com.tencent.mapsdk.internal.ku.a(sharedPreferences).a("reportFile", "");
                        }
                        com.tencent.mapsdk.internal.go.f49655a = false;
                    }

                    @Override // com.tencent.map.tools.Callback
                    public final /* synthetic */ void callback(java.lang.Boolean bool) {
                        if (!bool.booleanValue()) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "清理本地缓存");
                            com.tencent.mapsdk.internal.ku.a(sharedPreferences).a("reportFile", "");
                        }
                        com.tencent.mapsdk.internal.go.f49655a = false;
                    }
                });
                f49655a = true;
            }
        }
        return false;
    }

    public static boolean a(com.tencent.mapsdk.internal.bn bnVar) {
        if (bnVar == null || bnVar.f49001d || bnVar.x().a()) {
            return false;
        }
        final android.content.Context context = bnVar.getContext();
        final com.tencent.mapsdk.internal.bn.b F = bnVar.F();
        java.lang.String a17 = F.a();
        final android.content.SharedPreferences a18 = com.tencent.mapsdk.internal.ku.a(context, "uploadConfig." + F.c());
        final com.tencent.mapsdk.internal.go.a aVar = null;
        java.lang.String string = a18.getString("reportFile", null);
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "获取本地上报文件：".concat(java.lang.String.valueOf(string)));
                aVar = (com.tencent.mapsdk.internal.go.a) com.tencent.map.tools.json.JsonUtils.parseToModel(new org.json.JSONObject(string), com.tencent.mapsdk.internal.go.a.class, bnVar);
            } catch (java.lang.Exception unused) {
            }
        }
        if (aVar == null || !a17.equals(aVar.f49667a)) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "重新创建上报文件");
            aVar = new com.tencent.mapsdk.internal.go.a(bnVar, a17);
        }
        com.tencent.mapsdk.internal.go.b bVar = aVar.f49668b;
        if (bVar != null && !bVar.a()) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "使用本地上报文件");
            return a(context, a18, aVar);
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "请求token");
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<org.json.JSONObject>() { // from class: com.tencent.mapsdk.internal.go.2
            private org.json.JSONObject a() {
                com.tencent.mapsdk.internal.cx cxVar = (com.tencent.mapsdk.internal.cx) ((com.tencent.mapsdk.internal.dk) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dk.class)).i();
                java.lang.String b17 = com.tencent.mapsdk.internal.go.a.this.b();
                com.tencent.mapsdk.internal.bn.b bVar2 = F;
                com.tencent.map.tools.net.NetResponse uploadToken = cxVar.uploadToken(b17, bVar2.f49009a, bVar2.f49010b);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "响应状态：" + uploadToken.statusCode);
                if (!uploadToken.available()) {
                    return null;
                }
                java.lang.String a19 = com.tencent.mapsdk.internal.hr.a(uploadToken.data, uploadToken.charset);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "获取网络token数据：".concat(java.lang.String.valueOf(a19)));
                if (android.text.TextUtils.isEmpty(a19)) {
                    return null;
                }
                return new org.json.JSONObject(a19).optJSONObject("detail");
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.tencent.mapsdk.internal.cx cxVar = (com.tencent.mapsdk.internal.cx) ((com.tencent.mapsdk.internal.dk) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dk.class)).i();
                java.lang.String b17 = com.tencent.mapsdk.internal.go.a.this.b();
                com.tencent.mapsdk.internal.bn.b bVar2 = F;
                com.tencent.map.tools.net.NetResponse uploadToken = cxVar.uploadToken(b17, bVar2.f49009a, bVar2.f49010b);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "响应状态：" + uploadToken.statusCode);
                if (!uploadToken.available()) {
                    return null;
                }
                java.lang.String a19 = com.tencent.mapsdk.internal.hr.a(uploadToken.data, uploadToken.charset);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "获取网络token数据：".concat(java.lang.String.valueOf(a19)));
                if (android.text.TextUtils.isEmpty(a19)) {
                    return null;
                }
                return new org.json.JSONObject(a19).optJSONObject("detail");
            }
        }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<org.json.JSONObject>() { // from class: com.tencent.mapsdk.internal.go.1
            private void a(org.json.JSONObject jSONObject) {
                if (jSONObject != null) {
                    com.tencent.mapsdk.internal.go.a.this.f49668b = (com.tencent.mapsdk.internal.go.b) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.go.b.class, new java.lang.Object[0]);
                    com.tencent.mapsdk.internal.go.a(context, a18, com.tencent.mapsdk.internal.go.a.this);
                    org.json.JSONObject modelToJson = com.tencent.map.tools.json.JsonUtils.modelToJson(com.tencent.mapsdk.internal.go.a.this);
                    if (modelToJson != null) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "保存上报文件至本地");
                        com.tencent.mapsdk.internal.ku.a(a18).a("reportFile", modelToJson.toString());
                    }
                }
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(java.lang.Object obj) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                if (jSONObject != null) {
                    com.tencent.mapsdk.internal.go.a.this.f49668b = (com.tencent.mapsdk.internal.go.b) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.go.b.class, new java.lang.Object[0]);
                    com.tencent.mapsdk.internal.go.a(context, a18, com.tencent.mapsdk.internal.go.a.this);
                    org.json.JSONObject modelToJson = com.tencent.map.tools.json.JsonUtils.modelToJson(com.tencent.mapsdk.internal.go.a.this);
                    if (modelToJson != null) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50209j, "保存上报文件至本地");
                        com.tencent.mapsdk.internal.ku.a(a18).a("reportFile", modelToJson.toString());
                    }
                }
            }
        });
        return false;
    }
}
