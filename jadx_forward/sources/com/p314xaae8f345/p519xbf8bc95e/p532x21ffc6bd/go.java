package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class go {

    /* renamed from: a, reason: collision with root package name */
    static volatile boolean f131188a;

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)
        java.lang.String f131200a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "token")
        com.tencent.mapsdk.internal.go.b f131201b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "create_time")
        long f131202c;

        /* renamed from: d, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn f131203d;

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
            this(bnVar, "");
        }

        private long c() {
            return this.f131202c;
        }

        private long d() {
            com.tencent.mapsdk.internal.go.b bVar = this.f131201b;
            if (bVar != null) {
                return java.lang.Long.parseLong(bVar.f131208b);
            }
            return 0L;
        }

        private java.lang.String e() {
            return "https://" + this.f131201b.f131209c + "/" + b();
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        private boolean f() {
            byte[] c17;
            java.io.File[] listFiles;
            if (this.f131203d == null) {
                return false;
            }
            java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f131203d.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).a());
            java.io.File a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, a());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "创建上传文件目录:".concat(java.lang.String.valueOf(a17)));
            java.io.File b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "base-info.txt");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mapsdk.internal.bn.b F = this.f131203d.F();
            sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(F.f130544c, F.f130545d));
            sb6.append("&engine_draw_version=");
            sb6.append(this.f131203d.G());
            sb6.append("&engine_data_version=");
            sb6.append(this.f131203d.H());
            sb6.append("&camera=");
            sb6.append(this.f131203d.f130532b.mo36068xb5885626().mo37451xd2ef9864());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b17, sb6.toString().getBytes());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集日志数据至文件:".concat(java.lang.String.valueOf(b17)));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(this.f131203d.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).a(this.f131203d.F().f130544c)), new java.io.File(a17, "config"));
            java.lang.String a18 = this.f131203d.J().a();
            if (!android.text.TextUtils.isEmpty(a18)) {
                java.io.File b18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "engine-crash-info.txt");
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集引擎Crash至文件:".concat(java.lang.String.valueOf(b18)));
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b18, a18.getBytes());
            }
            java.lang.String b19 = this.f131203d.J().b();
            if (!android.text.TextUtils.isEmpty(b19)) {
                java.io.File b27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "engine-log-info.txt");
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集引擎日志至文件:".concat(java.lang.String.valueOf(b27)));
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b27, b19.getBytes());
            }
            java.io.File d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a().f133829a.d();
            if (d17 != null && d17.exists() && d17.isDirectory() && (listFiles = d17.listFiles()) != null) {
                for (java.io.File file2 : listFiles) {
                    if (file2 != null && file2.exists() && file2.isFile()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2, new java.io.File(a17, "plugin"));
                    }
                }
            }
            java.lang.String a19 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a();
            if (!android.text.TextUtils.isEmpty(a19)) {
                java.io.File file3 = new java.io.File(a19);
                if (file3.exists() && file3.isDirectory()) {
                    java.io.File[] e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(file3, ".*.log.*");
                    if (e17 != null) {
                        for (java.io.File file4 : e17) {
                            if (file4 != null && file4.exists() && file4.isFile()) {
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file4, new java.io.File(a17, "logs"));
                            }
                        }
                    }
                    java.io.File[] e18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(file3, "archive-.*.zip");
                    if (e18 != null) {
                        for (java.io.File file5 : e18) {
                            if (file5 != null && file5.exists() && file5.isFile()) {
                                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file5, new java.io.File(a17, "archives"));
                            }
                        }
                    }
                }
            }
            java.io.File a27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(a17, file.getAbsolutePath());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "打包成zip文件:".concat(java.lang.String.valueOf(a27)));
            if (a27 == null || (c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(a27)) == null) {
                return false;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "zip文件大小:" + c17.length);
            if (c17.length > 0) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "开始上传文件到：" + e());
                java.lang.String a28 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(a27);
                com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35981xa3aa4aec = new com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.PUT, e()).m35981xa3aa4aec(c17);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(c17.length);
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35938x99e55b84 = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35938x99e55b84(m35981xa3aa4aec.m35977x52bbe88c("Content-Length", sb7.toString()).m35977x52bbe88c("Authorization", this.f131201b.f131207a).m35977x52bbe88c("x-cos-content-sha1", a28).m35986x62edd69f(120000));
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "结束上传文件");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a27);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17);
                int i17 = m35938x99e55b84.f16986xec0a8ff;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "上传状态:".concat(java.lang.String.valueOf(i17)));
                if (i17 == 200) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        private byte[] g() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mapsdk.internal.bn.b F = this.f131203d.F();
            sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(F.f130544c, F.f130545d));
            sb6.append("&engine_draw_version=");
            sb6.append(this.f131203d.G());
            sb6.append("&engine_data_version=");
            sb6.append(this.f131203d.H());
            sb6.append("&camera=");
            sb6.append(this.f131203d.f130532b.mo36068xb5885626().mo37451xd2ef9864());
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
            return sb6.toString().getBytes();
        }

        public final java.lang.String a() {
            return "android-" + this.f131200a + "-" + this.f131202c;
        }

        public final java.lang.String b() {
            return a() + ".zip";
        }

        public a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, java.lang.String str) {
            this.f131200a = str;
            this.f131203d = bnVar;
            this.f131202c = java.lang.System.currentTimeMillis();
        }

        public final boolean a(android.content.Context context) {
            com.tencent.mapsdk.internal.go.b bVar;
            return (!com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.m36038xb9aa8b5f(context) || (bVar = this.f131201b) == null || bVar.a()) ? false : true;
        }

        public final void a(final com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean> interfaceC4308xf9968465) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.a.2
                private java.lang.Boolean a() {
                    return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.go.a.a(com.tencent.mapsdk.internal.go.a.this));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.go.a.a(com.tencent.mapsdk.internal.go.a.this));
                }
            }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.a.1
                private void a(java.lang.Boolean bool) {
                    com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 interfaceC4308xf99684652 = interfaceC4308xf9968465;
                    if (interfaceC4308xf99684652 != null) {
                        interfaceC4308xf99684652.mo35806xf5bc2045(bool);
                    }
                }

                @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                /* renamed from: callback */
                public final /* bridge */ /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 interfaceC4308xf99684652 = interfaceC4308xf9968465;
                    if (interfaceC4308xf99684652 != null) {
                        interfaceC4308xf99684652.mo35806xf5bc2045(bool);
                    }
                }
            });
        }

        /* JADX WARN: Type inference failed for: r7v13, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
        public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.go.a aVar) {
            byte[] c17;
            java.io.File[] listFiles;
            if (aVar.f131203d != null) {
                java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(aVar.f131203d.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).a());
                java.io.File a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, aVar.a());
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "创建上传文件目录:".concat(java.lang.String.valueOf(a17)));
                java.io.File b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "base-info.txt");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mapsdk.internal.bn.b F = aVar.f131203d.F();
                sb6.append(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(F.f130544c, F.f130545d));
                sb6.append("&engine_draw_version=");
                sb6.append(aVar.f131203d.G());
                sb6.append("&engine_data_version=");
                sb6.append(aVar.f131203d.H());
                sb6.append("&camera=");
                sb6.append(aVar.f131203d.f130532b.mo36068xb5885626().mo37451xd2ef9864());
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "日志数据:".concat(java.lang.String.valueOf(sb6)));
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b17, sb6.toString().getBytes());
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集日志数据至文件:".concat(java.lang.String.valueOf(b17)));
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(aVar.f131203d.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).a(aVar.f131203d.F().f130544c)), new java.io.File(a17, "config"));
                java.lang.String a18 = aVar.f131203d.J().a();
                if (!android.text.TextUtils.isEmpty(a18)) {
                    java.io.File b18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "engine-crash-info.txt");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集引擎Crash至文件:".concat(java.lang.String.valueOf(b18)));
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b18, a18.getBytes());
                }
                java.lang.String b19 = aVar.f131203d.J().b();
                if (!android.text.TextUtils.isEmpty(b19)) {
                    java.io.File b27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17, "engine-log-info.txt");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "收集引擎日志至文件:".concat(java.lang.String.valueOf(b27)));
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(b27, b19.getBytes());
                }
                java.io.File d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a().f133829a.d();
                if (d17 != null && d17.exists() && d17.isDirectory() && (listFiles = d17.listFiles()) != null) {
                    for (java.io.File file2 : listFiles) {
                        if (file2 != null && file2.exists() && file2.isFile()) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2, new java.io.File(a17, "plugin"));
                        }
                    }
                }
                java.lang.String a19 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a();
                if (!android.text.TextUtils.isEmpty(a19)) {
                    java.io.File file3 = new java.io.File(a19);
                    if (file3.exists() && file3.isDirectory()) {
                        java.io.File[] e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(file3, ".*.log.*");
                        if (e17 != null) {
                            for (java.io.File file4 : e17) {
                                if (file4 != null && file4.exists() && file4.isFile()) {
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file4, new java.io.File(a17, "logs"));
                                }
                            }
                        }
                        java.io.File[] e18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(file3, "archive-.*.zip");
                        if (e18 != null) {
                            for (java.io.File file5 : e18) {
                                if (file5 != null && file5.exists() && file5.isFile()) {
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file5, new java.io.File(a17, "archives"));
                                }
                            }
                        }
                    }
                }
                java.io.File a27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(a17, file.getAbsolutePath());
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "打包成zip文件:".concat(java.lang.String.valueOf(a27)));
                if (a27 != null && (c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(a27)) != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "zip文件大小:" + c17.length);
                    if (c17.length > 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "开始上传文件到：" + aVar.e());
                        java.lang.String a28 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(a27);
                        com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 m35981xa3aa4aec = new com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252(com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.PUT, aVar.e()).m35981xa3aa4aec(c17);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(c17.length);
                        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35938x99e55b84 = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35938x99e55b84(m35981xa3aa4aec.m35977x52bbe88c("Content-Length", sb7.toString()).m35977x52bbe88c("Authorization", aVar.f131201b.f131207a).m35977x52bbe88c("x-cos-content-sha1", a28).m35986x62edd69f(120000));
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "结束上传文件");
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a27);
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(a17);
                        int i17 = m35938x99e55b84.f16986xec0a8ff;
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "上传状态:".concat(java.lang.String.valueOf(i17)));
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
    public static class b extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "token")
        java.lang.String f131207a;

        /* renamed from: b, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "expire")
        java.lang.String f131208b;

        /* renamed from: c, reason: collision with root package name */
        @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "host")
        java.lang.String f131209c;

        public final boolean a() {
            try {
                return java.lang.Long.parseLong(this.f131208b) < android.os.SystemClock.uptimeMillis() / 1000;
            } catch (java.lang.Exception unused) {
                return true;
            }
        }
    }

    public static boolean a(final android.content.Context context, final android.content.SharedPreferences sharedPreferences, final com.tencent.mapsdk.internal.go.a aVar) {
        if (aVar != null && context != null) {
            if (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j) && android.os.Build.VERSION.SDK_INT < 30) {
                try {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("日志名称:\n");
                    sb6.append(aVar.a());
                    sb6.append("\n创建时间:\n");
                    sb6.append(java.text.DateFormat.getInstance().format(new java.util.Date(aVar.f131202c)));
                    sb6.append("\n过期时间:\n");
                    java.text.DateFormat dateFormat = java.text.DateFormat.getInstance();
                    com.tencent.mapsdk.internal.go.b bVar = aVar.f131201b;
                    sb6.append(dateFormat.format(new java.util.Date((bVar != null ? java.lang.Long.parseLong(bVar.f131208b) : 0L) * 1000)));
                    sb6.append("\n");
                    final com.tencent.mapsdk.internal.kp.a a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kp.a(context, "调试模式", sb6.toString(), 1);
                    return a17.a().a("上报(仅WIFI)", new android.view.View.OnClickListener() { // from class: com.tencent.mapsdk.internal.go.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a || !com.tencent.mapsdk.internal.go.a.this.a(context)) {
                                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "正在上传中");
                                return;
                            }
                            a17.a("上报中", (android.view.View.OnClickListener) null);
                            com.tencent.mapsdk.internal.go.a.this.a(new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.3.1
                                private void a(java.lang.Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "清理本地缓存");
                                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(sharedPreferences).a("reportFile", "");
                                    }
                                    android.widget.Toast toast = a17.f131697a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a = false;
                                }

                                @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                                /* renamed from: callback */
                                public final /* synthetic */ void mo35806xf5bc2045(java.lang.Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "清理本地缓存");
                                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(sharedPreferences).a("reportFile", "");
                                    }
                                    android.widget.Toast toast = a17.f131697a;
                                    if (toast != null) {
                                        toast.cancel();
                                    }
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a = false;
                                }
                            });
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a = true;
                        }
                    }).b();
                } catch (java.lang.Exception unused) {
                }
            } else if (!f131188a && aVar.a(context)) {
                aVar.a(new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.go.4
                    private void a(java.lang.Boolean bool) {
                        if (!bool.booleanValue()) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "清理本地缓存");
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(sharedPreferences).a("reportFile", "");
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a = false;
                    }

                    @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                    /* renamed from: callback */
                    public final /* synthetic */ void mo35806xf5bc2045(java.lang.Boolean bool) {
                        if (!bool.booleanValue()) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "清理本地缓存");
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(sharedPreferences).a("reportFile", "");
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.f131188a = false;
                    }
                });
                f131188a = true;
            }
        }
        return false;
    }

    public static boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (bnVar == null || bnVar.f130534d || bnVar.x().a()) {
            return false;
        }
        final android.content.Context mo36630x76847179 = bnVar.mo36630x76847179();
        final com.tencent.mapsdk.internal.bn.b F = bnVar.F();
        java.lang.String a17 = F.a();
        final android.content.SharedPreferences a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(mo36630x76847179, "uploadConfig." + F.c());
        final com.tencent.mapsdk.internal.go.a aVar = null;
        java.lang.String string = a18.getString("reportFile", null);
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "获取本地上报文件：".concat(java.lang.String.valueOf(string)));
                aVar = (com.tencent.mapsdk.internal.go.a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(new org.json.JSONObject(string), com.tencent.mapsdk.internal.go.a.class, bnVar);
            } catch (java.lang.Exception unused) {
            }
        }
        if (aVar == null || !a17.equals(aVar.f131200a)) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "重新创建上报文件");
            aVar = new com.tencent.mapsdk.internal.go.a(bnVar, a17);
        }
        com.tencent.mapsdk.internal.go.b bVar = aVar.f131201b;
        if (bVar != null && !bVar.a()) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "使用本地上报文件");
            return a(mo36630x76847179, a18, aVar);
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "请求token");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<org.json.JSONObject>() { // from class: com.tencent.mapsdk.internal.go.2
            private org.json.JSONObject a() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx cxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk.class)).i();
                java.lang.String b17 = com.tencent.mapsdk.internal.go.a.this.b();
                com.tencent.mapsdk.internal.bn.b bVar2 = F;
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36685x3edd5478 = cxVar.m36685x3edd5478(b17, bVar2.f130542a, bVar2.f130543b);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "响应状态：" + m36685x3edd5478.f16986xec0a8ff);
                if (!m36685x3edd5478.mo36017xd4418ac9()) {
                    return null;
                }
                java.lang.String a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(m36685x3edd5478.f16977x2eefaa, m36685x3edd5478.f16974x2c0d614c);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "获取网络token数据：".concat(java.lang.String.valueOf(a19)));
                if (android.text.TextUtils.isEmpty(a19)) {
                    return null;
                }
                return new org.json.JSONObject(a19).optJSONObject("detail");
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx cxVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cx) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dk.class)).i();
                java.lang.String b17 = com.tencent.mapsdk.internal.go.a.this.b();
                com.tencent.mapsdk.internal.bn.b bVar2 = F;
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m36685x3edd5478 = cxVar.m36685x3edd5478(b17, bVar2.f130542a, bVar2.f130543b);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "响应状态：" + m36685x3edd5478.f16986xec0a8ff);
                if (!m36685x3edd5478.mo36017xd4418ac9()) {
                    return null;
                }
                java.lang.String a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(m36685x3edd5478.f16977x2eefaa, m36685x3edd5478.f16974x2c0d614c);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "获取网络token数据：".concat(java.lang.String.valueOf(a19)));
                if (android.text.TextUtils.isEmpty(a19)) {
                    return null;
                }
                return new org.json.JSONObject(a19).optJSONObject("detail");
            }
        }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<org.json.JSONObject>() { // from class: com.tencent.mapsdk.internal.go.1
            private void a(org.json.JSONObject jSONObject) {
                if (jSONObject != null) {
                    com.tencent.mapsdk.internal.go.a.this.f131201b = (com.tencent.mapsdk.internal.go.b) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.go.b.class, new java.lang.Object[0]);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.a(mo36630x76847179, a18, com.tencent.mapsdk.internal.go.a.this);
                    org.json.JSONObject m35874x1e81de8c = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35874x1e81de8c(com.tencent.mapsdk.internal.go.a.this);
                    if (m35874x1e81de8c != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "保存上报文件至本地");
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(a18).a("reportFile", m35874x1e81de8c.toString());
                    }
                }
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                if (jSONObject != null) {
                    com.tencent.mapsdk.internal.go.a.this.f131201b = (com.tencent.mapsdk.internal.go.b) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.tencent.mapsdk.internal.go.b.class, new java.lang.Object[0]);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.go.a(mo36630x76847179, a18, com.tencent.mapsdk.internal.go.a.this);
                    org.json.JSONObject m35874x1e81de8c = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35874x1e81de8c(com.tencent.mapsdk.internal.go.a.this);
                    if (m35874x1e81de8c != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131742j, "保存上报文件至本地");
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(a18).a("reportFile", m35874x1e81de8c.toString());
                    }
                }
            }
        });
        return false;
    }
}
